# README Resume Service SpringBoot with MongoDB #

This demo project creates a web service for resume service which accepts new resume upload and existing resume retrieval through RESTFul API calls. 

### What is this repository for? ###
The demo project is built with SpringBoot and MongoDB.  

### How to setup & run the application? ###
 * Java 17 or higher
 * Maven 3
 * MongoDB


#### Summary of set up ####
 * Clone this repository 
  ```
    $ git clone 
  ```
  Before run the application
   1. Install mongodb on local or use online Atlas service
   2. Create Database resume_service using MongoDB Compass
   3. In MongoDB Compass MONGOSH (Shell) run command:
       ```
         > use resume_service 
         > db.createUser({user: "databaseuser", pwd: "password", roles: [{role:"dbOwner", db: "resume_service"}])
       ```  
   4. Update the database access information in src/main/resources/application.properties

   After setting up MongoDB, run Maven commands to install dependencies
   ```
    $ cd resume_services
    $ mvn clean install
   ```
   *  Start the application using Maven
   ```
    $ mvn spring-boot:run
   ```

### Testing ###
    * Upload resume using curl
  ```
    $ curl -X POST http://localhost:8080/api/uploadResumeDetails \
         -H "Content-Type: application/json" \ 
         -d '{"id":1, "name": "Tom Hanks", "firstName": "Tom", "lastName": "Hanks", "title": "engineer", "jobDescription":"software engineer", "company": "Acme LLC"}' 
         
  ```
    Expected return: 1

    * Query resume using ID
  ``` 
       $ curl -H "Content-Type: application/json" -X GET http://localhost:8080/api/getResumeById/1
  ```
     Expected return: 
  ```
      [{"id":1,"name":"Tom Hanks","firstName":"Tom","lastName":"Hanks","title":"engineer","jobDescription":"software engineer","company":"Acme LLC"}]
  ```
 
