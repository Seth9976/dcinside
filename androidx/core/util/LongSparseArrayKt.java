package androidx.core.util;

import A3.a;
import A3.o;
import android.util.LongSparseArray;
import java.util.Iterator;
import kotlin.collections.U;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import y4.l;

@s0({"SMAP\nLongSparseArray.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LongSparseArray.kt\nandroidx/core/util/LongSparseArrayKt\n*L\n1#1,101:1\n77#1,4:102\n*S KotlinDebug\n*F\n+ 1 LongSparseArray.kt\nandroidx/core/util/LongSparseArrayKt\n*L\n73#1:102,4\n*E\n"})
public final class LongSparseArrayKt {
    public static final boolean a(@l LongSparseArray longSparseArray0, long v) {
        return longSparseArray0.indexOfKey(v) >= 0;
    }

    public static final boolean b(@l LongSparseArray longSparseArray0, long v) {
        return longSparseArray0.indexOfKey(v) >= 0;
    }

    public static final boolean c(@l LongSparseArray longSparseArray0, Object object0) {
        return longSparseArray0.indexOfValue(object0) >= 0;
    }

    public static final void d(@l LongSparseArray longSparseArray0, @l o o0) {
        int v = longSparseArray0.size();
        for(int v1 = 0; v1 < v; ++v1) {
            o0.invoke(longSparseArray0.keyAt(v1), longSparseArray0.valueAt(v1));
        }
    }

    public static final Object e(@l LongSparseArray longSparseArray0, long v, Object object0) {
        Object object1 = longSparseArray0.get(v);
        return object1 == null ? object0 : object1;
    }

    public static final Object f(@l LongSparseArray longSparseArray0, long v, @l a a0) {
        Object object0 = longSparseArray0.get(v);
        return object0 == null ? a0.invoke() : object0;
    }

    public static final int g(@l LongSparseArray longSparseArray0) {
        return longSparseArray0.size();
    }

    public static final boolean h(@l LongSparseArray longSparseArray0) {
        return longSparseArray0.size() == 0;
    }

    public static final boolean i(@l LongSparseArray longSparseArray0) {
        return longSparseArray0.size() != 0;
    }

    @l
    public static final U j(@l LongSparseArray longSparseArray0) {
        return new U() {
            private int a;

            @Override  // kotlin.collections.U
            public long b() {
                int v = this.a;
                this.a = v + 1;
                return longSparseArray0.keyAt(v);
            }

            public final int c() {
                return this.a;
            }

            public final void d(int v) {
                this.a = v;
            }

            @Override
            public boolean hasNext() {
                return this.a < longSparseArray0.size();
            }
        };
    }

    @l
    public static final LongSparseArray k(@l LongSparseArray longSparseArray0, @l LongSparseArray longSparseArray1) {
        LongSparseArray longSparseArray2 = new LongSparseArray(longSparseArray0.size() + longSparseArray1.size());
        LongSparseArrayKt.l(longSparseArray2, longSparseArray0);
        LongSparseArrayKt.l(longSparseArray2, longSparseArray1);
        return longSparseArray2;
    }

    public static final void l(@l LongSparseArray longSparseArray0, @l LongSparseArray longSparseArray1) {
        int v = longSparseArray1.size();
        for(int v1 = 0; v1 < v; ++v1) {
            longSparseArray0.put(longSparseArray1.keyAt(v1), longSparseArray1.valueAt(v1));
        }
    }

    public static final boolean m(@l LongSparseArray longSparseArray0, long v, Object object0) {
        int v1 = longSparseArray0.indexOfKey(v);
        if(v1 >= 0 && L.g(object0, longSparseArray0.valueAt(v1))) {
            longSparseArray0.removeAt(v1);
            return true;
        }
        return false;
    }

    public static final void n(@l LongSparseArray longSparseArray0, long v, Object object0) {
        longSparseArray0.put(v, object0);
    }

    @l
    public static final Iterator o(@l LongSparseArray longSparseArray0) {
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
                return this.a < longSparseArray0.size();
            }

            @Override
            public Object next() {
                int v = this.a;
                this.a = v + 1;
                return longSparseArray0.valueAt(v);
            }

            @Override
            public void remove() {
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            }
        };
    }
}

