/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lap5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Lap5 {
    
    static Scanner scanner = new Scanner(System.in);
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
//        bt1Display();
//        bai tap 2  
        menu();
//        bt3Display();


    }
    
    // bai tap 1
    static void bt1Display() {
        double x;
        var array = new ArrayList<Double>();
        while(true) {
            x = scanner.nextDouble();
            array.add(x);
            System.out.print("Nhap them Y/N?");
            // ignore
            String N = scanner.nextLine();
            if (scanner.nextLine().equals("N")) {
                break;
            }
        }
        
        
        array.forEach(e -> {
            System.out.printf("%f ", e);
        });
    }
    
    // bai tap 2
    static void menu() {
        var array = new ArrayList<String>();
        
        nhap(array);
        xuat(array);
        sapxep(array);
        ngaunhien(array);
        xoa(array);
        
    }

    private static void nhap(ArrayList<String> array) {
        String hoVaTen;
        while(true) {
            System.out.print("Nhap ho ten: ");
            hoVaTen = scanner.nextLine();
            array.add(hoVaTen);
            System.out.print("Nhap them Y/N?");
            // ignore
//            String N = scanner.nextLine();
            if (scanner.nextLine().equals("N")) {
                break;
            }
        }
    }

    private static void xuat(ArrayList<String> array) {
        array.forEach(e ->{
            System.out.printf("%s ", e);
        });
        System.out.println();
    }

    private static void sapxep(ArrayList<String> array) {
        Collections.sort(array);
        Collections.reverse(array);
        xuat(array);
    }

    private static void ngaunhien(ArrayList<String> array) {
        Collections.shuffle(array);
        xuat(array);
    }

    private static void xoa(ArrayList<String> array) {
        String x;
        System.out.println("Nhap ho ten can xoa");
        x = scanner.nextLine();
        array.remove(x);
        xuat(array);
    }
    
    // bai 3
    private static void bt3Display() {
        
        var sanphams = new ArrayList<SanPham>();
        int x;
        System.out.println("1. Nhap danh sach san pham tu ban phim");
        System.out.println("2. Sap xep giam dan theo gia va xuat ra man hinh");
        System.out.println("3. Tim va xoa san pham theo ten nhap tu ban phim");
        System.out.println("4. Xuat gia trung binh cua cac san pham");
        System.out.println("5. Exit");
        System.out.print("Chon 1 - 5: ");
        
        x = scanner.nextInt();
        // ignore
        var ignore  = scanner.nextLine();
        switch(x) {
            case 1: bai3_1(sanphams); break;
            case 2: bai3_2(sanphams); break;
            case 3: bai3_3(sanphams); break;
            case 4: bai3_4(sanphams); break;
            case 5: System.exit(0); break;
            default: System.out.println("Chon 1 - 5");
        }

    }

    private static void bai3_1(ArrayList<SanPham> sanphams) {
        String sp;
        double gia;
        SanPham sanpham;

        while(true) {
            System.out.print("Ten sp: ");
            sp = scanner.nextLine();
            System.out.print("Gia: ");
            gia = scanner.nextDouble();
            
            
            sanpham = new SanPham(sp, gia);
            sanphams.add(sanpham);
            
            System.out.print("Nhap them Y/N?");
            // ignore
            var N = scanner.nextLine();
            if (scanner.nextLine().equals("N")) {
                break;
            }
        }
        printSanPhams(sanphams);
    }

    private static void printSanPhams(ArrayList<SanPham> sanphams) {
        sanphams.forEach(e -> {
            System.out.println(e);
        });
    }

    private static void productIsEmty() {
        System.out.println("Khong co san pham nao co san! Chon 1 de tao moi san pham");
        bt3Display();
    }
    
    static class sortByGia implements Comparator<SanPham> {
        // Used for sorting in ascending order of
        // mark number
        @Override
        public int compare(SanPham a, SanPham b) {
            if(a.gia < b.gia) return -1;
            else if (a.gia > b.gia) return 1;
            
            return 0;
        }
    }
   
    private static void bai3_2(ArrayList<SanPham> sanphams) {
        if(sanphams.isEmpty()) {
            productIsEmty();
            return;
        }
        Collections.sort(sanphams, new sortByGia());
        printSanPhams(sanphams);
    }

    private static void bai3_3(ArrayList<SanPham> sanphams) {
        if(sanphams.isEmpty()) {
            productIsEmty();
            return;
        }
        String x;
        int index;
        SanPham temp;
        
        System.out.print("Nhap ten sp: ");
        x = scanner.nextLine();

        index = sanphams.indexOf(new SanPham(x));
        if(index != -1) {
            temp = sanphams.get(index);
            System.out.println(temp +  ". Ban co muon xoa san pham nay(Y/N)?");
            if(scanner.nextLine().equals("Y"))
                sanphams.remove(temp);
        } else 
            System.out.println(x +  " khong ton tai!");
        
        
        printSanPhams(sanphams);
    }

    private static void bai3_4(ArrayList<SanPham> sanphams) {
        if(sanphams.isEmpty()) {
            productIsEmty();
            return;
        }
        double s = 0;
        
        for (var e : sanphams) {
            s += e.gia;
        }
        
        System.out.println("Gia tb cua cac san pham: " + s / sanphams.size());
    }
 
}
