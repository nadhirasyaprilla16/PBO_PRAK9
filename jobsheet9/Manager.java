/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jobsheet9;

/**
 *
 * @author user
 */
public class Manager extends Karyawan{
    private double tunjangan;
    private String bagian;
    private Staff st[];
    
    public void setTunjangan(double tunjangan){
        this.tunjangan = tunjangan;
    }
    public double getTunjangan(){
        return tunjangan;
    }
    public void setBagian(String bagian){
        this.bagian = bagian;
    }
    public String getBagian(){
        return bagian;
    }
    public void setStaff(Staff st[]){
        this.st = st;
    }
    public void viewStaff(){
        int i;
        System.out.println("------------------------");
        for(i=0; i < st.length; i++){
            st[i].lihatInfo();
        }
        System.out.println("------------------------");
    }
    public void lihatInfo(){
        System.out.println("Managaer : "+this.getBagian());
        System.out.println("NIP : "+this.getNip());
        System.out.println("Nama : "+this.getNama());
        System.out.println("Golongan : "+this.getGolongan());
        System.out.printf("Tunjangan :Rp. "+this.getTunjangan());
        System.out.printf("Gaji :Rp. "+this.getGaji());
        System.out.println("Bagian : "+this.getBagian());
        this.viewStaff();
    }
    public double getGaji(){
        return super.getGaji()+tunjangan;
    }
}
