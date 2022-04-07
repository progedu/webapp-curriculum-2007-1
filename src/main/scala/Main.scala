object Main {
  val tribs: Stream[Int] = {
    0 #:: 1 #:: 1 #:: tribs.zip({val x = tribs.tail; x.zip(x.tail)}).map{ n => n._1 + n._2._1 + n._2._2}
  }
}
