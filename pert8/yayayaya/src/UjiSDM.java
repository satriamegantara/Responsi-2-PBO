public class UjiSDM {
    public static void main(String[] args) {

        // ==========================================================
        // DATA UJI COBA
        // ==========================================================

        System.out.println("=== PENGUJIAN PROGRAMMER MAGANG ===");
        // 1. BUAT OBJEK ProgrammerMagang
        // Gunakan constructor dengan data: "Andi", 50000.0, "1234".
        ProgrammerMagang user = new ProgrammerMagang("Andi", 50000.0, "1234");

        // 2. PENGUJIAN METODE BERURUTAN

        // Panggil method hitungGaji(160).
        user.hitungGaji(160);
        System.out.println("Gaji "+user.getNama()+" (160 jam) adalah: Rp "+user.totalGaji);

        // Cetak hasil dari method getStatusCuti().
        System.out.println("Status cuti: "+user.getStatusCuti());

        // Panggil login("9999") (Tes PIN salah).
        user.login("9999");

        // Panggil login("1234") (Tes PIN benar).
        user.login("1234");

        // Cetak hasil dari method getRoleAkses().
        System.out.println("Role Akses: "+user.getRoleAkses());

        // Panggil perpanjangKontrak(6).
        user.perpanjangKontrak(6);

        // Panggil logout().
        user.logout();
    }
}