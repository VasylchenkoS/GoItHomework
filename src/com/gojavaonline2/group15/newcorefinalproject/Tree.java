package com.gojavaonline2.group15.newcorefinalproject;

class Tree<T extends Comparable<T>> {
    private Node<T> root;

    public Node<T> getNode() {
        return root;
    }

    public Tree<T> add(T value) {
        add(value, root);
        return this;
    }

    private void add(T value,Node<T> root) {
        if(this.root==null) {
            this.root = new Node<>(null,null,value);
            return;
        }

        if(root.getValue().compareTo(value)>0) {
            if(root.getLeft()!=null) {
                add(value,root.getLeft());
            } else {
                root.setLeft(new Node<>(null,null,value));
            }
        } else {
            if(root.getRight()!=null) {
                add(value,root.getRight());
            } else {
                root.setRight(new Node<>(null,null,value));
            }
        }
    }
}
