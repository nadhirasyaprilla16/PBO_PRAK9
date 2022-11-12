/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jobsheet9;

/**
 *
 * @author user
 */
public class Dosen extends Manusia{
    public void makan(){
        System.out.println("Dosen bisa makan");
    }
    public void lembur(){
        System.out.println("Dosen bisa lembur");
    }
    public void tampilManusia(){
        super.bernafas();
        super.makan();
    }
}
