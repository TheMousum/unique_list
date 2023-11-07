object AccessingListElements {
  def main(args: Array[String]): Unit = {
    val numbers = List(1, 2, 3, 4, 5)

    // Accessing elements using index
    val firstElement = numbers(0) // Accessing the first element (index 0)
    val secondElement = numbers(1) // Accessing the second element (index 1)

    println("First Element: " + firstElement) // Output: 1
    println("Second Element: " + secondElement) // Output: 2

    // Iterating through the list using indices
    for (i <- 0 until numbers.length) {
      println(s"Element at index $i: " + numbers(i))
    }
  }
}
