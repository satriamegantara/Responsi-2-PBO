// Gunakan keyword untuk mewarisi class Karyawan
class Manajer extends Karyawan {
    // Deklarasikan variabel tambahan khusus Manajer (tunjangan)
    private double tunjangan; private double totalPendapatan;


    // Constructor
    // Tips: Gunakan 'super' untuk memanggil constructor parent
    public Manajer(String nama,double gaji,double tunjangan) {
        super(nama,gaji);this.tunjangan=tunjangan;
    }

    
    // Method Override tampilInfo
    // Tips: Tampilkan info dasar, lalu tambahkan info tunjangan dan total gaji
    @Override
    void tampilInfo() {
        totalPendapatan=gaji+tunjangan;
        System.out.println("Nama: " + getNama()+" | Gaji Pokok: Rp"+this.gaji+" | Tunjangan: "+this.tunjangan+"\nTotal Pendapatan: "+totalPendapatan);
    }
}