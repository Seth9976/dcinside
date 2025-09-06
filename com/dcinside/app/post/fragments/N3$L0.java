package com.dcinside.app.post.fragments;

import com.dcinside.app.rx.bus.r;
import kotlin.S0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.N;

final class N3.L0 extends N implements Function1 {
    final N3 e;
    final r f;

    N3.L0(N3 n30, r r0) {
        this.e = n30;
        this.f = r0;
        super(1);
    }

    public final void a(Integer integer0) {
        if(integer0 != null && ((int)integer0) == 0) {
            this.e.O4(this.f.b(), this.f.a());
            return;
        }
        if(integer0 != null && ((int)integer0) == 1) {
            this.e.P4(this.f.a());
        }
    }

    @Override  // kotlin.jvm.functions.Function1
    public Object invoke(Object object0) {
        this.a(((Integer)object0));
        return S0.a;
    }
}

