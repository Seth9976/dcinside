package androidx.collection;

import A3.a;
import A3.o;
import java.util.Iterator;
import kotlin.collections.T;
import kotlin.jvm.internal.L;
import kotlin.k;
import kotlin.m;
import y4.l;

public final class SparseArrayKt {
    public static final boolean a(@l SparseArrayCompat sparseArrayCompat0, int v) {
        L.p(sparseArrayCompat0, "<this>");
        return sparseArrayCompat0.d(v);
    }

    public static final void b(@l SparseArrayCompat sparseArrayCompat0, @l o o0) {
        L.p(sparseArrayCompat0, "<this>");
        L.p(o0, "action");
        int v = sparseArrayCompat0.y();
        for(int v1 = 0; v1 < v; ++v1) {
            o0.invoke(sparseArrayCompat0.n(v1), sparseArrayCompat0.z(v1));
        }
    }

    public static final Object c(@l SparseArrayCompat sparseArrayCompat0, int v, Object object0) {
        L.p(sparseArrayCompat0, "<this>");
        return sparseArrayCompat0.h(v, object0);
    }

    public static final Object d(@l SparseArrayCompat sparseArrayCompat0, int v, @l a a0) {
        L.p(sparseArrayCompat0, "<this>");
        L.p(a0, "defaultValue");
        Object object0 = sparseArrayCompat0.g(v);
        return object0 == null ? a0.invoke() : object0;
    }

    public static final int e(@l SparseArrayCompat sparseArrayCompat0) {
        L.p(sparseArrayCompat0, "<this>");
        return sparseArrayCompat0.y();
    }

    public static final boolean f(@l SparseArrayCompat sparseArrayCompat0) {
        L.p(sparseArrayCompat0, "<this>");
        return !sparseArrayCompat0.m();
    }

    @l
    public static final T g(@l SparseArrayCompat sparseArrayCompat0) {
        L.p(sparseArrayCompat0, "<this>");
        return new T() {
            private int a;

            @Override  // kotlin.collections.T
            public int b() {
                int v = this.a;
                this.a = v + 1;
                return sparseArrayCompat0.n(v);
            }

            public final int c() {
                return this.a;
            }

            public final void d(int v) {
                this.a = v;
            }

            @Override
            public boolean hasNext() {
                return this.a < sparseArrayCompat0.y();
            }
        };
    }

    @l
    public static final SparseArrayCompat h(@l SparseArrayCompat sparseArrayCompat0, @l SparseArrayCompat sparseArrayCompat1) {
        L.p(sparseArrayCompat0, "<this>");
        L.p(sparseArrayCompat1, "other");
        SparseArrayCompat sparseArrayCompat2 = new SparseArrayCompat(sparseArrayCompat0.y() + sparseArrayCompat1.y());
        sparseArrayCompat2.p(sparseArrayCompat0);
        sparseArrayCompat2.p(sparseArrayCompat1);
        return sparseArrayCompat2;
    }

    @k(level = m.c, message = "Replaced with member function. Remove extension import!")
    public static final boolean i(SparseArrayCompat sparseArrayCompat0, int v, Object object0) {
        L.p(sparseArrayCompat0, "<this>");
        return sparseArrayCompat0.s(v, object0);
    }

    public static final void j(@l SparseArrayCompat sparseArrayCompat0, int v, Object object0) {
        L.p(sparseArrayCompat0, "<this>");
        sparseArrayCompat0.o(v, object0);
    }

    @l
    public static final Iterator k(@l SparseArrayCompat sparseArrayCompat0) {
        L.p(sparseArrayCompat0, "<this>");
        return new Object() {
            private int a;

            public final int a() {
                return this.a;
            }

            public final void b(int v) {
                this.a = v;
            }

            @Override
            public boolean hasNext() {
                return this.a < sparseArrayCompat0.y();
            }

            @Override
            public Object next() {
                int v = this.a;
                this.a = v + 1;
                return sparseArrayCompat0.z(v);
            }

            @Override
            public void remove() {
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            }
        };
    }
}

