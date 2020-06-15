package lecture7_class;

import java.util.Date;


// Class Designer, highly respected and feared
// Thanks to this person, your coding experience is fun and simple
// Thank you so much class designers out there
// You guys rock!!!!

public class BankAccount {

    // ------------------- Fields ------------------- //
    private String ownerFullName;
    private String fullAddress;
    private long accountNumber;
    private double currentBalance;
    private boolean isAccountActive;
    private String[] transactionHistory;
    private int tranIdx = 0;

    // ------------------- Constructor(s) -------------------//
    public BankAccount(String fullName) {
        ownerFullName = fullName;
        fullAddress = "";
        accountNumber = generateAccountNumber();
        currentBalance = 0.0;
        isAccountActive = true;
        transactionHistory = new String[100];
    }

    public BankAccount(String name, String fullAddress) {
        ownerFullName = name;
        this.fullAddress = fullAddress;
        accountNumber = generateAccountNumber();
        currentBalance = 0.0;
        isAccountActive = true;
        transactionHistory = new String[100];
    }

    // ------------------- Methods -------------------//
    // Helper Method
    // Capability:  Generate random 6 digit account number
    private long generateAccountNumber() {
        long generated = (long)(Math.random() * 10_000_000) + 90_000_000;
        return generated;
    }


    public void setName(String name) {
        if(name.length() == 0 || name == null || name.equals("")) {
            String msgToProgrammer = "Name cannot be empty or null";
            throw new IllegalArgumentException(msgToProgrammer);
        }
        this.ownerFullName = name;
    }

    public String getName() {
        return this.ownerFullName;
    }

    public void setAddress(String fullAddress) {
        if(!fullAddress.contains("USA")) {
            String msg1 = "Sorry, BankAccount object should only used ";
            String msg2 = "to represent user located in USA";
            String msgToProgrammer = msg1 + msg2;
            throw new IllegalArgumentException(msgToProgrammer);
        }
        this.fullAddress = fullAddress;
    }

    public void printBankAccountUserInfo() {
        StringBuilder strb = new StringBuilder();
        strb.append("\n==========User Information================\n")
            .append("User Name: " + this.ownerFullName + "\n")
            .append("User Addr: " + getShortAddress() + "\n")
            .append("Account Ending: "+ getShortAccountNumber() +"\n")
            .append("Current Account Balance:  $" + this.currentBalance + "\n")
            .append("Acount is Active : " + isAccountActive )
            .append("==========================================");

        System.out.println( strb.toString() );
    }

    private String getShortAddress() {
        // only return their city and country
        String[] addressPart = fullAddress.split(",");
        String userShortAddrs = addressPart[1] + addressPart[2];
        return userShortAddrs;
    }

    private String getShortAccountNumber() {
        String accountNum = String.valueOf(this.accountNumber);
        return accountNum.substring(3);
    }


    public void deposit(double amount) {
        if(amount <= 0) {
            String msgToProgrammer = "deposit amount cannot be negative or zero";
            throw new IllegalArgumentException(msgToProgrammer);
        }
        this.currentBalance += amount;

        // book keeping operation
        String transactionMessage = "DEPOSIT  MADE ON: ";
        Date date = new Date();
        String currentDate = date.toString();
        transactionMessage += currentDate;
        transactionMessage += " with the ammount:  +$" + this.currentBalance;
        this.transactionHistory[tranIdx] = transactionMessage;
        tranIdx++;
    }


    private void transactionLog(String tranType){
        String transactionMessage="";
        if(tranType.equalsIgnoreCase("Deposit")) {
            transactionMessage = "DEPOSIT  MADE ON: ";
        }else if(tranType.equalsIgnoreCase("Withdrawl")){

        }
        Date date = new Date();
        String currentDate = date.toString();
        transactionMessage += currentDate;
        transactionMessage += " with the ammount:  $" + this.currentBalance;
        this.transactionHistory[tranIdx] = transactionMessage;
        tranIdx++;
    }

    public void withdraw(double amount) {
        if(amount > currentBalance) {
            String msgToProgrammer = "User cannot withdraw more than their current balance";
            throw new IllegalArgumentException(msgToProgrammer);
        }
        this.currentBalance -= amount;

        // book keeping operation
        // book keeping operation
        String transactionMessage = "WITHDRAW MADE ON: ";
        Date date = new Date();
        String currentDate = date.toString();
        transactionMessage += currentDate;
        transactionMessage += " with the ammount:  -$" + this.currentBalance;
        this.transactionHistory[tranIdx] = transactionMessage;
        tranIdx++;
    }

    public void showTransactionHistory(){
        System.out.println("=========== Transaction History  ===============");
        for(String transaction:  transactionHistory) {
            if(transaction == null) {
                continue;  // we don't care for null values
            }
            System.out.println(transaction);
        }
    }

}
