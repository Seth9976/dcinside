package com.dcinside.app.gif;

import androidx.recyclerview.widget.DiffUtil.Callback;
import java.util.List;
import kotlin.jvm.internal.L;
import y4.l;

public final class a extends Callback {
    @l
    private final List a;
    @l
    private final List b;

    public a(@l List list0, @l List list1) {
        L.p(list0, "oldList");
        L.p(list1, "newList");
        super();
        this.a = list0;
        this.b = list1;
    }

    @Override  // androidx.recyclerview.widget.DiffUtil$Callback
    public boolean a(int v, int v1) {
        return ((Number)this.a.get(v)).longValue() == ((Number)this.b.get(v1)).longValue();
    }

    @Override  // androidx.recyclerview.widget.DiffUtil$Callback
    public boolean b(int v, int v1) {
        return ((Number)this.a.get(v)).longValue() == ((Number)this.b.get(v1)).longValue();
    }

    @Override  // androidx.recyclerview.widget.DiffUtil$Callback
    public int d() {
        return this.b.size();
    }

    @Override  // androidx.recyclerview.widget.DiffUtil$Callback
    public int e() {
        return this.a.size();
    }
}

