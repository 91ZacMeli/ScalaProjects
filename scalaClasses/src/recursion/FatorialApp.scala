package recursion

object FatorialApp extends App{
  def fatorial(num: Int): Int = {
    if(num == 1)
      1
    else
      num * fatorial(num -1)
  }
  val num = 5
  println("Fatorial de "+ num +" é "+ fatorial(num))
}
