import kotlin.math.*
fun main() {
    //Ask user for choice
    var choice = 0
    //Print menu
    do{
    println("=================== AREA CALCULATOR =============")
        println("Please choose from the menu below to calculate the area of different shapes")
        println("1 - Area of a Circle")
        println("2 - Area of a Triangle")
        println("3 - Area of an Ellipse")
        println("4 - Area of a Square")
        println("9 - QUIT")

        print("Please enter your choice: ")
        choice = readLine()!!.toInt()
        //Validate and run the function of choice
        when(choice) {
            1 -> areaCircle()
            2 -> areaTriangle()
            3 -> areaEllipse()
            4 -> areaSquare()
            !in 1..4 -> if(choice == 9) println("End of Line") else println("INVALID CHOICE")
        }


    }while(choice !=9)


}
//Calculate area of a circle
fun areaCircle(){
     var radius =0.0
    println("============== AREA OF CIRCLE ================")
    print("Please input a radius: ")
    radius = readLine()!!.toDouble()
    println("The area of a circle with a radius of $radius is: ${PI*radius.pow(2)}")
}
//Calculate area of a triangle
fun areaTriangle(){
    var base =0.0
    var height = 0.0
    println("============== AREA OF TRIANGLE ================")
    print("Please input the Base: ")
    base = readLine()!!.toDouble()
    print("Please input the Height: ")
    height = readLine()!!.toDouble()
    println("The area of a triangle with a base of: $base and a Height of: $height is: ${.5*base*height}")
}
//Calculate area of an ellipse
fun areaEllipse(){
    var a =0.0
    var b =0.0
    println("============== AREA OF AN ELLIPSE ================")
    print("Please input side A: ")
    a = readLine()!!.toDouble()
    print("Please input side B: ")
    b = readLine()!!.toDouble()
    println("The area of a an ellipse with side A: $a and side B: $b is: ${PI*a*b}")
}
//calculate area of a square
fun areaSquare(){
    var a =0.0
    println("============== AREA OF A SQUARE ================")
    print("Please input the length of the side: ")
    a = readLine()!!.toDouble()
    println("The area of a square with the side length of: $a is: ${a.pow(2)}")

}