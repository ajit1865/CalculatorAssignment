
package com.knoldus.sbtcalculator

//trait StorageTrait
trait StorageTrait {
  def addElement(element: Int): Unit

  def removeElement(element: Int): Unit

  def removeAll(): Unit

  def checkIfContains(elemnet: Int): Boolean
}

//StorageWrapper class used to add, remove, check containsElement and remove all functionality
class StorageWrapper extends StorageTrait {
  val storage = new Storage

  //adding element to array list
  override def addElement(element: Int): Unit = {
    storage.addElement(element)
  }

  //removing an element from arraylist
  override def removeElement(element: Int): Unit = {
    storage.removeElement(element)
  }

  //checking if arraylist contains certain element in it
  override def checkIfContains(element: Int): Boolean = {
    storage.checkIfContains(element)
  }

  //clearing all elements from arraylist
  override def removeAll(): Unit = {
    storage.removeAll()
  }


}
