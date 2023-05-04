// Scala program to demonstrate the 
// "BITWISE   "AND (&)" "OR" (|) operation

object bitwiseandor {
  def main(args:Array[String]){
    var num1:Int=0
    var num2:Int=0
    var res1:Int=0
    var res2:Int=0
    print("enter num1:")
    num1= scala.io.StdIn.readInt()
    print("enter num2:")
    num2= scala.io.StdIn.readInt()
    
    res1 = num1 & num2
    res2 =num1 | num2
    
    println("result:"+res1,+res2)
  }
}

/*res = number1 | number2
res = 5 | 3

The binary equivalent of 5 is 0101.
The binary equivalent of 3 is 0011.
0101
0011
====
0111    That is 7.
* result = number1 & number2
result = 5 & 3

The binary equivalent of 5 is 0101.
The binary equivalent of 3 is 0011.

Then
0101
0011
====
0001

That is 1.
*/
