import java.util.Scanner;
public class Account {
    //variable time babey
    String accountName;
    String accountNumber;
    double accountBalance;
    double previousTransaction;
    //let's make us a constructor hun
    Account(String name, String number) {
        accountName=name;
        accountNumber=number;
    }
    //depositing function
    void deposit(double amount) {
        accountBalance+=amount;
        previousTransaction=amount;
    }
    //withdrawal fcn
    void withdraw(double wAmount) {
        accountBalance-=wAmount;
        previousTransaction=wAmount;
    }
    //previous transaction
    void previousTransaction() {
        if (previousTransaction>0) {
            System.out.println("Deposited "+previousTransaction+" to "+ accountName+"'s account.'");

        } else if (previousTransaction<0) {
            System.out.println("Withdrew "+previousTransaction+" from "+ accountName+"'s account.'");
        } else {
            System.out.println("Sorry, invalid transaction occured. Please try again later.");
        }
    }
    //interest calculator yay
    void calculateInterest(int years) {
        double interestRate= .07;
        double calculatedInterest;
        calculatedInterest= accountBalance*interestRate*years;
        System.out.println("Calculated interest is $"+calculatedInterest+"! Have a nice day :)");
    }
    //more interest stuff
    void predictBalance(int yrs, double predictedBalance, double intRate) {
        predictedBalance+=(accountBalance*intRate*yrs);
        double percentInt=intRate*100;
        System.out.println("After "+yrs+" years, at an interest rate of "+percentInt+"%, your account balance would be $"+predictedBalance+". Wow, looks great! Have an amazing day ;)");
    }
    void viewBalance() {
        System.out.println("Your Balance is "+ accountBalance);
    }
    //Menu
    void menu() {
        char option='o';
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hi there, "+accountName+"! Welcome to Bank of Catherine.");
        System.out.println("Your ID number is "+accountNumber);
        System.out.println("What would you like to do today?");
        System.out.println("=======================================");
        System.out.println("A. View Account Balance");
        System.out.println("B. Make a deposit");
        System.out.println("C. Make a withdrawal");
        System.out.println("D. View previous transaction");
        System.out.println("E. Calculate interest amount");
        System.out.println("F. Calculate prospective account amount");
        System.out.println("G. Exit app");

    }
}