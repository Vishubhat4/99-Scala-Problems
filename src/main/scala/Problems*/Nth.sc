
// Question: https://aperiodic.net/pip/scala/s-99/#p03

def nth[A](n: Int, list: List[A]): A = n match {
  case 0 => if (list != Nil) list.head else throw new IndexOutOfBoundsException
  case _ => nth(n-1, list.tail)
}

nth(2, List(1, 1, 2, 3, 5, 8))
nth(6, List(1, 1, 2, 3, 5, 8))
