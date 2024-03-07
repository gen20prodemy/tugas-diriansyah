public class Buah extends Makanan {
    public String tipe = "Buah";
    Buah(String nama, Integer harga){
        super(nama, harga);
    }

    Buah(String nama){
        super(nama);
    }

    @Override
    public void info(){
        System.out.println("Nama " + this.tipe + " adalah " + this.nama);
        System.out.println("Harga " + this.tipe + " adalah " + this.harga);
    }
}