def split(splitLenght: Int, list: List[Any]): (List[Any], List[Any]) = {
  def splitter(acc: List[Any], hIndex: Int, list: List[Any]): (List[Any], List[Any]) = (hIndex, list) match {
    case (_, Nil) => (acc, Nil)
    case (1, x :: xs) => ((x :: acc).reverse, xs)
    case (i, x :: xs) => splitter(x :: acc, i - 1, xs)
  }
  splitter(List[Any](), splitLenght, list)
}

split(3, List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k))