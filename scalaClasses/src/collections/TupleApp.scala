package collections

object TupleApp extends App {
  val veryTypesTogether = (12334,33.44, 4333l, "Olá Tuple", Array("Item 1", "Item 2"))
  println(veryTypesTogether)

  println("T1: " + veryTypesTogether._1)
  println("T2: " + veryTypesTogether._2)
  println("T3: " + veryTypesTogether._3)
  println("T4: " + veryTypesTogether._4)
  println("T5: " + veryTypesTogether._5)

  val itemTuple = veryTypesTogether._5
  itemTuple.foreach(println)
}
