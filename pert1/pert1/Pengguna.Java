package pert1;

class Pengguna {
    // Tuliskan state (variabel) yang diperlukan di sini
    // Jangan lupa tambahkan konstanta faktorAktivitas

    public int umur;public double berat;public double tinggi;final double faktorAktivitas=1.2;public double BMI;public double tinggiMeter;public double kalori;

    double hitungBMI() {
        tinggiMeter=tinggi/100;
        BMI=berat/(tinggiMeter*tinggiMeter);
        return BMI;
    }

    void tampilKategori(double BMI) {
        if(BMI<18.5){
            System.out.println("Kategori: Kurus");
        } else if (BMI<25){
            System.out.println("Kategori: Normal");
        }else{
            System.out.println("Kategori: Obesitas");
        }
    }

    double hitungKalori() {

        kalori=berat*faktorAktivitas;
        return kalori;
    }

    void tampilInfo() {
        hitungBMI();
        System.out.printf("=== Informasi Kesehatan Pengguna ===\nUmur: "+umur+" tahun\nBerat: "+berat+" kg\nTinggi: "+tinggi+" cm\nBMI: "+BMI+"\n");
        tampilKategori(BMI);
        hitungKalori();
        System.out.println("Kebutuhan Kalori: "+kalori+"kal/hari\n==================================\n\n--- Demonstrasi Konstanta Final ---\nNilai faktor aktivitas: "+faktorAktivitas+"\nFaktor aktivitas bersifat final (konstan)\nArtinya nilai ini tidak bisa diubah setelah diinisialisasi");
    }
}