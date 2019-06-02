package net.juntermanns.mybuttons;

import android.content.Context;
import android.content.res.TypedArray;
import android.support.text.emoji.widget.EmojiButton;
import android.util.AttributeSet;
import android.view.View;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class MyEmojiButton extends EmojiButton {

    public MyEmojiButton(final Context context, final AttributeSet attrs) {
        super(context, attrs);
        TypedArray a = context.obtainStyledAttributes(attrs, R.styleable.MyEmojiButton);

        for (int i = 0; i < a.getIndexCount(); ++i)
        {
            int attr = a.getIndex(i);
            switch (attr)
            {
                case R.styleable.MyEmojiButton_onKeyLongPress: {
                    if (context.isRestricted()) {
                        throw new IllegalStateException("The "+getClass().getCanonicalName()+":onKeyLongPress attribute cannot "
                                + "be used within a restricted context");
                    }

                    final String handlerName = a.getString(attr);
                    if (handlerName != null) {
                        setOnLongClickListener(new OnLongClickListener() {
                            private Method mHandler;

                            @Override
                            public boolean onLongClick(final View p_v) {
                                boolean result = false;
                                if (mHandler == null) {
                                    try {
                                        mHandler = getContext().getClass().getMethod(handlerName, View.class);
                                    } catch (NoSuchMethodException e) {
                                        int id = getId();
                                        String idText = id == NO_ID ? "" : " with id '"
                                                + getContext().getResources().getResourceEntryName(
                                                id) + "'";
                                        throw new IllegalStateException("Could not find a method " +
                                                handlerName + "(View) in the activity "
                                                + getContext().getClass() + " for onKeyLongPress handler"
                                                + " on view " + MyEmojiButton.this.getClass() + idText, e);
                                    }
                                }

                                try {
                                    mHandler.invoke(getContext(), MyEmojiButton.this);
                                    result = true;
                                } catch (IllegalAccessException e) {
                                    throw new IllegalStateException("Could not execute non "
                                            + "public method of the activity", e);
                                } catch (InvocationTargetException e) {
                                    throw new IllegalStateException("Could not execute "
                                            + "method of the activity", e);
                                }
                                return result;
                            }
                        });
                    }
                    break;
                }
                default:
                    break;
            }
        }
        a.recycle();

    }
    
}
