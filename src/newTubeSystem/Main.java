package newTubeSystem;

public class Main {
    public static void main(String[] args) {


        UserName user = new UserName("adb", "abc@gmail.com", "1234", 220);

//        user.setName("adb");
//        user.setEmail("abc@gmail.com");
//        user.setPassword("1234");
//        user.setAge(120);
//        user.password = "1234";

        user.printInfo();
//        System.out.println(user.getEmail());

        if (user.isOver20()){
            System.out.println("is under 20");
        }else {
            System.out.println("is over 20");
        }
        user.isOver20();
    }
}
