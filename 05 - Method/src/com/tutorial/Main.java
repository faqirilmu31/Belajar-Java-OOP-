package com.tutorial;

class Mahasiswa {
    // Data member
    String nama;
    String NIM;

    // constructor
    Mahasiswa(String nama, String NIM){
        this.nama = nama;
        this.NIM = NIM;
    }

    // method tanpa return dam tanpa parameter
    void show(){
        System.out.println("Nama    : " + this.nama);
        System.out.println("NIM     : " + this.NIM);
    }

    // method tanpa return dan dengan parameter
    void setNama(String nama){
        this.nama = nama;
    }

    // method dengan return dan tanpa parameter
    String getNama(){
        return this.nama;
    }

    String getNIM(){
        return this.NIM;
    }

    // method dengan return dan dengan parameter
    String sayHi(String message){
        return message + " juga, nama saya adalah " + this.nama;
    }
}

class Dosen{
    String nama;

    Dosen(String nama){
        this.nama = nama;
    }
}

public class Main {
    public static void main(String[] args) {
        Mahasiswa mahasiswa1 = new Mahasiswa("ucup", "M0520068");
        System.out.println(mahasiswa1.nama);

        // method
        mahasiswa1.show();
        mahasiswa1.setNama("tutung");
        mahasiswa1.show();

        System.out.println(mahasiswa1.getNama());
        System.out.println(mahasiswa1.getNIM());
        
        String data = mahasiswa1.sayHi("ganteng");
        System.out.println(data);
        // test();

        Dosen dosen1 = new Dosen("otong");
        System.out.println(dosen1.nama);
    }

    // static void test(){
    //     System.out.println("ini adalah method test");
    // }
}
