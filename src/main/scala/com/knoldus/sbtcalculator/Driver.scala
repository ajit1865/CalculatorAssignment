
package com.knoldus.sbtcalculator

import com.typesafe.scalalogging.Logger

object Driver extends App {

  //creating instance of Calculator class to invoke methods of Calculator class
  private val calculator = new Calculator

  private val logger = Logger(getClass.getName)
  private val firstNumber = 6
  private val secondNumber = 0
  try {
    val resultOfSum = calculator.addTwoNumbers(firstNumber, secondNumber)
    logger.info(s"Sum is : $resultOfSum")
  }
  catch {
    case e: ArithmeticException => logger.warn("Exception " + e.getMessage)
  }

  try {
    val resultDivision = calculator.divisioOfTwoNumbers(firstNumber, secondNumber)
    logger.info(s"Division is : $resultDivision")
  }
  catch {
    case e: ArithmeticException => logger.warn("Exception: " + e.getMessage)
  }

  try{
    val resultOfProduct = calculator.multiplicationOfTwoNumbers(firstNumber, secondNumber)
    logger.info(s"Product is : $resultOfProduct")
  }
  catch {
    case e: ArithmeticException => logger.warn("Exception : " + e.getMessage)
  }
  private val storageWrapper = new StorageWrapper

  storageWrapper.addElement(12)
  storageWrapper.addElement(15)
  storageWrapper.addElement(17)
  storageWrapper.addElement(25)
  storageWrapper.addElement(11)
  private val elementToCheck = 12
  logger.info("Operations performed on list")
  logger.info(s"checking if list contains 12 : " + storageWrapper.checkIfContains(elementToCheck))
  logger.info("removing element provided by index from list " + storageWrapper.removeElement(0))
  logger.info("After removing index new list is : " + storageWrapper.storage.elements)
  logger.info("Removing all elements from list " + storageWrapper.removeAll())
}