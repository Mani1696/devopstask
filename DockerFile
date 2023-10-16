FROM eclipse-temurin:17
COPY target/devopstask.jar devopstask.jar
CMD ["java","-jar","devopstask.jar"]