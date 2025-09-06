package androidx.core.util;

import A3.a;
import A3.o;
import android.util.SparseBooleanArray;
import kotlin.collections.T;
import kotlin.collections.r;
import kotlin.jvm.internal.s0;
import y4.l;

@s0({"SMAP\nSparseBooleanArray.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SparseBooleanArray.kt\nandroidx/core/util/SparseBooleanArrayKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,102:1\n78#1,4:104\n1#2:103\n*S KotlinDebug\n*F\n+ 1 SparseBooleanArray.kt\nandroidx/core/util/SparseBooleanArrayKt\n*L\n74#1:104,4\n*E\n"})
public final class SparseBooleanArrayKt {
    public static final boolean a(@l SparseBooleanArray sparseBooleanArray0, int v) {
        return sparseBooleanArray0.indexOfKey(v) >= 0;
    }

    public static final boolean b(@l SparseBooleanArray sparseBooleanArray0, int v) {
        return sparseBooleanArray0.indexOfKey(v) >= 0;
    }

    public static final boolean c(@l SparseBooleanArray sparseBooleanArray0, boolean z) {
        return sparseBooleanArray0.indexOfValue(z) >= 0;
    }

    public static final void d(@l SparseBooleanArray sparseBooleanArray0, @l o o0) {
        int v = sparseBooleanArray0.size();
        for(int v1 = 0; v1 < v; ++v1) {
            o0.invoke(sparseBooleanArray0.keyAt(v1), Boolean.valueOf(sparseBooleanArray0.valueAt(v1)));
        }
    }

    public static final boolean e(@l SparseBooleanArray sparseBooleanArray0, int v, boolean z) {
        return sparseBooleanArray0.get(v, z);
    }

    public static final boolean f(@l SparseBooleanArray sparseBooleanArray0, int v, @l a a0) {
        int v1 = sparseBooleanArray0.indexOfKey(v);
        return v1 < 0 ? ((Boolean)a0.invoke()).booleanValue() : sparseBooleanArray0.valueAt(v1);
    }

    public static final int g(@l SparseBooleanArray sparseBooleanArray0) {
        return sparseBooleanArray0.size();
    }

    public static final boolean h(@l SparseBooleanArray sparseBooleanArray0) {
        return sparseBooleanArray0.size() == 0;
    }

    public static final boolean i(@l SparseBooleanArray sparseBooleanArray0) {
        return sparseBooleanArray0.size() != 0;
    }

    @l
    public static final T j(@l SparseBooleanArray sparseBooleanArray0) {
        return new T() {
            private int a;

            @Override  // kotlin.collections.T
            public int b() {
                int v = this.a;
                this.a = v + 1;
                return sparseBooleanArray0.keyAt(v);
            }

            public final int c() {
                return this.a;
            }

            public final void d(int v) {
                this.a = v;
            }

            @Override
            public boolean hasNext() {
                return this.a < sparseBooleanArray0.size();
            }
        };
    }

    @l
    public static final SparseBooleanArray k(@l SparseBooleanArray sparseBooleanArray0, @l SparseBooleanArray sparseBooleanArray1) {
        SparseBooleanArray sparseBooleanArray2 = new SparseBooleanArray(sparseBooleanArray0.size() + sparseBooleanArray1.size());
        SparseBooleanArrayKt.l(sparseBooleanArray2, sparseBooleanArray0);
        SparseBooleanArrayKt.l(sparseBooleanArray2, sparseBooleanArray1);
        return sparseBooleanArray2;
    }

    public static final void l(@l SparseBooleanArray sparseBooleanArray0, @l SparseBooleanArray sparseBooleanArray1) {
        int v = sparseBooleanArray1.size();
        for(int v1 = 0; v1 < v; ++v1) {
            sparseBooleanArray0.put(sparseBooleanArray1.keyAt(v1), sparseBooleanArray1.valueAt(v1));
        }
    }

    public static final boolean m(@l SparseBooleanArray sparseBooleanArray0, int v, boolean z) {
        int v1 = sparseBooleanArray0.indexOfKey(v);
        if(v1 >= 0 && z == sparseBooleanArray0.valueAt(v1)) {
            sparseBooleanArray0.delete(v);
            return true;
        }
        return false;
    }

    public static final void n(@l SparseBooleanArray sparseBooleanArray0, int v, boolean z) {
        sparseBooleanArray0.put(v, z);
    }

    @l
    public static final r o(@l SparseBooleanArray sparseBooleanArray0) {
        return new r() {
            private int a;

            @Override  // kotlin.collections.r
            public boolean b() {
                int v = this.a;
                this.a = v + 1;
                return sparseBooleanArray0.valueAt(v);
            }

            public final int c() {
                return this.a;
            }

            public final void d(int v) {
                this.a = v;
            }

            @Override
            public boolean hasNext() {
                return this.a < sparseBooleanArray0.size();
            }
        };
    }
}

