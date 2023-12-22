package daHinh;



public class Main {
    public static void main(String[] args) {
        LoginManagerImproved loginManager = new LoginManagerImproved();


        User user = new PaidUser("Paid","paid@gmail.com","1111","Pro");
        loginManager.processLogin(user);

        user = new EnterpriseUser("Enterprise","enterprise@gmail.com","2222","Vip");
        loginManager.processLogin(user);

        user = new Administrator("Admin","admin@gmail.com","3333","Svip");
        loginManager.processLogin(user);



    }
}
