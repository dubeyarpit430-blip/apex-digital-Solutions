FROM eclipse-temurin:17-jdk -jammy

WORKDIR /app

COPY..

RUN./mvnw clean package

CMD ["java", "-jar", "target/*.jar"]