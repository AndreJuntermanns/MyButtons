package net.juntermanns.mybuttons.ui.main;

import android.animation.ObjectAnimator;
import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Color;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.media.AudioAttributes;
import android.media.SoundPool;
import android.os.Bundle;
import android.support.design.widget.Snackbar;
import android.support.v4.provider.FontRequest;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.text.emoji.EmojiCompat;
import android.support.text.emoji.FontRequestEmojiCompatConfig;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AlertDialog;
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
import android.widget.Toast;

import net.juntermanns.mybuttons.ButtonColorAnimatorArrnummer;
import net.juntermanns.mybuttons.ButtonColorAnimatorIndex;
import net.juntermanns.mybuttons.MainActivity;
import net.juntermanns.mybuttons.MusicPlayer;
import net.juntermanns.mybuttons.MyEmojiButton;
import net.juntermanns.mybuttons.MyMsgBox;
import net.juntermanns.mybuttons.R;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.zip.Inflater;

import static android.graphics.Color.*;
import static android.support.design.widget.Snackbar.LENGTH_INDEFINITE;
import static android.widget.Toast.LENGTH_LONG;
import static android.widget.Toast.LENGTH_SHORT;
import static java.lang.Math.random;
import static net.juntermanns.mybuttons.MainActivity.mainfragment;
import static net.juntermanns.mybuttons.ui.main.MyViewModel.africaMap;
import static net.juntermanns.mybuttons.ui.main.MyViewModel.americaMap;
import static net.juntermanns.mybuttons.ui.main.MyViewModel.animArrnummer;
import static net.juntermanns.mybuttons.ui.main.MyViewModel.animIndex;
import static net.juntermanns.mybuttons.ui.main.MyViewModel.asiaMap;
import static net.juntermanns.mybuttons.ui.main.MyViewModel.buttonHeight;
import static net.juntermanns.mybuttons.ui.main.MyViewModel.buttonWidth;
import static net.juntermanns.mybuttons.ui.main.MyViewModel.detail;
import static net.juntermanns.mybuttons.ui.main.MyViewModel.emojiSize;
import static net.juntermanns.mybuttons.ui.main.MyViewModel.euroMap;
import static net.juntermanns.mybuttons.ui.main.MyViewModel.bruchMap;
import static net.juntermanns.mybuttons.ui.main.MyViewModel.gameMode;
import static net.juntermanns.mybuttons.ui.main.MyViewModel.gridLength;
import static net.juntermanns.mybuttons.ui.main.MyViewModel.arrnummer;
import static net.juntermanns.mybuttons.ui.main.MyViewModel.index;
import static net.juntermanns.mybuttons.ui.main.MyViewModel.numberMax;
import static net.juntermanns.mybuttons.ui.main.MyViewModel.numberMin;
import static net.juntermanns.mybuttons.ui.main.MyViewModel.retStr;

public class MainFragment extends Fragment {

    SoundPool mSound;
    private static final String ARG_SECTION_NUMBER = "1";
    public MyEmojiButton[][] btnArr = new MyEmojiButton[MyViewModel.gridLength][MyViewModel.gridLength];
    public View layout;
    private MyMsgBox messageBox;
    public MyEmojiButton a1;
    public String amiFlag;
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
    ColorDrawable schwarz = new ColorDrawable();
    ColorDrawable rot = new ColorDrawable();
    ColorDrawable gelb = new ColorDrawable();
    ColorDrawable blau = new ColorDrawable();
    ColorDrawable hellblau = new ColorDrawable();
    ColorDrawable gruen = new ColorDrawable();
    ColorDrawable orange = new ColorDrawable();
    ColorDrawable weiss = new ColorDrawable();

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

    public String checkStr;
    public int random_num;
    public int knopfNummer;
    public int knopfNummerAlt = 100;
    public int knopfNummer_lc;
    public int knopfNummerAlt_lc = 100;
    int answerrightcoin, answerrightcoinbling, answerrightblingy, answerrightflare, answerrightlaser, answerrightlaserbeam, answerrightlaserecho, answerrightpiggyoink = 0;
    int answerwrongecho, answerwronghighdownbeep, answerwronghighdownwood, answerwronglowbuzzer, answerwrongmousefart, answerwrongsmallitch, answerwrongsounddumbexplosion, answerwronglamesiren = 0;

    int[] soundArr = new int[16];

    public int[][] bigArr;

    int punkte = 0;
    String selectedItem;

    ActionBar toolbar;
    private MyViewModel mViewModel;

    Map<String, Object[]> gridMap;
    Map<String, String> trueMap;
    Map<String, String> falseMap;
    ArrayList<Integer> goodSoundsList = new ArrayList<>();
    ArrayList<Integer> badSoundsList = new ArrayList<>();
    ListIterator goodItr;
    ListIterator badItr;

    Object[][] gridArr;
    Object[][][] bigObjectArr;

    public static Snackbar snackbar;
    Map<String, String> intToStringRangeMap = new HashMap<>();
    Random random = new Random();
    String randomKey;
    Bitmap bitmap;
    ColorDrawable redDrawable = new ColorDrawable();
    ColorDrawable greenDrawable = new ColorDrawable();
    HorizontalScrollView horizontalScrollView;
    Activity mActivity;
    int color;
    private float curX, curY;
    int valueX;
    int valueY;
    private MyMsgBox m;
    final ViewGroup nullParent = null;


    public static MainFragment newInstance() {
        return new MainFragment();
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mViewModel = new MyViewModel();
        AudioAttributes audioAttrib = new AudioAttributes.Builder()
                .setUsage(AudioAttributes.USAGE_GAME)
                .setContentType(AudioAttributes.CONTENT_TYPE_SONIFICATION)
                .build();
        mSound = new SoundPool.Builder().setAudioAttributes(audioAttrib).setMaxStreams(6).build();

        answerrightcoin = mSound.load(getActivity(), R.raw.answerrightcoin, 1);
        answerrightcoinbling = mSound.load(getActivity(), R.raw.answerrightcoinbling, 1);
        answerrightblingy = mSound.load(getActivity(), R.raw.answerrightcoinblingy, 1);
        answerrightflare = mSound.load(getActivity(), R.raw.answerrightflare, 1);
        answerrightlaser = mSound.load(getActivity(), R.raw.answerrightlaser, 1);
        answerrightlaserbeam = mSound.load(getActivity(), R.raw.answerrightlaserbeam, 1);
        answerrightlaserecho = mSound.load(getActivity(), R.raw.answerrightlaserecho, 1);
        answerrightpiggyoink = mSound.load(getActivity(), R.raw.answerrightlpiggyoinkwav, 1);
        answerwrongecho = mSound.load(getActivity(), R.raw.answerwrongecho, 1);
        answerwronghighdownbeep = mSound.load(getActivity(), R.raw.answerwronghighdownbeep, 1);
        answerwronghighdownwood = mSound.load(getActivity(), R.raw.answerwronghighdownwood, 1);
        answerwronglowbuzzer = mSound.load(getActivity(), R.raw.answerwronglowbuzzer, 1);
        answerwrongmousefart = mSound.load(getActivity(), R.raw.answerwrongmousefart, 1);
        answerwrongsmallitch = mSound.load(getActivity(), R.raw.answerwrongsmallitch, 1);
        answerwrongsounddumbexplosion = mSound.load(getActivity(), R.raw.answerwrongsounddumbexplosion, 1);
        answerwronglamesiren = mSound.load(getActivity(), R.raw.answerwrongsoundlamesiren, 1);

        soundArr = new int[]{answerrightcoin, answerrightcoinbling, answerrightblingy, answerrightflare, answerrightlaser, answerrightlaserbeam, answerrightlaserecho, answerrightpiggyoink,
                answerwrongecho, answerwronghighdownbeep, answerwronghighdownwood, answerwronglowbuzzer, answerwrongmousefart, answerwrongsmallitch, answerwrongsounddumbexplosion, answerwronglamesiren};


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

        EmojiCompat.Config config = new FontRequestEmojiCompatConfig(Objects.requireNonNull(getActivity()).getApplicationContext(), fontRequest);
        EmojiCompat.init(config);
        Bitmap bitmap = BitmapFactory.decodeResource(getActivity().getResources(), R.drawable.zahlenbackgrnd);
        setButtonWidth(getActivity());
        rot.setColor(RED);
        schwarz.setColor(BLACK);
        gelb.setColor(YELLOW);
        weiss.setColor(WHITE);
        orange.setColor(argb(255, 255, 128, 0));
        blau.setColor(BLUE);
        hellblau.setColor(argb(255, 0, 102, 204));

        redDrawable.setColor(RED);
        greenDrawable.setColor(GREEN);
        //Toast.makeText(getActivity(),setButtonWidth(getActivity()),LENGTH_LONG).show();
        mActivity = getActivity();

        //TODO get cooler !
        // gridLength = randomWithRange(4,7);
        GameMode.initGameMap(gameMode);
        MyViewModel.titleBarString = gameMode.setStatus(randomWithRange(1, 14)); // Automatisches setzen von Überschrift

        switch (MyViewModel.gridLength) {
            case 3:
                layout = inflater.inflate(R.layout.main_fragment, nullParent);
                horizontalScrollView = layout.findViewById(R.id.HscrollView);

                horizontalScrollView.scrollTo(0, 100);

                a1 = layout.findViewById(R.id.a1);
                a2 = layout.findViewById(R.id.a2);
                a3 = layout.findViewById(R.id.a3);
                b1 = layout.findViewById(R.id.b1);
                b2 = layout.findViewById(R.id.b2);
                b3 = layout.findViewById(R.id.b3);
                c1 = layout.findViewById(R.id.c1);
                c2 = layout.findViewById(R.id.c2);
                c3 = layout.findViewById(R.id.c3);

                range = layout.findViewById(R.id.btn_range);
                // messageBox = new MyMsgBox(getActivity(), 500,Gravity.BOTTOM);
                btnArr = new MyEmojiButton[][]{{a1, a2, a3}, {b1, b2, b3}, {c1, c2, c3}};
               /* if (MyViewModel.emojiArray[0][0] != MyViewModel.emojiArray[gridLength-1][gridLength-1]) {
                    try {
                        for (int i = 0; i < MyViewModel.gridLength; i++) {
                            for (int e = 0; e < MyViewModel.gridLength; e++) {
                                btnArr[i][e].setText(MyViewModel.emojiArray[i][e]);
                            }
                        }
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }*/
                break;
            case 4:
                layout = inflater.inflate(R.layout.main_fragment2, nullParent);
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

                range = layout.findViewById(R.id.btn_range);

                btnArr = new MyEmojiButton[][]{{a1, a2, a3, a4}, {b1, b2, b3, b4}, {c1, c2, c3, c4}, {d1, d2, d3, d4}};
                /*if (MyViewModel.emojiArray[0][0] != MyViewModel.emojiArray[gridLength-1][gridLength-1]) {
                    try {
                        for (int i = 0; i < MyViewModel.gridLength; i++) {
                            for (int e = 0; e < MyViewModel.gridLength; e++) {
                                btnArr[i][e].setText(MyViewModel.emojiArray[i][e]);
                            }
                        }
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }*/
                break;
            case 5:
                layout = inflater.inflate(R.layout.main_fragment3, nullParent);
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
                range = layout.findViewById(R.id.btn_range);
                //messageBox = new MyMsgBox(getActivity(), 500,Gravity.BOTTOM);
                btnArr = new MyEmojiButton[][]{{a1, a2, a3, a4, a5}, {b1, b2, b3, b4, b5}, {c1, c2, c3, c4, c5}, {d1, d2, d3, d4, d5}, {e1, e2, e3, e4, e5}};
                /*if (MyViewModel.emojiArray[0][0] != MyViewModel.emojiArray[gridLength-1][gridLength-1]) {
                    try {
                        for (int i = 0; i < MyViewModel.gridLength; i++) {
                            for (int e = 0; e < MyViewModel.gridLength; e++) {
                                btnArr[i][e].setText(MyViewModel.emojiArray[i][e]);
                            }
                        }
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }*/
                break;
            case 6:
                layout = inflater.inflate(R.layout.main_fragment4, nullParent);
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

                range = layout.findViewById(R.id.btn_range);
                //messageBox = new MyMsgBox(getActivity(), 500,Gravity.BOTTOM);
                btnArr = new MyEmojiButton[][]{{a1, a2, a3, a4, a5, a6}, {b1, b2, b3, b4, b5, b6}, {c1, c2, c3, c4, c5, c6}, {d1, d2, d3, d4, d5, d6}, {e1, e2, e3, e4, e5, e6}, {f1, f2, f3, f4, f5, f6}};

               /* if (MyViewModel.emojiArray[0][0] != MyViewModel.emojiArray[gridLength][gridLength]) {
                    try {
                        for (int i = 0; i < MyViewModel.gridLength; i++) {
                            for (int e = 0; e < MyViewModel.gridLength; e++) {
                                btnArr[i][e].setText(MyViewModel.emojiArray[i][e]);
                            }
                        }
                    } catch (Exception e) {
                        e.printStackTrace();
                    }

                }*/

                break;
            case 7:
                layout = inflater.inflate(R.layout.main_fragment5, nullParent);
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

                range = layout.findViewById(R.id.btn_range);
                //messageBox = new MyMsgBox(getActivity(), 500,Gravity.BOTTOM);
                btnArr = new MyEmojiButton[][]{{a1, a2, a3, a4, a5, a6, a7}, {b1, b2, b3, b4, b5, b6, b7}, {c1, c2, c3, c4, c5, c6, c7}, {d1, d2, d3, d4, d5, d6, d7}, {e1, e2, e3, e4, e5, e6, e7}, {f1, f2, f3, f4, f5, f6, f7}, {g1, g2, g3, g4, g5, g6, g7}};

                //TODO   EuroMap und Americap sind < 49 Felder ! **//

                MyViewModel.titleBarString = MyViewModel.gameMode.setStatus(random.nextBoolean() ? 1 : 3);



               /* if (MyViewModel.emojiArray != null && MyViewModel.gridLength == MyViewModel.emojiArray[0].length) {
                    try {
                        for (int i = 0; i < MyViewModel.gridLength; i++) {
                            for (int e = 0; e < MyViewModel.gridLength; e++) {
                                btnArr[i][e].setText(MyViewModel.emojiArray[i][e]);
                            }
                        }
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
                break;
        }
        try {
            for (int i = 0; i < MyViewModel.gridLength; i++) {
                for (int e = 0; e < MyViewModel.gridLength; e++) {
                    btnArr[i][e].setWidth(buttonWidth);
                    btnArr[i][e].setHeight(buttonHeight);
                    btnArr[i][e].setTextSize(emojiSize);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }*/

                //   if (MyViewModel.emojiArray[0][0] == null || (MyViewModel.emojiArray[0].length < MyViewModel.gridLength)) {

                //   } else {
                //    startGame();
        }
        btnArr = generateGameSet(getColorTheme(), gameMode.getDetail());

        return layout;
    }


    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        startGame();
        a1.callOnClick();

    }

    public MyEmojiButton[][] generateGameSet(int color, int detail) {

        bitmap = BitmapFactory.decodeResource(Objects.requireNonNull(getActivity()).getResources(), R.drawable.zahlenbackgrnd);

        switch (MyViewModel.gameMode.getStatus()) {
            case 1:
                btnArr = generateFields(getColorTheme()); // Zahlenspiel
                break;
            case 2:
            case 4:
            case 5:
            case 6:
                btnArr = generateEuroFlags(getColorTheme());
                break;
            case 3:
                btnArr = generateFract(getColorTheme());
                break;
            case 7:
            case 8:
            case 9:
            case 10:
                btnArr = generateAmericaFlags(getColorTheme());
                break;
            case 11:
            case 12:
                btnArr = generateAsiaFlags(getColorTheme());
                break;
            case 13:
            case 14:
                btnArr = generateAfricaFlags(getColorTheme());

        }
        layout.setBackground(new BitmapDrawable(bitmap));
        return btnArr;
    }


    public MyEmojiButton[][] generateFields(int color) {  //Zahlenfelder

        bigArr = new int[MyViewModel.gridLength][MyViewModel.gridLength];
        int[] valueArr = new int[MyViewModel.gridLength * MyViewModel.gridLength];
        if (numberMax < MyViewModel.gridLength * MyViewModel.gridLength)
            numberMax = MyViewModel.gridLength * MyViewModel.gridLength;
        numberMin = 0;

        String numberAsString;
        List<int[]> tempBigList;

        tempBigList = new ArrayList<>();
        List<Integer> tempSmallList1 = new ArrayList<>();
        int[] tempArr = new int[MyViewModel.gridLength];
        intToStringRangeMap.clear();

        ArrayList<String> tempSmallList = new ArrayList<>();

        intToStringRangeMap.clear();

        while (intToStringRangeMap.size() <= (MyViewModel.gridLength * MyViewModel.gridLength)) {
            int valueTemp = (randomWithRange(numberMin, numberMax));
            String keyTemp = "" + valueTemp;
            if (!intToStringRangeMap.containsValue(valueTemp)) {
                intToStringRangeMap.put(keyTemp, "" + valueTemp);
            }
        }

        try {
            for (int i = 0; i < (MyViewModel.gridLength * MyViewModel.gridLength); i++) {

                List<String> keys = new ArrayList<>(intToStringRangeMap.keySet());
                randomKey = keys.get(random.nextInt(keys.size()) & Integer.MAX_VALUE);
                numberAsString = intToStringRangeMap.get(randomKey);
                intToStringRangeMap.remove(numberAsString);

                valueArr[i] = Integer.parseInt(numberAsString);
            }


            for (int it = 0; it < (MyViewModel.gridLength * MyViewModel.gridLength); it++) {
                tempSmallList.add(String.valueOf(valueArr[it]));
                if (it > 0 && mod(it + 1, MyViewModel.gridLength) == 0) {
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

        return btnArr;
    }

    public MyEmojiButton[][] generateFract(int color) {

        bruchMap.getBruchMap(bruchMap);
        BruchMap bruchMapCopy = bruchMap;

        List<String> strTempSmallList = new ArrayList<>(); // ähnlich generateFields(), aber Strings nicht int !!!
        List<Object> objTempSmallList = new ArrayList<>();
        List<String[]> strTempBigList = new ArrayList<>();
        List<Object[]> objTempBigList = new ArrayList<>();
        String[] btnStrArr = new String[MyViewModel.gridLength * MyViewModel.gridLength];
        Object[] objArr = new Object[MyViewModel.gridLength * MyViewModel.gridLength];
        String[][] bigStringArr = new String[MyViewModel.gridLength][MyViewModel.gridLength];
        bigObjectArr = new Object[MyViewModel.gridLength][MyViewModel.gridLength][2];
        bruchMapCopy = bruchMap;

        for (int i = 0; i < (MyViewModel.gridLength * MyViewModel.gridLength); i++) {

            List<String> keys = new ArrayList<>(BruchMap.bMap.keySet());                  //Hash keys liste von euromap
            randomKey = keys.get(random.nextInt(keys.size()) & Integer.MAX_VALUE);                      // Zufällig key nehmen
            String flag = (String) BruchMap.bMap.get(String.valueOf(randomKey))[0];       // Value nehmen aus euromap
            objArr[i] = BruchMap.bMap.get(String.valueOf(randomKey));  //ganzes Array
            btnStrArr[i] = flag;                                 // eindimensionales array besiedeln
            BruchMap.bMap.remove(randomKey);                           // euromap verkleinern (unique Values)
        }
        bruchMap = bruchMapCopy;
        bruchMap.bMap.clear();

        for (int it = 0; it < (MyViewModel.gridLength * MyViewModel.gridLength); it++) {
            strTempSmallList.add(btnStrArr[it]);
            objTempSmallList.add(objArr[it]);
            //  if(it == 0||it < MyViewModel.gridLength) bigObjectArr[0][it]= (objArr[it]);
            if (it > 0 && mod(it + 1, MyViewModel.gridLength) == 0) {
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
                String tempStr = (String) bigObjectArr[i][j][0];
                //btnArr[i][j].setText(tempStr);
                MyViewModel.emojiArray[i][j] = tempStr;
                btnArr[i][j].setText(MyViewModel.emojiArray[i][j]);
                btnArr[i][j].setWidth(450);  // reicht bei 5 Stellen ,aber knapp
            }
        }

        index = 0;
        arrnummer = 0;

        return btnArr;
    }

    public MyEmojiButton[][] generateEuroFlags(int color) {    //Flaggenfelder
        if (MyViewModel.gridLength * MyViewModel.gridLength > 36) {
            btnArr = generateGameSet(getColorTheme(), gameMode.getDetail());
        } else {
            EuroMap euroMapCopy;

            try {
                euroMap.getEuroMap(euroMap);
                euroMapCopy = euroMap;
            } catch (NullPointerException npe) {
                npe.printStackTrace();
            }
            gridMap = new HashMap<>();
            gridArr = new Object[MyViewModel.gridLength][MyViewModel.gridLength];


            //this.detail = detail;
            List<String> strTempSmallList = new ArrayList<>(); // ähnlich generateFields(), aber Strings nicht int !!!
            List<Object> objTempSmallList = new ArrayList<>();
            List<String[]> strTempBigList = new ArrayList<>();
            List<Object[]> objTempBigList = new ArrayList<>();
            String[] btnStrArr = new String[MyViewModel.gridLength * MyViewModel.gridLength];
            Object[] objArr = new Object[MyViewModel.gridLength * MyViewModel.gridLength];
            String[][] bigStringArr = new String[MyViewModel.gridLength][MyViewModel.gridLength];
            bigObjectArr = new Object[MyViewModel.gridLength][MyViewModel.gridLength][8];
            euroMapCopy = euroMap;

            for (int i = 0; i < (MyViewModel.gridLength * MyViewModel.gridLength); i++) {
                List<String> keys = new ArrayList<>(EuroMap.eMap.keySet());                  //Hash keys liste von euromap
                randomKey = keys.get(random.nextInt(keys.size()) & Integer.MAX_VALUE);                      // Zufällig key nehmen
                String flag = (String) (Objects.requireNonNull(EuroMap.eMap.get(String.valueOf(randomKey))))[0];       // Value nehmen aus euromap
                objArr[i] = EuroMap.eMap.get(String.valueOf(randomKey));  //ganzes Array
                btnStrArr[i] = flag;                                 // eindimensionales array besiedeln
                EuroMap.eMap.remove(randomKey);                           // euromap verkleinern (unique Values)
            }
            euroMap = euroMapCopy;
            EuroMap.eMap.clear();

            for (int it = 0; it < (MyViewModel.gridLength * MyViewModel.gridLength); it++) {
                strTempSmallList.add(btnStrArr[it]);
                objTempSmallList.add(objArr[it]);
                //  if(it == 0||it < MyViewModel.gridLength) bigObjectArr[0][it]= (objArr[it]);
                if (it > 0 && mod(it + 1, MyViewModel.gridLength) == 0) {
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
            try {
                for (int i = 0; i < strTempBigList.size(); i++) {
                    for (int j = 0; j < objTempBigList.size(); j++) {
                        bigObjectArr[i][j] = (Object[]) objTempBigList.get(j)[i];
                        String tempStr = (String) bigObjectArr[i][j][0];
                        //btnArr[i][j].setText(tempStr);
                        MyViewModel.emojiArray[i][j] = (String) bigObjectArr[i][j][0];
                        btnArr[i][j].setText(MyViewModel.emojiArray[i][j]);
                    }
                }
            } catch (ArrayIndexOutOfBoundsException aiobe) {
                aiobe.printStackTrace();
            }
            index = 0;
            arrnummer = 0;
        }
        return btnArr;
    }

    public MyEmojiButton[][] generateAfricaFlags(int color) {
        //Flaggenfelder

        AfricaMap africaMapCopy;
        try {
            AfricaMap.getAfricaMap(africaMap);
        } catch (Exception npe) {
            npe.printStackTrace();
        }

        gridMap = new HashMap<>();
        gridArr = new Object[MyViewModel.gridLength][MyViewModel.gridLength];

        //this.detail = detail;
        List<String> strTempSmallList = new ArrayList<>(); // ähnlich generateFields(), aber Strings nicht int !!!
        List<Object> objTempSmallList = new ArrayList<>();
        List<String[]> strTempBigList = new ArrayList<>();
        List<Object[]> objTempBigList = new ArrayList<>();
        String[] btnStrArr = new String[MyViewModel.gridLength * MyViewModel.gridLength];
        Object[] objArr = new Object[MyViewModel.gridLength * MyViewModel.gridLength];
        String[][] bigStringArr = new String[MyViewModel.gridLength][MyViewModel.gridLength];
        bigObjectArr = new Object[MyViewModel.gridLength][MyViewModel.gridLength][5];

        africaMapCopy = africaMap;

        for (int i = 0; i < (MyViewModel.gridLength * MyViewModel.gridLength); i++) {

            ArrayList<String> keys = new ArrayList<>(AfricaMap.africaMap.keySet());                  //Hash keys liste von euromap
            randomKey = keys.get(random.nextInt(keys.size()) & Integer.MAX_VALUE);

            try {
                amiFlag = (String) (Objects.requireNonNull(AfricaMap.africaMap.get(randomKey)))[0];    // Value nehmen aus euromap
            } catch (NullPointerException npe) {
                npe.printStackTrace();
            }
            objArr[i] = AfricaMap.africaMap.get(String.valueOf(randomKey));  //ganzes Array
            btnStrArr[i] = amiFlag;                                 // eindimensionales array besiedeln
            AfricaMap.africaMap.remove(randomKey);                           // euromap verkleinern (unique Values)
        }
        africaMap = africaMapCopy;
        AfricaMap.africaMap.clear();

        for (int it = 0; it < (MyViewModel.gridLength * MyViewModel.gridLength); it++) {
            strTempSmallList.add(btnStrArr[it]);
            objTempSmallList.add(objArr[it]);

            if (it > 0 && mod(it + 1, MyViewModel.gridLength) == 0) {
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
        try {
            for (int i = 0; i < strTempBigList.size(); i++) {
                for (int j = 0; j < objTempBigList.size(); j++) {
                    bigObjectArr[i][j] = (Object[]) objTempBigList.get(j)[i];
                    String tempStr = (String) bigObjectArr[i][j][0];
                    MyViewModel.emojiArray[i][j] = (String) bigObjectArr[i][j][0];
                    btnArr[i][j].setText(MyViewModel.emojiArray[i][j]);

                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        index = 0;
        arrnummer = 0;
        return btnArr;
    }

    public MyEmojiButton[][] generateAmericaFlags(int color) {
        //Flaggenfelder
        if (MyViewModel.gridLength * MyViewModel.gridLength > 25) {
            MyViewModel.titleBarString = MyViewModel.gameMode.setStatus(random.nextBoolean() ? 1 : 3);
            btnArr = generateGameSet(getColorTheme(), gameMode.getDetail());
        } else {
            AmericaMap americaMapCopy;
            try {
                americaMap = AmericaMap.getAmericaMap(americaMap);
                americaMapCopy = americaMap;
            } catch (Exception npe) {
                npe.printStackTrace();
            }

            gridMap = new HashMap<>();
            gridArr = new Object[MyViewModel.gridLength][MyViewModel.gridLength];

            //this.detail = detail;
            List<String> strTempSmallList = new ArrayList<>(); // ähnlich generateFields(), aber Strings nicht int !!!
            List<Object> objTempSmallList = new ArrayList<>();
            List<String[]> strTempBigList = new ArrayList<>();
            List<Object[]> objTempBigList = new ArrayList<>();
            String[] btnStrArr = new String[MyViewModel.gridLength * MyViewModel.gridLength];
            Object[] objArr = new Object[MyViewModel.gridLength * MyViewModel.gridLength];
            String[][] bigStringArr = new String[MyViewModel.gridLength][MyViewModel.gridLength];
            bigObjectArr = new Object[MyViewModel.gridLength][MyViewModel.gridLength][8];

            americaMapCopy = americaMap;

            for (int i = 0; i < (MyViewModel.gridLength * MyViewModel.gridLength); i++) {

                ArrayList<String> keys = new ArrayList<>(AmericaMap.aMap.keySet());                  //Hash keys liste von euromap
                randomKey = keys.get(random.nextInt(keys.size()) & Integer.MAX_VALUE);

                try {
                    amiFlag = (String) (Objects.requireNonNull(AmericaMap.aMap.get(randomKey)))[0];    // Value nehmen aus euromap
                } catch (NullPointerException npe) {
                    npe.printStackTrace();
                }
                objArr[i] = AmericaMap.aMap.get(String.valueOf(randomKey));  //ganzes Array
                btnStrArr[i] = amiFlag;                                 // eindimensionales array besiedeln
                AmericaMap.aMap.remove(randomKey);                           // euromap verkleinern (unique Values)
            }
            americaMap = americaMapCopy;
            AmericaMap.aMap.clear();

            for (int it = 0; it < (MyViewModel.gridLength * MyViewModel.gridLength); it++) {
                strTempSmallList.add(btnStrArr[it]);
                objTempSmallList.add(objArr[it]);
                //  if(it == 0||it < MyViewModel.gridLength) bigObjectArr[0][it]= (objArr[it]);
                if (it > 0 && mod(it + 1, MyViewModel.gridLength) == 0) {
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
            try {
                for (int i = 0; i < strTempBigList.size(); i++) {
                    for (int j = 0; j < objTempBigList.size(); j++) {
                        bigObjectArr[i][j] = (Object[]) objTempBigList.get(j)[i];
                        String tempStr = (String) bigObjectArr[i][j][0];
                        //btnArr[i][j].setText(tempStr);
                        MyViewModel.emojiArray[i][j] = (String) bigObjectArr[i][j][0];
                        btnArr[i][j].setText(MyViewModel.emojiArray[i][j]);

                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
            }

            index = 0;
            arrnummer = 0;
            // startGame();
        }
        return btnArr;

    }

    public MyEmojiButton[][] generateAsiaFlags(int color) {
        //Flaggenfelder

        AsiaMap asiaMapCopy;
        try {
            asiaMap = AsiaMap.getAsiaMap(asiaMap);
            asiaMapCopy = asiaMap;
        } catch (Exception npe) {
            npe.printStackTrace();
        }

        gridMap = new HashMap<>();
        gridArr = new Object[MyViewModel.gridLength][MyViewModel.gridLength];

        //this.detail = detail;
        List<String> strTempSmallList = new ArrayList<>(); // ähnlich generateFields(), aber Strings nicht int !!!
        List<Object> objTempSmallList = new ArrayList<>();
        List<String[]> strTempBigList = new ArrayList<>();
        List<Object[]> objTempBigList = new ArrayList<>();
        String[] btnStrArr = new String[MyViewModel.gridLength * MyViewModel.gridLength];
        Object[] objArr = new Object[MyViewModel.gridLength * MyViewModel.gridLength];
        String[][] bigStringArr = new String[MyViewModel.gridLength][MyViewModel.gridLength];
        bigObjectArr = new Object[MyViewModel.gridLength][MyViewModel.gridLength][5];

        asiaMapCopy = asiaMap;

        for (int i = 0; i < (MyViewModel.gridLength * MyViewModel.gridLength); i++) {

            ArrayList<String> keys = new ArrayList<>(AsiaMap.asiaMap.keySet());                  //Hash keys liste von euromap
            randomKey = keys.get(random.nextInt(keys.size()) & Integer.MAX_VALUE);

            try {
                amiFlag = (String) (Objects.requireNonNull(AsiaMap.asiaMap.get(randomKey)))[0];    // Value nehmen aus euromap
            } catch (NullPointerException npe) {
                npe.printStackTrace();
            }
            objArr[i] = AsiaMap.asiaMap.get(String.valueOf(randomKey));  //ganzes Array
            btnStrArr[i] = amiFlag;                                 // eindimensionales array besiedeln
            AsiaMap.asiaMap.remove(randomKey);                           // euromap verkleinern (unique Values)
        }
        asiaMap = asiaMapCopy;
        AsiaMap.asiaMap.clear();

        for (int it = 0; it < (MyViewModel.gridLength * MyViewModel.gridLength); it++) {
            strTempSmallList.add(btnStrArr[it]);
            objTempSmallList.add(objArr[it]);
            //  if(it == 0||it < MyViewModel.gridLength) bigObjectArr[0][it]= (objArr[it]);
            if (it > 0 && mod(it + 1, MyViewModel.gridLength) == 0) {
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
        try {
            for (int i = 0; i < strTempBigList.size(); i++) {
                for (int j = 0; j < objTempBigList.size(); j++) {
                    bigObjectArr[i][j] = (Object[]) objTempBigList.get(j)[i];
                    String tempStr = (String) bigObjectArr[i][j][0];
                    //btnArr[i][j].setText(tempStr);
                    MyViewModel.emojiArray[i][j] = (String) bigObjectArr[i][j][0];
                    btnArr[i][j].setText(MyViewModel.emojiArray[i][j]);

                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        index = 0;
        arrnummer = 0;

        return btnArr;
    }

    public void func_a1(View v) {
        knopfNummer = 100;

        switch (MyViewModel.gameMode.getStatus()) {
            case 1:
                Snackbar.make(layout, getString(R.string.zahlenspiel),
                        LENGTH_INDEFINITE).show();
                break;
            case 2:
            case 7:
                Snackbar.make(layout, getString(R.string.landesflaeche),
                        LENGTH_INDEFINITE).show();
                break;
            case 3:
                Snackbar.make(layout, getString(R.string.bruchspiel),
                        LENGTH_INDEFINITE).show();
                break;
            case 4:
            case 8:
                Snackbar.make(layout, getString(R.string.einwohnerzahl),
                        LENGTH_INDEFINITE).show();
                break;
            case 5:
            case 6:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:

                snackBarShow();
                break;
        }
        playNumbers();

    }


    public void func_a2(View v) {
        knopfNummer = 101;
        //messageBox = new MyMsgBox(getActivity(), 800, Gravity.BOTTOM);
        playNumbers();
    }

    public void func_a3(View v) {
        knopfNummer = 102;
        playNumbers();
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
        playNumbers();

    }

    public void func_b2(View v) {
        knopfNummer = 111;
        playNumbers();
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
        switch (MyViewModel.gameMode.getStatus()) {
            case 1:
                Snackbar.make(layout, "Tippe auf die größere Ziffer/Zahl",
                        2000).show();
                break;
            case 2:
                Snackbar.make(layout, getResources().getString(R.string.landesflaeche),
                        2000).show();
                break;
            case 3:
                Snackbar.make(layout, "Tippe auf den größeren Bruck",
                        2000).show();
                break;
            case 4:
                Snackbar.make(layout, getResources().getString(R.string.einwohnerzahl),
                        2000).show();
                break;
            case 5:
                Snackbar.make(layout, getResources().getString(R.string.landesname),
                        2000).show();
                break;
            case 6:
                Snackbar.make(layout, getResources().getString(R.string.landeshauptstadt),
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
        switch (MyViewModel.gameMode.getStatus()) {
            case 1:
            case 3:
                if (btnArr[arrnummer + 1][index].getCurrentTextColor() != (RED)) {
                    btnArr[arrnummer + 1][index].setTextColor(BLACK);
                }
                btnArr[arrnummer + 1][index].setBackgroundColor(WHITE);
                btnArr[arrnummer][index].setBackgroundColor(WHITE);             //todo mache die alten Felder WHITE, sieht eleganter aus...
                btnArr[arrnummer][index + 1].setTextColor(GREEN);

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
            case 11:
            case 12:
            case 13:
            case 14:
                if (btnArr[arrnummer + 1][index].getBackground() != redDrawable) {
                    btnArr[arrnummer + 1][index].setBackgroundColor(WHITE);
                }
                btnArr[arrnummer][index + 1].setBackgroundColor(GREEN);
                indexScroll();
                index++;
                activateButtons();
                break;
        }
    }

    void arrnummerStep() {
        animIndex.stop();
        animArrnummer.stop();
        switch (MyViewModel.gameMode.getStatus()) {
            case 1:
            case 3:
                if (btnArr[arrnummer][index + 1].getCurrentTextColor() != (RED)) {
                    btnArr[arrnummer][index + 1].setTextColor(BLACK);
                }
                btnArr[arrnummer + 1][index].setTextColor(GREEN);

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
            case 11:
            case 12:
            case 13:
            case 14:
                if (btnArr[arrnummer][index + 1].getBackground() != redDrawable) {
                    btnArr[arrnummer][index + 1].setBackgroundColor(WHITE);
                }
                btnArr[arrnummer + 1][index].setBackgroundColor(GREEN);
                arrnummer++;
                activateButtons();
                break;
        }
    }

    void indexEndsIt() {
        animIndex.stop();
        animArrnummer.stop();
        switch (MyViewModel.gameMode.getStatus()) {
            case 1:
            case 3:
                btnArr[arrnummer][index].setTextColor(GREEN);

                btnArr[arrnummer][index].setBackgroundColor(WHITE);
                for (int i = arrnummer; i < MyViewModel.gridLength; i++) {
                    btnArr[i][index].setTextColor(GREEN);
                    btnArr[i][index].setBackgroundColor(getResources().getColor(R.color.Blau_Hintergrund));
                }
                MyViewModel.gridLength++;
                MyViewModel.emojiArray = new String[MyViewModel.gridLength][MyViewModel.gridLength];
                index = 0;
                arrnummer = 0;
                knopfNummerAlt = 100;
                MyViewModel.titleBarString = MyViewModel.gameMode.setStatus(randomWithRange(1, 14));
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
            case 11:
            case 12:
            case 13:
            case 14:
                btnArr[arrnummer][index].setBackgroundColor(GREEN);       // todo Abstürze verhindern wenn americaMap MyViewModel.gridLength >= 6
                for (int i = arrnummer; i < MyViewModel.gridLength; i++) {                  //todo brueche bei MyViewModel.gridLength 3 passen nicht immer in buttons
                    btnArr[i][index].setBackgroundColor(GREEN);

                }
                MyViewModel.gridLength++;
                MyViewModel.emojiArray = new String[gridLength][gridLength];
                index = 0;
                arrnummer = 0;
                knopfNummerAlt = 100;
                MyViewModel.titleBarString = MyViewModel.gameMode.setStatus(randomWithRange(1, 14));
                mainfragment = MainFragment.newInstance();
                break;
        }
        if (MyViewModel.gridLength == 7) {
            MyViewModel.gridLength = 4;
            MyViewModel.titleBarString = MyViewModel.gameMode.setStatus(randomWithRange(1, 14));
        }

        FragmentTransaction transaction = getFragmentManager().beginTransaction();
        transaction.replace(R.id.container, mainfragment);
        transaction.addToBackStack(null);
        transaction.commit();
    }

    void arrnummerEndsIt() {
        animIndex.stop();
        animArrnummer.stop();
        switch (MyViewModel.gameMode.getStatus()) {
            case 1:
            case 3:
                btnArr[arrnummer][index].setTextColor(GREEN);

                btnArr[arrnummer][index].setBackgroundColor(WHITE);
                for (int i = arrnummer; i < MyViewModel.gridLength; i++) { //TODO: testing
                    btnArr[arrnummer][i].setTextColor(GREEN);
                    btnArr[arrnummer][i].setBackgroundColor(getResources().getColor(R.color.Blau_Hintergrund));
                    indexScroll();
                }

                MyViewModel.gridLength++;
                MyViewModel.emojiArray = new String[MyViewModel.gridLength][MyViewModel.gridLength];
                index = 0;
                arrnummer = 0;
                knopfNummerAlt = 100;
                MyViewModel.titleBarString = MyViewModel.gameMode.setStatus(randomWithRange(1, 14));
                break;
            case 2:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
                btnArr[arrnummer][index].setBackgroundColor(GREEN);
                for (int i = arrnummer; i < MyViewModel.gridLength; i++) {
                    btnArr[arrnummer][i].setBackgroundColor(GREEN);
                    indexScroll();
                }
                MyViewModel.gridLength++;
                MyViewModel.emojiArray = new String[MyViewModel.gridLength][MyViewModel.gridLength];
                index = 0;
                arrnummer = 0;
                knopfNummerAlt = 100;
                MyViewModel.titleBarString = MyViewModel.gameMode.setStatus(randomWithRange(1, 14));
                break;
        }
        if (MyViewModel.gridLength == 7) {
            MyViewModel.gridLength = 4;
            MyViewModel.titleBarString = MyViewModel.gameMode.setStatus(randomWithRange(1, 14));
        }

        mainfragment = MainFragment.newInstance();
        FragmentTransaction transaction = getFragmentManager().beginTransaction();
        transaction.replace(R.id.container, mainfragment);
        transaction.addToBackStack(null);
        transaction.commit();
    }


    void playNumbers() {// an detail denken !!

        switch (MyViewModel.gameMode.getStatus()) {    //Zahlenspiele 0-10 ... 0-1000000
            case 1: {

                try {
                    if (index == MyViewModel.gridLength - 1) {
                        indexEndsIt();

                    } else if (arrnummer == MyViewModel.gridLength - 1) {
                        arrnummerEndsIt();
                    } else if (bigArr[arrnummer][index + 1] > bigArr[arrnummer + 1][index]) {
                        if (knopfNummer - knopfNummerAlt == 1) {
                            indexStep();
                            getReaction((byte) 1);
                        } else {
                            animArrnummer.stop();
                            btnArr[arrnummer + 1][index].setTextColor(RED);   //TODO editieren ... bei Fehler weiterspringen
                            getReaction((byte) 0);
                           // reverseKnopfnummer(); //TODO Zeile wurde als 2. auskommentiert
                            indexStep(); //TODO Zeile wurde hinzugefügt
                        }
                    } else if (bigArr[arrnummer + 1][index] > bigArr[arrnummer][index + 1]) {
                        if (knopfNummer - knopfNummerAlt == 10) {
                            arrnummerStep();
                            getReaction((byte) 1);
                        } else {
                            animIndex.stop();
                            btnArr[arrnummer][index + 1].setTextColor(RED);
                            getReaction((byte) 0);
                          //  reverseKnopfnummer(); //TODO Zeile wurde als 2. auskommentiert
                            arrnummerStep(); //TODO Zeile wurde hinzugefügt
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

                    if (index == MyViewModel.gridLength - 1) {
                        indexEndsIt();

                    } else if (arrnummer == MyViewModel.gridLength - 1) {
                        arrnummerEndsIt();
                    } else if ((double) (bigObjectArr[arrnummer][index + 1][1]) > (double) (bigObjectArr[arrnummer + 1][index][1])) {
                        if (knopfNummer - knopfNummerAlt == 1) {
                            indexStep();
                            getReaction((byte) 1);
                            knopfNummerAlt_lc++;

                        } else {
                            animArrnummer.stop();
                            btnArr[arrnummer + 1][index].setTextColor(RED);
                            getReaction((byte) 0);
                           // reverseKnopfnummer(); //TODO Zeile wurde als 2. auskommentiert
                            indexStep(); //TODO Zeile wurde hinzugefügt
                        }
                    } else if ((double) bigObjectArr[arrnummer + 1][index][1] > (double) bigObjectArr[arrnummer][index + 1][1]) {
                        if (knopfNummer - knopfNummerAlt == 10) {
                            arrnummerStep();
                            getReaction((byte) 1);
                            knopfNummerAlt_lc += 10;
                        } else {
                            animIndex.stop();
                            btnArr[arrnummer][index + 1].setTextColor(RED);
                            getReaction((byte) 0);
                           // reverseKnopfnummer(); //TODO Zeile wurde als 2. auskommentiert
                            arrnummerStep(); //TODO Zeile wurde hinzugefügt
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
            case 8:

                //Snackbar.make(layout, getResources().getString(R.string.einwohnerzahl), Snackbar.LENGTH_LONG).show();
                try {
                    //  Toast.makeText(getActivity(), bigObjectArr[arrnummer][index+1][1]+" "+bigObjectArr[arrnummer][index+1][detail]+" | "+bigObjectArr[arrnummer+1][index][1]+" "+bigObjectArr[arrnummer+1][index][detail], Toast.LENGTH_LONG).show();
                    if (index == MyViewModel.gridLength - 1) {
                        indexEndsIt();

                    } else if (arrnummer == MyViewModel.gridLength - 1) {
                        arrnummerEndsIt();
                    } else if ((int) (bigObjectArr[arrnummer][index + 1][gameMode.getDetail()]) > (int) (bigObjectArr[arrnummer + 1][index][gameMode.getDetail()])) {
                        if (knopfNummer - knopfNummerAlt == 1) {
                            indexStep();
                            getReaction((byte) 1);
                            knopfNummerAlt_lc++;

                        } else {
                            animArrnummer.stop();
                            btnArr[arrnummer + 1][index].setBackground(redDrawable);
                            getReaction((byte) 0);
                            //reverseKnopfnummer(); //TODO Zeile wurde als 2. auskommentiert
                            indexStep(); //TODO Zeile wurde hinzugefügt
                        }
                    } else if ((int) bigObjectArr[arrnummer + 1][index][gameMode.getDetail()] > (int) bigObjectArr[arrnummer][index + 1][gameMode.getDetail()]) {
                        if (knopfNummer - knopfNummerAlt == 10) {
                            arrnummerStep();
                            getReaction((byte) 1);
                            knopfNummerAlt_lc += 10;
                        } else {
                            animIndex.stop();
                            btnArr[arrnummer][index + 1].setBackground(redDrawable);
                            getReaction((byte) 0);
                            // reverseKnopfnummer(); //TODO Zeile wurde als 2. auskommentiert
                            arrnummerStep(); //TODO Zeile wurde hinzugefügt
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
            case 11:
            case 12:
            case 13:
            case 14:
                try {
                    //  Toast.makeText(getActivity(), bigObjectArr[arrnummer][index+1][1]+" "+bigObjectArr[arrnummer][index+1][detail]+" | "+bigObjectArr[arrnummer+1][index][1]+" "+bigObjectArr[arrnummer+1][index][detail], Toast.LENGTH_LONG).show();
                    if (knopfNummer != 100) {
                        if (index == MyViewModel.gridLength - 1) {
                            indexEndsIt();

                        } else if (arrnummer == MyViewModel.gridLength - 1) {
                            arrnummerEndsIt();
                        } else if (checkStr == bigObjectArr[arrnummer][index + 1][gameMode.getDetail()]) {
                            if (knopfNummer - knopfNummerAlt == 1) {
                                indexStep();
                                getReaction((byte) 1);
                                knopfNummerAlt = knopfNummer;  ///gestestet hier
                                knopfNummerAlt_lc++;
                                checkStr = getSnackbarInfo();
                            } else {
                                animArrnummer.stop();
                                btnArr[arrnummer + 1][index].setBackground(redDrawable);
                                getReaction((byte) 0);
                                //reverseKnopfnummer(); //TODO Zeile wurde als 2. auskommentiert
                                indexStep(); //TODO Zeile wurde hinzugefügt
                                checkStr = getSnackbarInfo();
                            }
                        } else if (checkStr == bigObjectArr[arrnummer + 1][index][gameMode.getDetail()]) {
                            if (knopfNummer - knopfNummerAlt == 10) {
                                arrnummerStep();
                                getReaction((byte) 1);
                                knopfNummerAlt = knopfNummer;    ///gestestet hier
                                knopfNummerAlt_lc += 10;
                                checkStr = getSnackbarInfo();
                            } else {
                                animIndex.stop();
                                btnArr[arrnummer][index + 1].setBackground(redDrawable);
                                getReaction((byte) 0);
                                //reverseKnopfnummer();  //TODO Zeile wurde als 2. auskommentiert
                                arrnummerStep(); //TODO Zeile wurde hinzugefügt
                                checkStr = getSnackbarInfo();
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

        if (index < MyViewModel.gridLength - 1) {

            animIndex = new ButtonColorAnimatorIndex(btnArr[arrnummer][index + 1]);
            animIndex.invokeColor(btnArr[arrnummer][index + 1]);

            invokeBackground(btnArr[arrnummer][index + 1]);

        } else {
            indexEndsIt();
        }
        if (arrnummer < MyViewModel.gridLength - 1) {
            animArrnummer = new ButtonColorAnimatorArrnummer(btnArr[arrnummer + 1][index]);
            animArrnummer.invokeColor(btnArr[arrnummer + 1][index]);

            invokeBackground(btnArr[arrnummer + 1][index]);
        } else {
            arrnummerEndsIt();
        }

    }

    public void resetColors() {
        switch (MyViewModel.gameMode.getStatus()) {
            case 1:
            case 3:
                for (int i = 0; i < MyViewModel.gridLength; i++) {
                    for (int e = 0; e < MyViewModel.gridLength; e++) {
                        btnArr[i][e].setTextColor(BLACK);
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
            case 11:
            case 12:
            case 13:
            case 14:

                for (int i = 0; i < gridLength; i++) {
                    for (int e = 0; e < gridLength; e++) {
                        btnArr[i][e].setBackgroundColor(getResources().getColor(R.color.Grau_Hintergrund));
                    }
                }
                break;

        }
        btnArr[0][0].setText(R.string.gameinfo);
        btnArr[0][0].setTextColor(GREEN);
    }

    public void snackBarShow() {

        switch (MyViewModel.gameMode.getStatus()) {
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
            case 11:
            case 12:
            case 13:
            case 14:
                checkStr = getSnackbarInfo();
                break;
        }
        //playNumbers();
        //Toast.makeText(getActivity(), "Arrnummer: " + arrnummer + " Index: " + index + " bigArrLength: " + bigArr.length, Toast.LENGTH_SHORT).show();
    }

    public static int randomWithRange(int min, int max) {
        int range = (max - min) + 1;
        return (int) (random() * range) + min;
    }

    String punkteOut(int punkte) {
        if (punkte == 0) return punkte + " Punkte";
        else if (punkte < 2) return punkte + " Punkt";
        else return punkte + " Punkte";
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
        switch (MyViewModel.gameMode.getStatus()) {
            case 1:
            case 3:
            case 2:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
                if (btn.getCurrentTextColor() != (Color.RED)) {
                    btn.setBackgroundColor(getResources().getColor(R.color.Blau_Aktiv));
                }
        }
    }

    public void showRangeDialog() {

        final AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
        // Set the alert dialog title
        builder.setTitle("Zahlenmenge");

        final String[] zahlenauswahl = new String[]{
                "Frieda",                        // gameMode =1
                "0 - 100",
                "0 - 1000",
                "0 - 10000",
                "0 - 1000000",
                "Brueche",                       // gameMode =
                "Europas-Länder-Fläche",         // erste
                "Europas-Länder-Einwohner",
                "Europas-Länder-Namen",
                "Europas-Länder-Hauptstädte",
                "Amerikas-Länder-Fläche",         // erste
                "Amerikas-Länder-Einwohner",
                "Amerikas-Länder-Namen",
                "Amerikas-Länder-Hauptstädte",
                "Asiens-Länder-Namen",
                "Asiens-Länder-Hauptstädte",
                "Afrikas-Länder-Namen",
                "Afrikas-Länder-Hauptstädte"
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
                                MyViewModel.titleBarString = MyViewModel.gameMode.setStatus(1);
                                numberMin = 1;
                                numberMax = 10;
                                break;
                            case 1:
                                MyViewModel.titleBarString = MyViewModel.gameMode.setStatus(1);
                                numberMin = 1;
                                numberMax = 100;
                                break;
                            case 2:
                                MyViewModel.titleBarString = MyViewModel.gameMode.setStatus(1);
                                numberMin = 1;
                                numberMax = 1000;
                                break;
                            case 3:
                                MyViewModel.titleBarString = MyViewModel.gameMode.setStatus(1);
                                numberMin = 1;
                                numberMax = 10000;
                                break;
                            case 4:
                                MyViewModel.titleBarString = MyViewModel.gameMode.setStatus(1);        // Todo generierte addition,subtraktion, multiplikation an dieser Stelle
                                numberMin = 1;
                                numberMax = 99999;
                                break;
                            case 5:
                                MyViewModel.titleBarString = MyViewModel.gameMode.setStatus(3);       // Brüche
                                numberMin = 1;
                                numberMax = 100;
                                break;
                            case 6:
                                MyViewModel.titleBarString = MyViewModel.gameMode.setStatus(2);        // Euroländer Flächen
                                break;
                            case 7:
                                MyViewModel.titleBarString = MyViewModel.gameMode.setStatus(4);          // Euroländer Einwohner
                                break;
                            case 8:
                                MyViewModel.titleBarString = MyViewModel.gameMode.setStatus(5);      // Euroländer Flagge zu Land
                                break;
                            case 9:
                                MyViewModel.titleBarString = MyViewModel.gameMode.setStatus(6);        // EuroLänder Hauptstädte
                                break;
                            case 10:
                                MyViewModel.titleBarString = MyViewModel.gameMode.setStatus(7);     //Flächen
                                break;
                            case 11:
                                MyViewModel.titleBarString = MyViewModel.gameMode.setStatus(8);           //Einwohner
                                break;
                            case 12:
                                MyViewModel.titleBarString = MyViewModel.gameMode.setStatus(9);        //Flagge zu Land
                                break;
                            case 13:
                                MyViewModel.titleBarString = MyViewModel.gameMode.setStatus(10);      //Hauptstädte
                                break;
                            case 14:
                                MyViewModel.titleBarString = MyViewModel.gameMode.setStatus(11);  // Asienländer Flagge zu Land
                                break;
                            case 15:
                                MyViewModel.titleBarString = MyViewModel.gameMode.setStatus(12);// Asienländer Hauptstädte
                            case 16:
                                MyViewModel.titleBarString = MyViewModel.gameMode.setStatus(13);  // Asienländer Flagge zu Land
                                break;
                            case 17:
                                MyViewModel.titleBarString = MyViewModel.gameMode.setStatus(14);// Asienländer Hauptstädte

                        }

                        dialogInterface.dismiss();
                        animIndex.stop();
                        animArrnummer.stop();

                        btnArr = generateGameSet(color, gameMode.getDetail());
                        resetColors();
                        resetValues();
                        horizontalScrollView.scrollTo(0, 0);
                        startGame();

                    }
                });

        AlertDialog dialog = builder.create();
        dialog.show();
    }

    public void getReaction(byte result) {

        if (trueMap == null || trueMap.size() == 1) {
            generateTrueReactionMaps();

        }
        if (falseMap == null || falseMap.size() == 1) {
            generateFalseReactionMaps();

        }
        switch (result) {
            case 0:
                soundLogic(false);
                List<String> falseKeys = new ArrayList<>(falseMap.keySet());                  //Hash keys liste von euromap
                randomKey = falseKeys.get(random.nextInt(falseKeys.size()) & Integer.MAX_VALUE);                      // Zufällig key nehmen
                retStr = falseMap.get(String.valueOf(randomKey));       // Value nehmen aus euromap
                falseMap.remove(randomKey);
                break;
            case 1:
                soundLogic(true);
                List<String> trueKeys = new ArrayList<>(trueMap.keySet());                  //Hash keys liste von euromap
                randomKey = trueKeys.get(random.nextInt(trueKeys.size()) & Integer.MAX_VALUE);                      // Zufällig key nehmen
                retStr = trueMap.get(String.valueOf(randomKey));       // Value nehmen aus euromap
                trueMap.remove(randomKey);
                break;
        }


        if (messageBox == null) {
            messageBox = new MyMsgBox(getActivity(), 400, Gravity.BOTTOM);
            messageBox.show(retStr);
        } else {
            messageBox.show(retStr + "");
        }
    }

    public void generateTrueReactionMaps() {

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

        trueMap.put("0", true_sonne);
        trueMap.put("1", true_cool);
        trueMap.put("2", true_highfive);
        trueMap.put("3", true_daumenhoch);
        trueMap.put("4", true_hangloose);
        trueMap.put("5", true_ass);
        trueMap.put("6", true_doppelhaende);
        trueMap.put("7", true_fuchs);
        trueMap.put("8", true_applaus);
        trueMap.put("9", true_victory);
        trueMap.put("10", true_ok);
        trueMap.put("11", true_hundert);
        trueMap.put("12", true_supermann);
        trueMap.put("13", true_superfrau);
        trueMap.put("14", true_gluehbirne);
        trueMap.put("15", true_delfin);
        trueMap.put("16", true_stark);
        trueMap.put("17", true_brain);
        trueMap.put("18", true_shakehands);
        trueMap.put("19", true_nerd);
        trueMap.put("20", true_dartscheibe);
        trueMap.put("21", true_taenzer);
        trueMap.put("22", true_taenzerin);
    }

    public void generateFalseReactionMaps() {

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

        falseMap.put("0", false_rotfl);
        falseMap.put("1", false_augenbrauen);
        falseMap.put("2", false_pinoccio);
        falseMap.put("3", false_notamused);
        falseMap.put("4", false_rollendeaugen);
        falseMap.put("5", false_monokkel);
        falseMap.put("6", false_pst);
        falseMap.put("7", false_betrunken);
        falseMap.put("8", false_keinmund);
        falseMap.put("9", false_spiralaugen);
        falseMap.put("10", false_verwirrt);
        falseMap.put("11", false_schlafweiter);
        falseMap.put("12", false_kopfexplodiert);
        falseMap.put("13", false_fluchen);
        falseMap.put("14", false_heulen);
        falseMap.put("15", false_dampfablassen);
        falseMap.put("16", false_facepalm);
        falseMap.put("17", false_zombie);
        falseMap.put("18", false_uebelkeit);
        falseMap.put("19", false_kotzen);
    }


    int getColorTheme() {
        switch (MyViewModel.gameMode.getStatus()) {
            case 1:
                Bitmap bitmap = BitmapFactory.decodeResource(getActivity().getResources(), R.drawable.zahlenbackgrnd);
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
            case 11:
            case 12:
            case 13:
            case 14:
                //color = (getResources().getColor(R.color.Grau_Hintergrund));
                break;
        }
        layout.setBackgroundDrawable(new BitmapDrawable(bitmap));
        return color;
    }

    void playLongClicked() {

        switch (MyViewModel.gameMode.getStatus()) {    //Flaggenspiel Fläche
            case 2:
            case 7: {
                try {
                    if (knopfNummer_lc - knopfNummerAlt_lc == 1) {
                        Toast.makeText(getActivity(), bigObjectArr[arrnummer][index + 1][1] + ", " + getString(R.string.ask_landesflaeche) + readableNumbers((int) bigObjectArr[arrnummer][index + 1][gameMode.getDetail()]) + getString(R.string.ask_landesflaeche_einheit), LENGTH_LONG).show();
                    } else if (knopfNummer_lc - knopfNummerAlt_lc == 10) {
                        Toast.makeText(getActivity(), bigObjectArr[arrnummer + 1][index][1] + ", " + getString(R.string.ask_landesflaeche) + readableNumbers((int) bigObjectArr[arrnummer + 1][index][gameMode.getDetail()]) + getString(R.string.ask_landesflaeche_einheit), LENGTH_LONG).show();
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
            case 8: {

                try {
                    if (knopfNummer_lc - knopfNummerAlt_lc == 1) {
                        Toast.makeText(getActivity(), bigObjectArr[arrnummer][index + 1][1] + ", " + getString(R.string.ask_einwohnerzahl) + readableNumbers((int) bigObjectArr[arrnummer][index + 1][gameMode.getDetail()]) + getString(R.string.ask_einwohnerzahl_einheit), LENGTH_LONG).show();
                    } else if (knopfNummer_lc - knopfNummerAlt_lc == 10) {
                        Toast.makeText(getActivity(), bigObjectArr[arrnummer + 1][index][1] + ", " + getString(R.string.ask_einwohnerzahl) + readableNumbers((int) bigObjectArr[arrnummer + 1][index][gameMode.getDetail()]) + getString(R.string.ask_einwohnerzahl_einheit), LENGTH_LONG).show();
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

    public String getSnackbarInfo() {
        String randomContriesStr = randomCountries();
        switch (MyViewModel.gameMode.getStatus()) {
            case 5:
            case 9:
            case 11:
            case 13:
                Snackbar.make(layout, getString(R.string.landesname) + randomContriesStr, LENGTH_INDEFINITE).show();
                break;
            case 6:
            case 10:
            case 12:
            case 14:
                Snackbar.make(layout, getString(R.string.landeshauptstadt) + randomContriesStr, LENGTH_INDEFINITE).show();
                break;
        }
        return randomContriesStr;
    }

    public String randomCountries() {
        random_num = randomWithRange(0, 1);
        String[] strArr = {String.valueOf(bigObjectArr[arrnummer][index + 1][gameMode.getDetail()]), String.valueOf(bigObjectArr[arrnummer + 1][index][gameMode.getDetail()])};
        return strArr[random_num];
    }

    public String readableNumbers(int inputInt) {
        // return String.format("%,d", inputInt);
        return String.format(getLocale(), "%,d", inputInt);
    }

    public Locale getLocale() {
        Locale locale = getResources().getConfiguration().locale;
        return locale;
    }

    public void indexScroll() {
        curX += btnArr[arrnummer][index + 1].getWidth();
        valueX += btnArr[arrnummer][index + 1].getWidth();
        // curX += buttonWidth;
        // valueX += buttonWidth;
        curY = 0;
        ObjectAnimator animator = ObjectAnimator.ofInt(horizontalScrollView, "scrollX", valueX);
        animator.setDuration(800);
        animator.start();
    }


    // todo scroll the whole time
    // todo try to use arrayadapter for gridview and scroll endlessly
    // todo try to change gamemodes on the fly (controlled by Runnable ??)
    // todo try to animate helicopter, to force player to hurry up on x - axis
    // todo try to introduce wayyyy more fun-gamemodes : reaction...
    // todo try to introduce bombing

    public void testIndexScroll(int dur) {
        curX += (btnArr[arrnummer][index + 1].getWidth() * MyViewModel.gridLength);
        valueX += (btnArr[arrnummer][index + 1].getWidth() * MyViewModel.gridLength);
        // curX += buttonWidth;
        // valueX += buttonWidth;
        curY = 0;
        ObjectAnimator animator = ObjectAnimator.ofInt(horizontalScrollView, "scrollX", valueX);
        animator.setDuration(dur);
        animator.start();
        //horizontalScrollView.scrollBy((int) (curX), (int) (curY));
        float mx = curX;
        float my = curY;
    }

    private static void setButtonWidth(Context context) {
        WindowManager wm = (WindowManager) context.getSystemService(Context.WINDOW_SERVICE);
        Display display = wm.getDefaultDisplay();
        DisplayMetrics metrics = new DisplayMetrics();
        display.getMetrics(metrics);
        int width = metrics.widthPixels;
        int height = metrics.heightPixels;
        //  int dividend = 556, divisor = 9;
        //  int quotient = dividend / divisor;
        //  int remainder = dividend % divisor;
        switch (MyViewModel.gameMode.getStatus()) {
            case 1:
            case 2:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
                //buttonWidth = width /4;
                buttonWidth = width / MyViewModel.gridLength;
                buttonHeight = (buttonWidth * 3) / 4;
                emojiSize = (buttonHeight * 3) / 12;
                break;
            case 3:
                buttonWidth = width / MyViewModel.gridLength;
                buttonHeight = (buttonWidth * 3) / 4;
                emojiSize = (buttonHeight * 3) / 15;

        }
    }

    void startGame() {

        resetValues();    // arrnumber auf 0 und index auf 0
        resetColors();

           
        btnArr[0][0].setBackgroundColor(GREEN);
        btnArr[0][0].setTextColor(Color.BLACK);
        btnArr[0][0].setText(getString(R.string.gameinfo));
        getActivity().setTitle(MyViewModel.titleBarString);
        setButtonWidth(getActivity());
        if(animIndex!=null) animIndex.stop();
        if(animArrnummer!=null) animArrnummer.stop();
        animIndex = new ButtonColorAnimatorIndex(btnArr[arrnummer][index + 1]);
        animArrnummer = new ButtonColorAnimatorArrnummer(btnArr[arrnummer][index + 1]);
        animIndex.invokeColorBackgroundAnimationIndex(btnArr[arrnummer][index + 1]);
        animArrnummer.invokeColorBackgroundAnimationArrnummer(btnArr[arrnummer + 1][index]);
        btnArr[arrnummer][index + 1].setBackgroundColor(getResources().getColor(R.color.Blau_Aktiv));
        btnArr[arrnummer + 1][index].setBackgroundColor(getResources().getColor(R.color.Blau_Aktiv));
        generateSoundLists();
        snackBarShow();

    }
    public void soundLogic(final boolean answer){
        if(answer){

            badItr = badSoundsList.listIterator(0);

            if (goodItr.hasNext()){
                loadAndplaySound((Integer) goodItr.next());  // ListIterator.next() bekommt das audio file
            }else {
                goodItr = goodSoundsList.listIterator(0);
                loadAndplaySound((Integer) goodItr.next());
            }
        } else {

            goodItr = goodSoundsList.listIterator(0);

            if(badItr.hasNext()){
                loadAndplaySound((Integer) badItr.next());  /** soundArr hat 15 indexstellen, badSoundsList.size() == 8 !! **/
            } else {
                badItr = badSoundsList.listIterator(0);
                loadAndplaySound((Integer) badItr.next());
            }
        }
    }

    public void loadAndplaySound(final int soundInt) {

        Runnable playRightSoundRunnable = new Runnable() {
            @Override
            public void run() {
                mSound.play(soundArr[soundInt], 1.0f, 1.0f, 1, 0, 1.0f);
            }
        };

            ExecutorService executorService = Executors.newSingleThreadExecutor();
            Future runningTaskFuture = executorService.submit(playRightSoundRunnable);
            playRightSoundRunnable.run();
            runningTaskFuture.cancel(true);
    }

    void generateSoundLists() {
        int temp = soundArr[randomWithRange(0, 7)];
        goodSoundsList.add(temp);
        goodSoundsList.add(temp);
        goodSoundsList.add(soundArr[randomWithRange(0, 7)]);
        goodSoundsList.add(soundArr[randomWithRange(0, 7)]);
        goodSoundsList.add(soundArr[randomWithRange(0, 7)]);
        goodSoundsList.add(soundArr[randomWithRange(0, 7)]);
        goodSoundsList.add(soundArr[randomWithRange(0, 7)]);
        goodSoundsList.add(soundArr[randomWithRange(0, 7)]);
        goodItr = goodSoundsList.listIterator(0);

        temp = soundArr[randomWithRange(8, 15)];
        badSoundsList.add(temp);
        badSoundsList.add(temp);
        badSoundsList.add(soundArr[randomWithRange(8, 15)]);
        badSoundsList.add(soundArr[randomWithRange(8, 15)]);
        badSoundsList.add(soundArr[randomWithRange(8, 15)]);
        badSoundsList.add(soundArr[randomWithRange(8, 15)]);
        badSoundsList.add(soundArr[randomWithRange(8, 15)]);
        badSoundsList.add(soundArr[randomWithRange(8, 15)]);
        badItr = badSoundsList.listIterator(0);

    }

}