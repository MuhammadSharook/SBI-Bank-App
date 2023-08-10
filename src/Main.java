public class Main {
    public static void main(String[] args) {
        SBIAccount SharookAcc = new SBIAccount("MuhammadSharook","SHArook18",100000);

        System.out.println(SharookAcc);// printed the attricutes via toString

        // fetch balance
        System.out.println(SharookAcc.fetchBalance("xyz"));//wrong password
        System.out.println(SharookAcc.fetchBalance("SHArook18"));//correct password

        // add money
        System.out.println(SharookAcc.addMoney(100000));

        //withdraw money
        System.out.println(SharookAcc.withdrawMoney(1000000,"SHArook18"));
        System.out.println(SharookAcc.withdrawMoney(5000,"SHArook18"));
        System.out.println(SharookAcc.withdrawMoney(5000,"random"));

        //change password
        System.out.println(SharookAcc.changePassword("SHArook18","SHArook12"));
        System.out.println(SharookAcc.fetchBalance("SHArook12"));

        //calculate interest
        System.out.println(SharookAcc.claculateInterest(4));
    }
}