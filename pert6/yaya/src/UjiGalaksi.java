public class UjiGalaksi {
    public static void main(String[] args) {

        // ==========================================================
        // PEMBUATAN OBJEK
        // ==========================================================

        // TODO:
        // Buat objek PesawatTempur dengan:
        //   nama: "Astra-Fury"
        //   kapasitas: 2
        //   jumlahRudal: 8
        PesawatTempur satu=new PesawatTempur("Astra-Fury",2,8);


        // TODO:
        // Buat objek KapalEksplorasi dengan:
        //   nama: "Voyager X"
        //   kapasitas: 10
        //   modulScan: 4
        KapalEksplorasi dua=new KapalEksplorasi("Voyager X",10,4);

        // ==========================================================
        // PENGUJIAN PERILAKU
        // ==========================================================
        System.out.println("=== UJI SISTEM KENDARAAN GALAKSI ===\n\n--- PESAWAT TEMPUR ---");

        // TODO:
        // Aktifkan mesin pesawat
        // Pesawat menjelajah 10 km
        // Pesawat menjelajah 30 km
        // Pesawat menembak 3 rudal
        // Tampilkan status pesawat
        satu.aktifkanMesin();satu.jelajah(10);satu.jelajah(30);satu.tembakRudal(3);satu.tampilStatus();

        System.out.println("---KAPAL EKSPLORASI ---");
        // TODO:
        // Aktifkan mesin kapal eksplorasi
        // Kapal menjelajah 15 km
        // Kapal melakukan scanPlanet("Kepler-442b")
        // Tampilkan status kapal
        dua.aktifkanMesin();dua.jelajah(15);dua.scanPlanet("Kepler-442b");dua.tampilStatus();

    }
}
