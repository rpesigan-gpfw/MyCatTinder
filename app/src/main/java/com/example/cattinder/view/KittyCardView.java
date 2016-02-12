package com.example.cattinder.view;

import com.example.cattinder.R;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.FrameLayout;

public class KittyCardView extends FrameLayout{

    public KittyCardView(Context context) {
        this(context, null);
    }

    public KittyCardView(Context context, AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public KittyCardView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        LayoutInflater.from(context).inflate(R.layout.kitty_cat, this, true);
    }
}
