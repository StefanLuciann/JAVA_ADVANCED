package colectii.Maps.ex1;

import java.util.HashMap;
import java.util.Map;

/**
 * Create a map and display its result (data should be provided by the user - console):
 * - Names and surnames
 * - Names and ages.*/
public class Main {
    public static void main(String[] args) {
        Map<String,String > surnamesByNames = new HashMap<>();
        surnamesByNames.put("Matei","Stefan");
        surnamesByNames.put("Vasile","Grigorie");
        surnamesByNames.put("Dani","Ion");
        surnamesByNames.put("Anton","Ionut");
        surnamesByNames.put("Anton","Igor");
        for(Map.Entry<String ,String> entry : surnamesByNames.entrySet()){
            System.out.println(entry.getKey()+" "+entry.getValue());
        }
        if (!surnamesByNames.containsKey("Anton")) {
            surnamesByNames.put("Anton","Ion");
        }

        surnamesByNames.putIfAbsent("Anton","Ion");//acelasi lucru ca if de sus

        System.out.println();
        System.out.println(surnamesByNames.get("Anton"));
        System.out.println(surnamesByNames.get("Vasile21"));
        System.out.println(surnamesByNames.get("Dani"));

    }

}
