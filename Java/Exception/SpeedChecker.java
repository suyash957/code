// Program for custom exception to check speed of car on highway:
class SpeedLimitExceededException extends Exception {
    public SpeedLimitExceededException(String message) {
        super(message);
    }
}

public class SpeedChecker {
    public static void main(String[] args) {
        int carSpeed = 130; // Assume car speed as 130 Km/hr
        try {
            if (carSpeed > 120) {
                throw new SpeedLimitExceededException("Speed Limit Exceeded!");
            } else {
                System.out.println("Within speed limit.");
            }
        } catch (SpeedLimitExceededException e) {
            System.out.println(e.getMessage());
        }
    }
}
