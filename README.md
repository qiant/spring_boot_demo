This demo project creates a web service for resume service which accepts new resume upload and existing resume retrieval. 

The project is built with SpringBoot and MongoDB.


To run the application
1. Install mongodb on local or use online Atlas service
2. Create Database resume_service using MongoDB Compass
3. In MongoDB Compass MONGOSH (Shell) run command:
   > use resume_service 
   > db.createUser({user: "databaseuser", pwd: "password", roles: [{role:"dbOwner", db: "resume_service"}])
4. Update the database access information in src/main/resources/application.properties
5. 

