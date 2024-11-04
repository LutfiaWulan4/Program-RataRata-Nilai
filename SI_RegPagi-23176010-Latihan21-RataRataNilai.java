
package latihan_pertemuan_6;

import java.util.Scanner;
/**
 * NAMA              : Lutfia Wulandari
 * KELAS             : PBO12
 * NIM               : 23176008
 * PRODI             : Sistem Informasi
 * SEMESTER          : 3
 * Deskripsi Program : Program ini berisi program untuk menampilkan
 * program           : Rata - rata nilai
 */
public class Latihan_21 {
    
        public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukkan Banyaknya Mahasiswa: ");
        int jumlahMahasiswa = input.nextInt();
        int[] nilaiMahasiswa = new int[jumlahMahasiswa];
        int totalNilai = 0;
        
        for (int i = 0; i < jumlahMahasiswa; i++) {
            System.out.print("Nilai Mahasiswa ke-" + (i + 1) + ": ");
            nilaiMahasiswa[i] = input.nextInt();
            totalNilai += nilaiMahasiswa[i];
        }
        
        double rataRata = (double) totalNilai / jumlahMahasiswa;
        
        System.out.println("\nMaka, Rata-rata Nilainya adalah " + rataRata);
        System.out.println("Developed by : Rizki Adam Kurniawan");
        
        input.close();
    }
}

    

