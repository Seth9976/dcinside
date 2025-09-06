package com.beloo.widget.chipslayoutmanager.layouter;

import android.graphics.Rect;

public class o {
    private Rect a;
    private int b;

    public o(Rect rect0, int v) {
        this.a = rect0;
        this.b = v;
    }

    public int a() {
        return this.b;
    }

    public Rect b() {
        return this.a;
    }

    // 去混淆评级： 低(20)
    @Override
    public boolean equals(Object object0) {
        return this == object0 ? true : object0 != null && this.getClass() == object0.getClass() && this.b == ((o)object0).b;
    }

    @Override
    public int hashCode() {
        return this.b;
    }
}

