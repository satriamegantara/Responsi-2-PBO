public class UjiCustomer {
    public static void main(String[] args) {

        // TODO: Buat object Customer
        Customer budi=new Customer("Budi Santoso","CST-001",500000);

        // TODO: Buat object Member
        Member siti=new Member("Siti Aminah","MBR-110",1250000,240,"Gold");

        // TODO: Tampilkan judul data pelanggan
        System.out.println("=== DATA CUSTOMER BELANJAKU ===\nStatus: Customer Biasa");

        // TODO: Tampilkan info untuk Customer biasa
        budi.tampilkanInfo();

        // TODO: Tampilkan info untuk pelanggan Member
        System.out.println("\nStatus: Member");
        siti.tampilkanInfo();
    }
}
