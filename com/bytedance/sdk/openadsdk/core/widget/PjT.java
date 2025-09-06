package com.bytedance.sdk.openadsdk.core.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Bitmap.Config;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff.Mode;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.NinePatchDrawable;
import com.bytedance.sdk.openadsdk.core.JQp.cr;

@SuppressLint({"AppCompatCustomView"})
public class PjT extends cr {
    private int PjT;
    private int Zh;

    public PjT(Context context0) {
        super(context0);
        this.PjT = 0;
        this.Zh = 0;
    }

    private Bitmap PjT(Bitmap bitmap0, int v) {
        Bitmap bitmap1;
        int v1 = bitmap0.getWidth();
        int v2 = bitmap0.getHeight();
        if(v2 > v1) {
            bitmap1 = Bitmap.createBitmap(bitmap0, 0, (v2 - v1) / 2, v1, v1);
        }
        else {
            bitmap1 = v2 >= v1 ? null : Bitmap.createBitmap(bitmap0, (v1 - v2) / 2, 0, v2, v2);
        }
        if(bitmap1 != null) {
            bitmap0 = bitmap1;
        }
        if(bitmap0.getWidth() != v * 2 || bitmap0.getHeight() != v * 2) {
            bitmap0 = Bitmap.createScaledBitmap(bitmap0, v * 2, v * 2, true);
        }
        Bitmap bitmap2 = Bitmap.createBitmap(bitmap0.getWidth(), bitmap0.getHeight(), Bitmap.Config.ARGB_8888);
        Canvas canvas0 = new Canvas(bitmap2);
        Paint paint0 = this.getPaint();
        Rect rect0 = new Rect(0, 0, bitmap0.getWidth(), bitmap0.getHeight());
        canvas0.drawARGB(0, 0, 0, 0);
        canvas0.drawCircle(((float)(bitmap0.getWidth() / 2)), ((float)(bitmap0.getHeight() / 2)), ((float)(bitmap0.getWidth() / 2)), paint0);
        paint0.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
        canvas0.drawBitmap(bitmap0, rect0, rect0, paint0);
        return bitmap2;
    }

    private boolean PjT() {
        return this.getDrawable() == null || this.getWidth() == 0 || this.getHeight() == 0;
    }

    private boolean Zh() {
        return this.getDrawable().getClass() == NinePatchDrawable.class || this.getDrawable() instanceof BitmapDrawable && ((BitmapDrawable)this.getDrawable()).getBitmap() == null;
    }

    private Paint getPaint() {
        Paint paint0 = new Paint();
        paint0.setAntiAlias(true);
        paint0.setFilterBitmap(true);
        paint0.setDither(true);
        return paint0;
    }

    private int getRadius() {
        if(this.PjT == 0) {
            this.PjT = this.getWidth();
        }
        if(this.Zh == 0) {
            this.Zh = this.getHeight();
        }
        int v = this.PjT;
        int v1 = this.Zh;
        if(v >= v1) {
            v = v1;
        }
        return v / 2;
    }

    @Override  // android.widget.ImageView
    protected void onDraw(Canvas canvas0) {
        Bitmap bitmap1;
        Bitmap bitmap0;
        if(this.PjT()) {
            return;
        }
        this.measure(0, 0);
        if(this.Zh()) {
            return;
        }
        try {
            bitmap0 = null;
            bitmap0 = ((BitmapDrawable)this.getDrawable()).getBitmap().copy(Bitmap.Config.ARGB_8888, true);
        }
        catch(Throwable unused_ex) {
        }
        if(bitmap0 == null) {
            super.onDraw(canvas0);
            return;
        }
        int v = this.getRadius();
        try {
            bitmap1 = null;
            bitmap1 = this.PjT(bitmap0, v);
        }
        catch(Throwable unused_ex) {
        }
        if(bitmap1 == null) {
            super.onDraw(canvas0);
            return;
        }
        canvas0.drawBitmap(bitmap1, ((float)(this.PjT / 2 - v)), ((float)(this.Zh / 2 - v)), null);
    }
}

