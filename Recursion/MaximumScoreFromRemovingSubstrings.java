package Recursion;

import java.util.Arrays;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Stack;

public class MaximumScoreFromRemovingSubstrings {

    //Using Recursion (cause : StackOverFlowError larger input size)
    public static int gain(StringBuilder s, String target, int gainPoint, int points, int idx){

        if(idx == s.length()-1)
            return points;

        String substr = s.substring(idx,idx+2);

        if(substr.equals(target)){
            points += gainPoint;
            s.replace(0,s.length(),s.substring(0, idx) + s.substring(idx+2));
            return gain(s,target,gainPoint,points,0);
        }
        return gain(s,target,gainPoint,points,idx+1);
    }

    //Using Stack
    static int points = 0;
    public static String GreedyMethod(StringBuilder s, String target){

        Stack<Character> stack = new Stack<>();
        for(int i = 0 ; i < s.length(); i++){
            if(stack.isEmpty()){
                stack.push(s.charAt(i));
                continue;
            }
            String substr = Character.toString(stack.peek()) + s.charAt(i);
            if(substr.equals(target))
                stack.pop();
            else
                stack.push(s.charAt(i));
        }

        StringBuilder st = new StringBuilder();
        while(!stack.isEmpty())
            st.append(stack.pop());
        return st.reverse().toString();
    }

    public static int DequqeApproch(StringBuilder s, String target,int gainPoints){
        Deque<Character> q = new LinkedList<>();
        StringBuilder str = new StringBuilder();
        q.addLast(s.charAt(0));
        str.append(s.charAt(0));
        for(int i = 1 ; i < s.length(); i++){
            if(q.isEmpty()){
                q.addLast(s.charAt(i));
                continue;
            }
            String substr = Character.toString(q.getLast()) + s.charAt(i);
            if(substr.equals(target)) {
                points += gainPoints;
                q.pollLast();
                str.deleteCharAt(str.length()-1);
            }
            else {
                str.append(s.charAt(i));
                q.addLast(s.charAt(i));
            }
        }
        s.replace(0,s.length(),str.toString());
        return points;
    }


    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("cdbcbbaaabab");
        int x = 5;
        int y = 4;
//        int points = x > y ? gain(sb,"ab",x,0,0) : gain(sb,"ba",y,0,0);
//        if(!sb.isEmpty())
//            points = x < y ? gain(sb,"ab",x,points,0) : gain(sb,"ba",y,points,0);
        String str1 = x > y ? GreedyMethod(sb,"ab") : null;
        String str2 = x < y ? null : GreedyMethod(sb,"ba");
        int p1 = ((sb.length() - str1.length())/2) * x;
        int p2 = ((sb.length() - str2.length())/2) * y;
        System.out.println(str1);
    }

}
