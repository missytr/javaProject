<<<<<<< HEAD
package javaProject;
import java.util.Scanner;
public class circlePointPosition {
    public static void main(String[] args) {
        double xC, yC, radius, xM, yM, distance;
        Scanner sc = new Scanner(System.in);
        System.out.println("Xác định tọa độ điểm M");
        System.out.print("Vui long nhập tọa độ x của tâm đường tròn: ");
        xC = sc.nextDouble();
        System.out.print("Vui long nhập tọa độ y của tâm đường tròn: ");
        yC = sc.nextDouble();
        System.out.print("Vui lòng nhập bán kính đường tròn: ");
        radius = sc.nextDouble();
        System.out.print("Vui long nhập tọa độ x của điểm M: ");
        xM = sc.nextDouble();
        System.out.print("Vui long nhập tọa độ y của điểm M: ");
=======
package PACKAGE_NAME;

import java.util.Scanner;

public class CirclePointPosition {
    public static void main(String[] args) {
        double xC, yC, radius, xM, yM, distance;
        Scanner sc = new Scanner(System.in);
        System.out.println("Xác định vị trí của điểm M so với đường tròn.");
        System.out.print("Vui lòng nhập tọa độ x của tâm đường tròn: ");
        xC = sc.nextDouble();
        System.out.print("Vui lòng nhập tọa độ y của tâm đường tròn: ");
        yC = sc.nextDouble();
        System.out.print("Vui lòng nhập bán kính của đường tròn: ");
        radius = sc.nextDouble();
        System.out.print("Vui lòng nhập tọa độ x của điểm M: ");
        xM = sc.nextDouble();
        System.out.print("Vui lòng nhập tọa độ y của điểm M: ");
>>>>>>> dd2941e9cf353a7343e4fcd5b8bfff2068cd2cfd
        yM = sc.nextDouble();
        distance = Math.sqrt(Math.pow((xM - xC), 2) + Math.pow((yM - yC), 2));
        if (distance < radius) {
            System.out.println("Điểm M nằm trong đường tròn.");
        } else if (distance == radius) {
            System.out.println("Điểm M nằm trên đường tròn.");
        } else {
            System.out.println("Điểm M nằm ngoài đường tròn.");
        }
    }
}
<<<<<<< HEAD
=======

>>>>>>> dd2941e9cf353a7343e4fcd5b8bfff2068cd2cfd
