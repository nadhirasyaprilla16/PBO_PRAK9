/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jobsheet9;

/**
 *
 * @author user
 */
public class Mahasiswa extends Manusia{
    public void makan(){
        System.out.println("Mahasiswa bisa makan");
    }
    public void tidur(){
        System.out.println("Mahasiswa bisa tidur");
    }
    public void tampilManusia(){
        super.bernafas();
        super.makan();
    }
}
