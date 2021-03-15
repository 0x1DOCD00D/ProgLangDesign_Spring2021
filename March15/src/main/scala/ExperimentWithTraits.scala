import scala.collection.mutable.ListBuffer

object ExperimentWithTraits {

  trait Storage {
    protected val store: ListBuffer[Int]
    def get: Option[Int]
    def add(elem:Int):Unit
  }
  
  class IntegerStorage extends Storage{
    override protected val store: ListBuffer[Int] = ListBuffer()

    override def get: Option[Int] = store match {
      case store if store.isEmpty => None
      case _ => {
        val rv = store.head
        store.remove(0)
        Some(rv)
      }
    }

    override def add(elem: Int): Unit = store += elem
  }
  
  trait IncrementAddedNumber extends Storage {
    abstract override def add(elem: Int): Unit = super.add(elem+1)
  }
  
  trait TripleAddedNumber extends Storage {
    abstract override def add(elem: Int): Unit = super.add(elem*3)
  }
  
  def main(args: Array[String]): Unit = {
    val store:IntegerStorage = new IntegerStorage with IncrementAddedNumber with TripleAddedNumber 
    store.add(2)
    store.add(3)
    store.get.foreach(println)
    store.get.foreach(println)
    store.get.foreach(println)
    store.add(8)
    store.get.foreach(println)
  }
}