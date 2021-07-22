FROM openjdk:14-jdk-alpine
ADD target/spring-boot-web-0.0.1-SNAPSHOT.jar spring-boot-web-0.0.1-SNAPSHOT.jar
RUN apk add --no-cache curl tar bash procps
EXPOSE 8080
CMD ["java", "-jar", "spring-boot-web-0.0.1-SNAPSHOT.jar"]