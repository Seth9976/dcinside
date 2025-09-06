package androidx.core.util;

import A3.a;
import A3.o;
import android.util.SparseLongArray;
import kotlin.collections.T;
import kotlin.collections.U;
import kotlin.jvm.internal.s0;
import y4.l;

@s0({"SMAP\nSparseLongArray.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SparseLongArray.kt\nandroidx/core/util/SparseLongArrayKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,100:1\n76#1,4:102\n1#2:101\n*S KotlinDebug\n*F\n+ 1 SparseLongArray.kt\nandroidx/core/util/SparseLongArrayKt\n*L\n72#1:102,4\n*E\n"})
public final class SparseLongArrayKt {
    public static final boolean a(@l SparseLongArray sparseLongArray0, int v) {
        return sparseLongArray0.indexOfKey(v) >= 0;
    }

    public static final boolean b(@l SparseLongArray sparseLongArray0, int v) {
        return sparseLongArray0.indexOfKey(v) >= 0;
    }

    public static final boolean c(@l SparseLongArray sparseLongArray0, long v) {
        return sparseLongArray0.indexOfValue(v) >= 0;
    }

    public static final void d(@l SparseLongArray sparseLongArray0, @l o o0) {
        int v = sparseLongArray0.size();
        for(int v1 = 0; v1 < v; ++v1) {
            o0.invoke(sparseLongArray0.keyAt(v1), sparseLongArray0.valueAt(v1));
        }
    }

    public static final long e(@l SparseLongArray sparseLongArray0, int v, long v1) {
        return sparseLongArray0.get(v, v1);
    }

    public static final long f(@l SparseLongArray sparseLongArray0, int v, @l a a0) {
        int v1 = sparseLongArray0.indexOfKey(v);
        return v1 < 0 ? ((Number)a0.invoke()).longValue() : sparseLongArray0.valueAt(v1);
    }

    public static final int g(@l SparseLongArray sparseLongArray0) {
        return sparseLongArray0.size();
    }

    public static final boolean h(@l SparseLongArray sparseLongArray0) {
        return sparseLongArray0.size() == 0;
    }

    public static final boolean i(@l SparseLongArray sparseLongArray0) {
        return sparseLongArray0.size() != 0;
    }

    @l
    public static final T j(@l SparseLongArray sparseLongArray0) {
        return new T() {
            private int a;

            @Override  // kotlin.collections.T
            public int b() {
                int v = this.a;
                this.a = v + 1;
                return sparseLongArray0.keyAt(v);
            }

            public final int c() {
                return this.a;
            }

            public final void d(int v) {
                this.a = v;
            }

            @Override
            public boolean hasNext() {
                return this.a < sparseLongArray0.size();
            }
        };
    }

    @l
    public static final SparseLongArray k(@l SparseLongArray sparseLongArray0, @l SparseLongArray sparseLongArray1) {
        SparseLongArray sparseLongArray2 = new SparseLongArray(sparseLongArray0.size() + sparseLongArray1.size());
        SparseLongArrayKt.l(sparseLongArray2, sparseLongArray0);
        SparseLongArrayKt.l(sparseLongArray2, sparseLongArray1);
        return sparseLongArray2;
    }

    public static final void l(@l SparseLongArray sparseLongArray0, @l SparseLongArray sparseLongArray1) {
        int v = sparseLongArray1.size();
        for(int v1 = 0; v1 < v; ++v1) {
            sparseLongArray0.put(sparseLongArray1.keyAt(v1), sparseLongArray1.valueAt(v1));
        }
    }

    public static final boolean m(@l SparseLongArray sparseLongArray0, int v, long v1) {
        int v2 = sparseLongArray0.indexOfKey(v);
        if(v2 >= 0 && v1 == sparseLongArray0.valueAt(v2)) {
            sparseLongArray0.removeAt(v2);
            return true;
        }
        return false;
    }

    public static final void n(@l SparseLongArray sparseLongArray0, int v, long v1) {
        sparseLongArray0.put(v, v1);
    }

    @l
    public static final U o(@l SparseLongArray sparseLongArray0) {
        return new U() {
            private int a;

            @Override  // kotlin.collections.U
            public long b() {
                int v = this.a;
                this.a = v + 1;
                return sparseLongArray0.valueAt(v);
            }

            public final int c() {
                return this.a;
            }

            public final void d(int v) {
                this.a = v;
            }

            @Override
            public boolean hasNext() {
                return this.a < sparseLongArray0.size();
            }
        };
    }
}

