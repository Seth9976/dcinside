package androidx.compose.foundation.lazy.staggeredgrid;

import kotlin.collections.k;
import kotlin.collections.u;
import kotlin.comparisons.a;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlin.jvm.internal.w;
import y4.l;
import y4.m;

@s0({"SMAP\nLazyStaggeredGridLaneInfo.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyStaggeredGridLaneInfo.kt\nandroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridLaneInfo\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 Collections.kt\nkotlin/collections/CollectionsKt__CollectionsKt\n*L\n1#1,207:1\n1#2:208\n388#3,7:209\n388#3,7:216\n*S KotlinDebug\n*F\n+ 1 LazyStaggeredGridLaneInfo.kt\nandroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridLaneInfo\n*L\n167#1:209,7\n187#1:216,7\n*E\n"})
public final class LazyStaggeredGridLaneInfo {
    public static final class Companion {
        private Companion() {
        }

        public Companion(w w0) {
        }
    }

    static final class SpannedItem {
        private final int a;
        @l
        private int[] b;

        public SpannedItem(int v, @l int[] arr_v) {
            L.p(arr_v, "gaps");
            super();
            this.a = v;
            this.b = arr_v;
        }

        @l
        public final int[] a() {
            return this.b;
        }

        public final int b() {
            return this.a;
        }

        public final void c(@l int[] arr_v) {
            L.p(arr_v, "<set-?>");
            this.b = arr_v;
        }
    }

    private int a;
    @l
    private int[] b;
    @l
    private final k c;
    @l
    public static final Companion d = null;
    private static final int e = 0x20000;
    public static final int f = -1;
    public static final int g = -2;

    static {
        LazyStaggeredGridLaneInfo.d = new Companion(null);
    }

    public LazyStaggeredGridLaneInfo() {
        this.b = new int[16];
        this.c = new k();
    }

    public final boolean a(int v, int v1) {
        int v2 = this.h(v);
        return v2 == v1 || (v2 == -2 || v2 == -1);
    }

    private final void b(int v, int v1) {
        if(v > 0x20000) {
            throw new IllegalArgumentException(("Requested item capacity " + v + " is larger than max supported: 131072!").toString());
        }
        int[] arr_v = this.b;
        if(arr_v.length < v) {
            int v2;
            for(v2 = arr_v.length; v2 < v; v2 *= 2) {
            }
            this.b = kotlin.collections.l.I0(this.b, new int[v2], v1, 0, 0, 12, null);
        }
    }

    static void c(LazyStaggeredGridLaneInfo lazyStaggeredGridLaneInfo0, int v, int v1, int v2, Object object0) {
        if((v2 & 2) != 0) {
            v1 = 0;
        }
        lazyStaggeredGridLaneInfo0.b(v, v1);
    }

    public final void d(int v) {
        int v1 = this.a;
        int v2 = v - v1;
        if(v2 < 0 || v2 >= 0x20000) {
            int v3 = Math.max(v - this.b.length / 2, 0);
            this.a = v3;
            int v4 = v3 - v1;
            if(v4 >= 0) {
                int[] arr_v = this.b;
                if(v4 < arr_v.length) {
                    kotlin.collections.l.z0(arr_v, arr_v, 0, v4, arr_v.length);
                }
                kotlin.collections.l.K1(this.b, 0, Math.max(0, this.b.length - v4), this.b.length);
            }
            else {
                int[] arr_v1 = this.b;
                if(arr_v1.length - v4 < 0x20000) {
                    this.b(arr_v1.length - v4 + 1, -v4);
                }
                else {
                    if(-v4 < arr_v1.length) {
                        kotlin.collections.l.z0(arr_v1, arr_v1, -v4, 0, arr_v1.length - -v4);
                    }
                    kotlin.collections.l.K1(this.b, 0, 0, Math.min(this.b.length, -v4));
                }
            }
        }
        else {
            LazyStaggeredGridLaneInfo.c(this, v2 + 1, 0, 2, null);
        }
        while(!this.c.isEmpty() && ((SpannedItem)this.c.first()).b() < this.i()) {
            this.c.removeFirst();
        }
        while(!this.c.isEmpty() && ((SpannedItem)this.c.last()).b() > this.m()) {
            this.c.removeLast();
        }
    }

    public final int e(int v, int v1) {
        int v2 = v + 1;
        int v3 = this.m();
        while(v2 < v3) {
            if(this.a(v2, v1)) {
                return v2;
            }
            ++v2;
        }
        return this.m();
    }

    public final int f(int v, int v1) {
        for(int v2 = v - 1; -1 < v2; --v2) {
            if(this.a(v2, v1)) {
                return v2;
            }
        }
        return -1;
    }

    @m
    public final int[] g(int v) {
        androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridLaneInfo.getGaps..inlined.binarySearchBy.default.1 lazyStaggeredGridLaneInfo$getGaps$$inlined$binarySearchBy$default$10 = new Function1() {
            final Comparable e;

            {
                this.e = comparable0;
                super(1);
            }

            @l
            public final Integer a(Object object0) {
                return a.l(((SpannedItem)object0).b(), this.e);
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                return this.a(object0);
            }
        };
        int v1 = u.u(this.c, 0, this.c.size(), lazyStaggeredGridLaneInfo$getGaps$$inlined$binarySearchBy$default$10);
        SpannedItem lazyStaggeredGridLaneInfo$SpannedItem0 = (SpannedItem)u.W2(this.c, v1);
        return lazyStaggeredGridLaneInfo$SpannedItem0 == null ? null : lazyStaggeredGridLaneInfo$SpannedItem0.a();
    }

    public final int h(int v) {
        return v < this.i() || v >= this.m() ? -1 : this.b[v - this.a] - 1;
    }

    public final int i() {
        return this.a;
    }

    public final void j() {
        kotlin.collections.l.T1(this.b, 0, 0, 0, 6, null);
        this.c.clear();
    }

    public final void k(int v, @m int[] arr_v) {
        androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridLaneInfo.setGaps..inlined.binarySearchBy.default.1 lazyStaggeredGridLaneInfo$setGaps$$inlined$binarySearchBy$default$10 = new Function1() {
            final Comparable e;

            {
                this.e = comparable0;
                super(1);
            }

            @l
            public final Integer a(Object object0) {
                return a.l(((SpannedItem)object0).b(), this.e);
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                return this.a(object0);
            }
        };
        int v1 = u.u(this.c, 0, this.c.size(), lazyStaggeredGridLaneInfo$setGaps$$inlined$binarySearchBy$default$10);
        if(v1 < 0) {
            if(arr_v == null) {
                return;
            }
            SpannedItem lazyStaggeredGridLaneInfo$SpannedItem0 = new SpannedItem(v, arr_v);
            this.c.add(-(v1 + 1), lazyStaggeredGridLaneInfo$SpannedItem0);
            return;
        }
        if(arr_v == null) {
            this.c.remove(v1);
            return;
        }
        ((SpannedItem)this.c.get(v1)).c(arr_v);
    }

    public final void l(int v, int v1) {
        if(v < 0) {
            throw new IllegalArgumentException("Negative lanes are not supported");
        }
        this.d(v);
        this.b[v - this.a] = v1 + 1;
    }

    public final int m() {
        return this.a + this.b.length;
    }
}

