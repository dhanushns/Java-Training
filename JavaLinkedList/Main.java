package JavaLinkedList;

public class Main {
    public static void main(String[] args) throws Exception {
        LinkedList list = new LinkedList();
        int[] elements = new int[] {4,2,1,3};
        list.addAll(elements);
        list.sort();
        list.display();
        System.out.println(list.getAt(5));
    }

}
