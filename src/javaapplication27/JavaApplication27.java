/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication27;

/**
 *
 * @author Escal
 */
public class JavaApplication27 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Queue queue=new Queue();
        
        queue.enqueue(0);
        queue.enqueue(2);
        queue.enqueue(1);
        queue.deQueque();
        queue.print();
    }
    
}
