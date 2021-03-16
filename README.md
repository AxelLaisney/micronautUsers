MICRONAUT-USERS
A simple microservice managing users data using the micronaut framework

SPRING BOOT VS MICRONAUT
Micronaut include a cloud service, which mean he doesn't rely on a third party
like spring boot. Micronaut is also serverless, so no server deployment required.
In short, micronaut is faster to deploy than spring boot because is doesn't reply on a server and cloud implementation.

PROJECT STRUCTURE
-micronautusers/dao
contain the database manipulation such a save, delete, add

-micronautusers/model
contain classes that describe database tables

-micronautusers/controller
contain the controllers of the application

-Application.java
Entry point of the application

