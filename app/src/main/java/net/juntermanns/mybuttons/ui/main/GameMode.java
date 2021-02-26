package net.juntermanns.mybuttons.ui.main;

import java.util.HashMap;

public class GameMode {
    public Integer status = 0;
    public Integer detail = 0;
    private static HashMap<Integer, Object[]> gameModeMap = new HashMap<>();

    public GameMode() { }

    public static GameMode initGameMap(GameMode instanz) {
        gameModeMap.put(1, new Object[]{"Welche Zahl ist grösser?",0});  //TODO gleicher gameMode aber unterschiedlicher Anspruch
        gameModeMap.put(2, new Object[]{"Euroländer Flächen",3});
        gameModeMap.put(3, new Object[]{"Welcher Bruch ist grösser?",0});
        gameModeMap.put(4, new Object[]{"Euroländer Einwohner",4});
        gameModeMap.put(5, new Object[]{"Europa - wähle die Flagge",1});
        gameModeMap.put(6, new Object[]{"Europas Hauptstädte",2});
        gameModeMap.put(7, new Object[]{"Kontinent Amerika Flächen",3});
        gameModeMap.put(8, new Object[]{"Kontinent Amerika Einwohner",4});
        gameModeMap.put(9, new Object[]{"Amerika - wähle die Flagge",1});
        gameModeMap.put(10, new Object[]{"Kontinental-Amerikas Hauptstädte",2});
        gameModeMap.put(11, new Object[]{"Asien - wähle die Flagge",1});
        gameModeMap.put(12, new Object[]{"Asiens Hauptstädte",2});
        gameModeMap.put(13, new Object[]{"Afrika - wähle die Flagge",1});
        gameModeMap.put(14, new Object[]{"Afrika Hauptstädte",2});
        
        return instanz;
    }

    public Integer getStatus() {
        return status;
    }
    public Integer getDetail() {
        Object[] tempArr = gameModeMap.get(getStatus());
        detail = (Integer) tempArr[1];
        return detail;
    }

    public String setStatus(Integer status) {
        this.status = status;
        Object[] tempArr = gameModeMap.get(getStatus());
        return (String) tempArr[0];
    }

    public static HashMap<Integer, Object[]> getGameModeMap() {
        return gameModeMap;
    }

    public static void setGameModeMap(HashMap<Integer, Object[]> gameModeMap) {
        GameMode.gameModeMap = gameModeMap;
    }
}
