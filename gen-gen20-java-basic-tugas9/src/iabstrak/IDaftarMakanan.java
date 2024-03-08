package iabstrak;

public interface IDaftarMakanan{
    public void tambahListMakanan(String name, Integer price);
    public void hapusListMakanan(String name);
    public void tampilkanListMakanan();
    public void ubahListMakanan(String name, Integer price);
}