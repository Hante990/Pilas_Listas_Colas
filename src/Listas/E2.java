/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Listas;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Stack;
/**
 *
 * @author alons
 */
public class E2 {
public static boolean balanceoParentesis(String expresion) {
        List<Character> pila = new ArrayList<>();
        Map<Character, Character> paresParentesis = new HashMap<>();
        paresParentesis.put('(', ')');
        paresParentesis.put('[', ']');
        paresParentesis.put('{', '}');

        for (char caracter : expresion.toCharArray()) {
            if (paresParentesis.containsKey(caracter)) {
                pila.add(caracter);
            } else if (paresParentesis.containsValue(caracter)) {
                if (pila.isEmpty() || paresParentesis.get(pila.remove(pila.size() - 1)) != caracter) {
                    return false;
                }
            }
        }
        return pila.isEmpty();
    }

    public static void main(String[] args) {
        String expresion = "[({})]";
        if (balanceoParentesis(expresion)) {
            System.out.println("Los paréntesis están balanceados.");
        } else {
            System.out.println("Los paréntesis no están balanceados.");
        }
    }
}
