package Problems;

import java.util.LinkedList;
import java.util.Queue;

public class FirstUnique {

    public static void find_first_non_repeating(String s){

        int n = s.length();
        Queue<Character> queue = new LinkedList<>();
        int[] freq = new int[26];

        for(int i = 0 ; i < n ; i++){
            char ch = s.charAt(i);
            queue.add(ch);
            freq[ch - 'a']++;
        }
        while(!queue.isEmpty() && freq[queue.peek() - 'a'] > 1){
            queue.remove();
        }
        if(queue.isEmpty())
            System.out.println(-1);
        else{
            System.out.println("First Unique Character : " + queue.peek());
        }
    }

    public static void main(String[] args) {

        String str = "abcxchbag";
        find_first_non_repeating(str);
    }

}
