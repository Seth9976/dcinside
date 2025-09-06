package com.bytedance.sdk.openadsdk.core.widget;

import android.content.Context;
import android.graphics.Bitmap.Config;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Shader.TileMode;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import com.bytedance.sdk.openadsdk.core.JQp.cr;

public class xE extends cr {
    private final RectF JQp;
    private final Paint PjT;
    private int ReZ;
    private int Zh;
    private final Matrix cr;
    private BitmapShader cz;

    public xE(Context context0) {
        this(context0, null);
    }

    public xE(Context context0, AttributeSet attributeSet0) {
        this(context0, attributeSet0, 0);
    }

    public xE(Context context0, AttributeSet attributeSet0, int v) {
        super(context0, attributeSet0, v);
        this.Zh = 25;
        this.ReZ = 25;
        this.JQp = new RectF();
        Paint paint0 = new Paint();
        this.PjT = paint0;
        paint0.setAntiAlias(true);
        paint0.setFilterBitmap(true);
        this.cr = new Matrix();
    }

    private Bitmap PjT(Drawable drawable0) {
        if(drawable0 == null) {
            return null;
        }
        if(drawable0 instanceof BitmapDrawable) {
            return ((BitmapDrawable)drawable0).getBitmap();
        }
        int v = drawable0.getIntrinsicWidth() > 0 ? drawable0.getIntrinsicWidth() : this.getWidth();
        int v1 = drawable0.getIntrinsicHeight() > 0 ? drawable0.getIntrinsicHeight() : this.getHeight();
        Bitmap bitmap0 = Bitmap.createBitmap(v, v1, Bitmap.Config.ARGB_8888);
        Canvas canvas0 = new Canvas(bitmap0);
        drawable0.setBounds(0, 0, v, v1);
        drawable0.draw(canvas0);
        return bitmap0;
    }

    @Override  // android.widget.ImageView
    protected void onDraw(Canvas canvas0) {
        Drawable drawable0 = this.getDrawable();
        if(drawable0 == null) {
            super.onDraw(canvas0);
            return;
        }
        if(this.cz == null) {
            Bitmap bitmap0 = this.PjT(drawable0);
            if(bitmap0 != null) {
                this.cz = new BitmapShader(bitmap0, Shader.TileMode.REPEAT, Shader.TileMode.REPEAT);
                float f = bitmap0.getWidth() == this.getWidth() && bitmap0.getHeight() == this.getHeight() ? 1.0f : Math.max(((float)this.getWidth()) * 1.0f / ((float)bitmap0.getWidth()), ((float)this.getHeight()) * 1.0f / ((float)bitmap0.getHeight()));
                this.cr.setScale(f, f);
                this.cz.setLocalMatrix(this.cr);
            }
        }
        BitmapShader bitmapShader0 = this.cz;
        if(bitmapShader0 != null) {
            this.PjT.setShader(bitmapShader0);
            canvas0.drawRoundRect(this.JQp, ((float)this.Zh), ((float)this.ReZ), this.PjT);
            return;
        }
        super.onDraw(canvas0);
    }

    @Override  // android.view.View
    protected void onSizeChanged(int v, int v1, int v2, int v3) {
        super.onSizeChanged(v, v1, v2, v3);
        this.JQp.set(0.0f, 0.0f, ((float)v), ((float)v1));
    }

    public void setXRound(int v) {
        this.Zh = v;
        this.postInvalidate();
    }

    public void setYRound(int v) {
        this.ReZ = v;
        this.postInvalidate();
    }

    @Override  // android.view.View
    public void unscheduleDrawable(Drawable drawable0) {
        super.unscheduleDrawable(drawable0);
        this.cz = null;
    }
}

