package code_presso;

public class Continue {
    public static void main(String[] args) {
        String[] objects = {"road", "road", "road", "cat", "road"};

        for (String object : objects){
            if (!object.equals("road")){
                System.out.println("Stop! Detect object : " + object);
//                break;
                continue;
            }
            System.out.println("Driving");
        }


        int[] userPermission = {1,2,3,5,0,4,0,1};

        for (int permission :userPermission){
            if (permission == 0){
                System.out.println("Permission Denied!");
                continue;
            }
            System.out.println("This permission("+permission+") allow");
        }
    }
}
