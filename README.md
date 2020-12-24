# KanbanBack 
The API is deployed with heroku and described with swagger at this link : https://kanban-back-spring.herokuapp.com/swagger-ui.html (the page may take some time to charge).

To try the application locally `Run AS -> Java Application` the class `app/Application.java` on Eclipse.

- Run the database script `/hsqldb/run_server.sh`
- `Run AS -> Java Application` the class `app/Application.java` on Eclipse.

# 

- 

## User

## VARIABLES

- userId
- userBasket
- userName
- userPassword
- userRole

## URL

**Get** All Users :

- **GET** : http://localhost:8080/cafeteria/user/

**Post** One User :

- **POST** : http://localhost:8080/cafeteria/user/

**Headers:**

- Content-Type: application/json

**Query Params**

**KEY** -- **VALUE**

- name -- chosenName
- password -- chosenPassword
- role -- chosenRole

**Delete** All Users :

- **DELETE** : http://localhost:8080/cafeteria/user/

**Get** one User :

- **GET** : http://localhost:8080/cafeteria/user/USERID/

**Modify** One User :

- **PUT** : http://localhost:8080/cafeteria/user/USERID/

**Headers:**

- Content-Type: application/json

**Query Params**

**KEY** -- **VALUE**

- newName -- chosenName
- newPassword -- chosenPassword
- newRole -- chosenRole

**Delete** one User :

- **DELETE** : http://localhost:8080/cafeteria/user/USERID/

## Product

## VARIABLES

- productId
- productName
- price
- basket

## URL

**Get** All Products :

- **GET** : http://localhost:8080/cafeteria/products/

**Delete** All Products :

- **DELETE** : http://localhost:8080/cafeteria/products/

**Post** One Product :

- **POST** : http://localhost:8080/cafeteria/products/

**Headers:**

- Content-Type: application/json

**Query Params**

**KEY** -- **VALUE**

- name -- chosenName
- price -- chosenPrice

**Get** one Product :

- **GET** : http://localhost:8080/cafeteria/products/PRODUCTID

**Delete** one Product :

- **DELETE** : http://localhost:8080/cafeteria/products/PRODUCRID

**Modify** One Product :

- **PUT** : http://localhost:8080/cafeteria/products/PRODUCTID

**Headers:**

- Content-Type: application/json

**Query Params**

**KEY** -- **VALUE**

- newName -- chosenName
- newPrice -- chosenPrice

## Basket

## VARIABLES

- basketId
- totalPrice
- products
- user

## URL

**Get** All Basket Products :

- **GET** : http://localhost:8080/cafeteria/USERID/basket/

**Delete** All Basket Products :

- **DELETE** : http://localhost:8080/cafeteria/USERID/basket/

**Post** Many Products :

- **POST** : http://localhost:8080/cafeteria/USERID/basket/

**Headers:**

- Content-Type: application/json

**Query Params **

**KEY** -- **VALUE**

productIdArray -- firstChosenID, secondChosenID,....

**Get** one Basket Product :

- **GET** : http://localhost:8080/cafeteria/USERID/basket/PRODUCTID

**Post** One Product :

- **POST** : http://localhost:8080/cafeteria/USERID/basket/PRODUCTID

**Modify** One Product :

- **PUT** : http://localhost:8080/cafeteria/USERID/basket/PRODUCTID

**Headers:**

- Content-Type: application/json

**Query Params**

**KEY** -- **VALUE**

- newName -- chosenName
- newPrice -- chosenPrice

**Delete** one Product :

- **DELETE** : http://localhost:8080/cafeteria/USERID/basket/PRODUCTID

Post One Item method : 

- Post : http://localhost:8080/Item/

Headers:

- Content-Type: application/json

Body:

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

Get One item method :

- GET : http://localhost:8080/item/id

Delete One Item method : 

- Delete : http://localhost:8080/Item/id

Aspect Oriented Programming : 

- Before and after each call of the rest method a logging will be printed in the console.

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

