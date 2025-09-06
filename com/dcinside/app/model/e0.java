package com.dcinside.app.model;

import java.util.List;
import kotlin.V;
import kotlin.jvm.internal.L;
import y4.l;

public final class e0 {
    private final int a;
    @l
    private final V b;
    @l
    private final List c;

    public e0(int v, @l V v1, @l List list0) {
        L.p(v1, "request");
        L.p(list0, "list");
        super();
        this.a = v;
        this.b = v1;
        this.c = list0;
    }

    @l
    public final List a() {
        return this.c;
    }

    @l
    public final V b() {
        return this.b;
    }

    public final int c() {
        return this.a;
    }
}

