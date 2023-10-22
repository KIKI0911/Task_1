import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Country {
    public static void main(String[] args) throws Exception {

        List<String> countryName = new ArrayList<>();
        countryName.add("Japan");
        countryName.add("America");
        countryName.add("Canada");
        for(String nameSelect: countryName){
            if(nameSelect.contains("d")){
                System.out.println("d is included in the name of country");
            }else{
                System.out.println(nameSelect);
            }
        }
        System.out.println();

        Map <String,List<String>> countryStatus = new HashMap<>();
        List <String> japanPrefectures = new ArrayList<>();
        japanPrefectures.add("Tokyo");
        japanPrefectures.add("Oska");
        japanPrefectures.add("Aichi");
        countryStatus.put("Japan",japanPrefectures);

        List <String> americaStates = new ArrayList<>();
        americaStates.add("Atlanta");
        americaStates.add("New York");
        americaStates.add("Chicago");
        countryStatus.put("America",americaStates);

        List <String> canadaProvinces = new ArrayList<>();
        canadaProvinces.add("Ontario");
        canadaProvinces.add("British Columbia");
        canadaProvinces.add("Alberta");
        countryStatus.put("Canada",canadaProvinces);

        for(Map.Entry <String,List<String>> entry: countryStatus.entrySet()){
            System.out.println(entry);
        }

        JapanPrefecture prefectureAichi = new JapanPrefecture("Nagoya", 2326191);
        JapanPrefecture prefectureOsaka = new JapanPrefecture("Sakai", 826161);
        if(prefectureAichi.getName().equals("N")|| prefectureOsaka.getName().equals("S")){
            throw new IOException("なんらかの入出力例外の発生しました");
            //System.out.println(prefectureAichi.getName()+ "の人口は"+ prefectureAichi.getPopulation() );
            //System.out.println(prefectureOsaka.getName()+ "の人口は"+ prefectureOsaka.getPopulation());
        }
    }
}


