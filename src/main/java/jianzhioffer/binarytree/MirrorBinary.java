package jianzhioffer.binarytree;


/**
 * create by frank
 * on 2018/05/08
 * ���������Ķ�����������任ΪԴ�������ľ���
 */
public class MirrorBinary {
    /**
     * �ݹ�
     * @param root
     */
    public void Mirror(TreeNode root) {
       exchange(root);
    }

    public TreeNode exchange(TreeNode root) {
        TreeNode left = null;
        TreeNode right = null;
        if (root == null)
            return null;
        exchange(root.right);
        exchange(root.left);
        left = root.left;
        right = root.right;
        root.left = right;
        root.right = left;
        return root;
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

        MirrorBinary mirrorBinary = new MirrorBinary();
        TreeNode treeNode = mirrorBinary.exchange(treeNode1);

    }
}
