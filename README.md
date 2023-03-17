# course-api: </br>
Just finished this playlist by JavaBrains and decided to make this repo to provide my final API and all my notes </br>
[Spring Boot Quick Start] (https://www.youtube.com/playlist?list=PLqq-6Pq4lTTbx8p2oCgcAQGQyqN8XeA1x) </br>


#### - what is spring Boot? <br/>
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


#### - Spring Problems: <br/>
1- Huge framework <br/>
2- Multiple setup steps and a lot of configs <br/>
3- Multiple build & deploy steps <br/>


#### - Servlet container?? <br />
User  &rarr; Web Server &rarr; Servlet Container &rarr; servlet &rarr; JVM [Machine] <br />
It's found in the web server > responsible for running servlet files [written in java which needs a container to communicate with the machine's JVM] <br />
