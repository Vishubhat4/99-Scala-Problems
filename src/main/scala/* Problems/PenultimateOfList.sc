def penultimate[A](list: List[A]): A = list match {
  case Nil => throw new NoSuchElementException("penultimate(Nil)")
  case _ :: Nil => throw new NoSuchElementException("penultimate(List(x))")
  case x :: _ :: Nil => x
  case _ :: xs => penultimate(xs)
}

penultimate(List(1, 1, 2, 3, 5, 8))
penultimate(List(10))
