

object bitwisexor {
  // Scala program to demonstrate the 
// "BITWISE XOR" (^) operation
  
    def main(args:Array[String]){  
        var number1:Int=0
        var number2:Int=0
        var result:Int=0
        
        print("Enter number1: ")
        number1=scala.io.StdIn.readInt()
        
        print("Enter number2: ")
        number2=scala.io.StdIn.readInt()
        
        result = number1 ^ number2
        
        println("Result: "+result)
   

/*result = number1 ^ number2
result = 6 | 2

The binary equivalent of 6 is 0110.
The binary equivalent of 2 is 0010.

Then

0110
0010
====
0010

That is 2.*/
// Scala program to demonstrate the 
// 1's complement (~) operator

  // Scala program to demonstrate the 
// 1's complement (~) operator
        var number3:Int=0
        var result3:Int=0
        
        print("Enter number: ")
        number3=scala.io.StdIn.readInt()
        
        result3 = ~number3
        
        println("Result: "+result3)
     
 }  
}