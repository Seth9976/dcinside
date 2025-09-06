package com.google.android.material.tabs;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import androidx.appcompat.widget.TintTypedArray;
import com.google.android.material.R.styleable;

public class TabItem extends View {
    public final CharSequence a;
    public final Drawable b;
    public final int c;

    public TabItem(Context context0) {
        this(context0, null);
    }

    public TabItem(Context context0, AttributeSet attributeSet0) {
        super(context0, attributeSet0);
        TintTypedArray tintTypedArray0 = TintTypedArray.F(context0, attributeSet0, styleable.TabItem);
        this.a = tintTypedArray0.x(styleable.TabItem_android_text);
        this.b = tintTypedArray0.h(styleable.TabItem_android_icon);
        this.c = tintTypedArray0.u(styleable.TabItem_android_layout, 0);
        tintTypedArray0.I();
    }
}

