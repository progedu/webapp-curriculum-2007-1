object Main {
  def tribsForm(a:Int,b:Int,c:Int):Stream[Int] = a #:: tribsForm(b,c,a+b+c)
  val tribs: Stream[Int] = tribsFrom(0,0,1).take(7)
}
