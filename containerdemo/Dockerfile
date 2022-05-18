FROM openjdk:11
ARG JAR_FILE=containerdemo/build/libs/*.jar
COPY ${JAR_FILE} app.jar
ENTRYPOINT ["java","-jar","/app.jar"]
