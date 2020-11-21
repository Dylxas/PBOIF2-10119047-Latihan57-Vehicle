/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package data;

/**
 *
 * @author 
 * NAMA     : Aldy Putra Hanggara
 * KELAS    : PBO2
 * NIM      : 10119047
 * DESKRIPSI PROGRAM : PROGRAM INI BERISI PROGRAM MENAMPILKAN KENDARAAN DAN MODELNYA
 */
public class Vehicle {
    
    private String myBrand;
    private String myModel;
    
    public Vehicle(){
        String nama[] = getClass().getCanonicalName().split("\\.");
        System.out.println("Nama  : " + nama[nama.length - 1]);
    }
    
    public String getMyBrand(){
        return myBrand;
    }
    
    public void setMyBrand(String myBrand){
        this.myBrand = myBrand;
    }
    
    public String getMyModel(){
        return myModel;
    }
    
    public void setMyModel(String myModel){
        this.myModel = myModel;
    }
}
