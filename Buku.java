/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tugasperpustakaan;


public class Buku {//object
    private int idBuku;//Variabel dan Atribut
    private int stok;
    private String judulBuku;//modifer

    public Buku(int idBuku, String judulBuku, int stok) {
        this.idBuku = idBuku;
        this.stok = stok;
        this.judulBuku = judulBuku;
    }

    //implementasi enkapsulasi dengan pembuatan method utk mengakses data private "idBuku"
    public int getIdBuku() {
        return idBuku;//overiding method
    }

    //implementasi enkapsulasi dengan pembuatan method utk mengakses data private "stok"
    public int getStok() {
        return stok;
    }

    //implementasi enkapsulasi dengan pembuatan method utk mengakses data private "judulBuku" 
    public String getJudulBuku() {
        return judulBuku;
    }
    
    // method untuk mengurangi dan menambah stok sejumlah 1
    public void kurangiStok(){
        this.stok--;//digunakan dalam pembuatan kelas dan menyatakan objek sekarang
    }
    public void tambahStock(){
        this.stok++;
    }
    
}