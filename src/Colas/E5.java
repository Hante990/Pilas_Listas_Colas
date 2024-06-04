package Colas;

import java.util.PriorityQueue;

public class E5<T> {
    private PriorityQueue<T> queue;

    public E5() {
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
        E1<Double> priorityQueue = new E1<>();

        priorityQueue.add(3.14);
        priorityQueue.add(2.718);
        priorityQueue.add(1.618);

        System.out.println("Primer elemento de la cola: " + priorityQueue.getHighestPriority());

        System.out.println("Restantes elementos de la cola:");
        while (!priorityQueue.isEmpty()) {
            System.out.println(priorityQueue.getHighestPriority());
            priorityQueue.removeHighestPriority();
        }
    }
}
