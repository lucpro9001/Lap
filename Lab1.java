/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab1;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Lab1 {

    static Scanner keyScanner = new Scanner(System.in);
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        bt1();
        bt2();
        bt3();
        bt4();
    }
    
    // bai tap 1
    private static void bt1() {
        
        System.out.print("ho va ten: ");

        String hoTen = keyScanner.nextLine();
        
        System.out.print("diem tb:  ");
        
        float diemTB = keyScanner.nextFloat();
        
        System.out.printf("%s, Diem TB: %.3f\n", hoTen, diemTB);
        
    }
    
    // bai tap 2
    private static void bt2() {
        
        System.out.print("chieu dai a: ");
        float a = keyScanner.nextFloat();
        System.out.print("chieu rong B: ");
        float b = keyScanner.nextFloat();
        
        System.out.printf("CV: %f, DT: %f\n", (a+b)*2, a*b);

    }
    
    // bai tap 3
    private static void bt3() {
        System.out.print("chieu dai canh lap phuong: ");
        double a = keyScanner.nextDouble();
        System.out.printf("V: %f\n", Math.pow(a, 3));
    }
    
    // bai tap 4 
    private static void bt4() {
        System.out.println("ax2 + bx + c = 0");
        System.out.print("a: ");
        double a = keyScanner.nextDouble();
        System.out.print("b: ");
        double b = keyScanner.nextDouble();
        System.out.print("c: ");
        double c = keyScanner.nextDouble();
        
        double delta = Math.pow(b, 2) - 4*a*c;
        
        System.out.printf("SQRT(delta) = %f\n", Math.sqrt(delta));
       
    }
}
