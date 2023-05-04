

object squarerootPOWERofnum {
  def main(Args:Array[String]){
    var num1:Int =0
    var num2:Double =0
    var p:Int =0
    var squareroot:Double=0
    var powofnum:Double=0
    
    print("enter num1:")
    num1= scala.io.StdIn.readInt()
    print("enter num2:")
    num2= scala.io.StdIn.readInt()
    print("enter p:")
    p= scala.io.StdIn.readInt()
    squareroot =scala.math.sqrt(num1)
    println("squareroot:"+squareroot)
    
    
    powofnum=scala.math.pow(num2, p)
    println("powofnum:"+powofnum)
    
    
  }
}