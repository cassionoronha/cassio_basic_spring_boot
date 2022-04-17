# BASIC_SPRINGBOOT_DATA_REST

Basic Project using Spring Boot, Data, Mongo, Schedule, Lombok

## Getting Started

### Maven Spring Boot 
To run this project, you can use the command:
> mvn clean package spring-boot:run -Dlogging.path=<<path_log_file>>

### Dockerized
To build spring artfact
> mvn clean package
>  
To build docker image
> docker build -t cassionoronha/basicspringboot:0.3b .
> 
To run in a docker container, on port 8183
> docker run -p 8183:8080 -e LOG_PATH="." -e db.host=<<HOST-URL>> -e db.database=<<DB-NAME>> -e db.username=<<DB-USER>> -e db.password=<<DB-PASSWORD>> --name agilizati-basicspringboot agilizati/basicspringboot:0.3b
>
To acesss
> http://localhost:8183/actuactor/health

## Authors

* **Cassio  Noronha** - *Initial work* - [BasicSpringBootCassio](http://github.com/cassionoronha/cassio_basic_spring_boot)


