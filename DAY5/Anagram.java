package DAY5;

import java.util.Arrays;
public class Anagram{

    public static boolean isAnaagram(String str1, String str2){
        char[] ch_array_1 = str1.toCharArray();
        char[] ch_array_2 = str2.toCharArray();
        Arrays.sort(ch_array_1);
        Arrays.sort(ch_array_2);
        if(Arrays.equals(ch_array_1, ch_array_2))
            return true;
        else
            return false;
    }

    public static void main(String[] args){
        String[] str = new String[] {"eat","tea","tan","ate","nat","bat"};
        //String[] str = new String[] {"bat","nat","tan","ate","eat","tea"};
        String temp = "";
        String result = "";
        int count = 1;
        int min_count = 0;
        for(int i = 0 ; i < str.length;i++){
            if(!result.contains(str[i])){
                temp = str[i] + " ";
                for(int j = i + 1; j < str.length ; j++){
                    if(isAnaagram(str[i], str[j]) && !temp.contains(str[j]) && !result.contains(str[j])){
                        temp += str[j] + " ";
                        count++;
                    }
                }

                String[] temp_array = temp.split(" ");
                Arrays.sort(temp_array);

                if(count < min_count){
                    String t = result;
                    result = "";
                    for(String s : temp_array)
                        result += s + " ";
                    result += t;
                }
                else{
                    for(String s : temp_array)
                        result += s + " ";
                }
                min_count = count;
                count = 1;
            }
        }
        System.out.println(result);
    }
}