package Produk;
import java.util.ArrayList;
import java.io.Console;

public class Lunch {
    static Console console = System.console();

    //Void untuk beli produk
    public static void beliproduk(){

        ArrayList<String> nama_produk = new ArrayList<String>();
        nama_produk.add("Lele Goreng");
        nama_produk.add("Nasi Goreng");
        nama_produk.add("Nasi Ayam");
        nama_produk.add("Nasi Uduk");
        nama_produk.add("Nasi Kuning");
        nama_produk.add("Ayam Goreng");
        nama_produk.add("Ayam Bakar");
        nama_produk.add("Gurame Bakar");
        nama_produk.add("Gurame Goreng");

        ArrayList<Integer> harga_produk = new ArrayList<Integer>();
        harga_produk.add(15000);
        harga_produk.add(10000);
        harga_produk.add(12000);
        harga_produk.add(13500);
        harga_produk.add(15500);
        harga_produk.add(17000);
        harga_produk.add(18000);
        harga_produk.add(19000);
        harga_produk.add(20000);

        System.out.println("Daftar Produk Untuk Dibeli");
        System.out.println("============");
        for (int i = 0; i < nama_produk.size(); i++) {
            System.out.println(i + 1 + ". " + nama_produk.get(i));
        }
        System.out.println("");
        System.out.println("");
        System.out.print("Pilih produk yang ingin dibeli: ");
        int pilihan = Integer.parseInt(console.readLine());
        System.out.println("");
        System.out.print("Jumlah produk yang ingin dibeli: ");
        int jumlah = Integer.parseInt(console.readLine());
        System.out.println("");
        System.out.println("Produk yang anda pilih: " + nama_produk.get(pilihan - 1));
        System.out.println("Harga produk: Rp." + harga_produk.get(pilihan - 1));
        System.out.println("Jumlah produk: " + jumlah);
        System.out.println("Total harga: Rp." + (harga_produk.get(pilihan - 1) * jumlah));
    }

    //Void untuk daftar produk
    public static void daftarproduk(){
        ArrayList<String> nama_produk = new ArrayList<String>();
        nama_produk.add("Lele Goreng");
        nama_produk.add("Nasi Goreng");
        nama_produk.add("Nasi Ayam");
        nama_produk.add("Nasi Uduk");
        nama_produk.add("Nasi Kuning");
        nama_produk.add("Ayam Goreng");
        nama_produk.add("Ayam Bakar");
        nama_produk.add("Gurame Bakar");
        nama_produk.add("Gurame Goreng");

        ArrayList<Integer> harga_produk = new ArrayList<Integer>();
        harga_produk.add(15000);
        harga_produk.add(10000);
        harga_produk.add(12000);
        harga_produk.add(13500);
        harga_produk.add(15500);
        harga_produk.add(17000);
        harga_produk.add(18000);
        harga_produk.add(19000);
        harga_produk.add(20000);

        System.out.println("Daftar Produk");
        System.out.println("=============");
        for (int i = 0; i < nama_produk.size(); i++) {
            System.out.println(i + 1 + ". " + nama_produk.get(i) + " Rp." + harga_produk.get(i));
        }
        System.out.println("");
        System.out.println("");
    }

    //Void untuk cek stok produk
    public static void cekstok(){
        ArrayList<String> nama_produk = new ArrayList<String>();
        nama_produk.add("Lele Goreng");
        nama_produk.add("Nasi Goreng");
        nama_produk.add("Nasi Ayam");
        nama_produk.add("Nasi Uduk");
        nama_produk.add("Nasi Kuning");
        nama_produk.add("Ayam Goreng");
        nama_produk.add("Ayam Bakar");
        nama_produk.add("Gurame Bakar");
        nama_produk.add("Gurame Goreng");

        ArrayList<Integer> stok_produk = new ArrayList<Integer>();
        stok_produk.add(10);
        stok_produk.add(10);
        stok_produk.add(10);
        stok_produk.add(10);
        stok_produk.add(10);
        stok_produk.add(10);
        stok_produk.add(10);
        stok_produk.add(10);
        stok_produk.add(10);

        System.out.println("Daftar Stok Produk");
        System.out.println("==================");
        for (int i = 0; i < nama_produk.size(); i++) {
            System.out.println(i + 1 + ". " + nama_produk.get(i) + " Stok: " + stok_produk.get(i));
        }
        System.out.println("");
        System.out.println("");
    }

    //Void untuk tambah produk
    public static void tambahproduk(){
        ArrayList<String> nama_produk = new ArrayList<String>();
        nama_produk.add("Lele Goreng");
        nama_produk.add("Nasi Goreng");
        nama_produk.add("Nasi Ayam");
        nama_produk.add("Nasi Uduk");
        nama_produk.add("Nasi Kuning");
        nama_produk.add("Ayam Goreng");
        nama_produk.add("Ayam Bakar");
        nama_produk.add("Gurame Bakar");
        nama_produk.add("Gurame Goreng");

        ArrayList<Integer> harga_produk = new ArrayList<Integer>();
        harga_produk.add(15000);
        harga_produk.add(10000);
        harga_produk.add(12000);
        harga_produk.add(13500);
        harga_produk.add(15500);
        harga_produk.add(17000);
        harga_produk.add(18000);
        harga_produk.add(19000);
        harga_produk.add(20000);

        ArrayList<Integer> stok_produk = new ArrayList<Integer>();
        stok_produk.add(10);
        stok_produk.add(10);
        stok_produk.add(10);
        stok_produk.add(10);
        stok_produk.add(10);
        stok_produk.add(10);
        stok_produk.add(10);
        stok_produk.add(10);
        stok_produk.add(10);

        System.out.println("Tambah Produk");
        System.out.println("=============");
        System.out.print("Nama produk: ");
        String nama = console.readLine();
        System.out.print("Harga produk: ");
        int harga = Integer.parseInt(console.readLine());
        System.out.print("Stok produk: ");
        int stok = Integer.parseInt(console.readLine());
        System.out.println("");
        System.out.println("Nama produk yang ditambahkan: " + nama);
        System.out.println("Harga produk yang ditambahkan: Rp." + harga);
        System.out.println("Stok produk yang ditambahkan: " + stok);
        System.out.println("");
    }

    //Void untuk hapus produk
    public static void hapusproduk(){
        ArrayList<String> nama_produk = new ArrayList<String>();
        nama_produk.add("Lele Goreng");
        nama_produk.add("Nasi Goreng");
        nama_produk.add("Nasi Ayam");
        nama_produk.add("Nasi Uduk");
        nama_produk.add("Nasi Kuning");
        nama_produk.add("Ayam Goreng");
        nama_produk.add("Ayam Bakar");
        nama_produk.add("Gurame Bakar");
        nama_produk.add("Gurame Goreng");

        ArrayList<Integer> harga_produk = new ArrayList<Integer>();
        harga_produk.add(15000);
        harga_produk.add(10000);
        harga_produk.add(12000);
        harga_produk.add(13500);
        harga_produk.add(15500);
        harga_produk.add(17000);
        harga_produk.add(18000);
        harga_produk.add(19000);
        harga_produk.add(20000);

        ArrayList<Integer> stok_produk = new ArrayList<Integer>();
        stok_produk.add(10);
        stok_produk.add(10);
        stok_produk.add(10);
        stok_produk.add(10);
        stok_produk.add(10);
        stok_produk.add(10);
        stok_produk.add(10);
        stok_produk.add(10);
        stok_produk.add(10);

        System.out.println("Hapus Produk");
        System.out.println("============");
        System.out.print("Index produk yang ingin dihapus: ");
        int indeks = Integer.parseInt(console.readLine());
        System.out.println("");
        nama_produk.remove(indeks);
        System.out.println("Anda telah berhasil menghapus produk " + nama_produk.get(indeks)+ " seharga " + harga_produk.get(indeks));
    }   
}
