package com.gojavaonline2.group15.newcorefinalproject;

public class Main {

    public static void main(String[] args) {
        Tree<Integer> tree = new Tree<Integer>().add(7).add(8)
                .add(10).add(5).add(6).add(4)
                .add(2).add(3).add(1);
        Traverse.preorderTraverse(tree.getNode());
        System.out.println("\nInorder Traverse Procedure Completed");
        Traverse.inorderTraverse(tree.getNode());
        System.out.println("\nPreorder Traverse Procedure Completed");
        Traverse.postorderTraverse(tree.getNode());
        System.out.println("\nPostorder Traverse Procedure Completed");

        Tree<String> tree1 = new Tree<String>().add("node7").add("node8").add("node10").add("node5").add("node6")
        .add("node4").add("node2").add("node3").add("node1");
        Traverse.preorderTraverse(tree1.getNode());
        System.out.println("\nInorder Traverse Procedure Completed");
        Traverse.inorderTraverse(tree1.getNode());
        System.out.println("\nPreorder Traverse Procedure Completed");
        Traverse.postorderTraverse(tree1.getNode());
        System.out.println("\nPostorder Traverse Procedure Completed");
        System.out.println();
    }
}


