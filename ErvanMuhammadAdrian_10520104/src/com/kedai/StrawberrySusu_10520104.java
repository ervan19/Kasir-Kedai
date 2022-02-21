package com.kedai;

public class StrawberrySusu_10520104 extends Menu_10520104 {
    private String namaMenu = "Strawberry Susu";
    private int harga = 15000;

    public void setJumlahPesanan() {
        System.out.print("Jumlah Pesan\t\t: ");
        this.jumlahPesanan = input.nextInt();
    }

    public String getNamaMenu() {
        return this.namaMenu;
    }

    public int getHargaSatuan() {
        return this.harga;
    }

    public int getTotalHarga() {
        return this.getHargaSatuan() * this.jumlahPesanan;
    }

    public void display() {
        System.out.println(
                "Menu Pesanan\t\t: " + this.getNamaMenu() + " | " + this.jumlahPesanan + " x " + getHargaSatuan()
                        + " | "
                        + "Rp."
                        + this.getTotalHarga());
    }
}
