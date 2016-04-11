package vasylchenko.corefinalproject;

import java.util.Scanner;

public class TreeCreator {

    public void getMyTree() {
        Scanner scanner = new Scanner(System.in);
        Scanner string = new Scanner(System.in);
        boolean flags = true;
        Tree myTree;
        System.out.println("Введите корень: ");
        int str = scanner.nextInt();
        myTree = new Tree(str);
        while (flags) {
            System.out.print("1 - Заполнить дерево\n2 - Распечатать\n0 - Выход\n3 - Проба\n");
            System.out.print("Введите: ");
            str = scanner.nextInt();
            switch (str) {
                case 1: {
                    boolean flag = false;
                    while (!flag) {
                        System.out.print("Введите: ");
                        str = scanner.nextInt();
                        myTree.add(new Tree(str));
                        System.out.print("Продолжить?(y/n): ");
                        String strig = string.nextLine();
                        flag = !"y".equals(strig);
                    }
                    break;
                }
                case 2: {
                    myTree.traverse();
                    break;
                }
                case 0: {
                    flags = false;
                    break;
                }
                case 3: {
                    myTree.add(new Tree(7));
                    myTree.add(new Tree(5));
                    myTree.add(new Tree(14));
                    myTree.add(new Tree(16));
                    myTree.add(new Tree(20));
                    myTree.add(new Tree(17));
                    myTree.add(new Tree(10));
                    myTree.traverse();
                    break;
                }
            }
        }
    }
}
