FROM openjdk:8-jre-alpine

EXPOSE 8080

COPY ./target/OrganizationData-0.0.1.jar /usr/app/
WORKDIR /usr/app

ENTRYPOINT ["java", "-jar", "java-app-1.0-SNAPSHOT.jar"]