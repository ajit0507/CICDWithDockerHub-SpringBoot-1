FROM openjdk:8
EXPOSE 9902
ADD target/cicd-github-springboot.jar cicd-github-springboot.jar
ENTRYPOINT ["java","-jar","cicd-github-springboot.jar"]