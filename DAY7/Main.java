package DAY7;

public class Main {
    public static  void main(String[] args){
        
//        PrivateClass pc = new PrivateClass();
//        int num = pc.getNmber();
//        System.out.println("number : " + num);
//        pc.setNum(14);
//        num = pc.getNmber();
//        System.out.println("number : " + num);

      ChildClass_1 obj = new ChildClass_1();
      //obj.display();

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

interface interfaceClass{
    String name = "Dhanush";
    public void display();
}


class ParentClass{

    public ParentClass(){
        System.out.println("Parent Constructor");
    }

    public ParentClass(int a){
        System.out.println(a);
    }

    public void display(){
        System.out.println("Parent Class");
    }
}

class ChildClass_1 extends ParentClass{

    public ChildClass_1(){
        super(10);
        System.out.println("Child Class 1 Constructor");
    }

    public void display(){
        System.out.println("Child class 1");
    }
}

class ChildClass_2 extends ParentClass implements interfaceClass{

    public ChildClass_2() {
        System.out.println("Child Class 2 Constructor");
    }
}
