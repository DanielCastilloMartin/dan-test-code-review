FROM openjdk:11.0-jdk-slim-stretch

RUN apt-get install -y tzdata

ENV TZ Europe/Spain

VOLUME [ "/home"]

ENTRYPOINT [ "java", "-jar", "-Dspring.profiles.active=dev","home/dani-etalentum.jar"]

