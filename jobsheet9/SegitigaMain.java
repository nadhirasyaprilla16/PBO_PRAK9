/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jobsheet9;

/**
 *
 * @author user
 */
public class SegitigaMain {
    public static void main(String[] args){
        Segitiga sg = new Segitiga();
        
        System.out.println("\t MENGHITUNG SEGITIGA");
        System.out.println();
        System.out.println("1. Menghitung keliling segitiga : " + sg.keliling(10, 10, 10));
        System.out.println("2. Menghitung keliling segitiga : " + sg.keliling(5, 5));
        System.out.println("3. Menghitung 1 Sudut Segitiga : " + sg.totalSudut(45));
        System.out.println("4. Menghitung 2 Sudut Segitiga : " + sg.totalSudut(45, 30));
    }
}
