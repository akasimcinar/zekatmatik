import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double Gold ;

        System.out.println("Zekatmatik'e Hoşgeldiniz!");

        System.out.println("Gram Altın Miktarı:");
        Gold = input.nextInt();

        double Zekatmiktari =  (Gold) / 40;
        if (Gold <= 82 ) {
            System.out.println( "Zekat vermeniz gerekmiyor.");
                    } else {
            System.out.println( "Zekat vermeniz gerekiyor.");
            System.out.println("Zekat Vermeniz Gereken Miktar(Gram Cinsinden):" + Zekatmiktari);
        }

        System.out.println("ZekatMatik Versiyon 1.0.2");
        System.out.println("Made it by K'awesome");
    }
}