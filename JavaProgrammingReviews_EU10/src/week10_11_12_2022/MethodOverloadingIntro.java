package week10_11_12_2022;

public class MethodOverloadingIntro {
    public static void main(String[] args) {
        //I want to add two number
        int i=23;
        double d=24.5;
        float f=23.5f;//(float)23.5;
        sum(i,d);
        sumd(d,f);
    }

    public static void sumd(double d, float f) {
    }

    public static void sum(int i, double d) {
    }
}
