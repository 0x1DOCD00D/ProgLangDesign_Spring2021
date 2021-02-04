import Human._

object DoIt extends App{
//  def +(o1:Int, o2:Int):Int = o1*o2
//  val v = 2.+(3) 
  
  class Scholar(deepthought:String, val education:String) extends Human(deepthought) {
    def levelOfEducation:Int = education match {
      case "UIC" => 5
      case _ => 0
    }

    override def listenAndrespond(saidThing: String): String = s"I said $saidThing as an educated $levelOfEducation"
  }
  
  
  val chicagoan: Human = new Human("arctic air is moving in here!!!!")
  println(chicagoan.listenAndrespond("ksjdalskjdal"))
  
  val edPerson: Human = new Scholar("arctic air is moving in here!!!!", "UIC")
  println((new Scholar("arctic air is moving in here!!!!", "UIC")).listenAndrespond("I am Decartes!"))
  
  val trueEdPerson = new Scholar("the summer will come!!!!", "UIUC")
  trueEdPerson.listenAndrespond("it makes the difference")
  
  //println(chicagoan)
}