/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lap7;

import java.util.Comparator;
import lap7.bai2.SinhVienPoly;

/**
 *
 * @author Admin
 */
public class ascDiem implements Comparator<SinhVienPoly>{
    @Override
    public int compare(SinhVienPoly arg0, SinhVienPoly arg1) {
        if      (arg0.getDiem() < arg1.getDiem()) return -1;
        else if (arg0.getDiem() > arg1.getDiem()) return 1;
        else return 0;
    } 
}
