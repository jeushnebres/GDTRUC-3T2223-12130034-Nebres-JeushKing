public class Main {
    public static void main(String[] args) {
        Tree tree = new Tree();
        tree.insert(232);
        tree.insert(122);
        tree.insert(424);
        tree.insert(621);
        tree.insert(121);
        tree.insert(154);
        tree.insert(769);

        System.out.println("Minimum value in the tree: " + tree.getMin().getValue());
        System.out.println("Maximum value in the tree: " + tree.getMax().getValue());

        System.out.println("Traverse in descending order: ");
        tree.traverseInOrderDescending();
    }
}