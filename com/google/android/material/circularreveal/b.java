package com.google.android.material.circularreveal;

import android.graphics.Bitmap.Config;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path.Direction;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.Shader.TileMode;
import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.annotation.ColorInt;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

public class b {
    public interface a {
        void c(Canvas arg1);

        boolean d();
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface com.google.android.material.circularreveal.b.b {
    }

    private final a a;
    @NonNull
    private final View b;
    @NonNull
    private final Path c;
    @NonNull
    private final Paint d;
    @NonNull
    private final Paint e;
    @Nullable
    private e f;
    @Nullable
    private Drawable g;
    private Paint h;
    private boolean i;
    private boolean j;
    private static final boolean k = false;
    public static final int l = 0;
    public static final int m = 1;
    public static final int n = 2;
    public static final int o;

    static {
        b.o = 2;
    }

    public b(a b$a0) {
        this.a = b$a0;
        this.b = (View)b$a0;
        ((View)b$a0).setWillNotDraw(false);
        this.c = new Path();
        this.d = new Paint(7);
        Paint paint0 = new Paint(1);
        this.e = paint0;
        paint0.setColor(0);
    }

    public void a() {
        if(b.o == 0) {
            this.i = true;
            this.j = false;
            this.b.buildDrawingCache();
            Bitmap bitmap0 = this.b.getDrawingCache();
            if(bitmap0 == null && this.b.getWidth() != 0 && this.b.getHeight() != 0) {
                bitmap0 = Bitmap.createBitmap(this.b.getWidth(), this.b.getHeight(), Bitmap.Config.ARGB_8888);
                Canvas canvas0 = new Canvas(bitmap0);
                this.b.draw(canvas0);
            }
            if(bitmap0 != null) {
                BitmapShader bitmapShader0 = new BitmapShader(bitmap0, Shader.TileMode.CLAMP, Shader.TileMode.CLAMP);
                this.d.setShader(bitmapShader0);
            }
            this.i = false;
            this.j = true;
        }
    }

    public void b() {
        if(b.o == 0) {
            this.j = false;
            this.b.destroyDrawingCache();
            this.d.setShader(null);
            this.b.invalidate();
        }
    }

    public void c(@NonNull Canvas canvas0) {
        if(this.p()) {
            int v = b.o;
            switch(v) {
                case 0: {
                    canvas0.drawCircle(this.f.a, this.f.b, this.f.c, this.d);
                    if(this.r()) {
                        canvas0.drawCircle(this.f.a, this.f.b, this.f.c, this.e);
                    }
                    break;
                }
                case 1: {
                    int v1 = canvas0.save();
                    canvas0.clipPath(this.c);
                    this.a.c(canvas0);
                    if(this.r()) {
                        canvas0.drawRect(0.0f, 0.0f, ((float)this.b.getWidth()), ((float)this.b.getHeight()), this.e);
                    }
                    canvas0.restoreToCount(v1);
                    break;
                }
                case 2: {
                    this.a.c(canvas0);
                    if(this.r()) {
                        canvas0.drawRect(0.0f, 0.0f, ((float)this.b.getWidth()), ((float)this.b.getHeight()), this.e);
                    }
                    break;
                }
                default: {
                    throw new IllegalStateException("Unsupported strategy " + v);
                }
            }
        }
        else {
            this.a.c(canvas0);
            if(this.r()) {
                canvas0.drawRect(0.0f, 0.0f, ((float)this.b.getWidth()), ((float)this.b.getHeight()), this.e);
            }
        }
        this.f(canvas0);
    }

    private void d(@NonNull Canvas canvas0, int v, float f) {
        this.h.setColor(v);
        this.h.setStrokeWidth(f);
        canvas0.drawCircle(this.f.a, this.f.b, this.f.c - f / 2.0f, this.h);
    }

    private void e(@NonNull Canvas canvas0) {
        this.a.c(canvas0);
        if(this.r()) {
            canvas0.drawCircle(this.f.a, this.f.b, this.f.c, this.e);
        }
        if(this.p()) {
            this.d(canvas0, 0xFF000000, 10.0f);
            this.d(canvas0, 0xFFFF0000, 5.0f);
        }
        this.f(canvas0);
    }

    private void f(@NonNull Canvas canvas0) {
        if(this.q()) {
            Rect rect0 = this.g.getBounds();
            float f = this.f.a - ((float)rect0.width()) / 2.0f;
            float f1 = this.f.b - ((float)rect0.height()) / 2.0f;
            canvas0.translate(f, f1);
            this.g.draw(canvas0);
            canvas0.translate(-f, -f1);
        }
    }

    @Nullable
    public Drawable g() {
        return this.g;
    }

    @ColorInt
    public int h() {
        return this.e.getColor();
    }

    private float i(@NonNull e c$e0) {
        return H1.a.b(c$e0.a, c$e0.b, 0.0f, 0.0f, this.b.getWidth(), this.b.getHeight());
    }

    @Nullable
    public e j() {
        e c$e0 = this.f;
        if(c$e0 == null) {
            return null;
        }
        e c$e1 = new e(c$e0);
        if(c$e1.a()) {
            c$e1.c = this.i(c$e1);
        }
        return c$e1;
    }

    private void k() {
        if(b.o == 1) {
            this.c.rewind();
            e c$e0 = this.f;
            if(c$e0 != null) {
                this.c.addCircle(c$e0.a, c$e0.b, c$e0.c, Path.Direction.CW);
            }
        }
        this.b.invalidate();
    }

    // 去混淆评级： 低(20)
    public boolean l() {
        return this.a.d() && !this.p();
    }

    public void m(@Nullable Drawable drawable0) {
        this.g = drawable0;
        this.b.invalidate();
    }

    public void n(@ColorInt int v) {
        this.e.setColor(v);
        this.b.invalidate();
    }

    public void o(@Nullable e c$e0) {
        if(c$e0 == null) {
            this.f = null;
        }
        else {
            e c$e1 = this.f;
            if(c$e1 == null) {
                this.f = new e(c$e0);
            }
            else {
                c$e1.c(c$e0);
            }
            if(H1.a.e(c$e0.c, this.i(c$e0), 0.0001f)) {
                this.f.c = 3.402823E+38f;
            }
        }
        this.k();
    }

    private boolean p() {
        int v = this.f == null || this.f.a() ? 1 : 0;
        return b.o == 0 ? v == 0 && this.j : v ^ 1;
    }

    private boolean q() {
        return !this.i && this.g != null && this.f != null;
    }

    private boolean r() {
        return !this.i && Color.alpha(this.e.getColor()) != 0;
    }
}

