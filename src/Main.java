import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        System.out.println("Pay Credit Card Bill");
        System.out.println("Choose the option");
        System.out.println("1).DebitCard");
        System.out.println("2).NetBanking");
        System.out.println("3).Upi");
        System.out.println("4).Wallet");
        CreditCard c=new CreditCard();

        Scanner sc=new Scanner(System.in);
        int option=sc.nextInt();
        switch (option)
        {
            case 1:c.payWithDebitCard();
            break;
            case 2:c.payWithNetBanking();
            break;
            case 3:c.payWithUpi();
            break;
            case 4:c.payWithPaytm();
            break;
        }


    }
}