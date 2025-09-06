package com.bumptech.glide.load.resource.drawable;

import androidx.annotation.NonNull;
import com.bumptech.glide.o;
import com.bumptech.glide.request.transition.c.a;
import com.bumptech.glide.request.transition.c;
import com.bumptech.glide.request.transition.g;

public final class k extends o {
    // 去混淆评级： 低(20)
    @Override  // com.bumptech.glide.o
    public boolean equals(Object object0) {
        return object0 instanceof k && super.equals(object0);
    }

    @NonNull
    public k h() {
        return this.k(new a());
    }

    @Override  // com.bumptech.glide.o
    public int hashCode() {
        return super.hashCode();
    }

    @NonNull
    public k j(int v) {
        return this.k(new a(v));
    }

    @NonNull
    public k k(@NonNull a c$a0) {
        return this.l(c$a0.a());
    }

    @NonNull
    public k l(@NonNull c c0) {
        return (k)this.f(c0);
    }

    @NonNull
    public static k m(@NonNull g g0) {
        return (k)new k().f(g0);
    }

    @NonNull
    public static k n() {
        return new k().h();
    }

    @NonNull
    public static k o(int v) {
        return new k().j(v);
    }

    @NonNull
    public static k p(@NonNull a c$a0) {
        return new k().k(c$a0);
    }

    @NonNull
    public static k q(@NonNull c c0) {
        return new k().l(c0);
    }
}

