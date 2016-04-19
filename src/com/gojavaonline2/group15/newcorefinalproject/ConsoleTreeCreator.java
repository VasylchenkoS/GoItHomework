package com.gojavaonline2.group15.newcorefinalproject;

import java.util.Scanner;

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
        int currentNodeValue;
        try  {
            Scanner scannerInputValue = new Scanner(System.in);
            while (true) {
                try {
                    currentNodeValue = scannerInputValue.nextInt();
                } catch (Exception e) {
                    continue;
                }
                if (currentNodeValue == 0)
                    break;
                else tree.add(currentNodeValue);
            }
        } catch (Exception e) {
            System.out.println("[Error in ConsoleTreeCreator:]Something happens. " + e.getMessage());
        }
        if (tree.getRootNode() != null)
            return tree;
        else return null;
    }
}
