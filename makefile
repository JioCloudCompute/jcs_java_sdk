.SUFFIXES: .java .class

# Programs
JAVAC = javac
JAR = jar
SHELL = bash
CP = cp
RM 	= rm
ECHO = /bin/echo
CAT	= cat
PRINTF	= printf
DOXYGEN = doxygen

######################################
# Project Name (generate Libraries with this name)
TARGET = jcscompute.jar
# Project Paths
PROJECT_ROOT=.
EXTERNAL_ROOT=$(PROJECT_ROOT)/external
SRCDIR = $(PROJECT_ROOT)/src/main/java/
TARGETDIR = $(PROJECT_ROOT)/target/classes/
DOCDIR = $(PROJECT_ROOT)/doc

# Library Paths
LIBPATH = ./lib

#Libraries
LIBS = $(LIBPATH)/bcpkix-jdk15on-1.50.jar:$(LIBPATH)/bcprov-jdk15on-154.jar
# Compiler and Linker flags
FLAGS = -sourcepath src -classpath

######################################

NO_COLOR=\e[0m
OK_COLOR=\e[1;32m
ERR_COLOR=\e[1;31m
WARN_COLOR=\e[1;33m
MESG_COLOR=\e[1;34m
FILE_COLOR=\e[1;37m

OK_STRING="[OK]"
ERR_STRING="[ERRORS]"
WARN_STRING="[WARNINGS]"
OK_FMT="${OK_COLOR}%30s\n${NO_COLOR}"
ERR_FMT="${ERR_COLOR}%30s\n${NO_COLOR}"
WARN_FMT="${WARN_COLOR}%30s\n${NO_COLOR}"
######################################

SRCS = $(shell find $(SRCDIR) -name "*.java")
CLASSES = $(SRCS:./src/main/java/%.java=./target/classes/%.class)

.PHONY: all setup doc clean distclean install

all: setup ./target/$(TARGET) 

setup:
	@$(ECHO) "Setting up compilation..."
	@mkdir -p $(TARGETDIR)
	
./target/$(TARGET): $(CLASSES)
	@$(PRINTF) "$(MESG_COLOR)Building JAR:"
	@$(PRINTF) "$(FILE_COLOR)"
	@cd $(TARGETDIR); \
	$(JAR) -xvf ../../lib/bcprov-jdk15on-154.jar; \
	$(JAR) -xvf ../../lib/bcpkix-jdk15on-1.50.jar; \
	$(CP) ../../src/main/resources/config.properties ./; \
	$(JAR) -cvf ../../$@ ./com/* ./org/* ./config.properties 2> temp.log || touch temp.err

	@$(RM) -rf $(TARGETDIR)/META-INF $(TARGETDIR)/org $(TARGETDIR)/config.properties
	@if test -e temp.err; \
	then $(PRINTF) $(ERR_FMT) $(ERR_STRING) && $(CAT) temp.log; \
	elif test -s temp.log; \
	then $(PRINTF) $(WARN_FMT) $(WARN_STRING) && $(CAT) temp.log; \
	else $(PRINTF) $(OK_FMT) $(OK_STRING); \
	fi;
	@$(RM) -f $(TARGETDIR)/temp.log $(TARGETDIR)/temp.err
	@$(PRINTF) "$(OK_COLOR)------------------------------------------------------------------------------\n"

$(CLASSES): $(SRCS)
	@$(PRINTF) "$(MESG_COLOR)Building Classes:"
	@$(JAVAC) -d $(TARGETDIR) $(FLAGS) $(LIBS) $^ 2> temp.log || touch temp.err
	@if test -e temp.err; \
	then $(PRINTF) $(ERR_FMT) $(ERR_STRING) && $(CAT) temp.log; \
	elif test -s temp.log; \
	then $(PRINTF) $(WARN_FMT) $(WARN_STRING) && $(CAT) temp.log; \
	else $(PRINTF) $(OK_FMT) $(OK_STRING); \
	fi;
	@$(RM) -f temp.log temp.err

doc:
	@$(PRINTF) "$(MESG_COLOR)Generating Doxygen Documentation ...  "
	@$(RM) -rf doc/html
	@$(DOXYGEN) Doxyfile  > /dev/null 2>&1
	@$(PRINTF) "$(OK_COLOR)Done\n"

clean:
	@$(ECHO) -n "Cleaning up..."
	@$(RM) -rf $(TARGETDIR)
	@$(ECHO) "Done"

distclean: clean
	@$(RM) -rf $(DOCDIR) ./target
