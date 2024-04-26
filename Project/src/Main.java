import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String cmd = "";
        while(!cmd.equals("Exit") && !cmd.equals("exit") && !cmd.equals("3")) {

            System.out.println("*".repeat(20) + " Maariyaman Indian Bank " + "*".repeat(20));
            System.out.println("1.Create New Account");
            System.out.println("2.Login");
            System.out.println("3.Exit");
            System.out.print("Enter the value : ");
            cmd = input.next();

            if(cmd.equals("1")){

            }

        }
    }
}

class CreateAccount{

}