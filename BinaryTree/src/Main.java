public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        BinaryTree bt = new BinaryTree(5);
        bt.insert(4);
        bt.insert(2);
        bt.insert(10);
        bt.insert(7);
        bt.insert(4);
        bt.print();
    }
}