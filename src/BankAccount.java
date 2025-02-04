public class BankAccount
{
    public static void main(String[] args)
    {
        // initial balance of Bob
        double Balance = 2175.37;
        Balance -= 302.50;
        Balance += 50.03;
        Balance /= 2.00;
        Balance += 20.00;
        Balance -= 1.00;
        Balance *= 2.00;
        Balance += 1.00;

        System.out.println("Bob's new balance is: " + Balance);
    }
}
