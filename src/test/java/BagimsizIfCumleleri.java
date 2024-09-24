import java.util.Scanner;

public class BagimsizIfCumleleri {

    public static void main(String[] args) {

        // Kullanıcıdan iki tam sayı isteyin
        Scanner scanner = new Scanner(System.in);
        System.out.print("Lutfen iki tamsayi giriniz: ");
        int sayi1 = scanner.nextInt();
        int sayi2 = scanner.nextInt();

        // Eğer 1. sayı büyükse, "Girilen ilk sayı daha büyük" yazdırın
        if (sayi1 > sayi2) {
            System.out.println("Girilen ilk sayi daha buyuk");
        }

        // Eğer 2. sayı çift ise, "Girilen 2. sayı çift" yazdırın
        if (sayi2 % 2 == 0) {
            System.out.println("Girilen 2. sayi cift");
        }
    }
}
