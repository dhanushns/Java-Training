package DAY7;

public class Main {
    public static  void main(String[] args){
        PrivateClass pc = new PrivateClass();
        pc.getNmber();
    }
}

class PrivateClass{
    private int num = 999;

    public int getNmber(){
        return this.num;
    }

    public void setNum(int n){
        this.num = n;
    }

}
