package net.juntermanns.mybuttons;

import android.content.Intent;
import android.media.AudioAttributes;
import android.media.SoundPool;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import net.juntermanns.mybuttons.ui.main.MainFragment;
import net.juntermanns.mybuttons.ui.main.MyViewModel;

import static net.juntermanns.mybuttons.ui.main.MyViewModel.arrnummer;
import static net.juntermanns.mybuttons.ui.main.MyViewModel.index;

public class MainActivity extends AppCompatActivity {

    public static MainFragment mainfragment;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.main_activity);


       //startService(new Intent(this, MusicPlayer.class));
       setTitle(MyViewModel.titleBarString);

        if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction()
                    .replace(R.id.container, MainFragment.newInstance())
                    .commitNow();
        }
        mainfragment = (MainFragment) getSupportFragmentManager().findFragmentById(R.id.container);

    }



    // TODO call to ViewModelObjects


    public void func_a1(View v) {

        mainfragment.func_a1(v);
        // setTitle(MyViewModel.titleBarString);

    }

    public void  func_a2(View v) {
        if (v == mainfragment.btnArr[MyViewModel.arrnummer][MyViewModel.index + 1] || v == mainfragment.btnArr[MyViewModel.arrnummer + 1][MyViewModel.index]) {
            mainfragment.func_a2(v);
            
            Log.d("TAG","MyViewModel.index: "+index+" Arrnummer: "+arrnummer);
        }
    }

    public void  func_a3(View v) {
        if (v == mainfragment.btnArr[MyViewModel.arrnummer][MyViewModel.index + 1] || v == mainfragment.btnArr[MyViewModel.arrnummer + 1][MyViewModel.index]) {
            mainfragment.func_a3(v);
            Log.d("TAG","MyViewModel.index: "+MyViewModel.index+" Arrnummer: "+arrnummer);
        }
    }

    public void  func_a4(View v) {
        if (v == mainfragment.btnArr[MyViewModel.arrnummer][MyViewModel.index + 1] || v == mainfragment.btnArr[MyViewModel.arrnummer + 1][MyViewModel.index]) {
            mainfragment.func_a4(v);
            Log.d("TAG", "MyViewModel.index: " + MyViewModel.index + " Arrnummer: " + arrnummer);
        }
    }

    public void  func_a5(View v) {
        if (v == mainfragment.btnArr[MyViewModel.arrnummer][MyViewModel.index + 1] || v == mainfragment.btnArr[MyViewModel.arrnummer + 1][MyViewModel.index]) {
            mainfragment.func_a5(v);
            Log.d("TAG","MyViewModel.index: "+MyViewModel.index+" Arrnummer: "+arrnummer);}
    }

    public void  func_a6(View v) {
        if (v == mainfragment.btnArr[MyViewModel.arrnummer][MyViewModel.index + 1] || v == mainfragment.btnArr[MyViewModel.arrnummer + 1][MyViewModel.index]) {
            mainfragment.func_a6(v);
            Log.d("TAG","MyViewModel.index: "+MyViewModel.index+" Arrnummer: "+arrnummer);}


    }

    public void  func_a7(View v) {

        if (v == mainfragment.btnArr[MyViewModel.arrnummer][MyViewModel.index + 1] || v == mainfragment.btnArr[MyViewModel.arrnummer + 1][MyViewModel.index]) {
            mainfragment.func_a7(v);
            Log.d("TAG","MyViewModel.index: "+MyViewModel.index+" Arrnummer: "+arrnummer);}
    }

    public void  func_b1(View v) {

        if (v == mainfragment.btnArr[MyViewModel.arrnummer][MyViewModel.index + 1] || v == mainfragment.btnArr[MyViewModel.arrnummer + 1][MyViewModel.index]) {
            mainfragment.func_b1(v);
            Log.d("TAG","MyViewModel.index: "+MyViewModel.index+" Arrnummer: "+arrnummer);}
    }

    public void  func_b2(View v) {

        if (v == mainfragment.btnArr[MyViewModel.arrnummer][MyViewModel.index + 1] || v == mainfragment.btnArr[MyViewModel.arrnummer + 1][MyViewModel.index]) {
            mainfragment.func_b2(v);
            Log.d("TAG","MyViewModel.index: "+MyViewModel.index+" Arrnummer: "+arrnummer);}
    }

    public void  func_b3(View v) {

        if (v == mainfragment.btnArr[MyViewModel.arrnummer][MyViewModel.index + 1] || v == mainfragment.btnArr[MyViewModel.arrnummer + 1][MyViewModel.index]) {
            mainfragment.func_b3(v);
            Log.d("TAG","MyViewModel.index: "+MyViewModel.index+" Arrnummer: "+arrnummer);}
    }

    public void  func_b4(View v) {

        if (v == mainfragment.btnArr[MyViewModel.arrnummer][MyViewModel.index + 1] || v == mainfragment.btnArr[MyViewModel.arrnummer + 1][MyViewModel.index]) {
            mainfragment.func_b4(v);
            Log.d("TAG","MyViewModel.index: "+MyViewModel.index+" Arrnummer: "+arrnummer);}
    }

    public void  func_b5(View v) {

        if (v == mainfragment.btnArr[MyViewModel.arrnummer][MyViewModel.index + 1] || v == mainfragment.btnArr[MyViewModel.arrnummer + 1][MyViewModel.index]) {
            mainfragment.func_b5(v);
            Log.d("TAG","MyViewModel.index: "+MyViewModel.index+" Arrnummer: "+arrnummer);}
    }

    public void  func_b6(View v) {

        if (v == mainfragment.btnArr[MyViewModel.arrnummer][MyViewModel.index + 1] || v == mainfragment.btnArr[MyViewModel.arrnummer + 1][MyViewModel.index]) {
            mainfragment.func_b6(v);
            Log.d("TAG","MyViewModel.index: "+MyViewModel.index+" Arrnummer: "+arrnummer);}
    }

    public void  func_b7(View v) {

        if (v == mainfragment.btnArr[MyViewModel.arrnummer][MyViewModel.index + 1] || v == mainfragment.btnArr[MyViewModel.arrnummer + 1][MyViewModel.index]) {
            mainfragment.func_b7(v);
            Log.d("TAG","MyViewModel.index: "+MyViewModel.index+" Arrnummer: "+arrnummer);}
    }

    public void  func_c1(View v) {

        if (v == mainfragment.btnArr[MyViewModel.arrnummer][MyViewModel.index + 1] || v == mainfragment.btnArr[MyViewModel.arrnummer + 1][MyViewModel.index]) {
            mainfragment.func_c1(v);
            Log.d("TAG","MyViewModel.index: "+MyViewModel.index+" Arrnummer: "+arrnummer);}
    }

    public void  func_c2(View v) {
        if (v == mainfragment.btnArr[MyViewModel.arrnummer][MyViewModel.index + 1] || v == mainfragment.btnArr[MyViewModel.arrnummer + 1][MyViewModel.index]) {
            mainfragment.func_c2(v);
            Log.d("TAG","MyViewModel.index: "+MyViewModel.index+" Arrnummer: "+arrnummer);}
    }

    public void  func_c3(View v) {

        mainfragment.func_c3(v);

        Log.d("TAG","MyViewModel.index: "+MyViewModel.index+" Arrnummer: "+arrnummer);}

    public void  func_c4(View v) {
        if (v == mainfragment.btnArr[MyViewModel.arrnummer][MyViewModel.index + 1] || v == mainfragment.btnArr[MyViewModel.arrnummer + 1][MyViewModel.index]) {
            mainfragment.func_c4(v);
        }
    }

    public void  func_c5(View v) {
        if (v == mainfragment.btnArr[MyViewModel.arrnummer][MyViewModel.index + 1] || v == mainfragment.btnArr[MyViewModel.arrnummer + 1][MyViewModel.index]) {
            mainfragment.func_c5(v);
            Log.d("TAG","MyViewModel.index: "+MyViewModel.index+" Arrnummer: "+arrnummer);}
    }

    public void  func_c6(View v) {

        mainfragment.func_c6(v);

        Log.d("TAG","MyViewModel.index: "+MyViewModel.index+" Arrnummer: "+arrnummer);}

    public void  func_c7(View v) {
        if (v == mainfragment.btnArr[MyViewModel.arrnummer][MyViewModel.index + 1] || v == mainfragment.btnArr[MyViewModel.arrnummer + 1][MyViewModel.index]) {
            mainfragment.func_c7(v);
            Log.d("TAG","MyViewModel.index: "+MyViewModel.index+" Arrnummer: "+arrnummer);}
    }

    public void  func_d1(View v) {
        if (v == mainfragment.btnArr[MyViewModel.arrnummer][MyViewModel.index + 1] || v == mainfragment.btnArr[MyViewModel.arrnummer + 1][MyViewModel.index]) {
            mainfragment.func_d1(v);
            Log.d("TAG","MyViewModel.index: "+MyViewModel.index+" Arrnummer: "+arrnummer);}
    }

    public void  func_d2(View v) {
        if (v == mainfragment.btnArr[MyViewModel.arrnummer][MyViewModel.index + 1] || v == mainfragment.btnArr[MyViewModel.arrnummer + 1][MyViewModel.index]) {
            mainfragment.func_d2(v);
            Log.d("TAG","MyViewModel.index: "+MyViewModel.index+" Arrnummer: "+arrnummer);}
    }

    public void  func_d3(View v) {
        if (v == mainfragment.btnArr[MyViewModel.arrnummer][MyViewModel.index + 1] || v == mainfragment.btnArr[MyViewModel.arrnummer + 1][MyViewModel.index]) {
            mainfragment.func_d3(v);
            Log.d("TAG","MyViewModel.index: "+MyViewModel.index+" Arrnummer: "+arrnummer);}
    }

    public void  func_d4(View v) {
        if (v == mainfragment.btnArr[MyViewModel.arrnummer][MyViewModel.index + 1] || v == mainfragment.btnArr[MyViewModel.arrnummer + 1][MyViewModel.index]) {
            mainfragment.func_d4(v);
            Log.d("TAG","MyViewModel.index: "+MyViewModel.index+" Arrnummer: "+arrnummer);}
    }

    public void  func_d5(View v) {

        if (v == mainfragment.btnArr[MyViewModel.arrnummer][MyViewModel.index + 1] || v == mainfragment.btnArr[MyViewModel.arrnummer + 1][MyViewModel.index]) {
            mainfragment.func_d5(v);
            Log.d("TAG","MyViewModel.index: "+MyViewModel.index+" Arrnummer: "+arrnummer);}
    }

    public void  func_d6(View v) {

        if (v == mainfragment.btnArr[MyViewModel.arrnummer][MyViewModel.index + 1] || v == mainfragment.btnArr[MyViewModel.arrnummer + 1][MyViewModel.index]) {
            mainfragment.func_d6(v);
            Log.d("TAG","MyViewModel.index: "+MyViewModel.index+" Arrnummer: "+arrnummer);}
    }

    public void  func_d7(View v) {
        if (v == mainfragment.btnArr[MyViewModel.arrnummer][MyViewModel.index + 1] || v == mainfragment.btnArr[MyViewModel.arrnummer + 1][MyViewModel.index]) {
            mainfragment.func_d7(v);
            Log.d("TAG","MyViewModel.index: "+MyViewModel.index+" Arrnummer: "+arrnummer);}
    }

    public void  func_e1(View v) {
        if (v == mainfragment.btnArr[MyViewModel.arrnummer][MyViewModel.index + 1] || v == mainfragment.btnArr[MyViewModel.arrnummer + 1][MyViewModel.index]) {
            mainfragment.func_e1(v);
            Log.d("TAG","MyViewModel.index: "+MyViewModel.index+" Arrnummer: "+arrnummer);}
    }

    public void  func_e2(View v) {

        if (v == mainfragment.btnArr[MyViewModel.arrnummer][MyViewModel.index + 1] || v == mainfragment.btnArr[MyViewModel.arrnummer + 1][MyViewModel.index]) {
            mainfragment.func_e2(v);
            Log.d("TAG","MyViewModel.index: "+MyViewModel.index+" Arrnummer: "+arrnummer);}
    }

    public void  func_e3(View v) {
        if (v == mainfragment.btnArr[MyViewModel.arrnummer][MyViewModel.index + 1] || v == mainfragment.btnArr[MyViewModel.arrnummer + 1][MyViewModel.index]) {
            mainfragment.func_e3(v);
            Log.d("TAG","MyViewModel.index: "+MyViewModel.index+" Arrnummer: "+arrnummer);}
    }

    public void  func_e4(View v) {
        if (v == mainfragment.btnArr[MyViewModel.arrnummer][MyViewModel.index + 1] || v == mainfragment.btnArr[MyViewModel.arrnummer + 1][MyViewModel.index]) {
            mainfragment.func_e4(v);
            Log.d("TAG","MyViewModel.index: "+MyViewModel.index+" Arrnummer: "+arrnummer);}
    }

    public void  func_e5(View v) {

        if (v == mainfragment.btnArr[MyViewModel.arrnummer][MyViewModel.index + 1] || v == mainfragment.btnArr[MyViewModel.arrnummer + 1][MyViewModel.index]) {
            mainfragment.func_e5(v);
            Log.d("TAG","MyViewModel.index: "+MyViewModel.index+" Arrnummer: "+arrnummer);}
    }

    public void  func_e6(View v) {

        if (v == mainfragment.btnArr[MyViewModel.arrnummer][MyViewModel.index + 1] || v == mainfragment.btnArr[MyViewModel.arrnummer + 1][MyViewModel.index]) {
            mainfragment.func_e6(v);
            Log.d("TAG","MyViewModel.index: "+MyViewModel.index+" Arrnummer: "+arrnummer);}
    }

    public void  func_e7(View v) {

        if (v == mainfragment.btnArr[MyViewModel.arrnummer][MyViewModel.index + 1] || v == mainfragment.btnArr[MyViewModel.arrnummer + 1][MyViewModel.index]) {
            mainfragment.func_e7(v);
            Log.d("TAG","MyViewModel.index: "+MyViewModel.index+" Arrnummer: "+arrnummer);}
    }

    public void  func_f1(View v) {

        if (v == mainfragment.btnArr[MyViewModel.arrnummer][MyViewModel.index + 1] || v == mainfragment.btnArr[MyViewModel.arrnummer + 1][MyViewModel.index]) {
            mainfragment.func_f1(v);
            Log.d("TAG","MyViewModel.index: "+MyViewModel.index+" Arrnummer: "+arrnummer);}
    }

    public void  func_f2(View v) {

        if (v == mainfragment.btnArr[MyViewModel.arrnummer][MyViewModel.index + 1] || v == mainfragment.btnArr[MyViewModel.arrnummer + 1][MyViewModel.index]) {
            mainfragment.func_f2(v);
            Log.d("TAG","MyViewModel.index: "+MyViewModel.index+" Arrnummer: "+arrnummer);}
    }

    public void  func_f3(View v) {
        if (v == mainfragment.btnArr[MyViewModel.arrnummer][MyViewModel.index + 1] || v == mainfragment.btnArr[MyViewModel.arrnummer + 1][MyViewModel.index]) {
            mainfragment.func_f3(v);
            Log.d("TAG","MyViewModel.index: "+MyViewModel.index+" Arrnummer: "+arrnummer);}
    }

    public void  func_f4(View v) {
        if (v == mainfragment.btnArr[MyViewModel.arrnummer][MyViewModel.index + 1] || v == mainfragment.btnArr[MyViewModel.arrnummer + 1][MyViewModel.index]) {
            mainfragment.func_f4(v);
            Log.d("TAG","MyViewModel.index: "+MyViewModel.index+" Arrnummer: "+arrnummer);}
    }

    public void  func_f5(View v) {
        if (v == mainfragment.btnArr[MyViewModel.arrnummer][MyViewModel.index + 1] || v == mainfragment.btnArr[MyViewModel.arrnummer + 1][MyViewModel.index]) {
            mainfragment.func_f5(v);
            Log.d("TAG","MyViewModel.index: "+MyViewModel.index+" Arrnummer: "+arrnummer);}
    }

    public void  func_f6(View v) {
        if (v == mainfragment.btnArr[MyViewModel.arrnummer][MyViewModel.index + 1] || v == mainfragment.btnArr[MyViewModel.arrnummer + 1][MyViewModel.index]) {
            mainfragment.func_f6(v);
            Log.d("TAG","MyViewModel.index: "+MyViewModel.index+" Arrnummer: "+arrnummer);}
    }

    public void  func_f7(View v) {
        if (v == mainfragment.btnArr[MyViewModel.arrnummer][MyViewModel.index + 1] || v == mainfragment.btnArr[MyViewModel.arrnummer + 1][MyViewModel.index]) {
            mainfragment.func_f7(v);
            Log.d("TAG","MyViewModel.index: "+MyViewModel.index+" Arrnummer: "+arrnummer);}
    }

    public void  func_g1(View v) {
        if (v == mainfragment.btnArr[MyViewModel.arrnummer][MyViewModel.index + 1] || v == mainfragment.btnArr[MyViewModel.arrnummer + 1][MyViewModel.index]) {
            mainfragment.func_g1(v);
            Log.d("TAG","MyViewModel.index: "+MyViewModel.index+" Arrnummer: "+arrnummer);}
    }

    public void  func_g2(View v) {
        if (v == mainfragment.btnArr[MyViewModel.arrnummer][MyViewModel.index + 1] || v == mainfragment.btnArr[MyViewModel.arrnummer + 1][MyViewModel.index]) {
            mainfragment.func_g2(v);
            Log.d("TAG","MyViewModel.index: "+MyViewModel.index+" Arrnummer: "+arrnummer);}
    }

    public void  func_g3(View v) {
        if (v == mainfragment.btnArr[MyViewModel.arrnummer][MyViewModel.index + 1] || v == mainfragment.btnArr[MyViewModel.arrnummer + 1][MyViewModel.index]) {
            mainfragment.func_g3(v);
            Log.d("TAG","MyViewModel.index: "+MyViewModel.index+" Arrnummer: "+arrnummer);}
    }

    public void  func_g4(View v) {
        if (v == mainfragment.btnArr[MyViewModel.arrnummer][MyViewModel.index + 1] || v == mainfragment.btnArr[MyViewModel.arrnummer + 1][MyViewModel.index]) {
            mainfragment.func_g4(v);
            Log.d("TAG","MyViewModel.index: "+MyViewModel.index+" Arrnummer: "+arrnummer);}
    }

    public void  func_g5(View v) {
        if (v == mainfragment.btnArr[MyViewModel.arrnummer][MyViewModel.index + 1] || v == mainfragment.btnArr[MyViewModel.arrnummer + 1][MyViewModel.index]) {
            mainfragment.func_g5(v);
            Log.d("TAG","MyViewModel.index: "+MyViewModel.index+" Arrnummer: "+arrnummer);}
    }

    public void  func_g6(View v) {
        if (v == mainfragment.btnArr[MyViewModel.arrnummer][MyViewModel.index + 1] || v == mainfragment.btnArr[MyViewModel.arrnummer + 1][MyViewModel.index]) {
            mainfragment.func_g6(v);
            Log.d("TAG","MyViewModel.index: "+MyViewModel.index+" Arrnummer: "+arrnummer);}
    }

    public void  func_g7(View v) {
        if (v == mainfragment.btnArr[MyViewModel.arrnummer][MyViewModel.index + 1] || v == mainfragment.btnArr[MyViewModel.arrnummer + 1][MyViewModel.index]) {
            mainfragment.func_g7(v);
            Log.d("TAG","MyViewModel.index: "+MyViewModel.index+" Arrnummer: "+arrnummer);}
    }

    public void  func_range(View v) {

        mainfragment.func_range(v);

    }

    public void  func_long_a1(View v) {
        if (v == mainfragment.btnArr[MyViewModel.arrnummer][MyViewModel.index + 1] || v == mainfragment.btnArr[MyViewModel.arrnummer + 1][MyViewModel.index]) {
            mainfragment.func_long_a1(v);
        }
    }

    public void  func_long_a2(View v) {
        if (v == mainfragment.btnArr[MyViewModel.arrnummer][MyViewModel.index + 1] || v == mainfragment.btnArr[MyViewModel.arrnummer + 1][MyViewModel.index]) {
            mainfragment.func_long_a2(v);
        }
    }

    public void  func_long_a3(View v) {
        if (v == mainfragment.btnArr[MyViewModel.arrnummer][MyViewModel.index + 1] || v == mainfragment.btnArr[MyViewModel.arrnummer + 1][MyViewModel.index]) {
            mainfragment.func_long_a3(v);
        }
    }

    public void  func_long_a4(View v) {
        if (v == mainfragment.btnArr[MyViewModel.arrnummer][MyViewModel.index + 1] || v == mainfragment.btnArr[MyViewModel.arrnummer + 1][MyViewModel.index]) {
            mainfragment.func_long_a4(v);
        }
    }

    public void  func_long_a5(View v) {
        if (v == mainfragment.btnArr[MyViewModel.arrnummer][MyViewModel.index + 1] || v == mainfragment.btnArr[MyViewModel.arrnummer + 1][MyViewModel.index]) {
            mainfragment.func_long_a5(v);
        }
    }

    public void  func_long_a6(View v) {
        if (v == mainfragment.btnArr[MyViewModel.arrnummer][MyViewModel.index + 1] || v == mainfragment.btnArr[MyViewModel.arrnummer + 1][MyViewModel.index]) {
            mainfragment.func_long_a6(v);
        }
    }

    public void  func_long_a7(View v) {
        if (v == mainfragment.btnArr[MyViewModel.arrnummer][MyViewModel.index + 1] || v == mainfragment.btnArr[MyViewModel.arrnummer + 1][MyViewModel.index]) {
            mainfragment.func_long_a7(v);
        }
    }

    public void  func_long_b1(View v) {
        if (v == mainfragment.btnArr[MyViewModel.arrnummer][MyViewModel.index + 1] || v == mainfragment.btnArr[MyViewModel.arrnummer + 1][MyViewModel.index]) {
            mainfragment.func_long_b1(v);
        }
    }

    public void  func_long_b2(View v) {
        if (v == mainfragment.btnArr[MyViewModel.arrnummer][MyViewModel.index + 1] || v == mainfragment.btnArr[MyViewModel.arrnummer + 1][MyViewModel.index]) {
            mainfragment.func_long_b2(v);
        }
    }

    public void  func_long_b3(View v) {
        if (v == mainfragment.btnArr[MyViewModel.arrnummer][MyViewModel.index + 1] || v == mainfragment.btnArr[MyViewModel.arrnummer + 1][MyViewModel.index]) {
            mainfragment.func_long_b3(v);
        }
    }

    public void  func_long_b4(View v) {
        if (v == mainfragment.btnArr[MyViewModel.arrnummer][MyViewModel.index + 1] || v == mainfragment.btnArr[MyViewModel.arrnummer + 1][MyViewModel.index]) {
            mainfragment.func_long_b4(v);
        }
    }

    public void  func_long_b5(View v) {
        if (v == mainfragment.btnArr[MyViewModel.arrnummer][MyViewModel.index + 1] || v == mainfragment.btnArr[MyViewModel.arrnummer + 1][MyViewModel.index]) {
            mainfragment.func_long_b5(v);
        }
    }

    public void  func_long_b6(View v) {
        if (v == mainfragment.btnArr[MyViewModel.arrnummer][MyViewModel.index + 1] || v == mainfragment.btnArr[MyViewModel.arrnummer + 1][MyViewModel.index]) {
            mainfragment.func_long_b6(v);
        }
    }

    public void  func_long_b7(View v) {
        if (v == mainfragment.btnArr[MyViewModel.arrnummer][MyViewModel.index + 1] || v == mainfragment.btnArr[MyViewModel.arrnummer + 1][MyViewModel.index]) {
            mainfragment.func_long_b7(v);
        }
    }

    public void  func_long_c1(View v) {
        if (v == mainfragment.btnArr[MyViewModel.arrnummer][MyViewModel.index + 1] || v == mainfragment.btnArr[MyViewModel.arrnummer + 1][MyViewModel.index]) {
            mainfragment.func_long_c1(v);
        }
    }

    public void  func_long_c2(View v) {
        if (v == mainfragment.btnArr[MyViewModel.arrnummer][MyViewModel.index + 1] || v == mainfragment.btnArr[MyViewModel.arrnummer + 1][MyViewModel.index]) {
            mainfragment.func_long_c2(v);
        }
    }

    public void  func_long_c3(View v) {
        if (v == mainfragment.btnArr[MyViewModel.arrnummer][MyViewModel.index + 1] || v == mainfragment.btnArr[MyViewModel.arrnummer + 1][MyViewModel.index]) {
            mainfragment.func_long_c3(v);
        }
    }

    public void  func_long_c4(View v) {
        if (v == mainfragment.btnArr[MyViewModel.arrnummer][MyViewModel.index + 1] || v == mainfragment.btnArr[MyViewModel.arrnummer + 1][MyViewModel.index]) {
            mainfragment.func_long_c4(v);
        }
    }

    public void  func_long_c5(View v) {
        if (v == mainfragment.btnArr[MyViewModel.arrnummer][MyViewModel.index + 1] || v == mainfragment.btnArr[MyViewModel.arrnummer + 1][MyViewModel.index]) {
            mainfragment.func_long_c5(v);
        }
    }

    public void  func_long_c6(View v) {
        if (v == mainfragment.btnArr[MyViewModel.arrnummer][MyViewModel.index + 1] || v == mainfragment.btnArr[MyViewModel.arrnummer + 1][MyViewModel.index]) {
            mainfragment.func_long_c6(v);
        }
    }

    public void  func_long_c7(View v) {
        if (v == mainfragment.btnArr[MyViewModel.arrnummer][MyViewModel.index + 1] || v == mainfragment.btnArr[MyViewModel.arrnummer + 1][MyViewModel.index]) {
            mainfragment.func_long_c7(v);
        }
    }

    public void  func_long_d1(View v) {
        if (v == mainfragment.btnArr[MyViewModel.arrnummer][MyViewModel.index + 1] || v == mainfragment.btnArr[MyViewModel.arrnummer + 1][MyViewModel.index]) {
            mainfragment.func_long_d1(v);
        }
    }

    public void  func_long_d2(View v) {
        if (v == mainfragment.btnArr[MyViewModel.arrnummer][MyViewModel.index + 1] || v == mainfragment.btnArr[MyViewModel.arrnummer + 1][MyViewModel.index]) {
            mainfragment.func_long_d2(v);
        }
    }

    public void  func_long_d3(View v) {
        if (v == mainfragment.btnArr[MyViewModel.arrnummer][MyViewModel.index + 1] || v == mainfragment.btnArr[MyViewModel.arrnummer + 1][MyViewModel.index]) {
            mainfragment.func_long_d3(v);
        }
    }

    public void  func_long_d4(View v) {
        if (v == mainfragment.btnArr[MyViewModel.arrnummer][MyViewModel.index + 1] || v == mainfragment.btnArr[MyViewModel.arrnummer + 1][MyViewModel.index]) {
            mainfragment.func_long_d4(v);
        }
    }

    public void  func_long_d5(View v) {
        if (v == mainfragment.btnArr[MyViewModel.arrnummer][MyViewModel.index + 1] || v == mainfragment.btnArr[MyViewModel.arrnummer + 1][MyViewModel.index]) {
            mainfragment.func_long_d5(v);
        }
    }

    public void  func_long_d6(View v) {
        if (v == mainfragment.btnArr[MyViewModel.arrnummer][MyViewModel.index + 1] || v == mainfragment.btnArr[MyViewModel.arrnummer + 1][MyViewModel.index]) {
            mainfragment.func_long_d6(v);
        }
    }

    public void  func_long_d7(View v) {
        if (v == mainfragment.btnArr[MyViewModel.arrnummer][MyViewModel.index + 1] || v == mainfragment.btnArr[MyViewModel.arrnummer + 1][MyViewModel.index]) {
            mainfragment.func_long_d7(v);
        }
    }

    public void  func_long_e1(View v) {
        if (v == mainfragment.btnArr[MyViewModel.arrnummer][MyViewModel.index + 1] || v == mainfragment.btnArr[MyViewModel.arrnummer + 1][MyViewModel.index]) {
            mainfragment.func_long_e1(v);
        }
    }

    public void  func_long_e2(View v) {
        if (v == mainfragment.btnArr[MyViewModel.arrnummer][MyViewModel.index + 1] || v == mainfragment.btnArr[MyViewModel.arrnummer + 1][MyViewModel.index]) {
            mainfragment.func_long_e2(v);
        }
    }

    public void  func_long_e3(View v) {
        if (v == mainfragment.btnArr[MyViewModel.arrnummer][MyViewModel.index + 1] || v == mainfragment.btnArr[MyViewModel.arrnummer + 1][MyViewModel.index]) {
            mainfragment.func_long_e3(v);
        }
    }

    public void  func_long_e4(View v) {
        if (v == mainfragment.btnArr[MyViewModel.arrnummer][MyViewModel.index + 1] || v == mainfragment.btnArr[MyViewModel.arrnummer + 1][MyViewModel.index]) {
            mainfragment.func_long_e4(v);
        }
    }

    public void  func_long_e5(View v) {
        if (v == mainfragment.btnArr[MyViewModel.arrnummer][MyViewModel.index + 1] || v == mainfragment.btnArr[MyViewModel.arrnummer + 1][MyViewModel.index]) {
            mainfragment.func_long_e5(v);
        }
    }

    public void  func_long_e6(View v) {
        if (v == mainfragment.btnArr[MyViewModel.arrnummer][MyViewModel.index + 1] || v == mainfragment.btnArr[MyViewModel.arrnummer + 1][MyViewModel.index]) {
            mainfragment.func_long_e6(v);
        }
    }

    public void  func_long_e7(View v) {
        if (v == mainfragment.btnArr[MyViewModel.arrnummer][MyViewModel.index + 1] || v == mainfragment.btnArr[MyViewModel.arrnummer + 1][MyViewModel.index]) {
            mainfragment.func_long_e7(v);
        }
    }

    public void  func_long_f1(View v) {
        if (v == mainfragment.btnArr[MyViewModel.arrnummer][MyViewModel.index + 1] || v == mainfragment.btnArr[MyViewModel.arrnummer + 1][MyViewModel.index]) {
            mainfragment.func_long_f1(v);
        }
    }

    public void  func_long_f2(View v) {
        if (v == mainfragment.btnArr[MyViewModel.arrnummer][MyViewModel.index + 1] || v == mainfragment.btnArr[MyViewModel.arrnummer + 1][MyViewModel.index]) {
            mainfragment.func_long_f2(v);
        }
    }

    public void  func_long_f3(View v) {
        if (v == mainfragment.btnArr[MyViewModel.arrnummer][MyViewModel.index + 1] || v == mainfragment.btnArr[MyViewModel.arrnummer + 1][MyViewModel.index]) {
            mainfragment.func_long_f3(v);
        }
    }

    public void  func_long_f4(View v) {
        if (v == mainfragment.btnArr[MyViewModel.arrnummer][MyViewModel.index + 1] || v == mainfragment.btnArr[MyViewModel.arrnummer + 1][MyViewModel.index]) {
            mainfragment.func_long_f4(v);
        }
    }

    public void  func_long_f5(View v) {
        if (v == mainfragment.btnArr[MyViewModel.arrnummer][MyViewModel.index + 1] || v == mainfragment.btnArr[MyViewModel.arrnummer + 1][MyViewModel.index]) {
            mainfragment.func_long_f5(v);
        }
    }

    public void  func_long_f6(View v) {
        if (v == mainfragment.btnArr[MyViewModel.arrnummer][MyViewModel.index + 1] || v == mainfragment.btnArr[MyViewModel.arrnummer + 1][MyViewModel.index]) {
            mainfragment.func_long_f6(v);
        }
    }

    public void  func_long_f7(View v) {
        if (v == mainfragment.btnArr[MyViewModel.arrnummer][MyViewModel.index + 1] || v == mainfragment.btnArr[MyViewModel.arrnummer + 1][MyViewModel.index]) {
            mainfragment.func_long_f7(v);
        }
    }

    public void  func_long_g1(View v) {
        if (v == mainfragment.btnArr[MyViewModel.arrnummer][MyViewModel.index + 1] || v == mainfragment.btnArr[MyViewModel.arrnummer + 1][MyViewModel.index]) {
            mainfragment.func_long_g1(v);
        }
    }

    public void  func_long_g2(View v) {
        if (v == mainfragment.btnArr[MyViewModel.arrnummer][MyViewModel.index + 1] || v == mainfragment.btnArr[MyViewModel.arrnummer + 1][MyViewModel.index]) {
            mainfragment.func_long_g2(v);
        }
    }

    public void  func_long_g3(View v) {
        if (v == mainfragment.btnArr[MyViewModel.arrnummer][MyViewModel.index + 1] || v == mainfragment.btnArr[MyViewModel.arrnummer + 1][MyViewModel.index]) {
            mainfragment.func_long_g3(v);
        }
    }

    public void  func_long_g4(View v) {
        if (v == mainfragment.btnArr[MyViewModel.arrnummer][MyViewModel.index + 1] || v == mainfragment.btnArr[MyViewModel.arrnummer + 1][MyViewModel.index]) {
            mainfragment.func_long_g4(v);
        }
    }

    public void  func_long_g5(View v) {
        if (v == mainfragment.btnArr[MyViewModel.arrnummer][MyViewModel.index + 1] || v == mainfragment.btnArr[MyViewModel.arrnummer + 1][MyViewModel.index]) {
            mainfragment.func_long_g5(v);
        }
    }

    public void  func_long_g6(View v) {
        if (v == mainfragment.btnArr[MyViewModel.arrnummer][MyViewModel.index + 1] || v == mainfragment.btnArr[MyViewModel.arrnummer + 1][MyViewModel.index]) {
            mainfragment.func_long_g6(v);
        }
    }

    public void  func_long_g7(View v) {
        if (v == mainfragment.btnArr[MyViewModel.arrnummer][MyViewModel.index + 1] || v == mainfragment.btnArr[MyViewModel.arrnummer + 1][MyViewModel.index]) {
            mainfragment.func_long_g7(v);
        }

    }


}

