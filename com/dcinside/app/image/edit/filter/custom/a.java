package com.dcinside.app.image.edit.filter.custom;

import kotlin.jvm.internal.L;
import y4.m;

public abstract class a extends Y2.a {
    // 去混淆评级： 低(20)
    @Override
    public boolean equals(@m Object object0) {
        return this == object0 ? true : L.g(this.getClass(), (object0 == null ? null : object0.getClass()));
    }

    @Override
    public int hashCode() {
        return this.getClass().hashCode();
    }
}

