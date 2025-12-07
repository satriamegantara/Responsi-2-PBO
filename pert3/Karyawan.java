class Karyawan {
    // Deklarasikan variabel/state dasar (nama, gajiPokok)
    // Gunakan access modifier yang tepat agar bisa diakses oleh subclass (misal: protected)
    private String nama;protected double gaji;
    
    // Constructor untuk inisialisasi nama dan gajiPokok
    public Karyawan(String nama, double gaji) {
        this.nama = nama;this.gaji = gaji;
    }
    
    // Method untuk menampilkan informasi dasar karyawan
    void tampilInfo() {
        System.out.println("Nama: " + this.nama+" | Gaji Pokok: Rp"+this.gaji);
    }

    public String getNama() {
        return nama;
    }
}