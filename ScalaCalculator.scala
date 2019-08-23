/* Scala program to Create a command line calculator
 that calculates addition, subtraction, multiplication, division 
 and modulus operations
 created on 23/8/2019 */
object ScalaCalculator 
{
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
            case 1 => {op1 + op2}
		    case 2 => {op1 - op2}
		    case 3 => {op1 * op2}	
		    	// *if denominator is zero, throws divide by zero error
		    case 4 => {if (op2==0){
		    	        println(" divide by zero error occurs")
		    	        println("please enter the second number")
		    	        op2 = scala.io.StdIn.readInt()
		    	        op1/op2}
                       else{op1/op2}
                      }
		    case 5 => {op1 % op2}
		    case _ => "Sorry you have to entered option not present in calculator"
		}
		// call calculator_match with option as argument,store in result.
		val result = calculator_match(x)
        // prints result
		println("Result is :" + result)

    }
}
