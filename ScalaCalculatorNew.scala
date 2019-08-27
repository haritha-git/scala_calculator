/* Scala program to Create a command line calculator
 that calculates addition, subtraction, multiplication, division 
 and modulus operations
 created on 27/8/2019 */
object ScalaCalculatorNew 
{
    // add function
    def add (x :Int,y :Int):Int ={
        x + y
    }
    // Subtraction function
    def sub(x :Int,y :Int):Int = {
        x - y
    }
    // multiplication function
    def mul(x :Int,y :Int): Int = {
        x * y
    }
    // division function
    def div(x :Int, y :Int): Int = {
        if (y==0){
                    println(" divide by zero error occurs")
                    println("please enter the second number other than 0")
                    // new variable has to be assigned as argument y in function is value.
                    var y = scala.io.StdIn.readInt()
                    x / y
                   }
        else { x / y }
    }
    // modulus function
    def mod(x :Int,y :Int): Int = {
        x % y
    }
    // * Main Method considering Deprecate procedure syntax warning

    def main(args: Array[String]): Unit = 
    {
        // prints information about calculator
        println("welcome to the claculator app.Check the options for calculation")
        println("1.Addition\n2.Subtraction\n3.Multiplication\n4.Division\n5.Modulus")
        // Reading two numbers
        println("Enter any two numbers")
        var op1 = scala.io.StdIn.readInt()
        var op2 = scala.io.StdIn.readInt()
        // Reading options to calculate
        println("Enter your option number")
		val x= scala.io.StdIn.readInt()
		// *To calculate the result
        def calculator_match(x: Int) = x match {
            case 1 => add(op1 , op2)
		    case 2 => sub(op1 , op2)
		    case 3 => mul(op1 , op2)	
		    	// *if denominator is zero, throws divide by zero error
		    case 4 => div(op1 , op2)
		    case 5 => mod(op1 , op2)
		    case _ => "Sorry your entered option is not present in calculator"
		}
		// call calculator_match with option as argument,store in result.
		val result = calculator_match(x)
        // prints result
		println("Result is :" + result)

    }
}
