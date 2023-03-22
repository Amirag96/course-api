# course-api: </br>
Just finished this playlist by JavaBrains and decided to make this repo to provide my final API and all my notes </br>
[Spring Boot Quick Start] (https://www.youtube.com/playlist?list=PLqq-6Pq4lTTbx8p2oCgcAQGQyqN8XeA1x) </br>


#### • what is spring Boot? <br/>
Framework that makes it easy to: <br/>
1- Create standalone apps (Embedded tomcat) <br/>
2- production grade spring based apps <br/>
3- Production ready, you can just run! <br/>


| Spring     | Spring Boot |
| ---        | ---       |
| Spring is an open-source lightweight framework widely used to develop enterprise applications. | Spring Boot is built on top of the conventional spring framework, widely used to develop REST APIs.         |
| The most important feature of the Spring Framework is dependency injection.       | The most important feature of the Spring Boot is Autoconfiguration.       |
| It helps to create a loosely coupled application.     |It helps to create a stand-alone application.    |
| To run the Spring application, we need to set the server explicitly.	        | Spring Boot provides embedded servers such as Tomcat and Jetty etc.|
| To run the Spring application, a deployment descriptor is required.        | There is no requirement for a deployment descriptor.       |
| To create a Spring application, the developers write lots of code.	       | It reduces the lines of code. |
| It doesn’t provide support for the in-memory database.        | It provides support for the in-memory database such as H2.|
| Developers need to write boilerplate code for smaller tasks.	       |In Spring Boot, there is reduction in boilerplate code. |
| Developers have to define dependencies manually in the pom.xml file.	        | pom.xml file internally handles the required dependencies.|


#### • Spring Problems: <br/>
1- Huge framework <br/>
2- Multiple setup steps and a lot of configs <br/>
3- Multiple build & deploy steps <br/>


#### • Servlet container?? <br />
It's found in the web server &rarr; responsible for running servlet files [written in java which needs a container to communicate with the machine's JVM] <br />
``` User  &rarr; Web Server &rarr; Servlet Container &rarr; servlet &rarr; JVM [Machine] ``` <br />

#### • Maven ? <br />
1- ```Declaring``` all the dependencies in 1 file ```[pom.xml]``` &rarr; No need to install/ import Jars <br />
2- Dependencies version Management (Compatible versions)  <br />

#### • POM: <br />
1- our project will be the child of the spring boot starter project <br>

```xml
<parent>
        <groupId>org.springframework.boot</groupId>
        <artifactId>spring-boot-starter-parent</artifactId>
        <version>2.7.1</version>
</parent>
```


2- ``` <dependencies> ``` &rarr; Jars  <br />
3- ``` <properties> ``` &rarr; Java (JDK) version <br />




#### • Spring Annotations: <br />

1- ``` @Controller ``` &rarr; it marks a class as a web request handler <br />
2- ``` @RestController ``` &rarr; combination of @Controller and @ResponseBody annotations so it eliminates the need for them. <br />
3- ``` @Component ``` &rarr; allows Spring to automatically detect our custom classes/beans <br />
4- ``` @Service ``` &rarr; to indicate that they're holding the business logic <br />
5- ``` @Repository ``` &rarr; is a DAOs (Data Access Object) that access the database directly & does all the operations related to the database.<br />
@Service and @Repository are special cases of @Component. They are technically the same, but we use them for the different purposes.  <br />

6- Lombok annotations: <br />
• Entity:  <br />
``` @Getter``` & ``` @Setter ``` & ``` @ToString ``` <br />
``` @Data ``` is a convenient shortcut annotation that bundles the features of @ToString, @EqualsAndHashCode, @Getter / @Setter and @RequiredArgsConstructor together.<br />
``` @NoArgsConstructor ```&rarr;  (Empty constructor generation) <br />
 ``` @Builder ```&rarr;   we can create instances of the class using builder API <br />
Example:
```
Article a = Article.builder()
  .id(1L)
  .title("Test Article")
  .tags(Collections.singletonList("Demo"))
  .build();
``` 

• Logging with Lombok: <br />
``` @Log ``` <br /> or ``` @Log4j2 ``` <br /> or ``` @Slf4j ``` (recommended) <br />
