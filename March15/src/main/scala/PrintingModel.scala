object PrintingModel {
  trait Document {
    self: ConfigureAndPrint with PrintingWithAccess2Configure =>
    val content:String
    def output(printer:Int) = print(printer, content)
  }
  
  trait PrinterConfiguration {
    val fonts: List[String]
    def configure(printer:Int):Unit
  }
  trait Printing {
    def print(printer:Int, data:String):Unit
  }
  
  trait PrintingWithAccess2Configure extends Printing {
    //private val self = this
    self: PrinterConfiguration =>
    override def print(printer: Int, data: String): Unit = {
      configure(printer)
      println(data)
    }
  }
  
  trait ConfigureAndPrint extends PrinterConfiguration{
    override val fonts: List[String] = List("")
    override def configure(printer: Int): Unit = println(printer)
  }
  
  def main(args: Array[String]): Unit = {
    (new ConfigureAndPrint with PrintingWithAccess2Configure).print(1, "content")
    new Document with ConfigureAndPrint with PrintingWithAccess2Configure {
      override val content: String = "CS476"
    }.output(2)
  }
}
