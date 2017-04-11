FROM java:latest
RUN mkdir -p /opt/application/dubbo-demo
COPY ./target/classes /opt/application/dubbo-demo/classes
COPY ./target/dependency /opt/application/dubbo-demo/dependencies
WORKDIR /opt/application/dubbo-demo
EXPOSE 8080:8080 5005:5005
VOLUME /tmp
ENV JAVA_OPTS="-server -Xms1024M -Xmx1024M -Xss512k -XX:PermSize=256M"
ENTRYPOINT ["java","-cp","/opt/application/dubbo-demo/classes:/opt/application/dubbo-demo/dependencies/*","com.example.DubboDemoApplication"]