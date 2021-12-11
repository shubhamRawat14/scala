package OppsAssignment1
import scala.collection.mutable.ListBuffer

class SquareQueue(list1:  ListBuffer[Int]) extends Queue {
  for( i <- list1.indices) {   // Iterating the list
    list1.update(i, list1(i) * list1(i))
  }
}
class DoubleQueue(list2:ListBuffer[Int]) extends Queue {
  for( i <- list2.indices){
    list2.update(i,2*list2(i))
  }

}
