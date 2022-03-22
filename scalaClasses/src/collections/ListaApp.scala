package collections

object ListaApp extends App{
  val rangeNumbers = (1 to 26).toList
  println(rangeNumbers)

  val rangeSmallLetters = ('a' to 'z').toList
  println(rangeSmallLetters)

  val rangeCapitalLetters = ('A' to 'Z').toList
  println(rangeCapitalLetters)

  val rangeList = List.range(1,51)
  println(rangeList)

}
