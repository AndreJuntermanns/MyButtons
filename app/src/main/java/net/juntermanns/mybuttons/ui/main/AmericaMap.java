package net.juntermanns.mybuttons.ui.main;

import android.content.Context;
import net.juntermanns.mybuttons.R;
import java.util.HashMap;



public class AmericaMap {

    public static HashMap<String,Object[]> aMap = new HashMap<>();

    private String antiguaundbarbuda;
    private String argentinien;
    private String bahamas;
    private String barbados;
    private String belize;
    private String brasilien;
    private String bolivien;
    private String chile;
    private String costarica;
    private String dominica;
    private String elsalvador;
    private String dominikanischerepublik;
    private String equador;
    private String guyana;
    private String grenada;
    private String guatemala;
    private String haiti;
    private String honduras;
    private String jamaika;
    private String kanada;
    private String vereinigtestaaten;
    private String venezuela;
    private String uruguay;
    private String trinidatundtobago;
    private String kolumbien;
    private String kuba;
    private String suriname;
    private String nicaragua;
    private String mexico;
    private String panama;
    private String peru;
    private String paraguay;
    private String stluca;
    private String stlittsundnevis;
    private String stvincent;

    public AmericaMap() {


        antiguaundbarbuda="🇦🇬";
        argentinien="🇦🇷";
        bahamas="🇦🇷";
        barbados="🇧🇧";
        belize="🇧🇿";
        bolivien="🇧🇴";
        brasilien="🇧🇷";
        chile="🇨🇱";
        costarica="🇨🇷";
        dominica="🇩🇲";
        dominikanischerepublik="🇩🇴";
        elsalvador="🇸🇻";
        equador="🇪🇨";
        grenada="🇬🇩";
        guatemala="🇬🇹";
        guyana="🇬🇾";
        haiti="🇭🇹";
        honduras="🇭🇳";
        jamaika="🇯🇲";
        kanada="🇨🇦";
        kolumbien="🇨🇴";
        kuba="🇨🇺";
        mexico="🇲🇽";
        nicaragua="🇳🇮";
        panama="🇵🇦";
        paraguay="🇵🇾";
        peru="🇵🇪";
        stlittsundnevis="🇰🇳";
        stluca="🇱🇨";
        stvincent="🇻🇨";
        suriname="🇸🇷";
        trinidatundtobago="🇹🇹";
        uruguay="🇺🇾";
        venezuela="🇻🇪";
        vereinigtestaaten="🇺🇸";

    }

    public static AmericaMap getAmericaMap(AmericaMap instanz) {
        
        aMap.put("0", new Object[]{instanz.antiguaundbarbuda, "Antigua und Barbuda", "Saint John's", 443, 102012});
        aMap.put("1", new Object[]{instanz.argentinien, "Argeninien", "Buenos Aires", 2780400, 44271041});
        aMap.put("2", new Object[]{instanz.bahamas, "Bahamas", "Nassau", 13939, 395361});
        aMap.put("3", new Object[]{instanz.barbados, "Barbados", "Bridgetown", 430, 285719});
        aMap.put("4", new Object[]{instanz.belize, "Belize", "Belmopan", 22966, 374681});
        aMap.put("5", new Object[]{instanz.bolivien, "Bolivien", "Sucre", 1098581, 11051600});
        aMap.put("6", new Object[]{instanz.brasilien, "Brasilien", "Brasilia", 8514215, 209288278});
        aMap.put("7", new Object[]{instanz.chile, "Chile", "Santiago de Chile", 755696, 18054726});
        aMap.put("8", new Object[]{instanz.costarica, "Costa Rica", "San José", 51100, 4905769});
        aMap.put("9", new Object[]{instanz.dominica, "Dominica", "Roseau", 746, 73925});
        aMap.put("10", new Object[]{instanz.dominikanischerepublik, "Dominikanische Republik", "Santo Domingo", 48730, 10766998});
        aMap.put("11", new Object[]{instanz.elsalvador, "El Salvador", "San Salvador", 21041, 6377853});
        aMap.put("12", new Object[]{instanz.equador, "Equador", "Quito", 283561, 16624858});
        aMap.put("13", new Object[]{instanz.grenada, "Grenada", "St. George's", 344, 107825});
        aMap.put("14", new Object[]{instanz.guatemala, "Guatemala", "Guatemala-Stadt", 109021, 16913503});
        aMap.put("15", new Object[]{instanz.guyana, "Guyana", "Georgetown", 214970, 777859});
        aMap.put("16", new Object[]{instanz.haiti, "Haiti", "Port-au-Prince", 27750, 10981229});
        aMap.put("17", new Object[]{instanz.honduras, "Honduras", "Tegucigalpa", 112090, 9265067});
        aMap.put("18", new Object[]{instanz.jamaika, "Jamaika", "Kingston", 10991, 2890299});
        aMap.put("19", new Object[]{instanz.kanada, "Kanada", "Ottawa", 9984670, 36624199});
        aMap.put("20", new Object[]{instanz.kolumbien, "Kolumbien", "Bogotá", 1138748, 49065615});
        aMap.put("21", new Object[]{instanz.kuba, "Kuba", "Havanna", 109884, 11484636});
        aMap.put("22", new Object[]{instanz.mexico, "Mexiko", "Mexiko-Stadt", 1972550, 129163276});
        aMap.put("23", new Object[]{instanz.nicaragua, "Nicaragua", "Managua", 129494, 6217581});
        aMap.put("24", new Object[]{instanz.panama, "Panama", "Panama-Stadt", 75517, 4098587});
        aMap.put("25", new Object[]{instanz.paraguay, "Paraguay", "Asunción", 406752, 6811297});
        aMap.put("26", new Object[]{instanz.peru, "Peru", "Lima", 1285220, 32165485});
        aMap.put("27", new Object[]{instanz.stlittsundnevis, "St.Kitts und Nevis", "Basseterre", 269, 55345});
        aMap.put("28", new Object[]{instanz.stluca, "Saint Lucia", "Castries", 616, 178844});
        aMap.put("29", new Object[]{instanz.stvincent, "St.Vincent und die Grenadines", "Kingstown", 389, 109897});
        aMap.put("30", new Object[]{instanz.suriname, "Suriname", "Paramaribo", 163820, 563402});
        aMap.put("31", new Object[]{instanz.trinidatundtobago, "Trinidat und Tobago", "Port of Spain", 5128, 1369125});
        aMap.put("32", new Object[]{instanz.uruguay, "Uruguay", "Montevideo", 176215, 3456750});
        aMap.put("33", new Object[]{instanz.venezuela, "Venezuela", "Caracas", 916445, 31977065});
        aMap.put("34", new Object[]{instanz.vereinigtestaaten, "Vereinigte Staaten", "Washington, D.C.", 9826675, 324459463});
        // -hier ist sonst ende

        return instanz;
    }
}

