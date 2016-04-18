package com.gojavaonline2.group15.newcorefinalproject;

public class Main {

    public static void main(String[] args) {
        Tree<Integer> tree = new Tree<Integer>().add(7).add(8)
                .add(9).add(5).add(6).add(4)
                .add(2).add(3).add(1);
//      В первую очередь добавляется 7. Это значение становится корне дерева.
//      Затем мы добавляем 8. Поскольку 7 меньше 8, мы кладем ее в правое поддерево.
//      таким-же образом 9 становится правым поддеревом корня 8.
//      5 становится левым ребенком корня 7. 6 становится правым ребенком 5
//      Последовательное сравнение вставляемого значения с потенциальным родителем продолжается до тех пор,
//      пока не будет найдено место для вставки, и повторяется для каждого вставляемого значения до тех пор,
//      пока не будет построено все дерево целиком.

//      далее проверяем обход дерева тремя методами с выводом результата на экран
        System.out.println(Traverse.preorderTraverse(tree.getRootNode()));
        Traverse.result.delete(0,Traverse.result.length());
        System.out.println("Inorder Traverse Procedure Completed\n");
        System.out.println(Traverse.inorderTraverse(tree.getRootNode()));
        Traverse.result.delete(0,Traverse.result.length());
        System.out.println("Preorder Traverse Procedure Completed\n");
        System.out.println(Traverse.postorderTraverse(tree.getRootNode()));
        Traverse.result.delete(0,Traverse.result.length());
        System.out.println("Postorder Traverse Procedure Completed\n");

//      изменим тип данных, но сохраним структуру дерева, для упрощения сравнения результатов
//      и повторим те-же процедуры, что и в предыдущем случае
        Tree<String> tree1 = new Tree<String>().add("node7").add("node8")
                .add("node9").add("node5").add("node6").add("node4")
                .add("node2").add("node3").add("node1");
        System.out.println(Traverse.preorderTraverse(tree1.getRootNode()));
        Traverse.result.delete(0,Traverse.result.length());
        System.out.println("Inorder Traverse Procedure Completed\n");
        System.out.println(Traverse.inorderTraverse(tree1.getRootNode()));
        Traverse.result.delete(0,Traverse.result.length());
        System.out.println("Preorder Traverse Procedure Completed\n");
        System.out.println(Traverse.postorderTraverse(tree1.getRootNode()));
        Traverse.result.delete(0,Traverse.result.length());
        System.out.println("Postorder Traverse Procedure Completed\n");
    }
}


