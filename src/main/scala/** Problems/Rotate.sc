def rotate(n: Int, list: List[Any]): List[Any] = {
  def rotator(acc: List[Any], n: Int, list: List[Any]): List[Any] = n match {
    case 0 => list ++ acc.reverse
    case _ => rotator(list.head :: acc, n - 1, list.tail)
  }
  rotator(List[Any](), n, list)
}

rotate(3, List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k))