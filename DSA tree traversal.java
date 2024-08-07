
class TreeNode {
    int value;
    TreeNode left,right;
    TreeNode(int value){
        this.value = value;
        left=right=null;
    }
}
public class Main{
    void inorder(TreeNode node){
        if(node==null){
            return;
        }
        inorder(node.left);
        System.out.print(node.value+" ");
        inorder(node.right);
        return;
    }
    void preorder(TreeNode node){
        if(node==null){
            return;
        }
        System.out.print(node.value+" ");
        preorder(node.left);
        preorder(node.right);
        return;
    }
    void postorder(TreeNode node){
        if(node==null){
            return;
        }
        postorder(node.left);
        postorder(node.right);
        System.out.print(node.value+" ");

        return;
    }

    public static void main(String[] args){
//        TreeNode root = new TreeNode(1);
//        root.left = new TreeNode(2);
//        root.right = new TreeNode(3);
//        root.left.left = new TreeNode(4);
//        root.left.right = new TreeNode(5);
//        root.right.left = new TreeNode(6);
//        root.right.right = new TreeNode(7);
//        root.left.right.left = new TreeNode(8);
//        root.right.right.left = new TreeNode(9);
//        root.right.right.right = new TreeNode(10);


        TreeNode root = new TreeNode(4);
        root.left = new TreeNode(2);
        root.left.left = new TreeNode(3);
        root.left.left.right = new TreeNode(9);
        root.left.left.right.left = new TreeNode(1);
        root.right =new TreeNode(5);
        root.right.left =new TreeNode(7);
        root.right.right =new TreeNode(6);
        root.right.right.left =new TreeNode(8);

        Main tree = new Main();
        System.out.print("\nIn-order Traversal:");
        tree.inorder(root);
        System.out.print("\npre-order Traversal:");
        tree.preorder(root);
        System.out.print("\npost-order Traversal:");
        tree.postorder(root);
    }
}
