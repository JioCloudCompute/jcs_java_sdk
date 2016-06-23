#Overview
##Java SDK for JCS

###Installation
####Setup
git clone https://github.com/jiocloudservices/jcsclient.git  
$ cd jcs_java_sdk/  

$ make (creates class files and jar files in target directory)  
$ make doc (to create Documentation of the project)  
To view Documentation goto doc/html/index.html  

####Cleaning
$ make clean (removes all the class files in target directory)  
$ make distclean (removes class files and jar file)  

###Configuration  
  
Open config.txt and set access key, secret key, secure ('true' to make secure connection), debug ('true' for debug mode).  
Running the program in debug mode prints error messages for easy debugging  
  
NOTE: Never ever commit your access and secret keys and push to a public repository. You have been warned.  

