package com.cofefinalproject;

public class Searching {
    Searching(TreeNode<String> treeRoot){
        Comparable<String> searchCriteria = treeData -> {
            if (treeData == null)
                return 1;
            boolean nodeOk = treeData.contains("210");
            return nodeOk ? 0 : 1;
        };

        TreeNode<String> found = treeRoot.findTreeNode(searchCriteria);
        System.out.println("Found: " + found);
    }
}
