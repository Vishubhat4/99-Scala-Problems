def reverse[A](list: List[A]): List[A] =
  (list foldLeft List[A]())((rev, ele) => ele :: rev)

def isPalindrome[A](list: List[A]): Boolean =
  list zip reverse(list) forall (pair => pair._1 == pair._2)

isPalindrome(List(1, 2, 3, 2, 1))
isPalindrome(List(0, 1, 2, 2, 1))
