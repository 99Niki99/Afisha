FROM rsunix/yourkit-openjdk17

WORKDIR /usr/src/myapp

COPY build/libs/demo-0.0.1-SNAPSHOT-plain.jar /usr/src/myapp/

CMD ["java","-jar", "/usr/src/myapp/demo-0.0.1-SNAPSHOT-plain.jar"]