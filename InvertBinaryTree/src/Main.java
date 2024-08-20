public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        BinaryTree bt = new BinaryTree();
        bt.add(5);
        bt.add(3);
        bt.add(7);
        bt.add(8);
        bt.add(2);
        bt.add(4);
        bt.add(3);

        bt.print();
        System.out.println("--------------- invert tree now ----------------");
        bt.invert();

        bt.print();
    }
}