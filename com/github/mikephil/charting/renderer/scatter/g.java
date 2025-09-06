package com.github.mikephil.charting.renderer.scatter;

import android.graphics.Canvas;
import android.graphics.Paint.Style;
import android.graphics.Paint;
import android.graphics.Path;
import com.github.mikephil.charting.utils.l;
import t1.k;

public class g implements e {
    protected Path a;

    public g() {
        this.a = new Path();
    }

    @Override  // com.github.mikephil.charting.renderer.scatter.e
    public void a(Canvas canvas0, k k0, l l0, float f, float f1, Paint paint0) {
        float f2 = k0.p();
        float f3 = (f2 - com.github.mikephil.charting.utils.k.e(k0.p1()) * 2.0f) / 2.0f;
        int v = k0.A0();
        paint0.setStyle(Paint.Style.FILL);
        Path path0 = this.a;
        path0.reset();
        float f4 = f1 - f2 / 2.0f;
        path0.moveTo(f, f4);
        float f5 = f + f2 / 2.0f;
        float f6 = f1 + f2 / 2.0f;
        path0.lineTo(f5, f6);
        float f7 = f - f2 / 2.0f;
        path0.lineTo(f7, f6);
        int v1 = Double.compare(f2, 0.0);
        if(v1 > 0) {
            path0.lineTo(f, f4);
            float f8 = f7 + f3;
            float f9 = f6 - f3;
            path0.moveTo(f8, f9);
            path0.lineTo(f5 - f3, f9);
            path0.lineTo(f, f4 + f3);
            path0.lineTo(f8, f9);
        }
        path0.close();
        canvas0.drawPath(path0, paint0);
        path0.reset();
        if(v1 > 0 && v != 0x112233) {
            paint0.setColor(v);
            path0.moveTo(f, f4 + f3);
            float f10 = f6 - f3;
            path0.lineTo(f5 - f3, f10);
            path0.lineTo(f7 + f3, f10);
            path0.close();
            canvas0.drawPath(path0, paint0);
            path0.reset();
        }
    }
}

