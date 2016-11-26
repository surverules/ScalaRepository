import scala.collection.mutable

/**
  * Created by surverules on 11/26/2016.
  */
object foldleftExample {

  var collect: mutable.MutableList[Int] = new mutable.MutableList[Int]

  //Inserts into List
  def addElement(number: Int) = {
    for (i <- 0 to number)
    {
      collect.+=(number - i)
    }
  }

  //does the some of the Elements in the List
  def sum(list: List[Int]): Int = {
    list.foldLeft(0)((a, b) => a+b)
  }

  def main(args: Array[String]): Unit = {

    var number = 5;
    addElement(number)
    println("Sum of 1st " + number + " is: " + sum(collect.toList))

  }

}
