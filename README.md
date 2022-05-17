# springboot-gradle-container-demo
.

First clone the project and cmd into root directory and follow below steps

1 - Execute 'gradlew build' on command prompt

2 - docker build --build-arg JAR_FILE="build/libs/*.jar" -t containerdemo/spring-boot-docker .

3 - docker run -p 8080:8080 containerdemo/spring-boot-docker

4 - hit http://localhost:8080/anil
