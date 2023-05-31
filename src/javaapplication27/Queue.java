/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication27;

/**
 *
 * @author Escal
 */
public class Queue {
    private Node first;
    private Node last;
    private int length;
    
    public Queue(){
        this.first=null;
        this.last=null;
        this.length=0;
    
    }

    public Node getFirst() {
        return first;
    }

    public void setFirst(Node first) {
        this.first = first;
    }

    public Node getLast() {
        return last;
    }

    public void setLast(Node last) {
        this.last = last;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }
    
   public void enqueue(int value){
    Node newNode = new Node(value);
    if(first == null){
        setFirst(newNode);
        setLast(newNode);
    }else{
        getLast().setNext(newNode);
        setLast(newNode);
    }
    length++;
}

    
   public Node deQueque() {
    if(first == null) {
        return null;
    } else if(length == 1) {
        Node temp = getFirst();
        setFirst(null);
        setLast(null);
        length--;
        return temp;
    } else {
        Node temp = getFirst();
        setFirst(getFirst().getNext());
        temp.setNext(null);
        length--;
        return temp;
    }
}

    public void print(){
        Node aux=getFirst();
        while(aux!=null){
            System.out.println(aux.getValue());
            aux=aux.getNext();
        
        
        }
    
    }
            
    
    
}
