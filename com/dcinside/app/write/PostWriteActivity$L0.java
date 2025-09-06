package com.dcinside.app.write;

import kotlin.S0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.N;

final class PostWriteActivity.L0 extends N implements Function1 {
    final PostWriteActivity e;

    PostWriteActivity.L0(PostWriteActivity postWriteActivity0) {
        this.e = postWriteActivity0;
        super(1);
    }

    public final void a(Boolean boolean0) {
        this.e.L.o0();
    }

    @Override  // kotlin.jvm.functions.Function1
    public Object invoke(Object object0) {
        this.a(((Boolean)object0));
        return S0.a;
    }
}

