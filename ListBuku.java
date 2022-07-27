/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugasperpustakaan;

/**
 *
 * @author USER
 */
public class ListBuku {
    //pemeberian nilai pada array "listBuku" dengan tipe class Buku
    Buku[] listBuku = {
        new Buku(1, "Matematika",30),
        new Buku(2, "B.inggris ",20),
        new Buku(3, "PKN       ",15),
        new Buku(4,"Pemrograman",10),
    };
    
    //method untuk menampilkan data list buku
    public void viewBuku(){
        System.out.println("--- List Buku ---");
        System.out.println("ID \t Judul \t\t Stok");
        for (int i = 0; i < listBuku.length; i++) {
            System.out.println(listBuku[i].getIdBuku() + " \t " +
                    listBuku[i].getJudulBuku() + " \t\t " +
                    listBuku[i].getStok());
        }
    }
    
    public int cariBuku(int id){
        int found = 0;
        //pencarian data berdasarkan id
        for (int i = 0; i < listBuku.length; i++) {
            if (listBuku[i].getIdBuku()== id) {
                found = i; 
                //menyimpan nilai index dari data yg ditemukan
            }
        }
        return found;        
    }
    
}