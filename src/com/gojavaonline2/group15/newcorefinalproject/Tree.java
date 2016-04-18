package com.gojavaonline2.group15.newcorefinalproject;

//  Дерево - структура данных, которая может быть использована для моделирования
//  различных связей между объектами из реального мира. Также деревья могут быть
//  полезны как структура данных для различных алгоритмов или как основа некоторых
//  других структур данных, как хэш таблици и множества, например.

class Tree<T extends Comparable<T>> {
    private Node<T> root; // указатель на корневую вершину

    public Node<T> getRootNode() {
        return root;
    }

    public Tree<T> add(T value) {
        add(value, root);
        return this;
    }

    private void add(T value, Node<T> root) {
//      Случай 1: Если дерево пустое, просто создаем корневой узел.
        if (this.root == null) {
            this.root = new Node<>(null, null, value);
            return;
        }
//      Случай 2: Дерево не пустое => ищем правильное место для вставки.

//      Для того, чтобы дерево было полезным данные должны храниться в нем по каким-то правилам:
//      если в вершине ROOT хранится ключ 7,то в левом (правом) поддереве должны храниться только
//      ключи меньшие (соответственно большие) чем 7
//      Такой подход хранения информации реализован для простоты поиска нужного значения в дереве.
//      Просто сравним x со значением в корне. Если они равны, то мы нашли требуемое.
//      Если же x меньше (больше), то он может оказаться только в левом (соответственно правом) поддереве.

//      Добавление узла реализовано с помощью рекурсивного подхода. Есть всего два случая, которые надо учесть:
//      1. Дерево пустое.
//      2. Дерево не пустое.
//      Если дерево пустое, мы просто создаеи новый узел и добавляем его в дерево.
//      Во втором случае мы сравниваем переданное значение со значением в узле, начиная от корня.
//      Если добавляемое значение меньше значения рассматриваемого узла, повторяем ту же процедуру для левого поддерева.
//      В противном случае — для правого.

//      Метод сравнения для используемых в данном случае типов переменных реализован в классе "Node"

//      Случай 1: Вставляемое значение меньше значения узла
        if (root.getValue().compareTo(value) > 0) {

//      Если нет левого поддерева, добавляем значение в левого ребенка,
            if (root.getLeft() != null) {
                add(value, root.getLeft());
            }
//      в противном случае создаем левое поддерева.
            else {
                root.setLeft(new Node<>(null, null, value));
            }
        }
//      Случай 2: Вставляемое значение больше или равно значению узла.
        else {
//      Если нет правого поддерева, добавляем значение в правого ребенка,
            if (root.getRight() != null) {
                add(value, root.getRight());
            }
//      в противном случае создаем правое поддерево.
            else {
                root.setRight(new Node<>(null, null, value));
            }
        }
    }
//      P.S. Операции с деревом работают быстрее. При реализации списком все функции требуют O(n) действий,
//      где n — размер структуры.
//      Операции с деревом же работают за O(h), где h — максимальная глубина дерева (глубина — расстояние от корня до вершины).
//      К сожалению, в худшем случае дерево может выродится и сложность операций будет как у списка(когда существует только правые поддеревья)
}
