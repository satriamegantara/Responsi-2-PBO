public class PaymentTest {

    public static void main(String[] args) {

        // TODO:
        // - Buat objek dari EWalletPayment
        // - Panggil method yang telah dibuat untuk menguji fungsionalitas
        // - Tampilkan hasil akhir informasi saldo dan detail pembayaran
        //
        // Contoh alur (boleh diikuti atau dimodifikasi oleh praktikan):
        // 1. Menampilkan data sebelum transaksi
        // 2. Memproses pembayaran
        // 3. Menampilkan data setelah transaksi
        System.out.println("=== PROGRAM SISTEM PEMBAYARAN (E-WALLET) ===\n");
        EWalletPayment gopay=new EWalletPayment("GoPay", 500000,100000);
        gopay.getBalance();
        gopay.processPayment();
        gopay.getTransactionFee();
        gopay.getPaymentDetails();
    }
}
