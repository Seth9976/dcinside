package com.dcinside.app.album.util;

import android.content.Context;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatImageView;

public class SquareImageView extends AppCompatImageView {
    public SquareImageView(Context context0) {
        super(context0);
    }

    public SquareImageView(Context context0, AttributeSet attributeSet0) {
        super(context0, attributeSet0);
    }

    public SquareImageView(Context context0, AttributeSet attributeSet0, int v) {
        super(context0, attributeSet0, v);
    }

    @Override  // android.widget.ImageView
    protected void onMeasure(int v, int v1) {
        super.onMeasure(v, v);
    }
}

