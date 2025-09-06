package com.github.mikephil.charting.components;

import android.graphics.Canvas;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.utils.g;

public interface d {
    void a(Canvas arg1, float arg2, float arg3);

    void b(Entry arg1, com.github.mikephil.charting.highlight.d arg2);

    g c(float arg1, float arg2);

    g getOffset();
}

