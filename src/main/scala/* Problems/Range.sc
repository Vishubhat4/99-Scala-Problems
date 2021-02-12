def range(from: Int, to: Int): List[Int] =
  if (from == to) to :: Nil else from :: range(from + 1, to)

range(4, 9)