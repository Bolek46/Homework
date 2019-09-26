import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Arrays;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Filtrowanie {
    public static void main(String[] args) {
        List<Samochody> samochodyList = Arrays.asList(
                new Samochody("BMW","E90",4,true,190000,30000,"Srebrny"),
                new Samochody("BMW","G11",4,true,67000,363500,"Czarny"),
                new Samochody("Toyota","Supra",2,true,250000,120000,"Czarny"),
                new Samochody("Dawewoo","Matiz", 4,false, 150000,1000,"Czerwony"),
                new Samochody("Nissan", "Skyline",2,true,300000,53000,"Biały"),
                new Samochody("Opel","Astra H",4,true,190000,20000,"Czarny")
        );

        //Filtr 1
        Predicate<Samochody> mBMW = m-> m.getMarka().equals("BMW");
        List<Samochody> BMW=new ArrayList<>();
        BMW=samochodyList.stream()
                .filter(mBMW)
                .collect(Collectors.toList());
        System.out.println(BMW.size());

        //Filtr 2
        samochodyList.stream()
                .filter(samochod-> samochod.getCena()<50000)
                .filter(samochod-> samochod.getPrzebieg()<200000)
                .filter(samochod-> samochod.getIle_drzwi()==4)
                .filter(samochod-> samochod.isKlimatyzacja()==true)
                .map(samochod-> samochod.getMarka()+" "+samochod.getModel()+" "+samochod.getCena()+" "
                        +samochod.getPrzebieg()+" "+samochod.getIle_drzwi()+" "+samochod.isKlimatyzacja())
                .forEach(System.out::println);


        //Filtr 3
        /*
        Collections.sort(samochodyList);
        for(int i=0;i<5;i++)
        System.out.println(samochodyList.get(i));
*/

        samochodyList.stream()
                .sorted(Samochody::compareTo)
                .limit(5)
                .forEach(System.out::println);

        System.out.println("|||||||||||||||||||||||||||||");
        List<Samochody>lista=new ArrayList<>();
        lista=samochodyList.stream()
                .filter(samochod-> samochod.getIle_drzwi()==4)
                .collect(Collectors.toList());


               // .forEach(System.out::println);


    }
}
