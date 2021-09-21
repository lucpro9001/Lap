/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lap7.bai2;

/**
 *
 * @author Admin
 */
public class SinhVienBiz extends SinhVienPoly{
    double maket, sales;
    
    public SinhVienBiz(String h, double j, double css) {
        super(h, "Biz");
        this.maket = j;
        this.sales = css;
    }
    
    @Override
    public double getDiem() {
        return (2*maket + sales) / 3;
    }
}
