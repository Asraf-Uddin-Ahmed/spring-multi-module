# spring-multi-module
Multi-module project with Spring Boot
# Build and Run
To create executable jar file run following command:
```
mvn clean package
```
To create executable jar without running any test:
```
mvn clean package -Dmaven.test.skip=true
```
To run jar file by default properties (or profile) file:
```
java -jar target/spring-boot-hibernate-datajpa.jar
```
To run jar file by specific profile (here is *prod*, which is fetching data from *application-prod.properties*) file:
```
java -jar target/spring-boot-hibernate-datajpa.jar --spring.profiles.active=prod
```
# References
1. [Spring boot multiple modules](https://www.baeldung.com/spring-boot-multiple-modules)
