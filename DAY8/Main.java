package DAY8;

public class Main {
    public static void main(String[] args){
//        Child_Abstract_Class obj = new Child_Abstract_Class(){
//            void abstract_method_1() {
//                System.out.println("Abstract Method 1 from Child Main Class");
//            }
//        };
//        obj.abstract_method_1();r
//        obj.abstract_method_2();
//        obj.abstract_method_3();
//        obj.display();
//        obj.new_method();

        ParentClass p = new ParentClass(){
            public void display(){
                System.out.println("Display Method from Main class");
            }
        };

        p.display();

    }
}

abstract class abstract_class{

    abstract_class(){
        System.out.println("Abstract class constructor");
    }

    abstract void abstract_method_1();
    abstract void abstract_method_2();
    abstract void abstract_method_3();

    public void display(){
        System.out.println("Display Method from Abstract Class");
    }

    public void new_method(){
        System.out.println("New Method from Abstract Class");
    }
}

abstract class Child_Abstract_Class extends abstract_class{

    void abstract_method_1(){
        System.out.println("Abstract Method 1 from Child Abstract Class");
    }

    void abstract_method_2(){
        System.out.println("Abstract Method 2 from Child Abstract Class");
    }

    void abstract_method_3(){
        System.out.println("Abstract Method 3 from Child Abstract Class");
    }

}

class ParentClass extends Child_Abstract_Class{

    ParentClass(){
        System.out.println("Parent Class Constructor");
    }

    void abstract_method_1(){
        System.out.println("Abstract Method 1 from Parent Class");
    }

    void abstract_method_2(){
        System.out.println("Abstract Method 2 from Parent Class");
    }


    void abstract_method_3(){
        System.out.println("Abstract Method 3 from Parent Class");
    }

    public void display() {
        System.out.println("Display Method from Parent Class");
    }
}