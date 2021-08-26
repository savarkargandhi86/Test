FROM openjdk:11
COPY **/Hello-World.jar Hello-World.jar
ENV TARGET FromDockerEnvVariable
ENTRYPOINT ["java","-jar","Hello-World.jar"]
