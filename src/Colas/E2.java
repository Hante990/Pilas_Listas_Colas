package Colas;

import java.util.PriorityQueue;

public class E2<T> {
    private PriorityQueue<T> queue;

    public E2() {
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
        E1<Integer> priorityQueue = new E1<>();

        priorityQueue.add(5);
        priorityQueue.add(10);
        priorityQueue.add(3);

        System.out.println("Primer elemento de la cola: " + priorityQueue.getHighestPriority());

        System.out.println("Restantes elementos de la cola:");
        while (!priorityQueue.isEmpty()) {
            System.out.println(priorityQueue.getHighestPriority());
            priorityQueue.removeHighestPriority();
        }
    }
}
