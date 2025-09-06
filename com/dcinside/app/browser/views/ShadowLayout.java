package com.dcinside.app.browser.views;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap.Config;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint.Style;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.BitmapDrawable;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.core.content.ContextCompat;
import com.dcinside.app.R.styleable;

public class ShadowLayout extends FrameLayout {
    private int a;
    private float b;
    private float c;
    private float d;
    private float e;

    public ShadowLayout(Context context0) {
        super(context0);
        this.setWillNotDraw(false);
        this.b(null);
        this.d();
    }

    public ShadowLayout(Context context0, AttributeSet attributeSet0) {
        super(context0, attributeSet0);
        this.setWillNotDraw(false);
        this.b(attributeSet0);
        this.d();
    }

    public ShadowLayout(Context context0, AttributeSet attributeSet0, int v) {
        super(context0, attributeSet0, v);
        this.setWillNotDraw(false);
        this.b(attributeSet0);
        this.d();
    }

    private Bitmap a(int v, int v1, float f, float f1, float f2, float f3, int v2, int v3) {
        Bitmap bitmap0 = Bitmap.createBitmap(v, v1, Bitmap.Config.ALPHA_8);
        Canvas canvas0 = new Canvas(bitmap0);
        RectF rectF0 = new RectF(f1, f1, ((float)v) - f1, ((float)v1) - f1);
        if(f3 > 0.0f) {
            rectF0.top += f3;
            rectF0.bottom -= f3;
        }
        else if(f3 < 0.0f) {
            rectF0.top += Math.abs(f3);
            rectF0.bottom -= Math.abs(f3);
        }
        if(f2 > 0.0f) {
            rectF0.left += f2;
            rectF0.right -= f2;
        }
        else if(f2 < 0.0f) {
            rectF0.left += Math.abs(f2);
            rectF0.right -= Math.abs(f2);
        }
        Paint paint0 = new Paint();
        paint0.setAntiAlias(true);
        paint0.setColor(v3);
        paint0.setStyle(Paint.Style.FILL);
        paint0.setShadowLayer(f1, f2, f3, v2);
        canvas0.drawRoundRect(rectF0, f, f, paint0);
        return bitmap0;
    }

    private void b(AttributeSet attributeSet0) {
        TypedArray typedArray0 = this.getContext().obtainStyledAttributes(attributeSet0, styleable.ShadowLayout, 0, 0);
        if(typedArray0 == null) {
            return;
        }
        try {
            this.c = typedArray0.getDimension(0, this.getResources().getDimension(0x7F07007F));  // dimen:defaultMenuDropShadowCornerRadius
            this.b = typedArray0.getDimension(4, this.getResources().getDimension(0x7F070080));  // dimen:defaultMenuDropShadowSize
            this.d = typedArray0.getDimension(1, 0.0f);
            this.e = typedArray0.getDimension(2, 0.0f);
            this.a = typedArray0.getColor(3, ContextCompat.getColor(this.getContext(), 0x7F060119));  // color:finestBlack10
        }
        finally {
            typedArray0.recycle();
        }
    }

    private void c(int v, int v1) {
        Bitmap bitmap0 = this.a(v, v1, this.c, this.b, this.d, this.e, this.a, 0);
        this.setBackground(new BitmapDrawable(this.getResources(), bitmap0));
    }

    private void d() {
        int v = (int)(this.b + Math.abs(this.d));
        int v1 = (int)(this.b + Math.abs(this.e));
        this.setPadding(v, v1, v, v1);
    }

    @Override  // android.view.View
    protected int getSuggestedMinimumHeight() {
        return 0;
    }

    @Override  // android.view.View
    protected int getSuggestedMinimumWidth() {
        return 0;
    }

    @Override  // android.view.View
    protected void onDraw(@NonNull Canvas canvas0) {
        super.onDraw(canvas0);
        this.c(this.getWidth(), this.getHeight());
    }

    public void setCornerRadius(float f) {
        this.c = f;
        this.invalidate();
    }

    public void setDx(float f) {
        this.d = f;
        this.d();
    }

    public void setDy(float f) {
        this.e = f;
        this.d();
    }

    public void setShadowColor(int v) {
        this.a = v;
        this.invalidate();
    }

    public void setShadowSize(float f) {
        this.b = f;
        this.d();
    }
}

