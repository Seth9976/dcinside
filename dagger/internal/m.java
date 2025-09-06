package dagger.internal;

import a3.e;
import java.util.Map;
import r3.c;

public final class m extends a implements e {
    static class dagger.internal.m.a {
    }

    public static final class b extends dagger.internal.a.a {
        private b(int v) {
            super(v);
        }

        b(int v, dagger.internal.m.a m$a0) {
            this(v);
        }

        @Override  // dagger.internal.a$a
        public dagger.internal.a.a a(Object object0, c c0) {
            return this.d(object0, c0);
        }

        @Override  // dagger.internal.a$a
        public dagger.internal.a.a b(c c0) {
            return this.e(c0);
        }

        public m c() {
            return new m(this.a, null);
        }

        public b d(Object object0, c c0) {
            super.a(object0, c0);
            return this;
        }

        public b e(c c0) {
            super.b(c0);
            return this;
        }
    }

    private m(Map map0) {
        super(map0);
    }

    m(Map map0, dagger.internal.m.a m$a0) {
        this(map0);
    }

    public static b c(int v) {
        return new b(v, null);
    }

    public Map d() {
        return this.b();
    }

    @Override  // a3.e, r3.c
    public Object get() {
        return this.d();
    }
}

