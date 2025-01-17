## Spring  
- Spring Boot is a framework for building applications in the java programming langauge.
- It makes easy to create stand-alone, production-grade applications using java.  
- A standalone application is a self-contained application that can run independently without requiring additional dependencies or external setup you can package the entire application code, libraries and embedded server into a fat jar or Uber jar which can run through the command:   
- Java - jar my app.jar  
- A production grade application is the one that is ready to be deployed into a production environment with features that ensures reliability security scalability and observability.  
- The core spring framework already reduces boilerplate code and provides of helpful features for Java application.  
- However spring boot takes this convenience to the next level by focusing specifically on reducing the effort required to set up and configure a spring application. When spring does simplify many tasks like creating web applications, working databases, managing transactions and many more. Still there where many manual configurations need to be done and hence spring boot came, where we can add autoconfiguration to make Standalone applications.   
![image](https://github.com/user-attachments/assets/d5e5dca0-e32d-49c5-b72a-cc24f237d493)  

- Annotations in Java are a form of metadata that provide information about the program but do not affect the program's execution directly. Annotations are used to mark or decorate elements such as classes, methods, fields, parameters, and other program components.  

- Annotations help tools, compilers, and frameworks process code, generate code, or perform specific actions.  
Purpose:  
1.Provide instructions to the compiler (e.g., @Override).  
2.Enable runtime processing (e.g., @Deprecated, @SuppressWarnings).  
3.Allow frameworks (like Spring) to process metadata to perform dependency injection, etc.  
4.Placement: Annotations can be applied to classes, methods, fields, variables, parameters, and packages.
###### The ApplicationContext in Spring not only creates and manages beans but also provides additional features and capabilities that extend beyond simply creating and managing beans.  
What ApplicationContext Does  
Bean Definition and Lifecycle Management:  

- It creates and initializes beans based on configurations provided through annotations, XML, or Java-based configuration (@Configuration).  
- Manages the full lifecycle of beans, including creation, dependency injection, initialization, and destruction.  
Dependency Injection:  

- Resolves dependencies between beans automatically using annotations like @Autowired, @Qualifier, or XML configuration.  
- Ensures the beans are wired together based on defined relationships.  
Advanced Bean Scoping:  

- Supports bean scopes like singleton, prototype, request, session, and application.  
- Ensures the right scope is adhered to during bean retrieval.  
- Lets create a spring project on Spring initializer:  
![image](https://github.com/user-attachments/assets/83dde70b-1a31-418f-9264-2c5fa2b15158)
- jar vs war
![image](https://github.com/user-attachments/assets/44108ab3-186d-48ea-8027-6ea46c47788b)

- create a java class and add @RestController above class and @GetMapping above the method.
```java
package com.example.apipractice;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class cost {

    @GetMapping("cost")
    public int calc() {
        return 20+30+10+45;
    }
}
```
- Run project and open on brower localhost:8080/cost     on screen the ruturn value will be displayed which is here addition of all numbers here.  
- The context of @GetMapping("abc") in Spring Framework, abc refers to the URI path (or endpoint) that will handle the HTTP GET request.  
- When you use @RestController and @GetMapping("pay"), you are indeed creating a RESTful API endpoint.   
![image](https://github.com/user-attachments/assets/0ad13038-37c0-4c53-9c8a-a721686b2cff)
#### Maven  
- Build automation tool  
- It manages the dependencies.
- If you have pom.xml file in the project then the build tool is maven. 
we can copy any external library from maven repository and paste in pom.xml file.  - Serch on google: maven opencsv
- https://mvnrepository.com/artifact/com.opencsv/opencsv and can get dependecy as follow:
![image](https://github.com/user-attachments/assets/8962acc2-638f-4da7-adfa-befab285e5b4)

- AFter you copy the dependency in pom.xml file you can right click the project go to maven and reload project to integrate the dependency in the project.  
![image](https://github.com/user-attachments/assets/37b292ff-696a-4541-800c-96269f320c97)  
- Build automation tool  
![image](https://github.com/user-attachments/assets/e9aba8ce-1483-4f9e-a188-f8e1e8c50414)
Try commands one by one on terminal of IntelliJ
>mvn validate
if maven is not installed you can run with go to the file location  and type  
-  .\mvnw.cmd validate  
-  .\mvnw.cmd compile  
-  .\mvnw.cmd test //if written any test
-  .\mvnw.cmd package  //to make package  
-  java -jar .\myFirstProject-0.0.1-SNAPSHOT.jar //you can run this jar file too  
-  If you use command .\mvnw.cmd package it automatically- VALIDATE, COMPILE, TEST, AND MAKES JAR FILE
- ALso we can do it from Maven right side plugin all life cycle can be performed.
![image](https://github.com/user-attachments/assets/3de93b13-60b0-47aa-a471-cdf40ed16309)  
- If you have pom.xml file in the project then the build tool is maven.
- ###### Project Structure:
![image](https://github.com/user-attachments/assets/ef151615-f6b6-4c5a-a786-607618132ac4)  
![image](https://github.com/user-attachments/assets/c876ed1b-0492-4e33-8c96-b7537d44baee)  
- .idea folder- related to intelliJ, we can ignore the folder during commit in .gitignore file.
- ![image](https://github.com/user-attachments/assets/7f623c06-5dbb-4245-8d76-4f9192363a19)

### IoC  
- Inversion of Control (IoC) is a design principle where the control of object creation, dependency management, and lifecycle is transferred from the application code to the Spring IoC container. It is a fundamental concept in the Spring Framework, enabling loose coupling and easier management of dependencies.
- In simple words we use to create objects earlier for simple oops programme now we have reversed the controller and gave it to springapplication.
- Application context is a way to implement IoC Container.  
- IoC keep objects of the classes by scanning them to clases where we add @Component and then the class is automatically registered to spring bean.  
- In the Spring Framework, a bean is an object that is managed by the Spring IoC (Inversion of Control) container. Spring beans form the backbone of a Spring application and are used to encapsulate the business logic, configurations, or any object required by the application.
##### @SpringBootAPplication  
- Configuration
- EnableAutoConfiguration
- ComponentScan
![image](https://github.com/user-attachments/assets/b2b584b0-4b15-4c9b-86fc-5db74c79c72a)
- @Autowired is an annotation in Spring Framework used for dependency injection. It tells the Spring IoC (Inversion of Control) container to automatically inject a required bean (object) into a class where the annotation is applied.
- 



















