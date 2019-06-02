package net.juntermanns.mybuttons;

import android.animation.ArgbEvaluator;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.graphics.Color;
import android.widget.Button;

import static net.juntermanns.mybuttons.MainActivity.gameMode;

public class ButtonColorAnimatorIndex {
    Boolean isRunning;
    ObjectAnimator colorAnim;
    Button btnIndex;


    public ButtonColorAnimatorIndex(Button btnIndex) {
        this.btnIndex = btnIndex;

    }

    public void stop(){
        colorAnim.pause();
        isRunning=false;
    }
    public void invokeColorTextAnimationIndex(Button btnIndex) {
        colorAnim = ObjectAnimator.ofInt(btnIndex, "textColor", Color.MAGENTA, Color.WHITE);
        colorAnim.setDuration(555);
        colorAnim.setEvaluator(new ArgbEvaluator());
        colorAnim.setRepeatCount(ValueAnimator.INFINITE);
        colorAnim.setRepeatMode(ValueAnimator.REVERSE);
        colorAnim.start();
    }
    public void invokeColorBackgroundAnimationIndex(Button btnArrnummer) {
        colorAnim = ObjectAnimator.ofInt(btnArrnummer, "BackgroundColor", Color.GRAY, Color.WHITE);
        colorAnim.setDuration(1111);
        colorAnim.setEvaluator(new ArgbEvaluator());
        colorAnim.setRepeatCount(ValueAnimator.INFINITE);
        colorAnim.setRepeatMode(ValueAnimator.REVERSE);
        colorAnim.start();
    }
    public void invokeColor(Button btn){
        switch (gameMode){
            case 1:
            case 3:
                colorAnim = ObjectAnimator.ofInt(btn, "textColor", Color.WHITE, Color.MAGENTA);
                colorAnim.setDuration(555);
                colorAnim.setEvaluator(new ArgbEvaluator());
                colorAnim.setRepeatCount(ValueAnimator.INFINITE);
                colorAnim.setRepeatMode(ValueAnimator.REVERSE);
                colorAnim.start();
                break;
            case 2:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
                colorAnim = ObjectAnimator.ofInt(btn, "BackgroundColor", Color.WHITE, Color.GRAY);
                colorAnim.setDuration(1111);
                colorAnim.setEvaluator(new ArgbEvaluator());
                colorAnim.setRepeatCount(ValueAnimator.INFINITE);
                colorAnim.setRepeatMode(ValueAnimator.REVERSE);
                colorAnim.start();
                break;
        }
    }

}
