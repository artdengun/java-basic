FROM openjdk:8
EXPOSE 8080
ADD target/javadasar.jar javadasar.jar
ENTRYPOINT ["java","-jar","/java-dasar.jar"]
