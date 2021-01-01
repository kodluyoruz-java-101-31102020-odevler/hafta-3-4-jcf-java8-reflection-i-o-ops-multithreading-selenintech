package com.kodluyoruz.selen.question1;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class DoublyLinkedList<T> implements List<T> {

    private Node<T> head;
    private int size;

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public boolean contains(Object o) {
        if(isEmpty())
            return false;
        T value = (T) o;
        Node<T> temp = head;
        while (temp.next != null){
            if(temp.value.equals(value))
                return true;
            temp = temp.next;
        }
        return temp.value.equals(value);
    }

    @Override
    public Iterator<T> iterator() {
        return null;
    }

    @Override
    public Object[] toArray() {
        return new Object[0];
    }

    @Override
    public <T1> T1[] toArray(T1[] a) {
        return null;
    }

    @Override
    public boolean add(T t) {
        size++;
        Node<T> temp = head;
        while(temp.next != null){
            temp = temp.next;
        }
        Node<T> last = new Node<>();

       /* last = temp.next;*/

        return true;

    }

    @Override
    public boolean remove(Object o) {
        size--;
        return false;
    }

    @Override
    public boolean containsAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean addAll(Collection<? extends T> c) {
        return false;
    }

    @Override
    public boolean addAll(int index, Collection<? extends T> c) {
        return false;
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        size = 0;
        return false;
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        return false;
    }

    @Override
    public void clear() {
        head = null;
    }

    @Override
    public T get(int index) {
        if(index < 0 || size == 0 || index >= size)
            throw new IndexOutOfBoundsException();

        int i = 0;
        Node<T> temp = head;
        while (temp.next != null){
            if(i == index)
               return temp.value;
            temp = temp.next;
            i++;
        }
        return temp.value;
    }

    @Override
    public T set(int index, T element) {
        return null;
    }

    @Override
    public void add(int index, T element) {
        size++;
    }

    @Override
    public T remove(int index) {
        size--;
        return null;
    }

    @Override
    public int indexOf(Object o) {
        return 0;
    }

    @Override
    public int lastIndexOf(Object o) {
        return 0;
    }

    @Override
    public ListIterator<T> listIterator() {
        return null;
    }

    @Override
    public ListIterator<T> listIterator(int index) {
        return null;
    }

    @Override
    public List<T> subList(int fromIndex, int toIndex) {
        return null;
    }
}
