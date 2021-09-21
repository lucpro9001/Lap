/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lap5;

/**
 *
 * @author Admin
 */
public class SanPham {
    String ten;
    double gia;
    public SanPham(String t) {
        this.ten = t;
        this.gia = 0;
    }
    public SanPham(String t, double gia) {
        this.ten = t;
        this.gia = gia;
    }
    
    @Override
    public String toString() {
        return this.ten + ", gia: " + this.gia;
    }
    
    @Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((ten == null) ? 0 : ten.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		SanPham other = (SanPham) obj;
		if (ten == null) {
			if (other.ten != null)
				return false;
		} else if (!ten.equals(other.ten))
			return false;
		return true;
	}
}
