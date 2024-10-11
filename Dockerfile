FROM openjdk:17-oracle
WORKDIR /app
COPY ./target/dockerdemo-0.0.1-SNAPSHOT.jar /app
EXPOSE 8080
CMD ["java", "-jar", "dockerdemo-0.0.1-SNAPSHOT.jar"]