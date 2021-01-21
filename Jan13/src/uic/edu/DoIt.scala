object DoIt extends App {
  val block: Unit = {
    val str = "cs476"
    def printit(s:String) = println(s)
    printit(str)
  }
  
  val func: ()=>Unit = ()=>block
  def execItLazy(b: => Unit) = b
  def execIt(b: Unit) = println(b)
  execIt(block)
  
}