
package com.knoldus.sbtcalculator

object Driver extends App {

  //creating instance of Calculator class to invoke methods of Calculator class
  val calculator = new Calculator()

  val firstNumber = 6
  val secondNumber = 3
  println(s"Add $firstNumber + $secondNumber : " + calculator.addTwoNumbers(firstNumber, secondNumber))
  println(s"Sub $firstNumber - $secondNumber :  " + calculator.subtractionOfTwoNumbers(firstNumber, secondNumber))
  println(s"Mul $firstNumber * $secondNumber : " + calculator.multiplicationOfTwoNumbers(firstNumber, secondNumber))
  println(s"Div $firstNumber / $secondNumber : " + calculator.divisioOfTwoNumbers(firstNumber, secondNumber))

  val storageWrapper = new StorageWrapper

  storageWrapper.addElement(12)
  storageWrapper.addElement(15)
  storageWrapper.addElement(17)
  storageWrapper.addElement(25)
  storageWrapper.addElement(11)
  println("Operations performed on list")
  println(s"checking if list contains 12 : " + storageWrapper.checkIfContains(12))
  println(storageWrapper.storage.elements)
  println("removing element provided by index from list " + storageWrapper.removeElement(0))
  println("After removing index new list is : " + storageWrapper.storage.elements)
  println("Removing all elements from list " + storageWrapper.removeAll())
  println(storageWrapper.storage.elements)
}