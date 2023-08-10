import java.util.UUID;

public class SBIAccount implements BankAccountInterface{
    private String Name;
    private String AccountNo; //UUID
    private String Password;
    private double balance;
    final double interestRate = 7.4;
    final String IFSCCode = "SBI0001";

    public SBIAccount() {
    }

    public SBIAccount(String name, String Password, double balance) {
        this.Name = name;
        this.Password = Password;
        this.balance = balance;
        this.AccountNo = String.valueOf(UUID.randomUUID());
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getAccountNo() {
        return AccountNo;
    }

    public void setAccountNo(String accountNo) {
        AccountNo = accountNo;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        Password = password;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getIFSCCode() {
        return IFSCCode;
    }

    @Override
    public String fetchBalance(String Password) {
        if(this.Password.equals(Password))
        {
            return "Your Balance is : " + this.balance;
        }
        return "Incorrect Password !!!";
    }

    @Override
    public String addMoney(double amount) {
         this.balance += amount;
         return "Amount added Successfully. New Balance is : " + this.balance;
    }

    @Override
    public String withdrawMoney(double amount, String Password) {
        if(this.Password.equals(Password))
        {
            if(this.balance < amount)
            {
                return "Insufficient Balance !!!";
            }
            this.balance -= amount;
            return "Amount Deducted Successfully. New Balance is : " + this.balance;
        }
        return "Incorrect Password !!!";
    }

    @Override
    public String changePassword(String oldPassword, String newPassword) {
        if(this.Password.equals(oldPassword))
        {
            this.Password = newPassword;
            return "Password Changed Successfully.";
        }
        return "Incorrect Original Password !!!";
    }

    @Override
    public double claculateInterest(int year) {
        return (this.balance * this.interestRate * year)/100.0;
    }

    @Override
    public String toString() {
        return "SBIAccount{" +
                "Name='" + Name + '\'' +
                ", AccountNo='" + AccountNo + '\'' +
                ", Password='" + Password + '\'' +
                ", balance=" + balance +
                ", interestRate=" + interestRate +
                ", IFSCCode='" + IFSCCode + '\'' +
                '}';
    }
}
