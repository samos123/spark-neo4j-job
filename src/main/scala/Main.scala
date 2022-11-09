import org.apache.spark.sql.{SaveMode, SparkSession}

object Main extends App {
  println("Hello, World!")
val spark = SparkSession.builder().getOrCreate()

val df = spark.read.format("org.neo4j.spark.DataSource")
    .option("url", "bolt://localhost:7687")
    .option("authentication.basic.username", "neo4j")
    .option("authentication.basic.password", "neo4j")
    .option("labels", "Person")
    .load() 
}
