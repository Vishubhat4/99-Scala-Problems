
// Question: https://aperiodic.net/pip/scala/s-99/#p20

def removeAt[A](k: Int, list: List[A]): (List[A], A) = {
  def remover(acc: List[A], k: Int, list: List[A]): (List[A], A) = (k, list) match {
    case (_, Nil) => throw new IndexOutOfBoundsException
    case (0, x :: xs) => (acc.reverse ++ xs, x)
    case (_, x :: xs) => remover(x :: acc, k - 1, xs)
  }
  remover(List[A](), k, list)
}

removeAt(1, List('a, 'b, 'c, 'd))
removeAt(3, List('a, 'b, 'c, 'd))
removeAt(5, List('a, 'b, 'c, 'd))
