package iabstrak;

public abstract class AbstractDaftarBibit {
    public abstract void tambahListBibit(String nama, Integer harga);
    public abstract void hapusListBibit(String nama);
    public abstract void ubahListBibit(String nama, Integer harga);
    public abstract void tampilkanListBibit();
}