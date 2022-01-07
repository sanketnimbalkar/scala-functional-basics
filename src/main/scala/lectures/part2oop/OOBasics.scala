package scalaoops

object OOBasics extends App {
  val person = new Person("Sanket", 25) //Class instantiation
  println(person.x)
  person.greet("Daniel")

}

/**
 * Constructor
 * Class parameters are NOT FIELDS ex age in above case
 * To convert into fields add val or var
 */

class Person(name: String, val age: Int) {
  //body
  val x = 2

  println(1 + 3) // At every instantiation the whole block is evaluated.

  /**
   * method
   * $name refers to method parameter
   */

  def greet(name: String): Unit = println(s"${this.name} says: Hi, $name")

  /**
   * $name refers to class parameter. This is also method overloading.
   */
  def greet(): Unit = println(s"Hi, I am $name")

  /**
   * multiple constructors or overloading constructors.
   */

  def this(name: String) = this(name, 0)

  /**
   * auxillary constructor calls primary constructors - Used only for default parameters.
   * We do not need this as we can supply default parameter to primary constructor.
   */
  def this() = this("Sanket")

  /**
   * only imlementation the auxillary constructor can have
   */

}
