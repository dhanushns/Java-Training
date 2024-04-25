package DAY8;

import java.util.Scanner;
public class TestProblem {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] s = input.nextLine().split(",");
        CarShowroom car = null;
        if(s[0].equals("Sedan"))
            car = new Sedan(s);
        else if(s[0].equals("SUV"))
            car = new SUV(s);
        else if(s[0].equals("HatchBack"))
            car = new HatchBack(s);
        else
            System.out.println("Invalid Input");

        System.out.println("On-Road Price: " + car.onRoadPrice);
    }
}

interface vehicle{

    public void cal_price();
    public void cal_tax();

}

class CarShowroom{

    String type;
    String modal;
    String mf;
    float basePrice;
    double cap;
    String fuel;
    float tax;
    float onRoadPrice;

}

class Sedan extends CarShowroom implements vehicle{

    public Sedan(String[] data){
        this.type = data[0];
        this.modal = data[1];
        this.mf = data[2];
        this.basePrice = Float.parseFloat(data[3]);
        this.cap = Double.parseDouble(data[4]);
        this.fuel = data[5];
    }

    public void cal_price(){

        onRoadPrice = basePrice + tax;

    }

    public void cal_tax(){

        tax = 3;
        if(cap > 1500)
            tax += 3;
        if(fuel.equals("Petrol"))
            tax += 2;
        else if(fuel.equals("Diesel"))
            tax+= 4;
        else
            tax -= 5;

        tax = (tax/100) * basePrice;
    }

}

class SUV extends CarShowroom implements vehicle{

    public SUV(String[] data){
        this.type = data[0];
        this.modal = data[1];
        this.mf = data[2];
        this.basePrice = Float.parseFloat(data[3]);
        this.cap = Double.parseDouble(data[4]);
        this.fuel = data[5];
    }

    public void cal_price(){
    }

    public void cal_tax(){
    }

}

class HatchBack extends CarShowroom implements vehicle{

    public HatchBack(String[] data){
        this.type = data[0];
        this.modal = data[1];
        this.mf = data[2];
        this.basePrice = Float.parseFloat(data[3]);
        this.cap = Double.parseDouble(data[4]);
        this.fuel = data[5];
    }

    public void cal_price(){
    }

    public void cal_tax(){
    }

}