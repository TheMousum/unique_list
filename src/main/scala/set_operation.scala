object SetOperations extends App {
  // Creating two sets of strings
  val setA: Set[String] = Set("apple", "orange", "banana", "grape")
  val setB: Set[String] = Set("orange", "kiwi", "mango", "banana")

  // Union of sets A and B
  val unionSet = setA.union(setB)
  println("Union: " + unionSet.mkString(", "))

  // Intersection of sets A and B
  val intersectionSet = setA.intersect(setB)
  println("Intersection: " + intersectionSet.mkString(", "))

  // Difference of setA - setB
  val differenceSetA = setA.diff(setB)
  println("Difference (A - B): " + differenceSetA.mkString(", "))

  // Difference of setB - setA
  val differenceSetB = setB.diff(setA)
  println("Difference (B - A): " + differenceSetB.mkString(", "))

  // Checking membership in setA
  val fruitToCheck = "apple"
  println(s"Is '$fruitToCheck' in setA? " + setA.contains(fruitToCheck))
}
