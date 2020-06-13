object Main extends App {
  val tribs: Stream[Int] = {
    0 #:: 0 #:: 1 #:: tribs.zip(tribs.tail).zip(tribs.tail.tail).map { n =>
      n._1._1 + n._1._2 + n._2
    }
  }

  // Scala-2.13系ではStream[T]はDeprecatedなので、代わりにLazyVal[T]を使う
  // 以下、Scala-2.13系向け実装
  /*
  val tribs_213: LazyList[Int] = 0 #:: 0 #:: 1 #:: tribs_213
    .zip(tribs_213.tail)
    .zip(tribs_213.tail.tail)
    .map { n =>
      n._1._1 + n._1._2 + n._2
    }
 */
}
