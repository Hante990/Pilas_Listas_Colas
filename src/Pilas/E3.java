package Pilas;
import java.util.Stack;

public class E3 {

    public static void main(String[] args) {
        Stack<Character> stack = new Stack<>();

        // Agregar elementos a la pila
        stack.push('A');
        stack.push('B');
        stack.push('C');
        stack.push('D');
        stack.push('E');

        // Imprimir el primer elemento
        System.out.println("Primer elemento: " + stack.peek());

        // Imprimir el primer elemento a eliminar
        System.out.println("Primer elemento a eliminar: " + stack.pop());
        // Imprimir el elemento en la cima de la pila
        System.out.println("Elemento en la cima de la pila: " + stack.peek());
    }
}
