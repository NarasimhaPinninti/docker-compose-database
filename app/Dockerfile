FROM eclipse-temurin:17-jre
COPY target/springdemo-1.0.jar /usr/app/springdemo-1.0.jar
WORKDIR /usr/app/
EXPOSE 8080
ENTRYPOINT ["java","-jar","springdemo-1.0.jar"]
