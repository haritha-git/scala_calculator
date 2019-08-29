object Calculator{
class Evaluate (var i :Int,var j :Int ){
    var a: Int = i
    var b: Int = j
    var operator: String=""
   // add function
    def add ():Int ={
    	operator = "+"
        a + b
    }
    // Subtraction function
    def sub():Int = {
    	operator = "-"
        a - b
    }
    // multiplication function
    def mul(): Int = {
    	operator = "*"
		a * b
    }
    // division function
    def div():Int = {
        if (b==0){
                    println(" divide by zero error occurs")
                    println("please enter the second number other than 0")
                    // new variable has to be assigned as argument y in function is value.
                    b = scala.io.StdIn.readInt()
                	operator = "/"

                    a / b
                   }
        else {
    	        operator = "/"

                 a / b }
    }
    // modulus function
    def mod(): Int = {
    	operator = "%"

        a % b
    }
	// *To calculate the result based on mathematical operation
	def calculator_match(x: Int) = x match {
	    case 1 => add()
	    case 2 => sub()
	    case 3 => mul()	
	// *if denominator is zero, throws divide by zero error
	    case 4 => div()
	    case 5 => mod()
	    case _ => "Sorry your entered option is not present in calculator"
	}
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
        // creating object
        var exp = new Evaluate(op1,op2)
        // Reading options to calculate
        println("Enter your option number")
		val x= scala.io.StdIn.readInt()
		/*To calculate and store it in result
		   calls calculator_match method*/

		val result = exp.calculator_match(x)
        // prints result
		println("Result is :" + op1+exp.operator+op2+"="+result)
    }
}