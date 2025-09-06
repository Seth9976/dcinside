package com.github.mikephil.charting.utils;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Paint.Align;
import android.graphics.Paint.FontMetrics;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.text.Layout.Alignment;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import com.github.mikephil.charting.formatter.d;
import com.github.mikephil.charting.formatter.l;
import java.util.List;

public abstract class k {
    private static DisplayMetrics a = null;
    private static int b = 50;
    private static int c = 8000;
    public static final double d = 0.017453;
    public static final float e = 0.017453f;
    public static final double f;
    public static final float g;
    private static Rect h;
    private static Paint.FontMetrics i;
    private static Rect j;
    private static final int[] k;
    private static l l;
    private static Rect m;
    private static Rect n;
    private static Paint.FontMetrics o;

    static {
        k.f = 4.900000E-324;
        k.g = 1.401298E-45f;
        k.h = new Rect();
        k.i = new Paint.FontMetrics();
        k.j = new Rect();
        k.k = new int[]{1, 10, 100, 1000, 10000, 100000, 1000000, 10000000, 100000000, 1000000000};
        k.l = k.q();
        k.m = new Rect();
        k.n = new Rect();
        k.o = new Paint.FontMetrics();
    }

    public static g A(g g0, float f, float f1) {
        g g1 = g.c(0.0f, 0.0f);
        k.B(g0, f, f1, g1);
        return g1;
    }

    public static void B(g g0, float f, float f1, g g1) {
        g1.c = (float)(((double)g0.c) + Math.cos(Math.toRadians(f1)) * ((double)f));
        g1.d = (float)(((double)g0.d) + ((double)f) * Math.sin(Math.toRadians(f1)));
    }

    public static int C() [...] // 潜在的解密器

    public static c D(float f, float f1, float f2) {
        return k.F(f, f1, f2 * 0.017453f);
    }

    public static c E(c c0, float f) {
        return k.F(c0.c, c0.d, f * 0.017453f);
    }

    public static c F(float f, float f1, float f2) {
        return c.b(Math.abs(((float)Math.cos(f2)) * f) + Math.abs(((float)Math.sin(f2)) * f1), Math.abs(f * ((float)Math.sin(f2))) + Math.abs(f1 * ((float)Math.cos(f2))));
    }

    public static c G(c c0, float f) {
        return k.F(c0.c, c0.d, f);
    }

    public static void H(Context context0) {
        if(context0 == null) {
            k.b = 50;
            k.c = 8000;
            Log.e("MPChartLib-Utils", "Utils.init(...) PROVIDED CONTEXT OBJECT IS NULL");
            return;
        }
        ViewConfiguration viewConfiguration0 = ViewConfiguration.get(context0);
        k.b = viewConfiguration0.getScaledMinimumFlingVelocity();
        k.c = viewConfiguration0.getScaledMaximumFlingVelocity();
        k.a = context0.getResources().getDisplayMetrics();
    }

    @Deprecated
    public static void I(Resources resources0) {
        k.a = resources0.getDisplayMetrics();
        k.b = 50;
        k.c = 8000;
    }

    public static double J(double f) {
        if(f == Infinity) {
            return Infinity;
        }
        long v = Double.doubleToRawLongBits(f + 0.0);
        return f + 0.0 >= 0.0 ? Double.longBitsToDouble(v + 1L) : Double.longBitsToDouble(v - 1L);
    }

    @SuppressLint({"NewApi"})
    public static void K(View view0) {
        view0.postInvalidateOnAnimation();
    }

    public static float L(double f) {
        if(!Double.isInfinite(f) && !Double.isNaN(f) && f != 0.0) {
            float f1 = (float)Math.pow(10.0, 1 - ((int)(((float)Math.ceil(((float)Math.log10((f < 0.0 ? -f : f))))))));
            return ((float)Math.round(f * ((double)f1))) / f1;
        }
        return 0.0f;
    }

    public static void M(MotionEvent motionEvent0, VelocityTracker velocityTracker0) {
        velocityTracker0.computeCurrentVelocity(1000, ((float)k.c));
        int v = motionEvent0.getActionIndex();
        int v1 = motionEvent0.getPointerId(v);
        float f = velocityTracker0.getXVelocity(v1);
        float f1 = velocityTracker0.getYVelocity(v1);
        int v2 = motionEvent0.getPointerCount();
        for(int v3 = 0; v3 < v2; ++v3) {
            if(v3 != v) {
                int v4 = motionEvent0.getPointerId(v3);
                if(velocityTracker0.getXVelocity(v4) * f + velocityTracker0.getYVelocity(v4) * f1 < 0.0f) {
                    velocityTracker0.clear();
                    return;
                }
            }
        }
    }

    public static int a(Paint paint0, String s) {
        Rect rect0 = k.h;
        rect0.set(0, 0, 0, 0);
        paint0.getTextBounds(s, 0, s.length(), rect0);
        return rect0.height();
    }

    public static c b(Paint paint0, String s) {
        c c0 = c.b(0.0f, 0.0f);
        k.c(paint0, s, c0);
        return c0;
    }

    public static void c(Paint paint0, String s, c c0) {
        Rect rect0 = k.j;
        rect0.set(0, 0, 0, 0);
        paint0.getTextBounds(s, 0, s.length(), rect0);
        c0.c = (float)rect0.width();
        c0.d = (float)rect0.height();
    }

    public static int d(Paint paint0, String s) {
        return (int)paint0.measureText(s);
    }

    public static float e(float f) {
        DisplayMetrics displayMetrics0 = k.a;
        if(displayMetrics0 == null) {
            Log.e("MPChartLib-Utils", "Utils NOT INITIALIZED. You need to call Utils.init(...) at least once before calling Utils.convertDpToPixel(...). Otherwise conversion does not take place.");
            return f;
        }
        return f * displayMetrics0.density;
    }

    public static int[] f(List list0) {
        int[] arr_v = new int[list0.size()];
        k.i(list0, arr_v);
        return arr_v;
    }

    public static float g(float f) {
        DisplayMetrics displayMetrics0 = k.a;
        if(displayMetrics0 == null) {
            Log.e("MPChartLib-Utils", "Utils NOT INITIALIZED. You need to call Utils.init(...) at least once before calling Utils.convertPixelsToDp(...). Otherwise conversion does not take place.");
            return f;
        }
        return f / displayMetrics0.density;
    }

    public static String[] h(List list0) {
        int v = list0.size();
        String[] arr_s = new String[v];
        for(int v1 = 0; v1 < v; ++v1) {
            arr_s[v1] = (String)list0.get(v1);
        }
        return arr_s;
    }

    public static void i(List list0, int[] arr_v) {
        int v = arr_v.length >= list0.size() ? list0.size() : arr_v.length;
        for(int v1 = 0; v1 < v; ++v1) {
            arr_v[v1] = (int)(((Integer)list0.get(v1)));
        }
    }

    public static void j(List list0, String[] arr_s) {
        int v = arr_s.length >= list0.size() ? list0.size() : arr_s.length;
        for(int v1 = 0; v1 < v; ++v1) {
            arr_s[v1] = (String)list0.get(v1);
        }
    }

    public static void k(Canvas canvas0, Drawable drawable0, int v, int v1, int v2, int v3) {
        g g0 = g.b();
        g0.c = (float)(v - v2 / 2);
        g0.d = (float)(v1 - v3 / 2);
        drawable0.copyBounds(k.m);
        drawable0.setBounds(k.m.left, k.m.top, k.m.left + v2, v2 + k.m.top);
        int v4 = canvas0.save();
        canvas0.translate(g0.c, g0.d);
        drawable0.draw(canvas0);
        canvas0.restoreToCount(v4);
    }

    public static void l(Canvas canvas0, StaticLayout staticLayout0, float f, float f1, TextPaint textPaint0, g g0, float f2) {
        float f3 = textPaint0.getFontMetrics(k.o);
        float f4 = (float)staticLayout0.getWidth();
        float f5 = ((float)staticLayout0.getLineCount()) * f3;
        float f6 = 0.0f - ((float)k.n.left);
        float f7 = f5 + 0.0f;
        Paint.Align paint$Align0 = textPaint0.getTextAlign();
        textPaint0.setTextAlign(Paint.Align.LEFT);
        if(f2 == 0.0f) {
            float f8 = g0.c;
            if(f8 != 0.0f || g0.d != 0.0f) {
                f6 -= f4 * f8;
                f7 -= f5 * g0.d;
            }
            canvas0.save();
            canvas0.translate(f6 + f, f7 + f1);
        }
        else {
            if(g0.c != 0.5f || g0.d != 0.5f) {
                c c0 = k.D(f4, f5, f2);
                f -= c0.c * (g0.c - 0.5f);
                f1 -= c0.d * (g0.d - 0.5f);
                c.c(c0);
            }
            canvas0.save();
            canvas0.translate(f, f1);
            canvas0.rotate(f2);
            canvas0.translate(f6 - f4 * 0.5f, f7 - f5 * 0.5f);
        }
        staticLayout0.draw(canvas0);
        canvas0.restore();
        textPaint0.setTextAlign(paint$Align0);
    }

    public static void m(Canvas canvas0, String s, float f, float f1, TextPaint textPaint0, c c0, g g0, float f2) {
        k.l(canvas0, new StaticLayout(s, 0, s.length(), textPaint0, ((int)Math.max(Math.ceil(c0.c), 1.0)), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false), f, f1, textPaint0, g0, f2);
    }

    public static void n(Canvas canvas0, String s, float f, float f1, Paint paint0, g g0, float f2) {
        float f3 = paint0.getFontMetrics(k.o);
        paint0.getTextBounds(s, 0, s.length(), k.n);
        float f4 = 0.0f - ((float)k.n.left);
        float f5 = 0.0f - k.o.ascent;
        Paint.Align paint$Align0 = paint0.getTextAlign();
        paint0.setTextAlign(Paint.Align.LEFT);
        if(f2 == 0.0f) {
            if(g0.c != 0.0f || g0.d != 0.0f) {
                f4 -= ((float)k.n.width()) * g0.c;
                f5 -= f3 * g0.d;
            }
            canvas0.drawText(s, f4 + f, f5 + f1, paint0);
        }
        else {
            float f6 = f4 - ((float)k.n.width()) * 0.5f;
            if(g0.c != 0.5f || g0.d != 0.5f) {
                c c0 = k.D(k.n.width(), f3, f2);
                f -= c0.c * (g0.c - 0.5f);
                f1 -= c0.d * (g0.d - 0.5f);
                c.c(c0);
            }
            canvas0.save();
            canvas0.translate(f, f1);
            canvas0.rotate(f2);
            canvas0.drawText(s, f6, f5 - f3 * 0.5f, paint0);
            canvas0.restore();
        }
        paint0.setTextAlign(paint$Align0);
    }

    public static String o(float f, int v, boolean z) {
        return k.p(f, v, z, '.');
    }

    public static String p(float f, int v, boolean z, char c) {
        boolean z2;
        int v1 = 0;
        char[] arr_c = new char[35];
        if(f == 0.0f) {
            return "0";
        }
        boolean z1 = f < 1.0f && f > -1.0f;
        if(f < 0.0f) {
            f = -f;
            z2 = true;
        }
        else {
            z2 = false;
        }
        int v2 = v <= k.k.length ? v : k.k.length - 1;
        long v3 = (long)Math.round(f * ((float)k.k[v2]));
        int v4 = 34;
        boolean z3 = false;
        while(v3 != 0L || v1 < v2 + 1) {
            int v5 = (int)(v3 % 10L);
            v3 /= 10L;
            int v6 = v4 - 1;
            arr_c[v4] = (char)(v5 + 0x30);
            if(v1 + 1 == v2) {
                v4 -= 2;
                arr_c[v6] = ',';
                v1 += 2;
                z3 = true;
            }
            else {
                if(z && v3 != 0L && v1 + 1 > v2) {
                    if(!z3) {
                        if((v1 + 1 - v2) % 4 == 3) {
                            v4 -= 2;
                            arr_c[v6] = c;
                            v1 += 2;
                            continue;
                        }
                    }
                    else if((v1 + 1 - v2) % 4 == 0) {
                        v4 -= 2;
                        arr_c[v6] = c;
                        v1 += 2;
                        continue;
                    }
                }
                ++v1;
                v4 = v6;
            }
        }
        if(z1) {
            arr_c[v4] = '0';
            ++v1;
            --v4;
        }
        if(z2) {
            arr_c[v4] = '-';
            ++v1;
        }
        return String.valueOf(arr_c, 35 - v1, v1);
    }

    private static l q() {
        return new d(1);
    }

    public static int r(float f) {
        float f1 = k.L(f);
        return Float.isInfinite(f1) ? 0 : ((int)Math.ceil(-Math.log10(f1))) + 2;
    }

    public static l s() {
        return k.l;
    }

    public static float t(Paint paint0) {
        return k.u(paint0, k.i);
    }

    public static float u(Paint paint0, Paint.FontMetrics paint$FontMetrics0) {
        paint0.getFontMetrics(paint$FontMetrics0);
        return paint$FontMetrics0.descent - paint$FontMetrics0.ascent;
    }

    public static float v(Paint paint0) {
        return k.w(paint0, k.i);
    }

    public static float w(Paint paint0, Paint.FontMetrics paint$FontMetrics0) {
        paint0.getFontMetrics(paint$FontMetrics0);
        return paint$FontMetrics0.ascent - paint$FontMetrics0.top + paint$FontMetrics0.bottom;
    }

    public static int x() [...] // 潜在的解密器

    public static int y() [...] // 潜在的解密器

    public static float z(float f) {
        while(f < 0.0f) {
            f += 360.0f;
        }
        return f % 360.0f;
    }
}

