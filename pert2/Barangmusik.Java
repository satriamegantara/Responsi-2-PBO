class BarangMusik {
    // Deklarasikan variabel/state yang diperlukan di sini
    public String id;public String nama;public double harga;public int stok;
    
    // Constructor
    public BarangMusik(String id,String nama){
        harga=0.0;stok=0;this.id=id;this.nama=nama;
    }
    public BarangMusik(String id,String nama, double harga){
        stok=0;this.id=id;this.nama=nama;this.harga=harga;
    }
    public BarangMusik(String id, String nama, double harga, int stok){
        this.id=id;this.nama=nama;this.harga=harga;this.stok=stok;
    }

    void ubahHarga(double hargaBaru) {
        harga=hargaBaru;
    }
    
    void tambahStok(int jumlah) {
        stok=jumlah;
    }

    void tampilInfo() {
        System.out.println("Alat musik "+nama+" | Kode: "+id+" | Harga: "+harga+" | Stok: "+stok+" unit");
    }
}