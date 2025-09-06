package com.github.mikephil.charting.renderer;

import android.graphics.Bitmap.Config;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint.Align;
import android.graphics.Paint.Style;
import android.graphics.Paint;
import android.graphics.Path.Direction;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.Layout.Alignment;
import android.text.StaticLayout;
import android.text.TextPaint;
import com.github.mikephil.charting.animation.a;
import com.github.mikephil.charting.charts.PieChart;
import com.github.mikephil.charting.data.PieEntry;
import com.github.mikephil.charting.data.r;
import com.github.mikephil.charting.highlight.d;
import com.github.mikephil.charting.utils.k;
import com.github.mikephil.charting.utils.l;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.List;
import t1.i;

public class m extends g {
    protected PieChart g;
    protected Paint h;
    protected Paint i;
    protected Paint j;
    private TextPaint k;
    private Paint l;
    private StaticLayout m;
    private CharSequence n;
    private RectF o;
    private RectF[] p;
    protected WeakReference q;
    protected Canvas r;
    private Path s;
    private RectF t;
    private Path u;
    protected Path v;
    protected RectF w;

    public m(PieChart pieChart0, a a0, l l0) {
        super(a0, l0);
        this.o = new RectF();
        this.p = new RectF[]{new RectF(), new RectF(), new RectF()};
        this.s = new Path();
        this.t = new RectF();
        this.u = new Path();
        this.v = new Path();
        this.w = new RectF();
        this.g = pieChart0;
        Paint paint0 = new Paint(1);
        this.h = paint0;
        paint0.setColor(-1);
        Paint.Style paint$Style0 = Paint.Style.FILL;
        this.h.setStyle(paint$Style0);
        Paint paint1 = new Paint(1);
        this.i = paint1;
        paint1.setColor(-1);
        this.i.setStyle(paint$Style0);
        this.i.setAlpha(105);
        TextPaint textPaint0 = new TextPaint(1);
        this.k = textPaint0;
        textPaint0.setColor(0xFF000000);
        this.k.setTextSize(k.e(12.0f));
        this.f.setTextSize(k.e(13.0f));
        this.f.setColor(-1);
        Paint.Align paint$Align0 = Paint.Align.CENTER;
        this.f.setTextAlign(paint$Align0);
        Paint paint2 = new Paint(1);
        this.l = paint2;
        paint2.setColor(-1);
        this.l.setTextAlign(paint$Align0);
        this.l.setTextSize(k.e(13.0f));
        Paint paint3 = new Paint(1);
        this.j = paint3;
        paint3.setStyle(Paint.Style.STROKE);
    }

    @Override  // com.github.mikephil.charting.renderer.g
    public void b(Canvas canvas0) {
        Iterator iterator0;
        int v = (int)this.a.o();
        int v1 = (int)this.a.n();
        Bitmap bitmap0 = this.q == null ? null : ((Bitmap)this.q.get());
        if(bitmap0 != null && bitmap0.getWidth() == v && bitmap0.getHeight() == v1) {
            bitmap0.eraseColor(0);
            iterator0 = ((r)this.g.getData()).q().iterator();
        label_13:
            while(iterator0.hasNext()) {
                Object object0 = iterator0.next();
                i i0 = (i)object0;
                if(i0.isVisible() && i0.N() > 0) {
                    this.n(canvas0, i0);
                }
            }
        }
        else if(v > 0 && v1 > 0) {
            bitmap0 = Bitmap.createBitmap(v, v1, Bitmap.Config.ARGB_4444);
            this.q = new WeakReference(bitmap0);
            this.r = new Canvas(bitmap0);
            bitmap0.eraseColor(0);
            iterator0 = ((r)this.g.getData()).q().iterator();
            goto label_13;
        }
    }

    @Override  // com.github.mikephil.charting.renderer.g
    public void c(Canvas canvas0) {
        this.p(canvas0);
        canvas0.drawBitmap(((Bitmap)this.q.get()), 0.0f, 0.0f, null);
        this.m(canvas0);
    }

    @Override  // com.github.mikephil.charting.renderer.g
    public void d(Canvas canvas0, d[] arr_d) {
        float f20;
        float f19;
        float f22;
        float f18;
        float[] arr_f3;
        com.github.mikephil.charting.utils.g g1;
        float f17;
        RectF rectF1;
        int v8;
        int v7;
        float f16;
        float[] arr_f2;
        int v = !this.g.m0() || this.g.o0() ? 0 : 1;
        if(v != 0 && this.g.n0()) {
            return;
        }
        float f = this.b.h();
        float f1 = this.b.i();
        float f2 = this.g.getRotationAngle();
        float[] arr_f = this.g.getDrawAngles();
        float[] arr_f1 = this.g.getAbsoluteAngles();
        com.github.mikephil.charting.utils.g g0 = this.g.getCenterCircleBox();
        float f3 = this.g.getRadius();
        float f4 = v == 0 ? 0.0f : this.g.getHoleRadius() / 100.0f * f3;
        RectF rectF0 = this.w;
        rectF0.set(0.0f, 0.0f, 0.0f, 0.0f);
        int v1 = 0;
        while(v1 < arr_d.length) {
            int v2 = (int)arr_d[v1].h();
            if(v2 < arr_f.length) {
                i i0 = ((r)this.g.getData()).R(arr_d[v1].d());
                if(i0 != null && i0.f0()) {
                    int v3 = i0.N();
                    int v5 = 0;
                    for(int v4 = 0; v4 < v3; ++v4) {
                        if(Math.abs(((PieEntry)i0.l(v4)).d()) > k.g) {
                            ++v5;
                        }
                    }
                    float f5 = v2 == 0 ? 0.0f : arr_f1[v2 - 1] * f;
                    float f6 = v5 > 1 ? i0.I0() : 0.0f;
                    float f7 = arr_f[v2];
                    float f8 = i0.x();
                    float f9 = f3 + f8;
                    rectF0.set(this.g.getCircleBox());
                    rectF0.inset(-f8, -f8);
                    boolean z = f6 > 0.0f && f7 <= 180.0f;
                    this.c.setColor(i0.Y0(v2));
                    float f10 = v5 == 1 ? 0.0f : f6 / (f3 * 0.017453f);
                    float f11 = v5 == 1 ? 0.0f : f6 / (f9 * 0.017453f);
                    float f12 = f2 + (f10 / 2.0f + f5) * f1;
                    float f13 = (f7 - f10) * f1;
                    float f14 = f13 < 0.0f ? 0.0f : f13;
                    float f15 = (f11 / 2.0f + f5) * f1 + f2;
                    this.s.reset();
                    int v6 = Float.compare(f14, 360.0f);
                    if(v6 < 0 || f14 % 360.0f > k.g) {
                        arr_f2 = arr_f;
                        f16 = f5;
                        v7 = v5;
                        this.s.moveTo(g0.c + ((float)Math.cos(f15 * 0.017453f)) * f9, g0.d + f9 * ((float)Math.sin(f15 * 0.017453f)));
                        this.s.arcTo(rectF0, f15, ((f7 - f11) * f1 < 0.0f ? 0.0f : (f7 - f11) * f1));
                    }
                    else {
                        this.s.addCircle(g0.c, g0.d, f9, Path.Direction.CW);
                        arr_f2 = arr_f;
                        f16 = f5;
                        v7 = v5;
                    }
                    if(z) {
                        v8 = v1;
                        rectF1 = rectF0;
                        f17 = f4;
                        g1 = g0;
                        arr_f3 = arr_f2;
                        f18 = this.l(g0, f3, f7 * f1, ((float)Math.cos(f12 * 0.017453f)) * f3 + g0.c, g0.d + ((float)Math.sin(f12 * 0.017453f)) * f3, f12, f14);
                    }
                    else {
                        rectF1 = rectF0;
                        g1 = g0;
                        v8 = v1;
                        f17 = f4;
                        arr_f3 = arr_f2;
                        f18 = 0.0f;
                    }
                    this.t.set(g1.c - f17, g1.d - f17, g1.c + f17, g1.d + f17);
                    if(v != 0 && (f17 > 0.0f || z)) {
                        if(z) {
                            if(f18 < 0.0f) {
                                f18 = -f18;
                            }
                            f22 = Math.max(f17, f18);
                        }
                        else {
                            f22 = f17;
                        }
                        float f23 = v7 == 1 || f22 == 0.0f ? 0.0f : f6 / (f22 * 0.017453f);
                        float f24 = (f7 - f23) * f1 < 0.0f ? 0.0f : (f7 - f23) * f1;
                        float f25 = (f16 + f23 / 2.0f) * f1 + f2 + f24;
                        if(v6 < 0 || f14 % 360.0f > k.g) {
                            f19 = f;
                            f20 = f1;
                            this.s.lineTo(g1.c + ((float)Math.cos(f25 * 0.017453f)) * f22, g1.d + f22 * ((float)Math.sin(f25 * 0.017453f)));
                            this.s.arcTo(this.t, f25, -f24);
                        }
                        else {
                            this.s.addCircle(g1.c, g1.d, f22, Path.Direction.CCW);
                            f19 = f;
                            f20 = f1;
                        }
                    }
                    else {
                        f19 = f;
                        f20 = f1;
                        if(f14 % 360.0f > k.g) {
                            if(z) {
                                double f21 = (double)((f12 + f14 / 2.0f) * 0.017453f);
                                this.s.lineTo(g1.c + ((float)Math.cos(f21)) * f18, g1.d + f18 * ((float)Math.sin(f21)));
                            }
                            else {
                                this.s.lineTo(g1.c, g1.d);
                            }
                        }
                    }
                    this.s.close();
                    this.r.drawPath(this.s, this.c);
                }
            }
            else {
                v8 = v1;
                rectF1 = rectF0;
                f17 = f4;
                arr_f3 = arr_f;
                f19 = f;
                f20 = f1;
                g1 = g0;
            }
            v1 = v8 + 1;
            f = f19;
            rectF0 = rectF1;
            f4 = f17;
            g0 = g1;
            f1 = f20;
            arr_f = arr_f3;
        }
        com.github.mikephil.charting.utils.g.h(g0);
    }

    @Override  // com.github.mikephil.charting.renderer.g
    public void e(Canvas canvas0, String s, float f, float f1, int v) {
        this.f.setColor(v);
        canvas0.drawText(s, f, f1, this.f);
    }

    @Override  // com.github.mikephil.charting.renderer.g
    public void f(Canvas canvas0) {
        com.github.mikephil.charting.utils.g g1;
        Canvas canvas2;
        float f12;
        float f11;
        List list1;
        int v2;
        com.github.mikephil.charting.utils.g g7;
        com.github.mikephil.charting.utils.g g6;
        float f19;
        i i1;
        String s2;
        PieEntry pieEntry1;
        com.github.mikephil.charting.utils.g g5;
        com.github.mikephil.charting.utils.g g4;
        float f18;
        com.github.mikephil.charting.data.s.a s$a2;
        String s3;
        float f34;
        float f33;
        float f32;
        float f24;
        Canvas canvas1 = canvas0;
        com.github.mikephil.charting.utils.g g0 = this.g.getCenterCircleBox();
        float f = this.g.getRadius();
        float f1 = this.g.getRotationAngle();
        float[] arr_f = this.g.getDrawAngles();
        float[] arr_f1 = this.g.getAbsoluteAngles();
        float f2 = this.b.h();
        float f3 = this.b.i();
        float f4 = this.g.getHoleRadius();
        float f5 = this.g.getHoleRadius();
        float f6 = f / 10.0f * 3.6f;
        if(this.g.m0()) {
            f6 = (f - f * (f5 / 100.0f)) / 2.0f;
            if(!this.g.o0() && this.g.n0()) {
                f1 = (float)(((double)f1) + ((double)((f - f4 * f / 100.0f) / 2.0f * 360.0f)) / (((double)f) * 6.283185));
            }
        }
        float f7 = f1;
        float f8 = f - f6;
        com.github.mikephil.charting.data.k k0 = this.g.getData();
        List list0 = ((r)k0).q();
        float f9 = ((r)k0).T();
        boolean z = this.g.l0();
        canvas0.save();
        float f10 = k.e(5.0f);
        int v = 0;
        int v1 = 0;
        while(v1 < list0.size()) {
            i i0 = (i)list0.get(v1);
            boolean z1 = i0.D0();
            if(z1 || z) {
                com.github.mikephil.charting.data.s.a s$a0 = i0.R();
                com.github.mikephil.charting.data.s.a s$a1 = i0.f1();
                this.a(i0);
                int v3 = v;
                v2 = v1;
                float f13 = ((float)k.a(this.f, "Q")) + k.e(4.0f);
                com.github.mikephil.charting.formatter.l l0 = i0.t0();
                int v4 = i0.N();
                list1 = list0;
                this.j.setColor(i0.W0());
                this.j.setStrokeWidth(k.e(i0.u0()));
                float f14 = this.v(i0);
                com.github.mikephil.charting.utils.g g2 = com.github.mikephil.charting.utils.g.d(i0.m1());
                com.github.mikephil.charting.utils.g g3 = g0;
                g2.c = k.e(g2.c);
                g2.d = k.e(g2.d);
                int v5 = 0;
                while(v5 < v4) {
                    PieEntry pieEntry0 = (PieEntry)i0.l(v5);
                    float f15 = f7 + ((v3 == 0 ? 0.0f : arr_f1[v3 - 1] * f2) + (arr_f[v3] - f14 / (f8 * 0.017453f) / 2.0f) / 2.0f) * f3;
                    String s = l0.i((this.g.p0() ? pieEntry0.d() / f9 * 100.0f : pieEntry0.d()), pieEntry0);
                    String s1 = pieEntry0.q();
                    float f16 = (float)Math.cos(f15 * 0.017453f);
                    float f17 = (float)Math.sin(f15 * 0.017453f);
                    boolean z2 = z && s$a0 == com.github.mikephil.charting.data.s.a.b;
                    boolean z3 = z1 && s$a1 == com.github.mikephil.charting.data.s.a.b;
                    boolean z4 = z && s$a0 == com.github.mikephil.charting.data.s.a.a;
                    boolean z5 = z1 && s$a1 == com.github.mikephil.charting.data.s.a.a;
                    if(z2 || z3) {
                        float f20 = i0.v0();
                        float f21 = i0.t();
                        float f22 = i0.a0() / 100.0f;
                        s$a2 = s$a1;
                        if(this.g.m0()) {
                            float f23 = f * (f5 / 100.0f);
                            f24 = (f - f23) * f22 + f23;
                        }
                        else {
                            f24 = f * f22;
                        }
                        float f25 = i0.g1() ? f21 * f8 * ((float)Math.abs(Math.sin(f15 * 0.017453f))) : f21 * f8;
                        float f26 = f24 * f16 + g3.c;
                        f19 = f;
                        float f27 = f24 * f17 + g3.d;
                        float f28 = (f20 + 1.0f) * f8;
                        float f29 = f28 * f16 + g3.c;
                        float f30 = g3.d + f28 * f17;
                        if(((double)f15) % 360.0 < 90.0 || ((double)f15) % 360.0 > 270.0) {
                            f32 = f29 + f25;
                            Paint.Align paint$Align1 = Paint.Align.LEFT;
                            this.f.setTextAlign(paint$Align1);
                            if(z2) {
                                this.l.setTextAlign(paint$Align1);
                            }
                            f33 = f32 + f10;
                        }
                        else {
                            float f31 = f29 - f25;
                            Paint.Align paint$Align0 = Paint.Align.RIGHT;
                            this.f.setTextAlign(paint$Align0);
                            if(z2) {
                                this.l.setTextAlign(paint$Align0);
                            }
                            f32 = f31;
                            f33 = f31 - f10;
                        }
                        if(i0.W0() == 0x112233) {
                            f18 = f17;
                            g5 = g2;
                            pieEntry1 = pieEntry0;
                            g4 = g3;
                            i1 = i0;
                            f34 = f33;
                        }
                        else {
                            if(i0.i1()) {
                                this.j.setColor(i0.Y0(v5));
                            }
                            f18 = f17;
                            i1 = i0;
                            g5 = g2;
                            pieEntry1 = pieEntry0;
                            g4 = g3;
                            f34 = f33;
                            canvas0.drawLine(f26, f27, f29, f30, this.j);
                            canvas0.drawLine(f29, f30, f32, f30, this.j);
                        }
                        if(!z2 || !z3) {
                        label_131:
                            s3 = s1;
                            if(!z2) {
                                if(z3) {
                                    s2 = s3;
                                    this.e(canvas0, s, f34, f30 + f13 / 2.0f, i1.q(v5));
                                    goto label_141;
                                }
                            }
                            else if(v5 < ((r)k0).r() && s3 != null) {
                                this.o(canvas0, s3, f34, f30 + f13 / 2.0f);
                            }
                        }
                        else {
                            this.e(canvas0, s, f34, f30, i1.q(v5));
                            if(v5 >= ((r)k0).r() || s1 == null) {
                                s2 = s1;
                                goto label_141;
                            }
                            else {
                                s3 = s1;
                                this.o(canvas0, s3, f34, f30 + f13);
                                goto label_140;
                            }
                            goto label_131;
                        }
                    label_140:
                        s2 = s3;
                    }
                    else {
                        s$a2 = s$a1;
                        f18 = f17;
                        g4 = g3;
                        g5 = g2;
                        pieEntry1 = pieEntry0;
                        s2 = s1;
                        i1 = i0;
                        f19 = f;
                    }
                label_141:
                    if(z4 || z5) {
                        g6 = g4;
                        float f35 = f8 * f16 + g6.c;
                        float f36 = f8 * f18 + g6.d;
                        this.f.setTextAlign(Paint.Align.CENTER);
                        if(z4 && z5) {
                            this.e(canvas0, s, f35, f36, i1.q(v5));
                            if(v5 < ((r)k0).r() && s2 != null) {
                                this.o(canvas0, s2, f35, f36 + f13);
                            }
                        }
                        else if(!z4) {
                            if(z5) {
                                this.e(canvas0, s, f35, f36 + f13 / 2.0f, i1.q(v5));
                            }
                        }
                        else if(v5 < ((r)k0).r() && s2 != null) {
                            this.o(canvas0, s2, f35, f36 + f13 / 2.0f);
                        }
                    }
                    else {
                        g6 = g4;
                    }
                    if(pieEntry1.c() == null || !i1.K()) {
                        g7 = g5;
                    }
                    else {
                        Drawable drawable0 = pieEntry1.c();
                        g7 = g5;
                        k.k(canvas0, drawable0, ((int)((f8 + g7.d) * f16 + g6.c)), ((int)((g7.d + f8) * f18 + g6.d + g7.c)), drawable0.getIntrinsicWidth(), drawable0.getIntrinsicHeight());
                    }
                    ++v3;
                    ++v5;
                    g2 = g7;
                    i0 = i1;
                    f = f19;
                    s$a1 = s$a2;
                    g3 = g6;
                }
                f12 = f7;
                g1 = g3;
                f11 = f;
                canvas2 = canvas0;
                com.github.mikephil.charting.utils.g.h(g2);
                v = v3;
            }
            else {
                v2 = v1;
                list1 = list0;
                f11 = f;
                f12 = f7;
                canvas2 = canvas1;
                g1 = g0;
            }
            v1 = v2 + 1;
            canvas1 = canvas2;
            g0 = g1;
            list0 = list1;
            f = f11;
            f7 = f12;
        }
        com.github.mikephil.charting.utils.g.h(g0);
        canvas0.restore();
    }

    @Override  // com.github.mikephil.charting.renderer.g
    public void j() {
    }

    protected float l(com.github.mikephil.charting.utils.g g0, float f, float f1, float f2, float f3, float f4, float f5) {
        double f6 = (double)((f4 + f5) * 0.017453f);
        float f7 = g0.c + ((float)Math.cos(f6)) * f;
        float f8 = g0.d + ((float)Math.sin(f6)) * f;
        double f9 = (double)((f4 + f5 / 2.0f) * 0.017453f);
        return (float)(((double)(f - ((float)(Math.sqrt(Math.pow(f7 - f2, 2.0) + Math.pow(f8 - f3, 2.0)) / 2.0 * Math.tan((180.0 - ((double)f1)) / 2.0 * 0.017453))))) - Math.sqrt(Math.pow(g0.c + ((float)Math.cos(f9)) * f - (f7 + f2) / 2.0f, 2.0) + Math.pow(g0.d + ((float)Math.sin(f9)) * f - (f8 + f3) / 2.0f, 2.0)));
    }

    protected void m(Canvas canvas0) {
        com.github.mikephil.charting.utils.g g2;
        CharSequence charSequence0 = this.g.getCenterText();
        if(this.g.k0() && charSequence0 != null) {
            com.github.mikephil.charting.utils.g g0 = this.g.getCenterCircleBox();
            com.github.mikephil.charting.utils.g g1 = this.g.getCenterTextOffset();
            float f = g0.c + g1.c;
            float f1 = g0.d + g1.d;
            float f2 = !this.g.m0() || this.g.o0() ? this.g.getRadius() : this.g.getRadius() * (this.g.getHoleRadius() / 100.0f);
            RectF[] arr_rectF = this.p;
            RectF rectF0 = arr_rectF[0];
            rectF0.left = f - f2;
            rectF0.top = f1 - f2;
            rectF0.right = f + f2;
            rectF0.bottom = f1 + f2;
            RectF rectF1 = arr_rectF[1];
            rectF1.set(rectF0);
            float f3 = this.g.getCenterTextRadiusPercent();
            if(((double)(f3 / 100.0f)) > 0.0) {
                rectF1.inset((rectF1.width() - rectF1.width() * (f3 / 100.0f)) / 2.0f, (rectF1.height() - rectF1.height() * (f3 / 100.0f)) / 2.0f);
            }
            if(!charSequence0.equals(this.n) || !rectF1.equals(this.o)) {
                this.o.set(rectF1);
                this.n = charSequence0;
                float f4 = this.o.width();
                g2 = g1;
                this.m = new StaticLayout(charSequence0, 0, charSequence0.length(), this.k, ((int)Math.max(Math.ceil(f4), 1.0)), Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, false);
            }
            else {
                g2 = g1;
            }
            float f5 = (float)this.m.getHeight();
            canvas0.save();
            Path path0 = this.v;
            path0.reset();
            path0.addOval(rectF0, Path.Direction.CW);
            canvas0.clipPath(path0);
            canvas0.translate(rectF1.left, rectF1.top + (rectF1.height() - f5) / 2.0f);
            this.m.draw(canvas0);
            canvas0.restore();
            com.github.mikephil.charting.utils.g.h(g0);
            com.github.mikephil.charting.utils.g.h(g2);
        }
    }

    protected void n(Canvas canvas0, i i0) {
        com.github.mikephil.charting.utils.g g1;
        int v7;
        float f19;
        RectF rectF2;
        com.github.mikephil.charting.utils.g g2;
        RectF rectF3;
        int v5;
        int v4;
        float f = this.g.getRotationAngle();
        float f1 = this.b.h();
        float f2 = this.b.i();
        RectF rectF0 = this.g.getCircleBox();
        int v = i0.N();
        float[] arr_f = this.g.getDrawAngles();
        com.github.mikephil.charting.utils.g g0 = this.g.getCenterCircleBox();
        float f3 = this.g.getRadius();
        boolean z = this.g.m0() && !this.g.o0();
        float f4 = z ? this.g.getHoleRadius() / 100.0f * f3 : 0.0f;
        float f5 = (f3 - this.g.getHoleRadius() * f3 / 100.0f) / 2.0f;
        RectF rectF1 = new RectF();
        boolean z1 = z && this.g.n0();
        int v2 = 0;
        for(int v1 = 0; v1 < v; ++v1) {
            if(Math.abs(((PieEntry)i0.l(v1)).d()) > k.g) {
                ++v2;
            }
        }
        float f6 = v2 > 1 ? this.v(i0) : 0.0f;
        int v3 = 0;
        float f7 = 0.0f;
        while(v3 < v) {
            float f8 = arr_f[v3];
            float f9 = Math.abs(i0.l(v3).d());
            float f10 = k.g;
            if(f9 <= f10 || this.g.q0(v3) && !z1) {
                f7 += f8 * f1;
                v4 = v3;
                rectF2 = rectF1;
                v7 = v2;
                f19 = f4;
                g1 = g0;
            }
            else {
                boolean z2 = f6 > 0.0f && f8 <= 180.0f;
                this.c.setColor(i0.Y0(v3));
                float f11 = v2 == 1 ? 0.0f : f6 / (f3 * 0.017453f);
                float f12 = f + (f7 + f11 / 2.0f) * f2;
                float f13 = (f8 - f11) * f2 < 0.0f ? 0.0f : (f8 - f11) * f2;
                this.s.reset();
                if(z1) {
                    float f14 = f3 - f5;
                    v4 = v3;
                    v5 = v2;
                    float f15 = g0.c + ((float)Math.cos(f12 * 0.017453f)) * f14;
                    float f16 = g0.d + f14 * ((float)Math.sin(f12 * 0.017453f));
                    rectF1.set(f15 - f5, f16 - f5, f15 + f5, f16 + f5);
                }
                else {
                    v4 = v3;
                    v5 = v2;
                }
                float f17 = g0.c + ((float)Math.cos(f12 * 0.017453f)) * f3;
                float f18 = g0.d + ((float)Math.sin(f12 * 0.017453f)) * f3;
                int v6 = Float.compare(f13, 360.0f);
                if(v6 < 0 || f13 % 360.0f > f10) {
                    if(z1) {
                        this.s.arcTo(rectF1, f12 + 180.0f, -180.0f);
                    }
                    this.s.arcTo(rectF0, f12, f13);
                }
                else {
                    this.s.addCircle(g0.c, g0.d, f3, Path.Direction.CW);
                }
                this.t.set(g0.c - f4, g0.d - f4, g0.c + f4, g0.d + f4);
                if(z) {
                    if(f4 > 0.0f || z2) {
                        if(z2) {
                            v7 = v5;
                            f19 = f4;
                            rectF3 = rectF1;
                            g2 = g0;
                            float f20 = this.l(g0, f3, f8 * f2, f17, f18, f12, f13);
                            if(f20 < 0.0f) {
                                f20 = -f20;
                            }
                            f4 = Math.max(f19, f20);
                        }
                        else {
                            rectF3 = rectF1;
                            f19 = f4;
                            g2 = g0;
                            v7 = v5;
                        }
                        float f21 = v7 == 1 || f4 == 0.0f ? 0.0f : f6 / (f4 * 0.017453f);
                        float f22 = (f8 - f21) * f2 < 0.0f ? 0.0f : (f8 - f21) * f2;
                        float f23 = f + (f7 + f21 / 2.0f) * f2 + f22;
                        if(v6 < 0 || f13 % 360.0f > f10) {
                            if(z1) {
                                float f24 = f3 - f5;
                                float f25 = g2.c + ((float)Math.cos(f23 * 0.017453f)) * f24;
                                float f26 = g2.d + f24 * ((float)Math.sin(f23 * 0.017453f));
                                rectF3.set(f25 - f5, f26 - f5, f25 + f5, f26 + f5);
                                this.s.arcTo(rectF3, f23, 180.0f);
                                rectF2 = rectF3;
                            }
                            else {
                                rectF2 = rectF3;
                                this.s.lineTo(g2.c + ((float)Math.cos(f23 * 0.017453f)) * f4, g2.d + f4 * ((float)Math.sin(f23 * 0.017453f)));
                            }
                            this.s.arcTo(this.t, f23, -f22);
                        }
                        else {
                            this.s.addCircle(g2.c, g2.d, f4, Path.Direction.CCW);
                            rectF2 = rectF3;
                        }
                        g1 = g2;
                        goto label_106;
                    }
                    else {
                        rectF2 = rectF1;
                        f19 = f4;
                        v7 = v5;
                        g1 = g0;
                        goto label_99;
                    }
                    goto label_95;
                }
                else {
                label_95:
                    rectF2 = rectF1;
                    f19 = f4;
                    v7 = v5;
                    g1 = g0;
                }
            label_99:
                if(f13 % 360.0f > f10) {
                    if(z2) {
                        float f27 = this.l(g1, f3, f8 * f2, f17, f18, f12, f13);
                        double f28 = (double)((f12 + f13 / 2.0f) * 0.017453f);
                        this.s.lineTo(g1.c + ((float)Math.cos(f28)) * f27, g1.d + f27 * ((float)Math.sin(f28)));
                    }
                    else {
                        this.s.lineTo(g1.c, g1.d);
                    }
                }
            label_106:
                this.s.close();
                this.r.drawPath(this.s, this.c);
                f7 += f8 * f1;
            }
            v3 = v4 + 1;
            rectF1 = rectF2;
            f4 = f19;
            g0 = g1;
            v2 = v7;
        }
        com.github.mikephil.charting.utils.g.h(g0);
    }

    protected void o(Canvas canvas0, String s, float f, float f1) {
        canvas0.drawText(s, f, f1, this.l);
    }

    protected void p(Canvas canvas0) {
        if(this.g.m0() && this.r != null) {
            float f = this.g.getRadius();
            float f1 = this.g.getHoleRadius() / 100.0f * f;
            com.github.mikephil.charting.utils.g g0 = this.g.getCenterCircleBox();
            if(Color.alpha(this.h.getColor()) > 0) {
                this.r.drawCircle(g0.c, g0.d, f1, this.h);
            }
            if(Color.alpha(this.i.getColor()) > 0 && this.g.getTransparentCircleRadius() > this.g.getHoleRadius()) {
                int v = this.i.getAlpha();
                float f2 = this.g.getTransparentCircleRadius();
                this.i.setAlpha(((int)(((float)v) * this.b.h() * this.b.i())));
                this.u.reset();
                this.u.addCircle(g0.c, g0.d, f * (f2 / 100.0f), Path.Direction.CW);
                this.u.addCircle(g0.c, g0.d, f1, Path.Direction.CCW);
                this.r.drawPath(this.u, this.i);
                this.i.setAlpha(v);
            }
            com.github.mikephil.charting.utils.g.h(g0);
        }
    }

    protected void q(Canvas canvas0) {
        float f9;
        float[] arr_f1;
        float f8;
        if(!this.g.n0()) {
            return;
        }
        i i0 = ((r)this.g.getData()).Q();
        if(!i0.isVisible()) {
            return;
        }
        float f = this.b.h();
        float f1 = this.b.i();
        com.github.mikephil.charting.utils.g g0 = this.g.getCenterCircleBox();
        float f2 = this.g.getRadius();
        float f3 = (f2 - this.g.getHoleRadius() * f2 / 100.0f) / 2.0f;
        float[] arr_f = this.g.getDrawAngles();
        float f4 = this.g.getRotationAngle();
        int v = 0;
        while(v < i0.N()) {
            float f5 = arr_f[v];
            if(Math.abs(i0.l(v).d()) > k.g) {
                double f6 = (double)(f2 - f3);
                double f7 = (double)((f4 + f5) * f1);
                f8 = f1;
                arr_f1 = arr_f;
                f9 = f4;
                float f10 = (float)(((double)g0.c) + Math.cos(Math.toRadians(f7)) * f6);
                float f11 = (float)(f6 * Math.sin(Math.toRadians(f7)) + ((double)g0.d));
                this.c.setColor(i0.Y0(v));
                this.r.drawCircle(f10, f11, f3, this.c);
            }
            else {
                f8 = f1;
                arr_f1 = arr_f;
                f9 = f4;
            }
            f4 = f9 + f5 * f;
            ++v;
            f1 = f8;
            arr_f = arr_f1;
        }
        com.github.mikephil.charting.utils.g.h(g0);
    }

    public TextPaint r() {
        return this.k;
    }

    public Paint s() {
        return this.l;
    }

    public Paint t() {
        return this.h;
    }

    public Paint u() {
        return this.i;
    }

    protected float v(i i0) {
        if(!i0.k()) {
            return i0.I0();
        }
        return i0.I0() / this.a.y() > i0.p0() / ((r)this.g.getData()).T() * 2.0f ? 0.0f : i0.I0();
    }

    public void w() {
        Canvas canvas0 = this.r;
        if(canvas0 != null) {
            canvas0.setBitmap(null);
            this.r = null;
        }
        WeakReference weakReference0 = this.q;
        if(weakReference0 != null) {
            Bitmap bitmap0 = (Bitmap)weakReference0.get();
            if(bitmap0 != null) {
                bitmap0.recycle();
            }
            this.q.clear();
            this.q = null;
        }
    }
}

