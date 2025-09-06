package com.github.mikephil.charting.data;

import android.graphics.Typeface;
import android.util.Log;
import com.github.mikephil.charting.components.k.a;
import com.github.mikephil.charting.formatter.l;
import com.github.mikephil.charting.highlight.d;
import java.util.ArrayList;
import java.util.List;
import t1.e;

public abstract class k {
    protected float a;
    protected float b;
    protected float c;
    protected float d;
    protected float e;
    protected float f;
    protected float g;
    protected float h;
    protected List i;

    public k() {
        this.a = -3.402823E+38f;
        this.b = 3.402823E+38f;
        this.c = -3.402823E+38f;
        this.d = 3.402823E+38f;
        this.e = -3.402823E+38f;
        this.f = 3.402823E+38f;
        this.g = -3.402823E+38f;
        this.h = 3.402823E+38f;
        this.i = new ArrayList();
    }

    public k(List list0) {
        this.a = -3.402823E+38f;
        this.b = 3.402823E+38f;
        this.c = -3.402823E+38f;
        this.d = 3.402823E+38f;
        this.e = -3.402823E+38f;
        this.f = 3.402823E+38f;
        this.g = -3.402823E+38f;
        this.h = 3.402823E+38f;
        this.i = list0;
        this.E();
    }

    public k(e[] arr_e) {
        this.a = -3.402823E+38f;
        this.b = 3.402823E+38f;
        this.c = -3.402823E+38f;
        this.d = 3.402823E+38f;
        this.e = -3.402823E+38f;
        this.f = 3.402823E+38f;
        this.g = -3.402823E+38f;
        this.h = 3.402823E+38f;
        this.i = this.c(arr_e);
        this.E();
    }

    public float A(a k$a0) {
        if(k$a0 == a.a) {
            return this.e == -3.402823E+38f ? this.g : this.e;
        }
        return this.g == -3.402823E+38f ? this.e : this.g;
    }

    public float B() {
        return this.b;
    }

    public float C(a k$a0) {
        if(k$a0 == a.a) {
            return this.f == 3.402823E+38f ? this.h : this.f;
        }
        return this.h == 3.402823E+38f ? this.f : this.h;
    }

    public boolean D() {
        for(Object object0: this.i) {
            if(!((e)object0).f0()) {
                return false;
            }
            if(false) {
                break;
            }
        }
        return true;
    }

    public void E() {
        this.d();
    }

    public boolean F(int v) {
        return v >= this.i.size() || v < 0 ? false : this.G(((e)this.i.get(v)));
    }

    public boolean G(e e0) {
        if(e0 == null) {
            return false;
        }
        boolean z = this.i.remove(e0);
        if(z) {
            this.d();
        }
        return z;
    }

    public boolean H(float f, int v) {
        if(v >= this.i.size()) {
            return false;
        }
        Entry entry0 = ((e)this.i.get(v)).M0(f, NaNf);
        return entry0 == null ? false : this.I(entry0, v);
    }

    public boolean I(Entry entry0, int v) {
        if(entry0 != null && v < this.i.size()) {
            e e0 = (e)this.i.get(v);
            if(e0 != null) {
                boolean z = e0.T(entry0);
                if(z) {
                    this.d();
                }
                return z;
            }
        }
        return false;
    }

    public void J(boolean z) {
        for(Object object0: this.i) {
            ((e)object0).A(z);
        }
    }

    public void K(boolean z) {
        for(Object object0: this.i) {
            ((e)object0).b(z);
        }
    }

    public void L(l l0) {
        if(l0 == null) {
            return;
        }
        for(Object object0: this.i) {
            ((e)object0).V(l0);
        }
    }

    public void M(int v) {
        for(Object object0: this.i) {
            ((e)object0).P(v);
        }
    }

    public void N(List list0) {
        for(Object object0: this.i) {
            ((e)object0).X(list0);
        }
    }

    public void O(float f) {
        for(Object object0: this.i) {
            ((e)object0).r(f);
        }
    }

    public void P(Typeface typeface0) {
        for(Object object0: this.i) {
            ((e)object0).L(typeface0);
        }
    }

    public void a(e e0) {
        if(e0 == null) {
            return;
        }
        this.f(e0);
        this.i.add(e0);
    }

    public void b(Entry entry0, int v) {
        if(this.i.size() > v && v >= 0) {
            e e0 = (e)this.i.get(v);
            if(!e0.w0(entry0)) {
                return;
            }
            this.e(entry0, e0.E0());
            return;
        }
        Log.e("addEntry", "Cannot add Entry because dataSetIndex too high or too low.");
    }

    private List c(e[] arr_e) {
        List list0 = new ArrayList();
        for(int v = 0; v < arr_e.length; ++v) {
            list0.add(arr_e[v]);
        }
        return list0;
    }

    protected void d() {
        List list0 = this.i;
        if(list0 == null) {
            return;
        }
        this.a = -3.402823E+38f;
        this.b = 3.402823E+38f;
        this.c = -3.402823E+38f;
        this.d = 3.402823E+38f;
        for(Object object0: list0) {
            this.f(((e)object0));
        }
        this.e = -3.402823E+38f;
        this.f = 3.402823E+38f;
        this.g = -3.402823E+38f;
        this.h = 3.402823E+38f;
        e e0 = this.t(this.i);
        if(e0 != null) {
            this.e = e0.l0();
            this.f = e0.p0();
            for(Object object1: this.i) {
                e e1 = (e)object1;
                if(e1.E0() == a.a) {
                    if(e1.p0() < this.f) {
                        this.f = e1.p0();
                    }
                    if(e1.l0() > this.e) {
                        this.e = e1.l0();
                    }
                }
            }
        }
        e e2 = this.u(this.i);
        if(e2 != null) {
            this.g = e2.l0();
            this.h = e2.p0();
            for(Object object2: this.i) {
                e e3 = (e)object2;
                if(e3.E0() == a.b) {
                    if(e3.p0() < this.h) {
                        this.h = e3.p0();
                    }
                    if(e3.l0() > this.g) {
                        this.g = e3.l0();
                    }
                }
            }
        }
    }

    protected void e(Entry entry0, a k$a0) {
        if(this.a < entry0.d()) {
            this.a = entry0.d();
        }
        if(this.b > entry0.d()) {
            this.b = entry0.d();
        }
        if(this.c < entry0.l()) {
            this.c = entry0.l();
        }
        if(this.d > entry0.l()) {
            this.d = entry0.l();
        }
        if(k$a0 == a.a) {
            if(this.e < entry0.d()) {
                this.e = entry0.d();
            }
            if(this.f > entry0.d()) {
                this.f = entry0.d();
            }
        }
        else {
            if(this.g < entry0.d()) {
                this.g = entry0.d();
            }
            if(this.h > entry0.d()) {
                this.h = entry0.d();
            }
        }
    }

    protected void f(e e0) {
        if(this.a < e0.l0()) {
            this.a = e0.l0();
        }
        if(this.b > e0.p0()) {
            this.b = e0.p0();
        }
        if(this.c < e0.Z()) {
            this.c = e0.Z();
        }
        if(this.d > e0.H()) {
            this.d = e0.H();
        }
        if(e0.E0() == a.a) {
            if(this.e < e0.l0()) {
                this.e = e0.l0();
            }
            if(this.f > e0.p0()) {
                this.f = e0.p0();
            }
        }
        else {
            if(this.g < e0.l0()) {
                this.g = e0.l0();
            }
            if(this.h > e0.p0()) {
                this.h = e0.p0();
            }
        }
    }

    public void g(float f, float f1) {
        for(Object object0: this.i) {
            ((e)object0).u(f, f1);
        }
        this.d();
    }

    public void h() {
        List list0 = this.i;
        if(list0 != null) {
            list0.clear();
        }
        this.E();
    }

    public boolean i(e e0) {
        for(Object object0: this.i) {
            if(((e)object0).equals(e0)) {
                return true;
            }
            if(false) {
                break;
            }
        }
        return false;
    }

    public int[] j() {
        if(this.i == null) {
            return null;
        }
        int v2 = 0;
        for(int v1 = 0; v1 < this.i.size(); ++v1) {
            v2 += ((e)this.i.get(v1)).z0().size();
        }
        int[] arr_v = new int[v2];
        int v3 = 0;
        for(int v = 0; v < this.i.size(); ++v) {
            for(Object object0: ((e)this.i.get(v)).z0()) {
                arr_v[v3] = (int)(((Integer)object0));
                ++v3;
            }
        }
        return arr_v;
    }

    public e k(int v) {
        return this.i == null || v < 0 || v >= this.i.size() ? null : ((e)this.i.get(v));
    }

    public e l(String s, boolean z) {
        int v = this.o(this.i, s, z);
        return v < 0 || v >= this.i.size() ? null : ((e)this.i.get(v));
    }

    public int m() {
        return this.i == null ? 0 : this.i.size();
    }

    public e n(Entry entry0) {
        if(entry0 == null) {
            return null;
        }
        for(int v = 0; v < this.i.size(); ++v) {
            e e0 = (e)this.i.get(v);
            for(int v1 = 0; v1 < e0.N(); ++v1) {
                if(entry0.i(e0.M0(entry0.l(), entry0.d()))) {
                    return e0;
                }
            }
        }
        return null;
    }

    protected int o(List list0, String s, boolean z) {
        int v = 0;
        if(z) {
            while(v < list0.size()) {
                if(s.equalsIgnoreCase(((e)list0.get(v)).getLabel())) {
                    return v;
                }
                ++v;
            }
            return -1;
        }
        while(v < list0.size()) {
            if(s.equals(((e)list0.get(v)).getLabel())) {
                return v;
            }
            ++v;
        }
        return -1;
    }

    public String[] p() {
        String[] arr_s = new String[this.i.size()];
        for(int v = 0; v < this.i.size(); ++v) {
            arr_s[v] = ((e)this.i.get(v)).getLabel();
        }
        return arr_s;
    }

    public List q() {
        return this.i;
    }

    public int r() {
        int v = 0;
        for(Object object0: this.i) {
            v += ((e)object0).N();
        }
        return v;
    }

    public Entry s(d d0) {
        return d0.d() < this.i.size() ? ((e)this.i.get(d0.d())).M0(d0.h(), d0.j()) : null;
    }

    protected e t(List list0) {
        for(Object object0: list0) {
            e e0 = (e)object0;
            if(e0.E0() == a.a) {
                return e0;
            }
            if(false) {
                break;
            }
        }
        return null;
    }

    public e u(List list0) {
        for(Object object0: list0) {
            e e0 = (e)object0;
            if(e0.E0() == a.b) {
                return e0;
            }
            if(false) {
                break;
            }
        }
        return null;
    }

    public int v(e e0) {
        return this.i.indexOf(e0);
    }

    public e w() {
        if(this.i != null && !this.i.isEmpty()) {
            e e0 = (e)this.i.get(0);
            for(Object object0: this.i) {
                e e1 = (e)object0;
                if(e1.N() > e0.N()) {
                    e0 = e1;
                }
            }
            return e0;
        }
        return null;
    }

    public float x() {
        return this.c;
    }

    public float y() {
        return this.d;
    }

    public float z() {
        return this.a;
    }
}

