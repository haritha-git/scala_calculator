    /* created on 27/08/2019
       Command line calculator using scala */
    import java.util.Stack
    import java.util.Arrays.toString
    import java.io.IOException
    import java.io.BufferedReader
    import java.io.InputStreamReader
    // ExprCalculator calucaltes single digit expressions 2+3*4-8/2
    object ExprCalculator {

    // Higher value means higher precedence order
      def Order(ch: Char): Int = {
        ch match {
          case '+' | '-' => 1
          case '*' | '/' => 2
          case '%' => 3
          case '^' => 4

        }
        -1
      }
      // to postfix expression.
def toPostfix(exp: String): String = 
      {
      // initializing empty String for result
        var result: String = new String("")
      // initializing empty stack
        val stack: Stack[Character] = new Stack[Character]()
        for (i <- 0 until exp.length) 
        {
          val c: Char = exp.charAt(i)
          // If the scanned character is an operand, add it to output.
          if (java.lang.Character.isLetterOrDigit(c)) result += c
          else // an operator is encountered
              {
              while (!stack.isEmpty && Order(c) < Order(stack.peek())) 
                     {
                      result += stack.pop() 
                     }
              stack.push(c)
              }
         }
    // pop all the operators from the stack
        while (!stack.isEmpty) 
        {
          result += stack.pop()
        }
        result
      }
      // evalate postfix expression
def evaluate(exp: String): Int = {
        //create a stack
        val stack: Stack[Integer] = new Stack[Integer]()
        for (i <- 0 until exp.length) {
          val c: Char = exp.charAt(i)
        // push it to the stack.
          if (java.lang.Character.isDigit(c)) stack.push(c - '0')
          else {
            val val1: Int = stack.pop()
            val val2: Int = stack.pop()
            c match {
              case '+' => stack.push(val2 + val1)
              case '-' => stack.push(val2 - val1)
              case '/' => stack.push(val2 / val1)
              case '*' => stack.push(val2 * val1)
              case '%' => stack.push(val2 % val1)
              case '_' => "invalid argument" }
            }
        }
        stack.pop()
    }
      //  main starts here
       def main(args: Array[String]): Unit = {
        var exp: String = null
        val br: BufferedReader = new BufferedReader(new InputStreamReader(System.in))
        println("Please Enter input string")
        exp = br.readLine()
        val output: String =toPostfix(exp)
        //println(output)
        val expression = output.mkString(" ")
        println("Output of "+exp+" = " + evaluate(output))
      }
}
