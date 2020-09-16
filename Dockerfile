FROM openjdk:8
EXPOSE 8080
ADD target/java-dasar.jar java-dasar.jar
ENTRYPOINT ["java","-jar","/java-dasar.jar"]
