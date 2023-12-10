package inheritance;

public class User {
    public String name;
    public String email;
    public String password;

    public void login(){
        System.out.println("hello " + this.name + "!");
        System.out.println("login success");

    }
    public void printInfo(){
        System.out.println(
                        "name = " + this.name + '\n' +
                        "email = " + this.email + '\n' +
                        "password = " + this.password
        );
    }
}
