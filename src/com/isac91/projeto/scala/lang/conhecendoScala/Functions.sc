def afunction() = "Create a function in Scala"
afunction()
println(afunction())

def sum(n1: Double, n2: Double) : Double = n1+n2
sum(5,9)

println("another sum: " + sum( 7,24))

def createFullName(name:String, middleName:String, lastName:String):String ={
  var fullName = name.concat(middleName)
  fullName = fullName.concat(lastName)
  fullName
}
println(createFullName("Isac ","Cordeiro","de Oliveira"))

def functionGetAny(value: Any) = println("The insrt value was: " + value )

println(functionGetAny("Isac"))
println(functionGetAny(90))
println(functionGetAny(true))
println(functionGetAny(sum(87,98)))
println(functionGetAny(sum(87,98)))