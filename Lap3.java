/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lap3;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;


/**
 *
 * @author Admin
 */
public class Lap3 {

    static Scanner scanner = new Scanner(System.in);
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //bt1Display();
        //bt2Display();
        //bt3Display();
        //bt4Display();
    }

    // bai tap 1
    private static void bt1(int a) {
        int n = (int)Math.sqrt(a);
        for(int i = 2; i <= n; i++) {
            if(a % i == 0) {
                System.out.printf("%d isn't prime\n", a);
                return;
            }
        }
        
        System.out.printf("%d is prime\n", a);       
    }
    
    private static void bt1Display() {
        int a;
        System.out.println("Is prime? ");
        System.out.print("a = ");
        a = scanner.nextInt();
        
        bt1(a);
    }
    
    // bai tap 2
    private static void bt2Display() {
        for(int i = 1; i <= 10; i++) {
            for(int j = 2; j < 10; j++) {
                System.out.printf("%2d x %2d = %2d ", j, i, i*j);
            }
            System.out.print('\n');
        }
    }
    
    // bai tap 3
    private static void ArrayDisplay(int[] a) {
        for(int e : a) {
            System.out.printf("%d ", e);
        }
        System.out.print("\n");
    }
    
    private static void bt3Display() {
        int n;
        int[] array;
        System.out.print("Enter a number of elements: ");
        n = scanner.nextInt();
        array = new int[n];
        
        for(int i = 0; i < n; i++) {
            System.out.printf("Element %d: ", i);
            array[i] = scanner.nextInt();
        }
        System.out.print("Array after sorted: ");
        Arrays.sort(array);
        ArrayDisplay(array);
        
        System.out.printf("Minimum of array: %d\n", array[0]);
        
        int s, time; 
        s = time = 0;
        for(int e : array) {
            if(e % 3 == 0) {
                s += e;
                time++;
            }
        }
        System.out.printf("TBC: %f\n", (float)s/time);
        
    }
    
    // bai tap 4
    
    private static void bt4Display() {
        ArrayList<Student> students = new ArrayList<Student>();
        int n;
        System.out.print("Enter a number of members in class: ");
        n = scanner.nextInt();
        
        String f;
        float m;
        
        
        
        for(int i = 0; i < n; i++) {
            // ignore first readline
            f = scanner.nextLine();
            
            
            System.out.print("Fullname: ");
            f = scanner.nextLine();
            System.out.print("Mark: ");
            m = scanner.nextFloat();
            students.add(new Student(f, m));
        }
        
        for (int i =0; i < students.size(); i++)
            System.out.println(students.get(i));
        
        Collections.sort(students, new sortByMark());
        System.out.println("Sort mark acs: ");
        for (int i =0; i < students.size(); i++)
            System.out.println(students.get(i));
        
    }
    
    public static class Student {
        private String fullname;
        private float mark;
        
        public Student(String f, float m) {
            this.fullname = f;
            this.mark = m;
        }
        
        @Override
        public String toString() {
            String rank;
            if(this.mark < 5)           rank = "Yeu";
            else if (this.mark < 6.5)   rank = "TB";
            else if (this.mark < 7.5)   rank = "Kha";
            else if (this.mark < 9.0)   rank = "Gioi";
            else                        rank = "God";
            
            return this.fullname + " " + this.mark + ": " + rank;
        }
        
    }
    
    static class sortByMark implements Comparator<Student> {
        // Used for sorting in ascending order of
        // mark number
        @Override
        public int compare(Student a, Student b) {
            if(a.mark < b.mark) return -1;
            else if(a.mark > b.mark) return 1;
            return 0;
        }
    }
    
}
