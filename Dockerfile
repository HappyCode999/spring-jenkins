FROM openjdk:8
EXPOSE 9090
ADD target/spring-jenkin-integration.jar spring-jenkin-integration.jar
ENTRYPOINT ["java", "-jar", "/spring-jenkin-integration.jar"]