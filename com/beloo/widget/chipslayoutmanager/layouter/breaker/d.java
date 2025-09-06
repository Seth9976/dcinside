package com.beloo.widget.chipslayoutmanager.layouter.breaker;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.beloo.widget.chipslayoutmanager.cache.a;

public class d implements g {
    private g a;
    private a b;
    private i c;
    @Nullable
    private Integer d;

    public d(@NonNull a a0, @NonNull i i0, @Nullable Integer integer0, @NonNull g g0) {
        this.b = a0;
        this.c = i0;
        this.d = integer0;
        this.a = g0;
    }

    @Override  // com.beloo.widget.chipslayoutmanager.layouter.breaker.g
    public h a() {
        h h0 = this.a.a();
        h h1 = new com.beloo.widget.chipslayoutmanager.layouter.breaker.a(this.c, new b(this.b, h0));
        Integer integer0 = this.d;
        return integer0 != null ? new o(((int)integer0), h1) : h1;
    }

    @Override  // com.beloo.widget.chipslayoutmanager.layouter.breaker.g
    public h b() {
        h h0 = this.a.b();
        h h1 = new f(this.c, h0);
        Integer integer0 = this.d;
        return integer0 != null ? new o(((int)integer0), h1) : h1;
    }
}

