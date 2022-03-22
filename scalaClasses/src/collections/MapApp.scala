package collections

object MapApp extends App {
  var colorsMap: Map[Char, String] = Map ('B' -> "Blue", 'Y' -> "Yellow")
  colorsMap.foreach(println)
  colorsMap += ('P'->"Pink")
  colorsMap.foreach(println)

  println(colorsMap.toList)
}
