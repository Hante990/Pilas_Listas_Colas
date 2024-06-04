package Colas;

import java.util.PriorityQueue;

/**
 *
 * @author alons
 */
public class E1<T> {
    private PriorityQueue<T> queue;

    public E1() {
        queue = new PriorityQueue<>();
    }

    // Agregar elemento
    public void add(T element) {
        queue.add(element);
    }

    // Obtener elemento con mayor prioridad
    public T getHighestPriority() {
        return queue.peek();
    }

    // Eliminar elemento con mayor prioridad
    public void removeHighestPriority() {
        queue.poll();
    }

    // Vacía la cola
    public void clear() {
        queue.clear();
    }

    // Verificar si la cola está vacía
    public boolean isEmpty() {
        return queue.isEmpty();
    }

    public static void main(String[] args) {
        E1<String> priorityQueue = new E1<>();

        // Agregar elementos a la cola de prioridad
        priorityQueue.add("Hola");
        priorityQueue.add("123");
        priorityQueue.add("3.14");

        // Imprimir el primer elemento de la cola
        System.out.println("Primer elemento de la cola: " + priorityQueue.getHighestPriority());

        // Eliminar el primer elemento de la cola
        priorityQueue.removeHighestPriority();

        // Imprimir los restantes elementos de la cola
        System.out.println("Restantes elementos de la cola:");
        while (!priorityQueue.isEmpty()) {
            System.out.println(priorityQueue.getHighestPriority());
            priorityQueue.removeHighestPriority();
        }
    }
}
