package com.dcinside.app.response;

import com.dcinside.app.model.f0;
import com.google.gson.annotations.c;
import kotlin.jvm.internal.w;
import y4.l;
import y4.m;

public final class f extends f0 {
    @c("data")
    private final int e;

    public f() {
        this(0, 1, null);
    }

    public f(int v) {
        this.e = v;
    }

    public f(int v, int v1, w w0) {
        if((v1 & 1) != 0) {
            v = 0;
        }
        this(v);
    }

    @Override
    public boolean equals(@m Object object0) {
        if(this == object0) {
            return true;
        }
        return object0 instanceof f ? this.e == ((f)object0).e : false;
    }

    public final int g() {
        return this.e;
    }

    @l
    public final f h(int v) {
        return new f(v);
    }

    @Override
    public int hashCode() {
        return this.e;
    }

    public static f i(f f0, int v, int v1, Object object0) {
        if((v1 & 1) != 0) {
            v = f0.e;
        }
        return f0.h(v);
    }

    public final int l() {
        return this.e;
    }

    @Override
    @l
    public String toString() {
        return "ManagerEntrust(data=" + this.e + ")";
    }
}

