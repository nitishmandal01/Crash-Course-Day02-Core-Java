package problem5;

public class BankAccount {
private String accountNumber ;
private int balance;

public String getAccountNumber() {
    return accountNumber;
}
public void setAccountNumber(String accountNumber) {
    this.accountNumber = accountNumber;
}
public int getBalance() {
    return balance;
}
public void setBalance(int balance) {
    if(balance > 0) this.balance = balance;
}



}
