/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package universitas;

/**
 *
 * @author asus
 */
public class MahasiswaBeraksi {
    public static void main(String[] args) {
        Mahasiswa mahasiswa = new Mahasiswa("M. Raflian Noor", "2110010664");
        
        System.out.println("Nama: " + mahasiswa.getNama());
        System.out.println("NPM: " + mahasiswa.getNpm());
    }
}