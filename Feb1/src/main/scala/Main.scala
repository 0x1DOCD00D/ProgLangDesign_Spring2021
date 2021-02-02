
object Main {

  trait Context {}
  
  trait Gender
  trait Male extends Gender
  trait Female extends Gender
  
  trait Human[T] {
    val sex:T
    def talk(context:Context):String
  }
  
  
  abstract class Polician[T](s:T) extends Human[T] {
    override val sex: T = s
    override def talk(context: Context): String = "I promise to solve all problems at zero cost - no taxes!"
    
    val partyAffiliation:Boolean
  }
  
  def main(args: Array[String]): Unit = {
    println(new Human[Female] {
      override val sex: Female = new Female {}

      override def talk(context: Context): String = ???
    })
//    println(msg)
  }

  def msg = "I was compiled by dotty :)"

}
