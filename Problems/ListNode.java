package Problems;

import java.util.ArrayList;

public class ListNode {

    public Node addAll(int[] arr){
        Node head = null;
        for (int data : arr) {
            Node newNode = new Node();
            newNode.data = data;
            newNode.next = null;
            if (head == null)
                head = newNode;
            else {
                Node temp = head;
                while (temp.next != null)
                    temp = temp.next;
                temp.next = newNode;
            }
        }
        return head;
    }

    public void display(Node node){
        Node temp = node;
        while(temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public void add(int data,Node head){
        Node node = new Node();
        node.data = data;
        node.next = null;
        if(head == null)
            head = node;
        else{
            Node temp = head;
            while(temp.next != null)
                temp = temp.next;
            temp.next = node;
        }
    }

    //*********** Merge Two Sorted Linked List **************
    public Node mergeList(Node list1, Node list2){
        Node l1 = list1;
        Node l2 = list2;
        Node head = new Node();
        boolean flag = false;
        while(l1 != null && l2 != null){
            int mindata;

            //Comparing both nodes
            if(l1.data == l2.data){
                mindata = l1.data;
                l1 = l1.next;
                l2 = l2.next;
                flag = true;
            }
            else if(l1.data < l2.data){
                mindata = l1.data;
                l1 = l1.next;
            }
            else{
                mindata = l2.data;
                l2 = l2.next;
            }
            //Adding the node
            add(mindata,head);
            if(flag){
                add(mindata,head);
                flag = false;
            }
        }

        while(l1 != null){
            add(l1.data,head);
            l1 = l1.next;
        }

        while (l2 != null){
            add(l2.data,head);
            l2 = l2.next;
        }

        return head.next;
    }

    public Node maxNode(Node head){
        Node max = head;
        if(head == null)
            return null;
        else{
            Node temp = head;
            while(temp.next != null){
                temp = temp.next;
                if(max.data < temp.data)
                    max = temp;
            }
            return max;
        }
    }

    // ********** Next Greater Nodes **********
    public ArrayList<Integer> nextGreaterNodes(Node head){
        ArrayList<Integer> res = new ArrayList<>();
        Node node = head;
        int max = 0;
        boolean flag = false;
        while(node != null){
            if(max == node.data) {
                res.add(0);
                node = node.next;
                if(node == null)
                    break;
            }
            else if(node.data < max){
                res.add(max);
                node = node.next;
            }
            Node temp = node.next;
            while(temp != null){
                if(temp.data > node.data){
                    res.add(temp.data);
                    max = temp.data;
                    Node t = temp.next;
                    while(t != null){
                        if(t.data > temp.data) {
                            max = t.data;
                            break;
                        }
                        t = t.next;
                    }
                    break;
                }
                temp = temp.next;
            }

            node = node.next;
        }
        return res;
    }

//    public Node mergeAll(Node[] lists){
//
//    }

}