package bangundatar;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        BangunDatar bangundatar = new BangunDatar();

        persegi Persegi = new persegi();
        System.out.print("Masukan Sisi persegi: ");
        Persegi.sisi = input.nextInt();

        lingkaran Lingkaran = new lingkaran();
        System.out.print("Masukan Jari jari lingkaran: ");
        Lingkaran.r = input.nextInt();

        persegipanjang PersegiPanjang = new persegipanjang();
        System.out.print("Masukan Panjang persegi panjang");
        PersegiPanjang.panjang = input.nextInt();
        System.out.print("Masukan Lebar persegi panjang");
        PersegiPanjang.lebar = input.nextInt();

        segitiga Segitiga = new segitiga();
        System.out.print("Masukan Alas segitiga");
        Segitiga.alas = input.nextInt();
        System.out.print("Masukan Tinggi segitiga");
        Segitiga.tinggi = input.nextInt();

        //bangundatar.luas();
        //bangundatar.keliling();

        Persegi.luas();
        Persegi.keliling();

        Lingkaran.luas();
        Lingkaran.keliling();

        PersegiPanjang.luas();
        PersegiPanjang.keliling();

        Segitiga.luas();
        Segitiga.keliling();
    }
}
