package androidx.core.util;

import A3.o;
import A3.q;
import android.util.LruCache;
import kotlin.S0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.N;
import y4.l;

public final class LruCacheKt {
    @l
    public static final LruCache a(int v, @l o o0, @l Function1 function10, @l q q0) {
        return new LruCache(v) {
            @Override  // android.util.LruCache
            protected Object create(Object object0) {
                return function10.invoke(object0);
            }

            @Override  // android.util.LruCache
            protected void entryRemoved(boolean z, Object object0, Object object1, Object object2) {
                q0.T0(Boolean.valueOf(z), object0, object1, object2);
            }

            @Override  // android.util.LruCache
            protected int sizeOf(Object object0, Object object1) {
                return ((Number)o0.invoke(object0, object1)).intValue();
            }
        };
    }

    public static LruCache b(int v, o o0, Function1 function10, q q0, int v1, Object object0) {
        if((v1 & 2) != 0) {
            o0 = androidx.core.util.LruCacheKt.lruCache.1.e;
        }
        if((v1 & 4) != 0) {
            function10 = androidx.core.util.LruCacheKt.lruCache.2.e;
        }
        if((v1 & 8) != 0) {
            q0 = androidx.core.util.LruCacheKt.lruCache.3.e;
        }
        return new androidx.core.util.LruCacheKt.lruCache.4(v, o0, function10, q0);

        public final class androidx.core.util.LruCacheKt.lruCache.1 extends N implements o {
            public static final androidx.core.util.LruCacheKt.lruCache.1 e;

            static {
                androidx.core.util.LruCacheKt.lruCache.1.e = new androidx.core.util.LruCacheKt.lruCache.1();
            }

            public androidx.core.util.LruCacheKt.lruCache.1() {
                super(2);
            }

            public final Integer a(Object object0, Object object1) {
                return 1;
            }

            @Override  // A3.o
            public Object invoke(Object object0, Object object1) {
                return this.a(object0, object1);
            }
        }


        public final class androidx.core.util.LruCacheKt.lruCache.2 extends N implements Function1 {
            public static final androidx.core.util.LruCacheKt.lruCache.2 e;

            static {
                androidx.core.util.LruCacheKt.lruCache.2.e = new androidx.core.util.LruCacheKt.lruCache.2();
            }

            public androidx.core.util.LruCacheKt.lruCache.2() {
                super(1);
            }

            @Override  // kotlin.jvm.functions.Function1
            public final Object invoke(Object object0) {
                return null;
            }
        }


        public final class androidx.core.util.LruCacheKt.lruCache.3 extends N implements q {
            public static final androidx.core.util.LruCacheKt.lruCache.3 e;

            static {
                androidx.core.util.LruCacheKt.lruCache.3.e = new androidx.core.util.LruCacheKt.lruCache.3();
            }

            public androidx.core.util.LruCacheKt.lruCache.3() {
                super(4);
            }

            @Override  // A3.q
            public Object T0(Object object0, Object object1, Object object2, Object object3) {
                return S0.a;
            }

            public final void a(boolean z, Object object0, Object object1, Object object2) {
            }
        }

    }
}

