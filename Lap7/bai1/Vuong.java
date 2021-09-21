/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lap7.bai1;



/**
 *
 * @author Admin
 */
public class Vuong extends ChuNhat {
    
    public Vuong(double a) {
        super(a, a);
    }
    
    @Override
    public String toString() {
        return "a: " + this.a + ", CV: " + this.getChuVi() + ", DT: " + this.getDienTich();
    }
}
