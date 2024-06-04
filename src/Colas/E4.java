package Colas;

import java.util.PriorityQueue;

public class E4<T> {
    private PriorityQueue<T> queue;

    public E4() {
        queue = new PriorityQueue<>();
    }

    public void add(T element) {
        queue.add(element);
    }

    public T getHighestPriority() {
        return queue.peek();
    }

    public void removeHighestPriority() {
        queue.poll();
    }

    public void clear() {
        queue.clear();
    }

    public boolean isEmpty() {
        return queue.isEmpty();
    }

    public static void main(String[] args) {
        E1<String> priorityQueue = new E1<>();

        priorityQueue.add("Hello");
        priorityQueue.add("World");
        priorityQueue.add("!");

        System.out.println("Primer elemento de la cola: " + priorityQueue.getHighestPriority());

        System.out.println("Restantes elementos de la cola:");
        while (!priorityQueue.isEmpty()) {
            System.out.println(priorityQueue.getHighestPriority());
            priorityQueue.removeHighestPriority();
        }
    }
}
