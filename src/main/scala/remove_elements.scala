object RemoveElements {
  def main(args: Array[String]): Unit = {
    val numbers = List(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)

    // Remove even numbers from the list
    val filteredList = numbers.filterNot(num => num % 2 == 0)
    println("List after removing even numbers: " + filteredList)
  }
}
