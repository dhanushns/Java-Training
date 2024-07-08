package Problems;

public class MaximumActivity {

    public static int countActivity(int[] start,int[] end){
        int maxActivity = 1;
        int j = 0;
        for(int i = 1; i < start.length; i++){
            if(start[i] >= end[j]){
                maxActivity++;
                j++;
            }
        }

        return maxActivity;
    }

    public static void main(String[] args) {

        int[] start = new int[] {1,3,0,5,8,5};
        int[] end = new int[] {2,4,6,7,9,9};
        System.out.println(countActivity(start,end));

    }
}
