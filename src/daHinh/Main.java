package daHinh;

import overriding.Administrator;
import overriding.EnterpriseUser;
import overriding.PaidUser;
import overriding.User;

public class Main {
    public static void main(String[] args) {
        User user = new User("User","user@gmail.com","0000");
        overriding.PaidUser paid = new PaidUser("Paid","paid@gmail.com","1111","Pro");
        overriding.EnterpriseUser enterprise = new EnterpriseUser("Enterprise","enterprise@gmail.com","2222","Vip");
        overriding.Administrator admin = new Administrator("Admin","admin@gmail.com","3333","Svip");

        user.login();
        paid.login();
        enterprise.login();
        admin.login();

    }
}
