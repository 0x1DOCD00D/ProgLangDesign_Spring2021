
object Main {

  class Airport
  trait Ship {
    def floatonwater() = {
      1
    }
  }
  
//  class AircraftCarrier extends Airport with Ship
  
  def main(args: Array[String]): Unit = {
    val o = new Airport with Ship
    o.floatonwater()
    println("Hello world!")
    println(msg)
  }

  def msg = "I was compiled by dotty :)"

}
