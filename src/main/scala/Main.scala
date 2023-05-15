object Main {
  val tribs: LazyList[Int] = 0 #:: 0 #:: 1 #:: tribs.zip(tribs.tail).zip(tribs.tail.tail).map((a, b) => a._1 + a._2 + b)
}
