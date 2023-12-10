package inheritance;

public class Main {
    public static void main(String[] args) {
        PaidUser luke = new PaidUser();
        luke.name = "luke";
        luke.email = "luke@gmail.com";
        luke.password = "1234";
        luke.membership = "Pro";

        luke.login();
        luke.printInfo();
    }
}
