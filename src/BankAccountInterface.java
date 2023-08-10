public interface BankAccountInterface {
    String fetchBalance(String Password);
    String addMoney(double amount);
    String withdrawMoney(double amount,String Password);
    String changePassword(String oldPassword,String newPassword);
    double claculateInterest(int year);
}
