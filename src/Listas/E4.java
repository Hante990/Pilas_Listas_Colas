/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Listas;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author alons
 */
public class E4<T> {
    private List<T> list;

    public E4() {
        list = new ArrayList<>();
    }

    public void createList() {
        list = new ArrayList<>();
    }
    public void deleteList() {
        list.clear();
    }

    public int size() {
        return list.size();
    }

    public boolean isEmpty() {
        return list.isEmpty();
    }

    public boolean isFull() {
        // Las listas en Java no tienen un tamaño fijo, por lo que no pueden estar llenas
        return false;
    }

    public int next(int position) {
        if (position >= 0 && position < list.size() - 1) {
            return position + 1;
        } else {
            return -1; // Posición no válida
        }
    }

    // Anterior
    public int previous(int position) {
        if (position > 0 && position < list.size()) {
            return position - 1;
        } else {
            return -1; // Posición no válida
        }
    }

    // Agregar elemento
    public void add(T element) {
        list.add(element);
    }

    // Obtener elemento
    public T get(int position) {
        if (position >= 0 && position < list.size()) {
            return list.get(position);
        } else {
            return null; // Posición no válida
        }
    }

    // Eliminar elemento
    public void remove(int position) {
        if (position >= 0 && position < list.size()) {
            list.remove(position);
        }
    }

    public static void main(String[] args) {
        E1<Double> myList = new E1<>();

        myList.add(3.14);
        myList.add(2.718);
        myList.add(1.618);

        System.out.println("Primer elemento: " + myList.get(0));

        myList.remove(0);

        System.out.println("Elemento en la cima: " + myList.get(0));
    }
}
