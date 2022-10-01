FROM openjdk:8
COPY LinkedLists.java /src/java
WORKDIR /src/java
RUN ["javac", "LinkedLists.java"]
ENTRYPOINT ["java", "LinkedLists"]