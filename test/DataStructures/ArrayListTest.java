package DataStructures;

import Exceptions.*;
import ADTs.ListADT;

import org.junit.Test;
import static org.junit.Assert.*;

public class ArrayListTest {

  @Test
  public void testArrayList() {
    ListADT<Integer> list = new ArrayList<Integer>(10);
    assertEquals(0, list.size());

    list = new ArrayList<Integer>();
    assertEquals(0, list.size());
  }

  @Test
  public void testIsEmpty() {
    ListADT<Integer> list = new ArrayList<Integer>(10);
    assertTrue(list.isEmpty());
  }

  @Test
  public void testSize() {
    ListADT<Integer> list = new ArrayList<Integer>(10);
    assertEquals(0, list.size());

    list.addLast(1);
    assertEquals(1, list.size());
    list.addLast(2);
    assertEquals(2, list.size());
    try {
      list.removeFirst();
      assertEquals(1, list.size());
      list.removeLast();
      assertEquals(0, list.size());
    } catch (EmptyCollectionException e) {
      fail("EmptyCollectionException should not be thrown here.");
    }
  }

  @Test
  public void testAddFirst() {
    ListADT<Integer> list = new ArrayList<Integer>(10);

    list.addFirst(1);
    assertEquals(1, list.size());
    try {
      assertEquals(1, list.first().intValue());
    } catch (Exception e) {
      fail("Exception should not be thrown here.");
    }

    list.addFirst(2);
    assertEquals(2, list.size());
    try {
      assertEquals(2, list.first().intValue());
    } catch (Exception e) {
      fail("Exception should not be thrown here.");
    }
  }

  @Test
  public void testAddLast() {
    ListADT<Integer> list = new ArrayList<Integer>(10);

    list.addLast(1);
    assertEquals(1, list.size());
    try {
      assertEquals(1, list.last().intValue());
    } catch (Exception e) {
      fail("Exception should not be thrown here.");
    }

    list.addLast(2);
    assertEquals(2, list.size());
    try {
      assertEquals(2, list.last().intValue());
    } catch (Exception e) {
      fail("Exception should not be thrown here.");
    }
  }

  @Test
  public void testAddAfter() {
    ListADT<Integer> list = new ArrayList<Integer>(10);

    list.addLast(1);
    list.addLast(2);
    list.addLast(3);

    try {
      list.addAfter(1, 4);
      assertEquals(list.size(), 4);
      assertEquals(4, list.get(1).intValue());
    } catch (Exception e) {
      fail("Exception should not be thrown here.");
    }

    try {
      list.addAfter(2, 5);
      assertEquals(list.size(), 5);

      assertEquals(5, list.get(3).intValue());
    } catch (Exception e) {
      fail("Exception should not be thrown here.");
    }

    try {
      list.addAfter(4, 6);
    } catch (Exception e) {
      assertTrue("ElementNotFoundException should be thrown here.",
          e instanceof ElementNotFoundException);
    }

    try {
      (new ArrayList<Integer>(10)).addAfter(1, 4);
    } catch (Exception e) {
      assertTrue("EmptyCollectionException should be thrown here.",
          e instanceof EmptyCollectionException);
    }
  }

  @Test
  public void testRemove() {
    ListADT<Integer> list = new ArrayList<Integer>(10);

    list.addLast(1);
    list.addLast(2);
    list.addLast(3);

    try {
      assertEquals(3, list.size());
      list.remove(1);
      assertEquals(2, list.size());
      assertFalse(list.contains(1));
    } catch (Exception e) {
      fail("Exception should not be thrown here.");
    }

    try {
      assertEquals(2, list.size());
      list.remove(3);
      assertEquals(1, list.size());
      assertFalse(list.contains(3));
    } catch (Exception e) {
      fail("Exception should not be thrown here.");
    }

    try {
      list.remove(10);
    } catch (Exception e) {
      assertTrue("Element not found exception should be thrown here.", e instanceof ElementNotFoundException);
    }

    try {
      list.remove(2);
      assertTrue(list.isEmpty());
    } catch (Exception e) {
      fail("Exception should not be thrown here.");
    }

    try {
      list.remove(1);
    } catch (Exception e) {
      assertTrue("EmptyCollectionException should be thrown here.", e instanceof EmptyCollectionException);
    }
  }

  @Test
  public void testRemoveFirst() {
    ListADT<Integer> list = new ArrayList<Integer>(10);

    list.addLast(1);
    list.addLast(2);
    list.addLast(3);

    try {
      assertEquals(3, list.size());
      list.removeFirst();
      assertEquals(2, list.size());
      assertFalse(list.contains(1));
    } catch (Exception e) {
      fail("Exception should not be thrown here.");
    }

    try {
      assertEquals(2, list.size());
      list.removeFirst();
      assertEquals(1, list.size());
      assertFalse(list.contains(2));
    } catch (Exception e) {
      fail("Exception should not be thrown here.");
    }

    try {
      list.removeFirst();
    } catch (Exception e) {
      fail("Exception should not be thrown here.");
    }

    try {
      list.removeFirst();
    } catch (Exception e) {
      assertTrue("EmptyCollectionException should be thrown here.", e instanceof EmptyCollectionException);
    }
  }

  @Test
  public void testRemoveLast() {
    ListADT<Integer> list = new ArrayList<Integer>(10);

    list.addLast(1);
    list.addLast(2);
    list.addLast(3);

    try {
      assertEquals(3, list.size());
      list.removeLast();
      assertEquals(2, list.size());
      assertFalse(list.contains(3));
    } catch (Exception e) {
      fail("Exception should not be thrown here.");
    }

    try {
      assertEquals(2, list.size());
      list.removeLast();
      assertEquals(1, list.size());
      assertFalse(list.contains(2));
    } catch (Exception e) {
      fail("Exception should not be thrown here.");
    }

    try {
      list.removeLast();
    } catch (Exception e) {
      fail("Exception should not be thrown here.");
    }

    try {
      list.removeLast();
    } catch (Exception e) {
      assertTrue("EmptyCollectionException should be thrown here.", e instanceof EmptyCollectionException);
    }
  }

  @Test
  public void testFirst() {
    ListADT<Integer> list = new ArrayList<Integer>(10);

    list.addFirst(1);

    try {
      assertEquals(1, list.size());
      assertEquals(1, list.first().intValue());
    } catch (Exception e) {
      fail("Exception should not be thrown here.");
    }

    list.addFirst(2);

    try {
      assertEquals(2, list.size());
      assertEquals(2, list.first().intValue());
    } catch (Exception e) {
      fail("Exception should not be thrown here.");
    }

    try {
      list.removeFirst();
      list.removeFirst();
    } catch (Exception e) {
      fail("Exception should not be thrown here.");
    }

    try {
      list.first();
    } catch (Exception e) {
      assertTrue("EmptyCollectionException should be thrown here.", e instanceof EmptyCollectionException);
    }
  }

  @Test
  public void testLast() {
    ListADT<Integer> list = new ArrayList<Integer>(10);

    list.addLast(1);

    try {
      assertEquals(1, list.size());
      assertEquals(1, list.last().intValue());
    } catch (Exception e) {
      fail("Exception should not be thrown here.");
    }

    list.addLast(2);

    try {
      assertEquals(2, list.size());
      assertEquals(2, list.last().intValue());
    } catch (Exception e) {
      fail("Exception should not be thrown here.");
    }

    try {
      list.removeLast();
      list.removeLast();
    } catch (Exception e) {
      fail("Exception should not be thrown here.");
    }

    try {
      list.last();
    } catch (Exception e) {
      assertTrue("EmptyCollectionException should be thrown here.", e instanceof EmptyCollectionException);
    }
  }

  @Test
  public void testContains() {
    ListADT<Integer> list = new ArrayList<Integer>(10);

    list.addLast(1);
    list.addLast(2);

    try {
      assertTrue(list.contains(1));
      assertTrue(list.contains(2));
      assertFalse(list.contains(3));
      assertFalse(list.contains(4));
    } catch (Exception e) {
      fail("Exception should not be thrown here.");
    }

    try {
      list.removeFirst();
      list.removeFirst();
    } catch (Exception e) {
      fail("Exception should not be thrown here.");
    }

    try {
      list.contains(1);
    } catch (Exception e) {
      assertTrue("EmptyCollectionException should be thrown here.", e instanceof EmptyCollectionException);
    }
  }

  @Test
  public void testIndexOf() {
    ListADT<Integer> list = new ArrayList<Integer>(10);

    list.addLast(1);
    list.addLast(2);

    assertEquals(0, list.indexOf(1));
    assertEquals(1, list.indexOf(2));
    assertEquals(-1, list.indexOf(3));
    assertEquals(-1, list.indexOf(4));
  }

  @Test
  public void testGet() {
    ListADT<Integer> list = new ArrayList<Integer>(10);

    list.addLast(1);
    list.addLast(2);

    try {
      assertEquals(1, list.get(0).intValue());
      assertEquals(2, list.get(1).intValue());
    } catch (Exception e) {
      fail("Exception should not be thrown here.");
    }

    try {
      list.get(2);
    } catch (Exception e) {
      assertTrue("InvalidArgumentException should be thrown here.", e instanceof InvalidArgumentException);
    }

    try {
      list.removeFirst();
      list.removeFirst();
    } catch (Exception e) {
      fail("Exception should not be thrown here.");
    }

    try {
      list.get(1);
    } catch (Exception e) {
      assertTrue("EmptyCollectionException should be thrown here.", e instanceof EmptyCollectionException);
    }
  }

  @Test
  public void testSet() {
    ListADT<Integer> list = new ArrayList<Integer>(10);

    list.addLast(1);
    list.addLast(2);

    try {
      list.set(0, 3);
      list.set(1, 4);

      assertEquals(3, list.get(0).intValue());
      assertEquals(4, list.get(1).intValue());
    } catch (Exception e) {
      fail("Exception should not be thrown here.");
    }

    try {
      list.set(3, 5);
    } catch (Exception e) {
      assertTrue("InvalidArgumentException should be thrown here.", e instanceof InvalidArgumentException);
    }

    try {
      (new ArrayList<Integer>(10)).set(0, 5);
    } catch (Exception e) {
      assertTrue("EmptyCollectionException should be thrown here.", e instanceof EmptyCollectionException);
    }
  }

}
