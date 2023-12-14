package overriding;

public class Administrator extends User{
    private String adminLevel;

    public Administrator(String name, String email, String password, String adminLevel) {
        super(name, email, password);
        this.adminLevel = adminLevel;
    }
    public void login(){
        System.out.println("hello " + this.name + "!");
        System.out.println("Enter " + this.adminLevel + " Admin");
    }
}
