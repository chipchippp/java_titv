package inheritance;

public class EnterpriseUser extends User{
    private String company;
    private int temporaryValue;

    public EnterpriseUser(){
        System.out.println("Enterprise User");
    }
//    public EnterpriseUser(int parentTemp, int myTemp){
//        super.temporaryValue = parentTemp;
//        this.temporaryValue = myTemp;
//    }

    public EnterpriseUser(String name, String email, String password, String company) {
        super(name, email, password);
        this.company = company;
    }

    public void printEnterpriseUserInfo(){
        super.printInfo();
        System.out.println("company " + this.company);
    }
}
