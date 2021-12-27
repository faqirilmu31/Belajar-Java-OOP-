package com.tutorial;

// class tanpa constructor / class polos
class Polos{
    String dataString;
    int dataInteger;
}

// class dengan constructor
class Mahasiswa {
    String nama;
    String NIM;
    String jurusan;

    // constructor dipanggil saat object pertama kali dibuat
    // Mahasiswa() {
    //     System.out.println("Ini adalah constructor");
    // }

    // constructor dengan parameter
    Mahasiswa(String inputNama, String inputNIM, String inputJurursan) {
        nama = inputNama;
        NIM = inputNIM;
        jurusan = inputJurursan;

        System.out.println(nama);
        System.out.println(NIM);
        System.out.println(jurusan);
    }
}

public class Main {
    public static void main(String[] args) {
        
        Mahasiswa mahasiwa1 = new Mahasiswa("ucup", "M0520055", "Informatika");
        Mahasiswa mahasiswa2 = new Mahasiswa("otong", "M0520086", "Teknik elektro");

        //new Mahasiswa();

        // Polos objectPolos = new Polos();
        // objectPolos.dataString = "polos";
        // objectPolos.dataInteger = 00;

        // System.out.println(objectPolos.dataString);
        // System.out.println(objectPolos.dataInteger);
    }
}
