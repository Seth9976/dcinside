package com.beloo.widget.chipslayoutmanager.layouter.criteria;

import androidx.annotation.IntRange;

public abstract class a implements o {
    int a;
    int b;

    public void c(@IntRange(from = 0L) int v) {
        if(v < 0) {
            throw new IllegalArgumentException("additional height can\'t be negative");
        }
        this.a = v;
    }

    public void d(int v) {
        this.b = v;
    }
}

