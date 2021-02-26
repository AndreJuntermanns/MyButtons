package net.juntermanns.mybuttons.ui.main;

import android.app.Application;
import android.arch.lifecycle.LiveData;
import android.arch.lifecycle.MutableLiveData;
import android.arch.lifecycle.ViewModel;

import net.juntermanns.mybuttons.ButtonColorAnimatorArrnummer;
import net.juntermanns.mybuttons.ButtonColorAnimatorIndex;
import net.juntermanns.mybuttons.MyEmojiButton;

import java.util.HashMap;
import java.util.Random;

public class MyViewModel extends ViewModel {

    public static AmericaMap americaMap = new AmericaMap();
    public static AfricaMap africaMap = new AfricaMap();
    public static AsiaMap asiaMap = new AsiaMap();
    public static BruchMap bruchMap = new BruchMap();
    public static EuroMap euroMap = new EuroMap();
    public static GameMode gameMode = new GameMode();
    public static int gridLength = 4;
    public static String[][] emojiArray = new String[gridLength][gridLength];
    public static int index = 0;
    public static int arrnummer = 0;
    public static int detail = 3; // {niederlande, "Niederlande", "Amsterdam", 41526, 16680000, "Westeuropa", 100.0, true});
    public static ButtonColorAnimatorIndex animIndex;
    public static ButtonColorAnimatorArrnummer animArrnummer;
    public static int numberMin = 0;
    public static int numberMax;
    public static int buttonWidth;
    public static int buttonHeight;
    public static int emojiSize;
    public static String retStr;
    public static String titleBarString;


    public MutableLiveData<String[][]> liveEmojiArray = new MutableLiveData<>();

    public MyViewModel() {

    }

    public LiveData<String[][]> getLiveEmojiArray() {
        if (liveEmojiArray == null) {
            liveEmojiArray = new MutableLiveData<>();
        }
        return liveEmojiArray;
    }

}
