
package PraktikumBaliyun;

import java.util.Scanner;

/**
 *
 * @author Client
 */
public class PraktikumBaliyun {

    public static void main(String[] args) {
         String namaToko = "Toko Wijaya";
         String alamat = "Jalan Jaya Wijaya no. 15";
         String noTelepon = "082132375908";
         Scanner scanner = new Scanner(System.in);
         String namaBarang;
         System.out.print("Nama barang :");
         namaBarang = scanner.next();
         int harga;
         System.out.print("Masukkan harga :");
         harga = scanner.nextInt();
         int jumlah;
         System.out.print("Jumlah barang :");
         jumlah = scanner.nextInt();
         
         System.out.println("\n====================");
         System.out.println(namaToko);
         System.out.println(alamat);
         System.out.println("Tlp :" + noTelepon);
         System.out.println("=====================");
         System.out.println("\nNama barang : " + namaBarang);
         System.out.println("Harga barang : " + harga);
         System.out.println("Jumlah barang : " + jumlah);
         
         System.out.println("\n====================");
         System.out.println("setelah di diskon");
         
         int diskon, hargaTotal,a;
         diskon = harga * jumlah;
         if (diskon > 500000) {
             a = diskon/100*50;
             hargaTotal = diskon - a;
             System.out.println("Kode barang    : 1");
             System.out.println("diskon 50%");
             System.out.println("Harga sebelum diskon :" + diskon);
             System.out.println("Harga setelah diskon : Rp" + hargaTotal);
         } else if( diskon > 200000) {
             a = diskon/100*20;
             hargaTotal = diskon - a;
             System.out.println("Kode barang    : 2");
             System.out.println("diskon 20%");
             System.out.println("Harga sebelum diskon :" + diskon);
             System.out.println("Harga setelah diskon : Rp" + hargaTotal);
         } else if
                 (diskon > 100000) {
             a = diskon/100*10;
             hargaTotal = diskon - a;
             System.out.println("Kode barang    : 3");
             System.out.println("diskon 10%");
             System.out.println("Harga sebelum diskon :" + diskon);
             System.out.println("Harga setelah diskon : Rp" + hargaTotal);  
         }
         
    }    
}
