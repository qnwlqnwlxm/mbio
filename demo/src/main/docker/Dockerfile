FROM openjdk:8-jdk-alpine
ADD target/demo-0.0.2-SNAPSHOT.war app.war
EXPOSE 8080
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/app.war"]