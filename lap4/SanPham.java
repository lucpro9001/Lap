/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lap4;

import java.util.Scanner;

/**
 *
 * @author Admin
 */

// bai tap 1, 4
public class SanPham {
    private String tenSp;
    private double donGia;
    private double giamGia;
    Scanner scanner = new Scanner(System.in);
    
    public SanPham(){
        
    }
    
    public SanPham(String t, double d) {
        this.tenSp = t;
        this.donGia = d;
        this.giamGia = 0;
    }
        
    public SanPham(String t, double d, double g) {
        this.tenSp = t;
        this.donGia = d;
        this.giamGia = g;
    }
        
    private double getThueNhapKhau() {
        return this.donGia * 0.1;
    }
    
    public void nhap() {
        String tensp;
        double dongia;
        double giamgia;
        
        System.out.println("Nhap san pham: ");
        System.out.print("Ten SP: ");
        tensp = scanner.nextLine();
        System.out.print("Don gia: ");
        dongia = scanner.nextDouble();
        System.out.print("Giam gia: ");
        giamgia = scanner.nextDouble();
        
        this.tenSp = tensp;
        this.donGia = dongia;
        this.giamGia = giamgia;
    }
                
    public void xuat() {
        String res = this.tenSp + ", don gia:  " + this.donGia + ", giam gia: " + this.giamGia + "%, ThueNK: " + this.getThueNhapKhau();
        System.out.println(res);
    }    
    
    public String getTenSP() {
        return this.tenSp;
    }
    
    public void setTenSp(String ten) {
        this.tenSp = ten;
    }
}
