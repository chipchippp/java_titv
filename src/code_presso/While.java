package code_presso;

public class While {
    public static void main(String[] args) {
        int i = 0;
        int[] reviews = {1,4,3,4,5,5};

        while (i < reviews.length){
            System.out.println("User-" + (i + 1) + " Review : " + reviews[i] + "star");
            i++;
        }
        System.out.println();


        int batteryCapacity = 0;
        boolean isBlutoothOn = false;
        boolean isWifiOn = false;
        boolean isDeviceReady = false;

        while (!isDeviceReady){
            System.out.println("device is not ready!!!");
            if (!isBlutoothOn){
                isBlutoothOn = true;
            }
            if (!isWifiOn){
                isWifiOn = true;
            }
            if (batteryCapacity < 100){
                batteryCapacity += 4;
                System.out.println("Battery : " +batteryCapacity);
            }
            System.out.println();
            isDeviceReady = isBlutoothOn && isWifiOn && (batteryCapacity == 100);
        }
    }
}
