public class UtilityMathClass
{
    public static int Sum(int a, int b) {
        return a + b;
    }

    public static int Dist(int a, int b) {
        return a - b;
    }

    public static int Mult(int a, int b) {
        return a * b;
    }

    public static int Division(int a, int b) {
        return a / b;
    }

    public static boolean IsEven(int a){
        if(a % 2 == 0){
            return true;
        }
        return false;
    }
}
