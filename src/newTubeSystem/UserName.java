package newTubeSystem;

public class UserName {
     private String name;
    private String email;
    private String password;
    private int age;

    public UserName(String name, String email, String password, int age) {
        this.name = name;
        this.email = email;
        this.password = password;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age < 20){
            age = 0;
        } else if (age > 100){
            age = 100;
        }
        this.age = age;
    }

    public void printInfo(){
        System.out.println(
                "name = " + name + '\n' +
                "email = " + email + '\n' +
                "password = " + password + '\n' +
                "age = " + age
        );
    }
    public boolean isOver20(){
        return age >= 20;
    }

}
