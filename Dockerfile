FROM openjdk:11
COPY **/Hello-World.jar Hello-World.jar
ENV TARGET Garu
EXPOSE 9002
ENTRYPOINT ["java","-jar","Hello-World.jar"]