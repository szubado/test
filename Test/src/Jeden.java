public class Jeden {
    public static void main(String[] args) {
        int j = 1;
        int p = 10;
        int z = 20;
        int roznica = 0;
        int sum = j + p + z;
        if (sum % 2 == 0) {
            j = sum / 2;
            p = sum / 2;
        }
        else {
            j = sum / 2 +1;
            p = sum / 2;
            roznica += 1;
        }
        System.out.println("Minimalna roznica: " + roznica);
        System.out.println("Ilosc jablek: " + j);
        System.out.println("Ilosc pomaranczy: " + p);
    }
}
