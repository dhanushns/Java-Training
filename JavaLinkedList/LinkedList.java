package JavaLinkedList;

public class LinkedList {

    int data;
    LinkedList next;
    LinkedList head;

    public void add(int data){
        LinkedList node = new LinkedList();
        node.data = data;
        node.next = null;
        if(head == null){
            head = node;
        }
        else{
            LinkedList temp = head;
            while(temp.next != null)
                temp = temp.next;
            temp.next = node;
        }
    }

    public void addAll(int[] dataItems){
        int length = dataItems.length;
        for (int dataItem : dataItems) {
            add(dataItem);
        }
    }

    public void insert(int position, int dataItem){
        int count = 0;
        LinkedList list = head;
        while(list != null){
            if(count == position-1)
                break;
            list = list.next;
            count++;
        }
        LinkedList NewNode = new LinkedList();
        NewNode.data = dataItem;
        NewNode.next = list.next;
        list.next = NewNode;
    }

    public void display(){
        LinkedList list = head;
        while(list != null){
            System.out.println(list.data);
            list = list.next;
        }
    }

    public int count(){
        int count = 0;
        LinkedList node = head;
        while(node != null) {
            node = node.next;
            count++;
        }
        return count;
    }

    public int getAt(int idx) throws Exception {
        int count = 0;
        LinkedList node = head;
        while(node != null){
            if(count  == idx)
                return node.data;
            else{
                count++;
                node = node.next;
            }
        }
        throw new InvalidException("Invalid Index Found");
    }

    public void sort(){
        int length = count()/2;
        LinkedList node = head;
        for(int i = 0; i < length; i++){
            while(node != null){
                if(node.next != null){
                    LinkedList temp = node.next;
                    if(temp.data < node.data) {
                        int t = temp.data;
                        temp.data = node.data;
                        node.data = t;
                    }
                }
                node = node.next;
            }
            node = head;
        }
    }
}

//Exception Handlers
class InvalidException extends Exception{
    InvalidException(String msg){
        super(msg);
    }
}