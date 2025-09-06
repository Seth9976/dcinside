package com.github.mikephil.charting.data;

import java.util.ArrayList;
import java.util.List;

public abstract class m extends e {
    public static enum a {
        UP,
        DOWN,
        CLOSEST;

    }

    protected List s;
    protected float t;
    protected float u;
    protected float v;
    protected float w;

    public m(List list0, String s) {
        super(s);
        this.t = -3.402823E+38f;
        this.u = 3.402823E+38f;
        this.v = -3.402823E+38f;
        this.w = 3.402823E+38f;
        this.s = list0;
        if(list0 == null) {
            this.s = new ArrayList();
        }
        this.B0();
    }

    @Override  // t1.e
    public void B0() {
        if(this.s != null && !this.s.isEmpty()) {
            this.t = -3.402823E+38f;
            this.u = 3.402823E+38f;
            this.v = -3.402823E+38f;
            this.w = 3.402823E+38f;
            for(Object object0: this.s) {
                this.I1(((Entry)object0));
            }
        }
    }

    @Override  // t1.e
    public float H() {
        return this.w;
    }

    protected void I1(Entry entry0) {
        if(entry0 == null) {
            return;
        }
        this.J1(entry0);
        this.K1(entry0);
    }

    protected void J1(Entry entry0) {
        if(entry0.l() < this.w) {
            this.w = entry0.l();
        }
        if(entry0.l() > this.v) {
            this.v = entry0.l();
        }
    }

    protected void K1(Entry entry0) {
        if(entry0.d() < this.u) {
            this.u = entry0.d();
        }
        if(entry0.d() > this.t) {
            this.t = entry0.d();
        }
    }

    public abstract m L1();

    @Override  // t1.e
    public Entry M0(float f, float f1) {
        return this.d1(f, f1, a.c);
    }

    protected void M1(m m0) {
        super.s1(m0);
    }

    @Override  // t1.e
    public int N() {
        return this.s.size();
    }

    public List N1() {
        return this.s;
    }

    public void O1(List list0) {
        this.s = list0;
        this.u1();
    }

    // 去混淆评级： 中等(80)
    public String P1() {
        return "DataSet, label: DataSet, entries: " + this.s.size() + "\n";
    }

    @Override  // t1.e
    public boolean T(Entry entry0) {
        if(entry0 == null) {
            return false;
        }
        List list0 = this.s;
        if(list0 == null) {
            return false;
        }
        boolean z = list0.remove(entry0);
        if(z) {
            this.B0();
        }
        return z;
    }

    @Override  // t1.e
    public int U(float f, float f1, a m$a0) {
        int v4;
        if(this.s != null && !this.s.isEmpty()) {
            int v = this.s.size() - 1;
            int v1 = 0;
            while(v1 < v) {
                int v2 = (v1 + v) / 2;
                float f2 = ((Entry)this.s.get(v2)).l() - f;
                int v3 = v2 + 1;
                float f3 = Math.abs(f2);
                float f4 = Math.abs(((Entry)this.s.get(v3)).l() - f);
                if(f4 < f3 || ((double)f2) < 0.0) {
                    v1 = v3;
                }
                else if(f3 < f4 || ((double)f2) >= 0.0) {
                    v = v2;
                }
            }
            if(v != -1) {
                float f5 = ((Entry)this.s.get(v)).l();
                if(m$a0 != a.a) {
                    if(m$a0 == a.b && f5 > f && v > 0) {
                        --v;
                    }
                }
                else if(f5 < f && v < this.s.size() - 1) {
                    ++v;
                }
                if(!Float.isNaN(f1)) {
                    while(v > 0 && ((Entry)this.s.get(v - 1)).l() == f5) {
                        --v;
                    }
                    float f6 = ((Entry)this.s.get(v)).d();
                    while(true) {
                        v4 = v;
                    label_30:
                        ++v;
                        if(v >= this.s.size()) {
                            break;
                        }
                        Entry entry0 = (Entry)this.s.get(v);
                        if(entry0.l() != f5) {
                            break;
                        }
                        if(Math.abs(entry0.d() - f1) < Math.abs(f6 - f1)) {
                            f6 = f1;
                            continue;
                        }
                        if(false) {
                            break;
                        }
                        goto label_30;
                    }
                    return v4;
                }
            }
            return v;
        }
        return -1;
    }

    @Override  // t1.e
    public float Z() {
        return this.v;
    }

    @Override  // t1.e
    public void clear() {
        this.s.clear();
        this.u1();
    }

    @Override  // t1.e
    public Entry d1(float f, float f1, a m$a0) {
        int v = this.U(f, f1, m$a0);
        return v <= -1 ? null : ((Entry)this.s.get(v));
    }

    @Override  // t1.e
    public int e(Entry entry0) {
        return this.s.indexOf(entry0);
    }

    @Override  // t1.e
    public void h0(Entry entry0) {
        if(entry0 == null) {
            return;
        }
        if(this.s == null) {
            this.s = new ArrayList();
        }
        this.I1(entry0);
        if(this.s.size() > 0 && ((Entry)this.s.get(this.s.size() - 1)).l() > entry0.l()) {
            int v = this.U(entry0.l(), entry0.d(), a.a);
            this.s.add(v, entry0);
            return;
        }
        this.s.add(entry0);
    }

    @Override  // t1.e
    public Entry l(int v) {
        return (Entry)this.s.get(v);
    }

    @Override  // t1.e
    public float l0() {
        return this.t;
    }

    @Override  // t1.e
    public float p0() {
        return this.u;
    }

    @Override
    public String toString() {
        StringBuffer stringBuffer0 = new StringBuffer();
        stringBuffer0.append(this.P1());
        for(int v = 0; v < this.s.size(); ++v) {
            stringBuffer0.append("Entry, x: 0.0 y: 0.0 ");
        }
        return stringBuffer0.toString();
    }

    @Override  // t1.e
    public void u(float f, float f1) {
        if(this.s != null && !this.s.isEmpty()) {
            this.t = -3.402823E+38f;
            this.u = 3.402823E+38f;
            int v = this.U(f, NaNf, a.b);
            int v1 = this.U(f1, NaNf, a.a);
            while(v <= v1) {
                this.K1(((Entry)this.s.get(v)));
                ++v;
            }
        }
    }

    @Override  // t1.e
    public List v(float f) {
        List list0 = new ArrayList();
        int v = this.s.size() - 1;
        int v1 = 0;
    label_3:
        while(v1 <= v) {
            int v2 = (v + v1) / 2;
            Entry entry0 = (Entry)this.s.get(v2);
            if(f == entry0.l()) {
                while(v2 > 0 && ((Entry)this.s.get(v2 - 1)).l() == f) {
                    --v2;
                }
                int v3 = this.s.size();
                while(v2 < v3) {
                    Entry entry1 = (Entry)this.s.get(v2);
                    if(entry1.l() != f) {
                        break label_3;
                    }
                    list0.add(entry1);
                    ++v2;
                }
                return list0;
            }
            if(f > entry0.l()) {
                v1 = v2 + 1;
            }
            else {
                v = v2 - 1;
            }
        }
        return list0;
    }

    @Override  // t1.e
    public boolean w0(Entry entry0) {
        if(entry0 == null) {
            return false;
        }
        List list0 = this.N1();
        if(list0 == null) {
            list0 = new ArrayList();
        }
        this.I1(entry0);
        return list0.add(entry0);
    }
}

