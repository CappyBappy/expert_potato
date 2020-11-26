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
        menu();
    }
    //withdrawal fcn
    void withdraw(double wAmount) {
        accountBalance-=wAmount;
        previousTransaction= -1*wAmount;
        menu();

    }
    //previous transaction
    void previousTransaction() {
        if (previousTransaction>0) {
            System.out.println("Deposited "+previousTransaction+" to "+ accountName+"'s account.'");

        } else if (previousTransaction<0) {
            System.out.println("Withdrew "+previousTransaction*-1+" from "+ accountName+"'s account.'");
        } else {
            System.out.println("Sorry, invalid transaction occured. Please try again later.");
        }
        menu();

    }
    //interest calculator yay
    void calculateInterest(int years) {
        double interestRate= .07;
        double calculatedInterest;
        calculatedInterest= accountBalance*interestRate*years;
        System.out.println("Calculated interest is $"+calculatedInterest+"! Have a nice day :)");
        menu();

    }
    //more interest stuff
    void predictBalance(int yrs, double intRate) {
        double predictedBalance=(accountBalance*intRate*yrs)+accountBalance;
        double percentInt=intRate*100;
        System.out.println("After "+yrs+" years, at an interest rate of "+percentInt+"%, your account balance would be $"+predictedBalance+". Wow, looks great! Have an amazing day ;)");
        menu();
    }
    void viewBalance() {
        System.out.println("Your Balance is "+ accountBalance);
        menu();
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
        //comment to see if github stuff works this way
        //do while loop for helping the menu be utilized
        do {
            System.out.println(" ");
            System.out.println("Pick an option");
            char option1=scanner.next().charAt(0);
            option= Character.toUpperCase(option1);
            System.out.println(" ");
            switch (option) {
                case 'A':
                    viewBalance();
                    break;
                case 'B':
                    System.out.println("Please enter the amount you would like to deposit.");
                    double depoAmount=scanner.nextDouble();
                    deposit(depoAmount);
                    break;
                case 'C':
                    System.out.println("Please enter the amount you would like to withdraw.");
                    double withAmount=scanner.nextDouble();
                    withdraw(withAmount);
                    break;
                case 'D':
                    previousTransaction();
                    break;
                case 'E':
                    System.out.println("Please enter in years of interest.");
                    int intYears=scanner.nextInt();
                    calculateInterest(intYears);
                    break;
                case 'F':
                    System.out.println("Please enter in years of interest.");
                    int calcYears=scanner.nextInt();
                    System.out.println("Please enter interest rate in percent form");
                    double percentOfInterest= scanner.nextDouble()/100;
                    predictBalance(calcYears, percentOfInterest);
                    break;
                case 'G':
                    System.out.println("------------------------------");
                    break;

                default:
                    System.out.println("Please select a valid option");
                    break;
            }
        }
        while (option !='G');
        System.out.println("Thank you, have a great day!");
    }
}