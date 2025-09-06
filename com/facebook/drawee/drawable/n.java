package com.facebook.drawee.drawable;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint.Style;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Shader.TileMode;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import androidx.annotation.VisibleForTesting;
import com.facebook.imagepipeline.systrace.b;
import java.lang.ref.WeakReference;
import k1.n.a;
import k1.n;
import o3.h;

@n(a.a)
public class com.facebook.drawee.drawable.n extends q {
    private final Paint D;
    private final Paint E;
    @h
    private final Bitmap F;
    @h
    private WeakReference G;
    private boolean H;
    @h
    private RectF I;
    private static boolean J = false;

    static {
    }

    public com.facebook.drawee.drawable.n(Resources resources0, @h Bitmap bitmap0) {
        this(resources0, bitmap0, null);
    }

    public com.facebook.drawee.drawable.n(Resources resources0, @h Bitmap bitmap0, @h Paint paint0) {
        this(resources0, bitmap0, paint0, com.facebook.drawee.drawable.n.J);
    }

    public com.facebook.drawee.drawable.n(Resources resources0, @h Bitmap bitmap0, @h Paint paint0, boolean z) {
        super(new BitmapDrawable(resources0, bitmap0));
        Paint paint1 = new Paint();
        this.D = paint1;
        Paint paint2 = new Paint(1);
        this.E = paint2;
        this.I = null;
        this.F = bitmap0;
        if(paint0 != null) {
            paint1.set(paint0);
        }
        paint1.setFlags(1);
        paint2.setStyle(Paint.Style.STROKE);
        this.H = z;
    }

    public static void A(boolean z) {
        com.facebook.drawee.drawable.n.J = z;
    }

    private void B() {
        if(this.G == null || this.G.get() != this.F) {
            this.G = new WeakReference(this.F);
            if(this.F != null) {
                BitmapShader bitmapShader0 = new BitmapShader(this.F, Shader.TileMode.CLAMP, Shader.TileMode.CLAMP);
                this.D.setShader(bitmapShader0);
                this.f = true;
            }
        }
        if(this.f) {
            Shader shader0 = this.D.getShader();
            if(shader0 != null) {
                shader0.setLocalMatrix(this.x);
                this.f = false;
            }
        }
        this.D.setFilterBitmap(this.i());
    }

    @Override  // com.facebook.drawee.drawable.q
    public void draw(Canvas canvas0) {
        if(b.e()) {
            b.a("RoundedBitmapDrawable#draw");
        }
        if(!this.o()) {
            super.draw(canvas0);
            if(b.e()) {
                b.c();
            }
            return;
        }
        this.q();
        this.p();
        this.B();
        int v = canvas0.save();
        canvas0.concat(this.u);
        if(this.H || this.I == null) {
            canvas0.drawPath(this.e, this.D);
        }
        else {
            int v1 = canvas0.save();
            canvas0.clipRect(this.I);
            canvas0.drawPath(this.e, this.D);
            canvas0.restoreToCount(v1);
        }
        float f = this.d;
        if(f > 0.0f) {
            this.E.setStrokeWidth(f);
            int v2 = f.d(this.g, this.D.getAlpha());
            this.E.setColor(v2);
            canvas0.drawPath(this.h, this.E);
        }
        canvas0.restoreToCount(v);
        if(b.e()) {
            b.c();
        }
    }

    @Override  // com.facebook.drawee.drawable.q
    public void g(boolean z) {
        this.H = z;
    }

    @Override  // com.facebook.drawee.drawable.q
    @VisibleForTesting
    boolean o() {
        return super.o() && this.F != null;
    }

    @Override  // com.facebook.drawee.drawable.q
    protected void q() {
        super.q();
        if(!this.H) {
            if(this.I == null) {
                this.I = new RectF();
            }
            this.x.mapRect(this.I, this.n);
        }
    }

    @Override  // com.facebook.drawee.drawable.q
    public void setAlpha(int v) {
        super.setAlpha(v);
        if(v != this.D.getAlpha()) {
            this.D.setAlpha(v);
            super.setAlpha(v);
            this.invalidateSelf();
        }
    }

    @Override  // com.facebook.drawee.drawable.q
    public void setColorFilter(@h ColorFilter colorFilter0) {
        super.setColorFilter(colorFilter0);
        this.D.setColorFilter(colorFilter0);
    }

    public static com.facebook.drawee.drawable.n t(Resources resources0, BitmapDrawable bitmapDrawable0) {
        return new com.facebook.drawee.drawable.n(resources0, bitmapDrawable0.getBitmap(), bitmapDrawable0.getPaint());
    }

    @h
    public Bitmap w() {
        return this.F;
    }

    public static boolean x() [...] // 潜在的解密器

    public Paint y() {
        return this.D;
    }

    public boolean z() {
        return this.H;
    }
}

