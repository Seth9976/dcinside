package androidx.compose.foundation.lazy.grid;

import androidx.compose.runtime.internal.StabilityInferred;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.u;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlin.jvm.internal.w;
import kotlin.ranges.s;
import y4.l;

@s0({"SMAP\nLazyGridSpanLayoutProvider.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyGridSpanLayoutProvider.kt\nandroidx/compose/foundation/lazy/grid/LazyGridSpanLayoutProvider\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,243:1\n1#2:244\n*E\n"})
public final class LazyGridSpanLayoutProvider {
    static final class Bucket {
        private final int a;
        private final int b;

        public Bucket(int v, int v1) {
            this.a = v;
            this.b = v1;
        }

        public Bucket(int v, int v1, int v2, w w0) {
            if((v2 & 2) != 0) {
                v1 = 0;
            }
            this(v, v1);
        }

        public final int a() {
            return this.a;
        }

        public final int b() {
            return this.b;
        }
    }

    static final class LazyGridItemSpanScopeImpl implements LazyGridItemSpanScope {
        @l
        public static final LazyGridItemSpanScopeImpl a;
        private static int b;
        private static int c;

        static {
            LazyGridItemSpanScopeImpl.a = new LazyGridItemSpanScopeImpl();
        }

        @Override  // androidx.compose.foundation.lazy.grid.LazyGridItemSpanScope
        public int a() {
            return LazyGridItemSpanScopeImpl.b;
        }

        @Override  // androidx.compose.foundation.lazy.grid.LazyGridItemSpanScope
        public int b() {
            return LazyGridItemSpanScopeImpl.c;
        }

        public void c(int v) {
            LazyGridItemSpanScopeImpl.b = v;
        }

        public void d(int v) {
            LazyGridItemSpanScopeImpl.c = v;
        }
    }

    @StabilityInferred(parameters = 0)
    public static final class LineConfiguration {
        private final int a;
        @l
        private final List b;
        public static final int c = 8;

        static {
        }

        public LineConfiguration(int v, @l List list0) {
            L.p(list0, "spans");
            super();
            this.a = v;
            this.b = list0;
        }

        public final int a() {
            return this.a;
        }

        @l
        public final List b() {
            return this.b;
        }
    }

    @l
    private final LazyGridItemProvider a;
    @l
    private final ArrayList b;
    private int c;
    private int d;
    private int e;
    private int f;
    @l
    private final List g;
    @l
    private List h;
    private int i;

    public LazyGridSpanLayoutProvider(@l LazyGridItemProvider lazyGridItemProvider0) {
        L.p(lazyGridItemProvider0, "itemProvider");
        super();
        this.a = lazyGridItemProvider0;
        ArrayList arrayList0 = new ArrayList();
        arrayList0.add(new Bucket(0, 0, 2, null));
        this.b = arrayList0;
        this.f = -1;
        this.g = new ArrayList();
        this.h = u.H();
    }

    private final int a() {
        return ((int)Math.sqrt(((double)this.f()) * 1.0 / ((double)this.i))) + 1;
    }

    private final List b(int v) {
        if(v == this.h.size()) {
            return this.h;
        }
        ArrayList arrayList0 = new ArrayList(v);
        for(int v1 = 0; v1 < v; ++v1) {
            arrayList0.add(GridItemSpan.a(1L));
        }
        this.h = arrayList0;
        return arrayList0;
    }

    @l
    public final LineConfiguration c(int v) {
        if(!this.a.c()) {
            int v1 = v * this.i;
            return new LineConfiguration(v1, this.b(s.u(s.B(this.i, this.f() - v1), 0)));
        }
        boolean z = true;
        int v2 = Math.min(v / this.a(), this.b.size() - 1);
        int v3 = this.a() * v2;
        int v4 = ((Bucket)this.b.get(v2)).a();
        int v5 = ((Bucket)this.b.get(v2)).b();
        int v6 = this.c;
        if(v3 <= v6 && v6 <= v) {
            v4 = this.d;
            v5 = this.e;
            v3 = v6;
        }
        else if(v2 == this.f) {
            int v7 = v - v3;
            if(v7 < this.g.size()) {
                v4 = ((Number)this.g.get(v7)).intValue();
                v3 = v;
                v5 = 0;
            }
        }
        if(v3 % this.a() == 0 && (2 <= v - v3 && v - v3 < this.a())) {
            this.f = v2;
            this.g.clear();
        }
        else {
            z = false;
        }
        if(v3 > v) {
            throw new IllegalStateException("Check failed.");
        }
        while(v3 < v && v4 < this.f()) {
            if(z) {
                this.g.add(v4);
            }
            int v8 = 0;
            while(v8 < this.i && v4 < this.f()) {
                if(v5 == 0) {
                    v5 = this.i(v4, this.i - v8);
                }
                v8 += v5;
                if(v8 > this.i) {
                    break;
                }
                ++v4;
                v5 = 0;
            }
            ++v3;
            if(v3 % this.a() == 0 && v4 < this.f()) {
                int v9 = this.a();
                if(this.b.size() != v3 / v9) {
                    throw new IllegalStateException("Check failed.");
                }
                Bucket lazyGridSpanLayoutProvider$Bucket0 = new Bucket(v4, v5);
                this.b.add(lazyGridSpanLayoutProvider$Bucket0);
            }
        }
        this.c = v;
        this.d = v4;
        this.e = v5;
        ArrayList arrayList0 = new ArrayList();
        int v10 = v4;
        int v11 = 0;
        while(v11 < this.i && v10 < this.f()) {
            if(v5 == 0) {
                v5 = this.i(v10, this.i - v11);
            }
            v11 += v5;
            if(v11 > this.i) {
                break;
            }
            ++v10;
            arrayList0.add(GridItemSpan.a(LazyGridSpanKt.a(v5)));
            v5 = 0;
        }
        return new LineConfiguration(v4, arrayList0);
    }

    public final int d(int v) {
        if(this.f() <= 0) {
            return 0;
        }
        if(v >= this.f()) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        if(!this.a.c()) {
            return LineIndex.c(v / this.i);
        }
        androidx.compose.foundation.lazy.grid.LazyGridSpanLayoutProvider.getLineIndexOfItem.lowerBoundBucket.1 lazyGridSpanLayoutProvider$getLineIndexOfItem$lowerBoundBucket$10 = new Function1() {
            final int e;

            {
                this.e = v;
                super(1);
            }

            @l
            public final Integer a(@l Bucket lazyGridSpanLayoutProvider$Bucket0) {
                L.p(lazyGridSpanLayoutProvider$Bucket0, "it");
                return (int)(lazyGridSpanLayoutProvider$Bucket0.a() - this.e);
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                return this.a(((Bucket)object0));
            }
        };
        int v1 = u.x(this.b, 0, 0, lazyGridSpanLayoutProvider$getLineIndexOfItem$lowerBoundBucket$10, 3, null);
        if(v1 < 0) {
            v1 = -v1 - 2;
        }
        int v2 = this.a() * v1;
        int v3 = ((Bucket)this.b.get(v1)).a();
        if(v3 > v) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        int v4 = 0;
        while(v3 < v) {
            int v5 = this.i(v3, this.i - v4);
            v4 += v5;
            int v6 = this.i;
            if(v4 >= v6) {
                if(v4 == v6) {
                    ++v2;
                    v4 = 0;
                }
                else {
                    ++v2;
                    v4 = v5;
                }
            }
            if(v2 % this.a() == 0 && v2 / this.a() >= this.b.size()) {
                this.b.add(new Bucket(v3 + 1 - (v4 <= 0 ? 0 : 1), 0, 2, null));
            }
            ++v3;
        }
        return v4 + this.i(v, this.i - v4) <= this.i ? v2 : v2 + 1;
    }

    public final int e() {
        return this.i;
    }

    public final int f() {
        return this.a.getItemCount();
    }

    private final void g() {
        this.b.clear();
        Bucket lazyGridSpanLayoutProvider$Bucket0 = new Bucket(0, 0, 2, null);
        this.b.add(lazyGridSpanLayoutProvider$Bucket0);
        this.c = 0;
        this.d = 0;
        this.e = 0;
        this.f = -1;
        this.g.clear();
    }

    public final void h(int v) {
        if(v != this.i) {
            this.i = v;
            this.g();
        }
    }

    public final int i(int v, int v1) {
        LazyGridItemSpanScopeImpl.a.c(v1);
        LazyGridItemSpanScopeImpl.a.d(this.i);
        return s.I(GridItemSpan.f(this.a.b(LazyGridItemSpanScopeImpl.a, v)), 1, this.i);
    }
}

