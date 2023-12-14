package overriding;

public class Main {
    public static void main(String[] args) {
        User user = new User("User","user@gmail.com","0000");
        PaidUser paid = new PaidUser("Paid","paid@gmail.com","1111","Pro");
        EnterpriseUser enterprise = new EnterpriseUser("Enterprise","enterprise@gmail.com","2222","Vip");
        Administrator admin = new Administrator("Admin","admin@gmail.com","3333","Svip");

        user.login();
        paid.login();
        enterprise.login();
        admin.login();
    }
}
