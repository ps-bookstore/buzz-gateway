FROM eclipse-temurin:21-jre

WORKDIR /app

COPY /target/gateway-0.0.1-SNAPSHOT.jar /app/gateway.jar

ENTRYPOINT ["java", "-jar", "/app/gateway.jar", "--spring.profiles.active=prod"]
