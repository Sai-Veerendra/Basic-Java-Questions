class BankAccount{
   int initialBalance = 1000;

// Deposit method
  void deposit(int amount){
   initialBalance+= amount;
  }

// Withdraw method
  void withdraw(int amount){
   if (initialBalance-amount >= 0){
    initialBalance -= amount;
   } else { 
    System.out.println("error");
   }
  }

// Check Balance method
  void checkBalance(){
   System.out.println("Current Balance: RS." + initialBalance + "/-");
  }

}

class BankAccountMain{
 public static void main(String a[]){

// creating object
  BankAccount Sai = new BankAccount();

// performing operations
  Sai.deposit(500);
  Sai.withdraw(300);
  Sai.checkBalance();
}
}