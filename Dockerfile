from openjdk
COPY ./src/Main/java/*.java /
RUN javac /Main.java /Calculator.java
ENTRYPOINT ["java", "Main"]