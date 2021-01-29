public class Loan {
    private String borrower;
    private int amount;
    private boolean isPaid;
    private double interestRate;

    private static int maxLoanAmount = 200;
    //maxloanamount tracker is placed in this class with static such that any loan objects
    //will be able to share this same attribute with the same value

    public Loan(String borrower, int amount, double interestRate) {
        this.borrower = borrower;
        this.amount = amount;
        this.interestRate = interestRate;
        this.isPaid = false;
    }

    public void setAsPaid() {
        isPaid = true;
    }

    public boolean isPaid() {
        return isPaid;
    }

    public String getBorrower() {
        return borrower;
    }

    public String getDisplayString() {
        return borrower + ": " + amount;
    }

    public double getProfit() {
        return amount * interestRate;
    }

    public static int getMaxLoanAmount() {
        return maxLoanAmount;
}}
    //you can call this method on any of the loan object and it will return u the max loan amount
    //testing commit2