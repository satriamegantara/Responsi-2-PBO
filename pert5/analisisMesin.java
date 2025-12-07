class analisisMesin {
    public static void main(String[] args) {

        defaultMesin[] array={
            new mesinMotor("Honda Supra X", 125, "Bebek"),
            new mesinTraktor("Kubota MX5200", 520, 5),
            new mesinTraktorListrik("EcoTrac Z900", 300, 4.2, 70),
            new mesinMotor("Yamaha R25", 250, "Sport"),
            new mesinTraktorListrik("Volta FarmX", 200, 3.5, 80)
        };

        System.out.println("=== DATA MESIN MEGATECH ===");

        // Loop untuk menampilkan info masing-masing mesin
        for(defaultMesin cek:array){
            if(cek instanceof mesinMotor){
                mesinMotor motor=(mesinMotor) cek;
                System.out.println("Mesin Motor "+motor.namaMesin+" | Tipe: "+motor.tipeMotor+" | Tenaga: "+motor.tenagaHP+" HP\nKategori: Mesin Motor\nPerforma: "+ motor.nilaiPerforma()+"\n");
            }else if (cek instanceof mesinTraktorListrik) {
                mesinTraktorListrik listrik=(mesinTraktorListrik) cek;
                System.out.println("Mesin Traktor Listrik"+listrik.namaMesin+" | Tarik: "+listrik.kapasitasTarik+" ton | Baterai: "+listrik.kapasitasBaterai+" kWh | Tenaga: "+listrik.tenagaHP+" HP\nKategori: Mesin Traktor Listrik\nPerforma: "+listrik.nilaiPerforma()+"\n");
            }else if(cek instanceof mesinTraktor){
                mesinTraktor traktor=(mesinTraktor) cek;
                System.out.println("Mesin Traktor "+traktor.namaMesin+" | Tarik: "+traktor.kapasitasTarik+" ton | Tenaga: "+traktor.tenagaHP+" HP\nKategori: Mesin Traktor\nPerforma: "+traktor.nilaiPerforma()+"\n");
            }
        }

        // Loop untuk menampilkan kategori dan performa

        System.out.println("=== SUARA MESIN ===");

        // Loop untuk menghasilkan suara tiap mesin (instanceof)
        for (defaultMesin mesin : array) {
            if (mesin instanceof mesinMotor) {
                mesinMotor motor = (mesinMotor) mesin;
                motor.suaraMesin();
            }  else if (mesin instanceof mesinTraktor) {
                mesinTraktor traktor = (mesinTraktor) mesin;
                traktor.suaraMesin();
            } else if (mesin instanceof mesinTraktorListrik) {
                mesinTraktorListrik listrik = (mesinTraktorListrik) mesin;
                listrik.suaraMesin();
            }
        }

        System.out.println("\n=== MESIN PERFORMA TERTINGGI ===");

        // Logika menemukan mesin dengan performa tertinggi
        defaultMesin tertinggi=array[0];
        for (defaultMesin mesin : array) {
            if (mesin.nilaiPerforma() > tertinggi.nilaiPerforma()) {
                tertinggi = mesin;
            }
        }
        System.out.println(tertinggi.namaMesin+" → "+tertinggi.nilaiPerforma());

        System.out.println("\n=== TOP 3 MESIN TERBAIK ===");

        // Logika sorting 3 performa tertinggi
        defaultMesin top1=array[0];
        defaultMesin top2=array[1];
        defaultMesin top3=array[2];
        defaultMesin temp; defaultMesin temp2;
        for (defaultMesin mesin : array) {
            if (mesin.nilaiPerforma() > top1.nilaiPerforma()) {
                temp=top1;
                top1=mesin;
                temp2=top2;
                top2=temp;
                top3=temp2;
            } else if (mesin.nilaiPerforma() > top2.nilaiPerforma()) {
                temp=top2;
                top2=mesin;
                top3=temp;
            } else if (mesin.nilaiPerforma() > top3.nilaiPerforma()) {
                top3=mesin;
            }
        }
        System.out.println(top1.namaMesin+" → "+top1.nilaiPerforma()+"\n"+top2.namaMesin+" → "+top2.nilaiPerforma()+"\n"+top3.namaMesin+" → "+top3.nilaiPerforma());
    }
}
