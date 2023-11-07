import scala.collection.mutable.ListBuffer

class Student(var name: String, var rollNumber: Int, var marks: Int) {
  override def toString: String = s"Name: $name, Roll Number: $rollNumber, Marks: $marks"
}

object StudentRecordSystem extends App {
  val students: ListBuffer[Student] = ListBuffer()

  // Function to add a new student
  def addStudent(name: String, rollNumber: Int, marks: Int): Unit = {
    val student = new Student(name, rollNumber, marks)
    students += student
    println(s"Student record added: $student")
  }

  // Function to calculate grade based on marks
  def calculateGrade(marks: Int): String = {
    if (marks >= 90) "A"
    else if (marks >= 80) "B"
    else if (marks >= 70) "C"
    else if (marks >= 60) "D"
    else "F"
  }

  // Function to find the average marks of all students
  def averageMarks(): Double = {
    if (students.isEmpty) 0
    else students.map(_.marks).sum.toDouble / students.length
  }

  // Function to display student details
  def displayStudentDetails(): Unit = {
    println("Student Records:")
    students.foreach(println)
  }

  // Adding sample student records
  addStudent("Alice", 101, 85)
  addStudent("Bob", 102, 92)
  addStudent("Charlie", 103, 78)

  // Displaying student details
  displayStudentDetails()

  // Calculating and displaying average marks
  println(s"Average Marks: ${averageMarks()}")

  // Finding student with highest marks
  val highestMarksStudent = students.maxBy(_.marks)
  println(s"Student with Highest Marks: $highestMarksStudent")

  // Finding student with lowest marks
  val lowestMarksStudent = students.minBy(_.marks)
  println(s"Student with Lowest Marks: $lowestMarksStudent")
}
