package Problems;

import java.util.*;
public class AnagramString {

    // Worst Case Algorithm
    public static boolean isAnagram(String s1,String s2){
        ArrayList<Character> arr = new ArrayList<>();
        if(s1.length() != s2.length())
            return false;
        for(int i = 0 ; i < s2.length(); i++) {
            arr.add(s2.charAt(i));
        }
        for(int i = 0 ; i < s1.length(); i++){
            for(int j = 0 ; j < s2.length(); j++){
                if(s1.charAt(i) == s2.charAt(j)){
                    Object ch = s2.charAt(j);
                    arr.remove(ch);
                    break;
                }
            }
        }
        return arr.isEmpty();
    }

    // Using HasMap
    public static boolean hasMap_fun(String s1,String s2){

        if(s1.length() != s2.length())
            return false;

        HashMap<Character,Integer> map = new HashMap<>();
        for(int i = 0; i < s1.length(); i++) {
            char ch = s1.charAt(i);
            if(map.containsKey(ch)){
                map.put(ch,map.get(ch)+1);
            }
            else{
                map.put(ch,1);
            }
        }
        System.out.println(map);
        for(int i = 0 ; i < s2.length(); i++){
            char ch = s2.charAt(i);
            if(map.containsKey(ch)){
                map.put(ch,map.get(ch) -1);
            }
        }
        System.out.println(map);
        for(char key : map.keySet()){
            int val = map.get(key);
            if(val != 0)
                return false;
        }

        return true;
    }

    public static void main(String[] args){
        //System.out.println(isAnagram("aacc","ccac"));
        System.out.println(hasMap_fun("anagram","nagaram"));
    }

}
