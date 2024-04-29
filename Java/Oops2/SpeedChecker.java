/**Write a program using final variable to check speed limit exceeds or not
on highway. If speed is greater than 100. Then generate alert message. **/

public class SpeedChecker{
    private static final int SPEED_LIMIT = 120;

    public static void speedcheck(int speed){
        if(speed > SPEED_LIMIT){
            System.out.println("Speed Limit Exceeded");    
        }else{
            System.out.println("Within Speed Limit");
        }
    }

    public static void main(String[] args){
        speedcheck(100);
        speedcheck(120);
    }
    
}

