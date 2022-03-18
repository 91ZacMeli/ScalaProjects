for(num <- 0 to 10) println("The number value is : " + num)


for(num <- 0 to 20 by 2) println("The number value is : " + num)


for(num <- 0 to 30 by 3) println("The number value is : " + num)

val frutas = List("Banana", "Laranja", "Amora", "Abacaxi","Uva")

for(fruta <- frutas)println("Fruta " + fruta)


val frutaComA = for{
  fruta <- frutas
  if(fruta.startsWith("A"))
} yield fruta.toUpperCase()

println(frutaComA)