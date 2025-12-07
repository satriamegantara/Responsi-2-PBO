class Customer {
    // TODO: Buatkan atribut
    protected String nama;protected String id;protected int total;

    // TODO: Sediakan constructor
    public Customer(String nama, String id, int total) {
        this.nama = nama;this.id = id;this.total = total;
    }

    void tampilkanInfo() {
        // TODO: tampilkan data customer
        System.out.println("Nama: "+nama+" | ID: "+id+" | Total Belanja: Rp "+total);
    }
}
