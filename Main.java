import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Name");
        String name = sc.nextLine();
        System.out.println("Enter Your Password");
        String password = sc.next();
        System.out.println("Enter the amount you want to add");
        int amount = sc.nextInt();

        Sbi user = new Sbi(name,password,amount); // Acoount creation
        boolean quit = false;

        while (quit == false){
            System.out.println("For checking balance press 1 , for adding money press 2, for withdrawing money press 3 ,To Know ROI press 4,To quit press 0");
            int option = sc.nextInt();
            if(option == 1){
                System.out.println(user.checkBalance());
            }
            else if (option == 2){
                System.out.println("Enter Amount You want to add :");
                System.out.println(user.addMoney(sc.nextInt()));
            }
            else if ( option == 3){
                System.out.println("Enter Amount You want to debit & your Password:");
                System.out.println(user.withDrawMoney(sc.nextInt(),sc.next()));
            }
            else if (option == 4){
                System.out.println("Enter duration for which You want to calculate ROI :");
                System.out.println(user.calculateInterest(sc.nextInt()));
            }
            else if (option == 0){
                quit = true;
                return;
            }
            else {
                System.out.println("Please Enter Correct Option");
            }
        }

    }
}
