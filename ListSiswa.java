/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugasperpustakaan;

/**
 *
 * @author USER
 */
public class ListSiswa {
     //pemeberian nilai pada array "listSiswa" dengan tipe class Siswa
    Siswa[] listSiswa = {
        new Siswa(1, "Dinda", "Malang", "0341", true),
        new Siswa(2, "Eren",  "Malang", "0341", true),
        new Siswa(3, "Najwa", "Malang", "0341", true),
    };
    
    //method untuk menampilkan data list siswa
    public void viewSiswa(){
        System.out.println("--- List Siswa ---");
        System.out.println("ID \t Nama \t\t Alamat \t\t Status");
        for (int i = 0; i < listSiswa.length; i++) {
            System.out.println(listSiswa[i].getIdSiswa() +" \t "+
                    listSiswa[i].getNama()+" \t\t "+
                    listSiswa[i].getAlamat() +" \t\t "+
                    listSiswa[i].getStatus());
        }
    }
    
    public int cariSiswa(int id){
        int found = 0;
        //pencarian data berdasarkan id
        for (int i = 0; i < listSiswa.length; i++) {
            if (listSiswa[i].getIdSiswa() == id) {
                found = i; 
                //menyimpan nilai index dari data yg ditemukan
            }
        }
        return found;
    }
    
    
}

