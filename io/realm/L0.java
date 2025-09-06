package io.realm;

import io.realm.internal.Table;
import io.realm.internal.j;
import io.realm.internal.u;
import o3.h;

public abstract class l0 implements j, Comparable {
    static abstract class a extends l0 {
        @Override  // io.realm.internal.j
        public final boolean L() {
            return true;
        }

        @Override  // io.realm.internal.j
        public boolean M3() {
            return this.n().x0();
        }

        @Override  // io.realm.l0
        public final void b(long v) {
            this.d(-v);
        }

        @Override  // io.realm.l0
        public final Long c() {
            u u0 = this.p();
            u0.T();
            long v = this.l();
            return u0.f(v) ? null : u0.w(v);
        }

        @Override  // io.realm.l0
        public int compareTo(Object object0) {
            return super.a(((l0)object0));
        }

        @Override  // io.realm.l0
        public final void d(long v) {
            this.n().n();
            u u0 = this.p();
            u0.b().Y(this.l(), u0.F(), v);
        }

        @Override  // io.realm.l0
        public final void h(@h Long long0) {
            A0 a00 = this.m();
            a00.f().n();
            if(!a00.i()) {
                this.r(long0, false);
                return;
            }
            if(!a00.d()) {
                return;
            }
            this.r(long0, true);
        }

        protected abstract long l();

        protected abstract A0 m();

        private io.realm.a n() {
            return this.m().f();
        }

        private u p() {
            return this.m().g();
        }

        private void r(@h Long long0, boolean z) {
            u u0 = this.p();
            Table table0 = u0.b();
            long v = u0.F();
            long v1 = this.l();
            if(long0 == null) {
                table0.v0(v1, v, z);
                return;
            }
            table0.u0(v1, v, ((long)long0), z);
        }

        // 去混淆评级： 低(20)
        @Override  // io.realm.internal.j
        public final boolean s() {
            return !this.n().isClosed() && this.p().s();
        }
    }

    static final class b extends l0 {
        @h
        private Long a;

        b(@h Long long0) {
            this.a = long0;
        }

        @Override  // io.realm.internal.j
        public boolean L() {
            return false;
        }

        @Override  // io.realm.internal.j
        public boolean M3() {
            return false;
        }

        @Override  // io.realm.l0
        public void b(long v) {
            this.d(-v);
        }

        @Override  // io.realm.l0
        @h
        public Long c() {
            return this.a;
        }

        @Override  // io.realm.l0
        public int compareTo(Object object0) {
            return super.a(((l0)object0));
        }

        @Override  // io.realm.l0
        public void d(long v) {
            Long long0 = this.a;
            if(long0 == null) {
                throw new IllegalStateException("Cannot increment a MutableRealmInteger whose value is null. Set its value first.");
            }
            this.a = (long)(((long)long0) + v);
        }

        @Override  // io.realm.l0
        public void h(@h Long long0) {
            this.a = long0;
        }

        @Override  // io.realm.internal.j
        public boolean s() {
            return true;
        }
    }

    public final int a(l0 l00) {
        Long long0 = this.c();
        Long long1 = l00.c();
        if(long0 == null) {
            return long1 == null ? 0 : -1;
        }
        return long1 == null ? 1 : long0.compareTo(long1);
    }

    public abstract void b(long arg1);

    @h
    public abstract Long c();

    @Override
    public int compareTo(Object object0) {
        return this.a(((l0)object0));
    }

    public abstract void d(long arg1);

    public final boolean e() {
        return this.c() == null;
    }

    @Override
    public final boolean equals(Object object0) {
        if(object0 == this) {
            return true;
        }
        if(!(object0 instanceof l0)) {
            return false;
        }
        Long long0 = this.c();
        Long long1 = ((l0)object0).c();
        return long0 == null ? long1 == null : long0.equals(long1);
    }

    public static l0 f() {
        return new b(null);
    }

    public final void g(long v) {
        this.h(v);
    }

    public abstract void h(@h Long arg1);

    @Override
    public final int hashCode() {
        Long long0 = this.c();
        return long0 == null ? 0 : long0.hashCode();
    }

    public static l0 i(long v) {
        return l0.j(v);
    }

    public static l0 j(Long long0) {
        return new b(long0);
    }

    public static l0 k(String s) {
        return l0.i(Long.parseLong(s));
    }
}

