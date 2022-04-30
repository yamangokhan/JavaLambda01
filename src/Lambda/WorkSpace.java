package Lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class WorkSpace {

    public static void main(String[] args) {

        Unıversity bogazıcı = new Unıversity("bogazıcı", "matematic", 571, 93);
        Unıversity ıtu = new Unıversity("ıstanbul teknik", "matematic", 622, 81);
        Unıversity ıstanbul = new Unıversity("ıstanbul", "hukuk", 1453, 71);
        Unıversity marmara = new Unıversity("marmara", "bil. muh", 1071, 77);
        Unıversity ytu = new Unıversity("yıldız teknik", "gemi", 333, 74);

        List<Unıversity> unv = new ArrayList<>(Arrays.asList(bogazıcı, ıtu, ıstanbul, marmara, ytu));

        /////// method's\\\\\\\
       //task 1 :
        BigThan74GPA(unv);
        System.out.println("\n   ***   ");
        //task 1 :
        System.out.println("task 1 : " + BigThan74GPAContr(unv));
        System.out.println("\n   ***   ");
        // task 2 :
        System.out.println("task 2 : " + NumberOdStudentsLessThan110(unv));
        System.out.println("\n   ***   ");
        // task 3 :
        System.out.println("task 3 : " + IsthereMatcSection(unv));
        System.out.println("\n   ***   ");
        //task 4 :
        SortedByNOfStdnt(unv);
        System.out.println("\n   ***   ");
        // task 4 : method 2
        System.out.println("4. task's 2. method : " + SortedByNOfStdntList(unv));
        System.out.println("\n   ***   ");
        // task 5 :
        System.out.println("task 5 cozumu");
        forGPANaturalOrderFirst3 (unv);
        // task 6 :
        leastNumOfStdSecUnv(unv);
        System.out.println("\n   ***   ");
        // task 7 :
        moreThanGPA63AddNumOfStdt(unv);
        System.out.println("\n   ***   ");
        // task 7 : 2. method (with MapToInt)
        System.out.println(moreThanGPA63AddNumOfStdtMapInTo(unv));
        System.out.println("\n   ***   ");
        // task 8 :
        moreThan333NumOfStdFindGPA (unv);
        System.out.println("\n   ***   ");
        // task 9 :
        NumOfMathSectPrint (unv);
        System.out.println("\n   ***   ");
        // task 10 :
        moreThan571NumOfStudBig (unv);
        System.out.println("\n   ***   ");
        // task 11 :
        LessThan1071NumOfStdtSmallPGA(unv);
        System.out.println("\n   ***   ");
    }

    //task 01--> notOrt'larinin 74' den buyuk olan elementleri print et.
//1.method

    public static void BigThan74GPA(List<Unıversity> unv) {

        unv.stream().filter(t -> t.getGradePointAverage() > 74).forEach(t-> System.out.println("task 1 : " + t + " "));

//2. method
    }

    public static boolean BigThan74GPAContr(List<Unıversity> unv) {

        return unv.stream().allMatch(t-> t.getGradePointAverage()>74);

}

//task 02-->ogrc sayilarinin   110 den az olmadigini  kontrol eden pr create ediniz.

    public static boolean NumberOdStudentsLessThan110 (List<Unıversity> unv){
        return
        unv.stream().allMatch(t-> t.getNumberOfStudent()>110);
    }
//task 03-->universite'lerde herhangi birinde "matematik" olup olmadigini  kontrol eden pr create ediniz.

    public static boolean IsthereMatcSection (List<Unıversity> unv){

        return
                unv.stream().anyMatch(t-> t.getSection().contains("matematic"));
    }


//task 04-->universite'leri ogr sayilarina gore b->k siralayiniz.
// 1. method
    public static void SortedByNOfStdnt(List<Unıversity> unv){
        unv.stream().sorted(Comparator.comparing(Unıversity::getNumberOfStudent).reversed()).forEach(t-> System.out.println("task 4 : " + t + " "));

    }
//2. method (tüm cıktıyı tek bir list halinde yazdırmak ıcın)
    public static List<Unıversity> SortedByNOfStdntList(List<Unıversity> unv){
        return
                unv.stream().sorted(Comparator.comparing(Unıversity::getNumberOfStudent).reversed()).collect(Collectors.toList());
    }

//task 05-->universite'leri notOrt gore  b->k siralayip ilk 3 'unu print ediniz.
    public static void forGPANaturalOrderFirst3 (List<Unıversity> unv){

        System.out.println(unv.stream().sorted(Comparator.comparing(Unıversity::getGradePointAverage).reversed()).limit(3).collect(Collectors.toList()));


    }

//task 06--> ogrc sayisi en az olan 2. universite'yi  print ediniz.

    public static void leastNumOfStdSecUnv(List<Unıversity> unv){
        System.out.println("task 6 cozumu : " + unv.stream().sorted(Comparator.comparing(Unıversity::getNumberOfStudent)).limit(2).skip(1).collect(Collectors.toList()));
    }


//task 07--> notOrt 63 'den buyuk olan universite'lerin ogrc sayilarini toplamini print ediniz.
    public static void moreThanGPA63AddNumOfStdt(List<Unıversity> unv){
        System.out.println(unv.stream().filter(t -> t.getGradePointAverage() > 63).map(Unıversity::getNumberOfStudent).reduce(Integer::sum));

    }

//task 07--> 2. method :
    public static int moreThanGPA63AddNumOfStdtMapInTo(List<Unıversity> unv){
    return
            unv.stream().filter(t -> t.getGradePointAverage() > 63).mapToInt(Unıversity::getNumberOfStudent).sum();

    }


//task 08--> Ogrenci sayisi 333'dan buyuk olan universite'lerin notOrt'larinin ortalamasini bulunuz.
    public static void moreThan333NumOfStdFindGPA (List<Unıversity> unv){
        System.out.println( "task 8 : " + unv.stream().filter(t -> t.getNumberOfStudent() > 333).mapToInt(Unıversity::getGradePointAverage).average());
    }


//task 09-->"matematik" bolumlerinin sayisini  print ediniz.
    public static void NumOfMathSectPrint(List<Unıversity> unv){

        System.out.println("task 9 cozumu : " + unv.stream().sorted(Comparator.comparing(Unıversity::getSection)).filter(t -> t.getSection().toLowerCase().contains("matematic")).count());


    }

//task 10-->Ogrenci sayilari 571'dan fazla olan universite'lerin en buyuk notOrt'unu bulunuz.
    public static void moreThan571NumOfStudBig(List<Unıversity> unv){
        System.out.println("task 10 cozumu : " + unv.stream().filter(t -> t.getNumberOfStudent() > 571).mapToInt(t -> t.getGradePointAverage()).max());

    }


//task 11-->Ogrenci sayilari 1071'dan az olan universite'lerin en kucuk notOrt'unu bulunuz.

    public static void LessThan1071NumOfStdtSmallPGA(List<Unıversity> unv){
        System.out.println("task 11 cozumu : " + unv.stream().filter(t -> t.getNumberOfStudent() < 1071).mapToInt(Unıversity::getGradePointAverage).min());

    }

}
