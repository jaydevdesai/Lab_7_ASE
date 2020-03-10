public class Trig {

    /**
     * This function creates sin of the given angle and returns the answer.
     * @param angle - input Given
     * @return SinX - Sin value of given angle
     */
    public static double sin(double angle){

        double rad =  deg2rad ((int) angle);
        double ans = 0.0;

        for(int i=1;i<100;i+=4){
            ans+=  pow ( rad,i) / fact (i);
        }
        for(int i=3;i<100;i+=4){
            ans-= (pow ( rad,i) / fact (i));
        }
        return ans;
    }

    /**
     * This function creates cos of the given angle and returns the answer.
     * @param angle - input Given
     * @return CosX - Cos value of given angle
     */
    public static double cos(double angle){
        double rad =  deg2rad ((int)angle);
        double ans = 1;

        for(int i=4;i<100;i+=4){
            ans+=  pow ( rad,i) / fact (i);
        }
        for(int i=2;i<100;i+=4){
            ans-= (pow ( rad,i) / fact (i));
        }
        return ans;
    }

    /**
     * This function creates tan of the given angle as per the equation sin/cos and returns the answer.
     * @param angle - input Given
     * @return tanX - tan value of given angle
     */
    public static double tan(double angle){
        return sin (angle)/cos (angle);
    }

    /**
     * Converts degree value into radian
     * @param angle Angle to convert
     * @return Radian value of degree
     */
    public static double deg2rad(int angle){
        return angle * 0.017453292519943295;
    }
    /**
     * Finds the factorial of the given number n
     * @param n Number to find factorial
     * @return factorial of n
     */
    public static double fact(double n){
        if (n == 0)
            return 1.0;
        return n * fact (n - 1.0);
    }

    /**
     * Finds the power of given value
     * @param a - number
     * @param b - exponent
     * @return Returns the value
     */

    public static double pow(double a, double b){
        double ans = a;
        for(int i=2;i<=b;i++){
            ans=ans*a;
        }
        return ans;
    }

}
