package QuestionBank;

import java.util.Scanner;

class NoMoneyException extends Exception{
    NoMoneyException(String message){
        super(message);
    }
}

class ATM{
    double balance;

    ATM(double blalnce){
        this.balance = balance;
    }

    void withdraw(double amount) throws NoMoneyException{
        if(amount > balance){
            throw new NoMoneyException("Insufficient Balance");
        }

        balance -= amount;

        System.out.println("Withdraw Successful");
        System.out.println("Balance:" + balance);
    }
}

public class Thirteen {
    public static void main(String[] args) {

        ATM atm = new ATM(5000);

        try{
            atm.withdraw(6000);

        }
        catch(NoMoneyException e){
            System.out.println("Error:" + e.getMessage());
        }

        finally{
            System.out.println("Transaction Successful");
        }
    }
}