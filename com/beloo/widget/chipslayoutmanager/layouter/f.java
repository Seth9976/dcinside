package com.beloo.widget.chipslayoutmanager.layouter;

import androidx.annotation.IntRange;

class f extends b {
    f(@IntRange(from = 0L) int v) {
        super(v);
    }

    public Integer b() {
        if(!this.hasNext()) {
            throw new IllegalStateException("position out of bounds reached");
        }
        int v = this.a;
        this.a = v - 1;
        return v;
    }

    @Override
    public boolean hasNext() {
        return this.a >= 0;
    }

    @Override
    public Object next() {
        return this.b();
    }
}

