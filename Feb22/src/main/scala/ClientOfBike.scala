import java.lang
import java.util.Date
object ClientOfBike extends App {
  import Bike._
  
  class Schwinn extends Bike {
    override def shiftGears(gear: Int): (Integer, Integer) = ???

    override def applyBreaks(): lang.Boolean = ???

    override def headLights(timeofDay: Date): lang.Boolean = ???
  }

}
