package daHinh;


public class PaidUser extends User {
        public String membership;

        public PaidUser(String name, String email, String password, String membership) {
            super(name, email, password);
            this.membership = membership;
        }

        public void login(){
            System.out.println("hello " + this.name + "!");
            System.out.println("Enter " + this.membership + " Membership");
        }
        public void enterPage(){
            System.out.println("Enter Page! " + this.membership );
        }
    }

