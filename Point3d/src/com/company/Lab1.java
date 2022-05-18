package com.company;
import java.util.Scanner;

public class Lab1 {

    public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            System.out.println("Введите координаты первой точки:");
            Point3d A = new Point3d(in.nextDouble(), in.nextDouble(), in.nextDouble());
            System.out.println("Введите координаты второй точки:");
            Point3d B = new Point3d(in.nextDouble(), in.nextDouble(), in.nextDouble());
            System.out.println("Введите координаты третьей точки:");
            Point3d C = new Point3d(in.nextDouble(), in.nextDouble(), in.nextDouble());
            // Проверка на равность введенных координат точек
            if (A.equals(B)||B.equals(C)||C.equals(A))
                System.out.println("Ошибка: Есть равные точки!");
            else
                System.out.println("Площадь треугольника = " + computeArea(A, B, C));

        }
        // Вычисление площади треугольника по формуле Герона
        public static double computeArea(Point3d one, Point3d two, Point3d three){

            double a = one.distanceTo(two);
            double b = two.distanceTo(three);
            double c = three.distanceTo(one);

            double p = (a + c + b) / 2;

            return Math.sqrt(p * (p - a) * (p - c) * (p - b));

        }
    }
