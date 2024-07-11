package Problems;

public class LemonadeChange {

    public static boolean isChangeAvailable(int[] bills){

        int fives_count = 0, tens_count = 0;
        for(int i = 0; i < bills.length; i++){
            int bill = bills[i];
            if(bill == 5)
                fives_count++;
            else if(bill == 10) {
                tens_count++;
                fives_count--;
            }
            else{
                if(tens_count >= 1) {
                    tens_count--;
                    if(fives_count >= 1)
                        fives_count--;
                    else return false;
                }
                else if (fives_count >= 3) {
                    fives_count-=3;
                }
                else return false;
            }
            if(fives_count < 0 || tens_count < 0) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(isChangeAvailable(new int[] {5,10,5,5,20}));
    }

}
