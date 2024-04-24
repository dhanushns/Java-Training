package DAY6.Bank;

import java.util.Random;
import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        Account[] acc = new Account[10];
        Random rand = new Random();
        int accounts = 0;
        String cmd = "";
        while(!cmd.equals("Exit") && !cmd.equals("exit") && !cmd.equals("3")) {

            System.out.flush();
            System.out.println("*".repeat(20) + " Maariyaman Indian Bank " + "*".repeat(20));
            System.out.println("1.Create New Account");
            System.out.println("2.Open Account");
            System.out.println("3.Exit");
            System.out.print("Enter the value : ");
            cmd = input.next();

            if(cmd.equals("1")  || cmd.equals("Create New Account")){
                acc[accounts] = new Account();
                //System.out.flush();
                System.out.println("*".repeat(20) + " Maariyaman Indian Bank " + "*".repeat(20));
                System.out.println("*".repeat(10) + " Create Account " + "*".repeat(10));
                System.out.print("Enter your name : ");
                String name = input.next();
                System.out.print("Enter the initial deposite amount (min : 500) : ");
                double amount = input.nextDouble();
                while (amount < 500){
                    System.out.println("The account should have minimum amount od Rs.500");
                    System.out.print("Enter the amount : ");
                    amount = input.nextDouble();
                }
                int randId = rand.nextInt(90000);
                acc[accounts].createAccount(name,amount,randId);
                accounts++;
            } else if (cmd.equals("2")  || cmd.equals("Open Account")) {
                System.out.print("Enter Account holder Name : ");
                String name = input.next();
                boolean validUser = false;
                int accNo = 0;
                for(int i = 0 ; i < 10 ; i++){
                    if(name.equals(acc[i].name)){
                        acc[i].accountInformation();
                        validUser = true;
                        accNo = i;
                        break;
                    }
                }
                if(validUser){
                    String op = "";
                    while(!op.equals("exit") && !op.equals("5")){
                        System.out.println("\n\n1.Account Information");
                        System.out.println("2.Deposit");
                        System.out.println("3.Withdraw");
                        System.out.println("4.Check Balance");
                        System.out.println("5.Exit");
                        System.out.println("\nHello, " + acc[accNo].name.toUpperCase());
                        System.out.print("\nEnter the value : ");
                        op = input.next();
                        if(op.equals("1")){
                            acc[accNo].accountInformation();
                        } else if (op.equals("2")) {
                            System.out.print("Enter the amount : ");
                            double amount = input.nextDouble();
                            acc[accNo].deposite(amount);
                        } else if (op.equals("3")) {
                            System.out.print("Enter the amount : ");
                            double amount = input.nextDouble();
                            acc[accNo].withdraw(amount);
                        } else if (op.equals("4")) {
                            acc[accNo].checkBalance();
                        } else if (op.equals("5")) {
                            break;
                        }
                    }
                }
            }
        }
        input.close();
    }
}

class Account{

    String name;
    double balance;
    int accId;

    public void createAccount(String username,double amount,int id){
        name = username;
        balance = amount;
        accId = id;
    }

    public void deposite(double amount){
        balance += amount;
        checkBalance();
    }

    public void withdraw(double amount){
        if(amount > balance){
            System.out.println("\n\n*** Insufficent Balance ***");
        }
        else
            balance -= amount;
        checkBalance();
    }

    public void checkBalance(){
        System.out.println("\n\nBalance : " + balance);
    }

    public void accountInformation(){
        System.out.println("\n\nAccount Holder Name : " + name.toUpperCase());
        System.out.println("Account ID : " + accId);
        System.out.println("Account Balance : " + balance);
    }

}
