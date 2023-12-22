package daHinh;



public class Main {
    public static void main(String[] args) {
        LoginManager loginManager = new LoginManager();

        PaidUser paid = new PaidUser("Paid","paid@gmail.com","1111","Pro");
        loginManager.processLogin(paid);

        EnterpriseUser enterprise = new EnterpriseUser("Enterprise","enterprise@gmail.com","2222","Vip");
        loginManager.processLogin(enterprise);

        Administrator admin = new Administrator("Admin","admin@gmail.com","3333","Svip");
        loginManager.processLogin(admin);



    }
}
