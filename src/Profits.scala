import scala.collection.mutable.ListBuffer

/**
  * This class analyzes the profits made by selling a particular item.
  * It finds a profit by subtracting an object's cost to manufacture from its sales price.
  * The console then prints out the list of profits
  */

object Profits {
  def main(args: Array[String]) {
    val salesPrices = ( 20 to 5000 by 20 ).toList
    val costPrices = ( 5 to 1250 by 5 ).toList
    val profitList = createProfitList(salesPrices, costPrices)
    println(s"List of profits: $profitList")
  }

  def createProfitList(salesList: List[Int], costList: List[Int]): List[Int]
  = {
    // ListBuffer to add values
    var profits = new ListBuffer[Int]
    var counter: Int = 0
    for (sale: Int <- salesList){
      profits += calculateProfit(salesList(counter), costList(counter))
      counter += 1
    }

    profits.toList
  }

  def calculateProfit(salePrice: Int, cost: Int): Int = { salePrice - cost }
}
