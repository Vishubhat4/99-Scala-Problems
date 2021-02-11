def duplicate(list: List[Any]): List[Any] =
  (list foldLeft List[Any]())((acc, ele) => ele :: ele :: acc).reverse

duplicate(List('a, 'b, 'c, 'c, 'd))