package com.github.mikephil.charting.data;

import android.graphics.Color;
import java.util.ArrayList;
import java.util.List;
import t1.a;

public class b extends d implements a {
    private float A;
    private int B;
    private int C;
    private int D;
    private String[] E;
    private int y;
    private int z;

    public b(List list0, String s) {
        super(list0, s);
        this.y = 1;
        this.z = Color.rgb(0xD7, 0xD7, 0xD7);
        this.A = 0.0f;
        this.B = 0xFF000000;
        this.C = 120;
        this.D = 0;
        this.E = new String[]{"Stack"};
        this.x = 0xFF000000;
        this.U1(list0);
        this.S1(list0);
    }

    @Override  // com.github.mikephil.charting.data.m
    protected void I1(Entry entry0) {
        this.T1(((BarEntry)entry0));
    }

    @Override  // com.github.mikephil.charting.data.m
    public m L1() {
        ArrayList arrayList0 = new ArrayList();
        for(int v = 0; v < this.s.size(); ++v) {
            arrayList0.add(((BarEntry)this.s.get(v)).s());
        }
        m m0 = new b(arrayList0, "DataSet");
        this.V1(((b)m0));
        return m0;
    }

    @Override  // t1.a
    public float M() {
        return this.A;
    }

    private void S1(List list0) {
        this.D = 0;
        for(int v = 0; v < list0.size(); ++v) {
            float[] arr_f = ((BarEntry)list0.get(v)).y();
            if(arr_f == null) {
                ++this.D;
            }
            else {
                this.D += arr_f.length;
            }
        }
    }

    protected void T1(BarEntry barEntry0) {
        if(barEntry0 != null && !Float.isNaN(barEntry0.d())) {
            if(barEntry0.y() == null) {
                if(barEntry0.d() < this.u) {
                    this.u = barEntry0.d();
                }
                if(barEntry0.d() > this.t) {
                    this.t = barEntry0.d();
                }
            }
            else {
                if(-barEntry0.u() < this.u) {
                    this.u = -barEntry0.u();
                }
                if(barEntry0.v() > this.t) {
                    this.t = barEntry0.v();
                }
            }
            this.J1(barEntry0);
        }
    }

    private void U1(List list0) {
        for(int v = 0; v < list0.size(); ++v) {
            float[] arr_f = ((BarEntry)list0.get(v)).y();
            if(arr_f != null && arr_f.length > this.y) {
                this.y = arr_f.length;
            }
        }
    }

    protected void V1(b b0) {
        super.Q1(b0);
        b0.y = this.y;
        b0.z = this.z;
        b0.A = this.A;
        b0.E = this.E;
        b0.C = this.C;
    }

    public int W1() {
        return this.D;
    }

    public void X1(int v) {
        this.B = v;
    }

    public void Y1(float f) {
        this.A = f;
    }

    public void Z1(int v) {
        this.z = v;
    }

    @Override  // t1.a
    public int a1() {
        return this.z;
    }

    public void a2(int v) {
        this.C = v;
    }

    @Override  // t1.a
    public boolean b0() {
        return this.y > 1;
    }

    public void b2(String[] arr_s) {
        this.E = arr_s;
    }

    @Override  // t1.a
    public String[] c0() {
        return this.E;
    }

    @Override  // t1.a
    public int j1() {
        return this.C;
    }

    @Override  // t1.a
    public int o0() {
        return this.B;
    }

    @Override  // t1.a
    public int s() {
        return this.y;
    }
}

