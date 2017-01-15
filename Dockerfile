FROM openjdk:8
MAINTAINER Franck NEGRELLO

COPY MSRestProto-exec.jar /opt/MSRestProto-exec.jar

EXPOSE 8080

CMD ["java","-jar","/opt/MSRestProto-exec.jar"]
WORKDIR /home/docker
