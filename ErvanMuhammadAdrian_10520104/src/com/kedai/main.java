package com.kedai;

import java.util.*;

public class main {
    public static void main(String[] args) {
        int pilih;
        double harga = 0;
        double pembayaran;
        double kembalian;
        // instansiasi objek
        Scanner input = new Scanner(System.in);
        KopiSusu_10520104 kopiSusu = new KopiSusu_10520104();
        Expresso_10520104 expresso = new Expresso_10520104();
        Cappucino_10520104 cappucino = new Cappucino_10520104();
        SusuCokelat_10520104 susuCokelat = new SusuCokelat_10520104();
        StrawberrySusu_10520104 susuStroberi = new StrawberrySusu_10520104();

        // menampilkan tabel pilihan menu yang ada
        pilMenu_10520104 pilihanMenuu = new pilMenu_10520104();

        // untuk me-looping input pesananan
        for (String a = "Y"; a.equals("Y") || a.equals("y");) {
            System.out.print("Pilih jenis minuman\t: ");
            pilih = input.nextInt();

            // pengkondisian pilihan
            if (pilih == 1) {
                kopiSusu.setJumlahPesanan();
                kopiSusu.display();
                harga += kopiSusu.getTotalHarga(); // menghitung harga untuk pembayaran
            } else if (pilih == 2) {
                expresso.setJumlahPesanan();
                expresso.display();
                harga += expresso.getTotalHarga();
            } else if (pilih == 3) {
                cappucino.setJumlahPesanan();
                cappucino.display();
                harga += cappucino.getTotalHarga();
            } else if (pilih == 4) {
                susuCokelat.setJumlahPesanan();
                susuCokelat.display();
                harga += susuCokelat.getTotalHarga();
            } else if (pilih == 5) {
                susuStroberi.setJumlahPesanan();
                susuStroberi.display();
                harga += susuStroberi.getTotalHarga();
            } else {
                System.out.println("Pilihan anda salah!");
            }

            System.out.print("\nApakah anda mau memesan lagi [Y/T] ? ");
            a = input.next();
        }

        // output hasil pembelian
        System.out.println();
        System.out.println("_____________________________________");
        System.out.println("\n           KEDAI AJA WEH           ");
        System.err.println("               Garut                 ");
        System.out.println("Nama Kasir : Ervan (32)              ");
        System.out.println("-------------------------------------");
        System.out.println("Total Harga\t\t Rp. " + harga);

        // untuk menginput jumlah uang yang dibayarkan
        System.out.print("Cash\t\t\t Rp. ");
        pembayaran = input.nextInt();

        // menghitung jumlah kembalian
        kembalian = pembayaran - harga;
        System.out.print("Kembalian\t\t Rp. " + kembalian);
        System.out.println();
        System.out.println("_____________________________________");
        System.out.println("\n            TERIMA KASIH           ");
        System.out.println("_____________________________________");
    }
}
