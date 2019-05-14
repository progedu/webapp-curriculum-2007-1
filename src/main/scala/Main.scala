object Main {
  val tribs: Stream[Int] = 0 #:: 0 #:: 1 #:: tribs.zip(tribs.tail).zip(tribs.tail.tail).map {case ((x, y), z) => x + y + z}
}
