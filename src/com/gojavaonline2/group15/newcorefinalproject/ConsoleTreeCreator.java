package com.gojavaonline2.group15.newcorefinalproject;

import java.io.BufferedReader;
import java.io.InputStreamReader;

// в данном классе организовывается создание дерева с консоли

public class ConsoleTreeCreator {
    public Tree<Integer> readDataFromConsole() {
        System.out.println("Введите, через Enter, ключи вашего дерева, следуюя принципам:\n" +
                "1. Тип данных ключа - Integer\n" +
                "2. Первое значение - значение вершины дерева\n" +
                "3. Далее вводить желаемые данные:\n" +
                "если в вершине ROOT хранится ключ X, то в левом (правом) поддереве должны храниться только\n" +
                "ключи меньшие (соответственно большие) чем X\n" +
                "4. Для завершения создания введите 0");
        Tree<Integer> tree = new Tree<>();
        int a;
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
            while (true) {
                String s = bufferedReader.readLine();
                if (s.length() != 0)
                    a = Integer.parseInt(s);
                else break;
                if (a == 0)
                    break;
                else tree.add(a);
            }
        } catch (Exception e) {
            System.out.println("[Error in ConsoleTreeCreator:]Something happens. " + e.getMessage());
        }
        return tree;
    }
}
