public interface Bank {

    int checkBalance();
    String addMoney(int amount);
    String withDrawMoney(int amount,String pass);
    int calculateInterest(int years);

//    int balance;
//    double interest;
//    String password;
//    String uname;

//     Bank(String name, String pass , int bal){
//        uname = name;
//        password = pass;
//        balance += bal;
//        System.out.print("Your Account Has been Succesfully Created");
//        return;
//    }
//    void addMoney(int bal){
//        balance += bal;
//        System.out.print("Money has been added Successfully");
//        return ;
//    }
//    void checkBal(){
//        System.out.print("Your Account Balance is "+balance);
//        return;
//    }
//    void withdraw(int bal){
//        if(bal > balance){
//            System.out.println("Sorry...! You don't have Enough Balance");
//        }
//        else {
//            balance -= bal;
//            System.out.print("You have withdraw "+bal+" amount");
//        }
//    }
}
//class Sbi extends Bank{
//    int roi = 7;
//    Sbi(String name, String pass, int bal) {
//        super(name, pass, bal);
//    }
//    void rateOfInterset(int duration){
//        int r = (roi*balance*duration)/100;
//        System.out.println("Your Rate Of Interset For "+duration+" is "+r);
//        return;
//    }
//}