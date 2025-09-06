package com.github.mikephil.charting.data;

import com.github.mikephil.charting.utils.k;
import java.util.ArrayList;
import java.util.List;
import t1.c;

public class h extends d implements c {
    private float A;
    protected float y;
    protected boolean z;

    public h(List list0, String s) {
        super(list0, s);
        this.z = true;
        this.A = 2.5f;
    }

    @Override  // t1.c
    public float C0() {
        return this.A;
    }

    @Override  // t1.c
    public boolean D() {
        return this.z;
    }

    @Override  // com.github.mikephil.charting.data.m
    protected void I1(Entry entry0) {
        this.S1(((BubbleEntry)entry0));
    }

    @Override  // com.github.mikephil.charting.data.m
    public m L1() {
        ArrayList arrayList0 = new ArrayList();
        for(int v = 0; v < this.s.size(); ++v) {
            arrayList0.add(((BubbleEntry)this.s.get(v)).o());
        }
        m m0 = new h(arrayList0, "DataSet");
        this.T1(((h)m0));
        return m0;
    }

    protected void S1(BubbleEntry bubbleEntry0) {
        super.I1(bubbleEntry0);
        float f = bubbleEntry0.q();
        if(f > this.y) {
            this.y = f;
        }
    }

    protected void T1(h h0) {
        h0.A = this.A;
        h0.z = this.z;
    }

    public void U1(boolean z) {
        this.z = z;
    }

    @Override  // t1.c
    public void Z0(float f) {
        this.A = k.e(f);
    }

    @Override  // t1.c
    public float a() {
        return this.y;
    }
}

