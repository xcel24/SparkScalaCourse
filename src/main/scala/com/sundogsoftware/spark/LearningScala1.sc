// VALUES are immutable constants
val hello:String  = "Hola"

var name = "Prateek"

name = "Goswami"

//Data types
val numberOne:Int = 1
val truth:Boolean = true
val pi:Double = 3.1415
val singlePi:Float = 3.1415f
var letterA:Char = 'a'

println(f"Pi is about $singlePi%.3f")

println(f"Zero padding on the left $numberOne%05d")

println(s"Substituing values $numberOne $pi $letterA")

val number:Int = 3

number match {
  case 1 => println("One")
  case 2 => println("Tow")
  case 3 => println("Three")
  case _ => println("Something Else")
}

for (x <- 1 to 4){
  val squared = x*x
  println(squared)
}



def transformString(s:String,f:String => String) : String = {
  f(s)
}

transformString("hello",s=>s.toUpperCase())

val numberList = List(1,2,3,4,5)
val dup = numberList ++ numberList
dup.distinct

numberList.reverse

def parseLine(line:String) : (Int,Int) = {
  (1,1)
}


