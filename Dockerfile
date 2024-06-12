FROM openjdk:11

EXPOSE 8080

ADD target/rest-api-example.jar rest-api.example.jar

ENTRYPOINT ["java","-jar", "rest-api.example.jar"]