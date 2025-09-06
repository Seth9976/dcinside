package com.bumptech.glide.load.resource.bitmap;

import androidx.annotation.NonNull;
import com.bumptech.glide.o;
import com.bumptech.glide.request.transition.b;
import com.bumptech.glide.request.transition.c.a;
import com.bumptech.glide.request.transition.c;
import com.bumptech.glide.request.transition.g;

public final class j extends o {
    // 去混淆评级： 低(20)
    @Override  // com.bumptech.glide.o
    public boolean equals(Object object0) {
        return object0 instanceof j && super.equals(object0);
    }

    @NonNull
    public j h() {
        return this.k(new a());
    }

    @Override  // com.bumptech.glide.o
    public int hashCode() {
        return super.hashCode();
    }

    @NonNull
    public j j(int v) {
        return this.k(new a(v));
    }

    @NonNull
    public j k(@NonNull a c$a0) {
        return this.m(c$a0.a());
    }

    @NonNull
    public j l(@NonNull c c0) {
        return this.m(c0);
    }

    @NonNull
    public j m(@NonNull g g0) {
        return (j)this.f(new b(g0));
    }

    @NonNull
    public static j n(@NonNull g g0) {
        return (j)new j().f(g0);
    }

    @NonNull
    public static j o() {
        return new j().h();
    }

    @NonNull
    public static j p(int v) {
        return new j().j(v);
    }

    @NonNull
    public static j q(@NonNull a c$a0) {
        return new j().k(c$a0);
    }

    @NonNull
    public static j r(@NonNull c c0) {
        return new j().l(c0);
    }

    @NonNull
    public static j s(@NonNull g g0) {
        return new j().m(g0);
    }
}

