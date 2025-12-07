public class EWalletPayment implements PaymentMethod {

    // TODO: Buat atribut yang diperlukan, misalnya:
    // - nama penyedia layanan (contoh: Dana, OVO, Gopay)
    // - jumlah saldo
    // - nominal transaksi
    private String nama;private double saldo;private double nominal;

    // TODO: Buat constructor untuk mengisi nilai atribut
    public EWalletPayment(String nama, double saldo, double nominal) {
        this.nama = nama;
        this.saldo = saldo;
        this.nominal = nominal;
    }


    // TODO: Implementasikan semua method yang ada pada interface PaymentMethod

    // Catatan:
    // - Pada method processPayment(), lakukan pengecekan kecukupan saldo
    // - Jika saldo cukup, kurangi saldo lalu tampilkan pesan berhasil
    // - Jika saldo tidak cukup, tampilkan pesan gagal
    public void processPayment(){
        if (saldo<nominal){
            System.out.println("Pembayaran gagal, saldo tidak cukup!");
        } else {
            saldo=saldo-nominal;
            System.out.println("Memproses pembayaran sebesar: "+nominal+"...");
            System.out.println("Pembayaran berhasil!");
        }
    }
    public void getPaymentDetails(){
        System.out.println("Pembayaran dilakukan melalui "+nama);
    }
    public void getTransactionFee(){
        saldo-=2500;
        System.out.println("Sisa saldo: "+saldo);
    }

    public void getBalance(){
        System.out.println("Saldo: "+saldo);
    }
}
