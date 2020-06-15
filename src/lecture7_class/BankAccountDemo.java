package lecture7_class;


import java.lang.reflect.Method;
import java.util.Arrays;

// Client: Lucky person at wells fargo
//         jr Developer
public class BankAccountDemo {

    public static void main(String[] args) {



        BankAccount account = new BankAccount("Nijat Muhtar");
        account.setAddress("990 Melody Ct Se, Leesburg, VA 20175 USA");

        account.deposit(3000.90);
        account.withdraw(900);
        account.deposit(9000);
        account.deposit(3000.90);
        account.withdraw(900);
        account.deposit(9000);
        account.deposit(3000.90);
        account.withdraw(900);
        account.deposit(9000);

        account.showTransactionHistory();
        account.printBankAccountUserInfo();

//        Method[] methodsInThisObject = account.getClass().getMethods();
//
//        for(Method m : methodsInThisObject ) {
//            System.out.println( m);
//        }


    }
}
