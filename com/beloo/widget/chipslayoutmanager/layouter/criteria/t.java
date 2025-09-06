package com.beloo.widget.chipslayoutmanager.layouter.criteria;

import androidx.annotation.NonNull;

public class t extends a implements o {
    @Override  // com.beloo.widget.chipslayoutmanager.layouter.criteria.o
    @NonNull
    public p a() {
        p p0 = new e();
        int v = this.a;
        if(v != 0) {
            p0 = new d(p0, v);
        }
        int v1 = this.b;
        return v1 != 0 ? new c(p0, v1) : p0;
    }

    @Override  // com.beloo.widget.chipslayoutmanager.layouter.criteria.o
    @NonNull
    public p b() {
        p p0 = new l();
        int v = this.a;
        return v != 0 ? new k(p0, v) : p0;
    }
}

