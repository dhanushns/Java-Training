package Problems;

public class RodCutting {

    public static int DFS(int[] price,int n){

        int max_price = price[n];
        int left = 1;
        int right = n-1;

        while(left <= right){
            int left_max = DFS(price,left);
            int right_max = DFS(price,right);
            int total_price = left_max + right_max;
            if(total_price > max_price)
                max_price = total_price;
            left++;
            right--;
        }

        return max_price;
    }

    public static void main(String[] args) {

        int[] price = new int[] {0,1,5,8,9,10,17,17,20};
        System.out.println(DFS(price,price.length-1));

    }
}
