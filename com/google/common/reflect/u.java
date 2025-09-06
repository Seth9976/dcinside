package com.google.common.reflect;

import com.google.common.base.t;
import java.lang.reflect.Type;

public final class u implements t {
    public final d a;

    public u(d t$d0) {
        this.a = t$d0;
    }

    @Override  // com.google.common.base.t
    public final Object apply(Object object0) {
        return this.a.d(((Type)object0));
    }
}

