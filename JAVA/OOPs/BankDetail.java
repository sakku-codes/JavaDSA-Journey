public class BankDetail {
    public static void main(String[] args) {
        BankUser user1 = new BankUser("Saksham",1000000,123456789);
        System.out.println(user1.getHolderName());
        System.out.println(user1.AccountNumber);
        System.out.println("the current Balance : " + user1.getBalance());
        user1.deposit(100374);
        user1.withdraw(12455);
        System.out.println("the current Balance : " + user1.getBalance());

    }

    static class BankUser{
        private String AccountHolder;
        private int balance;
        private int AccountNumber;


        public BankUser(String AccountHolder, int balance, int AccountNumber){
            this.AccountHolder = AccountHolder;
            this.balance = balance;
            this.AccountNumber = AccountNumber;
        }

        public void deposit(int amount){
            if(amount > 0){
                balance += amount;
                System.out.println("Credited : " + amount);
            }
        }

        public void withdraw(int amount){
            if(amount <= balance && amount > 0){
                balance -= amount;
                System.out.println("debited :" + amount);
            }
        }

        public int getBalance(){
            return balance;
        }

        public String getHolderName(){
            return AccountHolder;
        }

        public int getAccNum(){
            return AccountNumber;
        }
        
    }
}
