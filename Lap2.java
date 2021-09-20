/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lap2;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Lap2 {
    static Scanner scanner = new Scanner(System.in);

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
//        bt1Display();
//        bt2Display();
//        bt3Display();
        bt4Display();
    }
    
    // bai tap 1
    private static void bt1(double a, double b) {
        if(a == 0) {
            if(b == 0) {
                System.out.println("VSN");
            } else {
                System.out.println("VN");
            }
        } else {
            System.out.printf("x = %.3f\n", -b/a);
        }
    }
    
    private static void bt1Display() {
        double a, b;
        System.out.println("ax + b = 0");
        System.out.print("a = ");
        a = scanner.nextDouble();
        System.out.print("b = ");
        b = scanner.nextDouble();
        
        bt1(a, b);
    }

    // bai tap 2
    private static void bt2(double a,double b,double c) {
        if(a == 0) {
            bt1(b, c);
        } else {
            double delta = Math.pow(b, 2) - 4*a*c;
            if(delta < 0) System.out.println("VN");
            else if (delta == 0) System.out.printf("x = %.3f\n", -b/(2*a));
            else {
                double temp = Math.sqrt(delta);
                System.out.printf("x1 = %.3f, x2 = %.3f\n", (-b+temp)/(2*a), (-b-temp)/(2*a));
            }
        }
    }
    
    private static void bt2Display() {
        double a, b, c;
        System.out.println("ax^2 + bx + c = 0");
        System.out.print("a = ");
        a = scanner.nextDouble();
        System.out.print("b = ");
        b = scanner.nextDouble();
        System.out.print("c = ");
        c = scanner.nextDouble();
        
        bt2(a, b, c);
    }
    
    // bai tap 3
    private static void bt3Display() {
        double a;
        System.out.print("So dien: ");
        a = scanner.nextDouble();
        
        if(a < 50) {
            System.out.printf("Tien: %.3f\n", a*1000);
        } else {
            System.out.printf("Tien: %.3f\n", 50000 + (a - 50)*1200);
        }
        
    }
    
    // bai tap 4
    private static void bt4Display() {
        int a;
        System.out.println("1. Giai pt1");
        System.out.println("2. Giai pt2");
        System.out.println("3. Tien dien");
        System.out.println("4. Thoat");
        
        System.out.print("Chon chuc nang: ");
        a = scanner.nextInt();
        
        switch(a) {
            case 1: bt1Display(); break;
            case 2: bt2Display(); break;
            case 3: bt3Display(); break;
            default: System.exit(0);
        }
    }
    
}
