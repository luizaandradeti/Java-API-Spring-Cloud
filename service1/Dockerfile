FROM  openjdk:17-jdk-alpine
ENV APP_NAME service1	
COPY ./target/${APP_NAME}.jar  /app/${APP_NAME}.jar	
WORKDIR /app	
CMD java -jar ${APP_NAME}.jar	
#CMD ["java", "-jar", "service1-0.0.1-SNAPSHOT.jar"]
EXPOSE 8080
