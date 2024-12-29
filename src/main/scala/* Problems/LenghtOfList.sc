
// Question: https://aperiodic.net/pip/scala/s-99/#p04

def length[A](list: List[A]): Int =
  (list foldLeft 0)((len, _) => len + 1)

length(List(1, 1, 2, 3, 5, 8))
length(Nil)