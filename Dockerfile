# Use an OpenJDK base image
FROM openjdk:8-jdk-alpine

# Set the working directory inside the container
WORKDIR /app

# Copy the built jar file into the container
COPY target/bmi-calculator-1.0-SNAPSHOT.jar app.jar

# Set the command to run the jar file
ENTRYPOINT ["java", "-jar", "app.jar"]
