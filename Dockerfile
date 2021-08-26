FROM openjdk:11
COPY **/Hello-World.jar Hello-World.jar
ENV TARGET FromDockerEnvVariable
EXPOSE 9001
ENTRYPOINT ["java","-jar","Hello-World.jar"]
