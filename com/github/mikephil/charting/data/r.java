package com.github.mikephil.charting.data;

import com.github.mikephil.charting.highlight.d;
import t1.e;
import t1.i;

public class r extends k {
    public r() {
    }

    public r(i i0) {
        super(new i[]{i0});
    }

    public i Q() {
        return (i)this.i.get(0);
    }

    public i R(int v) {
        return v == 0 ? this.Q() : null;
    }

    public i S(String s, boolean z) {
        if(z) {
            return s.equalsIgnoreCase(((i)this.i.get(0)).getLabel()) ? ((i)this.i.get(0)) : null;
        }
        return s.equals(((i)this.i.get(0)).getLabel()) ? ((i)this.i.get(0)) : null;
    }

    public float T() {
        float f = 0.0f;
        for(int v = 0; v < this.Q().N(); ++v) {
            f += ((PieEntry)this.Q().l(v)).d();
        }
        return f;
    }

    public void U(i i0) {
        this.i.clear();
        this.i.add(i0);
        this.E();
    }

    @Override  // com.github.mikephil.charting.data.k
    public e k(int v) {
        return this.R(v);
    }

    @Override  // com.github.mikephil.charting.data.k
    public e l(String s, boolean z) {
        return this.S(s, z);
    }

    @Override  // com.github.mikephil.charting.data.k
    public Entry s(d d0) {
        return this.Q().l(((int)d0.h()));
    }
}

