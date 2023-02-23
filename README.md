# **Basic Crud Operation In Java**
___
###### This blog application supports 
* Blog content creation
* Update blog contents
* Get all blogs
* Get one blog content by ID
* Delete a blog


# **Tech stack/frameworks used**
___
* Springboot 2.7.8
* JDK 1.8
* Maven
* Lombok Project
* MySQL (for database)


***This backend RESTful service is running on an embedded Tomcat server*** 

# **Step-By-Step guide to setup project on local system**
___
_--clone the project to your local machine_
_Start the server with command [`shift + f`] (if you are using intellij idea) _

## Available endpoints
* localhost:8080/api/getAllPost
* localhost:8080/api/getOnePost/{id}
```
query parameters
5
example: localhost:8080/api/getOnePost/5
```
* localhost:8080/api/createPost
```
Body parameters
- title
- body
```
* localhost:8080/api/updatePost/{id}
  ```
  Body parameters
  - title
  - body
  ```
* localhost:8080/api/deletePost/{id}
    ````
   query parameters
   5
   example: localhost:8080/api/getOnePost/5
    ````

___

@github/Abelinho
@github/adekzs
@github/UyiEke
WHat do you think about these project?

Hope this was helpful to get you started?


[`Samuel Omolaja`] (c) 2023