package com.gojavaonline2.group15.newcorefinalproject;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class UserConsoleInterface {
    UserConsoleInterface(){
        System.out.println("Введите число, чтобы начать работу:\n" +
                "1. Создать Simple дерево с корнями Integer\n"+
                "2. Создать Simple дерево с корнями String\n" +
                "3. Создать свое дерево с корнями Integer\n" +
                "4. Выполнить префиксный обход \n" +
                "5. Выполнить инфиксный обход \n" +
                "6. Выполнить постфиксный обход \n" +
                "0. Завершить работу программы");
        Tree tree = null;
        int a;
        try (BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in))){
            while (true) {
                a = Integer.parseInt(bufferedReader.readLine());
                if (a == 0)
                    break;
                else if (a == 1) {
                    tree = new SimpleTreeCreator().simpleIntegerTreeCreator();
                    System.out.println("Теперь есть возможность выбрать метод сортировки");
                }
                else if (a == 2) {
                    tree = new SimpleTreeCreator().simpleStringTreeCreator();
                    System.out.println("Теперь есть возможность выбрать метод сортировки");
                }
                else if (a == 3) {
                    tree = new ConsoleTreeCreator().readDataFromConsole();
                    System.out.println("Теперь есть возможность выбрать метод сортировки");
                }
                else if (a == 4) {
                    if (tree == null) {
                        System.out.println("Дерево пустое");
                        break;
                    }
                    System.out.println(Traverse.preorderTraverse(tree.getRootNode()));
                    Traverse.result.delete(0, Traverse.result.length());
                    System.out.println("Preorder Traverse Procedure Completed\n");
                }
                else if (a == 5){
                    if (tree == null) {
                        System.out.println("Дерево пустое");
                        break;
                    }
                    System.out.println(Traverse.inorderTraverse(tree.getRootNode()));
                    Traverse.result.delete(0,Traverse.result.length());
                    System.out.println("Inorder Traverse Procedure Completed\n");
                }
                else if (a == 6) {
                    if (tree == null) {
                        System.out.println("Дерево пустое");
                        break;
                    }
                    System.out.println(Traverse.postorderTraverse(tree.getRootNode()));
                    Traverse.result.delete(0, Traverse.result.length());
                    System.out.println("Postorder Traverse Procedure Completed\n");
                }
            }
        }catch (NullPointerException e) {
            System.out.println("[Error in UserConsoleInterface:] NullPointerException. Message: "+e.getMessage());
        }
        catch (Exception e){
            System.out.println("[Error in UserConsoleInterface: Message: "+e.getMessage());
        }
    }
}
