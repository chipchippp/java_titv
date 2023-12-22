package inheritance;

public class User {
    protected String name;
    protected String email;
    protected String password;
    protected int temporaryValue;

    public User (){
        System.out.println("User");
    }

    public User(String name, String email, String password) {
        System.out.println("User with 3 parameters");
        this.name = name;
        this.email = email;
        this.password = password;
    }

  /*  public void login(){
        System.out.println("hello " + this.name + "!");
        System.out.println("login success");
    }*/
    public void printInfo(){
        System.out.println(
                        "name = " + this.name + '\n' +
                        "email = " + this.email + '\n' +
                        "password = " + this.password
        );
    }

  
}
