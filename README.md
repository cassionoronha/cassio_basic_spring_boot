# BASIC_SPRINGBOOT_DATA_REST

Basic Project using Spring Boot, Data, Mongo, Schedule, Lombok

## Getting Started

### Maven Spring Boot 
To run this project, you can use the command:
> mvn clean package spring-boot:run -Dlogging.path=<<path_log_file>>

### Dockerized
To build spring artfact
> mvn clean package
To build docker image
> docker build -t agilizati/basicspringboot:0.1b .
To run in a docker container, on port 8183
> docker run -p 8183:8080 -e LOG_PATH="." --name agilizati-basicspringboot agilizati/basicspringboot:0.1b
To acesss
> http://localhost:8183

## Authors

* **Cassio  Noronha** - *Initial work* - [BasicSpringBootCassio](http://github.com/cassionoronha/cassio_basic_spring_boot)


