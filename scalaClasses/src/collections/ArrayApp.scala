package collections

object ArrayApp extends App {

  val fruits = Array("Pear","Grape","Apple","Orange")
  println("Length " + fruits.length)
  println("Size " + fruits.size)
  println("Size " + fruits.isEmpty)

  println()
  fruits.foreach(println)
  println()
  fruits.foreach(f => {
    print(f + ", ")
    f
  })
  println()

  val numbers = Array(1,2,3,4,5,6,7,8,9,10)
  val triplicado = numbers.map(_ *3)
  triplicado.foreach(println)
}
