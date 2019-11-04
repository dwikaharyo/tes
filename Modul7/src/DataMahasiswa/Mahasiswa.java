/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataMahasiswa;

/**
 *
 * @author Acer
 */
public class Mahasiswa {
    private String nim;
    private String nama;

    public Mahasiswa(String nim, String nama) {
        this.nim = nim;
        this.nama = nama;
    }

    Mahasiswa() {
        
    }

    
    public String getNim() {
        return nim;
    }

  
    public void setNim(String nim) {
        this.nim = nim;
    }

  
    public String getNama() {
        return nama;
    }

  
    public void setNama(String nama) {
        this.nama = nama;
    }
}
