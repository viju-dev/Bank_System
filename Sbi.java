import java.util.Objects;
import java.util.UUID;

public class Sbi implements Bank{
    private String name;
    private String password;
    private String accNo;
    private int balance;
    private final int rateOfInterest = 7;

    public Sbi(String name, String password, int balance) {
        this.name = name;
        this.password = password;
        this.balance = balance;

        this.accNo = String.valueOf(UUID.randomUUID());  // it will generate random  number which will not be repeated
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getAccNo() {
        return accNo;
    }

    public void setAccNo(String accNo) {
        this.accNo = accNo;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public int getRateOfInterest() {
        return rateOfInterest;
    }

    @Override
    public int checkBalance() {
        return balance;
    }

    @Override
    public String addMoney(int amount) {
        balance += amount;
        return "Your Money has been Succefully Added";
    }

    @Override
    public String withDrawMoney(int amount, String pass) {
        if(Objects.equals(password,pass)){
            if(amount > balance){
//                System.out.println("Sorry...! Insuffient Balance");
                return "Sorry...! Insuffient Balance";
            }
            else {
                balance -= amount;
//                System.out.println("You have Succefully withdrawed your money");
                return "You have Succefully withdrawed your money";
            }
        }
        else {
//            System.out.println("Invalid Credentials Entered");
            return "Invalid Credentials Entered";
        }
    }

    @Override
    public int calculateInterest(int years) {
        int rate = (balance*rateOfInterest*years)/100;
        return rate;
    }
}
