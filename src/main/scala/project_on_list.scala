object list1{
  def main(args: Array[String]): Unit = {
    // Create an empty list of integers
    var myList: List[Int] = List()

    // Add elements to the list using the cons operator (::)
    myList = 1 :: myList // Adding 1 to the list
    myList = 2 :: myList // Adding 2 to the list
    myList = 3 :: myList // Adding 3 to the list

    // Print the list
    println("List elements: " + myList)

    // Output: List elements: List(3, 2, 1)



    //ACCESSING THE ELEMENTS ON THE LIST



    // Creating a list of integers
    val myList1: List[Int] = List(1, 2, 3, 4, 5)

    // Accessing elements in the list
    val firstElement: Int = myList1(0) // Accessing the first element (index 0)
    val thirdElement: Int = myList1(2) // Accessing the third element (index 2)

    println(s"First element: $firstElement") // Output: First element: 1
    println(s"Third element: $thirdElement") // Output: Third element: 3


    // UPDATING THE ELEMENTS ON THE LIST



  }
}