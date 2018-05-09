package jianzhioffer.binarytree;

import java.util.ArrayList;

/**
 * create by frank
 * on 2018/05/09
 * 从上往下打印出二叉树的每个节点，同层节点从左至右打印。
 */
public class PrintNodeByOrder {

    public ArrayList<Integer> printFromTopToBottom(TreeNode root) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        //遍历输入到返回集合中
        ArrayList<TreeNode> tmpList = new ArrayList<>();
        //记录下层节点
        ArrayList<TreeNode> storeList = new ArrayList<>();
        if (root == null){
            return arrayList;
        }

        tmpList.add(root);
        while (!tmpList.isEmpty()) {
            storeList.clear();
            for (TreeNode treeNode : tmpList) {
                arrayList.add(treeNode.val);
                TreeNode leftNode = treeNode.left;
                TreeNode rightNode = treeNode.right;
                if (leftNode != null) {
                    storeList.add(leftNode);
                }
                if (rightNode != null) {
                    storeList.add(rightNode);
                }
            }
            tmpList.clear();
            tmpList.addAll(storeList);
        }
        return arrayList;
    }


    public static void main(String[] args) {
        TreeNode treeNode1 = new TreeNode(1);
        TreeNode treeNode2 = new TreeNode(2);
        TreeNode treeNode3 = new TreeNode(3);
        TreeNode treeNode4 = new TreeNode(4);
        TreeNode treeNode5 = new TreeNode(5);
        treeNode1.left = treeNode2;
        treeNode1.right = treeNode3;
        treeNode2.left = treeNode4;
        treeNode2.right = treeNode5;
        PrintNodeByOrder printNodeByOrder = new PrintNodeByOrder();
        ArrayList<Integer> arrayList = printNodeByOrder.printFromTopToBottom(treeNode1);
        System.out.println(arrayList.toArray());
    }
}
