
// Question: https://aperiodic.net/pip/scala/s-99/#p13

def encodeDirect(list: List[Any]): List[(Int, Any)] = {
  def encodeDirectHelper(acc: List[(Int, Any)], list: List[Any]): List[(Int, Any)] = list match {
    case Nil => acc.reverse
    case x :: xs => acc match {
      case Nil => encodeDirectHelper(List((1, x)), xs)
      case a :: as => if (x == a._2) encodeDirectHelper((a._1 + 1, x) :: as, xs) else encodeDirectHelper((1, x) :: acc, xs)
    }
  }
  encodeDirectHelper(Nil, list)
}

encodeDirect(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e))