package Produk;
import java.util.ArrayList;
import java.io.Console;

public class Minuman {
    static Console console = System.console();

    //Void untuk beli produk
    public static void beliproduk(){

        ArrayList<String> nama_produk = new ArrayList<String>();
        nama_produk.add("Es Teh");
        nama_produk.add("Es Jeruk");   
        nama_produk.add("Milo");
        nama_produk.add("Floridina");
        nama_produk.add("Coca Cola");
        nama_produk.add("Sprite");
        nama_produk.add("Fanta");
        nama_produk.add("Fruit Tea");
        nama_produk.add("Coca Cola Zero");
        nama_produk.add("Sprite Zero");
        nama_produk.add("Fanta Zero");
        nama_produk.add("Cimory Milk");
        nama_produk.add("Buavita");

        ArrayList<Integer> harga_produk = new ArrayList<Integer>();
        harga_produk.add(3000);
        harga_produk.add(4000);
        harga_produk.add(5000);
        harga_produk.add(3000);
        harga_produk.add(8000);
        harga_produk.add(5000);
        harga_produk.add(6000);
        harga_produk.add(3500);
        harga_produk.add(4000);
        harga_produk.add(9000);
        harga_produk.add(9000);
        harga_produk.add(9000);
        harga_produk.add(6000);
        harga_produk.add(7000);

        ArrayList<Integer> stok_produk = new ArrayList<Integer>();
        stok_produk.add(10);
        stok_produk.add(16);
        stok_produk.add(14);
        stok_produk.add(11);
        stok_produk.add(9);
        stok_produk.add(19);
        stok_produk.add(12);
        stok_produk.add(13);
        stok_produk.add(10);
        stok_produk.add(22);
        stok_produk.add(15);
        stok_produk.add(26);
        stok_produk.add(32);

        System.out.println("Daftar Produk");
        System.out.println("============");
        for (int i = 0; i < nama_produk.size(); i++) {
            System.out.println((i+1) + ". " + nama_produk.get(i) + " Rp." + harga_produk.get(i));
        }
        System.out.println("");

        System.out.print("Masukkan nomor produk yang ingin dibeli: ");
        int nomor_produk = Integer.parseInt(console.readLine());
        System.out.print("Masukkan jumlah produk yang ingin dibeli: ");
        int jumlah_produk = Integer.parseInt(console.readLine());

        if (nomor_produk > 0 && nomor_produk <= nama_produk.size()) {
            if (jumlah_produk > 0 && jumlah_produk <= stok_produk.get(nomor_produk-1)) {
                System.out.println("");
                System.out.println("Anda telah membeli " + jumlah_produk + " " + nama_produk.get(nomor_produk-1));
                System.out.println("Total harga: Rp." + (harga_produk.get(nomor_produk-1) * jumlah_produk));
                System.out.println("");
            } else {
                System.out.println("");
                System.out.println("Stok tidak mencukupi");
                System.out.println("");
            }
        } else {
            System.out.println("");
            System.out.println("Nomor produk tidak ditemukan");
            System.out.println("");
        }
    }

    //Void untuk menampilkan produk
    public static void daftarproduk(){
        ArrayList<String> nama_produk = new ArrayList<String>();
        nama_produk.add("Es Teh");
        nama_produk.add("Es Jeruk");   
        nama_produk.add("Milo");
        nama_produk.add("Floridina");
        nama_produk.add("Coca Cola");
        nama_produk.add("Sprite");
        nama_produk.add("Fanta");
        nama_produk.add("Fruit Tea");
        nama_produk.add("Coca Cola Zero");
        nama_produk.add("Sprite Zero");
        nama_produk.add("Fanta Zero");
        nama_produk.add("Cimory Milk");
        nama_produk.add("Buavita");

        ArrayList<Integer> harga_produk = new ArrayList<Integer>();
        harga_produk.add(3000);
        harga_produk.add(4000);
        harga_produk.add(5000);
        harga_produk.add(3000);
        harga_produk.add(8000);
        harga_produk.add(5000);
        harga_produk.add(6000);
        harga_produk.add(3500);
        harga_produk.add(4000);
        harga_produk.add(9000);
        harga_produk.add(9000);
        harga_produk.add(9000);
        harga_produk.add(6000);
        harga_produk.add(7000);

        ArrayList<Integer> stok_produk = new ArrayList<Integer>();
        stok_produk.add(10);
        stok_produk.add(16);
        stok_produk.add(14);
        stok_produk.add(11);
        stok_produk.add(9);
        stok_produk.add(19);
        stok_produk.add(12);
        stok_produk.add(13);
        stok_produk.add(10);
        stok_produk.add(22);
        stok_produk.add(15);
        stok_produk.add(26);
        stok_produk.add(32);

        System.out.println("Daftar Produk");
        System.out.println("============");
        for (int i = 0; i < nama_produk.size(); i++) {
            System.out.println((i+1) + ". " + nama_produk.get(i) + " Rp." + harga_produk.get(i) + " Stok: " + stok_produk.get(i));
        }
    }   

    //Void untuk cek stok
    public static void cekstok(){
        ArrayList<String> nama_produk = new ArrayList<String>();
        nama_produk.add("Es Teh");
        nama_produk.add("Es Jeruk");   
        nama_produk.add("Milo");
        nama_produk.add("Floridina");
        nama_produk.add("Coca Cola");
        nama_produk.add("Sprite");
        nama_produk.add("Fanta");
        nama_produk.add("Fruit Tea");
        nama_produk.add("Coca Cola Zero");
        nama_produk.add("Sprite Zero");
        nama_produk.add("Fanta Zero");
        nama_produk.add("Cimory Milk");
        nama_produk.add("Buavita");

        ArrayList<Integer> harga_produk = new ArrayList<Integer>();
        harga_produk.add(3000);
        harga_produk.add(4000);
        harga_produk.add(5000);
        harga_produk.add(3000);
        harga_produk.add(8000);
        harga_produk.add(5000);
        harga_produk.add(6000);
        harga_produk.add(3500);
        harga_produk.add(4000);
        harga_produk.add(9000);
        harga_produk.add(9000);
        harga_produk.add(9000);
        harga_produk.add(6000);
        harga_produk.add(7000);

        ArrayList<Integer> stok_produk = new ArrayList<Integer>();
        stok_produk.add(10);
        stok_produk.add(16);
        stok_produk.add(14);
        stok_produk.add(11);
        stok_produk.add(9);
        stok_produk.add(19);
        stok_produk.add(12);
        stok_produk.add(13);
        stok_produk.add(10);
        stok_produk.add(22);
        stok_produk.add(15);
        stok_produk.add(26);
        stok_produk.add(32);

        System.out.println("Cek Stok");
        System.out.println("========");
        for (int i = 0; i < nama_produk.size(); i++) {
            System.out.println(nama_produk.get(i) + " Stok: " + stok_produk.get(i));
        }
    }

    //Void untuk tambah produk
    public static void tambahproduk(){
        ArrayList<String> nama_produk = new ArrayList<String>();
        nama_produk.add("Es Teh");
        nama_produk.add("Es Jeruk");   
        nama_produk.add("Milo");
        nama_produk.add("Floridina");
        nama_produk.add("Coca Cola");
        nama_produk.add("Sprite");
        nama_produk.add("Fanta");
        nama_produk.add("Fruit Tea");
        nama_produk.add("Coca Cola Zero");
        nama_produk.add("Sprite Zero");
        nama_produk.add("Fanta Zero");
        nama_produk.add("Cimory Milk");
        nama_produk.add("Buavita");

        ArrayList<Integer> harga_produk = new ArrayList<Integer>();
        harga_produk.add(3000);
        harga_produk.add(4000);
        harga_produk.add(5000);
        harga_produk.add(3000);
        harga_produk.add(8000);
        harga_produk.add(5000);
        harga_produk.add(6000);
        harga_produk.add(3500);
        harga_produk.add(4000);
        harga_produk.add(9000);
        harga_produk.add(9000);
        harga_produk.add(9000);
        harga_produk.add(6000);
        harga_produk.add(7000);

        ArrayList<Integer> stok_produk = new ArrayList<Integer>();
        stok_produk.add(10);
        stok_produk.add(16);
        stok_produk.add(14);
        stok_produk.add(11);
        stok_produk.add(9);
        stok_produk.add(19);
        stok_produk.add(12);
        stok_produk.add(13);
        stok_produk.add(10);
        stok_produk.add(22);
        stok_produk.add(15);
        stok_produk.add(26);
        stok_produk.add(32);

        System.out.println("Tambah Produk");
        System.out.println("============");
        System.out.println("Masukkan nama produk: ");
        String nama = console.readLine();
        System.out.println("Masukkan harga produk: ");
        int harga = Integer.parseInt(console.readLine());
        System.out.println("Masukkan stok produk: ");
        int stok = Integer.parseInt(console.readLine());
        nama_produk.add(nama);
        harga_produk.add(harga);
        stok_produk.add(stok);
        System.out.println("Produk berhasil ditambahkan");
        System.out.println("");
        System.out.println("Nama produk yang ditambahkan: " + nama);
        System.out.println("Harga produk yang ditambahkan: " + harga);
        System.out.println("Stok produk yang ditambahkan: " + stok);
        System.out.println("");
    }

    //Void untuk hapus produk
    public static void hapusproduk(){
        ArrayList<String> nama_produk = new ArrayList<String>();
        nama_produk.add("Es Teh");
        nama_produk.add("Es Jeruk");   
        nama_produk.add("Milo");
        nama_produk.add("Floridina");
        nama_produk.add("Coca Cola");
        nama_produk.add("Sprite");
        nama_produk.add("Fanta");
        nama_produk.add("Fruit Tea");
        nama_produk.add("Coca Cola Zero");
        nama_produk.add("Sprite Zero");
        nama_produk.add("Fanta Zero");
        nama_produk.add("Cimory Milk");
        nama_produk.add("Buavita");

        ArrayList<Integer> harga_produk = new ArrayList<Integer>();
        harga_produk.add(3000);
        harga_produk.add(4000);
        harga_produk.add(5000);
        harga_produk.add(3000);
        harga_produk.add(8000);
        harga_produk.add(5000);
        harga_produk.add(6000);
        harga_produk.add(3500);
        harga_produk.add(4000);
        harga_produk.add(9000);
        harga_produk.add(9000);
        harga_produk.add(9000);
        harga_produk.add(6000);
        harga_produk.add(7000);

        ArrayList<Integer> stok_produk = new ArrayList<Integer>();
        stok_produk.add(10);
        stok_produk.add(16);
        stok_produk.add(14);
        stok_produk.add(11);
        stok_produk.add(9);
        stok_produk.add(19);
        stok_produk.add(12);
        stok_produk.add(13);
        stok_produk.add(10);
        stok_produk.add(22);
        stok_produk.add(15);
        stok_produk.add(26);
        stok_produk.add(32);

        System.out.println("Hapus Produk");
        System.out.println("============");
        System.out.println("Masukkan nomor index produk yang ingin dihapus: ");
        int index = Integer.parseInt(console.readLine());
        nama_produk.remove(index);
        harga_produk.remove(index);
        stok_produk.remove(index);
        System.out.println("Produk berhasil dihapus");
        System.out.println("");
        System.out.println("Nama produk yang dihapus: " + nama_produk.get(index) + " seharga " + harga_produk.get(index) + " dengan stok " + stok_produk.get(index));
    }
}
