package com.gojavaonline2.group15.newcorefinalproject;

public class Node<T extends Comparable<T>> implements Comparable<T> {
    private Node<T> left;
    private Node<T> right;
    private T value;

    public Node(Node<T> left, Node<T> right, T value) {
        this.left = left;
        this.right = right;
        this.value = value;
    }


    public Node<T> getLeft() {
        return left;
    }

    public void setLeft(Node<T> left) {
        this.left = left;
    }

    public Node<T> getRight() {
        return right;
    }

    public void setRight(Node<T> right) {
        this.right = right;
    }

    public T getValue() {
        return value;
    }


    public int compareTo(T o) {
        return o.compareTo(value);
    }
}

