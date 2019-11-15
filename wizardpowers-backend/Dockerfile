FROM openjdk:8-jdk-alpine

VOLUME /tmp
ARG JAVA_OPTS
ENV JAVA_OPTS=$JAVA_OPTS
ADD target/wizardpowers-backend-0.1.1-SNAPSHOT.jar wizardpowers-backend.jar
EXPOSE 8081
ENTRYPOINT exec java $JAVA_OPTS -Djava.security.egd=file:/dev/./urandom -jar wizardpowers-backend.jar
