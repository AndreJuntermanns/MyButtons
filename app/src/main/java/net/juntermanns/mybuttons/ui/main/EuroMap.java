package net.juntermanns.mybuttons.ui.main;

import android.content.Context;

import net.juntermanns.mybuttons.R;

import java.util.HashMap;
import java.util.Map;

public class EuroMap {

    public static HashMap<String, Object[]> eMap = new HashMap<>();

    private String deutschland;
    private String italien;
    private String oesterreich;
    private String frankreich;
    private String bosnienherzegowina;
    private String belgien;
    private String bulgarien;
    private String tschechien;
    private String daenemark;
    private String spanien;
    private String finnland;
    private String vereinteskoenigreich;
    private String griechenland;
    private String kroatien;
    private String ungarn;
    private String irland;
    private String liechtenstein;
    private String luxemburg;
    private String monaco;
    private String moldawien;
    private String montenegro;
    private String malta;
    private String polen;
    private String portugal;
    private String serbien;
    private String schweden;
    private String slowenien;
    private String slowakei;
    private String tuerkei;
    private String kosovo;
    private String albanien;
    private String andorra;
    private String estland;
    private String island;
    private String kasachstan;
    private String lettland;
    private String littauen;
    private String mazedonien;
    private String niederlande;
    private String norwegen;
    private String rumänien;
    private String russland;
    private String sanmarino;
    private String schweiz;
    private String ukraine;
    private String vatikan;
    private String belarus;

    public EuroMap() {

        deutschland = "🇩🇪";
        italien= "🇮🇹";
        oesterreich="🇦🇹";
        frankreich="🇫🇷";
        bosnienherzegowina="🇧🇦";
        belgien="🇧🇪";
        bulgarien="🇧🇬";
        tschechien="🇨🇿";
        daenemark="🇩🇰";
        spanien="🇪🇸";
        finnland="🇫🇮";
        vereinteskoenigreich="🇬🇧";
        griechenland="🇬🇷";
        kroatien="🇭🇷";
        ungarn="🇭🇺";
        irland="🇮🇪";
        liechtenstein="🇱🇮";
        luxemburg="🇱🇺";
        monaco="🇲🇨";
        moldawien="🇲🇩";
        montenegro="🇲🇪";
        malta="🇲🇹";
        polen="🇵🇱";
        portugal="🇵🇹";
        serbien="🇷🇸";
        schweden="🇸🇪";
        slowenien="🇸🇮";
        slowakei="🇸🇰";
        tuerkei="🇹🇷";
        kosovo="🇽🇰";
        albanien="🇦🇱";
        andorra="🇦🇩";
        estland="🇪🇪";
        island="🇮🇸";
        kasachstan="🇰🇿";
        lettland="🇱🇻";
        littauen="🇱🇹";
        mazedonien="🇲🇰";
        niederlande="🇳🇱";
        norwegen="🇳🇴";
        rumänien="🇷🇴";
        russland="🇷🇺";
        sanmarino="🇸🇲";
        schweiz="🇨🇭";
        ukraine="🇺🇦";
        vatikan="🇻🇦";
        belarus="🇧🇾";
    }
    
    public static EuroMap getEuroMap(EuroMap instanz){

        eMap.put("0", new Object[]{instanz.deutschland, "Deutschland", "Berlin", 357093, 81882000, "Mitteleuropa", 100.0, true});
        eMap.put("1", new Object[]{instanz.italien, "Italien", "Rom", 301336, 60246000, "Südeuropa", 100.0, true});
        eMap.put("2", new Object[]{instanz.oesterreich, "Österreich", "Wien", 83871, 8488000, "Mitteleuropa", 100.0, true});
        eMap.put("3", new Object[]{instanz.frankreich, "Frankreich", "Paris", 543965, 62793000, "Westeuropa", 100.0, true});
        eMap.put("4", new Object[]{instanz.bosnienherzegowina, "Bosnien und Herzegowina", "Sarajevo", 51197, 37910000, "Südosteuropa", 100.0, false});
        eMap.put("5", new Object[]{instanz.belgien, "Belgien", "Brüssel", 32528, 10667000, "Westeuropa", 100.0, true});
        eMap.put("6", new Object[]{instanz.bulgarien, "Bulgarien", "Sofia", 110994, 7365000, "Südosteuropa", 100.0, true});
        eMap.put("7", new Object[]{instanz.tschechien, "Tschechien", "Prag", 78866, 10526000, "Mitteleuropa", 100.0, true});
        eMap.put("8", new Object[]{instanz.albanien, "Albanien", "Tirana", 28748, 3170000, "Südosteuropa", 100.0, false});
        eMap.put("9", new Object[]{instanz.andorra, "Andorra", "Andorra la Vella", 468, 83900, "Südwesteuropa", 100.0, false});
        eMap.put("10", new Object[]{instanz.daenemark, "Dänemark", "Kopenhagen", 43098, 5476000, "Nordeuropa", 100.0, true});
        eMap.put("11", new Object[]{instanz.estland, "Estland", "Tallinn", 45227, 1342000, "Nordosteuropa", 100.0, true});
        eMap.put("12", new Object[]{instanz.finnland, "Finnland", "Helsinki", 338144, 5326000, "Nordeuropa", 100.0, true});
        eMap.put("13", new Object[]{instanz.griechenland, "Griechenland", "Athen", 131957, 11142000, "Südosteuropa", 100.0, true});
        eMap.put("14", new Object[]{instanz.irland, "Irland", "Dublin", 70273, 458100, "Nordwesteuropa", 100.0, true});
        eMap.put("15", new Object[]{instanz.island, "Island", "Reykjavík", 103000, 318000, "Nordeuropa", 100.0, true});
        eMap.put("17", new Object[]{instanz.kosovo, "Kosovo", "Priština", 10908, 1800000, "Südosteuropa", 100.0, false});
        eMap.put("18", new Object[]{instanz.kroatien, "Kroatien", "Zagreb", 56542, 4480000, "Südosteuropa", 100.0, true});
        eMap.put("19", new Object[]{instanz.lettland, "Lettland", "Riga", 64589, 2075000, "Nordosteuropa", 100.0, true});
        eMap.put("20", new Object[]{instanz.liechtenstein, "Liechtenstein", "Vaduz", 160, 36000, "Mitteleuropa", 100.0, false});
        eMap.put("21", new Object[]{instanz.littauen, "Litauen", "Vilnius", 65301, 298100, "Nordosteuropa", 100.0, true});
        eMap.put("22", new Object[]{instanz.luxemburg, "Luxemburg", "Luxemburg", 2586, 537000, "Westeuropa", 100.0, true});
        eMap.put("23", new Object[]{instanz.malta, "Malta", "Valletta", 316, 417000, "Südeuropa", 100.0, true});
        eMap.put("24", new Object[]{instanz.mazedonien, "Mazedonien", "Skopje", 25713, 2057000, "Südosteuropa", 100.0, false});
        eMap.put("25", new Object[]{instanz.moldawien, "Moldawien", "Kischinau", 33843, 3154000, "Südosteuropa", 100.0, false});
        eMap.put("26", new Object[]{instanz.monaco, "Monaco", "Montecarlo", 2, 36000, "Südeuropa", 100.0, false});
        eMap.put("27", new Object[]{instanz.montenegro, "Montenegro", "Podgorica", 13812, 625000, "Südosteuropa", 100.0, false});
        eMap.put("28", new Object[]{instanz.niederlande, "Niederlande", "Amsterdam", 41526, 16680000, "Westeuropa", 100.0, true});
        eMap.put("29", new Object[]{instanz.norwegen, "Norwegen", "Oslo", 385200, 5063000, "Nordeuropa", 100.0, false});
        eMap.put("30", new Object[]{instanz.polen, "Polen", "Warschau", 312685, 3850100, "Mitteleuropa", 100.0, true});
        eMap.put("31", new Object[]{instanz.portugal, "Portugal", "Lissabon", 92212, 10602000, "Südwesteuropa", 100.0, true});
        eMap.put("32", new Object[]{instanz.rumänien, "Rumänien", "Bukarest", 238391, 19043000, "Südosteuropa", 100.0, true});
        eMap.put("34", new Object[]{instanz.sanmarino, "San Marino", "San Marino", 61, 32000, "Südeuropa", 100.0, false});
        eMap.put("35", new Object[]{instanz.schweden, "Schweden", "Stockholm", 450000, 9514000, "Nordeuropa", 100.0, true});
        eMap.put("36", new Object[]{instanz.schweiz, "Schweiz", "Bern", 41285, 8014000, "Mitteleuropa", 100.0, false});
        eMap.put("37", new Object[]{instanz.serbien, "Serbien", "Belgrad", 77474, 7120000, "Südosteuropa", 100.0, false});
        eMap.put("38", new Object[]{instanz.slowakei, "Slowakei", "Bratislava", 49034, 5404000, "Mitteleuropa", 100.0, true});
        eMap.put("39", new Object[]{instanz.slowenien, "Slowenien", "Ljubljana", 20273, 2058000, "Mitteleuropa", 100.0, true});
        eMap.put("40", new Object[]{instanz.spanien, "Spanien", "Madrid", 504645, 47213000, "Südwesteuropa", 100.0, true});
        eMap.put("42", new Object[]{instanz.ukraine, "Ukraine", "Kiew", 603700, 45665000, "Osteuropa", 100.0, false});
        eMap.put("43", new Object[]{instanz.ungarn, "Ungarn", "Budapest", 93030, 9967000, "Mitteleuropa", 100.0, true});
        eMap.put("44", new Object[]{instanz.vatikan, "Vatikanstadt", "Vatikanstadt", 1, 836, "Südeuropa", 100.0, false});
        eMap.put("45", new Object[]{instanz.vereinteskoenigreich, "Vereinigtes Königreich", "London", 242910, 63200000, "Nordwesteuropa", 100.0, true});
        eMap.put("46", new Object[]{instanz.belarus, "Weißrussland", "Minsk", 207595, 9489000, "Osteuropa", 100.0, false});

        return instanz;
    }
}
