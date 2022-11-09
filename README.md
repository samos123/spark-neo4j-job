## Example Spark Job that uses Neo4j and Docker image

This is a very small example app that packages a Spark application
which uses Neo4J as a datasource.

Run the steps below to reproduce:
```
sbt assembly
docker run -v $PWD:/tmp/my-jar -it apache/spark bash
/opt/spark/bin/spark-submit --class Main /tmp/my-jar/target/scala-2.12/hello-world-assembly-1.0.jar
```
