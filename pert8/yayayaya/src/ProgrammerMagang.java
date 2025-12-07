// CLASS ProgrammerMagang harus MENGIMPLEMENTASIKAN (implements) KaryawanKontrak dan AksesSistem
public class ProgrammerMagang implements KaryawanKontrak, AksesSistem {

    // ==========================================================
    // ATRIBUT/STATE (Dibutuhkan untuk menyimpan data objek)
    // ==========================================================

    // Deklarasikan 4 atribut private:
    // 1. String nama
    // 2. double gajiPerJam
    // 3. String pinRahasia
    // 4. boolean sedangLogin
    private String nama;
    private double gajiPerJam;
    private String pinRahasia;
    private boolean sedangLogin;
    double totalGaji;
    // ==========================================================
    // CONSTRUCTOR
    // ==========================================================

    // Buat satu constructor yang menerima 3 parameter (nama, gajiPerJam, pinRahasia).
    // Inisialisasi atribut sedangLogin dengan nilai default 'false'.

    public ProgrammerMagang(String nama, double gajiPerJam, String pinRahasia) {
        this.nama = nama;
        this.gajiPerJam = gajiPerJam;
        this.pinRahasia = pinRahasia;

        sedangLogin = false;
    }

    // ==========================================================
    // IMPLEMENTASI METHOD DARI KaryawanKontrak
    // ==========================================================

    // @Override: IMPLEMENTASIKAN hitungGaji(int jamKerja)
    // LOGIKA: Hitung gaji (jamKerja * gajiPerJam) dan tampilkan hasilnya.
    public double hitungGaji(int jamKerja) {
        totalGaji = gajiPerJam * jamKerja;
        return totalGaji;
    }

    public String getNama() {
        return nama;
    }


    // @Override: IMPLEMENTASIKAN perpanjangKontrak(int durasiBulan)
    // LOGIKA: Tampilkan pesan konfirmasi perpanjangan kontrak.
    public void perpanjangKontrak(int durasiBulan) {
        System.out.println("Kontrak diperpanjang "+durasiBulan+" bulan");
    }

    // @Override: IMPLEMENTASIKAN getStatusCuti() (Override Default Method)
    // LOGIKA: Kembalikan nilai String yang spesifik untuk magang: "Tersedia 5 hari".
    public String getStatusCuti() {
        return "Tersedia 12 hari";
    }

    // ==========================================================
    // IMPLEMENTASI METHOD DARI AksesSistem
    // ==========================================================

    // @Override: IMPLEMENTASIKAN login(String pin)
    // LOGIKA: Cek apakah pin yang diterima sama dengan pinRahasia. 
    //         Jika sama, ubah sedangLogin = true dan tampilkan pesan berhasil.
    //         Jika tidak, tampilkan pesan gagal.
    public void login(String pin) {
        if (pin == pinRahasia) {
            System.out.println("Login berhasil. Selamat datang, "+nama+"!");
            sedangLogin = true;
        } else  {
            System.out.println("Login gagal. Pin salah");
        }
    }

    // @Override: IMPLEMENTASIKAN logout()
    // LOGIKA: Ubah sedangLogin = false dan tampilkan pesan logout.
    public void logout() {
        sedangLogin = false;
        System.out.println(nama+" berhasil logout.");
    }

    // @Override: IMPLEMENTASIKAN getRoleAkses() (Override Default Method)
    // LOGIKA: Kembalikan nilai String yang spesifik untuk magang: "Magang IT".
    public String getRoleAkses() {
        return "Magang IT";
    }
}