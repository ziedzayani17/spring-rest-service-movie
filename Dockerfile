FROM openjdk:11
COPY target/rest-angular-formation-0.0.1-SNAPSHOT.jar rest-angular-formation-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","/rest-angular-formation-0.0.1-SNAPSHOT.jar"]