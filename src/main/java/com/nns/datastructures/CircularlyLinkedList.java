package com.nns.datastructures;

/**
 * Created by Aaron H. on 1/4/16.
 */
public class CircularlyLinkedList<T> {
    int size;
    Node<T> newest = null;
    Node<T> tail = null;

    public CircularlyLinkedList(){ }

    public CircularlyLinkedList(T t){
        size = 0;
        addFirst(t);
    }

    private void addFirst(T t){
        tail = new Node<>(t, tail);
        tail.setNext(tail);
        size++;
    }

    public void addElement(T t){
        if(size == 0) {
            addFirst(t);
            return;
        }
        newest = new Node<>(t, tail.getNext());
        tail.setNext(newest);
        size++;
    }

    public void addLast(T t){
        newest = new Node<>(t, tail.getNext());
        tail.setNext(newest);
        tail = newest;
        size++;
    }

    public T first(){
        if(isEmpty()) return null;
        return tail.getNext().getElement();
    }

    public boolean isEmpty(){
        return size == 0;
    }

    public T last(){
        if(isEmpty()) return null;
        return tail.getElement();
    }

    public T removeFirst(){
        if(isEmpty()) return null;
        Node<T> head = tail.getNext();
        T result = head.getElement();
        tail.setNext(head.getNext());
        size--;
        if(size == 0) tail = null;
        return result;
    }

    public void rotate(){
        if(tail != null)
            tail = tail.getNext();
    }

    public int size(){
        return size;
    }

    private static class Node <T>{
        private T element;
        private Node<T> next;

        public Node(T t, Node<T> n){
            element = t;
            next = n;
        }

        public T getElement(){ return element; }
        public Node<T> getNext(){ return next; }
        public void setNext(Node<T> n){ next = n; }
    }
}
