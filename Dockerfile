FROM openjdk:24-slim-bullseye
WORKDIR /app
COPY target/Later_app-1.0-SNAPSHOT.jar /app/LaterApp_doker.jar
ENTRYPOINT ["java", "-jar", "LaterApp_doker.jar"]