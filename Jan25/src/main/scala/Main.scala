
object Main extends App {
//  (3+2)*(4*7)
  type Environment = Map[String,Int]
  type EvaluateEnvironmentFunction = Environment ?=> Int
  given env as Environment = Map("peter"->3, "zach"->7)
  
  enum Expression:
    case Value(v:Int)
    case Variable(name:String)
    case Add(o1:Expression, o2:Expression)
    case Multiply(o1:Expression, o2:Expression)
  
  import Main.Expression._
  
  val result:Expression = Multiply(Add(Variable("zach"),Value(2)), Multiply(Value(4),Value(7)))
  
  def eval(expression: Expression):EvaluateEnvironmentFunction = expression match {
    case Value(v) => v
    case Variable(someName) => summon[Environment].getOrElse(someName, throw Exception(s"undefined variable $someName"))
    case Add(o1, o2) => eval(o1) + eval(o2)
    case Multiply(o1, o2) => eval(o1) * eval(o2)
  }
      
    println(result)
    println(eval(result))
}
