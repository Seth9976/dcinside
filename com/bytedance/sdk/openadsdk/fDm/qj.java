package com.bytedance.sdk.openadsdk.fDm;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint.Cap;
import android.graphics.Paint.Style;
import android.graphics.Paint;
import android.view.View;

public class qj extends View {
    private final Paint PjT;
    private float ReZ;
    private float Zh;

    public qj(Context context0) {
        super(context0);
        this.setBackgroundColor(Color.parseColor("#8A8A8A"));
        Paint paint0 = new Paint();
        this.PjT = paint0;
        paint0.setColor(-1);
        paint0.setStyle(Paint.Style.FILL);
        paint0.setStrokeCap(Paint.Cap.ROUND);
    }

    @Override  // android.view.View
    protected void onDraw(Canvas canvas0) {
        super.onDraw(canvas0);
        float f = this.ReZ;
        if(f > 0.0f) {
            canvas0.drawLine(0.0f, this.Zh, f, this.Zh, this.PjT);
        }
    }

    @Override  // android.view.View
    protected void onSizeChanged(int v, int v1, int v2, int v3) {
        super.onSizeChanged(v, v1, v2, v3);
        this.Zh = 1.0f * ((float)v1) / 2.0f;
        this.PjT.setStrokeWidth(((float)v1));
    }

    public void setProgress(float f) {
        this.ReZ = ((float)this.getWidth()) * f;
        this.invalidate();
    }
}

