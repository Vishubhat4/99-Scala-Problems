def removeAt(k: Int, list: List[Any]): (List[Any], Any) = {
  def remover(acc: List[Any], k: Int, list: List[Any]): (List[Any], Any) = (k, list) match {
    case (_, Nil) => (acc.reverse, None)
    case (0, x :: xs) => (acc.reverse ++ xs, x)
    case (_, x :: xs) => remover(x :: acc, k - 1, xs)
  }
  remover(List[Any](), k, list)
}

removeAt(1, List('a, 'b, 'c, 'd))
removeAt(3, List('a, 'b, 'c, 'd))
removeAt(5, List('a, 'b, 'c, 'd))
