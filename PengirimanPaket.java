import java.util.Scanner;

public class PengirimanPaket {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double berat, jarak, panjang, lebar, tinggi;
        double biayaPerKg, biayaTotal;
        double biayaVolume = 0;

        System.out.print("Masukkan berat paket (kg): ");
        berat = input.nextDouble();

        System.out.print("Masukkan jarak tempuh (km): ");
        jarak = input.nextDouble();

        System.out.print("Masukkan panjang paket (cm): ");
        panjang = input.nextDouble();

        System.out.print("Masukkan lebar paket (cm): ");
        lebar = input.nextDouble();

        System.out.print("Masukkan tinggi paket (cm): ");
        tinggi = input.nextDouble();

        double volume = panjang * lebar * tinggi;

        // Tentukan biaya per kg berdasarkan jarak
        if (jarak <= 10) {
            biayaPerKg = 4250;
        } else {
            biayaPerKg = 6000;
        }

        // Hitung biaya volume jika lebih dari 100 cm^3
        if (volume > 100) {
            biayaVolume = 50000;
        }

        // Hitung total biaya
        biayaTotal = (berat * biayaPerKg) + biayaVolume;

        System.out.println("\n=== RINCIAN BIAYA ===");
        System.out.println("Berat paket   : " + berat + " kg");
        System.out.println("Jarak tempuh  : " + jarak + " km");
        System.out.println("Volume paket  : " + volume + " cm^3");
        System.out.println("Biaya volume  : Rp " + biayaVolume);
        System.out.println("Biaya total   : Rp " + biayaTotal);
         input.close();
    }
}



    

    

