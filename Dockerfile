FROM openjdk:17
COPY /build/libs/back-end-0.0.1.jar /app/
EXPOSE 8080
ENTRYPOINT ["java","-jar","/app/back-end-0.0.1.jar"]