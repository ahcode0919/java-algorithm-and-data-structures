package com.nns.datastructures;

import java.lang.reflect.Type;

/**
 * Created by Aaron H. on 1/1/16.
 */
public class SinglyLinkedList<T> {
    int size;
    Node<T> newest = null;
    Node<T> head = null;
    Node<T> tail = null;

    public SinglyLinkedList(){ }

    public SinglyLinkedList(T t){
        size = 0;
        addFirst(t);
    }

    private void addFirst(T t){
        newest = new Node<>(t, head);
        head = newest;
        tail = newest;
        size++;
    }

    public void addElement(T t){
        if(size == 0) {
            addFirst(t);
            return;
        }
        newest = new Node<>(t, head);
        head = newest;
        size++;
    }

    public void addLast(T t){
        newest = new Node<>(t, null);
        if(isEmpty())
            head = newest;
        else
            tail.setNext(newest);
        tail = newest;
        size++;
    }

    public T first(){
        if(isEmpty()) return null;
        return head.getElement();
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
        T result = head.getElement();
        head = head.next;
        size--;
        if(size == 0) tail = null;
        return result;
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
