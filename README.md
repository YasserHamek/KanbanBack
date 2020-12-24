# KanbanBack 
The API is deployed with heroku and described with swagger at this link : https://kanban-back-spring.herokuapp.com/swagger-ui.html (the page may take some time to charge).

To try the application locally :

- Run the database script `./hsqldb/run_server.sh`
- `Run AS -> Java Application` the class `./app/Application.java` on Eclipse.

## Item

## VARIABLES

- id
- name
- heading
- deadline
- user
- requiredTime
- tagsList
- place
- url
- description

## URL

**Get** All Items:

- **GET** : http://localhost:8080/item/

**Post** One item :

- **POST** : http://localhost:8080/cafeteria/user/

**Headers:**

- Content-Type: application/json
- Body:

```
{
    "name": "item10",
    "heading": "heading",
    "deadline": "2020-11-5",
    "user": {
        "name": "user3",
        "function": "developpeur",
        "itemList": [
            {
                "name": "item10",
                "heading": "heading",
                "deadline": "2020-11-5",
                "requiredTime": 180,
                "tagsList": [],
                "place": "rennes",
                "url": "url",
                "description": "descreption"
            }
        ]
    },
    "requiredTime": 100,
    "tagsList": [],
    "place": "rennes",
    "url": "url",
    "description": "descreption"
}
```

**Modify** the state of an Item:

- **PUT** : http://localhost:8080/item?itemId=ITEMID&itemHeading=ITEMNEWSTATE

**Delete** one Item :

- **DELETE** : http://localhost:8080/item?itemId=ITEMID

### **Aspect Oriented Programming :** 

- Before and after each call of methods a logging will be printed in the console.

# Getting Started

### Reference Documentation
For further reference, please consider the following sections:

* [Official Apache Maven documentation](https://maven.apache.org/guides/index.html)
* [Spring Boot Maven Plugin Reference Guide](https://docs.spring.io/spring-boot/docs/2.3.5.RELEASE/maven-plugin/reference/html/)
* [Create an OCI image](https://docs.spring.io/spring-boot/docs/2.3.5.RELEASE/maven-plugin/reference/html/#build-image)
* [Spring Boot DevTools](https://docs.spring.io/spring-boot/docs/2.3.5.RELEASE/reference/htmlsingle/#using-boot-devtools)
* [Spring Web](https://docs.spring.io/spring-boot/docs/2.3.5.RELEASE/reference/htmlsingle/#boot-features-developing-web-applications)
* [Rest Repositories](https://docs.spring.io/spring-boot/docs/2.3.5.RELEASE/reference/htmlsingle/#howto-use-exposing-spring-data-repositories-rest-endpoint)
* [Spring Data JPA](https://docs.spring.io/spring-boot/docs/2.3.5.RELEASE/reference/htmlsingle/#boot-features-jpa-and-spring-data)

### Guides
The following guides illustrate how to use some features concretely:

* [Building a RESTful Web Service](https://spring.io/guides/gs/rest-service/)
* [Serving Web Content with Spring MVC](https://spring.io/guides/gs/serving-web-content/)
* [Building REST services with Spring](https://spring.io/guides/tutorials/bookmarks/)
* [Accessing JPA Data with REST](https://spring.io/guides/gs/accessing-data-rest/)
* [Accessing Neo4j Data with REST](https://spring.io/guides/gs/accessing-neo4j-data-rest/)
* [Accessing MongoDB Data with REST](https://spring.io/guides/gs/accessing-mongodb-data-rest/)
* [Accessing Data with JPA](https://spring.io/guides/gs/accessing-data-jpa/)

