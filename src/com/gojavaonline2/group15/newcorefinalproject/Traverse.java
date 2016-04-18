package com.gojavaonline2.group15.newcorefinalproject;

class Traverse {
    public static void inorderTraverse(Node current) {
        if (current == null)
            return;
        inorderTraverse(current.getLeft());
        System.out.print(current.getValue() + " ");
        inorderTraverse(current.getRight());
    }

    public static void preorderTraverse(Node current) {
        if (current == null)
            return;
        System.out.print(current.getValue() + " ");
        preorderTraverse(current.getLeft());
        preorderTraverse(current.getRight());
    }

    public static void postorderTraverse(Node current) {
        if (current == null)
            return;
        postorderTraverse(current.getLeft());
        postorderTraverse(current.getRight());
        System.out.print(current.getValue() + " ");
    }
}
