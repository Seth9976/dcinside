package io.realm.internal;

import io.realm.v0.a;
import io.realm.v0.b;
import io.realm.v0;
import java.util.Arrays;

public class OsCollectionChangeSet implements l, v0 {
    private final long a;
    private final boolean b;
    public static final int c = 0;
    public static final int d = 1;
    public static final int e = 2;
    public static final int f = 0x7FFFFFF7;
    private static long g;

    static {
        OsCollectionChangeSet.g = OsCollectionChangeSet.nativeGetFinalizerPtr();
    }

    public OsCollectionChangeSet(long v, boolean z) {
        this.a = v;
        this.b = z;
        k.c.a(this);
    }

    @Override  // io.realm.v0
    public int[] a() {
        return OsCollectionChangeSet.nativeGetIndices(this.a, 0);
    }

    @Override  // io.realm.v0
    public int[] b() {
        return OsCollectionChangeSet.nativeGetIndices(this.a, 1);
    }

    @Override  // io.realm.v0
    public int[] c() {
        return OsCollectionChangeSet.nativeGetIndices(this.a, 2);
    }

    @Override  // io.realm.v0
    public a[] d() {
        return this.i(OsCollectionChangeSet.nativeGetRanges(this.a, 2));
    }

    @Override  // io.realm.v0
    public a[] e() {
        return this.i(OsCollectionChangeSet.nativeGetRanges(this.a, 0));
    }

    @Override  // io.realm.v0
    public a[] f() {
        return this.i(OsCollectionChangeSet.nativeGetRanges(this.a, 1));
    }

    public boolean g() {
        return this.a == 0L;
    }

    @Override  // io.realm.v0
    public Throwable getError() {
        return null;
    }

    @Override  // io.realm.internal.l
    public long getNativeFinalizerPtr() {
        return OsCollectionChangeSet.g;
    }

    @Override  // io.realm.internal.l
    public long getNativePtr() {
        return this.a;
    }

    @Override  // io.realm.v0
    public b getState() {
        throw new UnsupportedOperationException("This method should be overridden in a subclass");
    }

    public boolean h() {
        return this.b;
    }

    private a[] i(int[] arr_v) {
        if(arr_v == null) {
            return new a[0];
        }
        int v1 = arr_v.length / 2;
        a[] arr_v0$a = new a[v1];
        for(int v = 0; v < v1; ++v) {
            arr_v0$a[v] = new a(arr_v[v * 2], arr_v[v * 2 + 1]);
        }
        return arr_v0$a;
    }

    private static native long nativeGetFinalizerPtr() {
    }

    private static native int[] nativeGetIndices(long arg0, int arg1) {
    }

    private static native int[] nativeGetRanges(long arg0, int arg1) {
    }

    @Override
    public String toString() {
        return this.a == 0L ? "Change set is empty." : "Deletion Ranges: " + Arrays.toString(this.e()) + "\nInsertion Ranges: " + Arrays.toString(this.f()) + "\nChange Ranges: " + Arrays.toString(this.d());
    }
}

