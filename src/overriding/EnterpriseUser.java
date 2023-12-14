package overriding;
public class EnterpriseUser extends User {
    private String company;

    public EnterpriseUser(String name, String email, String password, String company) {
        super(name, email, password);
        this.company = company;
    }
    public void login(){
        System.out.println("hello " + this.name + "!");
        System.out.println("Enter " + this.company + " Enterprise");
    }
}
