package com.igaworks.ssp;

import android.content.res.ColorStateList;
import android.graphics.Bitmap.Config;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix.ScaleToFit;
import android.graphics.Matrix;
import android.graphics.Paint.Style;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader.TileMode;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.util.Log;
import android.widget.ImageView.ScaleType;

public class n0 extends Drawable {
    static abstract class a {
        static final int[] a;

        static {
            int[] arr_v = new int[ImageView.ScaleType.values().length];
            a.a = arr_v;
            try {
                arr_v[ImageView.ScaleType.CENTER.ordinal()] = 1;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                a.a[ImageView.ScaleType.CENTER_CROP.ordinal()] = 2;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                a.a[ImageView.ScaleType.CENTER_INSIDE.ordinal()] = 3;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                a.a[ImageView.ScaleType.FIT_CENTER.ordinal()] = 4;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                a.a[ImageView.ScaleType.FIT_END.ordinal()] = 5;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                a.a[ImageView.ScaleType.FIT_START.ordinal()] = 6;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                a.a[ImageView.ScaleType.FIT_XY.ordinal()] = 7;
            }
            catch(NoSuchFieldError unused_ex) {
            }
        }
    }

    private final RectF a;
    private final RectF b;
    private final RectF c;
    private final Bitmap d;
    private final Paint e;
    private final int f;
    private final int g;
    private final RectF h;
    private final Paint i;
    private final Matrix j;
    private BitmapShader k;
    private Shader.TileMode l;
    private Shader.TileMode m;
    private boolean n;
    private float o;
    private boolean p;
    private float q;
    private ColorStateList r;
    private ImageView.ScaleType s;

    public n0(Bitmap bitmap0) {
        this.a = new RectF();
        this.b = new RectF();
        RectF rectF0 = new RectF();
        this.c = rectF0;
        this.h = new RectF();
        this.j = new Matrix();
        this.l = Shader.TileMode.CLAMP;
        this.m = Shader.TileMode.CLAMP;
        this.n = true;
        this.o = 0.0f;
        this.p = false;
        this.q = 0.0f;
        this.r = ColorStateList.valueOf(0xFF000000);
        this.s = ImageView.ScaleType.FIT_CENTER;
        this.d = bitmap0;
        int v = bitmap0.getWidth();
        this.f = v;
        int v1 = bitmap0.getHeight();
        this.g = v1;
        rectF0.set(0.0f, 0.0f, ((float)v), ((float)v1));
        Paint paint0 = new Paint();
        this.e = paint0;
        paint0.setStyle(Paint.Style.FILL);
        paint0.setAntiAlias(true);
        Paint paint1 = new Paint();
        this.i = paint1;
        paint1.setStyle(Paint.Style.STROKE);
        paint1.setAntiAlias(true);
        paint1.setColor(this.r.getColorForState(this.getState(), 0xFF000000));
        paint1.setStrokeWidth(0.0f);
    }

    public static Bitmap a(Drawable drawable0) {
        if(drawable0 instanceof BitmapDrawable) {
            return ((BitmapDrawable)drawable0).getBitmap();
        }
        int v = Math.max(drawable0.getIntrinsicWidth(), 2);
        int v1 = Math.max(drawable0.getIntrinsicHeight(), 2);
        try {
            Bitmap bitmap0 = Bitmap.createBitmap(v, v1, Bitmap.Config.ARGB_8888);
            Canvas canvas0 = new Canvas(bitmap0);
            drawable0.setBounds(0, 0, canvas0.getWidth(), canvas0.getHeight());
            drawable0.draw(canvas0);
            return bitmap0;
        }
        catch(Exception exception0) {
            exception0.printStackTrace();
            return null;
        }
    }

    public static n0 a(Bitmap bitmap0) {
        return bitmap0 == null ? null : new n0(bitmap0);
    }

    private void a() {
        float f6;
        float f17;
        float f16;
        switch(a.a[this.s.ordinal()]) {
            case 1: {
                this.h.set(this.a);
                float f18 = this.q / 2.0f;
                this.h.inset(f18, f18);
                this.j.reset();
                float f19 = this.h.width();
                float f20 = this.h.height();
                this.j.setTranslate(((float)(((int)((f19 - ((float)this.f)) * 0.5f + 0.5f)))), ((float)(((int)((f20 - ((float)this.g)) * 0.5f + 0.5f)))));
                break;
            }
            case 2: {
                this.h.set(this.a);
                float f12 = this.q / 2.0f;
                this.h.inset(f12, f12);
                this.j.reset();
                float f13 = this.h.height();
                float f14 = this.h.width();
                float f15 = 0.0f;
                if(((float)this.f) * f13 > f14 * ((float)this.g)) {
                    f16 = this.h.height() / ((float)this.g);
                    f17 = (this.h.width() - ((float)this.f) * f16) * 0.5f;
                }
                else {
                    f16 = this.h.width() / ((float)this.f);
                    f15 = (this.h.height() - ((float)this.g) * f16) * 0.5f;
                    f17 = 0.0f;
                }
                this.j.setScale(f16, f16);
                this.j.postTranslate(((float)(((int)(f17 + 0.5f)))) + this.q, ((float)(((int)(f15 + 0.5f)))) + this.q);
                break;
            }
            case 3: {
                this.j.reset();
                float f4 = this.a.width();
                if(((float)this.f) <= f4) {
                    float f5 = this.a.height();
                    if(((float)this.g) <= f5) {
                        f6 = 1.0f;
                        goto label_38;
                    }
                    goto label_35;
                }
                else {
                label_35:
                    float f7 = this.a.width();
                    float f8 = this.a.height();
                    f6 = Math.min(f7 / ((float)this.f), f8 / ((float)this.g));
                }
            label_38:
                float f9 = this.a.width();
                float f10 = this.a.height();
                this.j.setScale(f6, f6);
                this.j.postTranslate(((float)(((int)((f9 - ((float)this.f) * f6) * 0.5f + 0.5f)))), ((float)(((int)((f10 - ((float)this.g) * f6) * 0.5f + 0.5f)))));
                this.h.set(this.c);
                this.j.mapRect(this.h);
                float f11 = this.q / 2.0f;
                this.h.inset(f11, f11);
                this.j.setRectToRect(this.c, this.h, Matrix.ScaleToFit.FILL);
                break;
            }
            case 5: {
                this.h.set(this.c);
                this.j.setRectToRect(this.c, this.a, Matrix.ScaleToFit.END);
                this.j.mapRect(this.h);
                float f3 = this.q / 2.0f;
                this.h.inset(f3, f3);
                this.j.setRectToRect(this.c, this.h, Matrix.ScaleToFit.FILL);
                break;
            }
            case 6: {
                this.h.set(this.c);
                this.j.setRectToRect(this.c, this.a, Matrix.ScaleToFit.START);
                this.j.mapRect(this.h);
                float f2 = this.q / 2.0f;
                this.h.inset(f2, f2);
                this.j.setRectToRect(this.c, this.h, Matrix.ScaleToFit.FILL);
                break;
            }
            case 7: {
                this.h.set(this.a);
                float f1 = this.q / 2.0f;
                this.h.inset(f1, f1);
                this.j.reset();
                this.j.setRectToRect(this.c, this.h, Matrix.ScaleToFit.FILL);
                break;
            }
            default: {
                this.h.set(this.c);
                this.j.setRectToRect(this.c, this.a, Matrix.ScaleToFit.CENTER);
                this.j.mapRect(this.h);
                float f = this.q / 2.0f;
                this.h.inset(f, f);
                this.j.setRectToRect(this.c, this.h, Matrix.ScaleToFit.FILL);
            }
        }
        this.b.set(this.h);
    }

    public n0 a(float f) {
        this.q = f;
        this.i.setStrokeWidth(f);
        return this;
    }

    public n0 a(ColorStateList colorStateList0) {
        if(colorStateList0 == null) {
            colorStateList0 = ColorStateList.valueOf(0);
        }
        this.r = colorStateList0;
        int v = colorStateList0.getColorForState(this.getState(), 0xFF000000);
        this.i.setColor(v);
        return this;
    }

    public n0 a(Shader.TileMode shader$TileMode0) {
        if(this.l != shader$TileMode0) {
            this.l = shader$TileMode0;
            this.n = true;
            this.invalidateSelf();
        }
        return this;
    }

    public n0 a(ImageView.ScaleType imageView$ScaleType0) {
        if(imageView$ScaleType0 == null) {
            imageView$ScaleType0 = ImageView.ScaleType.FIT_CENTER;
        }
        if(this.s != imageView$ScaleType0) {
            this.s = imageView$ScaleType0;
            this.a();
        }
        return this;
    }

    public n0 a(boolean z) {
        this.p = z;
        return this;
    }

    public static Drawable b(Drawable drawable0) {
        if(drawable0 == null || drawable0 instanceof n0) {
            return drawable0;
        }
        if(drawable0 instanceof LayerDrawable) {
            int v = ((LayerDrawable)drawable0).getNumberOfLayers();
            for(int v1 = 0; v1 < v; ++v1) {
                Drawable drawable1 = ((LayerDrawable)drawable0).getDrawable(v1);
                ((LayerDrawable)drawable0).setDrawableByLayerId(((LayerDrawable)drawable0).getId(v1), n0.b(drawable1));
            }
            return (LayerDrawable)drawable0;
        }
        Bitmap bitmap0 = n0.a(drawable0);
        if(bitmap0 != null) {
            return new n0(bitmap0);
        }
        Log.w("RoundedDrawable", "Failed to create bitmap from drawable!");
        return drawable0;
    }

    public n0 b(float f) {
        this.o = f;
        return this;
    }

    public n0 b(Shader.TileMode shader$TileMode0) {
        if(this.m != shader$TileMode0) {
            this.m = shader$TileMode0;
            this.n = true;
            this.invalidateSelf();
        }
        return this;
    }

    @Override  // android.graphics.drawable.Drawable
    public void draw(Canvas canvas0) {
        if(this.n) {
            BitmapShader bitmapShader0 = new BitmapShader(this.d, this.l, this.m);
            this.k = bitmapShader0;
            if(this.l == Shader.TileMode.CLAMP && this.m == Shader.TileMode.CLAMP) {
                bitmapShader0.setLocalMatrix(this.j);
            }
            this.e.setShader(this.k);
            this.n = false;
        }
        if(this.p) {
            if(this.q > 0.0f) {
                canvas0.drawOval(this.b, this.e);
                canvas0.drawOval(this.h, this.i);
                return;
            }
            canvas0.drawOval(this.b, this.e);
            return;
        }
        if(this.q > 0.0f) {
            canvas0.drawRoundRect(this.b, Math.max(this.o, 0.0f), Math.max(this.o, 0.0f), this.e);
            canvas0.drawRoundRect(this.h, this.o, this.o, this.i);
            return;
        }
        canvas0.drawRoundRect(this.b, this.o, this.o, this.e);
    }

    @Override  // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return this.g;
    }

    @Override  // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return this.f;
    }

    @Override  // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override  // android.graphics.drawable.Drawable
    public boolean isStateful() {
        return this.r.isStateful();
    }

    @Override  // android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect rect0) {
        super.onBoundsChange(rect0);
        this.a.set(rect0);
        this.a();
    }

    @Override  // android.graphics.drawable.Drawable
    protected boolean onStateChange(int[] arr_v) {
        int v = this.r.getColorForState(arr_v, 0);
        if(this.i.getColor() != v) {
            this.i.setColor(v);
            return true;
        }
        return super.onStateChange(arr_v);
    }

    @Override  // android.graphics.drawable.Drawable
    public void setAlpha(int v) {
        this.e.setAlpha(v);
        this.invalidateSelf();
    }

    @Override  // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter0) {
        this.e.setColorFilter(colorFilter0);
        this.invalidateSelf();
    }

    @Override  // android.graphics.drawable.Drawable
    public void setDither(boolean z) {
        this.e.setDither(z);
        this.invalidateSelf();
    }

    @Override  // android.graphics.drawable.Drawable
    public void setFilterBitmap(boolean z) {
        this.e.setFilterBitmap(z);
        this.invalidateSelf();
    }
}

