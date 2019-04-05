object Main {
  val tribs: Stream[Int] = 0 #:: 0 #:: 1 #:: tribs.zip(tribs.tail).zip(tribs.tail.tail).map { n => n._1._1 + n._1._2 + n._2 }

}
