package com.facebook.drawee.debug;

import D0.b;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint.Style;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import androidx.annotation.VisibleForTesting;
import com.facebook.drawee.drawable.t.d;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map.Entry;
import k1.n.a;
import k1.n;
import o3.h;

@n(a.a)
public class com.facebook.drawee.debug.a extends Drawable implements b {
    @VisibleForTesting
    static final int A = 0xFFFFFF00;
    @VisibleForTesting
    static final int B = 0xFFFF0000;
    private static final float C = 0.1f;
    private static final float D = 0.5f;
    private static final int E = 0xFFFF9800;
    private static final int F = 0x66000000;
    private static final int G = -1;
    private static final int H = 2;
    private static final int I = 40;
    private static final int J = 10;
    private static final int K = 8;
    private static final int L = 10;
    private static final int M = 9;
    private static final int N = 8;
    private String a;
    @h
    private String b;
    private int c;
    private int d;
    private int e;
    @h
    private String f;
    @h
    private d g;
    private HashMap h;
    private int i;
    private int j;
    private int k;
    private final Paint l;
    private final Matrix m;
    private final Rect n;
    private final RectF o;
    private int p;
    private int q;
    private int r;
    private int s;
    private int t;
    private long u;
    @h
    private String v;
    private int w;
    private int x;
    private static final String y = "none";
    @VisibleForTesting
    static final int z = 0xFF00FF00;

    public com.facebook.drawee.debug.a() {
        this.h = new HashMap();
        this.k = 80;
        this.l = new Paint(1);
        this.m = new Matrix();
        this.n = new Rect();
        this.o = new RectF();
        this.w = -1;
        this.x = 0;
        this.i();
    }

    @Override  // D0.b
    public void a(long v) {
        this.u = v;
        this.invalidateSelf();
    }

    public void b(String s, String s1) {
        this.h.put(s, s1);
    }

    private void c(Canvas canvas0, String s, Object object0) {
        this.e(canvas0, s, String.valueOf(object0), -1);
    }

    private void d(Canvas canvas0, String s, String s1) {
        this.e(canvas0, s, s1, -1);
    }

    @Override  // android.graphics.drawable.Drawable
    public void draw(Canvas canvas0) {
        Rect rect0 = this.getBounds();
        this.l.setStyle(Paint.Style.STROKE);
        this.l.setStrokeWidth(2.0f);
        this.l.setColor(0xFFFF9800);
        canvas0.drawRect(((float)rect0.left), ((float)rect0.top), ((float)rect0.right), ((float)rect0.bottom), this.l);
        Paint.Style paint$Style0 = Paint.Style.FILL;
        this.l.setStyle(paint$Style0);
        this.l.setColor(this.x);
        canvas0.drawRect(((float)rect0.left), ((float)rect0.top), ((float)rect0.right), ((float)rect0.bottom), this.l);
        this.l.setStyle(paint$Style0);
        this.l.setStrokeWidth(0.0f);
        this.l.setColor(-1);
        this.s = this.p;
        this.t = this.q;
        String s = this.b;
        if(s == null) {
            this.d(canvas0, "ID", this.a);
        }
        else {
            this.d(canvas0, "IDs", com.facebook.drawee.debug.a.g("%s, %s", new Object[]{this.a, s}));
        }
        this.d(canvas0, "D", com.facebook.drawee.debug.a.g("%dx%d", new Object[]{rect0.width(), rect0.height()}));
        if(rect0.height() > 0) {
            this.c(canvas0, "DAR", ((float)(((float)rect0.width()) / ((float)rect0.height()))));
        }
        int v = this.f(this.c, this.d, this.g);
        this.e(canvas0, "I", com.facebook.drawee.debug.a.g("%dx%d", new Object[]{this.c, this.d}), v);
        int v1 = this.d;
        if(v1 > 0) {
            this.c(canvas0, "IAR", ((float)(((float)this.c) / ((float)v1))));
        }
        this.d(canvas0, "I", com.facebook.drawee.debug.a.g("%d KiB", new Object[]{((int)(this.e / 0x400))}));
        String s1 = this.f;
        if(s1 != null) {
            this.d(canvas0, "i format", s1);
        }
        int v2 = this.i;
        if(v2 > 0) {
            this.d(canvas0, "anim", com.facebook.drawee.debug.a.g("f %d, l %d", new Object[]{v2, this.j}));
        }
        d t$d0 = this.g;
        if(t$d0 != null) {
            this.c(canvas0, "scale", t$d0);
        }
        long v3 = this.u;
        if(v3 >= 0L) {
            this.d(canvas0, "t", com.facebook.drawee.debug.a.g("%d ms", new Object[]{v3}));
        }
        String s2 = this.v;
        if(s2 != null) {
            this.e(canvas0, "origin", s2, this.w);
        }
        for(Object object0: this.h.entrySet()) {
            this.d(canvas0, ((String)((Map.Entry)object0).getKey()), ((String)((Map.Entry)object0).getValue()));
        }
    }

    private void e(Canvas canvas0, String s, String s1, int v) {
        float f = this.l.measureText(s + ": ");
        float f1 = this.l.measureText(s1);
        this.l.setColor(0x66000000);
        canvas0.drawRect(((float)(this.s - 4)), ((float)(this.t + 8)), ((float)this.s) + f + f1 + 4.0f, ((float)(this.t + this.r + 8)), this.l);
        this.l.setColor(-1);
        canvas0.drawText(s + ": ", ((float)this.s), ((float)this.t), this.l);
        this.l.setColor(v);
        canvas0.drawText(s1, ((float)this.s) + f, ((float)this.t), this.l);
        this.t += this.r;
    }

    @VisibleForTesting
    int f(int v, int v1, @h d t$d0) {
        int v2 = this.getBounds().width();
        int v3 = this.getBounds().height();
        if(v2 > 0 && v3 > 0 && v > 0 && v1 > 0) {
            if(t$d0 != null) {
                this.n.top = 0;
                this.n.left = 0;
                this.n.right = v2;
                this.n.bottom = v3;
                this.m.reset();
                t$d0.a(this.m, this.n, v, v1, 0.0f, 0.0f);
                this.o.top = 0.0f;
                this.o.left = 0.0f;
                this.o.right = (float)v;
                this.o.bottom = (float)v1;
                this.m.mapRect(this.o);
                v2 = Math.min(v2, ((int)this.o.width()));
                v3 = Math.min(v3, ((int)this.o.height()));
            }
            int v4 = Math.abs(v1 - v3);
            float f = (float)Math.abs(v - v2);
            if(f < ((float)v2) * 0.1f && ((float)v4) < 0.1f * ((float)v3)) {
                return 0xFF00FF00;
            }
            return f >= ((float)v2) * 0.5f || ((float)v4) >= ((float)v3) * 0.5f ? 0xFFFF0000 : 0xFFFFFF00;
        }
        return 0xFFFF0000;
    }

    private static String g(String s, @h Object[] arr_object) {
        return arr_object == null ? s : String.format(Locale.US, s, arr_object);
    }

    @Override  // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    private void h(Rect rect0, int v, int v1) {
        int v2 = Math.min(40, Math.max(10, Math.min(rect0.width() / v1, rect0.height() / v)));
        this.l.setTextSize(((float)v2));
        this.r = v2 + 8;
        int v3 = this.k;
        if(v3 == 80) {
            this.r = -(v2 + 8);
        }
        this.p = rect0.left + 10;
        this.q = v3 == 80 ? rect0.bottom - 10 : rect0.top + 20;
    }

    public void i() {
        this.c = -1;
        this.d = -1;
        this.e = -1;
        this.h = new HashMap();
        this.i = -1;
        this.j = -1;
        this.f = null;
        this.k(null);
        this.u = -1L;
        this.v = null;
        this.w = -1;
        this.invalidateSelf();
    }

    public void j(int v, int v1) {
        this.i = v;
        this.j = v1;
        this.invalidateSelf();
    }

    public void k(@h String s) {
        if(s == null) {
            s = "none";
        }
        this.a = s;
        this.invalidateSelf();
    }

    public void l(int v, int v1) {
        this.c = v;
        this.d = v1;
        this.invalidateSelf();
    }

    public void m(long v) {
        this.u = v;
    }

    public void n(@h String s) {
        this.f = s;
    }

    public void o(@h String s) {
        this.b = s;
        this.invalidateSelf();
    }

    @Override  // android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect rect0) {
        super.onBoundsChange(rect0);
        this.h(rect0, 9, 8);
    }

    public void p(int v) {
        this.e = v;
    }

    public void q(String s, int v) {
        this.v = s;
        this.w = v;
        this.invalidateSelf();
    }

    public void r(int v) {
        this.x = v;
    }

    public void s(@h d t$d0) {
        this.g = t$d0;
    }

    @Override  // android.graphics.drawable.Drawable
    public void setAlpha(int v) {
    }

    @Override  // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter0) {
    }

    public void t(int v) {
        this.k = v;
        this.invalidateSelf();
    }
}

