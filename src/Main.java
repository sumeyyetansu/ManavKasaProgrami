import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*Meyveler ve KG Fiyatları

    Armut : 2,14 TL
    Elma : 3,67 TL
    Domates : 1,11 TL
    Muz: 0,95 TL
    Patlıcan : 5,00 TL

    */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen satın almak istediğin ürünün kilogramını giriniz");
        System.out.println("Armut Kaç Kilo ? : ");
        double armut = scanner.nextDouble();
        System.out.println("Elma Kaç Kilo ? : ");
        double elma = scanner.nextDouble();
        System.out.println("Domates Kaç Kilo ? : ");
        double domates = scanner.nextDouble();
        System.out.println("Muz Kaç Kilo ? : ");
        double muz = scanner.nextDouble();
        System.out.println("Patlıcan Kaç Kilo ? : ");
        double patlican = scanner.nextDouble();

        double tutar = (armut * 2.14) + (elma * 3.67) + (domates * 1.11) + (muz * 0.95) + (patlican * 5);
        System.out.println("Satın aldığınız ürünlerin toplam tutarı : " + tutar);
    }
}
