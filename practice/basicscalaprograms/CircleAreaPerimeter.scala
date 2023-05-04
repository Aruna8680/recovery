
//Circle Area and Perimeter

object CircleAreaPerimeter {
  def main(Args:Array[String]){
    var radius:Float =0
    var Area:Float =0
    var perimeter : Float = 0
    var length:Float	=0
        var breadth:Float	=0
        var area:Float		=0
               print("enter radius:")
    radius = scala.io.StdIn.readFloat()
     print("Enter the length of rectangle: ")
        length=scala.io.StdIn.readFloat()
        
        print("Enter the breadth of rectangle: ")
        breadth=scala.io.StdIn.readFloat()
    
    Area =3.14F*radius*radius
    perimeter =2*3.14F*radius
    println("Area:" +Area)
    println("perimeter:" +perimeter)
    
       
        
        //Caculate the area of rectangle.
        area = length * breadth

        println("Area of rectangle: "+area)
  }
  
}