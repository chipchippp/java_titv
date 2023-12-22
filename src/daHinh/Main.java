package daHinh;



public class Main {
    public static void main(String[] args) {
        User user = new User("User","user@gmail.com","0000");
        user.login();

        user = new PaidUser("Paid","paid@gmail.com","1111","Pro");
        user.login();
        user = new EnterpriseUser("Enterprise","enterprise@gmail.com","2222","Vip");
        user.login();

        user = new Administrator("Admin","admin@gmail.com","3333","Svip");
        user.login();
    }
}
