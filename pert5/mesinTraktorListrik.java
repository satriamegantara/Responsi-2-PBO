class mesinTraktorListrik extends mesinTraktor {
    // Variabel khusus mesin traktor listrik (kapasitasBaterai)
    public double kapasitasBaterai;

    // Constructor
    mesinTraktorListrik(String nama, int hp, double tarik, double baterai) {
        super(nama, hp, tarik);kapasitasBaterai = baterai;
    }

    @Override
    void tampilInfo() {
        // Override info traktor listrik
    }

    @Override
    double nilaiPerforma() {
        // Override performa traktor listrik
        return(tenagaHP*1.1) + (kapasitasBaterai*5);
    }

    @Override
    String kategoriMesin() {
        // Override kategori listrik
        return "Mesin Traktor Listrik";
    }

    @Override
    void suaraMesin() {
        // Suara traktor listrik
        System.out.print(namaMesin+" → Bzzzzz! Mesin traktor listrik aktif!\n");
    }
}
