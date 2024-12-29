
// Question: https://aperiodic.net/pip/scala/s-99/#p15

def duplicateN(n: Int, list: List[Any]): List[Any] = {
  def duplicator(n: Int, ele: Any, acc: List[Any]): List[Any] = n match {
    case 0 => acc
    case n => duplicator(n - 1, ele, ele :: acc)
  }
  (list foldRight List[Any]())((ele, acc) => duplicator(n, ele, acc))
}

duplicateN(3, List('a, 'b, 'c, 'c, 'd))
duplicateN(1, List('a, 'b, 'c, 'c, 'd))