package androidx.compose.runtime.collection;

import android.util.SparseArray;
import kotlin.jvm.internal.w;
import y4.l;
import y4.m;

public final class IntMap {
    @l
    private final SparseArray a;

    public IntMap(int v) {
        this(new SparseArray(v));
    }

    public IntMap(int v, int v1, w w0) {
        if((v1 & 1) != 0) {
            v = 10;
        }
        this(v);
    }

    private IntMap(SparseArray sparseArray0) {
        this.a = sparseArray0;
    }

    public final void a() {
        this.a.clear();
    }

    public final boolean b(int v) {
        return this.a.indexOfKey(v) >= 0;
    }

    @m
    public final Object c(int v) {
        return this.a.get(v);
    }

    public final Object d(int v, Object object0) {
        return this.a.get(v, object0);
    }

    public final int e() {
        return this.a.size();
    }

    public final void f(int v) {
        this.a.remove(v);
    }

    public final void g(int v, Object object0) {
        this.a.put(v, object0);
    }
}

