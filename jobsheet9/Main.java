/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jobsheet9;

/**
 *
 * @author user
 */
public class Main {
    public static void main(String[] args){
        System.out.println("-------------------------------");
        Manusia manusia = new Manusia();
        manusia.bernafas();
        manusia.makan();
        
        System.out.println("-------------------------------");
        Dosen dosen = new Dosen();
        dosen.tampilManusia();
        dosen.makan();
        dosen.lembur();
        
        System.out.println("-------------------------------");
        Mahasiswa mahasiswa = new Mahasiswa();
        mahasiswa.tampilManusia();
        mahasiswa.makan();
        mahasiswa.tidur();
        
        System.out.println("");
    }
}
