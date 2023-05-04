// Scala program to find the number is 
// EVEN or ODD using ternary operator

object EvenOdd {
  def main(Args:Array[String]){
  /* var num:Int=0
    var Result:String=""
    print("enter number:")
    num = scala.io.StdIn.readInt()
    
    Result = if(num/2 == 0) "even" else "odd"
      println("number is:" +Result) 
    
    
// Scala program to print the ASCII value 
// of corresponding character    
var Ch:Char='a'
print("enter character")
//Ch =scala.io.StdIn.readChar()
println("Enter character value:" +Ch)
println("ASCII value:" +Ch.toInt)*/
    
// ***Swapping two numbers with/without using third variable

    var a=10
    var b=15
    println("values before swapping a = "+a+ ","+b)
     /*var temp =a
     a = b
     b = temp */
    a = a + b
        b = a - b
        a = a - b
     println("values after swapping a = "+a +","+b)
    
     
                                
  }
}