package Produk;
import java.util.ArrayList;
import java.util.Scanner;

public class Jajan {
    static Scanner input = new Scanner(System.in);


    //Void produkjajan
    public static void produkjajan(){     
    
        ArrayList<String> nama_produk = new ArrayList<String>();
        nama_produk.add("Chitato");
        nama_produk.add("Lays");
        nama_produk.add("Choki Choki");
        nama_produk.add("Teh Pucuk");
        nama_produk.add("Ultra Milk");
        nama_produk.add("Ultra Mimi");


        ArrayList<Integer> harga_produk = new ArrayList<Integer>();
        harga_produk.add(10000);
        harga_produk.add(8000);
        harga_produk.add(1000);
        harga_produk.add(4000);
        harga_produk.add(5000);
        harga_produk.add(3000);


        ArrayList<Integer> jumlah_produk = new ArrayList<Integer>();
        jumlah_produk.add(10);
        jumlah_produk.add(5);
        jumlah_produk.add(20);
        jumlah_produk.add(30);
        jumlah_produk.add(8);
        jumlah_produk.add(19);

        System.out.println("Daftar Produk Untuk Dibeli");
        System.out.println("==========================");
        for (int i = 0; i < nama_produk.size(); i++) {
            System.out.println(i + 1 + ". " + nama_produk.get(i) + " Rp." + harga_produk.get(i));
        }
        System.out.println("");
        System.out.println("");
        System.out.print("Pilih produk yang ingin dibeli: ");
        int pilihan = input.nextInt();
        System.out.println("");
        System.out.print("Jumlah produk yang ingin dibeli: ");
        int jumlah = input.nextInt();
        System.out.println("");
        System.out.println("Produk yang anda pilih: " + nama_produk.get(pilihan - 1));
        System.out.println("Harga produk: Rp." + harga_produk.get(pilihan - 1));
        System.out.println("Jumlah produk: " + jumlah);
        System.out.println("Total harga: Rp." + (harga_produk.get(pilihan - 1) * jumlah));

    }

    //Void daftarproduk
    public static void daftarproduk(){

        ArrayList<String> nama_produk = new ArrayList<String>();
        nama_produk.add("Chitato");
        nama_produk.add("Lays");
        nama_produk.add("Choki Choki");
        nama_produk.add("Teh Pucuk");
        nama_produk.add("Ultra Milk");
        nama_produk.add("Ultra Mimi");

        ArrayList<Integer> harga_produk = new ArrayList<Integer>();
        harga_produk.add(10000);
        harga_produk.add(8000);
        harga_produk.add(1000);
        harga_produk.add(4000);
        harga_produk.add(5000);
        harga_produk.add(3000);

        System.out.println("Daftar Produk");
        System.out.println("============");
        for (int i = 0; i < nama_produk.size(); i++) {
            System.out.println(i + 1 + ". " + nama_produk.get(i)+ " Rp. " + harga_produk.get(i));
        }
    }

    //Void Cek stok produk
    public static void cekstok(){
            
            ArrayList<String> nama_produk = new ArrayList<String>();
            nama_produk.add("Chitato");
            nama_produk.add("Lays");
            nama_produk.add("Choki Choki");
            nama_produk.add("Teh Pucuk");
            nama_produk.add("Ultra Milk");
            nama_produk.add("Ultra Mimi");
    
            ArrayList<Integer> jumlah_produk = new ArrayList<Integer>();
            jumlah_produk.add(10);
            jumlah_produk.add(5);
            jumlah_produk.add(20);
            jumlah_produk.add(30);
            jumlah_produk.add(8);
            jumlah_produk.add(19);
    
            System.out.println("Daftar Stok Produk");
            System.out.println("==================");
            for (int i = 0; i < nama_produk.size(); i++) {
                System.out.println(i + 1 + ". " + nama_produk.get(i) + " Stok: " + jumlah_produk.get(i));
            }
    }

    //Void tambah produk
    public static void tambahproduk(){
        ArrayList<String> nama_produk = new ArrayList<String>();
        nama_produk.add("Chitato");
        nama_produk.add("Lays");
        nama_produk.add("Choki Choki");
        nama_produk.add("Teh Pucuk");
        nama_produk.add("Ultra Milk");
        nama_produk.add("Ultra Mimi");

        ArrayList<Integer> harga_produk = new ArrayList<Integer>();
        harga_produk.add(10000);
        harga_produk.add(8000);
        harga_produk.add(1000);
        harga_produk.add(4000);
        harga_produk.add(5000);
        harga_produk.add(3000);

        ArrayList<Integer> jumlah_produk = new ArrayList<Integer>();
        jumlah_produk.add(10);
        jumlah_produk.add(5);
        jumlah_produk.add(20);
        jumlah_produk.add(30);
        jumlah_produk.add(8);
        jumlah_produk.add(19);

        System.out.println("Tambah Produk");
        System.out.println("=============");
        System.out.println("");
        System.out.print("Nama produk: ");
        String nama = input.next();
        System.out.println("");
        System.out.print("Harga produk: ");
        int harga = input.nextInt();
        System.out.println("");
        System.out.print("Jumlah produk: ");
        int jumlah = input.nextInt();
        System.out.println("");
        System.out.println("Produk yang anda tambahkan: " + nama);
        System.out.println("Harga produk: Rp." + harga);
        System.out.println("Jumlah produk: " + jumlah);
    }

    //Void hapus produk
    public static void hapusproduk(){
        ArrayList<String> nama_produk = new ArrayList<String>();
        nama_produk.add("Chitato");
        nama_produk.add("Lays");
        nama_produk.add("Choki Choki");
        nama_produk.add("Teh Pucuk");
        nama_produk.add("Ultra Milk");
        nama_produk.add("Ultra Mimi");

        ArrayList<Integer> harga_produk = new ArrayList<Integer>();
        harga_produk.add(10000);
        harga_produk.add(8000);
        harga_produk.add(1000);
        harga_produk.add(4000);
        harga_produk.add(5000);
        harga_produk.add(3000);

        ArrayList<Integer> jumlah_produk = new ArrayList<Integer>();
        jumlah_produk.add(10);
        jumlah_produk.add(5);
        jumlah_produk.add(20);
        jumlah_produk.add(30);
        jumlah_produk.add(8);
        jumlah_produk.add(19);

        System.out.println("Hapus Produk");
        System.out.println("=============");
        System.out.println("");
        System.out.print("Masukkan index yang ingin dihapus: ");
        int indeks = input.nextInt();
        nama_produk.remove(indeks);
        harga_produk.remove(indeks);
        jumlah_produk.remove(indeks);
        System.out.println("");
        System.out.println("Produk yang anda hapus: " + nama_produk.get(indeks));
        System.out.println("Harga produk: Rp." + harga_produk.get(indeks));
        System.out.println("Jumlah produk: " + jumlah_produk.get(indeks));
    }
}