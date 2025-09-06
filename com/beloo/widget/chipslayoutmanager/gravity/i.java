package com.beloo.widget.chipslayoutmanager.gravity;

import android.util.SparseArray;

public class i implements p {
    private SparseArray a;

    public i() {
        this.a = new SparseArray();
        c c0 = new c();
        this.a.put(17, c0);
        this.a.put(1, c0);
        this.a.put(3, new x());
        this.a.put(5, new D());
    }

    @Override  // com.beloo.widget.chipslayoutmanager.gravity.p
    public o a(int v) {
        o o0 = (o)this.a.get(v);
        return o0 == null ? ((o)this.a.get(1)) : o0;
    }
}

