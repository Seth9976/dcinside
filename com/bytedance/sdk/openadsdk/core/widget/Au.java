package com.bytedance.sdk.openadsdk.core.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Shader.TileMode;
import android.view.View;
import java.util.ArrayList;

public class Au extends View {
    static final class PjT {
        public Paint PjT;
        float ReZ;
        public float Zh;
        float cr;

        public PjT(Paint paint0, float f, float f1, float f2) {
            this.PjT = paint0;
            this.Zh = f;
            this.ReZ = f1;
            this.cr = f2;
        }
    }

    private int Au;
    private final Paint JQp;
    private static final int[] PjT;
    private final RectF ReZ;
    private int SM;
    private int XX;
    private final RectF Zh;
    private final ArrayList cr;
    private final Paint cz;

    static {
        Au.PjT = new int[]{Color.parseColor("#1AFFFFFF"), Color.parseColor("#4DFFFFFF"), Color.parseColor("#99FFFFFF")};
    }

    public Au(Context context0) {
        super(context0);
        this.Zh = new RectF();
        this.ReZ = new RectF();
        this.cr = new ArrayList();
        this.cz = new Paint();
        Paint paint0 = new Paint();
        this.JQp = paint0;
        paint0.setColor(Color.parseColor("#D9D9D9"));
    }

    private void PjT() {
        if(this.XX <= 0) {
            return;
        }
        int v = this.getWidth();
        this.ReZ.right = (float)Math.max(this.SM, ((int)(((float)this.Au) * 1.0f / 100.0f * ((float)v))));
        this.invalidate();
    }

    @Override  // android.view.View
    protected void onDraw(Canvas canvas0) {
        super.onDraw(canvas0);
        canvas0.drawRoundRect(this.Zh, ((float)this.XX), ((float)this.XX), this.JQp);
        canvas0.drawRoundRect(this.ReZ, ((float)this.XX), ((float)this.XX), this.cz);
        int v = canvas0.save();
        canvas0.translate(this.ReZ.right - ((float)this.SM), 0.0f);
        for(Object object0: this.cr) {
            canvas0.drawCircle(((PjT)object0).ReZ, ((PjT)object0).cr, ((PjT)object0).Zh, ((PjT)object0).PjT);
        }
        canvas0.restoreToCount(v);
    }

    @Override  // android.view.View
    protected void onSizeChanged(int v, int v1, int v2, int v3) {
        super.onSizeChanged(v, v1, v2, v3);
        this.XX = v1 / 2;
        this.SM = v1 / 2 * 5;
        this.Zh.set(0.0f, 0.0f, ((float)v), ((float)v1));
        this.ReZ.set(0.0f, 0.0f, 0.0f, ((float)v1));
        LinearGradient linearGradient0 = new LinearGradient(0.0f, 0.0f, ((float)v), ((float)v1), new int[]{Color.parseColor("#90C0FF"), Color.parseColor("#196BE4")}, null, Shader.TileMode.CLAMP);
        this.cz.setShader(linearGradient0);
        this.cr.clear();
        float f = ((float)this.XX) / 4.0f;
        int[] arr_v = Au.PjT;
        for(int v4 = 0; v4 < arr_v.length; ++v4) {
            int v5 = arr_v[v4];
            Paint paint0 = new Paint();
            paint0.setColor(v5);
            PjT au$PjT0 = new PjT(paint0, ((float)this.XX) / 2.0f, f, ((float)v1) / 2.0f);
            this.cr.add(au$PjT0);
            f += ((float)this.XX) / 2.0f * 3.0f;
        }
        this.PjT();
    }

    public void setProgress(int v) {
        int v1 = this.Au;
        if(v1 == v) {
            return;
        }
        if(v < 0) {
            v = 0;
        }
        else if(v > 100) {
            v = 100;
        }
        if(v1 == v) {
            return;
        }
        this.Au = v;
        this.PjT();
    }
}

