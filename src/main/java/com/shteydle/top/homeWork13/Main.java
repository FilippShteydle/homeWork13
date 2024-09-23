package com.shteydle.top.homeWork13;

/*Определить класс Квадратное уравнение. Реализовать методы для поиска
корней, экстремумов, а также интервалов убывания/возрастания. Создать
массив/список/множество объектов и определить наибольшие и наименьшие по значению корни.*/

public class Main {

    public static void main(String[] args) {

        QuadraticEquation q1 = new QuadraticEquation(1, 2, -12);
        QuadraticEquation q2 = new QuadraticEquation(1, 5, -7);
        QuadraticEquation q3 = new QuadraticEquation(2, 8, 3);
        QuadraticEquation q4 = new QuadraticEquation(-5, 7, -5);
        QuadraticEquation q5 = new QuadraticEquation(1, 0, -3);

        System.out.println(q1);
        QuadraticEquation.getRoot(q1);
        //QuadraticEquation.getExtrem(q1);
        //QuadraticEquation.getInterval(q1);
        System.out.println(q2);
        QuadraticEquation.getRoot(q2);
        //QuadraticEquation.getExtrem(q2);
        System.out.println(q3);
        QuadraticEquation.getRoot(q3);
        //QuadraticEquation.getExtrem(q3);
        System.out.println(q4);
        QuadraticEquation.getRoot(q4);
        //QuadraticEquation.getExtrem(q4);
        System.out.println(q5);
        QuadraticEquation.getRoot(q5);
        //QuadraticEquation.getExtrem(q5);

        QuadraticEquation.getMinRoot();
        QuadraticEquation.getMaxRoot();

    }
}
