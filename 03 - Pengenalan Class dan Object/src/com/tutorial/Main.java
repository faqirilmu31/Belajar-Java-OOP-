package com.tutorial;

// membuat class sebagai template
class Mahasiswa {
    String nama;
    String NIM;
    String jurusan;
    double IPK;
    int umur;
}

public class Main {
    public static void main(String[] args) {
        
        // instansiasi / membuat objek
        Mahasiswa mahasiswa1 = new Mahasiswa();
        mahasiswa1.nama = "Ucup";
        mahasiswa1.NIM = "M0520067";
        mahasiswa1.jurusan = "Teknik perteknikan";
        mahasiswa1.IPK = 4.0;
        mahasiswa1.umur = 17;

        System.out.println(mahasiswa1.nama);
        System.out.println(mahasiswa1.NIM);
        System.out.println(mahasiswa1.jurusan);
        System.out.println(mahasiswa1.IPK);
        System.out.println(mahasiswa1.umur);

        Mahasiswa mahasiswa2 = new Mahasiswa();
        mahasiswa2.nama = "Otong";
        mahasiswa2.NIM = "M0520068";
        mahasiswa2.jurusan = "Teknik perteknikan";
        mahasiswa2.IPK = 3.5;
        mahasiswa2.umur = 19;

        System.out.println(mahasiswa2.nama);
        System.out.println(mahasiswa2.NIM);
        System.out.println(mahasiswa2.jurusan);
        System.out.println(mahasiswa2.IPK);
        System.out.println(mahasiswa2.umur);
        
    }
}
