/**
  * Created by surverules on 11/22/2016.
  */
class Point(val x: Int, val y:Int) {
  var x_Coordinate = x
  var y_Coordinate = y

  def show: Unit = {
    println("X coordinate: " + x_Coordinate)
    println("Y coordinate: " + y_Coordinate)
  }
}
object Point {
  def apply(x: Int, y: Int): Point = new Point(x, y)
  def apply(x: Int): Point = new Point(x, 0)
}

