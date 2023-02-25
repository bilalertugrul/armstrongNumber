import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int sayi, bolum, kalan, tempSayi, tempSayi1, basamakSayisi=0, subTotal=1, total=0;
        Scanner input = new Scanner(System.in);
        System.out.print("Sayı Giriniz : ");
        sayi = input.nextInt();
        tempSayi = sayi;
        tempSayi1 = sayi;

        while(tempSayi != 0){
            tempSayi /= 10;
            basamakSayisi++;
        }

        while(tempSayi1 != 0){
            kalan = tempSayi1 % 10;
            tempSayi1 /= 10;
            for(int i = 1 ; i<=basamakSayisi ; i++){
                subTotal *= kalan;
            }
            total += subTotal;
            subTotal = 1;
            System.out.println(total);
        }

        if(total == sayi){
            System.out.println(sayi + " Armstrong Sayıdır.");
        }else{
            System.out.println(sayi + " Armstrong sayı değildir.");
        }

    }
}