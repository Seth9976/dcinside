package com.github.mikephil.charting.renderer.scatter;

import android.graphics.Canvas;
import android.graphics.Paint.Style;
import android.graphics.Paint;
import com.github.mikephil.charting.utils.l;
import t1.k;

public class h implements e {
    @Override  // com.github.mikephil.charting.renderer.scatter.e
    public void a(Canvas canvas0, k k0, l l0, float f, float f1, Paint paint0) {
        float f2 = k0.p();
        paint0.setStyle(Paint.Style.STROKE);
        paint0.setStrokeWidth(com.github.mikephil.charting.utils.k.e(1.0f));
        float f3 = f - f2 / 2.0f;
        float f4 = f + f2 / 2.0f;
        float f5 = f1 - f2 / 2.0f;
        float f6 = f2 / 2.0f + f1;
        canvas0.drawLine(f3, f5, f4, f6, paint0);
        canvas0.drawLine(f4, f5, f3, f6, paint0);
    }
}

