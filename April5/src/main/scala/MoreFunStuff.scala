object MoreFunStuff extends App {
  def composeThem(f1: String=>Int)(f2:Int=>Float)(f3:Float=>String):String=>String = (input:String) =>f3(f2(f1(input)))

  val res = composeThem((s:String)=>s.length)((i:Int)=>i:Float)((f:Float)=>f.toString)



  println(res("Brendan"))
}
