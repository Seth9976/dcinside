package androidx.collection;

import A3.o;
import A3.q;
import kotlin.S0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import y4.l;
import y4.m;

public final class LruCacheKt {
    @l
    public static final LruCache a(int v, @l o o0, @l Function1 function10, @l q q0) {
        L.p(o0, "sizeOf");
        L.p(function10, "create");
        L.p(q0, "onEntryRemoved");
        return new LruCache(v) {
            @Override  // androidx.collection.LruCache
            @m
            protected Object create(@l Object object0) {
                L.p(object0, "key");
                return function10.invoke(object0);
            }

            @Override  // androidx.collection.LruCache
            protected void entryRemoved(boolean z, @l Object object0, @l Object object1, @m Object object2) {
                L.p(object0, "key");
                L.p(object1, "oldValue");
                q0.T0(Boolean.valueOf(z), object0, object1, object2);
            }

            @Override  // androidx.collection.LruCache
            protected int sizeOf(@l Object object0, @l Object object1) {
                L.p(object0, "key");
                L.p(object1, "value");
                return ((Number)o0.invoke(object0, object1)).intValue();
            }
        };
    }

    public static LruCache b(int v, o o0, Function1 function10, q q0, int v1, Object object0) {
        if((v1 & 2) != 0) {
            o0 = androidx.collection.LruCacheKt.lruCache.1.e;
        }
        if((v1 & 4) != 0) {
            function10 = androidx.collection.LruCacheKt.lruCache.2.e;
        }
        if((v1 & 8) != 0) {
            q0 = androidx.collection.LruCacheKt.lruCache.3.e;
        }
        L.p(o0, "sizeOf");
        L.p(function10, "create");
        L.p(q0, "onEntryRemoved");
        return new androidx.collection.LruCacheKt.lruCache.4(v, o0, function10, q0);

        @s0({"SMAP\nLruCache.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LruCache.kt\nandroidx/collection/LruCacheKt$lruCache$1\n*L\n1#1,355:1\n*E\n"})
        public final class androidx.collection.LruCacheKt.lruCache.1 extends N implements o {
            public static final androidx.collection.LruCacheKt.lruCache.1 e;

            static {
                androidx.collection.LruCacheKt.lruCache.1.e = new androidx.collection.LruCacheKt.lruCache.1();
            }

            public androidx.collection.LruCacheKt.lruCache.1() {
                super(2);
            }

            @l
            public final Integer a(@l Object object0, @l Object object1) {
                L.p(object0, "<anonymous parameter 0>");
                L.p(object1, "<anonymous parameter 1>");
                return 1;
            }

            @Override  // A3.o
            public Object invoke(Object object0, Object object1) {
                return this.a(object0, object1);
            }
        }


        @s0({"SMAP\nLruCache.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LruCache.kt\nandroidx/collection/LruCacheKt$lruCache$2\n*L\n1#1,355:1\n*E\n"})
        public final class androidx.collection.LruCacheKt.lruCache.2 extends N implements Function1 {
            public static final androidx.collection.LruCacheKt.lruCache.2 e;

            static {
                androidx.collection.LruCacheKt.lruCache.2.e = new androidx.collection.LruCacheKt.lruCache.2();
            }

            public androidx.collection.LruCacheKt.lruCache.2() {
                super(1);
            }

            @Override  // kotlin.jvm.functions.Function1
            @m
            public final Object invoke(@l Object object0) {
                L.p(object0, "it");
                return null;
            }
        }


        @s0({"SMAP\nLruCache.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LruCache.kt\nandroidx/collection/LruCacheKt$lruCache$3\n*L\n1#1,355:1\n*E\n"})
        public final class androidx.collection.LruCacheKt.lruCache.3 extends N implements q {
            public static final androidx.collection.LruCacheKt.lruCache.3 e;

            static {
                androidx.collection.LruCacheKt.lruCache.3.e = new androidx.collection.LruCacheKt.lruCache.3();
            }

            public androidx.collection.LruCacheKt.lruCache.3() {
                super(4);
            }

            @Override  // A3.q
            public Object T0(Object object0, Object object1, Object object2, Object object3) {
                this.a(((Boolean)object0).booleanValue(), object1, object2, object3);
                return S0.a;
            }

            public final void a(boolean z, @l Object object0, @l Object object1, @m Object object2) {
                L.p(object0, "<anonymous parameter 1>");
                L.p(object1, "<anonymous parameter 2>");
            }
        }

    }
}

