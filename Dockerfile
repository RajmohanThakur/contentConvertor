# Use the official OpenJDK image
FROM openjdk:latest

# Set working directory
WORKDIR /app

# Copy the built jar file from the target directory to the Docker container
COPY target/ContentConvertor-0.0.1-SNAPSHOT.jar /app

# Expose port
EXPOSE 8080

# Run the application
CMD ["java", "-jar", "content-convertor.jar"]
