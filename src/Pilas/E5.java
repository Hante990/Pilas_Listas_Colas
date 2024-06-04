package Pilas;
import java.util.Stack;

public class E5 {

    public static void main(String[] args) {
        Stack<Double> stack = new Stack<>();

        // Agregar elementos a la pila
        stack.push(3.14);
        stack.push(2.718);
        stack.push(1.618);

        // Imprimir el primer elemento
        System.out.println("Primer elemento: " + stack.peek());

        // Imprimir el primer elemento a eliminar
        System.out.println("Primer elemento a eliminar: " + stack.pop());
        // Imprimir el elemento en la cima de la pila
        System.out.println("Elemento en la cima de la pila: " + stack.peek());
    }
}
