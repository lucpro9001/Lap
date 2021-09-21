/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lap7.bai2;

import java.util.Dictionary;

/**
 *
 * @author Admin
 */
public class SinhVienIT extends SinhVienPoly {
    
    double java, css, html;
    
    public SinhVienIT(String h, double j, double css, double html) {
        super(h, "IT");
        this.java = j;
        this.css = css;
        this.html = html;
    }
    public SinhVienIT(Dictionary<String, String> dict) {
        super(dict.get("ten"), "IT");
        this.java = Double.parseDouble(dict.get("java"));
        this.css  = Double.parseDouble(dict.get("css"));
        this.html = Double.parseDouble(dict.get("html"));
    }
    
    @Override
    public double getDiem() {
        return (2*java + html + css) / 4;
    }
  
}
