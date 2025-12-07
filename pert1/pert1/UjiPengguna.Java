package pert1;

class UjiPengguna {
    public static void main(String[] args) {
        // Buat objek pengguna dan isi datanya sesuai data uji coba
        // Panggil method tampilInfo
        // Tampilkan demonstrasi tentang konstanta final

        Pengguna baru=new Pengguna();
        baru.umur=25;baru.berat=60;baru.tinggi=170;

        baru.tampilInfo();
        //baru.faktorAktivitas=1.5; ERROR BANG D:\Informatika\Sem 3\Praktikum Pemrograman Berorientasi Objek\Responsi-2\pert1\pert1\UjiPengguna.Java:13:13
        //java: cannot assign a value to final variable faktorAktivitas
    }
}