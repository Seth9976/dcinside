package com.beloo.widget.chipslayoutmanager.layouter.criteria;

import androidx.annotation.NonNull;

public class b extends a {
    @Override  // com.beloo.widget.chipslayoutmanager.layouter.criteria.o
    @NonNull
    public p a() {
        p p0 = new j();
        int v = this.a;
        if(v != 0) {
            p0 = new i(p0, v);
        }
        int v1 = this.b;
        return v1 != 0 ? new c(p0, v1) : p0;
    }

    @Override  // com.beloo.widget.chipslayoutmanager.layouter.criteria.o
    @NonNull
    public p b() {
        p p0 = new g();
        int v = this.a;
        return v != 0 ? new f(p0, v) : p0;
    }
}

