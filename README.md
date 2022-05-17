# springboot-gradle-container-demo
.

First clone the project and cmd into root directory and follow below steps

1 - gradlew build

2 - docker build --build-arg JAR_FILE="build/libs/*.jar" -t containerdemo/spring-boot-docker .
3 - docker run -p 8080:8080 containerdemo/spring-boot-docker
