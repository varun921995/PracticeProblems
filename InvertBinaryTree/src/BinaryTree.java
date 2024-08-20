public class BinaryTree {

    TreeNode root;

    public  TreeNode add(int value){
        root = insertNode(root, value);
        return root;
    }

    private  TreeNode insertNode(TreeNode root, int value) {

        if(root == null){
            return new TreeNode(value);
        }
        if( value < root.val){
            root.left = insertNode(root.left, value);
        } else if (value > root.val) {
           root.right =  insertNode(root.right, value);
        }
        else{
            System.out.println("Value already exits");
        }
        return  root;
    }

    public  void print(){
         traverse(root);
    }

    private void traverse(TreeNode root) {

        if(root == null){
            return ;
        }
        traverse(root.left);
        System.out.println(root.val);
        traverse(root.right);
    }


    public  void invert(){
        root = invertTree(root);

    }

    private TreeNode invertTree(TreeNode root) {
        if(root == null){
            return null;
        }

        TreeNode temp = root.right;
        root.right = root.left;
        root.left = temp;

        invertTree(root.left);
        invertTree(root.right);
        return root;

    }

}
