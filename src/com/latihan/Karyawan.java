/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.latihan;

/**
 *
 * @author linuxluv
 */
public class Karyawan {

    String NIP;
    String nama;
    String jenisKelamin;

    public void masukKerja() {
        System.out.println("Masuk kerja");
    }

    public void beriNama(String nama) {
        this.nama = nama;
    }
}
