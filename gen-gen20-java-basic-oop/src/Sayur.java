public class Sayur extends Makanan {
    public String tipe = "Sayur";
    Sayur(String nama, Integer harga){
        super(nama, harga);
    }

    Sayur(String nama){
        super(nama);
    }

    @Override
    public void info(){
        System.out.println("Nama " + this.tipe + " adalah " + this.nama);
        System.out.println("Harga " + this.tipe + " adalah " + this.harga);
    }
}