# Stage 1: Build with Maven
FROM maven:3.9.6-eclipse-temurin-21 AS build
WORKDIR /app
COPY pom.xml mvnw* /app/
COPY .mvn .mvn
COPY src /app/src
RUN mvn -B -DskipTests package

# Stage 2:  Run with JRE
FROM eclipse-temurin:21-jammy
WORKDIR /app
COPY --from=build /app/target/*.jar app.jar
EXPOSE 8080
ENTRYPOINT ["java","-jar","/app/app.jar"]