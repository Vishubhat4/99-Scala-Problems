import java.util.NoSuchElementException

def last[A](list: List[A]): A = list match {
  case Nil => throw new NoSuchElementException("last(Nil)")
  case x :: Nil => x
  case _ :: xs => last(xs)
}

last(List(1, 1, 2, 3, 5, 8))
last(List(10))
last(Nil)
