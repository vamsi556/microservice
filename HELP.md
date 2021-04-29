# Getting Started

### Reference Documentation
For further reference, please consider the following sections:

* [Official Apache Maven documentation](https://maven.apache.org/guides/index.html)
* [Spring Boot Maven Plugin Reference Guide](https://docs.spring.io/spring-boot/docs/2.4.5/maven-plugin/reference/html/)
* [Create an OCI image](https://docs.spring.io/spring-boot/docs/2.4.5/maven-plugin/reference/html/#build-image)
* [Spring Web](https://docs.spring.io/spring-boot/docs/2.4.5/reference/htmlsingle/#boot-features-developing-web-applications)
* [Spring Boot DevTools](https://docs.spring.io/spring-boot/docs/2.4.5/reference/htmlsingle/#using-boot-devtools)
* [Eureka Server](https://docs.spring.io/spring-cloud-netflix/docs/current/reference/html/#spring-cloud-eureka-server)

### Guides
The following guides illustrate how to use some features concretely:

* [Building a RESTful Web Service](https://spring.io/guides/gs/rest-service/)
* [Serving Web Content with Spring MVC](https://spring.io/guides/gs/serving-web-content/)
* [Building REST services with Spring](https://spring.io/guides/tutorials/bookmarks/)
* [Service Registration and Discovery with Eureka and Spring Cloud](https://spring.io/guides/gs/service-registration-and-discovery/)

###Running the example and display the results.
Our configuration to build microservies with Spring Boot is complete. We are ready to run our application . Till now we have configured the following things.

Eureka server
Configuration server
Core service
Now we will go to the eurekaserver directory from the terminal and will run mvn spring-boot:run. As we configured the eureka server to port 8081, it will listen to 8081 port.Then we will go to the config server and run mvn spring-boot:run command. As we configured the config server at port 8082, it will listen to port 8082.

Now we will run our core service profilemanagement. Go to the directory of profilemanagement project and execute mvn spring-boot:run command. It will listen to port 8083. Now all server is running. So, we can test now. At first, we will check the eureka server at http://localhost:8081/. It will be like the below image. Here we can see that PROFILEMANAGEMENT project is registered here.

## Thi Micro service runnin in total 3 ports
* 8081
* 8082
* 8083
