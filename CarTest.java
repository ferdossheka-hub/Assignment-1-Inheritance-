
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


            Saab95 s4 = new Saab95();
            double speedbefore = s4.getCurrentSpeed();
            s4.gas(1);
            double speedafter = s4. getCurrentSpeed();
            boolean resultee = speedafter == speedbefore;
            System.out.println(resultee);



        }
    }