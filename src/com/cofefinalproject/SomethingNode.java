package com.cofefinalproject;

enum TraverseType {
    INORDER,
    PREORDER,
    POSTORDER
}

public class SomethingNode {
    int data;
    SomethingNode parent;
    SomethingNode left;
    SomethingNode right;

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public SomethingNode getParent() {
        return parent;
    }

    public void setParent(SomethingNode parent) {
        this.parent = parent;
    }

    public SomethingNode getLeft() {
        return left;
    }

    public void setLeft(SomethingNode left) {
        this.left = left;
    }

    public SomethingNode getRight() {
        return right;
    }

    public void setRight(SomethingNode right) {
        this.right = right;
    }
}

class SomethingTree{
    private SomethingNode root;

    SomethingTree(){
        this.root = null;
    }

    public void insert(int data) {
        root = insert(root, data, null);
    }

    private SomethingNode insert(SomethingNode current, int data, SomethingNode parent) {
        if (current == null) {
            current = new SomethingNode();
            current.setData(data);
            current.setLeft(null);
            current.setRight(null);
            current.setParent(parent);
        } else if (data < current.getData()) {
            current.setLeft(insert(current.getLeft(), data, current));
        } else {
            current.setRight(insert(current.getRight(), data, current));
        }
        return current;
    }


    public void traverseTree(TraverseType traverseType) {
        traverseTree(root, traverseType);
        System.out.println();
    }

    private void traverseTree(SomethingNode current, TraverseType traverseType) {
        if (current == null)
            return;
        switch (traverseType) {
            case INORDER:
                traverseTree(current.getLeft(), traverseType);
                System.out.print(current.getData() + " ");
                traverseTree(current.getRight(), traverseType);
                break;
            case PREORDER:
                System.out.print(current.getData() + " ");
                traverseTree(current.getLeft(), traverseType);
                traverseTree(current.getRight(), traverseType);
                break;
            case POSTORDER:
                traverseTree(current.getLeft(), traverseType);
                traverseTree(current.getRight(), traverseType);
                System.out.print(current.getData() + " ");
                break;
        }
    }
}

class Main {
    public static void main(String[] args) {
        SomethingTree somethingTree = new SomethingTree();
        somethingTree.insert(0);
        for (int i = 10; i < 20; i++) {
            String s = "Itar" + i;
            somethingTree.insert((int) (Math.random()*10));
        }
        somethingTree.traverseTree(TraverseType.INORDER);
        somethingTree.traverseTree(TraverseType.PREORDER);
        somethingTree.traverseTree(TraverseType.POSTORDER);
    }
}