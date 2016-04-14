package com.cofefinalproject;


import java.util.LinkedList;

public class CreateNode {
    private static int MAX_TOP_NODE = 10;
        private LinkedList<Integer> nodeList[]; //массив для хранения информации о пройденных и не пройденных вершинах
private boolean used[] = new boolean[MAX_TOP_NODE];

    CreateNode() {
        nodeList = new LinkedList[10];
        for (int i = 0; i < MAX_TOP_NODE; ++i) {
            nodeList[i] = new LinkedList<>();
        }
        for (int i = 0; i < nodeList.length; i++) {
            Integer v = (int) (Math.random() * 10);
            Integer w = (int) (Math.random() * 10);
            nodeList[v].add(w);
            nodeList[w].add(v);
        }

    }

    public void run() {
        for (int v = 0; v < MAX_TOP_NODE; ++v) {
            comeInside(v);
        }
    }

    //процедура обхода в глубину
    private void comeInside(int v) {
        //если вершина является пройденной, то не производим из нее вызов процедуры
        if (used[v]) {
            return;
        }
        used[v] = true; //помечаем вершину как пройденную
        System.out.print(v + 1+" - ");
        //запускаем обход из всех вершин, смежных с вершиной v
        for (int i = 0; i < nodeList[v].size(); ++i) {
            int w = nodeList[v].get(i);
            System.out.printf(w + " ");
            comeInside(w); //вызов обхода в глубину от вершины w, смежной с вершиной v
        }
    }
}

//    public LinkedList<Integer> getNodeList() {
//        return nodeList;
//    }
//
//    public void setNodeList(LinkedList<Integer> nodeList) {
//        this.nodeList = nodeList;
//    }
//
//    @Override
//    public String toString() {
//        String s = "";
//        for (Integer o : nodeList) {
//            s += o.toString()+" ";
//        }
//        return s;
//    }


