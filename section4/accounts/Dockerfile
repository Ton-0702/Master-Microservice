#Start with a base image containing Java runtime
FROM openjdk:17-jdk-slim

# MAINTAINER instruction is deprecated in favor of using label
# MAINTAINER eazybytes.com (Toan)
#Information around who maintains the image
LABEL "org.opencontainers.image.authors"="Toan"

# Add the application's jar to the image
# Take the present inside my target folder and copy the same jar into my Docker image.
COPY target/accounts-0.0.1-SNAPSHOT.jar accounts-0.0.1-SNAPSHOT.jar

# Execute the application/command whenever someone is trying to generate a container
ENTRYPOINT ["java", "-jar", "accounts-0.0.1-SNAPSHOT.jar"]