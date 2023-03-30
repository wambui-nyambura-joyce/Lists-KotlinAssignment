fun main() {
    val strings = listOf("hey", "Nyambura", "how", "are", "you", "doing", "today", "?", "I'm", "fine")
    val evenStrings = stringsAtEvenIndices(strings)
    println(evenStrings)


    val heights = listOf(1.50, 1.65, 1.72, 1.55, 1.80)
    val (averageHeight, totalHeight) = heightStats(heights)
    println("Average height: $averageHeight meters")
    println("Total height: $totalHeight meters")


    val people = listOf(
        Person("Nyambura", 21, 1.56, 75.5),
        Person("Mercy", 14, 1.53, 54.0),
        Person("Chad", 18, 1.60, 50.0),
        Person("Job", 47, 1.56, 90.5),
        Person("Eve", 30, 1.72, 65.0)
    )
    val sortedPeople = sortedPeopleByDescendingAge(people)
    println(sortedPeople)


    val peoplee = mutableListOf(
        Person("Nyambura", 21, 1.56, 75.5),
        Person("Mercy", 14, 1.53, 54.0),
        Person("Chad", 18, 1.60, 50.0),
        Person("Job", 47, 1.56, 90.5),
        Person("Eve", 30, 1.72, 65.0)
    )
    addTwoPeopleToList(peoplee)
    println(peoplee)


    val cars = listOf(
        Car("ABC123", 12000.0),
        Car("DEF456", 15000.0),
        Car("GHI789", 8000.0),
        Car("JKL012", 10000.0)
    )
    val averageMileage = calculateAverageMileage(cars)
    println("The average mileage is: $averageMileage")

}
//Given a list of 10 strings, write a function that returns a list of the strings
//at even indices i.e index 2,4,6 etc
fun stringsAtEvenIndices(strings: List<String>): List<String> {
    return strings.filterIndexed { index, _ -> index % 2 == 0 }

}
//Given a list of people’s heights in metres. Write a function that returns
//the average height and the total height
fun heightStats(heights: List<Double>): Pair<Double, Double> {
    val totalHeight = heights.sum()
    val averageHeight = heights.average()
    return Pair(averageHeight, totalHeight)
}
//Given a list of Person objects, each with the attributes, name, age,
//height and weight. Sort the list in order of descending age
data class Person(var name: String, var age: Int, var height: Double, var weight: Double)

fun sortedPeopleByDescendingAge(people: List<Person>): List<Person> {
    return people.sortedByDescending { it.age }
}
//Given a list similar to the one above, write a function in which you will
//create 2 more people objects and add them to the list at one go.
data class Persons(var name: String, var age: Int, var height: Double, var weight: Double)

fun addTwoPeopleToList(people: MutableList<Person>) {
    val newPerson1 = Person("Silas", 23, 1.65, 70.0)
    val newPerson2 = Person("Britney", 10, 1.20, 30.5)
    people.addAll(listOf(newPerson1, newPerson2))
}
//Write a function that takes in a list of Car objects each with a
//registration and mileage attribute and returns the average mileage of
//all the vehicles in the list.
data class Car(val registration: String, val mileage: Double)

fun calculateAverageMileage(cars: List<Car>): Double {
    var totalMileage = 0.0
    for (car in cars) {
        totalMileage += car.mileage
    }
    return totalMileage / cars.size
}