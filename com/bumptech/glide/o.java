package com.bumptech.glide;

import androidx.annotation.NonNull;
import com.bumptech.glide.request.transition.e;
import com.bumptech.glide.request.transition.g;
import com.bumptech.glide.request.transition.h;
import com.bumptech.glide.request.transition.i;
import com.bumptech.glide.request.transition.j.a;
import com.bumptech.glide.util.m;

public abstract class o implements Cloneable {
    private g a;

    public o() {
        this.a = e.c();
    }

    public final o a() {
        try {
            return (o)super.clone();
        }
        catch(CloneNotSupportedException cloneNotSupportedException0) {
            throw new RuntimeException(cloneNotSupportedException0);
        }
    }

    @NonNull
    public final o b() {
        return this.f(e.c());
    }

    final g c() {
        return this.a;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return this.a();
    }

    private o d() [...] // Inlined contents

    @NonNull
    public final o e(int v) {
        return this.f(new h(v));
    }

    // 去混淆评级： 低(20)
    @Override
    public boolean equals(Object object0) {
        return object0 instanceof o ? com.bumptech.glide.util.o.e(this.a, ((o)object0).a) : false;
    }

    @NonNull
    public final o f(@NonNull g g0) {
        this.a = (g)m.e(g0);
        return this;
    }

    @NonNull
    public final o g(@NonNull a j$a0) {
        return this.f(new i(j$a0));
    }

    @Override
    public int hashCode() {
        return this.a == null ? 0 : this.a.hashCode();
    }
}

