package androidx.core.util;

import A3.a;
import A3.o;
import android.util.SparseIntArray;
import kotlin.collections.T;
import kotlin.jvm.internal.s0;
import y4.l;

@s0({"SMAP\nSparseIntArray.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SparseIntArray.kt\nandroidx/core/util/SparseIntArrayKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,100:1\n76#1,4:102\n1#2:101\n*S KotlinDebug\n*F\n+ 1 SparseIntArray.kt\nandroidx/core/util/SparseIntArrayKt\n*L\n72#1:102,4\n*E\n"})
public final class SparseIntArrayKt {
    public static final boolean a(@l SparseIntArray sparseIntArray0, int v) {
        return sparseIntArray0.indexOfKey(v) >= 0;
    }

    public static final boolean b(@l SparseIntArray sparseIntArray0, int v) {
        return sparseIntArray0.indexOfKey(v) >= 0;
    }

    public static final boolean c(@l SparseIntArray sparseIntArray0, int v) {
        return sparseIntArray0.indexOfValue(v) >= 0;
    }

    public static final void d(@l SparseIntArray sparseIntArray0, @l o o0) {
        int v = sparseIntArray0.size();
        for(int v1 = 0; v1 < v; ++v1) {
            o0.invoke(sparseIntArray0.keyAt(v1), sparseIntArray0.valueAt(v1));
        }
    }

    public static final int e(@l SparseIntArray sparseIntArray0, int v, int v1) {
        return sparseIntArray0.get(v, v1);
    }

    public static final int f(@l SparseIntArray sparseIntArray0, int v, @l a a0) {
        int v1 = sparseIntArray0.indexOfKey(v);
        return v1 < 0 ? ((Number)a0.invoke()).intValue() : sparseIntArray0.valueAt(v1);
    }

    public static final int g(@l SparseIntArray sparseIntArray0) {
        return sparseIntArray0.size();
    }

    public static final boolean h(@l SparseIntArray sparseIntArray0) {
        return sparseIntArray0.size() == 0;
    }

    public static final boolean i(@l SparseIntArray sparseIntArray0) {
        return sparseIntArray0.size() != 0;
    }

    @l
    public static final T j(@l SparseIntArray sparseIntArray0) {
        return new T() {
            private int a;

            @Override  // kotlin.collections.T
            public int b() {
                int v = this.a;
                this.a = v + 1;
                return sparseIntArray0.keyAt(v);
            }

            public final int c() {
                return this.a;
            }

            public final void d(int v) {
                this.a = v;
            }

            @Override
            public boolean hasNext() {
                return this.a < sparseIntArray0.size();
            }
        };
    }

    @l
    public static final SparseIntArray k(@l SparseIntArray sparseIntArray0, @l SparseIntArray sparseIntArray1) {
        SparseIntArray sparseIntArray2 = new SparseIntArray(sparseIntArray0.size() + sparseIntArray1.size());
        SparseIntArrayKt.l(sparseIntArray2, sparseIntArray0);
        SparseIntArrayKt.l(sparseIntArray2, sparseIntArray1);
        return sparseIntArray2;
    }

    public static final void l(@l SparseIntArray sparseIntArray0, @l SparseIntArray sparseIntArray1) {
        int v = sparseIntArray1.size();
        for(int v1 = 0; v1 < v; ++v1) {
            sparseIntArray0.put(sparseIntArray1.keyAt(v1), sparseIntArray1.valueAt(v1));
        }
    }

    public static final boolean m(@l SparseIntArray sparseIntArray0, int v, int v1) {
        int v2 = sparseIntArray0.indexOfKey(v);
        if(v2 >= 0 && v1 == sparseIntArray0.valueAt(v2)) {
            sparseIntArray0.removeAt(v2);
            return true;
        }
        return false;
    }

    public static final void n(@l SparseIntArray sparseIntArray0, int v, int v1) {
        sparseIntArray0.put(v, v1);
    }

    @l
    public static final T o(@l SparseIntArray sparseIntArray0) {
        return new T() {
            private int a;

            @Override  // kotlin.collections.T
            public int b() {
                int v = this.a;
                this.a = v + 1;
                return sparseIntArray0.valueAt(v);
            }

            public final int c() {
                return this.a;
            }

            public final void d(int v) {
                this.a = v;
            }

            @Override
            public boolean hasNext() {
                return this.a < sparseIntArray0.size();
            }
        };
    }
}

