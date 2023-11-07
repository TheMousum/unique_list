object MappingAndFiltering {
  def main(args: Array[String]): Unit = {
    val numbers = List(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)

    // Using map to square each element of the list
    val squaredNumbers = numbers.map(num => num * num)
    println("Squared Numbers: " + squaredNumbers)

    // Using filter to keep only numbers greater than 5
    val numbersGreaterThanFive = numbers.filter(num => num > 5)
    println("Numbers Greater Than 5: " + numbersGreaterThanFive)

    // Using map and filter together to square even numbers
    val squaredEvenNumbers = numbers.filter(num => num % 2 == 0).map(num => num * num)
    println("Squared Even Numbers: " + squaredEvenNumbers)
  }
}
