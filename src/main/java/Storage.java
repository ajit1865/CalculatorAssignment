
package com.knoldus.sbtcalculator;

import java.util.ArrayList;
import java.util.List;

public class Storage {
    public List<Integer> elements = new ArrayList<>();

    /* Add a element to arraylist. */
    public void addElement(int element) {
        elements.add(element);
    }

    /* Removes an element from the storage. */
    public void removeElement(int element) {
        elements.remove(element);
    }

    /* Removes all elements from the storage. */

    public void removeAll() {
        elements.clear();
    }

    /* checking if list contains certain element. */
    public boolean checkIfContains(int element) {
        return elements.contains(element);
    }
}
