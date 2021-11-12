FROM openjdk:11-jdk-slim
COPY build/libs/greeting-0.0.1-SNAPSHOT.jar app.jar
ENTRYPOINT exec java -jar /app.jar
