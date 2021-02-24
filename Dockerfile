FROM azul/zulu-openjdk-alpine:11-jre

LABEL author="Cassio Noronha"
LABEL email="cassionoronha@gmail.com"
LABEL company="AgilizaTI"
LABEL version="1.0b" 

ENV LOG_PATH="vazio"

RUN addgroup -g 3000 agilizatigroup
RUN adduser -D -g '' -G agilizatigroup -u 1000 agilizati
USER agilizati
WORKDIR /home/agilizati
COPY --chown=agilizati:agilizatigroup target/basicspringboot-0.0.1-SNAPSHOT.jar /home/agilizati/app.jar
EXPOSE 8080
ENTRYPOINT ["/usr/bin/java", "-jar", "-Dlogging.path=$LOG_PATH"]
CMD ["app.jar"]