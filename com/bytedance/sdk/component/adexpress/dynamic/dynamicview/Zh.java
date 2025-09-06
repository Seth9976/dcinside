package com.bytedance.sdk.component.adexpress.dynamic.dynamicview;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path.Direction;
import android.graphics.Path;
import android.graphics.PorterDuff.Mode;
import android.graphics.PorterDuffXfermode;
import android.graphics.drawable.GradientDrawable.Orientation;
import android.graphics.drawable.GradientDrawable;
import androidx.annotation.ColorInt;
import androidx.annotation.NonNull;

public class Zh extends GradientDrawable {
    protected Path PjT;
    private final Paint Zh;

    public Zh() {
        this.PjT = new Path();
        Paint paint0 = new Paint(1);
        this.Zh = paint0;
        paint0.setColor(-1);
    }

    public Zh(GradientDrawable.Orientation gradientDrawable$Orientation0, @ColorInt int[] arr_v) {
        super(gradientDrawable$Orientation0, arr_v);
        this.PjT = new Path();
        Paint paint0 = new Paint(1);
        this.Zh = paint0;
        paint0.setColor(-1);
    }

    public void PjT(int v, int v1, int v2, int v3) {
        this.PjT.addRect(((float)v), ((float)v1), ((float)v2), ((float)v3), Path.Direction.CW);
        this.invalidateSelf();
    }

    protected void PjT(Canvas canvas0) {
        super.draw(canvas0);
    }

    @Override  // android.graphics.drawable.GradientDrawable
    public void draw(@NonNull Canvas canvas0) {
        if(this.PjT != null && !this.PjT.isEmpty()) {
            int v = canvas0.saveLayer(0.0f, 0.0f, ((float)canvas0.getWidth()), ((float)canvas0.getHeight()), this.Zh, 0x1F);
            this.PjT(canvas0);
            PorterDuffXfermode porterDuffXfermode0 = new PorterDuffXfermode(PorterDuff.Mode.CLEAR);
            this.Zh.setXfermode(porterDuffXfermode0);
            canvas0.drawPath(this.PjT, this.Zh);
            this.Zh.setXfermode(null);
            canvas0.restoreToCount(v);
            return;
        }
        this.PjT(canvas0);
    }
}

