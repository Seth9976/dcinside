package com.github.mikephil.charting.data;

import android.graphics.DashPathEffect;
import com.github.mikephil.charting.utils.k;
import java.util.List;
import t1.h;

public abstract class q extends d implements h {
    protected float A;
    protected DashPathEffect B;
    protected boolean y;
    protected boolean z;

    public q(List list0, String s) {
        super(list0, s);
        this.y = true;
        this.z = true;
        this.B = null;
        this.A = k.e(0.5f);
    }

    @Override  // t1.h
    public boolean C() {
        return this.y;
    }

    @Override  // t1.h
    public float P0() {
        return this.A;
    }

    protected void S1(q q0) {
        super.Q1(q0);
        q0.z = this.z;
        q0.y = this.y;
        q0.A = this.A;
        q0.B = this.B;
    }

    public void T1() {
        this.B = null;
    }

    public void U1(float f, float f1, float f2) {
        this.B = new DashPathEffect(new float[]{f, f1}, f2);
    }

    public boolean V1() {
        return this.B != null;
    }

    public void W1(boolean z) {
        this.Y1(z);
        this.X1(z);
    }

    public void X1(boolean z) {
        this.z = z;
    }

    public void Y1(boolean z) {
        this.y = z;
    }

    public void Z1(float f) {
        this.A = k.e(f);
    }

    @Override  // t1.h
    public DashPathEffect e1() {
        return this.B;
    }

    @Override  // t1.h
    public boolean o1() {
        return this.z;
    }
}

