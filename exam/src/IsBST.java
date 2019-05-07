public class IsBST {
    treeNode root;
    int lower_limit= 0;
    int upper_limit= 0;
    static class treeNode{
        int value;
        treeNode left;
        treeNode right;
        treeNode(int value){
            this.value=value;
        }
    }

    public boolean isValidBST(treeNode root, int lower_limit, int upper_limit)
    {
        if (root==null){
            return true;
        } if (root.value<=lower_limit || root.value >= upper_limit)
    {
        return false;
    }return isValidBST(root.left, lower_limit, upper_limit) && isValidBST(root.right, lower_limit, upper_limit);
    }
    public boolean isBST(treeNode root)
    {

        return isValidBST(root, lower_limit, upper_limit);
    }
    // Returns the min value in a binary tree
    static int findMin(treeNode node)
    {
        if (node == null)
            return Integer.MAX_VALUE;

        int res = node.value;
        int lres = findMin(node.left);
        int rres = findMin(node.right);

        if (lres < res)
            res = lres;
        if (rres < res)
            res = rres;
        return res;
    }
    static int findMax(treeNode node)
    {
        if (node == null)
            return Integer.MIN_VALUE;

        int res = node.value;
        int lres = findMax(node.left);
        int rres = findMax(node.right);

        if (lres > res)
            res = lres;
        if (rres > res)
            res = rres;
        return res;
    }

    public static void main(String args[])
    {
        IsBST tree=new IsBST();
        tree.root= new treeNode(4);
        tree.root.left = new treeNode(2);
        tree.root.right = new treeNode(5);
        tree.root.left.left = new treeNode(1);
        tree.root.left.right = new treeNode(3);
        int lower_limit= tree.findMin(tree.root);
        int upper_limit= tree.findMax(tree.root);

        if (tree.isBST(tree.root)) {
            System.out.println("IS BST");
        } else
            System.out.println("Not a BST");
    }

}
