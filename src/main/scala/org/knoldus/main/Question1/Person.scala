package org.knoldus.main.Question1

class Person(val name : String, val age : Int) extends Ordered[Person] {
  override def compare(that: Person): Int = {
    if(this.name == that.name)
      this.age - that.age
    else
      this.name.length - that.name.length
  }
}
object Main extends App {
  val personOne = new Person("Vish", 22)
  val personTwo = new Person("Vishal", 20)
  val person3 = new Person("Test", 24)
  val person4 = new Person("Test", 25)
  def compareObject(personOne: Person,personTwo: Person): Unit = {
    if(personOne.compare(personTwo) > 0)
        println(true)
    else
     println(false)
  }
  compareObject(personOne,personTwo)
  compareObject(person3,person4)
}
