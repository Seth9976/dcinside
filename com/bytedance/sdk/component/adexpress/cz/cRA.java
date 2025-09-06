package com.bytedance.sdk.component.adexpress.cz;

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
import android.widget.ImageView;

public class cRA extends ImageView {
    private Paint PjT;
    private int ReZ;
    private int Zh;
    private Matrix cr;

    public cRA(Context context0) {
        this(context0, null);
    }

    public cRA(Context context0, AttributeSet attributeSet0) {
        this(context0, attributeSet0, 0);
    }

    public cRA(Context context0, AttributeSet attributeSet0, int v) {
        super(context0, attributeSet0, v);
        this.Zh = 25;
        this.ReZ = 25;
        Paint paint0 = new Paint();
        this.PjT = paint0;
        paint0.setAntiAlias(true);
        this.PjT.setFilterBitmap(true);
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
        if(drawable0 != null) {
            Bitmap bitmap0 = this.PjT(drawable0);
            if(bitmap0 != null) {
                BitmapShader bitmapShader0 = new BitmapShader(bitmap0, Shader.TileMode.REPEAT, Shader.TileMode.REPEAT);
                float f = bitmap0.getWidth() == this.getWidth() && bitmap0.getHeight() == this.getHeight() ? 1.0f : Math.max(((float)this.getWidth()) * 1.0f / ((float)bitmap0.getWidth()), ((float)this.getHeight()) * 1.0f / ((float)bitmap0.getHeight()));
                this.cr.setScale(f, f);
                bitmapShader0.setLocalMatrix(this.cr);
                this.PjT.setShader(bitmapShader0);
                canvas0.drawRoundRect(new RectF(0.0f, 0.0f, ((float)this.getWidth()), ((float)this.getHeight())), ((float)this.Zh), ((float)this.ReZ), this.PjT);
                return;
            }
            super.onDraw(canvas0);
            return;
        }
        super.onDraw(canvas0);
    }

    public void setXRound(int v) {
        this.Zh = v;
        this.postInvalidate();
    }

    public void setYRound(int v) {
        this.ReZ = v;
        this.postInvalidate();
    }
}

