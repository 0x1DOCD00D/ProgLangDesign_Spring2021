object PlayWithFunctions {

  trait FunctionOfInt2Int {
    def apply(input:Int): Int
    def f(input:Int): Int
  }

  def computeBonusBasedOnSalary(salary:Int)(performanceEval:FunctionOfInt2Int) = {
    //put some other logic to xform the salary
    performanceEval(salary)
  }

  def computeBonusBasedOnSalarySoupedUp(salary:Int)(performanceEval: Int=>Int) = {
    //put some other logic to xform the salary
    performanceEval(salary)
  }

  def `Mark feels happy today to write a method that returns a function`(coefficient:Int): Int=>Int = {
    (x:Int)=>coefficient*x
  }

  def main(args: Array[String]): Unit = {
    val someStorage = `Mark feels happy today to write a method that returns a function`(coefficient = 3)
    println(someStorage(3))


    println(computeBonusBasedOnSalary(3)(new FunctionOfInt2Int {
      override def apply(input: Int): Int = 2*input

      override def f(input: Int): Int = 1
    }))

    println(computeBonusBasedOnSalarySoupedUp(5)((x:Int)=>2*x))

    val value = computeBonusBasedOnSalarySoupedUp(7) _
    println(value((x:Int)=>2*x))

//    def myWhileMethod(cond: ()=>Boolean)(block: Unit): Unit ={
//      if(cond)block
//      else myWhileMethod(cond)block
//    }

    while(value == 2) {
      val b = 2
      (input:Int) => input*input*b
    }


  def doIt(bodyScope: => Unit) = {
    val cntr = 0
    new {
      def `repeat this loop until this condition is satisfied`(cond: => Boolean,term:Int): Unit = {
        bodyScope
        if(cond || cntr > term) `repeat this loop until this condition is satisfied`(cond,cntr+1)
        else ()
      }
    }
  }

    breakable {
      val x = 2
      doIt {
        println("howdy, cs476")
        if(x==2) break
      } `repeat this loop until this condition is satisfied`(x == 2, 100)
    }

    def break = throw Exception

    def breakable(command: =>Unit): Unit = {
      try {
        command
      } catch {
        case e:Exception => //whatever

      }
    }

  }
}