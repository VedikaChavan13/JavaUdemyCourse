public class Account {
    private String number;
    private double balance;
    private String customerName;
    private String customerEmail;
    private String customerPhone;

    // No-argument constructor (DEFAULT CONSTRUCTOR)
    public Account() {
        this("56789", 2.50, "Default Name", "default@email.com", "000-000-0000");
        System.out.println("Empty constructor called");
    }

    // Parameterized constructor
    public Account(String number, double balance, String customerName,
                   String customerEmail, String customerPhone) {
        System.out.println("Account constructor with parameters called");
        this.number = number;
        this.balance = balance;
        this.customerName = customerName;
        this.customerEmail = customerEmail;
        this.customerPhone = customerPhone;
    }

    // Deposit Method
    public void depositFunds(double depositAmount) {
        if (depositAmount > 0) {
            balance += depositAmount;
            System.out.println("Deposit of $" + depositAmount + " made. New balance: $" + balance);
        } else {
            System.out.println("Deposit amount must be greater than zero.");
        }
    }

    // Withdrawal Method
    public void withdrawalFunds(double withdrawalAmount) {
        if (withdrawalAmount > 0) {
            if (balance >= withdrawalAmount) {
                balance -= withdrawalAmount;
                System.out.println("Withdrawal of $" + withdrawalAmount + " processed. Remaining balance: $" + balance);
            } else {
                System.out.println("Insufficient funds! Available balance: $" + balance);
            }
        } else {
            System.out.println("Withdrawal amount must be greater than zero.");
        }
    }

    // Getters and Setters
    public String getNumber() { return number; }
    public void setNumber(String number) { this.number = number; }
    public double getBalance() { return balance; }
    public void setBalance(double balance) { this.balance = balance; }
    public String getCustomerName() { return customerName; }
    public void setCustomerName(String customerName) { this.customerName = customerName; }
    public String getCustomerEmail() { return customerEmail; }
    public void setCustomerEmail(String customerEmail) { this.customerEmail = customerEmail; }
    public String getCustomerPhone() { return customerPhone; }
    public void setCustomerPhone(String customerPhone) { this.customerPhone = customerPhone; }
}
