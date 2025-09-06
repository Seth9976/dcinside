package com.dcinside.app.rx.bus;

import com.dcinside.app.model.p;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.w;
import y4.l;

public final class o {
    @l
    private final p a;
    private final boolean b;

    public o(@l p p0, boolean z) {
        L.p(p0, "dccon");
        super();
        this.a = p0;
        this.b = z;
    }

    public o(p p0, boolean z, int v, w w0) {
        if((v & 2) != 0) {
            z = false;
        }
        this(p0, z);
    }

    @l
    public final p a() {
        return this.a;
    }

    public final boolean b() {
        return this.b;
    }
}

