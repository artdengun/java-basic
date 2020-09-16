FROM openjdk:8
EXPOSE 8080
ADD target/java-dasar-0.0.1-SNAPSHOT.jar java-dasar.jar
ENTRYPOINT ["java","-jar","/java-dasar.jar"]
