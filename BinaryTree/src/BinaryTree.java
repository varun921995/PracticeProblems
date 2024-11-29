public class BinaryTree {

    public Node root;

    BinaryTree(int value){
        root = new Node(value);
    }

    public void insert(int value){
        add(root, value);
    }

    private Node add(Node currentNode, int value) {
        if(currentNode == null){
            return currentNode = new Node(value);
        }else if(currentNode.value > value){
            currentNode.left = add(currentNode.left, value);
        } else if (currentNode.value < value) {
           currentNode.right =  add(currentNode.right, value);
        }else{
            System.out.println("Value Already Exists");
        }
        return currentNode;
    }

    public void print(){
        traverse(root);
    }

    private void traverse(Node currentNode) {
        if(currentNode != null){
            traverse(currentNode.left);
            System.out.println(currentNode.value);
            traverse(currentNode.right);
        }
    }
}
