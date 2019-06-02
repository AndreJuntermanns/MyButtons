package net.juntermanns.mybuttons.ui.main;

import android.animation.ObjectAnimator;
import android.app.Activity;
import android.arch.lifecycle.ViewModelProviders;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Color;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.opengl.Visibility;
import android.os.Bundle;
import android.support.design.widget.BaseTransientBottomBar;
import android.support.design.widget.Snackbar;
import android.support.text.emoji.widget.EmojiButton;
import android.support.v4.provider.FontRequest;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.text.emoji.EmojiCompat;
import android.support.text.emoji.FontRequestEmojiCompatConfig;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AlertDialog;
import android.text.AlteredCharSequence;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.GridLayout;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import net.juntermanns.mybuttons.ButtonColorAnimatorArrnummer;
import net.juntermanns.mybuttons.ButtonColorAnimatorIndex;
import net.juntermanns.mybuttons.MainActivity;
import net.juntermanns.mybuttons.MyEmojiButton;
import net.juntermanns.mybuttons.MyMsgBox;
import net.juntermanns.mybuttons.R;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Random;


//import static android.support.design.widget.Snackbar.LENGTH_INDEFINITE;
//import static android.support.design.widget.Snackbar.LENGTH_LONG;
import static android.support.design.widget.Snackbar.LENGTH_INDEFINITE;
import static android.widget.Toast.LENGTH_LONG;
import static android.widget.Toast.LENGTH_SHORT;
import static net.juntermanns.mybuttons.MainActivity.detail;
import static net.juntermanns.mybuttons.MainActivity.mainfragment;
import static net.juntermanns.mybuttons.MainActivity.gridLength;
import static net.juntermanns.mybuttons.MainActivity.gameMode;
import static net.juntermanns.mybuttons.MainActivity.numberMin;
import static net.juntermanns.mybuttons.MainActivity.numberMax;
import static net.juntermanns.mybuttons.MainActivity.buttonWidth;
import static net.juntermanns.mybuttons.MainActivity.buttonHeight;
import static net.juntermanns.mybuttons.MainActivity.emojiSize;
import static net.juntermanns.mybuttons.MainActivity.retStr;

public class MainFragment extends Fragment {

    public MyEmojiButton[][] btnArr = new MyEmojiButton[gridLength][gridLength];
    private MainViewModel mViewModel;
    public View layout;
    private MyMsgBox messageBox;
    public MyEmojiButton a1;
    MyEmojiButton a2;
    MyEmojiButton a3;
    MyEmojiButton a4;
    MyEmojiButton a5;
    MyEmojiButton a6;
    MyEmojiButton a7;
    MyEmojiButton b1;
    MyEmojiButton b2;
    MyEmojiButton b3;
    MyEmojiButton b4;
    MyEmojiButton b5;
    MyEmojiButton b6;
    MyEmojiButton b7;
    MyEmojiButton c1;
    MyEmojiButton c2;
    MyEmojiButton c3;
    MyEmojiButton c4;
    MyEmojiButton c5;
    MyEmojiButton c6;
    MyEmojiButton c7;
    MyEmojiButton d1;
    MyEmojiButton d2;
    MyEmojiButton d3;
    MyEmojiButton d4;
    MyEmojiButton d5;
    MyEmojiButton d6;
    MyEmojiButton d7;
    MyEmojiButton e1;
    MyEmojiButton e2;
    MyEmojiButton e3;
    MyEmojiButton e4;
    MyEmojiButton e5;
    MyEmojiButton e6;
    MyEmojiButton e7;
    MyEmojiButton f1;
    MyEmojiButton f2;
    MyEmojiButton f3;
    MyEmojiButton f4;
    MyEmojiButton f5;
    MyEmojiButton f6;
    MyEmojiButton f7;
    MyEmojiButton g1;
    MyEmojiButton g2;
    MyEmojiButton g3;
    MyEmojiButton g4;
    MyEmojiButton g5;
    MyEmojiButton g6;
    MyEmojiButton g7;
    Button renew;
    Button level;
    Button range;
    ColorDrawable schwarz;
    ColorDrawable rot;
    ColorDrawable gelb;
    ColorDrawable blau;
    ColorDrawable hellblau;
    ColorDrawable gruen;
    ColorDrawable orange;
    ColorDrawable weiss;

    String deutschland;//= (String) getResources().getText(R.string.deutschland);
    String italien;
    String oesterreich;
    String frankreich;
    String bosnienherzegowina;
    String belgien;
    String bulgarien;
    String tschechien;
    String daenemark;
    String spanien;
    String finnland;
    String vereinteskönigreich;
    String griechenland;
    String kroatien;
    String ungarn;
    String irland;
    String liechtenstein;
    String luxemburg;
    String monaco;
    String moldawien;
    String montenegro;
    String malta;
    String polen;
    String portugal;
    String serbien;
    String schweden;
    String slowenien;
    String slowakei;
    String tuerkei;
    String kosovo;
    String albanien;
    String andorra;
    String estland;
    String island;
    String kasachstan;
    String lettland;
    String littauen;
    String mazedonien;
    String niederlande;
    String norwegen;
    String rumänien;
    String russland;
    String sanmarino;
    String schweiz;
    String ukraine;
    String vatikan;
    String belarus;
    //---- Amerika  ohne kleine Inseln
    String antiguaundbarbuda;
    String argentinien;
    String bahamas;
    String barbados;
    String belize;
    String bolivien;
    String brasilien;
    String chile;
    String costarica;
    String dominica;
    String dominikanischerepublik;
    String elsalvador;
    String equador;
    String grenada;
    String guatemala;
    String guyana;
    String haiti;
    String honduras;
    String jamaika;
    String kanada;
    String kolumbien;
    String kuba;
    String mexico;
    String nicaragua;
    String panama;
    String paraguay;
    String peru;
    String stlittsundnevis;
    String stluca;
    String stvincent;
    String suriname;
    String trinidatundtobago;
    String uruguay;
    String venezuela;
    String vereinigtestaaten;

    String true_sonne;
    String true_cool;
    String true_highfive;
    String true_daumenhoch;
    String true_hangloose;
    String true_ass;
    String true_doppelhaende;
    String true_fuchs;
    String true_applaus;
    String true_victory;
    String true_ok;
    String true_hundert;
    String true_supermann;
    String true_superfrau;
    String true_gluehbirne;
    String true_delfin;
    String true_stark;
    String true_brain;
    String true_shakehands;
    String true_nerd;
    String true_dartscheibe;
    String true_taenzer;
    String true_taenzerin;

    String false_rotfl;
    String false_augenbrauen;
    String false_pinoccio;
    String false_notamused;
    String false_rollendeaugen;
    String false_monokkel;
    String false_pst;
    String false_betrunken;
    String false_keinmund;
    String false_spiralaugen;
    String false_verwirrt;
    String false_schlafweiter;
    String false_kopfexplodiert;
    String false_fluchen;
    String false_heulen;
    String false_dampfablassen;
    String false_facepalm;
    String false_zombie;
    String false_uebelkeit;
    String false_kotzen;

    private int[] tempArr;
    public String[] strArr;
    public String checkStr;
    private List<Integer> tempSmallList;
    public int random_num;
    public int knopfNummer;
    public int knopfNummerAlt = 100;
    public int knopfNummer_lc;
    public int knopfNummerAlt_lc = 100;
    long remainSec = 120L;
    long warnSec = 10L;
    int number;
    public int[][] bigArr;

    private int[] valueArr;

    int punkte = 0;
    String selectedItem;
    public int index = 0;
    public int arrnummer = 0;
   // int numberMin = 0;
   // int numberMax = 100;

    long oldLevelResult = 0L;
    ActionBar toolbar;
    Map<String, Object[]> americaMap;
    Map<String, Object[]> americaMapCopy;
    Map<String, Object[]> euroMap;
    Map<String, Object[]> euroMapCopy;
    Map<String, Object[]> gridMap;
    Map<String, Object[]> bruchMap;
    Map<String, Object[]> bruchMapCopy;
    Map<String,String> trueMap;
    Map<String,String> falseMap;
    Object[][] gridArr;
    Object[][][] bigObjectArr;
    // ObjectAnimator colorAnim = null;
    // ObjectAnimator colorAnim2 = null;
    ButtonColorAnimatorIndex animIndex;
    ButtonColorAnimatorArrnummer animArrnummer;
    public static Snackbar snackbar;
    private Context mContext;
    // public Activity mActivity;
    public GridLayout mCLayout;
    private Intent nextIntent;
    //Integer sizedummy;
    Map<String, String> intToStringRangeMap = new HashMap<>();
    Random random = new Random();
    String randomKey;
    Bitmap bitmap;
    ColorDrawable redDrawable = new ColorDrawable();
    ColorDrawable greenDrawable = new ColorDrawable();
    HorizontalScrollView horizontalScrollView;
    Activity mActivity;
    int color;
    View view;
    View v;
    MainFragment mainFragment;
    private View builder;
    AlertDialog.Builder okButton;
    private float mx, my;
    private float curX, curY;
    int valueX;

    int valueY;


    public static MainFragment newInstance() {
        return new MainFragment();
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        final FontRequest fontRequest = new FontRequest(
                "com.google.android.gms.fonts",
                "com.google.android.gms",
                "Noto Color Emoji Compat",
                R.array.com_google_android_gms_fonts_certs);

        EmojiCompat.Config config = new FontRequestEmojiCompatConfig(getActivity().getApplicationContext(), fontRequest);
        EmojiCompat.init(config);
        Bitmap bitmap = BitmapFactory.decodeResource(getActivity().getResources(), R.drawable.carex);
        setButtonWidth(getActivity());
        rot.setColor(Color.RED);
        schwarz.setColor(Color.BLACK);
        gelb.setColor(Color.YELLOW);
        weiss.setColor(Color.WHITE);
        orange.setColor(Color.argb(255,255,128,0));
        blau.setColor(Color.BLUE);
        hellblau.setColor(Color.argb(255,0,102,204));

        redDrawable.setColor(Color.RED);
        greenDrawable.setColor(Color.GREEN);
        //Toast.makeText(getActivity(),setButtonWidth(getActivity()),LENGTH_LONG).show();
        mActivity = getActivity();

        switch (gridLength) {
            case 3:
                layout = inflater.inflate(R.layout.main_fragment, null);
                horizontalScrollView = layout.findViewById(R.id.HscrollView);
                a1 = layout.findViewById(R.id.a1);
                a2 = layout.findViewById(R.id.a2);
                a3 = layout.findViewById(R.id.a3);
                b1 = layout.findViewById(R.id.b1);
                b2 = layout.findViewById(R.id.b2);
                b3 = layout.findViewById(R.id.b3);
                c1 = layout.findViewById(R.id.c1);
                c2 = layout.findViewById(R.id.c2);
                c3 = layout.findViewById(R.id.c3);
                renew = layout.findViewById(R.id.btn_new);
                level = layout.findViewById(R.id.btn_level);
                range = layout.findViewById(R.id.btn_range);
               // messageBox = new MyMsgBox(getActivity(), 500,Gravity.BOTTOM);

                btnArr = new MyEmojiButton[][]{{a1, a2, a3}, {b1, b2, b3}, {c1, c2, c3}};

                break;
            case 4:
                layout = inflater.inflate(R.layout.main_fragment2, null);
                horizontalScrollView = layout.findViewById(R.id.HscrollView);
                a1 = layout.findViewById(R.id.a1);
                a2 = layout.findViewById(R.id.a2);
                a3 = layout.findViewById(R.id.a3);
                a4 = layout.findViewById(R.id.a4);
                b1 = layout.findViewById(R.id.b1);
                b2 = layout.findViewById(R.id.b2);
                b3 = layout.findViewById(R.id.b3);
                b4 = layout.findViewById(R.id.b4);
                c1 = layout.findViewById(R.id.c1);
                c2 = layout.findViewById(R.id.c2);
                c3 = layout.findViewById(R.id.c3);
                c4 = layout.findViewById(R.id.c4);
                d1 = layout.findViewById(R.id.d1);
                d2 = layout.findViewById(R.id.d2);
                d3 = layout.findViewById(R.id.d3);
                d4 = layout.findViewById(R.id.d4);
                renew = layout.findViewById(R.id.btn_new);
                level = layout.findViewById(R.id.btn_level);
                range = layout.findViewById(R.id.btn_range);
                //messageBox = new MyMsgBox(getActivity(), 500,Gravity.BOTTOM);

                btnArr = new MyEmojiButton[][]{{a1, a2, a3, a4}, {b1, b2, b3, b4}, {c1, c2, c3, c4}, {d1, d2, d3, d4}};
                break;
            case 5:
                layout = inflater.inflate(R.layout.main_fragment3, null);
                horizontalScrollView = layout.findViewById(R.id.HscrollView);
                a1 = layout.findViewById(R.id.a1);
                a2 = layout.findViewById(R.id.a2);
                a3 = layout.findViewById(R.id.a3);
                a4 = layout.findViewById(R.id.a4);
                a5 = layout.findViewById(R.id.a5);
                b1 = layout.findViewById(R.id.b1);
                b2 = layout.findViewById(R.id.b2);
                b3 = layout.findViewById(R.id.b3);
                b4 = layout.findViewById(R.id.b4);
                b5 = layout.findViewById(R.id.b5);
                c1 = layout.findViewById(R.id.c1);
                c2 = layout.findViewById(R.id.c2);
                c3 = layout.findViewById(R.id.c3);
                c4 = layout.findViewById(R.id.c4);
                c5 = layout.findViewById(R.id.c5);
                d1 = layout.findViewById(R.id.d1);
                d2 = layout.findViewById(R.id.d2);
                d3 = layout.findViewById(R.id.d3);
                d4 = layout.findViewById(R.id.d4);
                d5 = layout.findViewById(R.id.d5);
                e1 = layout.findViewById(R.id.e1);
                e2 = layout.findViewById(R.id.e2);
                e3 = layout.findViewById(R.id.e3);
                e4 = layout.findViewById(R.id.e4);
                e5 = layout.findViewById(R.id.e5);
                renew = layout.findViewById(R.id.btn_new);
                level = layout.findViewById(R.id.btn_level);
                range = layout.findViewById(R.id.btn_range);
                //messageBox = new MyMsgBox(getActivity(), 500,Gravity.BOTTOM);

                btnArr = new MyEmojiButton[][]{{a1, a2, a3, a4, a5}, {b1, b2, b3, b4, b5}, {c1, c2, c3, c4, c5}, {d1, d2, d3, d4, d5}, {e1, e2, e3, e4, e5}};
                break;
            case 6:
                layout = inflater.inflate(R.layout.main_fragment4, null);
                horizontalScrollView = layout.findViewById(R.id.HscrollView);
                a1 = layout.findViewById(R.id.a1);
                a2 = layout.findViewById(R.id.a2);
                a3 = layout.findViewById(R.id.a3);
                a4 = layout.findViewById(R.id.a4);
                a5 = layout.findViewById(R.id.a5);
                a6 = layout.findViewById(R.id.a6);
                b1 = layout.findViewById(R.id.b1);
                b2 = layout.findViewById(R.id.b2);
                b3 = layout.findViewById(R.id.b3);
                b4 = layout.findViewById(R.id.b4);
                b5 = layout.findViewById(R.id.b5);
                b6 = layout.findViewById(R.id.b6);
                c1 = layout.findViewById(R.id.c1);
                c2 = layout.findViewById(R.id.c2);
                c3 = layout.findViewById(R.id.c3);
                c4 = layout.findViewById(R.id.c4);
                c5 = layout.findViewById(R.id.c5);
                c6 = layout.findViewById(R.id.c6);
                d1 = layout.findViewById(R.id.d1);
                d2 = layout.findViewById(R.id.d2);
                d3 = layout.findViewById(R.id.d3);
                d4 = layout.findViewById(R.id.d4);
                d5 = layout.findViewById(R.id.d5);
                d6 = layout.findViewById(R.id.d6);
                e1 = layout.findViewById(R.id.e1);
                e2 = layout.findViewById(R.id.e2);
                e3 = layout.findViewById(R.id.e3);
                e4 = layout.findViewById(R.id.e4);
                e5 = layout.findViewById(R.id.e5);
                e6 = layout.findViewById(R.id.e6);
                f1 = layout.findViewById(R.id.f1);
                f2 = layout.findViewById(R.id.f2);
                f3 = layout.findViewById(R.id.f3);
                f4 = layout.findViewById(R.id.f4);
                f5 = layout.findViewById(R.id.f5);
                f6 = layout.findViewById(R.id.f6);
                renew = layout.findViewById(R.id.btn_new);
                level = layout.findViewById(R.id.btn_level);
                range = layout.findViewById(R.id.btn_range);
                //messageBox = new MyMsgBox(getActivity(), 500,Gravity.BOTTOM);
                btnArr = new MyEmojiButton[][]{{a1, a2, a3, a4, a5, a6}, {b1, b2, b3, b4, b5, b6}, {c1, c2, c3, c4, c5, c6}, {d1, d2, d3, d4, d5, d6}, {e1, e2, e3, e4, e5, e6}, {f1, f2, f3, f4, f5, f6}};
                break;
            case 7:
                layout = inflater.inflate(R.layout.main_fragment5, null);
                horizontalScrollView = layout.findViewById(R.id.HscrollView);
                a1 = layout.findViewById(R.id.a1);
                a2 = layout.findViewById(R.id.a2);
                a3 = layout.findViewById(R.id.a3);
                a4 = layout.findViewById(R.id.a4);
                a5 = layout.findViewById(R.id.a5);
                a6 = layout.findViewById(R.id.a6);
                a7 = layout.findViewById(R.id.a7);
                b1 = layout.findViewById(R.id.b1);
                b2 = layout.findViewById(R.id.b2);
                b3 = layout.findViewById(R.id.b3);
                b4 = layout.findViewById(R.id.b4);
                b5 = layout.findViewById(R.id.b5);
                b6 = layout.findViewById(R.id.b6);
                b7 = layout.findViewById(R.id.b7);
                c1 = layout.findViewById(R.id.c1);
                c2 = layout.findViewById(R.id.c2);
                c3 = layout.findViewById(R.id.c3);
                c4 = layout.findViewById(R.id.c4);
                c5 = layout.findViewById(R.id.c5);
                c6 = layout.findViewById(R.id.c6);
                c7 = layout.findViewById(R.id.c7);
                d1 = layout.findViewById(R.id.d1);
                d2 = layout.findViewById(R.id.d2);
                d3 = layout.findViewById(R.id.d3);
                d4 = layout.findViewById(R.id.d4);
                d5 = layout.findViewById(R.id.d5);
                d6 = layout.findViewById(R.id.d6);
                d7 = layout.findViewById(R.id.d7);
                e1 = layout.findViewById(R.id.e1);
                e2 = layout.findViewById(R.id.e2);
                e3 = layout.findViewById(R.id.e3);
                e4 = layout.findViewById(R.id.e4);
                e5 = layout.findViewById(R.id.e5);
                e6 = layout.findViewById(R.id.e6);
                e7 = layout.findViewById(R.id.e7);
                f1 = layout.findViewById(R.id.f1);
                f2 = layout.findViewById(R.id.f2);
                f3 = layout.findViewById(R.id.f3);
                f4 = layout.findViewById(R.id.f4);
                f5 = layout.findViewById(R.id.f5);
                f6 = layout.findViewById(R.id.f6);
                f7 = layout.findViewById(R.id.f7);
                g1 = layout.findViewById(R.id.g1);
                g2 = layout.findViewById(R.id.g2);
                g3 = layout.findViewById(R.id.g3);
                g4 = layout.findViewById(R.id.g4);
                g5 = layout.findViewById(R.id.g5);
                g6 = layout.findViewById(R.id.g6);
                g7 = layout.findViewById(R.id.g7);
                renew = layout.findViewById(R.id.btn_new);
                level = layout.findViewById(R.id.btn_level);
                range = layout.findViewById(R.id.btn_range);
                //messageBox = new MyMsgBox(getActivity(), 500,Gravity.BOTTOM);
                btnArr = new MyEmojiButton[][]{{a1, a2, a3, a4, a5, a6, a7}, {b1, b2, b3, b4, b5, b6, b7}, {c1, c2, c3, c4, c5, c6, c7}, {d1, d2, d3, d4, d5, d6, d7}, {e1, e2, e3, e4, e5, e6, e7}, {f1, f2, f3, f4, f5, f6, f7}, {g1, g2, g3, g4, g5, g6, g7}};
                break;
        }
        try {
            for (int i = 0; i < gridLength; i++) {
                for (int e = 0; e < gridLength; e++) {
                    btnArr[i][e].setWidth(buttonWidth);
                    btnArr[i][e].setHeight(buttonHeight);
                    btnArr[i][e].setTextSize(emojiSize);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        layout.setBackgroundDrawable(new BitmapDrawable(bitmap));
        btnArr = generateGameSet(getColorTheme(), detail);
       // m = new MyMsgBox(getContext(), 800, Gravity.BOTTOM);
        //a1.callOnClick();
        return layout;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        mViewModel = ViewModelProviders.of(this).get(MainViewModel.class);
        //m = new MyMsgBox(getContext(), 800, Gravity.BOTTOM);
        a1.callOnClick();
        // TODO: Use the ViewModel
    }

    public MyEmojiButton[][] generateGameSet(int color, int detail) {

        switch (gameMode) {
            case 1:
                btnArr = generateFields(getColorTheme()); // Zahlenspiel
                //   Snackbar.make(layout,getResources().getString(R.string.landesflaeche),
                //           LENGTH_INDEFINITE).show();
                //snackBarShow();
                bitmap = BitmapFactory.decodeResource(getActivity().getResources(), R.drawable.zahlenbackgrnd);
                //reactionButton.setText(retStr); testing Custom Toast

                break;
            case 2: //Bitmap bitmap = BitmapFactory.decodeResource(getActivity().getResources(), R.drawable.planeta_terra_ga7);
            case 4: //Bitmap bitmap = BitmapFactory.decodeResource(getActivity().getResources(), R.drawable.planeta_terra_ga7);
            case 5: // Bitmap bitmap = BitmapFactory.decodeResource(getActivity().getResources(), R.drawable.planeta_terra_ga7);
            case 6: //Bitmap bitmap = BitmapFactory.decodeResource(getActivity().getResources(), R.drawable.planeta_terra_ga7);
                btnArr = generateFlags(getColorTheme());
                //   Snackbar.make(layout,getResources().getString(R.string.landesflaeche),
                //           LENGTH_INDEFINITE).show();
                //snackBarShow();
                bitmap = BitmapFactory.decodeResource(getActivity().getResources(), R.drawable.carex);
                //reactionButton.setText(retStr);


                break;
            case 3:
                btnArr = generateFract(getColorTheme()); // Brüche vergleichen
                //   Snackbar.make(layout,"Tippe auf den größeren Bruck",
                //           LENGTH_INDEFINITE).show();
                //snackBarShow();
                //reactionButton.setText(retStr);
                break;
            case 7:
            case 8:
            case 9:
            case 10:
                btnArr = generateAmericaFlags(getColorTheme());
                //snackBarShow();
               // reactionButton.setText(retStr);


                break;
        }
        //snackBarShow();  makes it die
        layout.setBackgroundDrawable(new BitmapDrawable(bitmap));
        return btnArr;
    }

    public MyEmojiButton[][] generateFields(int color) {  //Zahlenfelder

        bigArr = new int[gridLength][gridLength];
        valueArr = new int[gridLength * gridLength];
        if(numberMax < gridLength*gridLength) numberMax = gridLength*gridLength;
        numberMin = 0;
        // numberMax = 100;

        // color = (getResources().getColor(R.color.Blau_Hintergrund));

        // view = this.getCurrentFocus();

        String numberAsString;
        //bigArr = new int[gridLength][gridLength];

        List<int[]> tempBigList;

        //btnArr = new Button[gridLength][gridLength];
        //numberBoolArr = new boolean[gridLength][gridLength];
        tempBigList = new ArrayList<>();
        tempSmallList = new ArrayList<>();
        tempArr = new int[gridLength];
        intToStringRangeMap.clear();

        ArrayList<String> tempSmallList = new ArrayList<>();

        intToStringRangeMap.clear();

        while (intToStringRangeMap.size() <= (gridLength * gridLength)) {
            int valueTemp = (randomWithRange(numberMin, numberMax));
            String keyTemp = "" + valueTemp;
            if (!intToStringRangeMap.containsValue(valueTemp)) {
                intToStringRangeMap.put(keyTemp, "" + valueTemp);
            }
        }

        try {

            for (int i = 0; i < (gridLength * gridLength); i++) {

                List<String> keys = new ArrayList<>(intToStringRangeMap.keySet());
                randomKey = keys.get(random.nextInt(keys.size())& Integer.MAX_VALUE);
                numberAsString = intToStringRangeMap.get(randomKey);
                intToStringRangeMap.remove(numberAsString);

                valueArr[i] = Integer.parseInt(numberAsString);
            }

            //btnArr = bigBtnArr[gridLength-3];

            for (int it = 0; it < (gridLength * gridLength); it++) {
                tempSmallList.add(String.valueOf(valueArr[it]));
                if (it > 0 && mod(it + 1, gridLength) == 0) {
                    tempArr = new int[tempSmallList.size()];
                    for (int i = 0; i < tempSmallList.size(); i++)
                        tempArr[i] = Integer.parseInt(tempSmallList.get(i));
                    tempBigList.add(tempArr);
                    tempSmallList.clear();
                }
            }
            for (int i = 0; i < tempBigList.size(); i++) bigArr[i] = tempBigList.get(i);


        } catch (Exception e) {
            e.printStackTrace();
        }

        try {
            for (int i = 0; i < bigArr.length; i++) {
                for (int e = 0; e < bigArr[0].length; e++) {
                    btnArr[i][e].setText(String.valueOf(bigArr[i][e]));
                    btnArr[i][e].setTextSize(45);

                    btnArr[i][e].setBackgroundColor(color);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        index = 0;
        arrnummer = 0;

        btnArr[arrnummer][index].setTextColor(Color.GREEN);
        //activateButtons();

        animIndex = new ButtonColorAnimatorIndex(btnArr[arrnummer][index + 1]);
        animArrnummer = new ButtonColorAnimatorArrnummer(btnArr[arrnummer][index + 1]);
        animIndex.invokeColorTextAnimationIndex(btnArr[arrnummer][index + 1]);
        animArrnummer.invokeColorTextAnimationArrnummer(btnArr[arrnummer + 1][index]);

        btnArr[arrnummer][index + 1].setBackgroundColor(getResources().getColor(R.color.Blau_Aktiv));
        btnArr[arrnummer + 1][index].setBackgroundColor(getResources().getColor(R.color.Blau_Aktiv));
        //snackBarShow();
        return btnArr;
    }

    public MyEmojiButton[][] generateFract(int color) {

        bruchMap = new HashMap<>();
        bruchMap.put("0", new Object[]{" 1/2 ", 0.5});
        bruchMap.put("1", new Object[]{" 1/3 ", 0.33333});
        bruchMap.put("2", new Object[]{" 2/5 ", 0.4});
        bruchMap.put("3", new Object[]{" 3/5 ", 0.6});
        bruchMap.put("4", new Object[]{" 7/8 ", 0.875});
        bruchMap.put("5", new Object[]{" 9/10 ", 0.9});
        bruchMap.put("6", new Object[]{" 3/4 ", 0.75});
        bruchMap.put("7", new Object[]{" 6/7 ", 0.857});
        bruchMap.put("8", new Object[]{" 4/9 ", 0.44444});
        bruchMap.put("9", new Object[]{" 1/8 ", 0.125});
        bruchMap.put("10", new Object[]{" 3/8 ", 0.375});
        bruchMap.put("11", new Object[]{" 1/5 ", 0.2});
        bruchMap.put("12", new Object[]{" 1/9 ", 0.11111});
        bruchMap.put("13", new Object[]{" 1/6 ", 0.16});
        bruchMap.put("14", new Object[]{" 2/3 ", 0.66666});
        bruchMap.put("15", new Object[]{" 1/10", 0.1});
        bruchMap.put("16", new Object[]{" 4/5 ", 0.8});
        bruchMap.put("17", new Object[]{" 5/6 ", 0.83333});
        bruchMap.put("18", new Object[]{" 1/4 ", 0.25});
        bruchMap.put("19", new Object[]{" 1/1 ", 1.0});
        bruchMap.put("20", new Object[]{" 3/7 ", 0.42857});
        bruchMap.put("21", new Object[]{" 5/7 ", 0.71428});
        bruchMap.put("22", new Object[]{" 5/8 ", 0.625});
        bruchMap.put("23", new Object[]{" 2/4 ", 0.5});
        bruchMap.put("24", new Object[]{" 3/9 ", 0.33333});
        bruchMap.put("25", new Object[]{" 5/2 ", 2.5});
        bruchMap.put("26", new Object[]{" 3/2 ", 1.5});
        bruchMap.put("27", new Object[]{" 5/3 ", 1.66666});
        bruchMap.put("28", new Object[]{" 5/4 ", 1.25});
        bruchMap.put("29", new Object[]{" 7/4 ", 1.75});
        bruchMap.put("30", new Object[]{" 4/1 ", 4.0});
        bruchMap.put("31", new Object[]{" 1/7 ", 0.14287});
        bruchMap.put("32", new Object[]{" 2/7 ", 0.28571});
        bruchMap.put("33", new Object[]{" 7/2 ", 3.5});
        bruchMap.put("34", new Object[]{"13/15", 0.76470});
        bruchMap.put("35", new Object[]{"15/17", 0.88235});
        bruchMap.put("36", new Object[]{" 1/11", 0.09090});
        bruchMap.put("37", new Object[]{" 2/11", 0.18181});
        bruchMap.put("38", new Object[]{" 3/13", 0.23076});
        bruchMap.put("39", new Object[]{" 3/11", 0.27272});
        bruchMap.put("40", new Object[]{" 3/10", 0.3});
        bruchMap.put("41", new Object[]{"17/13", 1.30769});
        bruchMap.put("42", new Object[]{" 7/10", 0.7});
        bruchMap.put("43", new Object[]{" 2/13", 0.15384});
        bruchMap.put("44", new Object[]{" 4/13", 0.30769});
        bruchMap.put("45", new Object[]{" 7/12", 0.58333});
        bruchMap.put("46", new Object[]{" 5/12", 0.41666});
        bruchMap.put("47", new Object[]{"11/13", 0.84615});
        bruchMap.put("48", new Object[]{"13/11", 1.18181});
        bruchMap.put("43", new Object[]{" 15/9", 1.66666});

        List<String> strTempSmallList = new ArrayList<>(); // ähnlich generateFields(), aber Strings nicht int !!!
        List<Object> objTempSmallList = new ArrayList<>();
        List<String[]> strTempBigList = new ArrayList<>();
        List<Object[]> objTempBigList = new ArrayList<>();
        String[] btnStrArr = new String[gridLength * gridLength];
        Object[] objArr = new Object[gridLength * gridLength];
        String[][] bigStringArr = new String[gridLength][gridLength];
        bigObjectArr = new Object[gridLength][gridLength][2];
        bruchMapCopy = bruchMap;

        for (int i = 0; i < (gridLength * gridLength); i++) {

            List<String> keys = new ArrayList<>(bruchMap.keySet());                  //Hash keys liste von euromap
            randomKey = keys.get(random.nextInt(keys.size())& Integer.MAX_VALUE);                      // Zufällig key nehmen
            String flag = (String) bruchMap.get(String.valueOf(randomKey))[0];       // Value nehmen aus euromap
            objArr[i] = bruchMap.get(String.valueOf(randomKey));  //ganzes Array
            btnStrArr[i] = flag;                                 // eindimensionales array besiedeln
            bruchMap.remove(randomKey);                           // euromap verkleinern (unique Values)
        }
        bruchMap = bruchMapCopy;
        bruchMapCopy.clear();

        for (int it = 0; it < (gridLength * gridLength); it++) {
            strTempSmallList.add(btnStrArr[it]);
            objTempSmallList.add(objArr[it]);
            //  if(it == 0||it < gridLength) bigObjectArr[0][it]= (objArr[it]);
            if (it > 0 && mod(it + 1, gridLength) == 0) {
                String[] strTempArr = new String[strTempSmallList.size()];
                Object[] objTempArr = new Object[objTempSmallList.size()];

                for (int i = 0; i < strTempSmallList.size(); i++) {
                    strTempArr[i] = strTempSmallList.get(i);
                    objTempArr[i] = objTempSmallList.get(i);
                }
                strTempBigList.add(strTempArr);
                objTempBigList.add(objTempArr);
                strTempSmallList.clear();
                objTempSmallList.clear();
            }
        }
        for (int i = 0; i < strTempBigList.size(); i++) {
            bigStringArr[i] = strTempBigList.get(i);
        }

        for (int i = 0; i < strTempBigList.size(); i++) {
            for (int j = 0; j < objTempBigList.size(); j++) {
                bigObjectArr[i][j] = (Object[]) objTempBigList.get(j)[i];
                btnArr[i][j].setText((String) bigObjectArr[i][j][0]);
                btnArr[i][j].setWidth(450);  // reicht bei 5 Stellen ,aber knapp
            }
        }

        index = 0;
        arrnummer = 0;

        btnArr[arrnummer][index].setTextColor(Color.GREEN);
        //activateButtons();
        animIndex = new ButtonColorAnimatorIndex(btnArr[arrnummer][index + 1]);
        animArrnummer = new ButtonColorAnimatorArrnummer(btnArr[arrnummer][index + 1]);
        animIndex.invokeColorTextAnimationIndex(btnArr[arrnummer][index + 1]);
        animArrnummer.invokeColorTextAnimationArrnummer(btnArr[arrnummer + 1][index]);

        btnArr[arrnummer][index + 1].setBackgroundColor(getResources().getColor(R.color.Blau_Aktiv));
        btnArr[arrnummer + 1][index].setBackgroundColor(getResources().getColor(R.color.Blau_Aktiv));
        //snackBarShow();
        return btnArr;
    }

    public MyEmojiButton[][] generateFlags(int color) {    //Flaggenfelder

        euroMap = new HashMap<>();
        euroMapCopy = new HashMap<>();
        gridMap = new HashMap<>();
        gridArr = new Object[gridLength][gridLength];

        deutschland = (String) getActivity().getResources().getText(R.string.deutschland);
        italien = (String) getActivity().getResources().getText(R.string.italien);
        oesterreich = (String) getActivity().getResources().getText(R.string.österreich);
        frankreich = (String) getActivity().getResources().getText(R.string.frankreich);
        bosnienherzegowina = (String) getActivity().getResources().getText(R.string.bosnienherzegowina);
        belgien = (String) getActivity().getResources().getText(R.string.belgien);
        bulgarien = (String) getActivity().getResources().getText(R.string.bulgarien);
        tschechien = (String) getActivity().getResources().getText(R.string.tschechien);
        daenemark = (String) getActivity().getResources().getText(R.string.dänemark);
        spanien = (String) getActivity().getResources().getText(R.string.spanien);
        finnland = (String) getActivity().getResources().getText(R.string.finnland);
        vereinteskönigreich = (String) getActivity().getResources().getText(R.string.vereinteskönigreich);
        griechenland = (String) getActivity().getResources().getText(R.string.griechenland);
        kroatien = (String) getActivity().getResources().getText(R.string.kroatien);
        ungarn = (String) getActivity().getResources().getText(R.string.ungarn);
        irland = (String) getActivity().getResources().getText(R.string.irland);
        liechtenstein = (String) getActivity().getResources().getText(R.string.liechtenstein);
        luxemburg = (String) getActivity().getResources().getText(R.string.luxemburg);
        monaco = (String) getActivity().getResources().getText(R.string.monaco);
        moldawien = (String) getActivity().getResources().getText(R.string.moldawien);
        montenegro = (String) getActivity().getResources().getText(R.string.montenegro);
        malta = (String) getActivity().getResources().getText(R.string.malta);
        polen = (String) getActivity().getResources().getText(R.string.polen);
        portugal = (String) getActivity().getResources().getText(R.string.portugal);
        serbien = (String) getActivity().getResources().getText(R.string.serbien);
        slowenien = (String) getActivity().getResources().getText(R.string.slowenien);
        slowakei = (String) getActivity().getResources().getText(R.string.slowakei);
        tuerkei = (String) getActivity().getResources().getText(R.string.türkei);
        kosovo = (String) getActivity().getResources().getText(R.string.kosovo);
        albanien = (String) getActivity().getResources().getText(R.string.albanien);
        andorra = (String) getActivity().getResources().getText(R.string.andorra);
        estland = (String) getActivity().getResources().getText(R.string.estland);
        island = (String) getActivity().getResources().getText(R.string.island);
        kasachstan = (String) getActivity().getResources().getText(R.string.kasachstan);
        lettland = (String) getActivity().getResources().getText(R.string.lettland);
        littauen = (String) getActivity().getResources().getText(R.string.littauen);
        mazedonien = (String) getActivity().getResources().getText(R.string.mazedonien);
        niederlande = (String) getActivity().getResources().getText(R.string.niederlande);
        norwegen = (String) getActivity().getResources().getText(R.string.norwegen);
        rumänien = (String) getActivity().getResources().getText(R.string.rumänien);
        russland = (String) getActivity().getResources().getText(R.string.russland);
        sanmarino = (String) getActivity().getResources().getText(R.string.sanmarino);
        schweden = (String) getActivity().getResources().getText(R.string.schweden);
        schweiz = (String) getActivity().getResources().getText(R.string.schweiz);
        ukraine = (String) getActivity().getResources().getText(R.string.ukraine);
        vatikan = (String) getActivity().getResources().getText(R.string.vatikan);
        belarus = (String) getActivity().getResources().getText(R.string.belarus);

        euroMap.put("0", new Object[]{deutschland, "Deutschland", "Berlin", 357093, 81882000, "Mitteleuropa", 100.0, true,new Object[]{schwarz,rot,gold}});
        euroMap.put("1", new Object[]{italien, "Italien", "Rom", 301336, 60246000, "Südeuropa", 100.0, true});
        euroMap.put("2", new Object[]{oesterreich, "Österreich", "Wien", 83871, 8488000, "Mitteleuropa", 100.0, true});
        euroMap.put("3", new Object[]{frankreich, "Frankreich", "Paris", 543965, 62793000, "Westeuropa", 100.0, true});
        euroMap.put("4", new Object[]{bosnienherzegowina, "Bosnien und Herzegowina", "Sarajevo", 51197, 379100.00, "Südosteuropa", 100.0, false});
        euroMap.put("5", new Object[]{belgien, "Belgien", "Brüssel", 32528, 10667000, "Westeuropa", 100.0, true});
        euroMap.put("6", new Object[]{bulgarien, "Bulgarien", "Sofia", 110994, 7365000, "Südosteuropa", 100.0, true});
        euroMap.put("7", new Object[]{tschechien, "Tschechien", "Prag", 78866, 10526000, "Mitteleuropa", 100.0, true});
        euroMap.put("8", new Object[]{albanien, "Albanien", "Tirana", 28748, 3170000, "Südosteuropa", 100.0, false});
        euroMap.put("9", new Object[]{andorra, "Andorra", "Andorra la Vella", 468, 83900, "Südwesteuropa", 100.0, false});
        euroMap.put("10", new Object[]{daenemark, "Dänemark", "Kopenhagen", 43098, 5476000, "Nordeuropa", 100.0, true});
        euroMap.put("11", new Object[]{estland, "Estland", "Tallinn", 45227, 1342000, "Nordosteuropa", 100.0, true});
        euroMap.put("12", new Object[]{finnland, "Finnland", "Helsinki", 338144, 5326000, "Nordeuropa", 100.0, true});
        euroMap.put("13", new Object[]{griechenland, "Griechenland", "Athen", 131957, 11142000, "Südosteuropa", 100.0, true});
        euroMap.put("14", new Object[]{irland, "Irland", "Dublin", 70273, 458100, "Nordwesteuropa", 100.0, true});
        euroMap.put("15", new Object[]{island, "Island", "Reykjavík", 103000, 318000, "Nordeuropa", 100.0, true});
        // euroMap.put("16", new Object[]{kasachstan, "Kasachstan", "Astana", 2724900, 18157078, "Osteuropa", 5.4, false});
        euroMap.put("17", new Object[]{kosovo, "Kosovo", "Priština", 10908, 1800000, "Südosteuropa", 100.0, false});
        euroMap.put("18", new Object[]{kroatien, "Kroatien", "Zagreb", 56542, 4480000, "Südosteuropa", 100.0, true});
        euroMap.put("19", new Object[]{lettland, "Lettland", "Riga", 64589, 2075000, "Nordosteuropa", 100.0, true});
        euroMap.put("20", new Object[]{liechtenstein, "Liechtenstein", "Vaduz", 160, 36000, "Mitteleuropa", 100.0, false});
        euroMap.put("21", new Object[]{littauen, "Litauen", "Vilnius", 65301, 298100, "Nordosteuropa", 100.0, true});
        euroMap.put("22", new Object[]{luxemburg, "Luxemburg", "Luxemburg", 2586, 537000, "Westeuropa", 100.0, true});
        euroMap.put("23", new Object[]{malta, "Malta", "Valletta", 316, 417000, "Südeuropa", 100.0, true});
        euroMap.put("24", new Object[]{mazedonien, "Mazedonien", "Skopje", 25713, 2057000, "Südosteuropa", 100.0, false});
        euroMap.put("25", new Object[]{moldawien, "Moldawien", "Kischinau", 33843, 3154000, "Südosteuropa", 100.0, false});
        euroMap.put("26", new Object[]{monaco, "Monaco", "Montecarlo", 2, 36000, "Südeuropa", 100.0, false});
        euroMap.put("27", new Object[]{montenegro, "Montenegro", "Podgorica", 13812, 625000, "Südosteuropa", 100.0, false});
        euroMap.put("28", new Object[]{niederlande, "Niederlande", "Amsterdam", 41526, 16680000, "Westeuropa", 100.0, true});
        euroMap.put("29", new Object[]{norwegen, "Norwegen", "Oslo", 385200, 5063000, "Nordeuropa", 100.0, false});
        euroMap.put("30", new Object[]{polen, "Polen", "Warschau", 312685, 3850100, "Mitteleuropa", 100.0, true});
        euroMap.put("31", new Object[]{portugal, "Portugal", "Lissabon", 92212, 10602000, "Südwesteuropa", 100.0, true});
        euroMap.put("32", new Object[]{rumänien, "Rumänien", "Bukarest", 238391, 19043000, "Südosteuropa", 100.0, true});
        //    euroMap.put("33", new Object[]{russland, "Russland", "Moskau", 3955800, 104000000, "Osteuropa", 23.16, false});
        euroMap.put("34", new Object[]{sanmarino, "San Marino", "San Marino", 61, 32000, "Südeuropa", 100.0, false});
        euroMap.put("35", new Object[]{schweden, "Schweden", "Stockholm", 450000, 9514000, "Nordeuropa", 100.0, true});
        euroMap.put("36", new Object[]{schweiz, "Schweiz", "Bern", 41285, 8014000, "Mitteleuropa", 100.0, false});
        euroMap.put("37", new Object[]{serbien, "Serbien", "Belgrad", 77474, 7120000, "Südosteuropa", 100.0, false});
        euroMap.put("38", new Object[]{slowakei, "Slowakei", "Bratislava", 49034, 5404000, "Mitteleuropa", 100.0, true});
        euroMap.put("39", new Object[]{slowenien, "Slowenien", "Ljubljana", 20273, 2058000, "Mitteleuropa", 100.0, true});
        euroMap.put("40", new Object[]{spanien, "Spanien", "Madrid", 504645, 47213000, "Südwesteuropa", 100.0, true});
        // euroMap.put("41", new Object[]{tuerkei, "Türkei", "Ankara", 783562, 80810525, "Südosteuropa", 3.0, false});
        euroMap.put("42", new Object[]{ukraine, "Ukraine", "Kiew", 603700, 45665000, "Osteuropa", 100.0, false});
        euroMap.put("43", new Object[]{ungarn, "Ungarn", "Budapest", 93030, 9967000, "Mitteleuropa", 100.0, true});
        euroMap.put("44", new Object[]{vatikan, "Vatikanstadt", "Vatikanstadt", 1, 836, "Südeuropa", 100.0, false});
        euroMap.put("45", new Object[]{vereinteskönigreich, "Vereinigtes Königreich", "London", 242910, 63200000, "Nordwesteuropa", 100.0, true});
        euroMap.put("46", new Object[]{belarus, "Weißrussland", "Minsk", 207595, 9489000, "Osteuropa", 100.0, false});

        //this.detail = detail;
        List<String> strTempSmallList = new ArrayList<>(); // ähnlich generateFields(), aber Strings nicht int !!!
        List<Object> objTempSmallList = new ArrayList<>();
        List<String[]> strTempBigList = new ArrayList<>();
        List<Object[]> objTempBigList = new ArrayList<>();
        String[] btnStrArr = new String[gridLength * gridLength];
        Object[] objArr = new Object[gridLength * gridLength];
        String[][] bigStringArr = new String[gridLength][gridLength];
        bigObjectArr = new Object[gridLength][gridLength][8];
        euroMapCopy = euroMap;

        for (int i = 0; i < (gridLength * gridLength); i++) {
            List<String> keys = new ArrayList<>(euroMap.keySet());                  //Hash keys liste von euromap
            randomKey = keys.get(random.nextInt(keys.size())& Integer.MAX_VALUE);                      // Zufällig key nehmen
            String flag = (String) euroMap.get(String.valueOf(randomKey))[0];       // Value nehmen aus euromap
            objArr[i] = euroMap.get(String.valueOf(randomKey));  //ganzes Array
            btnStrArr[i] = flag;                                 // eindimensionales array besiedeln
            euroMap.remove(randomKey);                           // euromap verkleinern (unique Values)
        }
        euroMap = euroMapCopy;
        euroMapCopy.clear();

        for (int it = 0; it < (gridLength * gridLength); it++) {
            strTempSmallList.add(btnStrArr[it]);
            objTempSmallList.add(objArr[it]);
            //  if(it == 0||it < gridLength) bigObjectArr[0][it]= (objArr[it]);
            if (it > 0 && mod(it + 1, gridLength) == 0) {
                String[] strTempArr = new String[strTempSmallList.size()];
                Object[] objTempArr = new Object[objTempSmallList.size()];

                for (int i = 0; i < strTempSmallList.size(); i++) {
                    strTempArr[i] = strTempSmallList.get(i);
                    objTempArr[i] = objTempSmallList.get(i);
                }
                strTempBigList.add(strTempArr);
                objTempBigList.add(objTempArr);
                strTempSmallList.clear();
                objTempSmallList.clear();
            }
        }
        for (int i = 0; i < strTempBigList.size(); i++) {
            bigStringArr[i] = strTempBigList.get(i);
        }
        for (int i = 0; i < strTempBigList.size(); i++) {
            for (int j = 0; j < objTempBigList.size(); j++) {
                bigObjectArr[i][j] = (Object[]) objTempBigList.get(j)[i];
                btnArr[i][j].setText((String) bigObjectArr[i][j][0]);
            }
        }
        index = 0;
        arrnummer = 0;
        btnArr[arrnummer][index].setText(getString(R.string.gameinfo));
        btnArr[arrnummer][index].setBackgroundColor(Color.GREEN);
        // activateButtons();
        animIndex = new ButtonColorAnimatorIndex(btnArr[arrnummer][index + 1]);
        animArrnummer = new ButtonColorAnimatorArrnummer(btnArr[arrnummer][index + 1]);
        animIndex.invokeColorBackgroundAnimationIndex(btnArr[arrnummer][index + 1]);
        animArrnummer.invokeColorBackgroundAnimationArrnummer(btnArr[arrnummer + 1][index]);
        //snackBarShow();
        return btnArr;
    }

    public MyEmojiButton[][] generateAmericaFlags(int color) {    //Flaggenfelder

        americaMap = new HashMap<>();
        americaMapCopy = new HashMap<>();
        gridMap = new HashMap<>();
        gridArr = new Object[gridLength][gridLength];

        antiguaundbarbuda = (String) getActivity().getResources().getText(R.string.antiguaundbarbuda);
        argentinien = (String) getActivity().getResources().getText(R.string.argentinien);
        bahamas = (String) getActivity().getResources().getText(R.string.bahamas);
        barbados = (String) getActivity().getResources().getText(R.string.barbados);
        belize = (String) getActivity().getResources().getText(R.string.belize);
        bolivien = (String) getActivity().getResources().getText(R.string.bolivien);
        brasilien = (String) getActivity().getResources().getText(R.string.brasilien);
        chile = (String) getActivity().getResources().getText(R.string.chile);
        costarica = (String) getActivity().getResources().getText(R.string.costarica);
        dominica = (String) getActivity().getResources().getText(R.string.dominica);
        dominikanischerepublik = (String) getActivity().getResources().getText(R.string.dominikanischerepublik);
        elsalvador = (String) getActivity().getResources().getText(R.string.elsalvador);
        equador = (String) getActivity().getResources().getText(R.string.equador);
        grenada = (String) getActivity().getResources().getText(R.string.grenada);
        guatemala = (String) getActivity().getResources().getText(R.string.guatemala);
        guyana = (String) getActivity().getResources().getText(R.string.guyana);
        haiti = (String) getActivity().getResources().getText(R.string.haiti);
        honduras = (String) getActivity().getResources().getText(R.string.honduras);
        jamaika = (String) getActivity().getResources().getText(R.string.jamaika);
        kanada = (String) getActivity().getResources().getText(R.string.kanada);
        kolumbien = (String) getActivity().getResources().getText(R.string.kolumbien);
        kuba = (String) getActivity().getResources().getText(R.string.kuba);
        mexico = (String) getActivity().getResources().getText(R.string.mexico);
        nicaragua = (String) getActivity().getResources().getText(R.string.nicaragua);
        panama = (String) getActivity().getResources().getText(R.string.panama);
        paraguay = (String) getActivity().getResources().getText(R.string.paraguay);
        peru = (String) getActivity().getResources().getText(R.string.peru);
        stlittsundnevis = (String) getActivity().getResources().getText(R.string.stlittsundnevis);
        stluca = (String) getActivity().getResources().getText(R.string.stluca);
        stvincent = (String) getActivity().getResources().getText(R.string.stvincent);
        suriname = (String) getActivity().getResources().getText(R.string.suriname);
        trinidatundtobago = (String) getActivity().getResources().getText(R.string.trinidatundtobago);
        uruguay = (String) getActivity().getResources().getText(R.string.uruguay);
        venezuela = (String) getActivity().getResources().getText(R.string.venezuela);
        vereinigtestaaten = (String) getActivity().getResources().getText(R.string.vereinigtestaaten);

        americaMap.put("0", new Object[]{antiguaundbarbuda, "Antigua und Barbuda", "Saint John's", 443, 102012});
        americaMap.put("1", new Object[]{argentinien, "Argeninien", "Buenos Aires", 2780400, 44271041});
        americaMap.put("2", new Object[]{bahamas, "Bahamas", "Nassau", 13939, 395361});
        americaMap.put("3", new Object[]{barbados, "Barbados", "Bridgetown", 430, 285719});
        americaMap.put("4", new Object[]{belize, "Belize", "Belmopan", 22966, 374681});
        americaMap.put("5", new Object[]{bolivien, "Bolivien", "Sucre", 1098581, 11051600});
        americaMap.put("6", new Object[]{brasilien, "Brasilien", "Brasilia", 8514215, 209288278});
        americaMap.put("7", new Object[]{chile, "Chile", "Santiago de Chile", 755696, 18054726});
        americaMap.put("8", new Object[]{costarica, "Costa Rica", "San José", 51100, 4905769});
        americaMap.put("9", new Object[]{dominica, "Dominica","Roseau",746,73925});
        americaMap.put("10", new Object[]{dominikanischerepublik, "Dominikanische Republik", "Santo Domingo", 48730, 10766998});
        americaMap.put("11", new Object[]{elsalvador, "El Salvador", "San Salvador", 21041, 6377853});
        americaMap.put("12", new Object[]{equador, "Equador", "Quito", 283561, 16624858});
        americaMap.put("13", new Object[]{grenada, "Grenada", "St. George's", 344, 107825});
        americaMap.put("14", new Object[]{guatemala, "Guatemala", "Guatemala-Stadt", 109021, 16913503});
        americaMap.put("15", new Object[]{guyana, "Guyana", "Georgetown", 214970, 777859});
        // americaMap.put("16", new Object[]{kasachstan, "Kasachstan", "Astana", 2724900, 18157078, "Osteuropa", 5.4, false});
        americaMap.put("17", new Object[]{haiti, "Haiti", "Port-au-Prince", 27750, 10981229});
        americaMap.put("18", new Object[]{honduras, "Honduras", "Tegucigalpa", 112090, 9265067});
        americaMap.put("19", new Object[]{jamaika, "Jamaika", "Kingston", 10991, 2890299});
        americaMap.put("20", new Object[]{kanada, "Kanada", "Ottawa", 9984670, 36624199});
        americaMap.put("21", new Object[]{kolumbien, "Kolumbien", "Bogotá", 1138748, 49065615});
        americaMap.put("22", new Object[]{kuba, "Kuba", "Havanna", 109884, 11484636});
        americaMap.put("23", new Object[]{mexico, "Mexiko", "Mexiko-Stadt", 1972550, 129163276});
        americaMap.put("24", new Object[]{nicaragua, "Nicaragua", "Managua", 129494, 6217581});
        americaMap.put("25", new Object[]{panama, "Panama", "Panama-Stadt", 75517, 4098587});
        americaMap.put("26", new Object[]{paraguay, "Paraguay", "Asunción", 406752, 6811297});
        americaMap.put("27", new Object[]{peru, "Peru", "Lima", 1285220, 32165485});
        americaMap.put("28", new Object[]{stlittsundnevis, "St.Kitts und Nevis", "Basseterre", 269, 55345});
        americaMap.put("29", new Object[]{stluca, "Saint Lucia", "Castries", 616, 178844});
        americaMap.put("30", new Object[]{stvincent, "St.Vincent und die Grenadines", "Kingstown", 389, 109897});
        americaMap.put("31", new Object[]{suriname, "Suriname", "Paramaribo", 163820, 563402});
        americaMap.put("32", new Object[]{trinidatundtobago, "Trinidat und Tobago", "Port of Spain", 5128, 1369125});
        //    americaMap.put("33", new Object[]{russland, "Russland", "Moskau", 3955800, 104000000, "Osteuropa", 23.16, false});
        americaMap.put("34", new Object[]{uruguay, "Uruguay", "Montevideo", 176215, 3456750});
        americaMap.put("35", new Object[]{venezuela, "Venezuela", "Caracas", 916445, 31977065});
        americaMap.put("36", new Object[]{vereinigtestaaten, "Vereinigte Staaten", "Washington, D.C.", 9826675, 324459463});
        // -hier ist sonst ende
        americaMap.put("37", new Object[]{bahamas, "Bahamas1", "Nassau1", 139391, 3953611});
        americaMap.put("38", new Object[]{bahamas, "Bahamas2", "Nassau2", 139392, 3953612});
        americaMap.put("39", new Object[]{bahamas, "Bahamas3", "Nassau3", 139393, 3953613});
        americaMap.put("40", new Object[]{bahamas, "Bahamas4", "Nassau4", 139394, 3953614});
        americaMap.put("41", new Object[]{bahamas, "Bahamas5", "Nassau5", 139395, 3953615});
        americaMap.put("42", new Object[]{bahamas, "Bahamas6", "Nassau6", 139396, 3953616});
        americaMap.put("43", new Object[]{bahamas, "Bahamas7", "Nassau7", 139397, 3953617});
        americaMap.put("44", new Object[]{bahamas, "Bahamas8", "Nassau8", 139398, 3953618});
        americaMap.put("45", new Object[]{bahamas, "Bahamas9", "Nassau9", 139399, 3953619});
        americaMap.put("46", new Object[]{bahamas, "Bahamas10", "Nassau10", 1393910, 39536110});
        americaMap.put("47", new Object[]{bahamas, "Bahamas11", "Nassau11", 1393911, 39536111});
        americaMap.put("48", new Object[]{bahamas, "Bahamas12", "Nassau12", 1393912, 39536112});
        americaMap.put("49", new Object[]{bahamas, "Bahamas13", "Nassau13", 1393913, 39536113});

        //this.detail = detail;
        List<String> strTempSmallList = new ArrayList<>(); // ähnlich generateFields(), aber Strings nicht int !!!
        List<Object> objTempSmallList = new ArrayList<>();
        List<String[]> strTempBigList = new ArrayList<>();
        List<Object[]> objTempBigList = new ArrayList<>();
        String[] btnStrArr = new String[gridLength * gridLength];
        Object[] objArr = new Object[gridLength * gridLength];
        String[][] bigStringArr = new String[gridLength][gridLength];
        bigObjectArr = new Object[gridLength][gridLength][8];

        americaMapCopy = americaMap;

        for (int i = 0; i < (gridLength * gridLength); i++) {

            List<String> keys = new ArrayList<>(americaMap.keySet());                  //Hash keys liste von euromap
            randomKey = keys.get(random.nextInt(keys.size())& Integer.MAX_VALUE);                      // Zufällig key nehmen
            String flag = (String) americaMap.get(String.valueOf(randomKey))[0];       // Value nehmen aus euromap
            objArr[i] = americaMap.get(String.valueOf(randomKey));  //ganzes Array
            btnStrArr[i] = flag;                                 // eindimensionales array besiedeln
            americaMap.remove(randomKey);                           // euromap verkleinern (unique Values)
        }
        americaMap = americaMapCopy;
        americaMapCopy.clear();

        for (int it = 0; it < (gridLength * gridLength); it++) {
            strTempSmallList.add(btnStrArr[it]);
            objTempSmallList.add(objArr[it]);
            //  if(it == 0||it < gridLength) bigObjectArr[0][it]= (objArr[it]);
            if (it > 0 && mod(it + 1, gridLength) == 0) {
                String[] strTempArr = new String[strTempSmallList.size()];
                Object[] objTempArr = new Object[objTempSmallList.size()];

                for (int i = 0; i < strTempSmallList.size(); i++) {
                    strTempArr[i] = strTempSmallList.get(i);
                    objTempArr[i] = objTempSmallList.get(i);
                }
                strTempBigList.add(strTempArr);
                objTempBigList.add(objTempArr);
                strTempSmallList.clear();
                objTempSmallList.clear();
            }
        }
        for (int i = 0; i < strTempBigList.size(); i++) {
            bigStringArr[i] = strTempBigList.get(i);
        }

        for (int i = 0; i < strTempBigList.size(); i++) {
            for (int j = 0; j < objTempBigList.size(); j++) {
                bigObjectArr[i][j] = (Object[]) objTempBigList.get(j)[i];
                btnArr[i][j].setText((String) bigObjectArr[i][j][0]);
            }
        }

        index = 0;
        arrnummer = 0;
        btnArr[arrnummer][index].setText(getString(R.string.gameinfo));
        btnArr[arrnummer][index].setBackgroundColor(Color.GREEN);
        // activateButtons();
        animIndex = new ButtonColorAnimatorIndex(btnArr[arrnummer][index + 1]);
        animArrnummer = new ButtonColorAnimatorArrnummer(btnArr[arrnummer][index + 1]);
        animIndex.invokeColorBackgroundAnimationIndex(btnArr[arrnummer][index + 1]);
        animArrnummer.invokeColorBackgroundAnimationArrnummer(btnArr[arrnummer + 1][index]);
        //snackBarShow();
        return btnArr;
    }

    public void func_a1(View v) {
        knopfNummer = 100;

        switch (gameMode) {
            case 1:
                snackbar.make(layout, getString(R.string.zahlenspiel),
                         5000).show();
                break;
            case 2:
            case 7:
                snackbar.make(layout, getString(R.string.landesflaeche),
                        5000).show();
                break;
            case 3:
                snackbar.make(layout, getString(R.string.bruchspiel),
                        5000).show();
                break;
            case 4:
            case 8:
                snackbar.make(layout, getString(R.string.einwohnerzahl),
                        5000).show();
                break;
            case 5:
            case 6:
            case 9:
            case 10:
                setDetail();
                checkStr = getSnackbarInfo();
                playNumbers();
                break;
        }
        //playNumbers();
        //Toast.makeText(getActivity(), "Arrnummer: " + arrnummer + " Index: " + index + " bigArrLength: " + bigArr.length, Toast.LENGTH_SHORT).show();
    }


    public void func_a2(View v) {
        knopfNummer = 101;
        //messageBox = new MyMsgBox(getActivity(), 800, Gravity.BOTTOM);
        playNumbers();
        //Toast.makeText(getActivity(), "Arrnummer: " + arrnummer + " Index: " + index + " bigArrLength: " + bigArr.length, Toast.LENGTH_SHORT).show();
    }

    public void func_a3(View v) {
        knopfNummer = 102;
        playNumbers();
        //Toast.makeText(getActivity(), "Arrnummer: " + arrnummer + " Index: " + index + " bigArrLength: " + bigArr.length, Toast.LENGTH_SHORT).show();
    }

    public void func_a4(View v) {
        knopfNummer = 103;
        playNumbers();
    }

    public void func_a5(View v) {
        knopfNummer = 104;
        playNumbers();
    }

    public void func_a6(View v) {
        knopfNummer = 105;
        playNumbers();
    }

    public void func_a7(View v) {
        knopfNummer = 106;
        playNumbers();
    }

    public void func_b1(View v) {
        knopfNummer = 110;
        //messageBox = new MyMsgBox(getActivity(), 800, Gravity.BOTTOM);
        playNumbers();
        //Toast.makeText(getActivity(), "Arrnummer: " + arrnummer + " Index: " + index + " bigArrLength: " + bigArr.length, Toast.LENGTH_SHORT).show();
    }

    public void func_b2(View v) {
        knopfNummer = 111;
        playNumbers();
        //Toast.makeText(getActivity(), "Arrnummer: " + arrnummer + " Index: " + index + " bigArrLength: " + bigArr.length, Toast.LENGTH_SHORT).show();
    }

    public void func_b3(View v) {
        knopfNummer = 112;
        playNumbers();
    }

    public void func_b4(View v) {
        knopfNummer = 113;
        playNumbers();
    }

    public void func_b5(View v) {
        knopfNummer = 114;
        playNumbers();
    }

    public void func_b6(View v) {
        knopfNummer = 115;
        playNumbers();
    }

    public void func_b7(View v) {
        knopfNummer = 116;
        playNumbers();
    }

    public void func_c1(View v) {
        knopfNummer = 120;
        playNumbers();
    }

    public void func_c2(View v) {
        knopfNummer = 121;
        playNumbers();
    }

    public void func_c3(View v) {
        knopfNummer = 122;
        playNumbers();
    }

    public void func_c4(View v) {
        knopfNummer = 123;
        playNumbers();
    }

    public void func_c5(View v) {
        knopfNummer = 124;
        playNumbers();
    }

    public void func_c6(View v) {
        knopfNummer = 125;
        playNumbers();
    }

    public void func_c7(View v) {
        knopfNummer = 126;
        playNumbers();
    }

    public void func_d1(View v) {
        knopfNummer = 130;
        playNumbers();
    }

    public void func_d2(View v) {
        knopfNummer = 131;
        playNumbers();
    }

    public void func_d3(View v) {
        knopfNummer = 132;
        playNumbers();
    }

    public void func_d4(View v) {
        knopfNummer = 133;
        playNumbers();
    }

    public void func_d5(View v) {
        knopfNummer = 134;
        playNumbers();
    }

    public void func_d6(View v) {
        knopfNummer = 135;
        playNumbers();
    }

    public void func_d7(View v) {
        knopfNummer = 136;
        playNumbers();
    }

    public void func_e1(View v) {
        knopfNummer = 140;
        playNumbers();
    }

    public void func_e2(View v) {
        knopfNummer = 141;
        playNumbers();
    }

    public void func_e3(View v) {
        knopfNummer = 142;
        playNumbers();
    }

    public void func_e4(View v) {
        knopfNummer = 143;
        playNumbers();
    }

    public void func_e5(View v) {
        knopfNummer = 144;
        playNumbers();
    }

    public void func_e6(View v) {
        knopfNummer = 145;
        playNumbers();
    }

    public void func_e7(View v) {
        knopfNummer = 146;
        playNumbers();
    }

    public void func_f1(View v) {
        knopfNummer = 150;
        playNumbers();
    }

    public void func_f2(View v) {
        knopfNummer = 151;
        playNumbers();
    }

    public void func_f3(View v) {
        knopfNummer = 152;
        playNumbers();
    }

    public void func_f4(View v) {
        knopfNummer = 153;
        playNumbers();
    }

    public void func_f5(View v) {
        knopfNummer = 154;
        playNumbers();
    }

    public void func_f6(View v) {
        knopfNummer = 155;
        playNumbers();
    }

    public void func_f7(View v) {
        knopfNummer = 156;
        playNumbers();
    }

    public void func_g1(View v) {
        knopfNummer = 160;
        playNumbers();
    }

    public void func_g2(View v) {
        knopfNummer = 161;
        playNumbers();
    }

    public void func_g3(View v) {
        knopfNummer = 162;
        playNumbers();
    }

    public void func_g4(View v) {
        knopfNummer = 163;
        playNumbers();
    }

    public void func_g5(View v) {
        knopfNummer = 164;
        playNumbers();
    }

    public void func_g6(View v) {
        knopfNummer = 165;
        playNumbers();
    }

    public void func_g7(View v) {
        knopfNummer = 166;
        playNumbers();
    }

    public void func_long_a1(View v) {
        knopfNummer_lc = 100;
        switch (gameMode) {
            case 1:
                snackbar.make(layout, "Tippe auf die größere Ziffer/Zahl",
                        2000).show();
                break;
            case 2:
                snackbar.make(layout, getResources().getString(R.string.landesflaeche),
                        2000).show();
                break;
            case 3:
                snackbar.make(layout, "Tippe auf den größeren Bruck",
                        2000).show();
                break;
            case 4:
                snackbar.make(layout, getResources().getString(R.string.einwohnerzahl),
                        2000).show();
                break;
            case 5:
                snackbar.make(layout, getResources().getString(R.string.landesname),
                        2000).show();
                break;
            case 6:
                snackbar.make(layout, getResources().getString(R.string.landeshauptstadt),
                        2000).show();
                break;
        }
    }

    public void func_long_a2(View v) {
        knopfNummer_lc = 101;
        playLongClicked();
    }

    public void func_long_a3(View v) {
        knopfNummer_lc = 102;
        playLongClicked();
    }

    public void func_long_a4(View v) {
        knopfNummer_lc = 103;
        playLongClicked();
    }

    public void func_long_a5(View v) {
        knopfNummer_lc = 104;
        playLongClicked();
    }

    public void func_long_a6(View v) {
        knopfNummer_lc = 105;
        playLongClicked();
    }

    public void func_long_a7(View v) {
        knopfNummer_lc = 106;
        playLongClicked();
    }

    public void func_long_b1(View v) {
        knopfNummer_lc = 110;
        playLongClicked();
    }

    public void func_long_b2(View v) {
        knopfNummer_lc = 111;
        playLongClicked();
    }

    public void func_long_b3(View v) {
        knopfNummer_lc = 112;
        playLongClicked();
    }

    public void func_long_b4(View v) {
        knopfNummer_lc = 113;
        playLongClicked();
    }

    public void func_long_b5(View v) {
        knopfNummer_lc = 114;
        playLongClicked();
    }

    public void func_long_b6(View v) {
        knopfNummer_lc = 115;
        playLongClicked();
    }

    public void func_long_b7(View v) {
        knopfNummer_lc = 116;
        playLongClicked();
    }

    public void func_long_c1(View v) {
        knopfNummer_lc = 120;
        playLongClicked();
    }

    public void func_long_c2(View v) {
        knopfNummer_lc = 121;
        playLongClicked();
    }

    public void func_long_c3(View v) {
        knopfNummer_lc = 122;
        playLongClicked();
    }

    public void func_long_c4(View v) {
        knopfNummer_lc = 123;
        playLongClicked();
    }

    public void func_long_c5(View v) {
        knopfNummer_lc = 124;
        playLongClicked();
    }

    public void func_long_c6(View v) {
        knopfNummer_lc = 125;
        playLongClicked();
    }

    public void func_long_c7(View v) {
        knopfNummer_lc = 126;
        playLongClicked();
    }

    public void func_long_d1(View v) {
        knopfNummer_lc = 130;
        playLongClicked();
    }

    public void func_long_d2(View v) {
        knopfNummer_lc = 131;
        playLongClicked();
    }

    public void func_long_d3(View v) {
        knopfNummer_lc = 132;
        playLongClicked();
    }

    public void func_long_d4(View v) {
        knopfNummer_lc = 133;
        playLongClicked();
    }

    public void func_long_d5(View v) {
        knopfNummer_lc = 134;
        playLongClicked();
    }

    public void func_long_d6(View v) {
        knopfNummer_lc = 135;
        playLongClicked();
    }

    public void func_long_d7(View v) {
        knopfNummer_lc = 136;
        playLongClicked();
    }

    public void func_long_e1(View v) {
        knopfNummer_lc = 140;
        playLongClicked();
    }

    public void func_long_e2(View v) {
        knopfNummer_lc = 141;
        playLongClicked();
    }

    public void func_long_e3(View v) {
        knopfNummer_lc = 142;
        playLongClicked();
    }

    public void func_long_e4(View v) {
        knopfNummer_lc = 143;
        playLongClicked();
    }

    public void func_long_e5(View v) {
        knopfNummer_lc = 144;
        playLongClicked();
    }

    public void func_long_e6(View v) {
        knopfNummer_lc = 145;
        playLongClicked();
    }

    public void func_long_e7(View v) {
        knopfNummer_lc = 146;
        playLongClicked();
    }

    public void func_long_f1(View v) {
        knopfNummer_lc = 150;
        playLongClicked();
    }

    public void func_long_f2(View v) {
        knopfNummer_lc = 151;
        playLongClicked();
    }

    public void func_long_f3(View v) {
        knopfNummer_lc = 152;
        playLongClicked();
    }

    public void func_long_f4(View v) {
        knopfNummer_lc = 153;
        playLongClicked();
    }

    public void func_long_f5(View v) {
        knopfNummer_lc = 154;
        playLongClicked();
    }

    public void func_long_f6(View v) {
        knopfNummer_lc = 155;
        playLongClicked();
    }

    public void func_long_f7(View v) {
        knopfNummer_lc = 156;
        playLongClicked();
    }

    public void func_long_g1(View v) {
        knopfNummer_lc = 160;
        playLongClicked();
    }

    public void func_long_g2(View v) {
        knopfNummer_lc = 161;
        playLongClicked();
    }

    public void func_long_g3(View v) {
        knopfNummer_lc = 162;
        playLongClicked();
    }

    public void func_long_g4(View v) {
        knopfNummer_lc = 163;
        playLongClicked();
    }

    public void func_long_g5(View v) {
        knopfNummer_lc = 164;
        playLongClicked();
    }

    public void func_long_g6(View v) {
        knopfNummer_lc = 165;
        playLongClicked();
    }

    public void func_long_g7(View v) {
        knopfNummer_lc = 166;
        playLongClicked();
    }

    public void func_range(View v) {
        showRangeDialog();

    }


    private int mod(int x, int y) {
        int result = x % y;
        if (result < 0)
            result += y;
        return result;
    }

    void indexStep() {   //todo reactivate indexScroll method
        animIndex.stop();
        animArrnummer.stop();
        switch (gameMode) {
            case 1:
            case 3:
                if (btnArr[arrnummer + 1][index].getCurrentTextColor() != (Color.RED)) {
                    btnArr[arrnummer + 1][index].setTextColor(Color.WHITE);
                }
                btnArr[arrnummer+1][index].setBackgroundColor(Color.TRANSPARENT);
                btnArr[arrnummer][index].setBackgroundColor(Color.TRANSPARENT);             //todo mache die alten Felder transparent, sieht eleganter aus...
                btnArr[arrnummer][index + 1].setTextColor(Color.GREEN);

                btnArr[arrnummer][index + 1].setBackgroundColor(getResources().getColor(R.color.Blau_Hintergrund));
                btnArr[arrnummer + 1][index].setBackgroundColor(getResources().getColor(R.color.Blau_Hintergrund));
                indexScroll();
                index++;
                activateButtons();
                break;
            case 2:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
                if (btnArr[arrnummer + 1][index].getBackground() != redDrawable) {
                    btnArr[arrnummer + 1][index].setBackgroundColor(Color.TRANSPARENT);
                }
                btnArr[arrnummer][index + 1].setBackgroundColor(Color.GREEN);
                indexScroll();
                index++;
                activateButtons();
                break;
        }
    }

    void arrnummerStep() {
        animIndex.stop();
        animArrnummer.stop();
        switch (gameMode) {
            case 1:
            case 3:
                if (btnArr[arrnummer][index + 1].getCurrentTextColor() != (Color.RED)) {
                    btnArr[arrnummer][index + 1].setTextColor(Color.WHITE);
                }
                btnArr[arrnummer + 1][index].setTextColor(Color.GREEN);

                btnArr[arrnummer][index + 1].setBackgroundColor(getResources().getColor(R.color.Blau_Hintergrund));
                btnArr[arrnummer + 1][index].setBackgroundColor(getResources().getColor(R.color.Blau_Hintergrund));
                arrnummer++;
                activateButtons();
                break;
            case 2:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
                if (btnArr[arrnummer][index + 1].getBackground() != redDrawable) {
                    btnArr[arrnummer][index + 1].setBackgroundColor(Color.TRANSPARENT);
                }
                btnArr[arrnummer + 1][index].setBackgroundColor(Color.GREEN);
                arrnummer++;
                activateButtons();
                break;
        }
    }

    void indexEndsIt() {
        animIndex.stop();
        animArrnummer.stop();
        switch (gameMode) {
            case 1:
            case 3:
                btnArr[arrnummer][index].setTextColor(Color.GREEN);

               btnArr[arrnummer][index].setBackgroundColor(Color.TRANSPARENT);
                for (int i = arrnummer; i < gridLength - 1; i++) {
                    btnArr[i][index].setTextColor(Color.GREEN);
                }
                gridLength++;
                index = 0;
                arrnummer = 0;
                knopfNummerAlt = 100;
                gameMode = randomWithRange(1,13);
                mainfragment = MainFragment.newInstance();
                break;
            case 2:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
                btnArr[arrnummer][index].setBackgroundColor(Color.GREEN);       // todo Abstürze verhindern wenn americaMap gridlength >= 6
                for (int i = arrnummer; i < gridLength - 1; i++) {                  //todo brueche bei gridlength 3 passen nicht immer in buttons
                    btnArr[i][index].setBackgroundColor(Color.GREEN);

                }
                gridLength++;
                index = 0;
                arrnummer = 0;
                knopfNummerAlt = 100;
                gameMode = randomWithRange(1,13);
                mainfragment = MainFragment.newInstance();
                break;
        }
        if (gridLength == 7) {
            MainActivity.gridLength = 4;
            gameMode = randomWithRange(1,13);
        }

        FragmentTransaction transaction = getFragmentManager().beginTransaction();
        transaction.replace(R.id.container, mainfragment);
        transaction.addToBackStack(null);
        transaction.commit();
    }

    void arrnummerEndsIt() {
        animIndex.stop();
        animArrnummer.stop();
        switch (gameMode) {
            case 1:
            case 3:
                btnArr[arrnummer][index].setTextColor(Color.GREEN);

                btnArr[arrnummer][index].setBackgroundColor(Color.TRANSPARENT);
                for (int i = arrnummer; i < gridLength-1; i++) { //TODO: testing
                    btnArr[arrnummer][i].setTextColor(Color.GREEN);
                    indexScroll();
                }

                gridLength++;
                index = 0;
                arrnummer = 0;
                knopfNummerAlt = 100;
                gameMode = randomWithRange(1,13);
                break;
            case 2:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
                btnArr[arrnummer][index].setBackgroundColor(Color.GREEN);
                for (int i = arrnummer; i < gridLength - 1; i++) {
                    btnArr[arrnummer][i].setBackgroundColor(Color.GREEN);
                    indexScroll();
                }
                gridLength++;
                index = 0;
                arrnummer = 0;
                knopfNummerAlt = 100;
                gameMode = randomWithRange(1,13);
                break;
        }
        if (gridLength == 7) {
            MainActivity.gridLength = 4;
            gameMode = randomWithRange(1,10);
        }

        mainfragment = MainFragment.newInstance();
        FragmentTransaction transaction = getFragmentManager().beginTransaction();
        transaction.replace(R.id.container, mainfragment);
        transaction.addToBackStack(null);
        transaction.commit();


    }

    void playNumbers() {// an detail denken !!
        //testIndexScroll(10000);


        switch (gameMode) {    //Zahlenspiele 0-10 ... 0-1000000
            case 1: {

                try {
                    if (index == gridLength - 1) {
                        indexEndsIt();

                    } else if (arrnummer == gridLength - 1) {
                        arrnummerEndsIt();
                    } else if (bigArr[arrnummer][index + 1] > bigArr[arrnummer + 1][index]) {
                        if (knopfNummer - knopfNummerAlt == 1) {
                            indexStep();
                            getReaction((byte)1);
                        } else {
                            animArrnummer.stop();
                            btnArr[arrnummer + 1][index].setTextColor(Color.RED);
                            getReaction((byte)0);
                            reverseKnopfnummer();
                        }
                    } else if (bigArr[arrnummer + 1][index] > bigArr[arrnummer][index + 1]) {
                        if (knopfNummer - knopfNummerAlt == 10) {
                            arrnummerStep();
                            getReaction((byte)1);
                        } else {
                            animIndex.stop();
                            btnArr[arrnummer][index + 1].setTextColor(Color.RED);
                            getReaction((byte)0);
                            reverseKnopfnummer();
                            // Toast.makeText(getActivity(), "Error", Toast.LENGTH_SHORT).show();
                        }
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
                knopfNummerAlt = knopfNummer;   // Vorsicht !!!
                break;
            }
            case 3: {     //Bruechespiel

                try {
                    //  Toast.makeText(getActivity(), bigObjectArr[arrnummer][index+1][1]+" "+bigObjectArr[arrnummer][index+1][detail]+" | "+bigObjectArr[arrnummer+1][index][1]+" "+bigObjectArr[arrnummer+1][index][detail], Toast.LENGTH_LONG).show();
                    if (index == gridLength - 1) {
                        indexEndsIt();

                    } else if (arrnummer == gridLength - 1) {
                        arrnummerEndsIt();
                    } else if ((double) (bigObjectArr[arrnummer][index + 1][1]) > (double) (bigObjectArr[arrnummer + 1][index][1])) {
                        if (knopfNummer - knopfNummerAlt == 1) {
                            indexStep();
                            getReaction((byte)1);
                            knopfNummerAlt_lc++;

                        } else {
                            animArrnummer.stop();
                            btnArr[arrnummer + 1][index].setTextColor(Color.RED);
                            getReaction((byte)0);
                            reverseKnopfnummer();
                        }
                    } else if ((double) bigObjectArr[arrnummer + 1][index][1] > (double) bigObjectArr[arrnummer][index + 1][1]) {
                        if (knopfNummer - knopfNummerAlt == 10) {
                            arrnummerStep();
                            getReaction((byte)1);
                            knopfNummerAlt_lc += 10;
                        } else {
                            animIndex.stop();
                            btnArr[arrnummer][index + 1].setTextColor(Color.RED);
                            getReaction((byte)0);
                            reverseKnopfnummer();
                            // Toast.makeText(getActivity(), "Error", Toast.LENGTH_SHORT).show();
                        }
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
                knopfNummerAlt = knopfNummer;

                break;
            }
            case 2:
            case 4:
            case 7:
            case 8:    setDetail();
                //Snackbar.make(layout, getResources().getString(R.string.einwohnerzahl), Snackbar.LENGTH_LONG).show();
                try {
                    //  Toast.makeText(getActivity(), bigObjectArr[arrnummer][index+1][1]+" "+bigObjectArr[arrnummer][index+1][detail]+" | "+bigObjectArr[arrnummer+1][index][1]+" "+bigObjectArr[arrnummer+1][index][detail], Toast.LENGTH_LONG).show();
                    if (index == gridLength - 1) {
                        indexEndsIt();

                    } else if (arrnummer == gridLength - 1) {
                        arrnummerEndsIt();
                    } else if ((int) (bigObjectArr[arrnummer][index + 1][detail]) > (int) (bigObjectArr[arrnummer + 1][index][detail])) {
                        if (knopfNummer - knopfNummerAlt == 1) {
                            indexStep();
                            getReaction((byte)1);
                            knopfNummerAlt_lc++;

                        } else {
                            animArrnummer.stop();
                            btnArr[arrnummer + 1][index].setBackground(redDrawable);
                            getReaction((byte)0);
                            reverseKnopfnummer();
                        }
                    } else if ((int) bigObjectArr[arrnummer + 1][index][detail] > (int) bigObjectArr[arrnummer][index + 1][detail]) {
                        if (knopfNummer - knopfNummerAlt == 10) {
                            arrnummerStep();
                            getReaction((byte)1);
                            knopfNummerAlt_lc += 10;
                        } else {
                            animIndex.stop();
                            btnArr[arrnummer][index + 1].setBackground(redDrawable);
                            getReaction((byte)0);
                            reverseKnopfnummer();
                            // Toast.makeText(getActivity(), "Error", Toast.LENGTH_SHORT).show();
                        }
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
                knopfNummerAlt = knopfNummer;

                break;
            case 5:
            case 6:
            case 9:
            case 10:
                try {
                    //  Toast.makeText(getActivity(), bigObjectArr[arrnummer][index+1][1]+" "+bigObjectArr[arrnummer][index+1][detail]+" | "+bigObjectArr[arrnummer+1][index][1]+" "+bigObjectArr[arrnummer+1][index][detail], Toast.LENGTH_LONG).show();
                    if (knopfNummer != 100) {
                      if (index == gridLength - 1) {
                            indexEndsIt();

                        } else if (arrnummer == gridLength - 1) {
                            arrnummerEndsIt();
                        } else if (checkStr == bigObjectArr[arrnummer][index + 1][detail]) {
                            if (knopfNummer - knopfNummerAlt == 1) {
                                indexStep();
                                getReaction((byte)1);
                                knopfNummerAlt = knopfNummer;  ///gestestet hier
                                knopfNummerAlt_lc++;
                                setDetail();
                                checkStr = getSnackbarInfo();
                            } else {
                                animArrnummer.stop();
                                btnArr[arrnummer + 1][index].setBackground(redDrawable);
                                getReaction((byte)0);
                                reverseKnopfnummer();
                            }
                        } else if (checkStr == bigObjectArr[arrnummer + 1][index][detail]) {
                            if (knopfNummer - knopfNummerAlt == 10) {
                                arrnummerStep();
                                getReaction((byte)1);
                                knopfNummerAlt = knopfNummer;    ///gestestet hier
                                knopfNummerAlt_lc += 10;
                                setDetail();
                                checkStr = getSnackbarInfo();
                            } else {
                                animIndex.stop();
                                btnArr[arrnummer][index + 1].setBackground(redDrawable);
                                getReaction((byte)0);
                                reverseKnopfnummer();
                                // Toast.makeText(getActivity(), "Error", Toast.LENGTH_SHORT).show();
                            }
                        }
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
                // hier entfernt


                break;
        }
    }

    void activateButtons() {   // die methode enthält schon switch case statements !!!!

        // --letzte änderung

        if (index < gridLength - 1) {

            animIndex.invokeColor(btnArr[arrnummer][index + 1]);

            invokeBackground(btnArr[arrnummer][index + 1]);

        } else {
            indexEndsIt();
        }
        if (arrnummer < gridLength - 1) {

            animArrnummer.invokeColor(btnArr[arrnummer + 1][index]);

            invokeBackground(btnArr[arrnummer + 1][index]);
        } else {
            arrnummerEndsIt();
        }

    }

    public void resetColors() {
        switch (gameMode) {
            case 1:
            case 3:
                for (int i = 0; i < gridLength; i++) {
                    for (int e = 0; e < gridLength; e++) {
                        btnArr[i][e].setTextColor(Color.WHITE);
                    }
                }
                break;
            case 2:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:

             /*   for (int i = 0; i < gridLength; i++) {
                    for (int e = 0; e < gridLength; e++) {
                        btnArr[i][e].setBackgroundColor(getResources().getColor(R.color.Grau_Hintergrund));
                    }
                }
                break;*/
            //btnArr[0][0].setTextColor(Color.GREEN);
        }
    }

    public void snackBarShow() {

        switch (gameMode) {
            case 1:
                snackbar.make(layout, getString(R.string.zahlenspiel),
                        LENGTH_INDEFINITE).show();
                break;
            case 2:
            case 7:
                snackbar.make(layout, getString(R.string.landesflaeche),
                        LENGTH_INDEFINITE).show();
                break;
            case 3:
                snackbar.make(layout, getString(R.string.bruchspiel),
                        LENGTH_INDEFINITE).show();
                break;
            case 4:
            case 8:
                snackbar.make(layout, getString(R.string.einwohnerzahl),
                        LENGTH_INDEFINITE).show();
                break;
            case 5:
            case 6:
            case 9:
            case 10:


               // checkStr = getSnackbarInfo();

                break;
        }
        //playNumbers();
        //Toast.makeText(getActivity(), "Arrnummer: " + arrnummer + " Index: " + index + " bigArrLength: " + bigArr.length, Toast.LENGTH_SHORT).show();
    }

    public static int randomWithRange(int min, int max) {
        int range = (max - min) + 1;
        return (int) (Math.random() * range) + min;
    }

    String punkteOut(int punkte) {
        if (punkte == 0) return Integer.toString(punkte) + " Punkte";
        else if (punkte < 2) return Integer.toString(punkte) + " Punkt";
        else return Integer.toString(punkte) + " Punkte";
    }

    List<Integer> makeSequence(int begin, int end) {
        List<Integer> ret = new ArrayList(end - begin + 1);
        for (int i = begin; i <= end; i++, ret.add(i)) ;
        return ret;
    }

    void reverseKnopfnummer() {
        knopfNummer = knopfNummerAlt;

    }

    void reverseKnopfnummer_lc() {
        knopfNummer_lc = knopfNummerAlt_lc;

    }

    void invokeBackground(Button btn) {
        switch (gameMode) {
            case 1:
            case 3:
              //  if (btn.getCurrentTextColor() != (Color.RED)) {
              //      btn.setBackgroundColor(getResources().getColor(R.color.Blau_Aktiv));
              //  }
            case 2:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
         //       if (btn.getBackground() != redDrawable) {
         //           btn.setBackgroundColor(getResources().getColor(R.color.Grau_Hintergrund));
         //       }
        }
    }

    public void showRangeDialog() {

        final AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());

        // Set the alert dialog title
        builder.setTitle("Zahlenmenge");

        // Initializing an array
        final String[] zahlenauswahl = new String[]{
                "Frieda",                        // gameMode =1
                "0 - 100",
                "0 - 1000",
                "0 - 10000",
                "0 - 1000000",
                "Brueche",                       // gameMode =
                "Europa-Länder-Fläche",         // erste
                "Europa-Länder-Einwohner",
                "Europa-Länder-Flaggen",
                "Europa-Länder-Hauptstädte",
                "Amerika-Länder-Fläche",         // erste
                "Amerika-Länder-Einwohner",
                "Amerika-Länder-Flaggen",
                "Amerika-Länder-Hauptstädte"
        };

        builder.setSingleChoiceItems(
                zahlenauswahl, // Items list
                0, // Index of checked item (-1 = no selection)
                new DialogInterface.OnClickListener() // Item click listener
                {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        // Get the alert dialog selected item's text
                        selectedItem = Arrays.asList(zahlenauswahl).get(i);
                        switch (i) {
                            case 0:
                                gameMode = 1;
                                numberMin = 1;
                                numberMax = 10;
                                break;
                            case 1:
                                gameMode = 1;
                                numberMin = 1;
                                numberMax = 100;
                                break;
                            case 2:
                                gameMode = 1;
                                numberMin = 1;
                                numberMax = 1000;
                                break;
                            case 3:
                                gameMode = 1;
                                numberMin = 1;
                                numberMax = 10000;
                                break;
                            case 4:
                                gameMode = 1;          // Todo generierte addition,subtraktion, multiplikation an dieser Stelle
                                numberMin = 1;
                                numberMax = 99999;
                                break;
                            case 5:
                                gameMode = 3;         // Brüche
                                numberMin = 1;
                                numberMax = 100;
                                break;
                            case 6:
                                gameMode = 2;          // Euroländer Flächen
                                break;
                            case 7:
                                gameMode = 4;          // Euroländer Einwohner
                                break;
                            case 8:
                                gameMode = 5;          // Euroländer Flagge zu Land
                                break;
                            case 9:
                                gameMode = 6;          // EuroLänder Hauptstädte
                                break;
                            case 10:
                                gameMode = 7;
                                break;
                            case 11:
                                gameMode = 8;
                                break;
                            case 12:
                                gameMode = 9;
                                break;
                            case 13:
                                gameMode = 10;


                        }
                        try {
                            // resetColors();
                            animIndex.stop();
                            animArrnummer.stop();
                            resetColors();
                            resetValues();
                            setDetail();
                            dialogInterface.dismiss();
                            btnArr = generateGameSet(color, detail);


                        } catch (Exception e) {
                            e.printStackTrace();
                        }

                        // Display the selected item's text on snack bar

                    }
                });

        // Set the a;ert dialog positive button
                   /*   okButton = builder.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {



                                dialogInterface.dismiss();
                            }
                        });

                 Create the alert dialog*/

        AlertDialog dialog = builder.create();

        // Finally, display the alert dialog
        dialog.show();
    }

    public void getReaction(byte result){

        if(trueMap == null || trueMap.size() == 1) generateTrueReactionMaps();
        if(falseMap == null || falseMap.size()==1) generateFalseReactionMaps();
        switch (result) {
            case 0:
                List<String> falseKeys = new ArrayList<>(falseMap.keySet());                  //Hash keys liste von euromap
                randomKey = falseKeys.get(random.nextInt(falseKeys.size())& Integer.MAX_VALUE);                      // Zufällig key nehmen
                retStr = falseMap.get(String.valueOf(randomKey));       // Value nehmen aus euromap
                falseMap.remove(randomKey);
                break;
            case 1:
                List<String> trueKeys = new ArrayList<>(trueMap.keySet());                  //Hash keys liste von euromap
                randomKey = trueKeys.get(random.nextInt(trueKeys.size())& Integer.MAX_VALUE);                      // Zufällig key nehmen
                retStr = trueMap.get(String.valueOf(randomKey));       // Value nehmen aus euromap
                trueMap.remove(randomKey);
                break;
        }

       // reactionButton.setText(retStr);
       // find init on func_a1 and func_b0 : m = new MyMsgBox(getActivity(), 800, Gravity.BOTTOM);
       // new MyMsgBox(getActivity(), 500,Gravity.BOTTOM).show(retStr);

        if (messageBox == null) {
            messageBox = new MyMsgBox(getActivity(),400,Gravity.BOTTOM);
        messageBox.show(retStr);
        } else {messageBox.show(retStr+"");}
        //else new MyMsgBox(getActivity(), 800, Gravity.BOTTOM).show(retStr);

    //  new MyMsgBox(getActivity(), 800, Gravity.BOTTOM);

        /*if (messageBox2 != null) messageBox2.show(retStr);
        if (messageBox3 != null) messageBox3.show(retStr);
        if (messageBox4 != null) messageBox4.show(retStr);
        if (messageBox5 != null) messageBox5.show(retStr);*/
        //else if (messageBox == null) messageBox = new MyMsgBox(getActivity(), 500,Gravity.BOTTOM);
        //messageBox.show(retStr);
    }

    public void generateTrueReactionMaps(){

        trueMap = new HashMap<>();

        true_sonne = getString(R.string.true_sonne);
        true_cool = getString(R.string.true_cool);
        true_highfive = getString(R.string.true_highfive);
        true_daumenhoch = getString(R.string.true_daumenhoch);
        true_hangloose = getString(R.string.true_hangloose);
        true_ass = getString(R.string.true_ass);
        true_doppelhaende = getString(R.string.true_doppelhaende);
        true_fuchs = getString(R.string.true_fuchs);
        true_applaus = getString(R.string.true_applaus);
        true_victory = getString(R.string.true_victory);
        true_ok = getString(R.string.true_ok);
        true_hundert = getString(R.string.true_hundert);
        true_supermann = getString(R.string.true_supermann);
        true_superfrau = getString(R.string.true_superfrau);
        true_gluehbirne = getString(R.string.true_gluehbirne);
        true_delfin = getString(R.string.true_delfin);
        true_stark = getString(R.string.true_stark);
        true_brain = getString(R.string.true_brain);
        true_shakehands = getString(R.string.true_shakehands);
        true_nerd = getString(R.string.true_nerd);
        true_dartscheibe = getString(R.string.true_dartscheibe);
        true_taenzer = getString(R.string.true_taenzer);
        true_taenzerin = getString(R.string.true_taenzerin);

        trueMap.put("0",true_sonne);
        trueMap.put("1",true_cool);
        trueMap.put("2",true_highfive);
        trueMap.put("3",true_daumenhoch);
        trueMap.put("4",true_hangloose);
        trueMap.put("5",true_ass);
        trueMap.put("6",true_doppelhaende);
        trueMap.put("7",true_fuchs);
        trueMap.put("8",true_applaus);
        trueMap.put("9",true_victory);
        trueMap.put("10",true_ok);
        trueMap.put("11",true_hundert);
        trueMap.put("12",true_supermann);
        trueMap.put("13",true_superfrau);
        trueMap.put("14",true_gluehbirne);
        trueMap.put("15",true_delfin);
        trueMap.put("16",true_stark);
        trueMap.put("17",true_brain);
        trueMap.put("18",true_shakehands);
        trueMap.put("19",true_nerd);
        trueMap.put("20",true_dartscheibe);
        trueMap.put("21",true_taenzer);
        trueMap.put("22",true_taenzerin);
    }
    public void generateFalseReactionMaps(){

        falseMap = new HashMap<>();
        false_rotfl = getString(R.string.false_rotfl);
        false_augenbrauen = getString(R.string.false_augenbrauen);
        false_pinoccio = getString(R.string.false_pinoccio);
        false_notamused = getString(R.string.false_notamused);
        false_rollendeaugen = getString(R.string.false_rollendeaugen);
        false_monokkel = getString(R.string.false_monokkel);
        false_pst = getString(R.string.false_pst);
        false_betrunken = getString(R.string.false_betrunken);
        false_keinmund = getString(R.string.false_keinmund);
        false_spiralaugen = getString(R.string.false_spiralaugen);
        false_verwirrt = getString(R.string.false_verwirrt);
        false_schlafweiter = getString(R.string.false_schlafweiter);
        false_kopfexplodiert = getString(R.string.false_kopfexplodiert);
        false_fluchen = getString(R.string.false_fluchen);
        false_heulen = getString(R.string.false_heulen);
        false_dampfablassen = getString(R.string.false_dampfablassen);
        false_facepalm = getString(R.string.false_facepalm);
        false_zombie = getString(R.string.false_zombie);
        false_uebelkeit = getString(R.string.false_uebelkeit);
        false_kotzen = getString(R.string.false_kotzen);

        falseMap.put("0",false_rotfl);
        falseMap.put("1",false_augenbrauen);
        falseMap.put("2",false_pinoccio);
        falseMap.put("3",false_notamused);
        falseMap.put("4",false_rollendeaugen);
        falseMap.put("5",false_monokkel);
        falseMap.put("6",false_pst);
        falseMap.put("7",false_betrunken);
        falseMap.put("8",false_keinmund);
        falseMap.put("9",false_spiralaugen);
        falseMap.put("10",false_verwirrt);
        falseMap.put("11",false_schlafweiter);
        falseMap.put("12",false_kopfexplodiert);
        falseMap.put("13",false_fluchen);
        falseMap.put("14",false_heulen);
        falseMap.put("15",false_dampfablassen);
        falseMap.put("16",false_facepalm);
        falseMap.put("17",false_zombie);
        falseMap.put("18",false_uebelkeit);
        falseMap.put("19",false_kotzen);
    }


    //};

    // builder.setOnClickListener(listener);
    void setNumberValues() {
        if (numberMax == 0) {
            numberMax = 100;
        }
    }

    int getColorTheme() {
        switch (gameMode) {
            case 1:Bitmap bitmap = BitmapFactory.decodeResource(getActivity().getResources(), R.drawable.zahlenbackgrnd);
                break;
            case 3:
                bitmap = BitmapFactory.decodeResource(getActivity().getResources(), R.drawable.grid3_chess_grad_backgrnd_sm);
                //color = (getResources().getColor(R.color.Blau_Hintergrund));
                break;
            case 2:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
                //color = (getResources().getColor(R.color.Grau_Hintergrund));
                break;
        }
        layout.setBackgroundDrawable(new BitmapDrawable(bitmap));
        return color;
    }

    void playLongClicked() {
        switch (gameMode) {    //Flaggenspiel Fläche
            case 2:
            case 7:    {
                try {
                    if (knopfNummer_lc - knopfNummerAlt_lc == 1) {
                        Toast.makeText(getActivity(), getString(R.string.ask_landesflaeche) + readableNumbers((int) bigObjectArr[arrnummer][index + 1][detail]) + getString(R.string.ask_landesflaeche_einheit), LENGTH_LONG).show();
                    } else if (knopfNummer_lc - knopfNummerAlt_lc == 10) {
                        Toast.makeText(getActivity(), getString(R.string.ask_landesflaeche) + readableNumbers((int) bigObjectArr[arrnummer + 1][index][detail]) + getString(R.string.ask_landesflaeche_einheit), LENGTH_LONG).show();
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
                knopfNummer_lc = knopfNummerAlt_lc;// Vorsicht !!!
                break;
            }
            case 3:
                try {
                    if (knopfNummer_lc - knopfNummerAlt_lc == 1) {
                        Toast.makeText(getActivity(), getString(R.string.ask_kommazahl) + bigObjectArr[arrnummer][index + 1][1], LENGTH_LONG).show();
                    } else if (knopfNummer_lc - knopfNummerAlt_lc == 10) {
                        Toast.makeText(getActivity(), getString(R.string.ask_kommazahl) + bigObjectArr[arrnummer + 1][index][1], LENGTH_LONG).show();
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
                knopfNummer_lc = knopfNummerAlt_lc;
                break;
            case 4:
            case 8:    {

                try {
                    if (knopfNummer_lc - knopfNummerAlt_lc == 1) {
                        Toast.makeText(getActivity(), getString(R.string.ask_einwohnerzahl) + readableNumbers((int) bigObjectArr[arrnummer][index + 1][detail]) + getString(R.string.ask_einwohnerzahl_einheit), LENGTH_LONG).show();
                    } else if (knopfNummer_lc - knopfNummerAlt_lc == 10) {
                        Toast.makeText(getActivity(), getString(R.string.ask_einwohnerzahl) + readableNumbers((int) bigObjectArr[arrnummer + 1][index][detail]) + getString(R.string.ask_einwohnerzahl_einheit), LENGTH_LONG).show();
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
                knopfNummer_lc = knopfNummerAlt_lc;
                break;
            }

        }
    }

    public void resetValues() {
        knopfNummer = 100;
        knopfNummerAlt = 100;
        knopfNummerAlt_lc = 100;
        knopfNummer_lc = 100;
        index = 0;
        arrnummer = 0;
    }

    public void setDetail() {  // MainActivity.detail entfernt (ist doch static)
        switch (gameMode) {
            case 2:
            case 7:
                detail = 3;
                break;
            case 4:
            case 8:
                detail = 4;
                break;
            case 5:
            case 9:
                detail = 1;
                break;
            case 6:
            case 10:
                detail = 2;
                break;
        }
    }
    public String getSnackbarInfo(){
        String randomContriesStr = randomCountries();
        switch (gameMode){
            case 5:
            case 9:
                snackbar.make(layout,getString(R.string.landesname)+randomContriesStr,LENGTH_SHORT).show();
            break;
            case 6:
            case 10:    snackbar.make(layout,getString(R.string.landeshauptstadt)+randomContriesStr,LENGTH_SHORT).show();
            break;
        }
        return randomContriesStr;
    }
    public String randomCountries() {
        random_num = randomWithRange(0,1);
        String[] strArr = {(String) bigObjectArr[arrnummer][index+1][detail],(String) bigObjectArr[arrnummer+1][index][detail]};
        return strArr[random_num];
    }
    public String readableNumbers(int inputInt) {
       // return String.format("%,d", inputInt);
        return String.format(getLocale(),"%,d",inputInt);
    }
    public Locale getLocale() {
        Locale locale = getResources().getConfiguration().locale;
        return locale;
    }
    public void indexScroll(){
        curX += btnArr[arrnummer][index + 1].getWidth();
        valueX += btnArr[arrnummer][index + 1].getWidth();
       // curX += buttonWidth;
       // valueX += buttonWidth;
        curY = 0;
        ObjectAnimator animator= ObjectAnimator.ofInt(horizontalScrollView,"scrollX",valueX);
        animator.setDuration(800);
        animator.start();
        //horizontalScrollView.scrollBy((int) (curX), (int) (curY));
        mx = curX;
        my = curY;
    }
    // todo scroll the whole time
    // todo try to use arrayadapter for gridview and scroll endlessly
    // todo try to change gamemodes on the fly (controlled by Runnable ??)
    // todo try to animate helicopter, to force player to hurry up on x - axis
    // todo try to introduce wayyyy more fun-gamemodes : reaction...
    // todo try to introduce bombing

    public void testIndexScroll(int dur){
        curX += (btnArr[arrnummer][index + 1].getWidth()*gridLength);
        valueX += (btnArr[arrnummer][index + 1].getWidth()*gridLength);
        // curX += buttonWidth;
        // valueX += buttonWidth;
        curY = 0;
        ObjectAnimator animator= ObjectAnimator.ofInt(horizontalScrollView,"scrollX",valueX);
        animator.setDuration(dur);
        animator.start();
        //horizontalScrollView.scrollBy((int) (curX), (int) (curY));
        mx = curX;
        my = curY;
    }

    private static String setButtonWidth(Context context)
    {
        WindowManager wm = (WindowManager) context.getSystemService(Context.WINDOW_SERVICE);
        Display display = wm.getDefaultDisplay();
        DisplayMetrics metrics = new DisplayMetrics();
        display.getMetrics(metrics);
        int width = metrics.widthPixels;
        int height = metrics.heightPixels;
      //  int dividend = 556, divisor = 9;
      //  int quotient = dividend / divisor;
      //  int remainder = dividend % divisor;
        switch (gameMode) {
            case 1:
            case 2:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:

            buttonWidth = width /4;
          //  buttonWidth = width / gridLength;
            buttonHeight = (buttonWidth * 3) / 4;
            emojiSize = (buttonHeight * 3) / 12;
            break;
            case 3:
                buttonWidth = width / gridLength;
                buttonHeight = (buttonWidth * 3) / 4;
                emojiSize = (buttonHeight * 3) / 15;

        }

            return "" + width + " " + height;

    }



}
