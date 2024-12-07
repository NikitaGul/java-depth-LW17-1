package com.edu.chmnu.ki_123.c3_individ_2;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static double f(double x){
        return Math.log(Math.sqrt(x * x -3)) - x * x;
    }

    public static double fDerivate(double x){
        return x / (x * x - 3) - 2 * x;
    }

    public static double newtonSolve(double a, double b, double eps, double h) throws Exception {
        double steps = (b - a) / h;
        double x = a;
        for(double i = 0; i <= steps; ++i){
            double fx = f(x);
            double fDx = fDerivate(x);

            double xNext = x - fx / fDx;

            if(Math.abs(xNext - x) < eps){
                return xNext;
            }
            x = xNext;
        }
        throw new Exception("Iteration is small");
    }

    public static boolean checkExtremum(double y1, double y2, double y3){
        return (y2 > y1 && y2 > y3) || (y2 < y1 && y2 < y3);
    }

    public static List<Double> findExtremum(double a, double b, double h){
        List<Double> listOfExtremum = new ArrayList<>();
        for(double i = a + h; i <= b - h; i += h){
            double y1 = f(i - h);
            double y2 = f(i);
            double y3 = f(i + h);
                if(checkExtremum(y1, y2, y3)){
                    listOfExtremum.add(i);
                }
        }
        return listOfExtremum;
    }

    public static void main(String[] args) throws Exception {

        double a = 2.0, b = 10.0, h = 0.000005;
        double eps = 1e-1;

        try {
            double result = newtonSolve(a, b, eps, h);
            System.out.println(result);
        }
        catch (Exception e){
            System.out.println("Without roots");
        }

        List<Double> listOfExtremum = findExtremum(a, b, h);
        System.out.println(listOfExtremum.toString());

    }
}
