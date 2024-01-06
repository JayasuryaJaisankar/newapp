FROM eclipse-temurin:17
COPY target/newapp.jar newapp.jar
CMD ["java","-jar","newapp.jar"]