package uic.edu

import scala.annotation.tailrec

object OurNumberingSystem extends App {
  //   ||||||||||||||| + ||| => |||||||||||||||| + || => ||||||||||||||||| + | => ...
  // 1 2 3 4 5 6 7 8 9 0
  // 9+3 -> 12

  trait NaturalNumber
  object Zero extends NaturalNumber
  case class |[N <: NaturalNumber](number: N) extends NaturalNumber

  val five = |(|(|(|(|(Zero)))))

  def translate2Arabic(n: NaturalNumber): Option[Int] = {
    def translateAcc(acc:Int, n:NaturalNumber):Option[Int] = {
      n match {
        case Zero =>Some(acc)
        case |(x) => {
          println(x)
          translateAcc(acc + 1, x)
        }
      }
    }
    translateAcc(0,n)
  }

  println(translate2Arabic(five))

  @tailrec
  def sum(i:NaturalNumber, j: NaturalNumber): Option[NaturalNumber] = {
    if(j == Zero)Some(i)
    else sum(add_|(i), rem_|(j).get)
  }

  def add_|(i:NaturalNumber):NaturalNumber = |(i)
  def rem_|(i:NaturalNumber):Option[NaturalNumber] = i match {
    case Zero => None
    case |(value) => Some(value)
  }
  println(sum(five, five))
}
