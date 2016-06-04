package com.study.gojava.mod04.Distance;

public class DistanceBetweenTwoPoints
        {
            static double square(double x)
            {
                return x*x;
            }

            public static double distanceBetweenTwoPoints(int x1, int y1, int x2, int y2)
            {
                return Math.sqrt(square(x2 - x1) + square(y2 - y1));
            }

        public static void main(String[] args)
        {
            Point a = new Point(0, 9);
            Point b = new Point(12, 5);

            System.out.println("There is the distance of " + distanceBetweenTwoPoints(a.getX(), a.getY(), b.getX(), b.getY()) + " between point A(" + a.getX() + ", " + a.getY() + ") and point B(" + b.getX() + ", " + b.getY() + ").");
        }


}
