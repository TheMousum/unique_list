object ListManipulation extends App {
  // Sample list of integers
  val numbers = List(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)

  // Filtering even numbers
  val evenNumbers = numbers.filter(num => num % 2 == 0)
  println("Even numbers: " + evenNumbers.mkString(", "))

  // Mapping: doubling each number
  val doubledNumbers = numbers.map(num => num * 2)
  println("Doubled numbers: " + doubledNumbers.mkString(", "))

  // Reducing: sum of all numbers
  val sum = numbers.reduce((x, y) => x + y)
  println("Sum of numbers: " + sum)

  // Sorting in descending order
  val sortedNumbers = numbers.sortWith(_ > _)
  println("Sorted numbers in descending order: " + sortedNumbers.mkString(", "))
}
