package net.juntermanns.mybuttons;

import android.app.Activity;
import android.content.Context;
import android.os.Handler;
import android.support.text.emoji.widget.EmojiButton;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.widget.LinearLayout;


public class MyMsgBox {

    private static final int ANIMATION_DURATION =10;

    private int HIDE_DELAY;

    private View mContainer;

    private int gravity;

    private EmojiButton mTextView;

    private Handler mHandler;

    private AlphaAnimation mFadeInAnimation;

    private AlphaAnimation mFadeOutAnimation;


    public MyMsgBox(Context context, int HIDE_DELAY, int gravity) {
        ViewGroup container = (ViewGroup) ((Activity) context)
                .findViewById(android.R.id.content);
        View v = ((Activity) context).getLayoutInflater().inflate(
                R.layout.newmb__messagebar, container);
        this.HIDE_DELAY = HIDE_DELAY;
        this.gravity = gravity;

        init(v);
    }

    private void init(View v) {
        mContainer = v.findViewById(R.id.mbContainer);
        mContainer.setVisibility(View.INVISIBLE);
        mTextView =  v.findViewById(R.id.reactionButton);
        mFadeInAnimation = new AlphaAnimation(0.0f, 0.1f);
        mFadeOutAnimation = new AlphaAnimation(5.0f, 0.0f);
        mFadeOutAnimation.setDuration(2000);
        mFadeOutAnimation
                .setAnimationListener(new Animation.AnimationListener() {
                    @Override
                    public void onAnimationStart(Animation animation) {
                    }

                    @Override
                    public void onAnimationEnd(Animation animation) {
                        mContainer.setVisibility(View.INVISIBLE);
                    }

                    @Override
                    public void onAnimationRepeat(Animation animation) {
                    }
                });

        mHandler = new Handler();
    }

    public void show(String message) {
        mContainer.setVisibility(View.VISIBLE);

        ((LinearLayout) mContainer).setGravity(gravity
                | Gravity.CENTER_VERTICAL);

        mTextView.setText(message);

        mFadeInAnimation.setDuration(ANIMATION_DURATION);

        mContainer.startAnimation(mFadeInAnimation);
        mHandler.postDelayed(mHideRunnable, HIDE_DELAY);
    }

    public void hide(){
        mContainer.setVisibility(View.GONE);
    }

    private final Runnable mHideRunnable = new Runnable() {
        @Override
        public void run() {
            mContainer.startAnimation(mFadeOutAnimation);

        }
    };

}