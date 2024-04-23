package DAY5;

public class sentenceSorting {
    public static String sortSentence(String s) {
        String[] array = s.split(" ");
        StringBuilder result = new StringBuilder();
        for(int i = 0 ; i < array.length; i++){
            for(int j = 0 ; j < array.length; j++){
                String str = array[j];
                String word = str.substring(0,array[j].length()-1);
                int pos = Integer.parseInt(str.substring(str.length()-1,str.length()));
                if(pos == i+1)
                    result.append(word + " ");
            }
        }
        return result.toString().trim();
    }
    public static void main(String[] args){
        String sentence = "is2 a3 Java1 Language5 Programming4";
        System.out.println(sortSentence(sentence));
    }
}
