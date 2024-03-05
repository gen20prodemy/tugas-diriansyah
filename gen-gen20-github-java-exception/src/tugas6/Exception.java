package tugas6;

public class Exception {
    public int error(int a) {
        try {
            umur(a);
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
            System.exit(1);
        }

        return a;
    }

    public int umur(int a){
        if (a < 0){
            throw new IllegalArgumentException("Umur tidak ada negatif");
        } else {
            return a;
        }
    }
}
