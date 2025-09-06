package com.dcinside.app.write.menu.ai.type;

import com.google.gson.annotations.c;
import java.util.List;
import kotlin.collections.u;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.w;
import y4.l;
import y4.m;

public final class b {
    @c("result")
    private final boolean a;
    @c("data")
    @l
    private final List b;

    public b() {
        this(false, null, 3, null);
    }

    public b(boolean z, @l List list0) {
        L.p(list0, "data");
        super();
        this.a = z;
        this.b = list0;
    }

    public b(boolean z, List list0, int v, w w0) {
        if((v & 1) != 0) {
            z = false;
        }
        if((v & 2) != 0) {
            list0 = u.H();
        }
        this(z, list0);
    }

    public final boolean a() {
        return this.a;
    }

    @l
    public final List b() {
        return this.b;
    }

    @l
    public final b c(boolean z, @l List list0) {
        L.p(list0, "data");
        return new b(z, list0);
    }

    public static b d(b b0, boolean z, List list0, int v, Object object0) {
        if((v & 1) != 0) {
            z = b0.a;
        }
        if((v & 2) != 0) {
            list0 = b0.b;
        }
        return b0.c(z, list0);
    }

    @l
    public final List e() {
        return this.b;
    }

    @Override
    public boolean equals(@m Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof b)) {
            return false;
        }
        return this.a == ((b)object0).a ? L.g(this.b, ((b)object0).b) : false;
    }

    public final boolean f() {
        return this.a;
    }

    @Override
    public int hashCode() {
        return androidx.compose.foundation.c.a(this.a) * 0x1F + this.b.hashCode();
    }

    @Override
    @l
    public String toString() {
        return "CharaPrompts(result=" + this.a + ", data=" + this.b + ")";
    }
}

