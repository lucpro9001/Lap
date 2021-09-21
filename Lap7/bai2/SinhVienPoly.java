/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lap7.bai2;


import static lap7.Lap7.*;
/**
 *
 * @author Admin
 */
public abstract class SinhVienPoly {
    String hoTen, nganh;
    
    public SinhVienPoly(String h, String n) {
        hoTen = h;
        nganh = n;
    }
    
    public abstract double getDiem();
    
    public String getHocLuc() {
        double d = this.getDiem();
        String rank;
        if      (d < 5.0)   rank = "Yeu";
        else if (d < 6.5)   rank = "TB";
        else if (d < 7.5)   rank = "Kha";
        else if (d < 9.0)   rank = "Gioi";
        else                rank = "GOD";
        return rank;
    }
    
    public void xuat() {
        println(this);
    }
    
    @Override
    public String toString() {
        return this.hoTen + ", nganh: " + this.nganh + ", diem: " + this.getDiem() + ", rank: " + this.getHocLuc();
    }
    
    
    
}
