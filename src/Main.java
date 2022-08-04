import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Kac Tane Sayi Gireceksiniz: ");
        int kacSayi=input.nextInt();
        int sayi;
        int buyukSayi =0 , kucukSayi=0 ;
        int i =1 ;


        while (i<=kacSayi){
            System.out.println( i +". Sayiyi Giriniz : ");
            sayi=input.nextInt();
            if (i==1){
                buyukSayi=sayi;
                kucukSayi=sayi;
            }
            else {
                if (sayi > buyukSayi){
                    buyukSayi = sayi;
                }
                else if (sayi < kucukSayi){
                    kucukSayi = sayi;
                }
            }
            i ++ ;
        }
        System.out.println(" En buyuk sayi : " + buyukSayi);
        System.out.println("En kucuk sayi :" + kucukSayi);

    }
}
