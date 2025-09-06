package com.dcinside.app.util;

import A3.p;
import com.dcinside.app.http.l.b;
import kotlin.jvm.functions.Function1;

public final class f4 implements Function1 {
    public final String a;
    public final b b;

    public f4(String s, b l$b0) {
        this.a = s;
        this.b = l$b0;
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        return uk.tE(this.a, this.b, ((p)object0));
    }
}

