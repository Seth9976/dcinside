package com.github.mikephil.charting.renderer;

import android.graphics.Canvas;
import android.graphics.DashPathEffect;
import android.graphics.Paint.Align;
import android.graphics.Paint.FontMetrics;
import android.graphics.Paint.Style;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Typeface;
import com.github.mikephil.charting.components.e.b;
import com.github.mikephil.charting.components.e.c;
import com.github.mikephil.charting.components.e.d;
import com.github.mikephil.charting.components.e.e;
import com.github.mikephil.charting.components.e.f;
import com.github.mikephil.charting.data.PieEntry;
import com.github.mikephil.charting.utils.k;
import com.github.mikephil.charting.utils.l;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class i extends o {
    static class a {
        static final int[] a;
        static final int[] b;
        static final int[] c;
        static final int[] d;

        static {
            int[] arr_v = new int[c.values().length];
            a.d = arr_v;
            try {
                arr_v[c.a.ordinal()] = 1;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                a.d[c.b.ordinal()] = 2;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                a.d[c.c.ordinal()] = 3;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                a.d[c.e.ordinal()] = 4;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                a.d[c.d.ordinal()] = 5;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                a.d[c.f.ordinal()] = 6;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            int[] arr_v1 = new int[e.values().length];
            a.c = arr_v1;
            try {
                arr_v1[e.a.ordinal()] = 1;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                a.c[e.b.ordinal()] = 2;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            int[] arr_v2 = new int[f.values().length];
            a.b = arr_v2;
            try {
                arr_v2[f.a.ordinal()] = 1;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                a.b[f.c.ordinal()] = 2;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                a.b[f.b.ordinal()] = 3;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            int[] arr_v3 = new int[d.values().length];
            a.a = arr_v3;
            try {
                arr_v3[d.a.ordinal()] = 1;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                a.a[d.c.ordinal()] = 2;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                a.a[d.b.ordinal()] = 3;
            }
            catch(NoSuchFieldError unused_ex) {
            }
        }
    }

    protected Paint b;
    protected Paint c;
    protected com.github.mikephil.charting.components.e d;
    protected List e;
    protected Paint.FontMetrics f;
    private Path g;

    public i(l l0, com.github.mikephil.charting.components.e e0) {
        super(l0);
        this.e = new ArrayList(16);
        this.f = new Paint.FontMetrics();
        this.g = new Path();
        this.d = e0;
        Paint paint0 = new Paint(1);
        this.b = paint0;
        paint0.setTextSize(k.e(9.0f));
        this.b.setTextAlign(Paint.Align.LEFT);
        Paint paint1 = new Paint(1);
        this.c = paint1;
        paint1.setStyle(Paint.Style.FILL);
    }

    public void a(com.github.mikephil.charting.data.k k0) {
        com.github.mikephil.charting.data.k k2;
        com.github.mikephil.charting.data.k k1 = k0;
        if(!this.d.I()) {
            this.e.clear();
            int v = 0;
            while(v < k0.m()) {
                t1.e e0 = k1.k(v);
                List list0 = e0.z0();
                int v1 = e0.N();
                if(e0 instanceof t1.a) {
                    t1.a a0 = (t1.a)e0;
                    if(a0.b0()) {
                        String[] arr_s = a0.c0();
                        for(int v2 = 0; v2 < list0.size() && v2 < a0.s(); ++v2) {
                            this.e.add(new com.github.mikephil.charting.components.f(arr_s[v2 % arr_s.length], e0.h(), e0.m(), e0.Q(), e0.J(), ((int)(((Integer)list0.get(v2))))));
                        }
                        if(a0.getLabel() != null) {
                            this.e.add(new com.github.mikephil.charting.components.f(e0.getLabel(), c.a, NaNf, NaNf, null, 0x112233));
                        }
                        k2 = k1;
                    }
                }
                else {
                    if(e0 instanceof t1.i) {
                        t1.i i0 = (t1.i)e0;
                        for(int v3 = 0; v3 < list0.size() && v3 < v1; ++v3) {
                            this.e.add(new com.github.mikephil.charting.components.f(((PieEntry)i0.l(v3)).q(), e0.h(), e0.m(), e0.Q(), e0.J(), ((int)(((Integer)list0.get(v3))))));
                        }
                        if(i0.getLabel() != null) {
                            this.e.add(new com.github.mikephil.charting.components.f(e0.getLabel(), c.a, NaNf, NaNf, null, 0x112233));
                        }
                    }
                    else if(!(e0 instanceof t1.d) || ((t1.d)e0).j0() == 0x112233) {
                        for(int v6 = 0; v6 < list0.size() && v6 < v1; ++v6) {
                            String s = v6 >= list0.size() - 1 || v6 >= v1 - 1 ? k0.k(v).getLabel() : null;
                            this.e.add(new com.github.mikephil.charting.components.f(s, e0.h(), e0.m(), e0.Q(), e0.J(), ((int)(((Integer)list0.get(v6))))));
                        }
                    }
                    else {
                        int v4 = ((t1.d)e0).j0();
                        int v5 = ((t1.d)e0).y();
                        this.e.add(new com.github.mikephil.charting.components.f(null, e0.h(), e0.m(), e0.Q(), e0.J(), v4));
                        this.e.add(new com.github.mikephil.charting.components.f(e0.getLabel(), e0.h(), e0.m(), e0.Q(), e0.J(), v5));
                    }
                    k2 = k0;
                }
                ++v;
                k1 = k2;
            }
            if(this.d.s() != null) {
                Collections.addAll(this.e, this.d.s());
            }
            this.d.P(this.e);
        }
        Typeface typeface0 = this.d.c();
        if(typeface0 != null) {
            this.b.setTypeface(typeface0);
        }
        this.b.setTextSize(this.d.b());
        this.b.setColor(this.d.a());
        this.d.m(this.b, this.a);
    }

    protected void b(Canvas canvas0, float f, float f1, com.github.mikephil.charting.components.f f2, com.github.mikephil.charting.components.e e0) {
        if(f2.f != 0x112234 && (f2.f != 0 && f2.f != 0x112233)) {
            int v = canvas0.save();
            c e$c0 = f2.b == c.c ? e0.t() : f2.b;
            this.c.setColor(f2.f);
            float f3 = k.e((Float.isNaN(f2.c) ? e0.w() : f2.c));
            switch(e$c0) {
                case 3: 
                case 4: {
                    this.c.setStyle(Paint.Style.FILL);
                    canvas0.drawCircle(f + f3 / 2.0f, f1, f3 / 2.0f, this.c);
                    break;
                }
                case 5: {
                    this.c.setStyle(Paint.Style.FILL);
                    canvas0.drawRect(f, f1 - f3 / 2.0f, f + f3, f1 + f3 / 2.0f, this.c);
                    break;
                }
                case 6: {
                    float f4 = k.e((Float.isNaN(f2.d) ? e0.v() : f2.d));
                    DashPathEffect dashPathEffect0 = f2.e == null ? e0.u() : f2.e;
                    this.c.setStyle(Paint.Style.STROKE);
                    this.c.setStrokeWidth(f4);
                    this.c.setPathEffect(dashPathEffect0);
                    this.g.reset();
                    this.g.moveTo(f, f1);
                    this.g.lineTo(f + f3, f1);
                    canvas0.drawPath(this.g, this.c);
                }
            }
            canvas0.restoreToCount(v);
        }
    }

    protected void c(Canvas canvas0, float f, float f1, String s) {
        canvas0.drawText(s, f, f1, this.b);
    }

    public Paint d() {
        return this.c;
    }

    public Paint e() {
        return this.b;
    }

    public void f(Canvas canvas0) {
        com.github.mikephil.charting.components.f f35;
        b e$b3;
        float f34;
        float f33;
        float f32;
        float f31;
        float f26;
        float f24;
        float f23;
        float f22;
        float f25;
        List list4;
        int v3;
        List list3;
        float f21;
        float f20;
        float f13;
        float f12;
        float f11;
        double f15;
        if(!this.d.f()) {
            return;
        }
        Typeface typeface0 = this.d.c();
        if(typeface0 != null) {
            this.b.setTypeface(typeface0);
        }
        this.b.setTextSize(this.d.b());
        this.b.setColor(this.d.a());
        float f = k.u(this.b, this.f);
        float f1 = k.w(this.b, this.f) + k.e(this.d.G());
        float f2 = f - ((float)k.a(this.b, "ABC")) / 2.0f;
        com.github.mikephil.charting.components.f[] arr_f = this.d.r();
        float f3 = k.e(this.d.x());
        float f4 = k.e(this.d.F());
        e e$e0 = this.d.C();
        d e$d0 = this.d.y();
        f e$f0 = this.d.E();
        b e$b0 = this.d.q();
        float f5 = k.e(this.d.w());
        float f6 = k.e(this.d.D());
        float f7 = this.d.e();
        float f8 = this.d.d();
        int v = a.a[e$d0.ordinal()];
        float f9 = f6;
        float f10 = f4;
        switch(v) {
            case 1: {
                f11 = f;
                f12 = f1;
                if(e$e0 != e.b) {
                    f8 += this.a.h();
                }
                f13 = e$b0 == b.b ? f8 + this.d.x : f8;
                break;
            }
            case 2: {
                f11 = f;
                f12 = f1;
                f13 = (e$e0 == e.b ? this.a.o() : this.a.i()) - f8;
                if(e$b0 == b.a) {
                    f13 -= this.d.x;
                }
                break;
            }
            default: {
                if(v == 3) {
                    float f14 = e$e0 == e.b ? this.a.o() / 2.0f : this.a.h() + this.a.k() / 2.0f;
                    b e$b1 = b.a;
                    f12 = f1;
                    f13 = f14 + (e$b0 == e$b1 ? f8 : -f8);
                    if(e$e0 == e.b) {
                        if(e$b0 == e$b1) {
                            f11 = f;
                            f15 = ((double)(-this.d.x)) / 2.0 + ((double)f8);
                        }
                        else {
                            f11 = f;
                            f15 = ((double)this.d.x) / 2.0 - ((double)f8);
                        }
                        f13 = (float)(((double)f13) + f15);
                    }
                    else {
                        f11 = f;
                    }
                }
                else {
                    f11 = f;
                    f12 = f1;
                    f13 = 0.0f;
                }
            }
        }
        switch(e$e0) {
            case 1: {
                float f16 = f9;
                List list0 = this.d.p();
                List list1 = this.d.o();
                List list2 = this.d.n();
                switch(e$f0) {
                    case 1: {
                        break;
                    }
                    case 2: {
                        f7 = this.a.n() - f7 - this.d.y;
                        break;
                    }
                    case 3: {
                        f7 += (this.a.n() - this.d.y) / 2.0f;
                        break;
                    }
                    default: {
                        f7 = 0.0f;
                    }
                }
                float f17 = f13;
                int v1 = 0;
                int v2 = 0;
                while(v1 < arr_f.length) {
                    com.github.mikephil.charting.components.f f18 = arr_f[v1];
                    boolean z = f18.b != c.a;
                    float f19 = Float.isNaN(f18.c) ? f5 : k.e(f18.c);
                    if(v1 >= list2.size() || !((Boolean)list2.get(v1)).booleanValue()) {
                        f21 = f17;
                        f20 = f7;
                    }
                    else {
                        f20 = f7 + (f11 + f12);
                        f21 = f13;
                    }
                    if(f21 == f13 && e$d0 == d.b && v2 < list0.size()) {
                        f21 += (e$b0 == b.b ? ((com.github.mikephil.charting.utils.c)list0.get(v2)).c : -((com.github.mikephil.charting.utils.c)list0.get(v2)).c) / 2.0f;
                        ++v2;
                    }
                    boolean z1 = f18.a == null;
                    if(z) {
                        if(e$b0 == b.b) {
                            f21 -= f19;
                        }
                        list3 = list0;
                        v3 = v1;
                        list4 = list2;
                        this.b(canvas0, f21, f20 + f2, f18, this.d);
                        if(e$b0 == b.a) {
                            f21 += f19;
                        }
                    }
                    else {
                        list4 = list2;
                        list3 = list0;
                        v3 = v1;
                    }
                    if(z1) {
                        f22 = f10;
                        if(e$b0 == b.b) {
                            f24 = f16;
                            f25 = -f24;
                        }
                        else {
                            f24 = f16;
                            f25 = f24;
                        }
                        f17 = f21 + f25;
                    }
                    else {
                        if(z) {
                            f21 += (e$b0 == b.b ? -f3 : f3);
                        }
                        b e$b2 = b.b;
                        if(e$b0 == e$b2) {
                            f21 -= ((com.github.mikephil.charting.utils.c)list1.get(v3)).c;
                        }
                        this.c(canvas0, f21, f20 + f11, f18.a);
                        if(e$b0 == b.a) {
                            f21 += ((com.github.mikephil.charting.utils.c)list1.get(v3)).c;
                        }
                        if(e$b0 == e$b2) {
                            f22 = f10;
                            f23 = -f22;
                        }
                        else {
                            f22 = f10;
                            f23 = f22;
                        }
                        f17 = f21 + f23;
                        f24 = f16;
                    }
                    f10 = f22;
                    f16 = f24;
                    v1 = v3 + 1;
                    f7 = f20;
                    list0 = list3;
                    list2 = list4;
                }
                return;
            }
            case 2: {
                int v4 = a.b[e$f0.ordinal()];
                switch(v4) {
                    case 1: {
                        f26 = (e$d0 == d.b ? 0.0f : this.a.j()) + f7;
                        break;
                    }
                    case 2: {
                        f26 = (e$d0 == d.b ? this.a.n() : this.a.f()) - (this.d.y + f7);
                        break;
                    }
                    default: {
                        f26 = v4 == 3 ? this.a.n() / 2.0f - this.d.y / 2.0f + this.d.e() : 0.0f;
                    }
                }
                float f27 = f26;
                boolean z2 = false;
                int v5 = 0;
                float f28 = 0.0f;
                while(v5 < arr_f.length) {
                    com.github.mikephil.charting.components.f f29 = arr_f[v5];
                    boolean z3 = f29.b != c.a;
                    float f30 = Float.isNaN(f29.c) ? f5 : k.e(f29.c);
                    if(z3) {
                        f31 = e$b0 == b.a ? f13 + f28 : f13 - (f30 - f28);
                        f32 = f2;
                        f33 = f9;
                        f34 = f13;
                        e$b3 = e$b0;
                        this.b(canvas0, f31, f27 + f2, f29, this.d);
                        if(e$b3 == b.a) {
                            f31 += f30;
                        }
                        f35 = f29;
                    }
                    else {
                        f34 = f13;
                        f32 = f2;
                        f33 = f9;
                        e$b3 = e$b0;
                        f35 = f29;
                        f31 = f34;
                    }
                    String s = f35.a;
                    if(s == null) {
                        f28 += f30 + f33;
                        z2 = true;
                    }
                    else {
                        if(z3 && !z2) {
                            f31 += (e$b3 == b.a ? f3 : -f3);
                        }
                        else if(z2) {
                            f31 = f34;
                        }
                        if(e$b3 == b.b) {
                            f31 -= (float)k.d(this.b, s);
                        }
                        if(z2) {
                            f27 += f11 + f12;
                        }
                        this.c(canvas0, f31, f27 + f11, f35.a);
                        f27 += f11 + f12;
                        f28 = 0.0f;
                    }
                    ++v5;
                    e$b0 = e$b3;
                    f9 = f33;
                    f2 = f32;
                    f13 = f34;
                }
            }
        }
    }
}

