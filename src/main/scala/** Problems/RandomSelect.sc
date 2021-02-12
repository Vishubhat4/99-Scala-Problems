import scala.util.Random

def removeAt(k: Int, list: List[Any]): (List[Any], Any) = {
  def remover(acc: List[Any], k: Int, list: List[Any]): (List[Any], Any) = (k, list) match {
    case (_, Nil) => (acc.reverse, None)
    case (0, x :: xs) => (acc.reverse ++ xs, x)
    case (_, x :: xs) => remover(x :: acc, k - 1, xs)
  }
  remover(List[Any](), k, list)
}

def randomSelect(k: Int, list: List[Any]): List[Any] = (k, list) match {
  case (_, Nil) => Nil
  case (0, _) => Nil
  case (_, _) => {
    val randomIndex = Random.nextInt(list.length)
    val (remList, randomEle) = removeAt(randomIndex, list)
    randomEle :: randomSelect(k - 1, remList)
  }
}

randomSelect(3, List('a, 'b, 'c, 'd, 'f, 'g, 'h))
randomSelect(3, List('a, 'b, 'c, 'd, 'f, 'g, 'h))
randomSelect(3, List('a, 'b, 'c, 'd, 'f, 'g, 'h))
randomSelect(3, List('a, 'b, 'c, 'd, 'f, 'g, 'h))