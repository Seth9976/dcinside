package io.realm.internal.objectstore;

import io.realm.internal.k;
import io.realm.internal.l;

public class OsKeyPathMapping implements l {
    public long a;
    private static final long b;

    static {
        OsKeyPathMapping.b = OsKeyPathMapping.nativeGetFinalizerMethodPtr();
    }

    public OsKeyPathMapping(long v) {
        this.a = OsKeyPathMapping.nativeCreateMapping(v);
        k.c.a(this);
    }

    @Override  // io.realm.internal.l
    public long getNativeFinalizerPtr() {
        return OsKeyPathMapping.b;
    }

    @Override  // io.realm.internal.l
    public long getNativePtr() {
        return this.a;
    }

    private static native long nativeCreateMapping(long arg0) {
    }

    private static native long nativeGetFinalizerMethodPtr() {
    }
}

