package net.juntermanns.mybuttons;

import android.Manifest;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.support.v4.app.ActivityCompat;
import android.support.v4.app.Fragment;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.GridLayout;
import android.widget.TextView;
import android.widget.Toast;

import net.juntermanns.mybuttons.ui.main.MainFragment;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

import static net.juntermanns.mybuttons.ui.main.MainFragment.randomWithRange;

public class MainActivity extends AppCompatActivity {

    TextView countDown;
    // ReverseChronometer rc;

    private int[] tempArr;
    private List<Integer> tempSmallList;

    int knopfNummer;
    int knopfNummerAlt = 100;
    long remainSec = 120L;
    long warnSec = 10L;
    int number;
    int[][] bigArr;

    public MyEmojiButton[][] btnArr;
    private int[] valueArr;

    int punkte = 0;
    String selectedItem;
    int index = 0;
    int arrnummer = 0;

   // int numberMin;
   // int numberMax;

    long oldLevelResult = 0L;
    ActionBar toolbar;
    Map<String, Object[]> euroMap;
    Map<String, Object[]> euroMapCopy;
    Map<String, Object[]> gridMap;
    Object[][] gridArr;
    // ObjectAnimator colorAnim = null;
    // ObjectAnimator colorAnim2 = null;
    ButtonColorAnimatorIndex animIndex;
    ButtonColorAnimatorArrnummer animArrnummer;
    private Context mContext;

    public GridLayout mCLayout;
    private Intent nextIntent;
    //Integer sizedummy;
    Map<String, String> intToStringRangeMap = new HashMap<>();
    Random random = new Random();
    String randomKey;
    boolean europeGameMode;
    //Object view;
    ColorDrawable redDrawable;
    int color;
    View view;
    View v;
    public static int detail = 3; // {niederlande, "Niederlande", "Amsterdam", 41526, 16680000, "Westeuropa", 100.0, true});
    public static int gridLength = 4;
    public static int gameMode = 2;
    public static int numberMin = 0;
    public static int numberMax;
    public static int buttonWidth;
    public static int buttonHeight;
    public static int emojiSize;
    public static String retStr;

    public static MainFragment mainfragment;

    //public static Activity mActivity;

    MainFragment nextFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.main_activity);

        if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction()
                    .replace(R.id.container, MainFragment.newInstance())
                    .commitNow();
        }
        mainfragment = (MainFragment) getSupportFragmentManager().findFragmentById(R.id.container);

        //gameMode = randomWithRange(1,10);
       // btnArr = new Button[gridLength][gridLength];
        // mainfragment.a1.callOnClick(); ---bad idea


    }
    void func_a1(View v) {

            mainfragment.func_a1(v);

    }

    void func_a2(View v) {
        if (v == mainfragment.btnArr[mainfragment.arrnummer][mainfragment.index + 1] || v == mainfragment.btnArr[mainfragment.arrnummer + 1][mainfragment.index]) {
            mainfragment.func_a2(v);
        }
    }

    void func_a3(View v) {
        if (v == mainfragment.btnArr[mainfragment.arrnummer][mainfragment.index + 1] || v == mainfragment.btnArr[mainfragment.arrnummer + 1][mainfragment.index]) {
            mainfragment.func_a3(v);
        }


    }

    void func_a4(View v) {
        if (v == mainfragment.btnArr[mainfragment.arrnummer][mainfragment.index + 1] || v == mainfragment.btnArr[mainfragment.arrnummer + 1][mainfragment.index]) {
            mainfragment.func_a4(v);
        }


    }

    void func_a5(View v) {
        if (v == mainfragment.btnArr[mainfragment.arrnummer][mainfragment.index + 1] || v == mainfragment.btnArr[mainfragment.arrnummer + 1][mainfragment.index]) {
            mainfragment.func_a5(v);
        }
    }

    void func_a6(View v) {
        if (v == mainfragment.btnArr[mainfragment.arrnummer][mainfragment.index + 1] || v == mainfragment.btnArr[mainfragment.arrnummer + 1][mainfragment.index]) {
            mainfragment.func_a6(v);
        }


    }

    void func_a7(View v) {

        if (v == mainfragment.btnArr[mainfragment.arrnummer][mainfragment.index + 1] || v == mainfragment.btnArr[mainfragment.arrnummer + 1][mainfragment.index]) {
            mainfragment.func_a7(v);
        }
    }

    void func_b1(View v) {

        if (v == mainfragment.btnArr[mainfragment.arrnummer][mainfragment.index + 1] || v == mainfragment.btnArr[mainfragment.arrnummer + 1][mainfragment.index]) {
            mainfragment.func_b1(v);
        }
    }

    void func_b2(View v) {

        if (v == mainfragment.btnArr[mainfragment.arrnummer][mainfragment.index + 1] || v == mainfragment.btnArr[mainfragment.arrnummer + 1][mainfragment.index]) {
            mainfragment.func_b2(v);
        }
    }

    void func_b3(View v) {

        if (v == mainfragment.btnArr[mainfragment.arrnummer][mainfragment.index + 1] || v == mainfragment.btnArr[mainfragment.arrnummer + 1][mainfragment.index]) {
            mainfragment.func_b3(v);
        }
    }

    void func_b4(View v) {

        if (v == mainfragment.btnArr[mainfragment.arrnummer][mainfragment.index + 1] || v == mainfragment.btnArr[mainfragment.arrnummer + 1][mainfragment.index]) {
            mainfragment.func_b4(v);
        }
    }

    void func_b5(View v) {

        if (v == mainfragment.btnArr[mainfragment.arrnummer][mainfragment.index + 1] || v == mainfragment.btnArr[mainfragment.arrnummer + 1][mainfragment.index]) {
            mainfragment.func_b5(v);
        }
    }

    void func_b6(View v) {

        if (v == mainfragment.btnArr[mainfragment.arrnummer][mainfragment.index + 1] || v == mainfragment.btnArr[mainfragment.arrnummer + 1][mainfragment.index]) {
            mainfragment.func_b6(v);
        }
    }

    void func_b7(View v) {

        if (v == mainfragment.btnArr[mainfragment.arrnummer][mainfragment.index + 1] || v == mainfragment.btnArr[mainfragment.arrnummer + 1][mainfragment.index]) {
            mainfragment.func_b7(v);
        }
    }
     void func_c1(View v) {

         if (v == mainfragment.btnArr[mainfragment.arrnummer][mainfragment.index + 1] || v == mainfragment.btnArr[mainfragment.arrnummer + 1][mainfragment.index]) {
             mainfragment.func_c1(v);
         }
     }

     void func_c2(View v) {
         if (v == mainfragment.btnArr[mainfragment.arrnummer][mainfragment.index + 1] || v == mainfragment.btnArr[mainfragment.arrnummer + 1][mainfragment.index]) {
             mainfragment.func_c2(v);
         }
     }

     void func_c3(View v) {

        mainfragment.func_c3(v);
      
    }

     void func_c4(View v) {
         if (v == mainfragment.btnArr[mainfragment.arrnummer][mainfragment.index + 1] || v == mainfragment.btnArr[mainfragment.arrnummer + 1][mainfragment.index]) {
             mainfragment.func_c4(v);
         }
     }

     void func_c5(View v) {
         if (v == mainfragment.btnArr[mainfragment.arrnummer][mainfragment.index + 1] || v == mainfragment.btnArr[mainfragment.arrnummer + 1][mainfragment.index]) {
             mainfragment.func_c5(v);
         }
     }

     void func_c6(View v) {

        mainfragment.func_c6(v);
     
    }

     void func_c7(View v) {
         if (v == mainfragment.btnArr[mainfragment.arrnummer][mainfragment.index + 1] || v == mainfragment.btnArr[mainfragment.arrnummer + 1][mainfragment.index]) {
             mainfragment.func_c7(v);
         }
     }

     void func_d1(View v) {
         if (v == mainfragment.btnArr[mainfragment.arrnummer][mainfragment.index + 1] || v == mainfragment.btnArr[mainfragment.arrnummer + 1][mainfragment.index]) {
             mainfragment.func_d1(v);
         }
     }

     void func_d2(View v) {
         if (v == mainfragment.btnArr[mainfragment.arrnummer][mainfragment.index + 1] || v == mainfragment.btnArr[mainfragment.arrnummer + 1][mainfragment.index]) {
             mainfragment.func_d2(v);
         }
     }

     void func_d3(View v) {
         if (v == mainfragment.btnArr[mainfragment.arrnummer][mainfragment.index + 1] || v == mainfragment.btnArr[mainfragment.arrnummer + 1][mainfragment.index]) {
             mainfragment.func_d3(v);
         }
     }

     void func_d4(View v) {
         if (v == mainfragment.btnArr[mainfragment.arrnummer][mainfragment.index + 1] || v == mainfragment.btnArr[mainfragment.arrnummer + 1][mainfragment.index]) {
             mainfragment.func_d4(v);
         }
     }

     void func_d5(View v) {

         if (v == mainfragment.btnArr[mainfragment.arrnummer][mainfragment.index + 1] || v == mainfragment.btnArr[mainfragment.arrnummer + 1][mainfragment.index]) {
             mainfragment.func_d5(v);
         }
     }

     void func_d6(View v) {

         if (v == mainfragment.btnArr[mainfragment.arrnummer][mainfragment.index + 1] || v == mainfragment.btnArr[mainfragment.arrnummer + 1][mainfragment.index]) {
             mainfragment.func_d6(v);
         }
     }

     void func_d7(View v) {
         if (v == mainfragment.btnArr[mainfragment.arrnummer][mainfragment.index + 1] || v == mainfragment.btnArr[mainfragment.arrnummer + 1][mainfragment.index]) {
             mainfragment.func_d7(v);
         }
     }

     void func_e1(View v) {
         if (v == mainfragment.btnArr[mainfragment.arrnummer][mainfragment.index + 1] || v == mainfragment.btnArr[mainfragment.arrnummer + 1][mainfragment.index]) {
             mainfragment.func_e1(v);
         }
     }

     void func_e2(View v) {

         if (v == mainfragment.btnArr[mainfragment.arrnummer][mainfragment.index + 1] || v == mainfragment.btnArr[mainfragment.arrnummer + 1][mainfragment.index]) {
             mainfragment.func_e2(v);
         }
     }

     void func_e3(View v) {
         if (v == mainfragment.btnArr[mainfragment.arrnummer][mainfragment.index + 1] || v == mainfragment.btnArr[mainfragment.arrnummer + 1][mainfragment.index]) {
             mainfragment.func_e3(v);
         }
     }

     void func_e4(View v) {
         if (v == mainfragment.btnArr[mainfragment.arrnummer][mainfragment.index + 1] || v == mainfragment.btnArr[mainfragment.arrnummer + 1][mainfragment.index]) {
             mainfragment.func_e4(v);
         }
     }

     void func_e5(View v) {

         if (v == mainfragment.btnArr[mainfragment.arrnummer][mainfragment.index + 1] || v == mainfragment.btnArr[mainfragment.arrnummer + 1][mainfragment.index]) {
             mainfragment.func_e5(v);
         }
     }

     void func_e6(View v) {

         if (v == mainfragment.btnArr[mainfragment.arrnummer][mainfragment.index + 1] || v == mainfragment.btnArr[mainfragment.arrnummer + 1][mainfragment.index]) {
             mainfragment.func_e6(v);
         }
     }

     void func_e7(View v) {

         if (v == mainfragment.btnArr[mainfragment.arrnummer][mainfragment.index + 1] || v == mainfragment.btnArr[mainfragment.arrnummer + 1][mainfragment.index]) {
             mainfragment.func_e7(v);
         }
     }

     void func_f1(View v) {

         if (v == mainfragment.btnArr[mainfragment.arrnummer][mainfragment.index + 1] || v == mainfragment.btnArr[mainfragment.arrnummer + 1][mainfragment.index]) {
             mainfragment.func_f1(v);
         }
     }

     void func_f2(View v) {

         if (v == mainfragment.btnArr[mainfragment.arrnummer][mainfragment.index + 1] || v == mainfragment.btnArr[mainfragment.arrnummer + 1][mainfragment.index]) {
             mainfragment.func_f2(v);
         }
     }

     void func_f3(View v) {
         if (v == mainfragment.btnArr[mainfragment.arrnummer][mainfragment.index + 1] || v == mainfragment.btnArr[mainfragment.arrnummer + 1][mainfragment.index]) {
             mainfragment.func_f3(v);
         }
     }

     void func_f4(View v) {
         if (v == mainfragment.btnArr[mainfragment.arrnummer][mainfragment.index + 1] || v == mainfragment.btnArr[mainfragment.arrnummer + 1][mainfragment.index]) {
             mainfragment.func_f4(v);
         }
     }

     void func_f5(View v) {
         if (v == mainfragment.btnArr[mainfragment.arrnummer][mainfragment.index + 1] || v == mainfragment.btnArr[mainfragment.arrnummer + 1][mainfragment.index]) {
             mainfragment.func_f5(v);
         }
     }

     void func_f6(View v) {
         if (v == mainfragment.btnArr[mainfragment.arrnummer][mainfragment.index + 1] || v == mainfragment.btnArr[mainfragment.arrnummer + 1][mainfragment.index]) {
             mainfragment.func_f6(v);
         }
     }

     void func_f7(View v) {
         if (v == mainfragment.btnArr[mainfragment.arrnummer][mainfragment.index + 1] || v == mainfragment.btnArr[mainfragment.arrnummer + 1][mainfragment.index]) {
             mainfragment.func_f7(v);
         }
     }

     void func_g1(View v) {
         if (v == mainfragment.btnArr[mainfragment.arrnummer][mainfragment.index + 1] || v == mainfragment.btnArr[mainfragment.arrnummer + 1][mainfragment.index]) {
             mainfragment.func_g1(v);
         }
     }

     void func_g2(View v) {
         if (v == mainfragment.btnArr[mainfragment.arrnummer][mainfragment.index + 1] || v == mainfragment.btnArr[mainfragment.arrnummer + 1][mainfragment.index]) {
             mainfragment.func_g2(v);
         }
     }

     void func_g3(View v) {
         if (v == mainfragment.btnArr[mainfragment.arrnummer][mainfragment.index + 1] || v == mainfragment.btnArr[mainfragment.arrnummer + 1][mainfragment.index]) {
             mainfragment.func_g3(v);
         }
     }

     void func_g4(View v) {
         if (v == mainfragment.btnArr[mainfragment.arrnummer][mainfragment.index + 1] || v == mainfragment.btnArr[mainfragment.arrnummer + 1][mainfragment.index]) {
             mainfragment.func_g4(v);
         }
     }

     void func_g5(View v) {
         if (v == mainfragment.btnArr[mainfragment.arrnummer][mainfragment.index + 1] || v == mainfragment.btnArr[mainfragment.arrnummer + 1][mainfragment.index]) {
             mainfragment.func_g5(v);
         }
     }

     void func_g6(View v) {
         if (v == mainfragment.btnArr[mainfragment.arrnummer][mainfragment.index + 1] || v == mainfragment.btnArr[mainfragment.arrnummer + 1][mainfragment.index]) {
             mainfragment.func_g6(v);
         }
     }

     void func_g7(View v) {
         if (v == mainfragment.btnArr[mainfragment.arrnummer][mainfragment.index + 1] || v == mainfragment.btnArr[mainfragment.arrnummer + 1][mainfragment.index]) {
             mainfragment.func_g7(v);
         }
     }
    void func_range(View v) {

            mainfragment.func_range(v);

    }
    void func_long_a1(View v){
        if (v == mainfragment.btnArr[mainfragment.arrnummer][mainfragment.index + 1] || v == mainfragment.btnArr[mainfragment.arrnummer + 1][mainfragment.index]) {
            mainfragment.func_long_a1(v);
        }
    }
    void func_long_a2(View v){
        if (v == mainfragment.btnArr[mainfragment.arrnummer][mainfragment.index + 1] || v == mainfragment.btnArr[mainfragment.arrnummer + 1][mainfragment.index]) {
            mainfragment.func_long_a2(v);
        }
    }
    void func_long_a3(View v){
        if (v == mainfragment.btnArr[mainfragment.arrnummer][mainfragment.index + 1] || v == mainfragment.btnArr[mainfragment.arrnummer + 1][mainfragment.index]) {
            mainfragment.func_long_a3(v);
        }
    }
    void func_long_a4(View v){
        if (v == mainfragment.btnArr[mainfragment.arrnummer][mainfragment.index + 1] || v == mainfragment.btnArr[mainfragment.arrnummer + 1][mainfragment.index]) {
            mainfragment.func_long_a4(v);
        }
    }
    void func_long_a5(View v){
        if (v == mainfragment.btnArr[mainfragment.arrnummer][mainfragment.index + 1] || v == mainfragment.btnArr[mainfragment.arrnummer + 1][mainfragment.index]) {
            mainfragment.func_long_a5(v);
        }
    }
    void func_long_a6(View v){
        if (v == mainfragment.btnArr[mainfragment.arrnummer][mainfragment.index + 1] || v == mainfragment.btnArr[mainfragment.arrnummer + 1][mainfragment.index]) {
            mainfragment.func_long_a6(v);
        }
    }
    void func_long_a7(View v){
        if (v == mainfragment.btnArr[mainfragment.arrnummer][mainfragment.index + 1] || v == mainfragment.btnArr[mainfragment.arrnummer + 1][mainfragment.index]) {
            mainfragment.func_long_a7(v);
        }
    }
    void func_long_b1(View v){
        if (v == mainfragment.btnArr[mainfragment.arrnummer][mainfragment.index + 1] || v == mainfragment.btnArr[mainfragment.arrnummer + 1][mainfragment.index]) {
            mainfragment.func_long_b1(v);
        }
    }
    void func_long_b2(View v){
         if (v == mainfragment.btnArr[mainfragment.arrnummer][mainfragment.index + 1] || v == mainfragment.btnArr[mainfragment.arrnummer + 1][mainfragment.index]) {
            mainfragment.func_long_b2(v);
             }
    }
    void func_long_b3(View v){
        if (v == mainfragment.btnArr[mainfragment.arrnummer][mainfragment.index + 1] || v == mainfragment.btnArr[mainfragment.arrnummer + 1][mainfragment.index]) {
            mainfragment.func_long_b3(v);
        }
    }
    void func_long_b4(View v){
        if (v == mainfragment.btnArr[mainfragment.arrnummer][mainfragment.index + 1] || v == mainfragment.btnArr[mainfragment.arrnummer + 1][mainfragment.index]) {
            mainfragment.func_long_b4(v);
        }
    }
    void func_long_b5(View v){
        if (v == mainfragment.btnArr[mainfragment.arrnummer][mainfragment.index + 1] || v == mainfragment.btnArr[mainfragment.arrnummer + 1][mainfragment.index]) {
            mainfragment.func_long_b5(v);
        }
    }
    void func_long_b6(View v){
        if (v == mainfragment.btnArr[mainfragment.arrnummer][mainfragment.index + 1] || v == mainfragment.btnArr[mainfragment.arrnummer + 1][mainfragment.index]) {
            mainfragment.func_long_b6(v);
        }
    }
    void func_long_b7(View v){
        if (v == mainfragment.btnArr[mainfragment.arrnummer][mainfragment.index + 1] || v == mainfragment.btnArr[mainfragment.arrnummer + 1][mainfragment.index]) {
            mainfragment.func_long_b7(v);
        }
    }
    void func_long_c1(View v){
        if (v == mainfragment.btnArr[mainfragment.arrnummer][mainfragment.index + 1] || v == mainfragment.btnArr[mainfragment.arrnummer + 1][mainfragment.index]) {
            mainfragment.func_long_c1(v);
        }
    }
    void func_long_c2(View v){
        if (v == mainfragment.btnArr[mainfragment.arrnummer][mainfragment.index + 1] || v == mainfragment.btnArr[mainfragment.arrnummer + 1][mainfragment.index]) {
            mainfragment.func_long_c2(v);
        }
    }
    void func_long_c3(View v){
        if (v == mainfragment.btnArr[mainfragment.arrnummer][mainfragment.index + 1] || v == mainfragment.btnArr[mainfragment.arrnummer + 1][mainfragment.index]) {
            mainfragment.func_long_c3(v);
        }
    }
    void func_long_c4(View v){
        if (v == mainfragment.btnArr[mainfragment.arrnummer][mainfragment.index + 1] || v == mainfragment.btnArr[mainfragment.arrnummer + 1][mainfragment.index]) {
            mainfragment.func_long_c4(v);
        }
    }
    void func_long_c5(View v){
        if (v == mainfragment.btnArr[mainfragment.arrnummer][mainfragment.index + 1] || v == mainfragment.btnArr[mainfragment.arrnummer + 1][mainfragment.index]) {
            mainfragment.func_long_c5(v);
        }
    }
    void func_long_c6(View v){
        if (v == mainfragment.btnArr[mainfragment.arrnummer][mainfragment.index + 1] || v == mainfragment.btnArr[mainfragment.arrnummer + 1][mainfragment.index]) {
            mainfragment.func_long_c6(v);
        }
    }
    void func_long_c7(View v){
        if (v == mainfragment.btnArr[mainfragment.arrnummer][mainfragment.index + 1] || v == mainfragment.btnArr[mainfragment.arrnummer + 1][mainfragment.index]) {
            mainfragment.func_long_c7(v);
        }
    }
    void func_long_d1(View v){
        if (v == mainfragment.btnArr[mainfragment.arrnummer][mainfragment.index + 1] || v == mainfragment.btnArr[mainfragment.arrnummer + 1][mainfragment.index]) {
            mainfragment.func_long_d1(v);
        }
    }
    void func_long_d2(View v){
        if (v == mainfragment.btnArr[mainfragment.arrnummer][mainfragment.index + 1] || v == mainfragment.btnArr[mainfragment.arrnummer + 1][mainfragment.index]) {
            mainfragment.func_long_d2(v);
        }
    }
    void func_long_d3(View v){
        if (v == mainfragment.btnArr[mainfragment.arrnummer][mainfragment.index + 1] || v == mainfragment.btnArr[mainfragment.arrnummer + 1][mainfragment.index]) {
            mainfragment.func_long_d3(v);
        }
    }
    void func_long_d4(View v){
        if (v == mainfragment.btnArr[mainfragment.arrnummer][mainfragment.index + 1] || v == mainfragment.btnArr[mainfragment.arrnummer + 1][mainfragment.index]) {
            mainfragment.func_long_d4(v);
        }
    }
    void func_long_d5(View v){
        if (v == mainfragment.btnArr[mainfragment.arrnummer][mainfragment.index + 1] || v == mainfragment.btnArr[mainfragment.arrnummer + 1][mainfragment.index]) {
            mainfragment.func_long_d5(v);
        }
    }
    void func_long_d6(View v){
        if (v == mainfragment.btnArr[mainfragment.arrnummer][mainfragment.index + 1] || v == mainfragment.btnArr[mainfragment.arrnummer + 1][mainfragment.index]) {
            mainfragment.func_long_d6(v);
        }
    }
    void func_long_d7(View v){
        if (v == mainfragment.btnArr[mainfragment.arrnummer][mainfragment.index + 1] || v == mainfragment.btnArr[mainfragment.arrnummer + 1][mainfragment.index]) {
            mainfragment.func_long_d7(v);
        }
    }
    void func_long_e1(View v){
        if (v == mainfragment.btnArr[mainfragment.arrnummer][mainfragment.index + 1] || v == mainfragment.btnArr[mainfragment.arrnummer + 1][mainfragment.index]) {
            mainfragment.func_long_e1(v);
        }
    }
    void func_long_e2(View v){
        if (v == mainfragment.btnArr[mainfragment.arrnummer][mainfragment.index + 1] || v == mainfragment.btnArr[mainfragment.arrnummer + 1][mainfragment.index]) {
            mainfragment.func_long_e2(v);
        }
    }
    void func_long_e3(View v){
        if (v == mainfragment.btnArr[mainfragment.arrnummer][mainfragment.index + 1] || v == mainfragment.btnArr[mainfragment.arrnummer + 1][mainfragment.index]) {
            mainfragment.func_long_e3(v);
        }
    }
    void func_long_e4(View v){
        if (v == mainfragment.btnArr[mainfragment.arrnummer][mainfragment.index + 1] || v == mainfragment.btnArr[mainfragment.arrnummer + 1][mainfragment.index]) {
            mainfragment.func_long_e4(v);
        }
    }
    void func_long_e5(View v){
        if (v == mainfragment.btnArr[mainfragment.arrnummer][mainfragment.index + 1] || v == mainfragment.btnArr[mainfragment.arrnummer + 1][mainfragment.index]) {
            mainfragment.func_long_e5(v);
        }
    }
    void func_long_e6(View v){
        if (v == mainfragment.btnArr[mainfragment.arrnummer][mainfragment.index + 1] || v == mainfragment.btnArr[mainfragment.arrnummer + 1][mainfragment.index]) {
            mainfragment.func_long_e6(v);
        }
    }
    void func_long_e7(View v){
        if (v == mainfragment.btnArr[mainfragment.arrnummer][mainfragment.index + 1] || v == mainfragment.btnArr[mainfragment.arrnummer + 1][mainfragment.index]) {
            mainfragment.func_long_e7(v);
        }
    }
    void func_long_f1(View v){
        if (v == mainfragment.btnArr[mainfragment.arrnummer][mainfragment.index + 1] || v == mainfragment.btnArr[mainfragment.arrnummer + 1][mainfragment.index]) {
            mainfragment.func_long_f1(v);
        }
    }
    void func_long_f2(View v){
        if (v == mainfragment.btnArr[mainfragment.arrnummer][mainfragment.index + 1] || v == mainfragment.btnArr[mainfragment.arrnummer + 1][mainfragment.index]) {
            mainfragment.func_long_f2(v);
        }
    }
    void func_long_f3(View v){
        if (v == mainfragment.btnArr[mainfragment.arrnummer][mainfragment.index + 1] || v == mainfragment.btnArr[mainfragment.arrnummer + 1][mainfragment.index]) {
            mainfragment.func_long_f3(v);
        }
    }
    void func_long_f4(View v){
        if (v == mainfragment.btnArr[mainfragment.arrnummer][mainfragment.index + 1] || v == mainfragment.btnArr[mainfragment.arrnummer + 1][mainfragment.index]) {
            mainfragment.func_long_f4(v);
        }
    }
    void func_long_f5(View v){
        if (v == mainfragment.btnArr[mainfragment.arrnummer][mainfragment.index + 1] || v == mainfragment.btnArr[mainfragment.arrnummer + 1][mainfragment.index]) {
            mainfragment.func_long_f5(v);
        }
    }
    void func_long_f6(View v){
        if (v == mainfragment.btnArr[mainfragment.arrnummer][mainfragment.index + 1] || v == mainfragment.btnArr[mainfragment.arrnummer + 1][mainfragment.index]) {
            mainfragment.func_long_f6(v);
        }
    }
    void func_long_f7(View v){
        if (v == mainfragment.btnArr[mainfragment.arrnummer][mainfragment.index + 1] || v == mainfragment.btnArr[mainfragment.arrnummer + 1][mainfragment.index]) {
            mainfragment.func_long_f7(v);
        }
    }
    void func_long_g1(View v){
        if (v == mainfragment.btnArr[mainfragment.arrnummer][mainfragment.index + 1] || v == mainfragment.btnArr[mainfragment.arrnummer + 1][mainfragment.index]) {
            mainfragment.func_long_g1(v);
        }
    }
    void func_long_g2(View v){
        if (v == mainfragment.btnArr[mainfragment.arrnummer][mainfragment.index + 1] || v == mainfragment.btnArr[mainfragment.arrnummer + 1][mainfragment.index]) {
            mainfragment.func_long_g2(v);
        }
    }
    void func_long_g3(View v){
        if (v == mainfragment.btnArr[mainfragment.arrnummer][mainfragment.index + 1] || v == mainfragment.btnArr[mainfragment.arrnummer + 1][mainfragment.index]) {
            mainfragment.func_long_g3(v);
        }
    }
    void func_long_g4(View v){
        if (v == mainfragment.btnArr[mainfragment.arrnummer][mainfragment.index + 1] || v == mainfragment.btnArr[mainfragment.arrnummer + 1][mainfragment.index]) {
            mainfragment.func_long_g4(v);
        }
    }
    void func_long_g5(View v){
        if (v == mainfragment.btnArr[mainfragment.arrnummer][mainfragment.index + 1] || v == mainfragment.btnArr[mainfragment.arrnummer + 1][mainfragment.index]) {
            mainfragment.func_long_g5(v);
        }
    }
    void func_long_g6(View v){
        if (v == mainfragment.btnArr[mainfragment.arrnummer][mainfragment.index + 1] || v == mainfragment.btnArr[mainfragment.arrnummer + 1][mainfragment.index]) {
            mainfragment.func_long_g6(v);
        }
    }
    void func_long_g7(View v){
        if (v == mainfragment.btnArr[mainfragment.arrnummer][mainfragment.index + 1] || v == mainfragment.btnArr[mainfragment.arrnummer + 1][mainfragment.index]) {
            mainfragment.func_long_g7(v);
        }
    }
    }

