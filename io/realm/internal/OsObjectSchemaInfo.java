package io.realm.internal;

import io.realm.RealmFieldType;
import o3.h;

public class OsObjectSchemaInfo implements l {
    static class a {
    }

    public static class b {
        private final String a;
        private final String b;
        private final long[] c;
        private final boolean d;
        private int e;
        private final long[] f;
        private int g;

        public b(String s, String s1, boolean z, int v, int v1) {
            this.e = 0;
            this.g = 0;
            this.b = s;
            this.a = s1;
            this.d = z;
            this.c = new long[v];
            this.f = new long[v1];
        }

        public b(String s, boolean z, int v, int v1) {
            this.e = 0;
            this.g = 0;
            this.b = "";
            this.a = s;
            this.d = z;
            this.c = new long[v];
            this.f = new long[v1];
        }

        public b a(String s, String s1, String s2) {
            long v = Property.nativeCreateComputedLinkProperty(s, s1, s2);
            int v1 = this.g;
            this.f[v1] = v;
            this.g = v1 + 1;
            return this;
        }

        public b b(String s, String s1, RealmFieldType realmFieldType0, String s2) {
            long v = Property.nativeCreatePersistedLinkProperty(s1, s, Property.a(realmFieldType0, false), s2);
            int v1 = this.e;
            this.c[v1] = v;
            this.e = v1 + 1;
            return this;
        }

        public b c(String s, String s1, RealmFieldType realmFieldType0, boolean z) {
            long v = Property.nativeCreatePersistedProperty(s1, s, Property.a(realmFieldType0, z), false, false);
            int v1 = this.e;
            this.c[v1] = v;
            this.e = v1 + 1;
            return this;
        }

        public b d(String s, String s1, RealmFieldType realmFieldType0, boolean z, boolean z1, boolean z2) {
            long v = Property.nativeCreatePersistedProperty(s1, s, Property.a(realmFieldType0, z2), z, z1);
            int v1 = this.e;
            this.c[v1] = v;
            this.e = v1 + 1;
            return this;
        }

        public b e(String s, String s1, RealmFieldType realmFieldType0, boolean z) {
            long v = Property.nativeCreatePersistedProperty(s1, s, Property.a(realmFieldType0, z), false, false);
            int v1 = this.e;
            this.c[v1] = v;
            this.e = v1 + 1;
            return this;
        }

        public b f(String s, String s1, RealmFieldType realmFieldType0, boolean z) {
            long v = Property.nativeCreatePersistedProperty(s1, s, Property.a(realmFieldType0, z), false, false);
            int v1 = this.e;
            this.c[v1] = v;
            this.e = v1 + 1;
            return this;
        }

        public OsObjectSchemaInfo g() {
            if(this.e == -1 || this.g == -1) {
                throw new IllegalStateException("\'OsObjectSchemaInfo.build()\' has been called before on this object.");
            }
            OsObjectSchemaInfo osObjectSchemaInfo0 = new OsObjectSchemaInfo(this.b, this.a, this.d, null);
            OsObjectSchemaInfo.nativeAddProperties(osObjectSchemaInfo0.a, this.c, this.f);
            this.e = -1;
            this.g = -1;
            return osObjectSchemaInfo0;
        }
    }

    private long a;
    private static final long b;

    static {
        OsObjectSchemaInfo.b = OsObjectSchemaInfo.nativeGetFinalizerPtr();
    }

    OsObjectSchemaInfo(long v) {
        this.a = v;
        k.c.a(this);
    }

    private OsObjectSchemaInfo(String s, String s1, boolean z) {
        this(OsObjectSchemaInfo.nativeCreateRealmObjectSchema(s, s1, z));
    }

    OsObjectSchemaInfo(String s, String s1, boolean z, a osObjectSchemaInfo$a0) {
        this(s, s1, z);
    }

    public String c() {
        return OsObjectSchemaInfo.nativeGetClassName(this.a);
    }

    @h
    public Property d() {
        return OsObjectSchemaInfo.nativeGetPrimaryKeyProperty(this.a) == 0L ? null : new Property(OsObjectSchemaInfo.nativeGetPrimaryKeyProperty(this.a));
    }

    public Property e(String s) {
        return new Property(OsObjectSchemaInfo.nativeGetProperty(this.a, s));
    }

    public boolean f() {
        return OsObjectSchemaInfo.nativeIsEmbedded(this.a);
    }

    @Override  // io.realm.internal.l
    public long getNativeFinalizerPtr() {
        return OsObjectSchemaInfo.b;
    }

    @Override  // io.realm.internal.l
    public long getNativePtr() {
        return this.a;
    }

    private static native void nativeAddProperties(long arg0, long[] arg1, long[] arg2) {
    }

    private static native long nativeCreateRealmObjectSchema(String arg0, String arg1, boolean arg2) {
    }

    private static native String nativeGetClassName(long arg0) {
    }

    private static native long nativeGetFinalizerPtr() {
    }

    private static native long nativeGetPrimaryKeyProperty(long arg0) {
    }

    private static native long nativeGetProperty(long arg0, String arg1) {
    }

    private static native boolean nativeIsEmbedded(long arg0) {
    }
}

