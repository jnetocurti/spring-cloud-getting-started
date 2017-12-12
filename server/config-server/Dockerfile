FROM openjdk:8u121-jdk-alpine
RUN mkdir -p /usr/src/app
WORKDIR /usr/src/app
COPY ./ ./
EXPOSE 8081
ENTRYPOINT ["./mvnw", "spring-boot:run"]