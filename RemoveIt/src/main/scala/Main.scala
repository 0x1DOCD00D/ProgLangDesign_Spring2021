/*
Please create a Scala program that contains a List of tables
where each element of this list is a table object whose key is a
variable of type String that maps to a value that is a table object
whose key is a variable of type String that maps to an integer value.
Next, add the command line input where a user of your program is
asked in a loop to enter the name of a scope and then for this
scope to enter the names of variables and their values. Save the
entered values in the List of tables.
 */

/*
Write a function that in a loop a user is prompted to enter the scope name, var name as its value as comma separated entries in one line.
Process each line, create a tuple (scopename, varaname, value) and stash those tuples in some list. Once the user enters the word quit,
this loop is exited.
Next, invoke your function that you need to write where you iterate through the list of tuples and construct a list of env tables.
Finally, write and invoke a function that prompts a user to enter the name of a scope and the name of a var and it prints out the value of
this var or “undefined” if it is not defined.
 */

//import scala mutable map
import scala.collection.mutable
import scala.collection.mutable.ListBuffer
import scala.collection.mutable.HashMap
import scala.io.StdIn.readLine
import scala.util.control.Breaks.{break, breakable}

object Main{

  def ListOfTables(): Unit = {

    // made a list of tables that takes a hash map as a data
    var listoftables = List(mutable.Map[String, Map[String, Int]]())

    //empty string for input of user
    var input = ""

    //start of loop
    while (input != "quit") {
      // ask user for input
      println("Please enter scope name, Object name, and value separated by commas ")
      // user input
      input = readLine()

      val container = input.split(",")

      // if input == quit break out of loop
      if (input == "quit") break

      //enter scope name as string
      val ScopeName: String = container(0)

      // enter object name as string
      val ObjectName: String = container(1)

      //input string value and convert to an int
      val Value: Int = container(2).toInt

      // create empty scope map
      val scopeMap: Map[String, Int] = Map(ObjectName -> Value)

      // maps scope name to
      val NewScope: mutable.Map[String, Map[String, Int]] = mutable.Map(ScopeName -> scopeMap)

      //updates list
      listoftables = listoftables :+ NewScope

      //MG: what will be the content of the list if the user enters two scopes with the same name and different variable names and values?

      // loops through list to get element
      for (elements <- listoftables) {

        // in the list get Scope and the map it is mapped too
        for ((scope, map) <- elements) {

          // in the second map
          for ((obj, value) <- map) {

            // prints out everything nicely from all the maps

            println(scope + " " + obj + " " + value)
          } // end of lop
        } // end of loop
      } // end of loop
    } // end of while loop

  }// end of ListOfTables

  def ListOfTuple(): List[(String,String,Int)] = {
    // empty list of tuples
    var ListOfTuples: List[(String,String,Int)] =List()

    //empty string
    var input = ""

    breakable {
      // start of loop
      while (input != "quit") {

        // ask user for input
        println("Please enter scope name, Object name, and value separated by commas")

        // user input
        input = readLine()

        if (input == "quit") break

        // split string into array on the comma
        val container = input.split(",")

        // get index from container
        val scopename = container(0)
        val varname = container(1)
        val value = container(2).toInt

        //tuple
        val table = (scopename, varname, value)

        // add tuple to list
        ListOfTuples = ListOfTuples :+ table

      } //end of while loop
    } // end of break

    // return list
    ListOfTuples

  }// end of ListOfTuple

  def Table(ListOfTuples:List[(String, String, Int)]): //Unit
  mutable.Map[String, List[(String,Int)]]
  = {

    // List of scopes that maps a String to a list of tuples
    //var ListOfScopes = List(mutable.Map[String,List[(String,Int)]]())

    // Scope map
    val Scope = mutable.Map[String,List[(String,Int)]]()

    // runs through each tuple of the list of tuples
    for (each_tuple <- ListOfTuples){

      // takes the index of the name and value and pairs them in a tuple
      val name_val_pair = (each_tuple._2, each_tuple._3)

      //List of tuples for name - val pair
      var list_of_values:List[(String, Int)] = List()

      var contains = false

      // checks to see if key exist
      if(Scope.contains(each_tuple._1)){

        list_of_values = Scope(each_tuple._1)

        // adds name val pair to list of values
        list_of_values = list_of_values :+ name_val_pair

        // maps list of values to scope name
        Scope(each_tuple._1) = list_of_values
        contains = true
      } // end of if
      else{
        // adds name val to end of list
        list_of_values.::=(name_val_pair)

        // maps list of val to Scope name
        Scope(each_tuple._1) = list_of_values
        contains = false
      } // end of else

    } // end for loop

    // add scope to list of scope
    //ListOfScopes = ListOfScopes :+ Scope
    // returns List of scopes
    //ListOfScopes
    //println(ListOfScopes)
    //println(Scope)
    Scope

  } // end of Table

  def Display(Table:mutable.Map[String, List[(String,Int)]]): Unit = {

    // takes string as input
    var input = ""

    // as user for name of scope
    println("Please enter name of the scope you want")
    // read input
    input = readLine()

    breakable{
      //loops through map
      for ((key, value) <- Table) {

        // compares input to scope name
        if (input == key) {

          // ask user for value
          println("Please enter name of value you want")
          // read input

          input = readLine()
          // goes though list
          for (name <- value) {

            //compares if input == var name
            if (input == name._1) {

              // print val
              println("Value: " + name._2)
            } // end if
            else {
              // if val name is not there
              println("Undefined")
              break

            } // end of else

          } // end of for loop

        } // end of if
        else{
          //if scope doesn't exist
          println("Does not exist")
          break
        }// end of else
      } // end of for loop
    }
  }// end of Display

  def main(args: Array[String]): Unit = {
    //ListOfTables()
    //ListOfTuple()
    //Table(ListOfTuple())
    Display(Table(ListOfTuple()))

  }// end of def main

  // List[string -> List[(string, int)]]

} // end of object Main