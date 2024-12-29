
// Question: https://aperiodic.net/pip/scala/s-99/#p07

def flatten(list: List[Any]): List[Any] =
  (list foldLeft List[Any]())((acc, ele) => ele match {
    case Nil => acc
    case x :: xs => acc ++ flatten(x :: xs)
    case x => acc ++ List(x)
  })

flatten(List(List(1, 1), 2, List(3, List(5, 8))))
flatten(List(List(List(1,2,3)), List('a','b','c'), List("monday"), List()))