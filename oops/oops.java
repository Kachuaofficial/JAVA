public class oops {
    public static void main(String[] args) {

       
        BankAccount myAc = new BankAccount();

        myAc.username = "TheOgCoder";
        myAc.setPassword("123456");

        System.out.println(myAc);

    }
}

class BankAccount {
    public String username;
    private String password;

    public void setPassword(String pwd) {
        password = pwd;
    }
}

