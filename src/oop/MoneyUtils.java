package oop;

public class MoneyUtils {
    public static boolean isEqual(double a, double b){
        return isEqual(a, b, 0.0001);
    }

    public static boolean isEqual(double a, double b, double epsilon){
        return Math.abs(a - b) <= epsilon;
    }
}
