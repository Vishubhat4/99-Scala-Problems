def compress(list: List[Any]): List[Any] = {
  def compressHelper(prev: Any, list: List[Any]): List[Any] = (prev, list) match {
    case (_, Nil) => Nil
    case (None, x :: xs) => x :: compressHelper(x, xs)
    case (p, x :: xs) => if (p == x) compressHelper(p, xs) else x :: compressHelper(x, xs)
  }
  compressHelper(None, list)
}

compress(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e))
