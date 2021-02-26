package net.juntermanns.mybuttons.ui.main;


import java.util.HashMap;
import java.util.Map;

public class BruchMap {
    public static HashMap<String,Object[]> bMap = new HashMap<>();

    public BruchMap() {}

    public static BruchMap getBruchMap(BruchMap instanz){
       
        bMap.put("0", new Object[]{" 1/2 ", 0.5});
        bMap.put("1", new Object[]{" 1/3 ", 0.33333});
        bMap.put("2", new Object[]{" 2/5 ", 0.4});
        bMap.put("3", new Object[]{" 3/5 ", 0.6});
        bMap.put("4", new Object[]{" 7/8 ", 0.875});
        bMap.put("5", new Object[]{" 9/10 ", 0.9});
        bMap.put("6", new Object[]{" 3/4 ", 0.75});
        bMap.put("7", new Object[]{" 6/7 ", 0.857});
        bMap.put("8", new Object[]{" 4/9 ", 0.44444});
        bMap.put("9", new Object[]{" 1/8 ", 0.125});
        bMap.put("10", new Object[]{" 3/8 ", 0.375});
        bMap.put("11", new Object[]{" 1/5 ", 0.2});
        bMap.put("12", new Object[]{" 1/9 ", 0.11111});
        bMap.put("13", new Object[]{" 1/6 ", 0.16});
        bMap.put("14", new Object[]{" 2/3 ", 0.66666});
        bMap.put("15", new Object[]{" 1/10", 0.1});
        bMap.put("16", new Object[]{" 4/5 ", 0.8});
        bMap.put("17", new Object[]{" 5/6 ", 0.83333});
        bMap.put("18", new Object[]{" 1/4 ", 0.25});
        bMap.put("19", new Object[]{" 1/1 ", 1.0});
        bMap.put("20", new Object[]{" 3/7 ", 0.42857});
        bMap.put("21", new Object[]{" 5/7 ", 0.71428});
        bMap.put("22", new Object[]{" 5/8 ", 0.625});
        bMap.put("23", new Object[]{" 2/4 ", 0.5});
        bMap.put("24", new Object[]{" 3/9 ", 0.33333});
        bMap.put("25", new Object[]{" 5/2 ", 2.5});
        bMap.put("26", new Object[]{" 3/2 ", 1.5});
        bMap.put("27", new Object[]{" 5/3 ", 1.66666});
        bMap.put("28", new Object[]{" 5/4 ", 1.25});
        bMap.put("29", new Object[]{" 7/4 ", 1.75});
        bMap.put("30", new Object[]{" 4/1 ", 4.0});
        bMap.put("31", new Object[]{" 1/7 ", 0.14287});
        bMap.put("32", new Object[]{" 2/7 ", 0.28571});
        bMap.put("33", new Object[]{" 7/2 ", 3.5});
        bMap.put("34", new Object[]{"13/15", 0.76470});
        bMap.put("35", new Object[]{"15/17", 0.88235});
        bMap.put("36", new Object[]{" 1/11", 0.09090});
        bMap.put("37", new Object[]{" 2/11", 0.18181});
        bMap.put("38", new Object[]{" 3/13", 0.23076});
        bMap.put("39", new Object[]{" 3/11", 0.27272});
        bMap.put("40", new Object[]{" 3/10", 0.3});
        bMap.put("41", new Object[]{"17/13", 1.30769});
        bMap.put("42", new Object[]{" 7/10", 0.7});
        bMap.put("43", new Object[]{" 2/13", 0.15384});
        bMap.put("44", new Object[]{" 4/13", 0.30769});
        bMap.put("45", new Object[]{" 7/12", 0.58333});
        bMap.put("46", new Object[]{" 5/12", 0.41666});
        bMap.put("47", new Object[]{"11/13", 0.84615});
        bMap.put("48", new Object[]{"13/11", 1.18181});

        return instanz;
    }
}
