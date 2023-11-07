object Main extends App {
  // Function to update elements in a List
  def updateList(list: List[Int], index: Int, newValue: Int): List[Int] = {
    if (index >= 0 && index < list.length) {
      // Using pattern matching to split the list at the specified index
      val (prefix, suffix) = list.splitAt(index)
      prefix ::: (newValue :: suffix.tail) // Constructing a new list with the updated element
    } else {
      // If the index is out of bounds, return the original list
      list
    }
  }

  // Original List
  val myList: List[Int] = List(1, 2, 3, 4, 5)
  println("Original List: " + myList)

  // Updating element at index 2 to 10
  val updatedList = updateList(myList, 2, 10)
  println("Updated List: " + updatedList)
}
