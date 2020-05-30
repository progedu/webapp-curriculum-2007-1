object Main {
  List(0, 0, 1, 1, 2, 4, 7, 13, 24, 44, 81, 149, 274, 504, 927, 1705, 3136, 5768, 10609, 19513, 35890) 
  val tribs: Stream[Int] = 0 #:: 0 #:: 1 #:: tribs.zip(tribs.tail).zip(tribs.tail.tail).map { n => n._1._1 + n._1._2 + n._2 }
}
