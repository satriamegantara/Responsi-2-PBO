class mesinTraktor extends defaultMesin {
    // Variabel khusus mesin traktor (kapasitasTarik)
    public double kapasitasTarik;

    // Constructor
    mesinTraktor(String nama, int hp, double tarik) {
        super(nama, hp);this.kapasitasTarik=tarik;
    }

    @Override
    void tampilInfo() {
        // Override info mesin traktor
    }

    @Override
    double nilaiPerforma() {
        // Override performa traktor
        return (tenagaHP*0.9) + (kapasitasTarik * 10);
    }

    @Override
    String kategoriMesin() {
        // Override kategori traktor
        return "Mesin Traktor";
    }

    void suaraMesin() {
        // Suara traktor
        System.out.print(namaMesin+" → Bzzzzz! Mesin traktor listrik aktif!\n");
    }
}
