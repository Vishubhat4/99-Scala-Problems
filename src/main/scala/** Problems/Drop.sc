
// Question: https://aperiodic.net/pip/scala/s-99/#p16

def drop(n: Int, list: List[Any]): List[Any] = {
  def dropNth(hIndex: Int, list: List[Any])(implicit n: Int): List[Any] = (hIndex, list) match {
    case (_, Nil) => Nil
    case (1, _ :: xs) => dropNth(n, xs)
    case (i, x :: xs) => x :: dropNth(i - 1, xs)
  }
  dropNth(n, list)(n)
}

drop(3, List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k))