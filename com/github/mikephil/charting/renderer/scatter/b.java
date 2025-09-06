package com.github.mikephil.charting.renderer.scatter;

import android.graphics.Canvas;
import android.graphics.Paint.Style;
import android.graphics.Paint;
import com.github.mikephil.charting.utils.l;
import t1.k;

public class b implements e {
    @Override  // com.github.mikephil.charting.renderer.scatter.e
    public void a(Canvas canvas0, k k0, l l0, float f, float f1, Paint paint0) {
        float f2 = k0.p();
        paint0.setStyle(Paint.Style.STROKE);
        paint0.setStrokeWidth(com.github.mikephil.charting.utils.k.e(1.0f));
        float f3 = f2 / 2.0f * 2.0f;
        float f4 = f1 - f3;
        canvas0.drawLine(f, f4, f + f3, f1, paint0);
        canvas0.drawLine(f, f4, f - f3, f1, paint0);
    }
}

