import java.util.Scanner;
import java.lang.String;

public class Atm {

    public static void main(String args[]){
        String accno;
        Scanner sc=new Scanner(System.in);
        System.out.println("\t ~WELCOME TO 24/7 ATM~ ");
        System.out.print("Enter your Account Number- ");
        accno=sc.nextLine();
        Bank b1=new Bank(accno);

        int ch;
        do {
            System.out.println("\n\n CHOOSE FROM THE FOLLOWING");
            System.out.println("\n1. Account details\n2. Deposit \n3. Withdraw \n4. Exit");
            System.out.print("\nEnter your choice: ");
            ch = sc.nextInt();
            switch (ch) {

                case 1:  b1.check();
                    break;
                case 2: b1.deposit();
                    break;
                case 3: b1.withdraw();
                    break;
                case 4: b1.exit();
                    break;
                default: System.out.println("Wrong Input");
            }
        }while(ch!=4);
    }
}


class Bank
{
    String name,accno;
    int bal,dpst,wtdr;

    Bank(String accno){
        name="Gaurav Savaimul";
        bal=1000;
        this.accno=accno;
    }
    void check(){
        System.out.println("\nACCOUNT NUMBER- " +accno);
        System.out.println("ACCOUNT HOLDER'S NAME- " +name);
        System.out.print("ACCOUNT BALANCE- " +bal);
    }
    void deposit(){
        Scanner sc=new Scanner(System.in);
        System.out.print("\n\nEnter the amount you want to deposit- ");
        dpst=sc.nextInt();
        bal=bal+dpst;
        System.out.print("\nYour updated balance is- "+bal);
    }
    void withdraw(){
        Scanner sc= new Scanner(System.in);
        System.out.print("\n\nEnter the amount you want to withdraw- ");
        wtdr=sc.nextInt();
        if(bal>wtdr){
            bal=bal-wtdr;
            System.out.print("\nYour updated balance is- "+bal);
        }else{
            System.out.println("\nYour balance is less! *TRANSACTION FAILED* ");
        }

    }
    void exit(){
        System.out.println("\nThank You for choosing our service :)");
    }
}