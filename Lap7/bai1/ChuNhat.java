package lap7.bai1;

import static lap7.Lap7.*;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Admin
 */
public class ChuNhat implements IShape {

    double a, b;
    
    public ChuNhat(double a, double b) {
        this.a = a;
        this.b = b;
    }
    
    @Override
    public double getChuVi() {
        return (this.a + this.b)*2;
    }

    @Override
    public double getDienTich() {
        return this.a * this.b;
    }

    @Override
    public void xuat() {
        println(this);
    }
    
    @Override
    public String toString() {
        return "a: " + this.a + ", b: " + this.b + ", CV: " + this.getChuVi() + ", DT: " + this.getDienTich();
    }
    
}
