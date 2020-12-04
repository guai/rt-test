FROM openjdk:8-jdk-alpine
WORKDIR /
COPY ./build/libs/rt-test-producer.jar rt-test-producer.jar
EXPOSE 8080
CMD ["java","-jar","rt-test-producer.jar"]