package com.bytedance.sdk.component.adexpress.dynamic.dynamicview;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.PorterDuff.Mode;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import androidx.annotation.NonNull;

public class ltE extends Drawable {
    private Paint PjT;
    private int ReZ;
    private int Zh;
    private RectF cr;

    public ltE(int v, int v1) {
        this.ReZ = v;
        this.Zh = v1;
        Paint paint0 = new Paint();
        this.PjT = paint0;
        paint0.setColor(0);
        this.PjT.setAntiAlias(true);
        this.PjT.setShadowLayer(((float)v1), 0.0f, 0.0f, 0xFF000000);
        this.PjT.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_ATOP));
    }

    @Override  // android.graphics.drawable.Drawable
    public void draw(@NonNull Canvas canvas0) {
        canvas0.drawRoundRect(this.cr, ((float)this.ReZ), ((float)this.ReZ), this.PjT);
    }

    @Override  // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override  // android.graphics.drawable.Drawable
    public void setAlpha(int v) {
        this.PjT.setAlpha(v);
    }

    @Override  // android.graphics.drawable.Drawable
    public void setBounds(int v, int v1, int v2, int v3) {
        super.setBounds(v, v1, v2, v3);
        this.cr = new RectF(((float)(v + this.Zh)), ((float)(v1 + this.Zh)), ((float)(v2 - this.Zh)), ((float)(v3 - this.Zh)));
    }

    @Override  // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter0) {
        this.PjT.setColorFilter(colorFilter0);
    }
}

