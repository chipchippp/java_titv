package inheritance;

public class Main {
    public static void main(String[] args) {
       UniversityUser amy = new UniversityUser();

       EnterpriseUser steve = new EnterpriseUser("steve","steve@gmail.com","1234","Java");
       steve.printEnterpriseUserInfo();
    }
}
