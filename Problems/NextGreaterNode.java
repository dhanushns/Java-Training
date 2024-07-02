package Problems;

public class NextGreaterNode {

    public static void main(String[] args) {
        int[] num = new int[] {2,1,5};
        ListNode list = new ListNode();
        Node node = list.addAll(num);
        System.out.println(list.nextGreaterNodes(node));
    }
}

