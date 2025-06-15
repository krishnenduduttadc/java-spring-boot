# Start from a JDK base image
FROM openjdk:17-jdk-slim

# Set app directory
WORKDIR /app

# Copy built jar to container
COPY target/demo30-0.0.1-SNAPSHOT.jar app.jar

# Run the jar
ENTRYPOINT ["java", "-jar", "app.jar"]
