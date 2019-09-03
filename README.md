# scala_calculator
Commanad line calculator is developed using Functional programming language-Scala.<br/>
This is a simple calculator to perform addition, subtraction, multiplication, division and modulus of given numbers.

# Software_requirements
The key tools are :Oracle JDK, Scala Build Tool(sbt) and Scala.
# JDK :Oracle JDK 
install using http://www.oracle.com/technetwork/java/javase/downloads/jdk8-downloads-2133151.html<br/>
and check the version: $ java -version("1.8.0_221" used in this project).
# sbt 
install sbt based on your platform:http://www.scala-sbt.org/release/docs/Setup.html
<br/>To check sbt :$ sbt about ("0.13.18" used in this project)
# scala 
install using https://www.scala-lang.org/download/ and for details.
# To run project through commandLine
 In terminal go to Directory where scalaCalculcator.scala is saved using cd command <br/>
 scalac scalaCalculator.scala to generate class file<br/>
 scala scalaCalculator <br/>
 output:<br/>
welcome to the claculator app.Check the options for calculation <br/>
1. Addition <br/>
2. Subtraction <br/>
3. Multiplication <br/>
4. Division<br/>
5. Modulus <br/>
   Enter any two numbers<br/>
   25<br/> 
   5 <br/>
   Enter your option number<br/>
   4<br/>
   Result is :5<br/>
# updated single digit expression calculator
<br/>scalac ExprCalculator.scala 
<br/> scala ExprCalculaor
<br/>example 2+3*4/2
<br/>result is 8 like calculator with precedence 
# check for divide by zero
  the program checks whether denominator is equal to 0 or not.if so it asks user to re enter the denominator.
# program files
   <br/> Calculator.scala is developed using class and objects
   <br/> SCalaCalculatorNew.scala is developed using functions
   <br/> ScalaCalculator.scala is developed without using functions and class




