package com.kakao.adfit.m;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.properties.c;
import kotlin.reflect.o;

public final class v extends c {
    private final Function1 a;

    public v(boolean z, Function1 function10) {
        L.p(function10, "onChanged");
        super(Boolean.valueOf(z));
        this.a = function10;
    }

    @Override  // kotlin.properties.c
    public void afterChange(o o0, Object object0, Object object1) {
        this.afterChange(o0, ((Boolean)object0).booleanValue(), ((Boolean)object1).booleanValue());
    }

    protected void afterChange(o o0, boolean z, boolean z1) {
        L.p(o0, "property");
        this.a.invoke(Boolean.valueOf(z1));
    }

    @Override  // kotlin.properties.c
    public boolean beforeChange(o o0, Object object0, Object object1) {
        return this.beforeChange(o0, ((Boolean)object0).booleanValue(), ((Boolean)object1).booleanValue());
    }

    protected boolean beforeChange(o o0, boolean z, boolean z1) {
        L.p(o0, "property");
        return z != z1;
    }
}

