FROM openjdk:8
EXPOSE 8080
ADD target/javabasic.jar javabasic.jar
ENTRYPOINT ["java","-jar","/java-dasar.jar"]
