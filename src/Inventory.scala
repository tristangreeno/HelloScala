/**
  * The inventory of all the cars owned by a dealership.
  * Each car has a name, the price of buying each car from the manufacturer, and the sales price of the car.
  */
class Inventory(name: String, wholesalePrice: Int, resalePrice: Int){
  override def toString: String = s"$name, which sells for $resalePrice after paying a wholesale price of $wholesalePrice"
}

object Inventory {
  def main(args: Array[String]) {
    val carOne = new Inventory("First Car", 14599, 21999)
    val carTwo = new Inventory("Second Car", 13233, 14092)
    val carThree = new Inventory("Third Car", 10999, 12999)

    println(s"Cars available in the inventory:\n${carOne.toString}\n${carTwo.toString}\n${carThree.toString}")
  }

}
