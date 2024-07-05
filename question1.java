public class GamePlatform {
    public static double getFinalSpeed(double initialSpeed, int[] inclinations) {

        // throw new UnsupportedOperationException("Waiting to be implemented.");

        double currentSpeed = initialSpeed;

        for (int inclination : inclinations) {
            // Convert inclination from degrees to radians
            double angleInRadians = Math.toRadians(inclination);
            
            // Calculate the proportional change in speed based on sine of the angle
            double speedChange = Math.sin(angleInRadians);
            
            // Update current speed
            currentSpeed += speedChange * initialSpeed;
        }

        return currentSpeed;
    }

    public static void main(String[] args){
        System.out.println(getFinalSpeed(60.0, new int[] { 0, -30, 0, 45, 0 })); //should print 45
    }
}