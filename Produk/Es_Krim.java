package Produk;
import java.util.ArrayList;
import java.io.*;

public class Es_Krim {
    static Console con = System.console();

    //Void beli produk
    public static void beliproduk(){

        ArrayList<String> nama_produk = new ArrayList<String>();
        nama_produk.add("Walls");
        nama_produk.add("Cornetto");
        nama_produk.add("Cornetto Mini");
        nama_produk.add("Magnum");
        nama_produk.add("Paddle Pop");
        nama_produk.add("Vienetta");
        nama_produk.add("Vienetta Mini");
        nama_produk.add("Aice Jagung");
        nama_produk.add("Aice Jagung Mini");
        nama_produk.add("PaddlePo Mochi Vanilla");
        nama_produk.add("PaddlePo Mochi Strawberry");

        System.out.println("Pilih produk yang ingin dibeli");
        for (int i = 0; i < nama_produk.size(); i++) {
            System.out.println((i+1) + ". " + nama_produk.get(i));
        }
    }

    //Void tambah produk
    public static void tambahproduk(){
        System.out.println("Tambah produk");
        System.out.print("Nama produk: ");
        String nama_produk = con.readLine();
        System.out.print("Harga produk: ");
        int harga_produk = Integer.parseInt(con.readLine());
        System.out.print("Jumlah produk: ");
        int jumlah_produk = Integer.parseInt(con.readLine());
        System.out.println("");
        System.out.println("Produk yang anda tambah: " + nama_produk);
        System.out.println("Harga produk: Rp." + harga_produk);
        System.out.println("Jumlah produk: " + jumlah_produk);
        System.out.println("Total harga: Rp." + (harga_produk * jumlah_produk));
    }

    //Void untuk daftarproduk
    public static void daftarproduk(){
        System.out.println("Daftar produk");
        System.out.println("============");
        System.out.println("1. Walls");
        System.out.println("2. Cornetto");
        System.out.println("3. Cornetto Mini");
        System.out.println("4. Magnum");
        System.out.println("5. Paddle Pop");
        System.out.println("6. Vienetta");
        System.out.println("7. Vienetta Mini");
        System.out.println("8. Aice Jagung");
        System.out.println("9. Aice Jagung Mini");
        System.out.println("10. PaddlePo Mochi Vanilla");
        System.out.println("11. PaddlePo Mochi Strawberry");
    }

    //Void untuk cek stok
    public static void cekstok(){
        ArrayList<String> nama_produk = new ArrayList<String>();
        nama_produk.add("Walls");
        nama_produk.add("Cornetto");
        nama_produk.add("Cornetto Mini");
        nama_produk.add("Magnum");
        nama_produk.add("Paddle Pop");
        nama_produk.add("Vienetta");
        nama_produk.add("Vienetta Mini");
        nama_produk.add("Aice Jagung");
        nama_produk.add("Aice Jagung Mini");
        nama_produk.add("PaddlePo Mochi Vanilla");
        nama_produk.add("PaddlePo Mochi Strawberry");

        ArrayList<Integer> stok_produk = new ArrayList<Integer>();
        stok_produk.add(10);
        stok_produk.add(23);
        stok_produk.add(15);
        stok_produk.add(32);
        stok_produk.add(12);
        stok_produk.add(11);
        stok_produk.add(16);
        stok_produk.add(21);
        stok_produk.add(23);
        stok_produk.add(12);
        stok_produk.add(32);

        System.out.println("STOK YANG TERSEDIA: ");
        for (int i = 0; i < nama_produk.size(); i++) {
            System.out.println(nama_produk.get(i) + ": " + stok_produk.get(i));
        }
    }

    //Void untuk hapus produk
    public static void hapusproduk(){
        System.out.println("Hapus produk");
        System.out.println("============");
        System.out.println("1. Walls");
        System.out.println("2. Cornetto");
        System.out.println("3. Cornetto Mini");
        System.out.println("4. Magnum");
        System.out.println("5. Paddle Pop");
        System.out.println("6. Vienetta");
        System.out.println("7. Vienetta Mini");
        System.out.println("8. Aice Jagung");
        System.out.println("9. Aice Jagung Mini");
        System.out.println("10. PaddlePo Mochi Vanilla");
        System.out.println("11. PaddlePo Mochi Strawberry");

        System.out.print("Pilih index produk yang ingin dihapus: ");
        int pilih_produk = Integer.parseInt(con.readLine());
        System.out.println("");
        System.out.println("Produk yang anda hapus: " + pilih_produk);
    }
}
