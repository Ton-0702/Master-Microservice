# Configuration Microservice

**Version 1:**
1. **Change all Google Jib in Microservice to build Docker Image**
2. **Use Three approach to inject properties to java field (through @Value, Environment, @ConfigurationProperties)**
    * You can see inside application.yml
    * **At @ConfigurationProperties, I add more example properties in file yml and create DTO AccountsContactInfoDto with annotation @ConfigurationProperties, and EnableConfigurationProperties at Springboot application**
    * How to activate profile by hardcoding inside application.yml, application_qa, application_prod (https://www.udemy.com/course/master-microservices-with-spring-docker-kubernetes - Course 73)
    