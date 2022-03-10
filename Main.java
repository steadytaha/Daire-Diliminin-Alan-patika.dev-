import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        double pi=3.14, alan, angle, r;

        System.out.print("Yarıçapı giriniz: ");
        r = input.nextDouble();

        System.out.print("Merkez açıyı giriniz: ");
        angle = input.nextDouble();

        alan = (pi * (r*r) * angle) / 360;
        System.out.println("Daire diliminin alanı: "+ alan);
    }
}
