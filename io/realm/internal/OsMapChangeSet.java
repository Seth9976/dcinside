package io.realm.internal;

public class OsMapChangeSet implements l {
    private final long a;
    public static final int b;
    private static long c;

    static {
        OsMapChangeSet.c = OsMapChangeSet.nativeGetFinalizerPtr();
    }

    public OsMapChangeSet(long v) {
        this.a = v;
    }

    public String[] a() {
        return OsMapChangeSet.nativeGetStringKeyDeletions(this.a);
    }

    public String[] b() {
        return OsMapChangeSet.nativeGetStringKeyInsertions(this.a);
    }

    public String[] c() {
        return OsMapChangeSet.nativeGetStringKeyModifications(this.a);
    }

    public boolean d() {
        return this.a == 0L;
    }

    @Override  // io.realm.internal.l
    public long getNativeFinalizerPtr() {
        return OsMapChangeSet.c;
    }

    @Override  // io.realm.internal.l
    public long getNativePtr() {
        return this.a;
    }

    private static native long nativeGetFinalizerPtr() {
    }

    private static native String[] nativeGetStringKeyDeletions(long arg0) {
    }

    private static native String[] nativeGetStringKeyInsertions(long arg0) {
    }

    private static native String[] nativeGetStringKeyModifications(long arg0) {
    }
}

