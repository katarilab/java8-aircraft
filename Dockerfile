FROM openjdk:8-jdk-alpine AS build-env
WORKDIR /app
COPY . ./
RUN ./gradlew bootRepackage



FROM openjdk:8-jdk-alpine 
WORKDIR /app
COPY --from=build-env /app/build/libs .
RUN ls -la 
EXPOSE 8080/tcp
ENTRYPOINT ["java","-jar","/app/java8-aircraft-0.0.1-SNAPSHOT.jar"]
