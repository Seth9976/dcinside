package com.dcinside.app.util;

import com.dcinside.app.model.f;
import rx.functions.p;

public final class p5 implements p {
    public final f a;
    public final boolean b;

    public p5(f f0, boolean z) {
        this.a = f0;
        this.b = z;
    }

    @Override  // rx.functions.p
    public final Object b(Object object0) {
        return uk.HA(this.a, this.b, ((String)object0));
    }
}

