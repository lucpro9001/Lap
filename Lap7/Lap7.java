/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lap7;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Dictionary;
import java.util.Hashtable;
import java.util.Scanner;
import lap7.bai1.Vuong;
import lap7.bai1.ChuNhat;
import lap7.bai2.SinhVienBiz;
import lap7.bai2.SinhVienIT;
import lap7.bai2.SinhVienPoly;

/**
 *
 * @author Admin
 */
public class Lap7 {
    
    
    static Scanner scanner = new Scanner(System.in);

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
//        bt1Display();
//        bt2Display();
        bt4Display();
//        sinhviens.add(new SinhVienIT("hoa", 10, 10, 10));
//        sinhviens.add(new SinhVienIT("hoa1", 10, 10, 10));
//        sinhviens.add(new SinhVienIT("hoa", 9, 8, 7));
//        danhSachGioi();

    }
    
    // bai tap 1
    static void bt1Display() {
        ChuNhat a = new ChuNhat(2, 3);
        Vuong b = new Vuong(2);
        a.xuat();
        b.xuat();
    }
    
    // bai tap 2
    static void bt2Display() {
        SinhVienPoly a = new SinhVienIT("a", 10, 8, 10);
        SinhVienPoly b = new SinhVienBiz("b", 10, 7);
        a.xuat();
        b.xuat();
    }
   
    // bat tap 3
    // class SinhVienPoly, SinhVienIT, SinhVienBiz
    
    // bai tap 4
    static ArrayList<SinhVienIT> sinhviens = new ArrayList<>();

    static void nhapDanhSach() {
        println("De thoat che do nhap danh sach, go lenh 'thoat'");
        String lenh;
        Dictionary dict = new Hashtable();
        while (true) {            
            print("Ten: ");
            lenh = scanner.nextLine();
            if(lenh.equals("thoat")) {bt4Display(); return;}
            dict.put("ten", lenh);
            print("Java: ");
            lenh = scanner.nextLine();
            if(lenh.equals("thoat")) {bt4Display(); return;}
            dict.put("java", lenh);
            print("CSS: ");
            lenh = scanner.nextLine();
            if(lenh.equals("thoat")) {bt4Display(); return;}
            dict.put("css", lenh);
            print("HTML: ");
            lenh = scanner.nextLine();
            if(lenh.equals("thoat")) {bt4Display(); return;}
            dict.put("html", lenh);
            
            sinhviens.add(new SinhVienIT(dict));
        }
    }
    static void inDanhSach() {
        sinhviens.forEach(e -> {println(e);});
    }
    static void danhSachGioi() {
        for(var e : sinhviens) {
            if(e.getHocLuc().equals("Gioi")) println(e);
        }
    }
    static void ascDiem() {
        Collections.sort(sinhviens, new ascDiem());
        inDanhSach();
    }
    static void bt4Display() {
        String x;
        println("1. Nhap danh sach sinh vien IT");
        println("2. Xuat danh sach sinh vien IT");
        println("3. Xuat danh sach sinh vien IT co hoc luc gioi");
        println("4. Sap xep sinh vien IT theo diem");
        println("5. Thoat");
        
        x = scanner.nextLine();
        
        switch(x) {
            case "1": nhapDanhSach(); break;
            case "2": inDanhSach(); break;
            case "3": danhSachGioi(); break;
            case "4": ascDiem(); break;
            case "5": System.exit(0); break;
            default : println("Chon 1-5");
        }
     
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
