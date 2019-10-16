package Tunjangan;
import java.util.Scanner;

/**Nama      : Rama Al Halik
 * Kelas     : IF-1
 * NIM       : 10118007
 * Deskripsi : Menampilkan tunjangan gaji seorang karyawan
 * */
public class Main {

	public void main(String[] args) {
		       Scanner masuk = new Scanner(System.in);
        Penggajian Gaji= new Penggajian();
        
        System.out.println("==========Program Tunjangan==========");
        System.out.print("Berapa gaji pokok anda per bulan?\t: Rp. ");
        Gaji.gajiPokok= masuk.nextDouble();
        System.out.print("Status Anda? (Menikah/Belum)\t\t: ");
        Gaji.status = masuk.next();

        Gaji.hasilHitung(Gaji.status, Gaji.gajiPokok);
	}

}