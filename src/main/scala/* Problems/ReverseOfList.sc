def reverse[A](list: List[A]): List[A] =
  (list foldLeft List[A]())((rev, ele) => ele :: rev)

reverse(List(1, 1, 2, 3, 5, 8))
reverse(Nil)
