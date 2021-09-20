/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lap4;

/**
 *
 * @author Admin
 */
public class Lap4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        bt3Display();
    }
    
    
    // bai tap 2
    static void bt2Display() {
        SanPham a = new SanPham();
        SanPham b = new SanPham();
        
        a.nhap();
        a.xuat();
        b.nhap();
        b.xuat();
    }
    
    // bai tap 3
    static  void bt3Display() {
        SanPham a = new SanPham("a", 20, 10);
        SanPham b = new SanPham("b", 20);
        
        a.xuat();
        b.xuat();
    }
   
}

