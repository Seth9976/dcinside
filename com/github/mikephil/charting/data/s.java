package com.github.mikephil.charting.data;

import com.github.mikephil.charting.utils.k;
import java.util.ArrayList;
import java.util.List;
import t1.i;

public class s extends m implements i {
    public static enum a {
        INSIDE_SLICE,
        OUTSIDE_SLICE;

    }

    private a A;
    private a B;
    private boolean C;
    private int D;
    private float E;
    private float F;
    private float G;
    private float H;
    private boolean I;
    private float x;
    private boolean y;
    private float z;

    public s(List list0, String s) {
        super(list0, s);
        this.x = 0.0f;
        this.z = 18.0f;
        this.A = a.a;
        this.B = a.a;
        this.C = false;
        this.D = 0xFF000000;
        this.E = 1.0f;
        this.F = 75.0f;
        this.G = 0.3f;
        this.H = 0.4f;
        this.I = true;
    }

    @Override  // t1.i
    public float I0() {
        return this.x;
    }

    @Override  // com.github.mikephil.charting.data.m
    protected void I1(Entry entry0) {
        this.Q1(((PieEntry)entry0));
    }

    @Override  // com.github.mikephil.charting.data.m
    public m L1() {
        ArrayList arrayList0 = new ArrayList();
        for(int v = 0; v < this.s.size(); ++v) {
            arrayList0.add(((PieEntry)this.s.get(v)).o());
        }
        m m0 = new s(arrayList0, "DataSet");
        this.R1(((s)m0));
        return m0;
    }

    protected void Q1(PieEntry pieEntry0) {
        if(pieEntry0 == null) {
            return;
        }
        this.K1(pieEntry0);
    }

    @Override  // t1.i
    public a R() {
        return this.A;
    }

    protected void R1(s s0) {
        super.M1(s0);
    }

    public void S1(boolean z) {
        this.y = z;
    }

    public void T1(float f) {
        this.z = k.e(f);
    }

    public void U1(float f) {
        if(f > 20.0f) {
            f = 20.0f;
        }
        if(f < 0.0f) {
            f = 0.0f;
        }
        this.x = k.e(f);
    }

    public void V1(boolean z) {
        this.C = z;
    }

    @Override  // t1.i
    public int W0() {
        return this.D;
    }

    public void W1(int v) {
        this.D = v;
    }

    public void X1(float f) {
        this.G = f;
    }

    public void Y1(float f) {
        this.F = f;
    }

    public void Z1(float f) {
        this.H = f;
    }

    @Override  // t1.i
    public float a0() {
        return this.F;
    }

    public void a2(boolean z) {
        this.I = z;
    }

    public void b2(float f) {
        this.E = f;
    }

    public void c2(a s$a0) {
        this.A = s$a0;
    }

    public void d2(a s$a0) {
        this.B = s$a0;
    }

    @Override  // t1.i
    public a f1() {
        return this.B;
    }

    @Override  // t1.i
    public boolean g1() {
        return this.I;
    }

    @Override  // t1.i
    public boolean i1() {
        return this.C;
    }

    @Override  // t1.i
    public boolean k() {
        return this.y;
    }

    @Override  // t1.i
    public float t() {
        return this.H;
    }

    @Override  // t1.i
    public float u0() {
        return this.E;
    }

    @Override  // t1.i
    public float v0() {
        return this.G;
    }

    @Override  // t1.i
    public float x() {
        return this.z;
    }
}

