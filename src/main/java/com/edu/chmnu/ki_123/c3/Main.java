package com.edu.chmnu.ki_123.c3;

public class Main {

    public static boolean paralel(int x1, int x2, int x3, int x4, int y1, int y2, int y3, int y4){
        int a1 = y2 - y1;
        int b1 = x1 - x2;
        int c1 = x2 * y1 - x1 * y2;

        int a2 = y4 - y3;
        int b2 = x3 - x4;
        int c2 = x4 * y3 - x3 * y4;

        int determ = a1 * b2 - a2 * b1;

        if(determ == 0){
            return false;
        }

        double x = (double)(b1 * c2 - b2 * c1) / determ;
        double y = (double)(a2 * c1 - a1 * c2) / determ;

        if(isThis(x1, x2, y1, y2, x, y) && isThis(x3, x4, y3, y4, x, y)){
            return true;
        }

        return false;
    }

    public static boolean isThis(int x1, int x2, int y1, int y2, double x, double y){
        return x >= Math.min(x1, x2) && x <= Math.max(x1, x2) && y >= Math.min(y1, y2) && y <= Math.max(y1, y2);
    }

    public static void main(String[] args) {

        int x1 = 0, y1 = 0, x2 = 3, y2 = 3, x3 = 0, y3 = 3, x4 = 3, y4 = 0;
        if(paralel(x1, x2, x3, x4, y1, y2, y3, y4)){
            System.out.println("Line is cross");
        }
        else{
            System.out.println("Line is not cross");
        }

    }
}