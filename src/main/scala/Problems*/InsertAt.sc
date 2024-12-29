
// Question: https://aperiodic.net/pip/scala/s-99/#p21

def insertAt(ele: Any, k: Int, list: List[Any]): List[Any] = (k, list) match {
  case (_, Nil) => ele :: Nil
  case (0, _) => ele :: list
  case (k, x :: xs) => x :: insertAt(ele, k - 1, xs)
}

insertAt('new, 1, List('a, 'b, 'c, 'd))
insertAt('new, 10, List('a, 'b, 'c, 'd))