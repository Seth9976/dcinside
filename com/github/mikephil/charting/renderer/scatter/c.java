package com.github.mikephil.charting.renderer.scatter;

import android.graphics.Canvas;
import android.graphics.Paint.Style;
import android.graphics.Paint;
import com.github.mikephil.charting.utils.l;
import t1.k;

public class c implements e {
    @Override  // com.github.mikephil.charting.renderer.scatter.e
    public void a(Canvas canvas0, k k0, l l0, float f, float f1, Paint paint0) {
        float f2 = k0.p();
        float f3 = com.github.mikephil.charting.utils.k.e(k0.p1());
        float f4 = (f2 - f3 * 2.0f) / 2.0f;
        int v = k0.A0();
        if(((double)f2) > 0.0) {
            paint0.setStyle(Paint.Style.STROKE);
            paint0.setStrokeWidth(f4);
            canvas0.drawCircle(f, f1, f4 / 2.0f + f3, paint0);
            if(v != 0x112233) {
                paint0.setStyle(Paint.Style.FILL);
                paint0.setColor(v);
                canvas0.drawCircle(f, f1, f3, paint0);
            }
        }
        else {
            paint0.setStyle(Paint.Style.FILL);
            canvas0.drawCircle(f, f1, f2 / 2.0f, paint0);
        }
    }
}

