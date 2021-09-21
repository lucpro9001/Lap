/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lap6;

import static lap6.Lap6.print;

/**
 *
 * @author Admin
 */
public class SinhVien {
    String hoTen, email, SDT, CMND;
    final String    hoTenRegex = "^[a-zA-Z\\s]+", 
                    emailRegex = "^(.+)@(.+)\\.(.+)$", 
                    SDTRegex   = "^(0|\\+84|84)\\d{9,10}", 
                    CMNDRegex  = "\\d{9}";
    public SinhVien(String hoTen, String email, String SDT, String CMND) {
        if(!hoTen.matches(hoTenRegex)) {cantInstant(hoTen); return;}
        if(!email.matches(emailRegex)) {cantInstant(email); return;}
        if(!SDT.matches(SDTRegex)) {cantInstant(SDT); return;}
        if(!CMND.matches(CMNDRegex)) {cantInstant(CMND); return;}

        this.hoTen = hoTen;
        this.SDT = SDT;
        this.email = email;
        this.CMND = CMND;
    }
    
    @Override
    public String toString() {
        return this.hoTen;
    }
    
    private void cantInstant(String a) {
        print("Can't assign value to attribute because: %s not valid!", a);
    }
}
