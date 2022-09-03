package exercises


fun main () {

    //student designation
    var female: String = "Ms."
    var male: String = "Mr."

    //student names
    var student1: String = "Apple"
    var student2: String = "Bobby"
    var student3: String = "Catherine"

    //student grade
    var student1Grade: Double = 75.00
    var student2Grade: Double = 85.00
    var student3Grade: Double = 95.00

    var student1Email: String = "apple.student.org"
    var student2Email: String = "bobby.student.org"
    var student3Email: String = "catherine.student.org"


    //student status
    var student1Status: Boolean = student1Grade >= 75
    var student2Status: Boolean = student2Grade >= 75
    var student3Status: Boolean = student3Grade >= 75

    //Message to the Student
    println("Good day, $female $student1! Your current grade for English is $student1Grade .")
    println("Good day, $male $student2! Your current grade for English is $student2Grade .")
    println("Good day, $female $student3! Your current grade for English is $student3Grade .")

}