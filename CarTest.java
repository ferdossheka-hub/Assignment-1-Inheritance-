
    public class CarTest {
        private static void reportResult(String testName, boolean success) {
            if (success)
                System.out.println("PASS: " + testName);
            else
                System.out.println("FAIL: " + testName);
        }

        public static void main(String[] args) {

            Saab95 s1 = new Saab95();

            boolean result = s1.getNrDoors() == 2;
            System.out.println(result);

            Volvo240 v1 = new Volvo240();

            double result1 = v1.speedFactor();

            System.out.println(result1);

            Volvo240 v2 = new Volvo240();

            double speed = v2.speedFactor();

            IO.print(speed);
        }
    }