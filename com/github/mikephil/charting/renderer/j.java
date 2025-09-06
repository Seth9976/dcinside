package com.github.mikephil.charting.renderer;

import android.graphics.Bitmap.Config;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint.Style;
import android.graphics.Paint;
import android.graphics.Path.Direction;
import android.graphics.Path;
import android.graphics.drawable.Drawable;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.data.n;
import com.github.mikephil.charting.highlight.d;
import com.github.mikephil.charting.utils.i;
import com.github.mikephil.charting.utils.l;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import s1.g;
import t1.f;

public class j extends k {
    static class a {
        static final int[] a;

        static {
            int[] arr_v = new int[com.github.mikephil.charting.data.o.a.values().length];
            a.a = arr_v;
            try {
                arr_v[com.github.mikephil.charting.data.o.a.a.ordinal()] = 1;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                a.a[com.github.mikephil.charting.data.o.a.b.ordinal()] = 2;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                a.a[com.github.mikephil.charting.data.o.a.c.ordinal()] = 3;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                a.a[com.github.mikephil.charting.data.o.a.d.ordinal()] = 4;
            }
            catch(NoSuchFieldError unused_ex) {
            }
        }
    }

    class b {
        private Path a;
        private Bitmap[] b;
        final j c;

        private b() {
            this.a = new Path();
        }

        b(a j$a0) {
        }

        protected void a(f f0, boolean z, boolean z1) {
            int v = f0.E();
            float f1 = f0.U0();
            float f2 = f0.g0();
            for(int v1 = 0; v1 < v; ++v1) {
                int v2 = (int)(((double)f1) * 2.1);
                Bitmap bitmap0 = Bitmap.createBitmap(v2, v2, Bitmap.Config.ARGB_4444);
                Canvas canvas0 = new Canvas(bitmap0);
                this.b[v1] = bitmap0;
                j.this.c.setColor(f0.d0(v1));
                if(z1) {
                    this.a.reset();
                    this.a.addCircle(f1, f1, f1, Path.Direction.CW);
                    this.a.addCircle(f1, f1, f2, Path.Direction.CCW);
                    canvas0.drawPath(this.a, j.this.c);
                }
                else {
                    canvas0.drawCircle(f1, f1, f1, j.this.c);
                    if(z) {
                        canvas0.drawCircle(f1, f1, f2, j.this.j);
                    }
                }
            }
        }

        protected Bitmap b(int v) {
            return this.b[v % this.b.length];
        }

        protected boolean c(f f0) {
            int v = f0.E();
            Bitmap[] arr_bitmap = this.b;
            if(arr_bitmap == null) {
                this.b = new Bitmap[v];
                return true;
            }
            if(arr_bitmap.length != v) {
                this.b = new Bitmap[v];
                return true;
            }
            return false;
        }
    }

    protected g i;
    protected Paint j;
    protected WeakReference k;
    protected Canvas l;
    protected Bitmap.Config m;
    protected Path n;
    protected Path o;
    private float[] p;
    protected Path q;
    private HashMap r;
    private float[] s;

    public j(g g0, com.github.mikephil.charting.animation.a a0, l l0) {
        super(a0, l0);
        this.m = Bitmap.Config.ARGB_8888;
        this.n = new Path();
        this.o = new Path();
        this.p = new float[4];
        this.q = new Path();
        this.r = new HashMap();
        this.s = new float[2];
        this.i = g0;
        Paint paint0 = new Paint(1);
        this.j = paint0;
        paint0.setStyle(Paint.Style.FILL);
        this.j.setColor(-1);
    }

    public void A() {
        Canvas canvas0 = this.l;
        if(canvas0 != null) {
            canvas0.setBitmap(null);
            this.l = null;
        }
        WeakReference weakReference0 = this.k;
        if(weakReference0 != null) {
            Bitmap bitmap0 = (Bitmap)weakReference0.get();
            if(bitmap0 != null) {
                bitmap0.recycle();
            }
            this.k.clear();
            this.k = null;
        }
    }

    public void B(Bitmap.Config bitmap$Config0) {
        this.m = bitmap$Config0;
        this.A();
    }

    @Override  // com.github.mikephil.charting.renderer.g
    public void b(Canvas canvas0) {
        Iterator iterator0;
        int v = (int)this.a.o();
        int v1 = (int)this.a.n();
        Bitmap bitmap0 = this.k == null ? null : ((Bitmap)this.k.get());
        if(bitmap0 != null && bitmap0.getWidth() == v && bitmap0.getHeight() == v1) {
            bitmap0.eraseColor(0);
            iterator0 = this.i.getLineData().q().iterator();
        label_13:
            while(iterator0.hasNext()) {
                Object object0 = iterator0.next();
                f f0 = (f)object0;
                if(f0.isVisible()) {
                    this.u(canvas0, f0);
                }
            }
            canvas0.drawBitmap(bitmap0, 0.0f, 0.0f, this.c);
        }
        else if(v > 0 && v1 > 0) {
            bitmap0 = Bitmap.createBitmap(v, v1, this.m);
            this.k = new WeakReference(bitmap0);
            this.l = new Canvas(bitmap0);
            bitmap0.eraseColor(0);
            iterator0 = this.i.getLineData().q().iterator();
            goto label_13;
        }
    }

    @Override  // com.github.mikephil.charting.renderer.g
    public void c(Canvas canvas0) {
        this.r(canvas0);
    }

    @Override  // com.github.mikephil.charting.renderer.g
    public void d(Canvas canvas0, d[] arr_d) {
        n n0 = this.i.getLineData();
        for(int v = 0; v < arr_d.length; ++v) {
            d d0 = arr_d[v];
            f f0 = (f)n0.k(d0.d());
            if(f0 != null && f0.f0()) {
                Entry entry0 = f0.M0(d0.h(), d0.j());
                if(this.l(entry0, f0)) {
                    com.github.mikephil.charting.utils.f f1 = this.i.d(f0.E0()).f(entry0.l(), entry0.d() * this.b.i());
                    d0.n(((float)f1.c), ((float)f1.d));
                    this.n(canvas0, ((float)f1.c), ((float)f1.d), f0);
                }
            }
        }
    }

    @Override  // com.github.mikephil.charting.renderer.g
    public void e(Canvas canvas0, String s, float f, float f1, int v) {
        this.f.setColor(v);
        canvas0.drawText(s, f, f1, this.f);
    }

    @Override  // com.github.mikephil.charting.renderer.g
    public void f(Canvas canvas0) {
        f f3;
        int v4;
        Entry entry1;
        if(this.k(this.i)) {
            List list0 = this.i.getLineData().q();
            for(int v = 0; v < list0.size(); ++v) {
                f f0 = (f)list0.get(v);
                if(this.m(f0) && f0.N() >= 1) {
                    this.a(f0);
                    i i0 = this.i.d(f0.E0());
                    int v1 = (int)(f0.U0() * 1.75f);
                    if(!f0.e0()) {
                        v1 /= 2;
                    }
                    int v2 = v1;
                    this.g.a(this.i, f0);
                    float[] arr_f = i0.c(f0, this.b.h(), this.b.i(), this.g.a, this.g.b);
                    com.github.mikephil.charting.formatter.l l0 = f0.t0();
                    com.github.mikephil.charting.utils.g g0 = com.github.mikephil.charting.utils.g.d(f0.m1());
                    g0.c = com.github.mikephil.charting.utils.k.e(g0.c);
                    g0.d = com.github.mikephil.charting.utils.k.e(g0.d);
                    int v3 = 0;
                    while(v3 < arr_f.length) {
                        float f1 = arr_f[v3];
                        float f2 = arr_f[v3 + 1];
                        if(!this.a.J(f1)) {
                            break;
                        }
                        if(this.a.I(f1) && this.a.M(f2)) {
                            Entry entry0 = f0.l(this.g.a + v3 / 2);
                            if(f0.D0()) {
                                entry1 = entry0;
                                v4 = v2;
                                f3 = f0;
                                this.e(canvas0, l0.j(entry0), f1, f2 - ((float)v2), f0.q(v3 / 2));
                            }
                            else {
                                entry1 = entry0;
                                v4 = v2;
                                f3 = f0;
                            }
                            if(entry1.c() != null && f3.K()) {
                                Drawable drawable0 = entry1.c();
                                com.github.mikephil.charting.utils.k.k(canvas0, drawable0, ((int)(f1 + g0.c)), ((int)(f2 + g0.d)), drawable0.getIntrinsicWidth(), drawable0.getIntrinsicHeight());
                            }
                        }
                        else {
                            v4 = v2;
                            f3 = f0;
                        }
                        v3 += 2;
                        f0 = f3;
                        v2 = v4;
                    }
                    com.github.mikephil.charting.utils.g.h(g0);
                }
            }
        }
    }

    @Override  // com.github.mikephil.charting.renderer.g
    public void j() {
    }

    protected void r(Canvas canvas0) {
        b j$b0;
        this.c.setStyle(Paint.Style.FILL);
        float f = this.b.i();
        float[] arr_f = this.s;
        arr_f[0] = 0.0f;
        arr_f[1] = 0.0f;
        List list0 = this.i.getLineData().q();
        for(int v = 0; v < list0.size(); ++v) {
            f f1 = (f)list0.get(v);
            if(f1.isVisible() && f1.e0() && f1.N() != 0) {
                this.j.setColor(f1.i());
                i i0 = this.i.d(f1.E0());
                this.g.a(this.i, f1);
                float f2 = f1.U0();
                float f3 = f1.g0();
                boolean z = f1.q1() && f3 < f2 && f3 > 0.0f;
                boolean z1 = z && f1.i() == 0x112233;
                if(this.r.containsKey(f1)) {
                    j$b0 = (b)this.r.get(f1);
                }
                else {
                    j$b0 = new b(this, null);
                    this.r.put(f1, j$b0);
                }
                if(j$b0.c(f1)) {
                    j$b0.a(f1, z, z1);
                }
                int v1 = this.g.a;
                int v2 = this.g.c + v1;
                while(v1 <= v2) {
                    Entry entry0 = f1.l(v1);
                    if(entry0 == null) {
                        break;
                    }
                    float[] arr_f1 = this.s;
                    arr_f1[0] = entry0.l();
                    float[] arr_f2 = this.s;
                    arr_f2[1] = entry0.d() * f;
                    i0.o(this.s);
                    if(!this.a.J(this.s[0])) {
                        break;
                    }
                    if(this.a.I(this.s[0]) && this.a.M(this.s[1])) {
                        Bitmap bitmap0 = j$b0.b(v1);
                        if(bitmap0 != null) {
                            canvas0.drawBitmap(bitmap0, this.s[0] - f2, this.s[1] - f2, null);
                        }
                    }
                    ++v1;
                }
            }
        }
    }

    protected void s(f f0) {
        float f1 = this.b.i();
        i i0 = this.i.d(f0.E0());
        this.g.a(this.i, f0);
        float f2 = f0.r0();
        this.n.reset();
        com.github.mikephil.charting.renderer.c.a c$a0 = this.g;
        if(c$a0.c >= 1) {
            int v = c$a0.a;
            Entry entry0 = f0.l(Math.max(v - 1, 0));
            Entry entry1 = f0.l(Math.max(v, 0));
            if(entry1 == null) {
                return;
            }
            this.n.moveTo(entry1.l(), entry1.d() * f1);
            Entry entry2 = entry1;
            int v1 = this.g.a + 1;
            for(int v2 = -1; v1 <= this.g.c + this.g.a; v2 = v4) {
                if(v2 != v1) {
                    entry1 = f0.l(v1);
                }
                int v3 = v1 + 1;
                if(v3 < f0.N()) {
                    v1 = v3;
                }
                Entry entry3 = f0.l(v1);
                float f3 = entry1.l();
                float f4 = entry0.l();
                float f5 = entry1.d();
                float f6 = entry0.d();
                float f7 = entry3.l();
                float f8 = entry2.l();
                float f9 = entry3.d();
                float f10 = entry2.d();
                this.n.cubicTo(entry2.l() + (f3 - f4) * f2, (entry2.d() + (f5 - f6) * f2) * f1, entry1.l() - (f7 - f8) * f2, (entry1.d() - (f9 - f10) * f2) * f1, entry1.l(), entry1.d() * f1);
                entry0 = entry2;
                entry2 = entry1;
                entry1 = entry3;
                int v4 = v1;
                v1 = v3;
            }
        }
        if(f0.V0()) {
            this.o.reset();
            this.o.addPath(this.n);
            this.t(this.l, f0, this.o, i0, this.g);
        }
        this.c.setColor(f0.getColor());
        this.c.setStyle(Paint.Style.STROKE);
        i0.l(this.n);
        this.l.drawPath(this.n, this.c);
        this.c.setPathEffect(null);
    }

    protected void t(Canvas canvas0, f f0, Path path0, i i0, com.github.mikephil.charting.renderer.c.a c$a0) {
        float f1 = f0.I().a(f0, this.i);
        path0.lineTo(f0.l(c$a0.a + c$a0.c).l(), f1);
        path0.lineTo(f0.l(c$a0.a).l(), f1);
        path0.close();
        i0.l(path0);
        Drawable drawable0 = f0.j();
        if(drawable0 != null) {
            this.q(canvas0, path0, drawable0);
            return;
        }
        this.p(canvas0, path0, f0.F(), f0.k0());
    }

    protected void u(Canvas canvas0, f f0) {
        if(f0.N() < 1) {
            return;
        }
        this.c.setStrokeWidth(f0.n0());
        this.c.setPathEffect(f0.O());
        switch(f0.X0()) {
            case 3: {
                this.s(f0);
                break;
            }
            case 4: {
                this.v(f0);
                break;
            }
            default: {
                this.w(canvas0, f0);
            }
        }
        this.c.setPathEffect(null);
    }

    protected void v(f f0) {
        float f1 = this.b.i();
        i i0 = this.i.d(f0.E0());
        this.g.a(this.i, f0);
        this.n.reset();
        com.github.mikephil.charting.renderer.c.a c$a0 = this.g;
        if(c$a0.c >= 1) {
            Entry entry0 = f0.l(c$a0.a);
            this.n.moveTo(entry0.l(), entry0.d() * f1);
            int v = this.g.a + 1;
            while(v <= this.g.c + this.g.a) {
                Entry entry1 = f0.l(v);
                float f2 = entry0.l() + (entry1.l() - entry0.l()) / 2.0f;
                this.n.cubicTo(f2, entry0.d() * f1, f2, entry1.d() * f1, entry1.l(), entry1.d() * f1);
                ++v;
                entry0 = entry1;
            }
        }
        if(f0.V0()) {
            this.o.reset();
            this.o.addPath(this.n);
            this.t(this.l, f0, this.o, i0, this.g);
        }
        this.c.setColor(f0.getColor());
        this.c.setStyle(Paint.Style.STROKE);
        i0.l(this.n);
        this.l.drawPath(this.n, this.c);
        this.c.setPathEffect(null);
    }

    protected void w(Canvas canvas0, f f0) {
        int v = f0.N();
        boolean z = f0.X0() == com.github.mikephil.charting.data.o.a.b;
        i i0 = this.i.d(f0.E0());
        float f1 = this.b.i();
        this.c.setStyle(Paint.Style.STROKE);
        Canvas canvas1 = f0.g() ? this.l : canvas0;
        this.g.a(this.i, f0);
        if(f0.V0() && v > 0) {
            this.x(canvas0, f0, i0, this.g);
        }
        if(f0.z0().size() > 1) {
            if(this.p.length <= (z ? 4 : 2) * 2) {
                this.p = new float[(z ? 4 : 2) * 4];
            }
            for(int v1 = this.g.a; v1 <= this.g.c + this.g.a; ++v1) {
                Entry entry0 = f0.l(v1);
                if(entry0 != null) {
                    float[] arr_f = this.p;
                    arr_f[0] = entry0.l();
                    float[] arr_f1 = this.p;
                    arr_f1[1] = entry0.d() * f1;
                    if(v1 < this.g.b) {
                        Entry entry1 = f0.l(v1 + 1);
                        if(entry1 == null) {
                            break;
                        }
                        if(z) {
                            float[] arr_f2 = this.p;
                            arr_f2[2] = entry1.l();
                            float[] arr_f3 = this.p;
                            float f2 = arr_f3[1];
                            arr_f3[3] = f2;
                            arr_f3[4] = arr_f3[2];
                            arr_f3[5] = f2;
                            arr_f3[6] = entry1.l();
                            float[] arr_f4 = this.p;
                            arr_f4[7] = entry1.d() * f1;
                        }
                        else {
                            float[] arr_f5 = this.p;
                            arr_f5[2] = entry1.l();
                            float[] arr_f6 = this.p;
                            arr_f6[3] = entry1.d() * f1;
                        }
                    }
                    else {
                        float[] arr_f7 = this.p;
                        arr_f7[2] = arr_f7[0];
                        arr_f7[3] = arr_f7[1];
                    }
                    i0.o(this.p);
                    if(!this.a.J(this.p[0])) {
                        break;
                    }
                    if(this.a.I(this.p[2]) && (this.a.K(this.p[1]) || this.a.H(this.p[3]))) {
                        this.c.setColor(f0.Y0(v1));
                        canvas1.drawLines(this.p, 0, (z ? 4 : 2) * 2, this.c);
                    }
                }
            }
        }
        else {
            int v2 = v * (z ? 4 : 2);
            if(this.p.length < Math.max(v2, (z ? 4 : 2)) * 2) {
                this.p = new float[Math.max(v2, (z ? 4 : 2)) * 4];
            }
            if(f0.l(this.g.a) != null) {
                int v3 = this.g.a;
                int v4 = 0;
                while(v3 <= this.g.c + this.g.a) {
                    Entry entry2 = f0.l((v3 == 0 ? 0 : v3 - 1));
                    Entry entry3 = f0.l(v3);
                    if(entry2 != null && entry3 != null) {
                        float[] arr_f8 = this.p;
                        arr_f8[v4] = entry2.l();
                        float[] arr_f9 = this.p;
                        int v5 = v4 + 2;
                        arr_f9[v4 + 1] = entry2.d() * f1;
                        if(z) {
                            float[] arr_f10 = this.p;
                            arr_f10[v5] = entry3.l();
                            float[] arr_f11 = this.p;
                            arr_f11[v4 + 3] = entry2.d() * f1;
                            float[] arr_f12 = this.p;
                            arr_f12[v4 + 4] = entry3.l();
                            float[] arr_f13 = this.p;
                            v5 = v4 + 6;
                            arr_f13[v4 + 5] = entry2.d() * f1;
                        }
                        float[] arr_f14 = this.p;
                        arr_f14[v5] = entry3.l();
                        float[] arr_f15 = this.p;
                        arr_f15[v5 + 1] = entry3.d() * f1;
                        v4 = v5 + 2;
                    }
                    ++v3;
                }
                if(v4 > 0) {
                    i0.o(this.p);
                    int v6 = Math.max((this.g.c + 1) * (z ? 4 : 2), (z ? 4 : 2));
                    this.c.setColor(f0.getColor());
                    canvas1.drawLines(this.p, 0, v6 * 2, this.c);
                }
            }
        }
        this.c.setPathEffect(null);
    }

    protected void x(Canvas canvas0, f f0, i i0, com.github.mikephil.charting.renderer.c.a c$a0) {
        Path path0 = this.q;
        int v = c$a0.a;
        int v1 = c$a0.c + v;
        int v2 = 0;
        do {
            int v3 = v2 * 0x80 + v;
            int v4 = v3 + 0x80 <= v1 ? v3 + 0x80 : v1;
            if(v3 <= v4) {
                this.y(f0, v3, v4, path0);
                i0.l(path0);
                Drawable drawable0 = f0.j();
                if(drawable0 == null) {
                    this.p(canvas0, path0, f0.F(), f0.k0());
                }
                else {
                    this.q(canvas0, path0, drawable0);
                }
            }
            ++v2;
        }
        while(v3 <= v4);
    }

    private void y(f f0, int v, int v1, Path path0) {
        float f1 = f0.I().a(f0, this.i);
        float f2 = this.b.i();
        boolean z = f0.X0() == com.github.mikephil.charting.data.o.a.b;
        path0.reset();
        Entry entry0 = f0.l(v);
        path0.moveTo(entry0.l(), f1);
        path0.lineTo(entry0.l(), entry0.d() * f2);
        int v2 = v + 1;
        Entry entry1 = null;
        while(v2 <= v1) {
            entry1 = f0.l(v2);
            if(z) {
                path0.lineTo(entry1.l(), entry0.d() * f2);
            }
            path0.lineTo(entry1.l(), entry1.d() * f2);
            ++v2;
            entry0 = entry1;
        }
        if(entry1 != null) {
            path0.lineTo(entry1.l(), f1);
        }
        path0.close();
    }

    public Bitmap.Config z() {
        return this.m;
    }
}

