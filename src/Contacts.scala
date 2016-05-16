import scala.collection.mutable.ListBuffer

/**
  * Holds a list of contacts for reference
  * Each contact has the following information: name, number, email
  */
class Contacts(name: String, number: String, email: String){
  override def toString: String = s"$name: $number // $email"
}

object Contacts {
  var contactList = new ListBuffer[Contacts]
  def main(args: Array[String]) {
    addContact("First Guy", "6154445555", "guy@email.com")
    addContact("Second Girl", "6135563424", "girl@email.com")
    for (c: Contacts <- contactList) {
      println(c.toString)
    }
  }

  def addContact(name: String, number: String, email: String) = {
    val contact: Contacts = new Contacts(name, number, email)
    contactList += contact
  }
}
