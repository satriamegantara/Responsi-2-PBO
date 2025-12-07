class mesinMotor extends defaultMesin {
    // Variabel khusus mesin motor (tipeMotor)
    public String tipeMotor;

    // Constructor
    mesinMotor(String nama, int hp, String tipe) {
        super(nama, hp);tipeMotor=tipe;
    }

    @Override
    void tampilInfo() {
        // Override info mesin motor

    }

    @Override
    double nilaiPerforma() {
        // Override performa mesin motor
        return tenagaHP*1.2;
    }

    @Override
    String kategoriMesin() {
        // Override kategori
        return "Mesin Motor";
    }

    void suaraMesin() {
        // Suara mesin motor
        System.out.print(namaMesin+" → Brummm! Mesin motor menyala!\n");
    }
}
