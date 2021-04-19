package uic.edu
object CompareStuff extends App {
  //this is implemented by the package/server designer for clients
  trait Container[A] extends Ordered[A]
  class MyContainer extends Container[MyContainer] {
    override def compare(that: MyContainer): Int = 0
  }

  trait NewContainer[T <: NewContainer[T] ] extends Ordered[T]

  //clients use the implementation given by the server
//  class MarkContainer extends Container[MarkContainer] {
  class MarkContainer extends Container[MyContainer] {
    override def compare(that: MyContainer): Int = 0
  }
//  class OhMyContainer extends NewContainer[MyContainer]{
//    override def compare(that: MyContainer): Int = 0
//  }

  val variable = {
    println("Hello from a block!")
    "CS476"
  }

  println(variable)

  trait Magnet[T]
  class MagnetInt extends Magnet[Int]
  class MagnetString extends Magnet[String]

  class ExperimentTypeErasure {
    //learn how to use the pattern Magnet in Scala
    //def meth(input: Magnet):Boolean
//    def meth(input: Ordering[Int]):Boolean = ???
    def meth(input: Ordering[String]):Boolean = ???
  }
}