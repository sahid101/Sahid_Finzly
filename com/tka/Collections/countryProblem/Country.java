package com.Practice.Collections.countryProblem;
import java.util.*;

public class Country {


    LinkedHashMap<String, TreeMap<String, HashMap<String, ArrayList<Cities>>>> operation(){
        Cities hajo =  new Cities("Hajo");
        Cities bongaigaon = new Cities("Bongaigaon");
        Cities diphu = new Cities("Diphu");
        Cities karimganj =  new Cities("Karimganj");
        Cities nagaon = new Cities("Nagaon");
        Cities tinsukia = new Cities("Tinsukia");
        Cities goalpara = new Cities("Goalpara");
        Cities golaghat = new Cities("Golaghat");
        Cities hailakandi = new Cities("Hailakandi");
        Cities mangaldoi = new Cities("Mangaldoi");
        Cities haflong = new Cities("Haflong");
        Cities kokrajhar = new Cities("Kokrajhar");
        Cities barpeta = new Cities("Barpeta");
        Cities margherita = new Cities("Margherita");
        Cities dhekiajuli = new Cities("Dhekiajuli");
        Cities nalbari = new Cities("Nalbari");
        Cities hojai = new Cities("Hojai");
        Cities lumding = new Cities("Lumding");
        Cities udalguri = new Cities("Udalguri");

    
        Cities gaya = new Cities("Gaya");
        Cities muzaffarpur = new Cities("Muzaffarpur");
        Cities bhagalpur = new Cities("Bhagalpur");
        Cities darbhanga = new Cities("Darbhanga");
        Cities purnia = new Cities("Purnia");
        Cities ara = new Cities("Ara");
        Cities begusarai = new Cities("Begusarai");
        Cities katihar = new Cities("Katihar");
        Cities chapra = new Cities("Chapra");

        Cities munger = new Cities("Munger");
        Cities bettiah = new Cities("Bettiah");
        Cities sasaram = new Cities("Sasaram");
        Cities hajipur = new Cities("Hajipur");
        Cities siwan = new Cities("Siwan");
        Cities dehri = new Cities("Dehri");
        Cities motihari = new Cities("Motihari");
        Cities nawada = new Cities("Nawada");
        Cities buxar = new Cities("Buxar");
        

        ArrayList<Cities> biswanath = new ArrayList<>();
        biswanath.add(hajo);
        biswanath.add(bongaigaon);
        biswanath.add(diphu);
        biswanath.add(karimganj);
        biswanath.add(nagaon);
        biswanath.add(tinsukia);

        ArrayList<Cities> dibrugarh = new ArrayList<>();
        dibrugarh.add(goalpara);
        dibrugarh.add(golaghat);
        dibrugarh.add(hailakandi);
        dibrugarh.add(mangaldoi);

        ArrayList<Cities> sivsagar = new ArrayList<>();
        sivsagar.add(haflong);
        sivsagar.add(kokrajhar);
        sivsagar.add(barpeta);
        sivsagar.add(margherita);
        sivsagar.add(dhekiajuli);

        ArrayList<Cities> jorhat = new ArrayList<>();
        jorhat.add(nalbari);
        jorhat.add(hojai);
        jorhat.add(lumding);
        jorhat.add(udalguri);
        

        ArrayList<Cities> patna = new ArrayList<>();
        patna.add(gaya);
        patna.add(muzaffarpur);
        patna.add(bhagalpur);
        patna.add(darbhanga);
        patna.add(purnia);
        patna.add(ara);
        patna.add(begusarai);
        patna.add(katihar);
        patna.add(chapra);

        ArrayList<Cities> kishanganj = new ArrayList<>();
        kishanganj.add(munger);
        kishanganj.add(bettiah);
        kishanganj.add(sasaram);
        kishanganj.add(hajipur);
        kishanganj.add(siwan);
        kishanganj.add(dehri);
        kishanganj.add(motihari);
        kishanganj.add(nawada);

        HashMap<String,ArrayList<Cities>> assamDistrict = new HashMap<>();
        assamDistrict.put("Biswanath",biswanath);
        assamDistrict.put("Dibrugarh",dibrugarh);
        assamDistrict.put("Jorhat",jorhat);
        assamDistrict.put("Sivasagar",sivsagar);

        HashMap<String,ArrayList<Cities>> biharDistrict = new HashMap<>();
        biharDistrict.put("Kishanganj",kishanganj);
        biharDistrict.put("Patna",patna);

        TreeMap<String, HashMap<String,ArrayList<Cities>>> state = new TreeMap<>();
        state.put("Assam",assamDistrict);
        state.put("Bihar",biharDistrict);
        
        LinkedHashMap<String,TreeMap<String, HashMap<String,ArrayList<Cities>>>> country = new LinkedHashMap<>();
        country.put("India",state);
         
        return country;
    }

    public static void main(String[] args) {
        Country india = new Country();
        System.out.println(india.operation());
    }
    
}
