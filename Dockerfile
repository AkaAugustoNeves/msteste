FROM openjdk:11-jre-slim

WORKDIR /app

ENV teste "esse aqui é meu teste dentro do docker"

COPY target/msteste-0.0.1-SNAPSHOT.jar /app/msteste-0.0.1-SNAPSHOT.jar

EXPOSE 8080

CMD ["java", "-jar", "msteste-0.0.1-SNAPSHOT.jar"]