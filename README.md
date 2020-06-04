# Getting Started

1) Clone the repository in your local system's directory.

2) cd into that repository


To build the project use the command : mvn clean install


To run the project use the command : mvn spring-boot:run


After the server starts successfully, test the application.


To test the APIs head to Postman:


1) Ingestion API : Send a POST request to the URL: http://127.0.0.1:8181/ingest 

2) Search API :
 
    1) To get all data from the ElasticSearch Index , send a GET request to the URL : http://127.0.0.1:8181/example
    2) To query a particular string , send a GET request to the URL : http://127.0.0.1:8181/search/{searchString}
    Examples:
        1) GET to http://127.0.0.1:8181/search/CEO 
        2) GET to http://127.0.0.1:8181/search/ELVA 
      

### Reference Documentation
For further reference, please consider the following sections:

* [Official Apache Maven documentation](https://maven.apache.org/guides/index.html)
* [Spring Boot Maven Plugin Reference Guide](https://docs.spring.io/spring-boot/docs/2.3.0.RELEASE/maven-plugin/reference/html/)
* [Create an OCI image](https://docs.spring.io/spring-boot/docs/2.3.0.RELEASE/maven-plugin/reference/html/#build-image)
* [Spring Web](https://docs.spring.io/spring-boot/docs/2.3.0.RELEASE/reference/htmlsingle/#boot-features-developing-web-applications)
* [Spring Data Elasticsearch (Access+Driver)](https://docs.spring.io/spring-boot/docs/2.3.0.RELEASE/reference/htmlsingle/#boot-features-elasticsearch)

### Guides
The following guides illustrate how to use some features concretely:

* [Building a RESTful Web Service](https://spring.io/guides/gs/rest-service/)
* [Serving Web Content with Spring MVC](https://spring.io/guides/gs/serving-web-content/)
* [Building REST services with Spring](https://spring.io/guides/tutorials/bookmarks/)

