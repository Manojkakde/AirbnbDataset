import org.apache.spark.sql.SparkSession
object ProcessData {


  def main(args:Array[String]): Unit={

     val spark=SparkSession
       .builder()
       .master("local")
       .appName("Airbnb Data")
       .getOrCreate()

     var df=spark
       .read
       .option("header","true")
       .option("inferschema","true")
       .csv("D:/DataEngineeringProjects/datasets")

    df.show()






  }
}
