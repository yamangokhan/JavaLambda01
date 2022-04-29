package Lambda;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class C02 {
    public static void main(String[] args) {


        List<Integer> sayi = new ArrayList<>(Arrays.asList(34, 22, 16, 11, -35, 20, 63, 21,-8, 38, 15));
        // cıf elemanlarının karelerini yazdırın

        cıftKarePrint(sayi);//1156 484 256 400 64 1444
        System.out.println();
        tekKupFazlaPrint(sayi);// 1332 250048 9262 3376
        System.out.println();
        cıftKareKokPrint(sayi);
        System.out.println();
        maxElBul(sayi);
    }

    public static void cıftKarePrint (List<Integer> sayi){

        sayi.stream().filter(t->t%2==0).map(t-> t*t).forEach(C01::yazdir); // 1156 484 256 400 64 1444
        sayi.stream().filter(C01::cıftBul).map(t-> t*t).forEach(C01::yazdir); // 1156 484 256 400 64 1444

    }

    /// // Task : Functional Programming ile listin tek elemanlarinin  kuplerinin bir fazlasini ayni satirda aralarina bosluk birakarak print edi

    public static void tekKupFazlaPrint(List<Integer> sayi){
        sayi.
                stream().// sayılar akısa alındı
                filter(t-> t%2==1).// tek elemanlar filtrelendi
                map(t-> t*t*t+1).// tek elemanlarının kuplerinin 1 fazlası alındı
                forEach(C01::yazdir);//print edildi.

  ///// task :

        // Task : Functional Programming ile listin cift elemanlarinin   karekoklerini ayni satirda aralarina bosluk birakarak yazdiriniz
// Task : Functional Programming ile listin cift elemanlarinin   karekoklerini ayni satirda aralarina bosluk birakarak yazdiriniz

    }

    public static void cıftKareKokPrint (List<Integer> sayi){
        sayi.stream().filter(C01::cıftBul).map(Math::sqrt).forEach(t-> System.out.print(t + " ")); // 5.830951894845301 4.69041575982343 4.0 4.47213595499958 NaN 6.164414002968976

            // Math.sqrt = karakoklerını alma methodu.

    }

    ///// task :
// Task : list'in en buyuk elemanini yazdiriniz

        public static void maxElBul(List<Integer> sayi){
        Optional<Integer> maxSayi = sayi.stream().reduce(Math::max); // akısa giren elemanları actıon sonrası tek eleman haline getirir.
            System.out.println(maxSayi);
        }
}