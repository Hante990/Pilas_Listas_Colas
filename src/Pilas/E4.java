package Pilas;
import java.util.Stack;

public class E4 {

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();

        // Agregar elementos a la pila
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);

        // Imprimir el primer elemento
        System.out.println("Primer elemento: " + stack.peek());

        // Imprimir el primer elemento a eliminar
        System.out.println("Primer elemento a eliminar: " + stack.pop());
        // Imprimir el elemento en la cima de la pila
        System.out.println("Elemento en la cima de la pila: " + stack.peek());
    }
}
