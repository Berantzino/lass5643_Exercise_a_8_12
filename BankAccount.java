public class BankAccount {
    /*
    Add a toString method to the BankAccount class from the previous exercise. Your method should return a string that
    contains the account's name and balance separated by a comma and space. For example, if an account object named yana
    has the name "Yana" and a balance of 3.03, the call yana.toString() should return the string "Yana, $3.03".
    */

    String name;
    double balance;
    private double transactonFee = 0.00;

    public void deposit(double amount) {
        balance = balance + amount;
    }

    public void withdraw(double amount) {

        if (balance - (amount + transactonFee) < 0.00) {
            System.out.println("Amount must not be greater than: $" + balance + " + fee: $" + transactonFee);
        }
        else {
            balance = balance - (amount + transactonFee);
            System.out.println("$" + amount + " Has been withdrawn from your account. The transaction fee was: $" +
                                transactonFee);
        }
    }

    public void setTransactonFee(double transactonFee) {
        this.transactonFee = transactonFee;
    }

    // toString metode (Opgave 8.12)
    @Override
    public String toString() {
        return name + ", " + "$" + balance + ".";
    }
}
