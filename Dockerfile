FROM amazoncorretto:11-alpine-jdk
MAINTAINER MAR
COPY target/mar-0.0.1-SNAPSHOT.jar  mar-app.jar
ENTRYPOINT ["java","-jar","/mar-app.jar"]
