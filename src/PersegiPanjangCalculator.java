import java.util.Scanner;

/**
 * Program untuk menghitung luas dan keliling persegi panjang.
 */
public class PersegiPanjangCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan panjang persegi panjang: ");
        double panjang = input.nextDouble();

        System.out.print("Masukkan lebar persegi panjang: ");
        double lebar = input.nextDouble();

        double luas = hitungLuasPersegiPanjang(panjang, lebar);
        double keliling = hitungKelilingPersegiPanjang(panjang, lebar);

        System.out.println("Luas persegi panjang: " + luas);
        System.out.println("Keliling persegi panjang: " + keliling);

        input.close();
    }

    /**
     * Menghitung luas persegi panjang.
     *
     * @param panjang Panjang dari persegi panjang.
     * @param lebar Lebar dari persegi panjang.
     * @return Luas dari persegi panjang.
     */
    public static double hitungLuasPersegiPanjang(double panjang, double lebar) {
        return panjang * lebar;
    }

    /**
     * Menghitung keliling persegi panjang.
     *
     * @param panjang Panjang dari persegi panjang.
     * @param lebar Lebar dari persegi panjang.
     * @return Keliling dari persegi panjang.
     */
    public static double hitungKelilingPersegiPanjang(double panjang, double lebar) {
        return 2 * (panjang + lebar);
    }
}
