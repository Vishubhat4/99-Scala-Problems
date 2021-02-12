def slice(from: Int, to: Int, list: List[Any]): List[Any] = (from, to) match {
  case (0, 0) => Nil
  case (0, t) => list.head :: slice(0, t - 1, list.tail)
  case (f, t) => slice(f - 1, t - 1, list.tail)
}

slice(3, 7, List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k))