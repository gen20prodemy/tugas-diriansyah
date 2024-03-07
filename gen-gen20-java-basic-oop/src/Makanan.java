import java.util.Map;
// import java.util.Set;
import java.util.HashMap;
// import java.util.HashSet;

public class Makanan {
    public String nama;
    protected Integer harga;
    // private static Set<String> listMakanan = new HashSet<String>();
    private static Map<String, Integer> listHargaMakanan = new HashMap<>();

    public Makanan(String nama, Integer harga){
        this.nama = nama;
        this.harga = harga;
        Makanan.listHargaMakanan.put(this.nama.toUpperCase(), this.harga);
    }

    public Makanan(String nama){
        this.nama = nama;
        this.harga = 100;
        Makanan.listHargaMakanan.put(this.nama.toUpperCase(), this.harga);
    }

    public static void hapusElemenListMakanan(String nama){
        Makanan.listHargaMakanan.remove(nama.toUpperCase());
    }

    public static void setListHargaMakanan(String nama, Integer harga){
        Makanan.listHargaMakanan.put(nama.toUpperCase(), harga);
    }

    public static Integer getListHargaMakanan(String nama){
        return Makanan.listHargaMakanan.get(nama.toUpperCase());
    }

    public static void infoListMakanan(){
        for (Map.Entry<String, Integer> entry : listHargaMakanan.entrySet()) {
            String key = entry.getKey();
            Integer value = entry.getValue();
            System.out.println(key + "\t\t = " + value);
        }
    }

    public void info(){
        System.out.println("Nama Makanan adalah " + this.nama);
        System.out.println("Harga Makanan adalah " + this.harga);
    }
}