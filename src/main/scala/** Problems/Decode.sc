def decode(list: List[(Int, Any)]): List[Any] = {
  def decodeHelper(acc: List[Any], list: List[(Int, Any)]): List[Any] = list match {
    case Nil => acc.reverse
    case x :: xs => x match {
      case (0, _) => decodeHelper(acc, xs)
      case (n, c) => decodeHelper(c :: acc, (n-1, c) :: xs)
    }
  }
  decodeHelper(Nil, list)
}

decode(List((4, 'a), (1, 'b), (2, 'c), (2, 'a), (1, 'd), (4, 'e)))