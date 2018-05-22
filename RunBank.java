public class RunBank {

    public static void main(String[] args) {

        BankAccount minBank = new BankAccount();

        System.out.println("Current balance: $" + minBank.balance);
        minBank.deposit(500.00);
        System.out.println("Current balance: $" + minBank.balance);

        minBank.withdraw(250.00);
        System.out.println("Current balance: $" + minBank.balance);

        minBank.withdraw(300.00);

        // Test af opgave 8.12
        minBank.name = "Lasse";
        System.out.println(minBank.toString());
    }
}
