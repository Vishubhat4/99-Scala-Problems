def pack(list: List[Any]): List[List[Any]] = {
  def packHelper(prev: Any, acc: List[Any], list: List[Any]): List[List[Any]] = (prev, list) match {
    case (_, Nil) => List(acc)
    case (None, x :: xs) => packHelper(x, List(x), xs)
    case (p, x :: xs) => if (p.equals(x)) packHelper(x, x :: acc, xs) else acc :: packHelper(x, List(x), xs)
  }
  packHelper(None, List[Any](), list)
}

pack(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'd, 'e, 'e, 'e, 'e))