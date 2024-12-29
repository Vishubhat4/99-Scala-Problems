
// Question: https://aperiodic.net/pip/scala/s-99/#p25

import scala.util.Random

def removeAt[A](k: Int, list: List[A]): (List[A], A) = {
  def remover(acc: List[A], k: Int, list: List[A]): (List[A], A) = (k, list) match {
    case (_, Nil) => throw new IndexOutOfBoundsException
    case (0, x :: xs) => (acc.reverse ++ xs, x)
    case (_, x :: xs) => remover(x :: acc, k - 1, xs)
  }
  remover(List[A](), k, list)
}

def randomSelect[A](k: Int, list: List[A]): List[A] = (k, list) match {
  case (_, Nil) => Nil
  case (0, _) => Nil
  case (_, _) =>
    val randomIndex = Random.nextInt(list.length)
    val (remList, randomEle) = removeAt(randomIndex, list)
    randomEle :: randomSelect(k - 1, remList)
}

def randomPermute[A](list: List[A]): List[A] = randomSelect(list.length, list)

randomPermute(List('a, 'b, 'c, 'd, 'e, 'f))