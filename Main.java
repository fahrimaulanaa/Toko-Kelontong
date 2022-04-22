import java.util.*;
import Produk.*;

public class Main {
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("SELAMAT DATANG DI TOKO JAYA");
        System.out.println("");
        System.out.println("Tipe produk apa yang bisa dipilih");
        System.out.println("1. Jajan");
        System.out.println("2. Lunch");
        System.out.println("3. Es Krim"); 
        System.out.println("4. Minuman");
        System.out.println();
        System.out.print("Masukkan pilihan anda: ");
        int pilihan = input.nextInt();

        switch (pilihan) {
            case 1:
            System.out.println("Menu Jajan");
            System.out.println("============");
            System.out.println("1. Beli Produk");
            System.out.println("2. Daftar Produk");
            System.out.println("3. Cek Stok");
            System.out.println("4. Tambah Produk");
            System.out.println("5. Hapus Produk");
            System.out.println("6. Keluar");
            System.out.println("");
            System.out.println("Masukkan pilihan: ");
            int pilihan2 = input.nextInt();
                if (pilihan2 == 1) {
                    Produk.Jajan.produkjajan();
                }
                else if (pilihan2 == 2){
                    Produk.Jajan.daftarproduk();
                }
                else if (pilihan2 == 3){
                    Produk.Jajan.cekstok();
                }
                else if (pilihan2 == 4){
                    Produk.Jajan.tambahproduk();
                }
                else if (pilihan2 == 5){
                    Produk.Jajan.hapusproduk();
                }
                else if (pilihan2 == 6){
                    System.out.println("Terima kasih telah menggunakan layanan kami");
                }
                else {
                    System.out.println("Pilihan tidak tersedia");
                }
                break;
            case 2:
            System.out.println("Menu Lunch");
            System.out.println("============");
            System.out.println("1. Beli Produk");
            System.out.println("2. Daftar Produk");
            System.out.println("3. Cek Stok");
            System.out.println("4. Tambah Produk");
            System.out.println("5. Hapus Produk");
            System.out.println("6. Keluar");
            System.out.println("");
            System.out.println("Masukkan pilihan: ");
            int pilihan3 = input.nextInt();
                if (pilihan3 == 1) {
                    Produk.Lunch.beliproduk();
                }
                else if (pilihan3 == 2){
                    Produk.Lunch.daftarproduk();
                }
                else if (pilihan3 == 3){
                    Produk.Lunch.cekstok();
                }
                else if (pilihan3 == 4){
                    Produk.Lunch.tambahproduk();
                }
                else if (pilihan3 == 5){
                    Produk.Lunch.hapusproduk();
                }
                else if (pilihan3 == 6){
                    System.out.println("Terima kasih telah menggunakan layanan kami");
                }
                else {
                    System.out.println("Pilihan tidak tersedia");
                }
                break;
            case 3:
            System.out.println("Menu Es Krim");
            System.out.println("============");
            System.out.println("1. Beli Produk");
            System.out.println("2. Daftar Produk");
            System.out.println("3. Cek Stok");
            System.out.println("4. Tambah Produk");
            System.out.println("5. Hapus Produk");
            System.out.println("6. Keluar");
            System.out.println("");
            System.out.println("Masukkan pilihan: ");
            int pilihan4 = input.nextInt();
                if (pilihan4 == 1) {
                    Produk.Es_Krim.beliproduk();
                }
                else if (pilihan4 == 2){
                    Produk.Es_Krim.daftarproduk();
                }
                else if (pilihan4 == 3){
                    Produk.Es_Krim.cekstok();
                }
                else if (pilihan4 == 4){
                    Produk.Es_Krim.tambahproduk();
                }
                else if (pilihan4 == 5){
                    Produk.Es_Krim.hapusproduk();
                }
                else if (pilihan4 == 6){
                    System.out.println("Terima kasih telah menggunakan layanan kami");
                }
                else {
                    System.out.println("Pilihan tidak tersedia");
                }
                break;
            case 4:
            System.out.println("Menu Minuman");
            System.out.println("============");  
            System.out.println("1. Beli Produk");
            System.out.println("2. Daftar Produk");
            System.out.println("3. Cek Stok");
            System.out.println("4. Tambah Produk");
            System.out.println("5. Hapus Produk");
            System.out.println("6. Keluar");
            System.out.println("");
            System.out.println("Masukkan pilihan: ");
            int pilihan5 = input.nextInt();
                if (pilihan5 == 1) {
                    Produk.Minuman.beliproduk();
                }
                else if (pilihan5 == 2){
                    Produk.Minuman.daftarproduk();
                }
                else if (pilihan5 == 3){
                    Produk.Minuman.cekstok();
                }
                else if (pilihan5 == 4){
                    Produk.Minuman.tambahproduk();
                }
                else if (pilihan5 == 5){
                    Produk.Minuman.hapusproduk();
                }
                else if (pilihan5 == 6){
                    System.out.println("Terima kasih telah menggunakan layanan kami");
                }
                else {
                    System.out.println("Pilihan tidak tersedia");
                }
                break;              
            default:
                break;
        }
    }
}