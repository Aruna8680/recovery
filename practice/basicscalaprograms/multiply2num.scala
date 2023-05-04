// Scala program to multiply two numbers 
// using plus (+) operator

object multiply2num {
  def main(args:Array[String]){
    var num1:Int=0
    var num2 :Int=0
    var num3:Int=0
    var num4 :Int=0
    var mul:Int=0
    var count:Int=0
    var temp:Int=0
    println("enter num1:")
    num1=scala.io.StdIn.readInt()
    println("enter num2:")
    num2=scala.io.StdIn.readInt()
    
    count = 1
    while(count<=num1)
    {
      mul+=num2
      count=count+1
    }
    
    
    // Highest Common Factor (HCF)

    println("enter num3:")
    num3=scala.io.StdIn.readInt()
    println("enter num4:")
    num4=scala.io.StdIn.readInt()
    while (num4!=0)
    {
      temp = num3%num4
      num3=num4
      num4=temp
    }
      println("multiplication is:" +mul)
      println("HCF is:" +num3)
  }
  
}