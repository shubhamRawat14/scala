package OppsAssignment1

import scala.collection.mutable.ListBuffer
object Driver extends App{

  val list = ListBuffer(9,3,4,6,2,11,32)
  println("Originally the Queue is: ")
  for( i <- list.indices) print(list(i)+" ")

  var doubledList = new DoubleQueue(list)  //Doubled the elements in the queue.
  println("\nAfter doubling the elements in the Queue: ")
  for( i <- list.indices) print(list(i)+" ")

  var squareQueue = new SquareQueue(list)   //Squaring the elements in queue.
  println("\nAfter squaring the elements in the Queue: ")
  for( i <- list.indices) print(list(i)+" ")

  squareQueue.dequeue(list)
  println("\nAfter dequeue a element in Queue: ")
  for( i <- list.indices) print(list(i)+" ")
  squareQueue.enqueue(list)
  println("\nAfter a element is enqueued: ")
  for( i <- list.indices) print(list(i)+" ")
}