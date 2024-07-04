package Problems;

public class NextGreaterNode {

    public static void main(String[] args) {
        int[] num = new int[] {1,3,1,5,2};
        ListNode list = new ListNode();
        Node node = list.addAll(num);
        System.out.println(list.nextGreaterNodes(node));
    }
}

