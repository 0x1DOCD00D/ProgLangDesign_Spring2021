
object Main {

  class Airport
  trait Ship {
    def floatonwater() = {
      1
    }
  }
  
//  class AircraftCarrier extends Airport with Ship
  
  trait AbstractDatabase {
    def Connect(login:String, pswd:String):Boolean
  }
  
  class MySqlDatabase extends AbstractDatabase {
    override def Connect(login:String, pswd:String):Boolean = true
  }
  
  class MongoDb extends AbstractDatabase {
    override def Connect(login:String, pswd:String):Boolean = true
  }
  
  class CsvTablesDb extends AbstractDatabase{
    override def Connect(login: String, pswd: String): Boolean = ???
  }
  
  // val db:AbstractDatabase = new MongoDb
  class Scholar(db:AbstractDatabase) {
//  class Scholar {
//    var db:AbstractDatabase = _
//    def injectDbInstance(db:AbstractDatabase) = ???
    def retriveData() = db.Connect("mark","12345")
    def saveData() = ???
  }
  
  class Student(db:MySqlDatabase) extends Scholar(db)
  class Professor(db:MySqlDatabase) extends Scholar(db)

  trait Printer {
    def print():Unit// = println("A")
  }
  
  trait Document {
    //we need to access the method of A
    //we are talking about this
    //this -> references an object of Document
    alsdkaslk: Printer =>
    def methodB() = {
      println("B")
      print()
    }
  }

  
  def main(args: Array[String]): Unit = {
//    val peter = new Student with MongoDb
//    val angelica = new Student() with MySqlDatabase
//    val mark = new CsvTablesDb() with CsvTablesDb
    
    val o = new Airport with Ship
    o.floatonwater()
    println("Hello world!")
    println(msg)
  }

  def msg = "I was compiled by dotty :)"

}
