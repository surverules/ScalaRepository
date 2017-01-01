/**
  * Created by surverules on 1/1/2017.
  */
object UserInput {
  var position = Array("A", "B", "C", "D", "E", "F", "G")

  def convertToNumeric(location: String): Int = {
      for (i <- 0 to position.length) {
       if (location.substring(0,1).equals(position(i)))
         return ((i+1) + location.substring(1,2)).toInt
    }
    return 0;
  }


  def main(args: Array[String]): Unit = {

    println("Go to the Cell: " + convertToNumeric("G2"))


  }


}
