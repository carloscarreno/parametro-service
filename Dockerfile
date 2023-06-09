FROM openjdk:12
VOLUME /tmp
EXPOSE 8079
ADD ./target/parametro-service-0.0.1-SNAPSHOT.jar parametro-service.jar
ENTRYPOINT ["java","-jar","/parametro-service.jar"]
