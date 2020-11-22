/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10116417.latihan52.siapakamu;

/**
 *
 * 
 */
class Mahasiswa {
     private String nim;
    private String kelas;

    public String getNim() {
        return nim;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    public String getKelas() {
        return kelas;
    }

    public void setKelas(String kelas) {
        this.kelas = kelas;
    }
    
    public void kelasApa(){
        System.out.println("Saya Gilang umur 23 tahun sedang balajar dikelas PBO2");  
    } 
    
    
    public void siapaKamu(){
        System.out.println("Saya Mahasiswa");
    }

    
}
