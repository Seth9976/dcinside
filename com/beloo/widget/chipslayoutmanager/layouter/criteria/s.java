package com.beloo.widget.chipslayoutmanager.layouter.criteria;

import androidx.annotation.NonNull;

public class s implements o {
    private int a;
    private int b;

    public s(int v, int v1) {
        this.a = v;
        this.b = v1;
    }

    @Override  // com.beloo.widget.chipslayoutmanager.layouter.criteria.o
    @NonNull
    public p a() {
        return new c(new d(new e(), this.a), this.b);
    }

    @Override  // com.beloo.widget.chipslayoutmanager.layouter.criteria.o
    @NonNull
    public p b() {
        return new k(new l(), this.a);
    }
}

