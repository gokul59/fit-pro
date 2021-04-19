# README #

This simple java application is used with the Pluralsight course:  "Bitbucket Cloud Fundamentals."

this has to be resolved in branch activity 

### What is this repository for? ###

* Tracking Carved Rock gym member fitness goals
* Learning how to use Bitbucket Cloud
* [Learn Markdown](https://bitbucket.org/tutorials/markdowndemo)

### How do I get set up? ###

To use for the class, begin by forking this repository to your own account.

This app was built with Java 11 and Maven 3.6.3 as external dependencies.  To run this app (which is not necessary to follow along with the course), you would need those installed on your machine.

Internal Maven dependencies, in the pom.xml file, are:
* Javalin (a REST library)
* Faster Jackson (POJO <-> JSON)
* Junit 5 (unit testing)
* SLFJ (logging library needed by Javalin)

To build the application and run unit tests, from the project directory root:

`mvn clean compile test`

To run the application, there is a Java main in App.java class.  Simply run that main, and the application should startup on port 7000.  The REST endpoints are also in App.java.