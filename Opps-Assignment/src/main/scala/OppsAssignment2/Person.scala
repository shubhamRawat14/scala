package OppsAssignment2

class Person(var name:String,var age:Int) extends Ordered[Person] {
  override def compare(that: Person): Int = {
    this.name compare that.name match {
      case 0 =>  if(this.age.equals(that.age))
        println("True\nName & age both are same")
      else
        println("False\nName are same but ages are not equal")
        0

      case _ =>  if(this.name.length.equals(that.name.length) && this.age.equals(that.age))
        println("True\nName is different, but age is same")
      else println("false\n")
        1

    }
  }
}
object Person extends  App{
  // Name and age is same
  println("\nWhen name and age is same")
  var personOne = new Person("Aman",24)
  var personTwo = new Person("Aman",24)
  personOne compare personTwo
  println("___________________________________________")

  // Name same age  but different
  println("\nWhen name is same but age different")
  personOne = new Person("Aman",28)
  personTwo = new Person("Aman",24)
  personOne compare personTwo
  println("___________________________________________")

  // Name is different age is same
  println("\nWhen name is different but age same")
  personOne = new Person("Arav",24)
  personTwo = new Person("Aman",24)
  personOne compare personTwo
  println("___________________________________________")

  // Name is different age is same
  println("\nWhen name length is different but age same")
  personOne = new Person("Arav",24)
  personTwo = new Person("Akash",24)
  personOne compare personTwo
  println("___________________________________________")
}