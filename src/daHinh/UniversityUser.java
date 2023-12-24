package daHinh;

public class UniversityUser extends User{
    private String university;

    public UniversityUser(String name, String email, String password, String university) {
        super(name, email, password);
        this.university = university;
    }

    public void login(){
        System.out.println("hello " + this.name + "!");
        System.out.println("login success");
    }

    public void enterPage(){
        System.out.println("Enter Page! " + this.university);
    }
}
