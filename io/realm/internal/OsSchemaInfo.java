package io.realm.internal;

import java.util.Collection;

public class OsSchemaInfo implements l {
    private long a;
    private final OsSharedRealm b;
    private static final long c;

    static {
        OsSchemaInfo.c = OsSchemaInfo.nativeGetFinalizerPtr();
    }

    OsSchemaInfo(long v, OsSharedRealm osSharedRealm0) {
        this.a = v;
        this.b = osSharedRealm0;
    }

    public OsSchemaInfo(Collection collection0) {
        this.a = OsSchemaInfo.nativeCreateFromList(OsSchemaInfo.a(collection0));
        k.c.a(this);
        this.b = null;
    }

    private static long[] a(Collection collection0) {
        long[] arr_v = new long[collection0.size()];
        int v = 0;
        for(Object object0: collection0) {
            arr_v[v] = ((OsObjectSchemaInfo)object0).getNativePtr();
            ++v;
        }
        return arr_v;
    }

    public OsObjectSchemaInfo b(String s) {
        return new OsObjectSchemaInfo(OsSchemaInfo.nativeGetObjectSchemaInfo(this.a, s));
    }

    @Override  // io.realm.internal.l
    public long getNativeFinalizerPtr() {
        return OsSchemaInfo.c;
    }

    @Override  // io.realm.internal.l
    public long getNativePtr() {
        return this.a;
    }

    private static native long nativeCreateFromList(long[] arg0) {
    }

    private static native long nativeGetFinalizerPtr() {
    }

    private static native long nativeGetObjectSchemaInfo(long arg0, String arg1) {
    }
}

