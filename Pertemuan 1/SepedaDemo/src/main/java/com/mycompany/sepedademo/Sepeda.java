/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.sepedademo;

/**
 *
 * @author septianenggars
 */
public class Sepeda {
    public String merk;
    public int kecepatan;
    public int gear;
    
    public void setMerk(String newValue){
        merk = newValue;
    }
    
    public void gantiGear(int newValue){
        gear = newValue;
    }
    
    public void tambahKecepatan(int increment){
        //kecepatan = kecepatan + increment;
        kecepatan += increment;
    }
    public void rem(int decrement){
        kecepatan -= decrement;
    }
    
    public void cetakStatus(){
        System.out.println("Merk: " + merk);
        System.out.println("Kecepatan: " + kecepatan);
        System.out.println("Gear: " + gear);
    }
}
