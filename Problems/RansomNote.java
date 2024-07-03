package Problems;

import java.util.HashMap;

public class RansomNote {

    public static boolean canConstruct(String ransomeNote, String magazine){
        HashMap<Character,Integer> map = new HashMap<>();
        for(int i = 0 ; i < magazine.length(); i++){
            char ch = magazine.charAt(i);
            if (ch != ' ') {
                if(map.containsKey(ch)){
                    map.put(ch,map.get(ch) + 1);
                }
                else{
                    map.put(ch,1);
                }
            }
        }
        for(int i = 0; i < ransomeNote.length(); i++){
            char ch = ransomeNote.charAt(i);
            if(map.containsKey(ch)){
                map.put(ch,map.get(ch) - 1);
                int val = map.get(ch);
                if(val == -1)
                    return false;
            }
            else
                return false;
        }

        return true;
    }

    public static void main(String[] args) {
        String ransomeNote = "aa";
        String magazine = "aab";
        System.out.println(canConstruct(ransomeNote,magazine));
    }

}
