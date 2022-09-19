package DataStructures;

import Exceptions.*;
import ADTs.*;

/**
 * An interface for an ordered (NOT SORTED) List
 * Elements stay in the order they are put in to the list
 * For use in ITCS 2214 Data Structures & Algorithms
 * UNC Charlotte, 2016
 * 
 * @author clatulip
 */
public class ArrayList<T extends Comparable<T>> implements ListADT<T> {
  int size;
  int capacity;
  T[] buffer;

  /**
   * Constructor for the ArrayList class
   * 
   * @param initialCapacity the initial capacity of the list
   */
  public ArrayList(int initialCapacity) {
    // TODO: Implement this method
  }

  /**
   * Constructor for the ArrayList class
   * 
   * @param initialCapacity the initial capacity of the list
   */
  public ArrayList() {
    // TODO: Implement this method
  }

  /**
   * Returns true if the collection contains no elements
   * 
   * @return true if the collection is empty
   */
  public boolean isEmpty() {
    // TODO Auto-generated method stub
    return false;
  }

  /**
   * Returns the number of elements in the collection
   * 
   * @return the number of elements as an int
   */
  public int size() {
    // TODO Auto-generated method stub
    return 0;
  }

  /**
   * Adds the specified element to the list at the front
   * 
   * @param element: the element to be added
   * 
   */
  public void addFirst(T element) {
    // TODO Auto-generated method stub
    // It might be easier to implement this after addLast()

  }

  /**
   * Adds the specified element to the end of the list
   * 
   * @param element: the element to be added
   */
  public void addLast(T element) {
    // TODO Auto-generated method stub

  }

  /**
   * Adds the specified element to the list after the existing element
   * 
   * @param existing: the element that is in the list already
   * @param element:  the element to be added
   * @throws ElementNotFoundException if existing isn't in the list
   */
  public void addAfter(T existing, T element) throws ElementNotFoundException, EmptyCollectionException {
    // TODO Auto-generated method stub

  }

  /**
   * Removes and returns the specified element
   * 
   * @return the element specified
   * @throws EmptyCollectionException
   * @throws ElementNotFoundException
   */
  public T remove(T element) throws EmptyCollectionException, ElementNotFoundException {
    // TODO Auto-generated method stub
    return null;
  }

  /**
   * Removes and returns the first element
   * 
   * @return the first element in the list
   * @throws EmptyCollectionException
   */
  public T removeFirst() throws EmptyCollectionException {
    // TODO Auto-generated method stub
    return null;
  }

  /**
   * Removes and returns the last element
   * 
   * @return the last element in the list
   * @throws EmptyCollectionException
   */
  public T removeLast() throws EmptyCollectionException {
    // TODO Auto-generated method stub
    return null;
  }

  /**
   * Returns (without removing) the first element in the list
   * 
   * @return element at the beginning of the list
   * @throws EmptyCollectionException
   */
  public T first() throws EmptyCollectionException {
    // TODO Auto-generated method stub
    return null;
  }

  /**
   * Returns (without removing) the last element in the list
   * 
   * @return element at the end of the list
   * @throws EmptyCollectionException
   */
  public T last() throws EmptyCollectionException {
    // TODO Auto-generated method stub
    return null;
  }

  /**
   * Return whether the list contains the given element.
   * 
   * @param element
   * @return
   * @throws EmptyCollectionException
   */
  public boolean contains(T element) throws EmptyCollectionException {
    // TODO Auto-generated method stub
    return false;
  }

  /**
   * Return the element at the given index of a list.
   * 
   * @param element
   * @return
   * @throws EmptyCollectionException
   */
  public T get(int index) throws EmptyCollectionException, InvalidArgumentException {
    // TODO Auto-generated method stub
    return null;
  }

  /**
   * Set the at the given index of a list.
   * 
   * @param element
   * @return
   * @throws EmptyCollectionException
   */
  public void set(int index, T element) throws EmptyCollectionException, InvalidArgumentException {
    // TODO Auto-generated method stub

  }

  @Override
  public int indexOf(T element) {
    // TODO Auto-generated method stub
    return 0;
  }
}