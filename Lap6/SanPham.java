/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lap6;

/**
 *
 * @author Admin
 */
public class SanPham {
    String tenSp, hang;
    double gia;
    
    public SanPham(String t, String h, double g) {
       this.tenSp = t;
       this.hang = h;
       this.gia = g;
    }
    
    @Override
    public String toString() {
        return this.tenSp + ", hang: " + this.hang + ", gia: " + this.gia + "$";
    }
    

}
