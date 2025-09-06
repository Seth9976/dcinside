package com.dcinside.app.image;

import android.annotation.SuppressLint;
import android.widget.ImageView;
import com.bumptech.glide.m;
import com.bumptech.glide.request.a;
import com.bumptech.glide.request.i;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import y4.l;

final class p implements r {
    @l
    private final ImageView a;
    @l
    private final m b;

    public p(@l ImageView imageView0, @l m m0) {
        L.p(imageView0, "view");
        L.p(m0, "builder");
        super();
        this.a = imageView0;
        this.b = m0;
    }

    @Override  // com.dcinside.app.image.r
    @SuppressLint({"CheckResult"})
    @l
    public r a() {
        i i0 = b.c();
        this.b.V0(i0);
        return this;
    }

    @Override  // com.dcinside.app.image.r
    public void apply() {
        this.b.q1(this.a);
    }

    @Override  // com.dcinside.app.image.r
    @SuppressLint({"CheckResult"})
    @l
    public r b() {
        i i0 = b.l();
        this.b.V0(i0);
        return this;
    }

    @Override  // com.dcinside.app.image.r
    @SuppressLint({"CheckResult"})
    @l
    public r c(int v) {
        a a0 = new i().x(v);
        this.b.V0(a0);
        return this;
    }

    @Override  // com.dcinside.app.image.r
    @SuppressLint({"CheckResult"})
    @l
    public r d() {
        i i0 = b.a.f();
        this.b.V0(i0);
        return this;
    }

    @Override  // com.dcinside.app.image.r
    @SuppressLint({"CheckResult"})
    @l
    public r e() {
        i i0 = b.g();
        this.b.V0(i0);
        return this;
    }

    @Override  // com.dcinside.app.image.r
    @SuppressLint({"CheckResult"})
    @l
    public r f() {
        i i0 = b.a.e();
        this.b.V0(i0);
        return this;
    }

    @Override  // com.dcinside.app.image.r
    @SuppressLint({"CheckResult"})
    @l
    public r g() {
        i i0 = b.j();
        this.b.V0(i0);
        return this;
    }

    @Override  // com.dcinside.app.image.r
    @SuppressLint({"CheckResult"})
    @l
    public r h() {
        i i0 = b.a.i();
        this.b.V0(i0);
        return this;
    }

    @Override  // com.dcinside.app.image.r
    public void i(@l Function1 function10) {
        L.p(function10, "custom");
        ((m)function10.invoke(this.b)).q1(this.a);
    }

    @Override  // com.dcinside.app.image.r
    @SuppressLint({"CheckResult"})
    @l
    public r j() {
        i i0 = b.a();
        this.b.V0(i0);
        return this;
    }

    @l
    public final m k() {
        return this.b;
    }

    @l
    public final ImageView l() {
        return this.a;
    }
}

