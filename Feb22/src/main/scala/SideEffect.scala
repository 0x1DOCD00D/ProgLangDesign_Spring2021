object SideEffect extends App {
  val evenfunc = (i:Int)=> 2*i
//  var xxxxx:Int = evenfunc(input)
  val f2:Function1[Int, String] = (i:Int)=>"S474 " + i.toString
  val composition = evenfunc andThen f2
  val input = 5
  
//  f2(xxxxx)
  
  println(composition(5))
}
