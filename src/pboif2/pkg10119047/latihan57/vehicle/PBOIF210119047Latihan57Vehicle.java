/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10119047.latihan57.vehicle;

import data.Bicycle;
import data.Skateboard;

/**
 *
 * @author 
 * NAMA     : Aldy Putra Hanggara
 * KELAS    : PBO2
 * NIM      : 10119047
 * DESKRIPSI PROGRAM : PROGRAM INI BERISI PROGRAM MENAMPILKAN KENDARAAN DAN MODELNYA
 */
public class PBOIF210119047Latihan57Vehicle {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        

        Bicycle bicycle = new Bicycle();

        bicycle.setMyBrand("Trek Bike");
        bicycle.setMyModel("7.4FX");
        bicycle.setMyGearCount(23);

        System.out.println("Brand : " + bicycle.getMyBrand());
        System.out.println("Model : " + bicycle.getMyModel());
        System.out.println("Jumlah Gear : " + bicycle.getMyGearCount());
        
        System.out.println();
        
        Skateboard skateboard =  new Skateboard();

        skateboard.setMyBrand("Ally Skate");
        skateboard.setMyModel("Rocket");
        skateboard.setMyBoardLength(54.5);

        System.out.println("Brand : " + skateboard.getMyBrand());
        System.out.println("Model : " + skateboard.getMyModel());
        System.out.println("Panjang Board : " + skateboard.getMyBoardLength());
    }
    
}
