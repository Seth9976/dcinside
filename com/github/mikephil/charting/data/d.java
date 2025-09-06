package com.github.mikephil.charting.data;

import android.graphics.Color;
import java.util.List;
import t1.b;

public abstract class d extends m implements b {
    protected int x;

    public d(List list0, String s) {
        super(list0, s);
        this.x = Color.rgb(0xFF, 0xBB, 0x73);
    }

    protected void Q1(d d0) {
        super.M1(d0);
        d0.x = this.x;
    }

    public void R1(int v) {
        this.x = v;
    }

    @Override  // t1.b
    public int l1() {
        return this.x;
    }
}

