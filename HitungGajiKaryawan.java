import java.util.Scanner;

public class HitungGajiKaryawan {
    public static void main(String[] args) {
        // Membuat scanner untuk input
        Scanner input = new Scanner(System.in);

        // Meminta input dari pengguna
        System.out.print("Masukkan jumlah jam kerja dalam seminggu: ");
        double jamKerja = input.nextDouble();
        
        System.out.print("Masukkan tarif per jam: ");
        double tarifPerJam = input.nextDouble();

        // Deklarasi variabel untuk gaji
        double gaji;
        
        // Menghitung gaji
        if (jamKerja > 40) {
            double jamLembur = jamKerja - 40;
            double gajiLembur = jamLembur * tarifPerJam * 1.5;
            gaji = (40 * tarifPerJam) + gajiLembur;
        } else {
            gaji = jamKerja * tarifPerJam;
        }

        // Menampilkan hasil
        System.out.printf("Gaji karyawan: %.2f\n", gaji);

        // Menutup scanner
        input.close();
    }
}
