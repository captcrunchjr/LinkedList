package DataStructures;

import Exceptions.*;

import java.security.InvalidAlgorithmParameterException;

import ADTs.*;

public class LinkedList<T extends Comparable<T>> implements ListADT<T> {
    private int size;
    private SinglyLinkedNode<T> head;

    public LinkedList(){
        head = null;
        size = 0;
    }

    @Override
    public boolean isEmpty() {
        return head == null;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public void addFirst(T element) {
        SinglyLinkedNode<T> newNode = new SinglyLinkedNode<T>(element);
        if(isEmpty()){
            head = newNode;
        }
        else{
            newNode.setNext(head);
            head = newNode;
        }
        size++;
    }

    @Override
    public void addLast(T element) {
        SinglyLinkedNode<T> newNode = new SinglyLinkedNode<T>(element);
        if(isEmpty()){
            head = newNode;
        }
        else{
            SinglyLinkedNode<T> i = head;
            while(i.getNext() != null){
                i = i.getNext();
            }
            i.setNext(newNode);
        }
        size++;
    }

    @Override
    public void addAfter(T existing, T element) throws ElementNotFoundException, EmptyCollectionException {
        if(isEmpty()){
            throw new EmptyCollectionException();
        }
        int index = indexOf(existing);
        if(index == -1){
            throw new ElementNotFoundException("Element not found" + element.toString());
        }
        int i = 0;
        SinglyLinkedNode<T> targetNode = head;
        while(i < index){
            targetNode = targetNode.getNext();
            i++;
        }
        //create
        SinglyLinkedNode<T> newNode = new SinglyLinkedNode<T>(element);
        //rearrange
        newNode.setNext(targetNode.getNext());
        targetNode.setNext(newNode);
        size++;
    }

    @Override
    public T remove(T element) throws EmptyCollectionException, ElementNotFoundException {
        if(isEmpty()){
            throw new EmptyCollectionException();
        }
        int index = indexOf(element);
        if(index == -1){
            throw new ElementNotFoundException(element.toString());
        }
        if(index == 0){
            return removeFirst();
        }
        else if(index == size -1){
            return removeLast();
        }
        else{
            SinglyLinkedNode<T> toRemove = head;
            int i = 0;
            while(i < index){
                toRemove = toRemove.getNext();
                i++;
            }
            T result = toRemove.getNext().getData();
            toRemove.setNext(toRemove.getNext().getNext());
            size--;
            return result;
        }
    }

    @Override
    public T removeFirst() throws EmptyCollectionException {
        if(isEmpty()){
            throw new EmptyCollectionException();
        }
        T toRemove = head.getData();
        head = head.getNext();
        size--;
        return toRemove;
    }

    @Override
    public T removeLast() throws EmptyCollectionException {
        T result = null;
        if(isEmpty()){
            throw new EmptyCollectionException();
        }
        if(size == 1){
            return removeFirst();
        }
        else{
            SinglyLinkedNode<T> i = head;
            while(i.getNext().getNext() != null){
                i = i.getNext();
            }
            result = i.getNext().getData();
            i.setNext(null);
            size--;
            return result;
        }

    }

    @Override
    public T first() throws EmptyCollectionException {
        if(isEmpty()){
            throw new EmptyCollectionException();
        }
        return head.getData();
    }

    @Override
    public T last() throws EmptyCollectionException {
        if(isEmpty()){
            throw new EmptyCollectionException();
        }
        int index = size - 1;
        int i = 0;
        SinglyLinkedNode<T> last = head;
        while(i < index){
            last = last.getNext();
            i++;
        }
        return last.getData();
    }

    @Override
    public boolean contains(T element) throws EmptyCollectionException {
        if(isEmpty()){
            throw new EmptyCollectionException();
        }
        return indexOf(element) != -1;
    }

    @Override
    public int indexOf(T element) {
        int index = 0;
        SinglyLinkedNode<T> i = head;
        while(i != null){
            if(i.getData().compareTo(element) == 0){
                return index;
            }
            index++;
            i=i.getNext();
        }
        return -1;

    }

    @Override
    public T get(int index) throws EmptyCollectionException, InvalidArgumentException {
        if(isEmpty()){
            throw new EmptyCollectionException();
        }
        if(index < 0 || index >= size){
            throw new InvalidArgumentException();
        }
        int i = 0;
        SinglyLinkedNode<T> target = head;
        while(i < index){
            target = target.getNext();
            i++;
        }
        return target.getData();
    }

    @Override
    public void set(int index, T element) throws EmptyCollectionException, InvalidArgumentException {
        if(isEmpty()){
            throw new EmptyCollectionException();
        }
        if(index < 0 || index >= size){
            throw new InvalidArgumentException();
        }
        int i = 0;
        SinglyLinkedNode<T> target = head;
        while(i < index){
            target = target.getNext();
            i++;
        }
        target.setData(element);
    }

}