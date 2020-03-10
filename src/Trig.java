public class Trig {

    public static double sin(double angle){

        return 0;
    }
    public static double cos(double angle){
        return 0;
    }
    public static double tan(double angle){
        return 0;
    }
    public static double deg2rad(double angle){
        return angle * 3.141592653589793238 / 180.0;
    }

    public static int fact(int n){
        if (n == 0)
            return 1;
        return n * fact (n - 1);
    }

    public static int pow(int a, int b){
        int ans = a;
        for(int i=2;i<=b;i++){
            ans=ans*a;
        }
        return ans;
    }
    public static void main (String[] args) {
        //System.out.println (pow (2,5));
    }
}
