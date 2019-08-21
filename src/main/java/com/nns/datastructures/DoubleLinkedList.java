package com.nns.datastructures;

/**
 * Created by Aaron H. on 1/6/16.
 */
public class DoubleLinkedList<T> {

    private Node<T> header;
    private Node<T> trailer;
    private int size;

    public DoubleLinkedList(){
        size = 0;
        header = new Node<>(null, null, null);
        trailer = new Node<>(null, header, null);
        header.setNext(trailer);
    }

    public int size(){
        return size;
    }

    public boolean isEmpty(){
        return size == 0;
    }

    public T first(){
        if(size == 0) return null;
        return header.getNext().getElement();
    }

    public T last(){
        if(size == 0) return null;
        return trailer.getPrevious().getElement();
    }

    public void addFirst(T t){
        Node<T> newest = new Node<>(t, header, header.getNext());
        header.getNext().setPrevious(newest);
        header.setNext(newest);
        size++;
    }

    public void addLast(T t){
        Node<T> newest =  new Node<>(t, trailer.getPrevious(), trailer);
        trailer.getPrevious().setNext(newest);
        trailer.setPrevious(newest);
        size++;
    }

    public void insertElementAt(int index, T t){
        if(size < index) throw new IndexOutOfBoundsException();
        Node<T> result = header.getNext();
        for(int i = 0; i < index; i++){
            result = result.getNext();
        }
        Node<T> newNode = new Node<>(t, result.getPrevious(), result);
        result.getPrevious().setNext(newNode);
        result.setPrevious(newNode);
    }

    public T removeElementAt(int index){
        if(size < index) return null;
        Node<T> result = header.getNext();
        for(int i = 0; i < index; i++){
            result = result.getNext();
        }
        removeElement(result);
        return result.getElement();
    }

    private void removeElement(Node<T> node){
        node.getPrevious().setNext(node.getNext());
        node.getNext().setPrevious(node.getPrevious());
        size--;
    }

    public T removeFirst(){
        if(size == 0) return null;
        Node<T> result = header.getNext();
        removeElement(result);
        return result.getElement();
    }

    public T removeLast(){
        if(size == 0) return null;
        Node<T> result = trailer.getPrevious();
        removeElement(result);
        return result.getElement();
    }

    private static class Node<T> {
        Node<T> previous;
        Node<T> next;
        T element;

        public Node(T t, Node<T> previous, Node<T> next){
            this.previous = previous;
            this.next = next;
            element = t;
        }

        public T getElement(){
            return element;
        }

        public Node<T> getNext(){
            return next;
        }

        public Node<T> getPrevious(){
            return previous;
        }

        public void setNext(Node<T> t){
            next = t;
        }

        public void setPrevious(Node<T> t){
            previous = t;
        }
    }
}
