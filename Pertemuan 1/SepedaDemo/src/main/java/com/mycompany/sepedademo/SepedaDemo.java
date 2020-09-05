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
public class SepedaDemo {
    public static void main(String[] args) {
        Sepeda spd1 = new Sepeda();
        Sepeda spd2 = new Sepeda();
        SepedaGunung spd3 = new SepedaGunung();
        
        spd1.setMerk("Poligon");
        spd1.kecepatan=40;
        spd1.tambahKecepatan(10);
        spd1.rem(30);
        spd1.gantiGear(2);
        spd1.cetakStatus();
        
        spd2.setMerk("Wim Cycle");
        spd2.tambahKecepatan(10);
        spd2.gantiGear(2);
        spd2.tambahKecepatan(10);
        spd2.gantiGear(3);
        spd2.cetakStatus();
        
        
        spd3.setMerk("Klenee");
        spd3.tambahKecepatan(5);
        spd3.gantiGear(7);
        spd3.setTipeSuspensi("Suspensi Gas");
        spd3.cetakStatus();
    }
}
