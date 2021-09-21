/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lap6;

import java.util.ArrayList;
import java.util.Scanner;



/**
 *
 * @author Admin
 */
public class Lap6 {

    static Scanner scanner = new Scanner(System.in);
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
//        bt1Display();
//        bt2Display();
//        bt3Display();
    }
    
    // bai tap 1
    private static void bt1Display() {
        String hoVaTen, ho, ten;
        int fSp, lSp;
        
        hoVaTen = scanner.nextLine();
        
        hoVaTen = hoVaTen.trim();
        hoVaTen = hoVaTen.replaceAll("\\s+", " ");
        
        fSp = hoVaTen.indexOf(" ");
        lSp = hoVaTen.lastIndexOf(" ");
        ho = hoVaTen.substring(0, fSp);
        ten = hoVaTen.substring(lSp);

        hoVaTen = hoVaTen.replace(ho, ho.toUpperCase());
        hoVaTen = hoVaTen.replace(ten, ten.toUpperCase());
        
        println(hoVaTen);
    }
    
    // bai tap 2
    private static void bt2Display() {
        var sanphams = new ArrayList<SanPham>();
        sanphams.add(new SanPham("a", "nokia", 10));
        sanphams.add(new SanPham("h", "huawei", 20));
        sanphams.add(new SanPham("n", "nokia", 30));
        sanphams.add(new SanPham("i", "apple", 20));
        sanphams.add(new SanPham("k", "nokia", 100));
        
        for(var e : sanphams) {
            if(e.hang == "nokia") println(e);
        }
    }
    
    // bai tap 3
    private static void bt3Display() {
        var sinviens = new ArrayList<SinhVien>();
        sinviens.add(new SinhVien("duong luc"   , "luc0@gmail.com", "+84123456789", "221482584"));
        sinviens.add(new SinhVien("duong phuong", "luc1@gmail.com", "+84123456789", "221482584"));
        sinviens.add(new SinhVien("duong hang"  , "luc2@gmail.com", "+84123456789", "221482584"));
        sinviens.add(new SinhVien("duong leesin", "luc3@gmail.com", "+84123456789", "221482584"));
        sinviens.add(new SinhVien("duong yasuo" , "luc4@gmail.com", "+84123456789", "221482584"));
        
    }

    public static void println(Object a) {
        System.out.println(a);
    }
    public static void print(Object a) {
        System.out.print(a);
    }
    public static void print(String a, Object ...args) {
        System.out.printf(a, args);
        System.out.println("");
    }

    
}
