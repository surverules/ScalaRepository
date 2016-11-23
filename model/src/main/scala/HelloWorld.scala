/**
  * Created by surverules on 11/20/2016.
  */
class HelloWorld {

  def helloWorld: Unit = {
    println("Hello World")
  }

  def apply: HelloWorld = new HelloWorld()

  def main(args: Array[String]): Unit = {
    helloWorld
  }
}
