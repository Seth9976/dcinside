package androidx.core.util;

import A3.a;
import A3.o;
import android.util.SparseArray;
import java.util.Iterator;
import kotlin.collections.T;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import y4.l;

@s0({"SMAP\nSparseArray.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SparseArray.kt\nandroidx/core/util/SparseArrayKt\n*L\n1#1,101:1\n77#1,4:102\n*S KotlinDebug\n*F\n+ 1 SparseArray.kt\nandroidx/core/util/SparseArrayKt\n*L\n73#1:102,4\n*E\n"})
public final class SparseArrayKt {
    public static final boolean a(@l SparseArray sparseArray0, int v) {
        return sparseArray0.indexOfKey(v) >= 0;
    }

    public static final boolean b(@l SparseArray sparseArray0, int v) {
        return sparseArray0.indexOfKey(v) >= 0;
    }

    public static final boolean c(@l SparseArray sparseArray0, Object object0) {
        return sparseArray0.indexOfValue(object0) >= 0;
    }

    public static final void d(@l SparseArray sparseArray0, @l o o0) {
        int v = sparseArray0.size();
        for(int v1 = 0; v1 < v; ++v1) {
            o0.invoke(sparseArray0.keyAt(v1), sparseArray0.valueAt(v1));
        }
    }

    public static final Object e(@l SparseArray sparseArray0, int v, Object object0) {
        Object object1 = sparseArray0.get(v);
        return object1 == null ? object0 : object1;
    }

    public static final Object f(@l SparseArray sparseArray0, int v, @l a a0) {
        Object object0 = sparseArray0.get(v);
        return object0 == null ? a0.invoke() : object0;
    }

    public static final int g(@l SparseArray sparseArray0) {
        return sparseArray0.size();
    }

    public static final boolean h(@l SparseArray sparseArray0) {
        return sparseArray0.size() == 0;
    }

    public static final boolean i(@l SparseArray sparseArray0) {
        return sparseArray0.size() != 0;
    }

    @l
    public static final T j(@l SparseArray sparseArray0) {
        return new T() {
            private int a;

            @Override  // kotlin.collections.T
            public int b() {
                int v = this.a;
                this.a = v + 1;
                return sparseArray0.keyAt(v);
            }

            public final int c() {
                return this.a;
            }

            public final void d(int v) {
                this.a = v;
            }

            @Override
            public boolean hasNext() {
                return this.a < sparseArray0.size();
            }
        };
    }

    @l
    public static final SparseArray k(@l SparseArray sparseArray0, @l SparseArray sparseArray1) {
        SparseArray sparseArray2 = new SparseArray(sparseArray0.size() + sparseArray1.size());
        SparseArrayKt.l(sparseArray2, sparseArray0);
        SparseArrayKt.l(sparseArray2, sparseArray1);
        return sparseArray2;
    }

    public static final void l(@l SparseArray sparseArray0, @l SparseArray sparseArray1) {
        int v = sparseArray1.size();
        for(int v1 = 0; v1 < v; ++v1) {
            sparseArray0.put(sparseArray1.keyAt(v1), sparseArray1.valueAt(v1));
        }
    }

    public static final boolean m(@l SparseArray sparseArray0, int v, Object object0) {
        int v1 = sparseArray0.indexOfKey(v);
        if(v1 >= 0 && L.g(object0, sparseArray0.valueAt(v1))) {
            sparseArray0.removeAt(v1);
            return true;
        }
        return false;
    }

    public static final void n(@l SparseArray sparseArray0, int v, Object object0) {
        sparseArray0.put(v, object0);
    }

    @l
    public static final Iterator o(@l SparseArray sparseArray0) {
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
                return this.a < sparseArray0.size();
            }

            @Override
            public Object next() {
                int v = this.a;
                this.a = v + 1;
                return sparseArray0.valueAt(v);
            }

            @Override
            public void remove() {
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            }
        };
    }
}

