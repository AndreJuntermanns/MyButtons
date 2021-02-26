package net.juntermanns.mybuttons;

import android.animation.ArgbEvaluator;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.graphics.Color;
import android.widget.Button;

import static net.juntermanns.mybuttons.ui.main.MyViewModel.gameMode;

public class ButtonColorAnimatorArrnummer implements Runnable {
    private Boolean isRunning;
    private ObjectAnimator colorAnim2;
    private Button btnArrnummer;

    public ButtonColorAnimatorArrnummer(Button btnArrnummer) {

        this.btnArrnummer = btnArrnummer;
    }


    public void run() {
        isRunning=true;

        invokeColorTextAnimationArrnummer(btnArrnummer);

    }
    public void stop(){
        colorAnim2.pause();
        isRunning=false;
    }


    public void invokeColorTextAnimationArrnummer(Button btnArrnummer) {                                                      /** Animator animiert zwei Felder **/
        colorAnim2 = ObjectAnimator.ofInt(btnArrnummer, "textColor", Color.BLACK, Color.MAGENTA);
        colorAnim2.setDuration(1000);
        colorAnim2.setEvaluator(new ArgbEvaluator());
        colorAnim2.setRepeatCount(ValueAnimator.INFINITE);
        colorAnim2.setRepeatMode(ValueAnimator.REVERSE);
        colorAnim2.start();
    }
    public void invokeColorBackgroundAnimationArrnummer(Button btnArrnummer) {
        colorAnim2 = ObjectAnimator.ofInt(btnArrnummer, "BackgroundColor", Color.WHITE, Color.GRAY);
        colorAnim2.setDuration(1000);
        colorAnim2.setEvaluator(new ArgbEvaluator());
        colorAnim2.setRepeatCount(ValueAnimator.INFINITE);
        colorAnim2.setRepeatMode(ValueAnimator.REVERSE);
        colorAnim2.start();
    }

    public void invokeColor(Button btn){
        switch (gameMode.getStatus()){
            case 1:
            case 3:
                colorAnim2 = ObjectAnimator.ofInt(btn, "textColor", Color.BLACK, Color.MAGENTA);
                colorAnim2.setDuration(1000);
                colorAnim2.setEvaluator(new ArgbEvaluator());
                colorAnim2.setRepeatCount(ValueAnimator.INFINITE);
                colorAnim2.setRepeatMode(ValueAnimator.REVERSE);
                colorAnim2.start();
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
                colorAnim2 = ObjectAnimator.ofInt(btn, "BackgroundColor", Color.WHITE, Color.GRAY);
                colorAnim2.setDuration(1000);
                colorAnim2.setEvaluator(new ArgbEvaluator());
                colorAnim2.setRepeatCount(ValueAnimator.INFINITE);
                colorAnim2.setRepeatMode(ValueAnimator.REVERSE);
                colorAnim2.start();
                break;
        }
    }

}
