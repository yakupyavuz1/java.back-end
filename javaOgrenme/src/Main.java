import java.util.Scanner ;

public class Main {
    public static void main (String[] args) {


        double boy,kilo,kitle,kitleIndeks ;
        Scanner input = new Scanner(System.in) ;
        System.out.println("Lütfen boyunuzu (metre cinsinde) giriniz:");
        boy = input.nextDouble();
        System.out.print("Lütfen kilonuzu giriniz : ");
        kilo = input.nextDouble();

        kitleIndeks = kilo / (boy * boy);
        System.out.print("Vücut Kitle İndeksiniz : " + kitleIndeks);

    }
}
