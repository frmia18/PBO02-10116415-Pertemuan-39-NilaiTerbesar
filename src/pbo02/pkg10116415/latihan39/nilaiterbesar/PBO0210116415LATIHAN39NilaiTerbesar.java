/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo02.pkg10116415.latihan39.nilaiterbesar;

import java.util.Scanner;

/**
 *
 * @author Frda 
 * NAMA: MIA AISYAH F
 * NIM: 10116415
 * Deskripsi Program: Program ini berisi program yang menampilkan data
 * Nilai Terbesar
 */
public class PBO0210116415LATIHAN39NilaiTerbesar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String namaPetugas;
        int jmlMhs;

        nilai hasil = new nilai();
        Scanner scanner = new Scanner(System.in);

        System.out.println("===Program nilai terbesar dan nilai terkceil===");
        System.out.print("Masukkan Nama Petugas : ");
        namaPetugas = scanner.nextLine();
        System.out.print("Masukkan Banyaknya Mahasiswa :  ");
        jmlMhs = scanner.nextInt();
        System.out.println();

        hasil.inputNilai(jmlMhs);
        System.out.println();
        hasil.tampilNilaiTerbesarTerkecil(jmlMhs);

        System.out.println("Nilai Terbesar : " + hasil.nilaiBesar);
        System.out.println("Nilai Terkecil : " + hasil.nilaiKecil);
        System.out.println();
        System.out.println("Nama Petugas : " + namaPetugas);
    }
    
}
