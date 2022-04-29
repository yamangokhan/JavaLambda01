package Lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C01 {

    public static void main(String[] args) {

        List<Integer> sayi = new ArrayList<>(Arrays.asList(10, 20, 30, 40, 50, 60, 70, 80, 90, 99, 100));
///// task 1 :
        sayi.stream().forEach(t -> System.out.print(t + " ")); // 10 20 30 40 50 60 70 80 90 99 100

        System.out.println();
//// task 2 :
        sayi.stream().forEach(System.out::print);//102030405060708090100 aralarında bosluk olmadan yazdırdı

//// task 3 :
        System.out.println();
        sayi.stream().forEach(C01:: yazdir); //class ve method ekleyerek //10 20 30 40 50 60 70 80 90 99 100


//// task 4 :
        System.out.println();
        sayi.stream().filter(t-> t%2==0).forEach(C01::yazdir); //10 20 30 40 50 60 70 80 90 100

    }
    public static void yazdir ( int a){ // seed *tohum* method create edildi
        System.out.print(a + " ");


        }

    public static boolean cıftBul(int b){

        return b%2==0;
        }

    }
