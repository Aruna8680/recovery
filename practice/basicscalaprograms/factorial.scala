//find factorial using recursive approach

object factorial {
/*def factorialRec(n: Int): Int ={
  if (n<1)
    return 1
    return n*factorialRec(n-1)
}
def main(args: Array[String]) {
  /*var n:Int=0
  print("enter n")
  n = scala.io.StdIn.readInt()*/
   val n = 6
    println("The factorial of " + n + " is " + factorialRec(n))
}
} */

//find factorial using iterative approach
  
def factorial(n: Int): Int={
  var factorial =1 
  for(i<-1 to n)
    factorial *=i
    return  factorial
}
  def main(args:Array[String]) {
  val n=6
  println("The factorial of " + n + "is"  +factorial(n))
  
  }

}