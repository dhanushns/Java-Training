package Problems;

public class MergeList {

    public static void main(String[] args) {

        int[] n1 = new int[] {1,2,4};
        int[] n2 = new int[] {1,5,8};
        ListNode list = new ListNode();
        Node list1 = list.addAll(n1);
        Node list2 = list.addAll(n2);
        Node res = list.mergeList(list1,list2);
        list.display(res);

    }

}
