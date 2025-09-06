package com.tbuonomo.viewpagerdotsindicator.attacher;

import A3.a;
import com.tbuonomo.viewpagerdotsindicator.BaseDotsIndicator;
import kotlin.S0;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import y4.l;
import y4.m;

public abstract class b {
    @l
    public abstract com.tbuonomo.viewpagerdotsindicator.BaseDotsIndicator.b a(Object arg1, Object arg2);

    @m
    public abstract Object b(Object arg1);

    public abstract void c(Object arg1, Object arg2, @l a arg3);

    public final void d(@l BaseDotsIndicator baseDotsIndicator0, Object object0) {
        static final class com.tbuonomo.viewpagerdotsindicator.attacher.b.a extends N implements a {
            final BaseDotsIndicator e;

            com.tbuonomo.viewpagerdotsindicator.attacher.b.a(BaseDotsIndicator baseDotsIndicator0) {
                this.e = baseDotsIndicator0;
                super(0);
            }

            // 检测为 Lambda 实现
            private static final void b(BaseDotsIndicator baseDotsIndicator0) [...]

            @Override  // A3.a
            public Object invoke() {
                this.invoke();
                return S0.a;
            }

            public final void invoke() {
                com.tbuonomo.viewpagerdotsindicator.attacher.a a0 = () -> {
                    L.p(this.e, "$baseDotsIndicator");
                    this.e.n();
                };
                this.e.post(a0);
            }
        }

        L.p(baseDotsIndicator0, "baseDotsIndicator");
        Object object1 = this.b(object0);
        if(object1 == null) {
            throw new IllegalStateException("Please set an adapter to the view pager (1 or 2) or the recycler before initializing the dots indicator");
        }
        this.c(object0, object1, new com.tbuonomo.viewpagerdotsindicator.attacher.b.a(baseDotsIndicator0));
        baseDotsIndicator0.setPager(this.a(object0, object1));
        baseDotsIndicator0.n();
    }
}

