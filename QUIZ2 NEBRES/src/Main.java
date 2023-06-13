public class Main {
    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList<>();

        linkedList.add(13);
        linkedList.add(23);
        linkedList.add(33);
        linkedList.add(43);

        System.out.println("Size: " + linkedList.size());

        System.out.println("Contains 10? " + linkedList.contains(10));
        System.out.println("Index of 15: " + linkedList.indexOf(15));

        linkedList.removeFirst();

        System.out.println("Size after removing first element: " + linkedList.size());
    }
}