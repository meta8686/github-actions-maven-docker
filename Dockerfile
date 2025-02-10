FROM openjdk:21-jdk

COPY target/github-actions-maven-image-1.0.0.jar /app/app.jar

CMD ["java","-jar","/app/app.jar"]