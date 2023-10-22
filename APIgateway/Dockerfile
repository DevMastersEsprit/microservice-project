FROM openjdk:8
EXPOSE 8081
ADD target/APIgateway-0.0.1-SNAPSHOT.jar gateway.jar
ENTRYPOINT ["java", "-jar", "/gateway.jar"]