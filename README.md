#Overview
##Java SDK for JCS

###Installation

git clone https://github.com/jiocloudservices/jcsclient.git  
$ cd jcs_java_sdk/  
####For maven users
$ mvn clean compile assemble:single  

####for non maven users
$ make (creates class files and jar files)  
$ make doc (to create Documentation of the project)  
To view Documentation goto doc/html/index.html  

###Configuration  
  
Open config.txt and set access key, secret key, secure ('true' to make secure connection), debug ('true' for debug mode).  
Running the program in debug mode prints error messages for easy debugging  
  
NOTE: Never ever commit your access and secret keys and push to a public repository. You have been warned.  
  
###SDK  

