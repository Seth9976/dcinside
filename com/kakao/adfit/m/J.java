package com.kakao.adfit.m;

import java.util.concurrent.atomic.AtomicReference;

public final class j {
    static final class a {
        private final Object a;
        private final long b;

        public a(Object object0) {
            this.a = object0;
            this.b = D.a.b().a();
        }

        public final long a() {
            return this.b;
        }

        public final Object b() {
            return this.a;
        }
    }

    private final AtomicReference a;

    public j() {
        this.a = new AtomicReference();
    }

    public final Object a() {
        a j$a0 = (a)this.a.get();
        if(j$a0 == null) {
            return null;
        }
        return D.a.b().a() - j$a0.a() <= 500L ? j$a0.b() : null;
    }

    public final void a(Object object0) {
        a j$a0 = new a(object0);
        this.a.set(j$a0);
    }
}

