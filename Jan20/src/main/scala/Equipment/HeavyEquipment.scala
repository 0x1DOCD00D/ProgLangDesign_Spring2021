package Equipment

sealed trait HeavyEquipment4Factory
sealed trait HeavyEquipment4Army

abstract class Forklift(id:Int) extends HeavyEquipment4Factory {
  var x:Int = _
  var y:Int = _
  def Drive(speedLimit:Int):Boolean
  def Location:Tuple2[Int,Int] = (x,y)
}

class FurnitureForklift(id:Int) extends Forklift(id)  {
  def Drive(speedLimit:Int):Boolean = true
}


