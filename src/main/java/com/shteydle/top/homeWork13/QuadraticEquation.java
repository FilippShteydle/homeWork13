package com.shteydle.top.homeWork13;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.ArrayList;

public class QuadraticEquation {

    private int a;
    private int b;
    private int c;
    private static ArrayList<Double> arr = new ArrayList<>();
    private static double[] root = new double[2];
    DecimalFormat numberFormat = new DecimalFormat("#.00");
    private static boolean flag = false;

    public QuadraticEquation(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    // Вычисление корней уравнения
    public static void getRoot(QuadraticEquation quadraticEquation) {

        double d = Math.pow(quadraticEquation.getB(), 2) - 4 * quadraticEquation.getA() * quadraticEquation.getC();
        if (d > 0) {
            double x1 = (-quadraticEquation.getB() - Math.sqrt(d)) / (2 * quadraticEquation.getA());
            double x2 = (-quadraticEquation.getB() + Math.sqrt(d)) / (2 * quadraticEquation.getA());
            BigDecimal bd1 = new BigDecimal(x1);
            BigDecimal bd2 = new BigDecimal(x2);
            root[0] = bd1.setScale(2, RoundingMode.HALF_UP).doubleValue();
            root[1] = bd2.setScale(2, RoundingMode.HALF_UP).doubleValue();
            arr.add(root[0]);
            arr.add(root[1]);
            System.out.println("корень 1 = " + root[0] + "; корень 2 = " + root[1]);
        } else if (d == 0) {
            double x1 = (-quadraticEquation.getB()) / (2 * quadraticEquation.getA());
            BigDecimal bd1 = new BigDecimal(x1);
            root[0] = bd1.setScale(2, RoundingMode.HALF_UP).doubleValue();
            arr.add(root[0]);
            System.out.println("корень = " + root[0]);
        } else {
            System.out.println("Корней нет");
        }
        flag = true;
    }

    // Вычисление экстремума уравнения
    public static void getExtrem(QuadraticEquation quadraticEquation) {

        double x = (double)-quadraticEquation.getB() / (2 * quadraticEquation.getA());
        double extrem = quadraticEquation.getA() * Math.pow(x, 2) + quadraticEquation.getB() * x + quadraticEquation.getC();

        if (quadraticEquation.getA() > 0) {
            System.out.println("Минимум равен: " + extrem);
        } else {
            System.out.println("Максимум равен: " + extrem);
        }
    }

    // Вычисление интервалов
    public static void getInterval(QuadraticEquation quadraticEquation) {

        if (!flag) {
            QuadraticEquation.getRoot(quadraticEquation);
        }
        if (quadraticEquation.getA() > 0) {
            System.out.println("Функция убывает, если х принадлежит: (-∞;" + root[0] + "]");
            System.out.println("Функция возрастает, если х принадлежит: [" + root[1]  + ";-∞)");
        } else {
            System.out.println("Функция возрастает, если х принадлежит: (-∞;" + root[0] + "]");
            System.out.println("Функция убывает, если х принадлежит: [" + root[1]  + ";-∞)");
        }
    }

    // Получение наименьшого корня из списка
    public static void getMinRoot() {

        double d = arr.get(0);
        for (int i = 1; i < arr.size(); i++) {
            if (d > arr.get(i)) {
                d = arr.get(i);
            }
        }
        System.out.println("Наименьший корень: " + d);
    }

    // Получение наибольшого корня из списка
    public static void getMaxRoot() {
        double d = arr.get(0);
        for (int i = 1; i < arr.size(); i++) {
            if (d < arr.get(i)) {
                d = arr.get(i);
            }
        }
        System.out.println("Наибольший корень: " + d);
    }

    public static void rootsToString(){
        for (double d : arr) {
            System.out.println(d);
        }
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public int getC() {
        return c;
    }

    public void setC(int c) {
        this.c = c;
    }

    @Override
    public String toString() {
        return "Квадратное уравнение: " + a + "x^2 + " + b + "x + " + c + " = 0";
    }
}
