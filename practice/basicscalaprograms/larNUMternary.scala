// Scala program to find the largest number between 
// two numbers using ternary operator

object larNUMternary {
  def main(Args:Array[String]){
    /*var num1:Int =0
    var num2:Int=0
    var large:Int=0
    
    print("Enter number1:")
    num1 = scala.io.StdIn.readInt()
    print("Enter number2:")
    num2=scala.io.StdIn.readInt()
    
  large =if (num1>num2)num1 else num2
  println("Largest num:" +large) 
     
  }
} */

// Scala program to find the largest number among 
// three numbers using ternary operator

    var num1:Int =0
    var num2:Int=0
    var num3:Int=0
    var large:Int=0
    
    print("Enter number1:")
    num1 = scala.io.StdIn.readInt()
    print("Enter number2:")
    num2=scala.io.StdIn.readInt()
    print("Enter number3:")
    num3=scala.io.StdIn.readInt()
  large =if (num1>num2 && num1>num3)num1 else if (num2>num1 && num2> num3) num2 else num3
  println("Largest num:" +large)
  }
}