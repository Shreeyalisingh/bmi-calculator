# 🧱 Stage 1: Build the Java BMI app using Maven
FROM maven:3.9.6-eclipse-temurin-17 AS build
WORKDIR /app
COPY . .
RUN mvn clean package

# 🚀 Stage 2: Run the built .jar with input args
FROM openjdk:17-jdk-slim
WORKDIR /app
COPY --from=build /app/target/bmi-calculator-1.0-SNAPSHOT.jar app.jar
ENTRYPOINT ["java", "-jar", "app.jar", "70", "1.75"]

