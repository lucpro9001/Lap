/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lap8;

/**
 *
 * @author Admin
 */
public class Lap8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double[] a = {1, 2, 3};
        double[] b = {1, 2, 3};
        double s1 = XPoly.sum(a);
        double s2 = XPoly.sum(a, b, a, a, b);
        double min = XPoly.min(1, 2, 3);
        double max = XPoly.max(1, 2, 3);
        String s = "  duong   tang  luc    ";
        s = XPoly.toCapitalize(s);
    }
    
    
    public static void println(Object a) {
        System.out.println(a);
    }
    public static void print(Object a) {
        System.out.print(a);
    }
    public static void print(String a, Object ...args) {
        System.out.printf(a, args);
    }
    public static void println(String a, Object ...args) {
        System.out.printf(a, args);
        println("");
    }
}
