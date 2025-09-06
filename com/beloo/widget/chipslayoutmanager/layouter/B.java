package com.beloo.widget.chipslayoutmanager.layouter;

import androidx.annotation.IntRange;
import java.util.Iterator;

public abstract class b implements Iterator {
    int a;
    int b;

    b(@IntRange(from = 0L) int v) {
        if(v < 0) {
            throw new IllegalArgumentException("item count couldn\'t be negative");
        }
        this.b = v;
    }

    public void a(@IntRange(from = 0L) int v) {
        if(v >= this.b) {
            throw new IllegalArgumentException("you can\'t move above of maxItemCount");
        }
        if(v < 0) {
            throw new IllegalArgumentException("can\'t move to negative position");
        }
        this.a = v;
    }

    @Override
    public void remove() {
        throw new UnsupportedOperationException("removing not supported in position iterator");
    }
}

