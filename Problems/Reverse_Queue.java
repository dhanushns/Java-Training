package Problems;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Reverse_Queue {

    public static Queue<Integer> reverse_k(Queue<Integer> q, int k){

        Stack<Integer> stack = new Stack<>();
        Queue<Integer> result = new LinkedList<>();

        for(int i = 0; i < k ; i++){
            stack.push(q.remove());
        }

        while(!stack.isEmpty()){
            result.add(stack.pop());
        }

        while(!q.isEmpty()){
            result.add(q.remove());
        }

        return result;

    }

    public static void main(String[] args) {

        Queue<Integer> q = new LinkedList<>();
        q.offer(1);
        q.offer(2);
        q.offer(3);
        q.offer(4);
        q.offer(5);
        Queue<Integer> res = reverse_k(q,3);
        System.out.println(res);
    }

}
