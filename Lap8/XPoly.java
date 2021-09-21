/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lap8;

import java.util.Iterator;
import static lap8.Lap8.print;

/**
 *
 * @author Admin
 */
public final class XPoly {
    
    /**
     * Use calculating sum of single array
     * @param arr double[] Array
     * @return sum of all element of array
     */
    public static final double sum(double[] arr) {
        double s = 0;
        for (double d : arr) {
            s += d;
        }
        return s;
    }
    /**
     * Use calculating sum of multiple arrays
     * @param args double[] ...Arrays
     * @return sum of all arrays
     */
    public static final double sum(double[] ...args) {
        double s = 0;
        for (double[] arg : args) {
            s += sum(arg);
        }
        return s;
    }
    /**
     * Use find min a list numbers
     * @param args double ...args
     * @return minimum
     */
    public static final double min(double ...args) {
        double min = args[0];
        for (double arg : args) {
            if(min > arg) min = arg;
        }
        return min;
    }
    /**
     * Use find max a list numbers
     * @param args
     * @return maximum
     */
    public static final double max(double ...args) {
        double max = args[0];
        for (double arg : args) {
            if(max < arg) max = arg;
        }
        return max;
    }
    /**
     * Use to capitalize string
     * @param a String string 
     * @return new string variable
     */
    public static final String toCapitalize(String a) {
        String[] _a = a.trim().replaceAll("\\s+", " ").split(" ");

        String res;
        
        for (int i = 0; i < _a.length; i++) {
            _a[i] = _a[i].substring(0, 1).toUpperCase() + _a[i].substring(1);            
        }
        
        return res = String.join(" ", _a);

    }
}
