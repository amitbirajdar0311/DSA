public class AccessModifiers {
    public static void main(String[] args) {
        BankAccount account = new BankAccount();
        account.username = "John";
        // account.password = "1234"; // This will give an error as password is private
        account.setPassword("1234");
        System.out.println("Username: " + account.username);
        // System.out.println("Password: " + account.password); // This will give an error as password is private
        
        
    }
}
class BankAccount{
    String username;
    @SuppressWarnings("unused")
    private String password;

    public void setPassword(String password){
        this.password = password;
    }
}