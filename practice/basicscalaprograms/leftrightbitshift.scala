// Scala program to demonstrate the 
// bitwise left-shift (<<) operator

object leftrightbitshift {
  def main(args:Array[String]){                                    // result = number << 3
                                                                     //result = 6 * (23)
             
                                                                      // result = 6 *  8                                                               
                                                                     // result = 48
    var num1:Int=0
    var num2:Int=0
    var res1:Int=0
    var res2:Int=0
    print("enter num1:")
    num1=scala.io.StdIn.readInt()
    res1 = num1 << 3
    println("result:"+res1)
    
    print("enter num2:")
    num2=scala.io.StdIn.readInt()
     res2 = num2 >> 3
    println("result:"+res2)
    //result = number >> 3
//result = 128 / (23)
//result = 128 / 8
//result = 16
    
  }
}