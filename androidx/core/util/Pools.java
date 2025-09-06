package androidx.core.util;

import androidx.annotation.IntRange;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import y4.l;
import y4.m;

public final class Pools {
    public interface Pool {
        boolean a(@l Object arg1);

        @m
        Object b();
    }

    @s0({"SMAP\nPools.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Pools.kt\nandroidx/core/util/Pools$SimplePool\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,133:1\n1#2:134\n*E\n"})
    public static class SimplePool implements Pool {
        @l
        private final Object[] a;
        private int b;

        public SimplePool(@IntRange(from = 1L) int v) {
            if(v <= 0) {
                throw new IllegalArgumentException("The max pool size must be > 0");
            }
            this.a = new Object[v];
        }

        @Override  // androidx.core.util.Pools$Pool
        public boolean a(@l Object object0) {
            L.p(object0, "instance");
            if(this.c(object0)) {
                throw new IllegalStateException("Already in the pool!");
            }
            int v = this.b;
            Object[] arr_object = this.a;
            if(v < arr_object.length) {
                arr_object[v] = object0;
                this.b = v + 1;
                return true;
            }
            return false;
        }

        @Override  // androidx.core.util.Pools$Pool
        @m
        public Object b() {
            int v = this.b;
            if(v > 0) {
                Object object0 = this.a[v - 1];
                L.n(object0, "null cannot be cast to non-null type T of androidx.core.util.Pools.SimplePool");
                this.a[v - 1] = null;
                --this.b;
                return object0;
            }
            return null;
        }

        private final boolean c(Object object0) {
            int v = this.b;
            for(int v1 = 0; v1 < v; ++v1) {
                if(this.a[v1] == object0) {
                    return true;
                }
            }
            return false;
        }
    }

    public static class SynchronizedPool extends SimplePool {
        @l
        private final Object c;

        public SynchronizedPool(int v) {
            super(v);
            this.c = new Object();
        }

        @Override  // androidx.core.util.Pools$SimplePool
        public boolean a(@l Object object0) {
            L.p(object0, "instance");
            synchronized(this.c) {
                return super.a(object0);
            }
        }

        @Override  // androidx.core.util.Pools$SimplePool
        @m
        public Object b() {
            synchronized(this.c) {
                return super.b();
            }
        }
    }

}

