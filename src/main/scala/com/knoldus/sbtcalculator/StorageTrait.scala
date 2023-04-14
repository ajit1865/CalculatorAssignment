
package com.knoldus.sbtcalculator

//trait StorageTrait
trait StorageTrait {
  def addElement(element: Int): Boolean

  def removeElement(element: Int): Boolean

  def removeAll(): Boolean

  def checkIfContains(element: Int): Boolean
}

//StorageWrapper class used to add, remove, check containsElement and remove all functionality
class StorageWrapper extends StorageTrait {
  val storage = new Storage

  //adding element to array list
  override def addElement(element: Int): Boolean = {
    storage.addElement(element)
    true
  }

  //removing an element from arraylist
  override def removeElement(element: Int): Boolean = {
    storage.removeElement(element)
    true
  }

  //checking if arraylist contains certain element in it
  override def checkIfContains(element: Int): Boolean = {
    storage.checkIfContains(element)
    true
  }

  //clearing all elements from arraylist
  override def removeAll(): Boolean = {
    storage.removeAll()
    true
  }


}
