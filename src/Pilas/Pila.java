/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Pilas;
import java.util.Stack;

/**
 *
 * @author alons
 */
public class Pila {

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();

        // Agregar elementos a la pila
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);

        // Imprimir el primer elemento
        System.out.println("Primer elemento: " + stack.peek());

        // Imprimir el primer elemento a eliminar
        System.out.println("Primer elemento a eliminar: " + stack.pop());
        // Imprimir el elemento en la cima de la pila
        System.out.println("Elemento en la cima de la pila: " + stack.peek());
    }
    }
    
