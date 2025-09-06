package io.realm.internal;

import io.realm.RealmFieldType;
import io.realm.internal.core.NativeRealmAny;
import java.util.Date;
import java.util.UUID;
import o3.h;
import org.bson.types.Decimal128;
import org.bson.types.ObjectId;

public class UncheckedRow implements l, u {
    static class a {
        static final int[] a;

        static {
            int[] arr_v = new int[RealmFieldType.values().length];
            a.a = arr_v;
            try {
                arr_v[RealmFieldType.OBJECT.ordinal()] = 1;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                a.a[RealmFieldType.LIST.ordinal()] = 2;
            }
            catch(NoSuchFieldError unused_ex) {
            }
        }
    }

    protected final k a;
    protected final Table b;
    private final long c;
    private static final long d;

    static {
        UncheckedRow.d = UncheckedRow.nativeGetFinalizerPtr();
    }

    UncheckedRow(UncheckedRow uncheckedRow0) {
        this.a = uncheckedRow0.a;
        this.b = uncheckedRow0.b;
        this.c = uncheckedRow0.c;
    }

    public UncheckedRow(k k0, Table table0, long v) {
        this.a = k0;
        this.b = table0;
        this.c = v;
        k0.a(this);
    }

    @Override  // io.realm.internal.u
    public void A(long v) {
        this.b.g();
        this.nativeNullifyLink(this.c, v);
    }

    @Override  // io.realm.internal.u
    public long B(String s) {
        if(s == null) {
            throw new IllegalArgumentException("Column name can not be null.");
        }
        return this.nativeGetColumnKey(this.c, s);
    }

    @Override  // io.realm.internal.u
    public OsMap C(long v) {
        return new OsMap(this, v);
    }

    @Override  // io.realm.internal.u
    public boolean D(long v) {
        return this.nativeIsNullLink(this.c, v);
    }

    @Override  // io.realm.internal.u
    public RealmFieldType E(long v) {
        return RealmFieldType.fromNativeValue(this.nativeGetColumnType(this.c, v));
    }

    @Override  // io.realm.internal.u
    public long F() {
        return this.nativeGetObjectKey(this.c);
    }

    @Override  // io.realm.internal.u
    public void G(long v, float f) {
        this.b.g();
        this.nativeSetFloat(this.c, v, f);
    }

    @Override  // io.realm.internal.u
    public long H(long v, RealmFieldType realmFieldType0) {
        switch(realmFieldType0) {
            case 1: {
                this.b.g();
                return this.nativeCreateEmbeddedObject(this.c, v);
            }
            case 2: {
                return this.y(v).p();
            }
            default: {
                throw new IllegalArgumentException("Wrong parentPropertyType, expected OBJECT or LIST but received " + realmFieldType0);
            }
        }
    }

    @Override  // io.realm.internal.u
    public OsMap I(long v) {
        return new OsMap(this, v);
    }

    @Override  // io.realm.internal.u
    public void J(long v, @h ObjectId objectId0) {
        this.b.g();
        if(objectId0 == null) {
            this.nativeSetNull(this.c, v);
            return;
        }
        this.nativeSetObjectId(this.c, v, "68bb29d9e0eee16e5db89e4f");
    }

    @Override  // io.realm.internal.u
    public void K(long v) {
        this.b.g();
        this.nativeSetNull(this.c, v);
    }

    @Override  // io.realm.internal.u
    public long L(long v) {
        return this.nativeGetLink(this.c, v);
    }

    @Override  // io.realm.internal.u
    public float M(long v) {
        return this.nativeGetFloat(this.c, v);
    }

    @Override  // io.realm.internal.u
    public void N(long v, Date date0) {
        this.b.g();
        if(date0 == null) {
            throw new IllegalArgumentException("Null Date is not allowed.");
        }
        long v1 = date0.getTime();
        this.nativeSetTimestamp(this.c, v, v1);
    }

    @Override  // io.realm.internal.u
    public OsSet O(long v) {
        return new OsSet(this, v);
    }

    @Override  // io.realm.internal.u
    public boolean P(String s) {
        return this.nativeHasColumn(this.c, s);
    }

    @Override  // io.realm.internal.u
    public boolean Q(long v) {
        return this.nativeGetBoolean(this.c, v);
    }

    @Override  // io.realm.internal.u
    public Date R(long v) {
        return new Date(this.nativeGetTimestamp(this.c, v));
    }

    @Override  // io.realm.internal.u
    public void S(long v, @h Decimal128 decimal1280) {
        this.b.g();
        if(decimal1280 == null) {
            this.nativeSetNull(this.c, v);
            return;
        }
        this.nativeSetDecimal128(this.c, v, decimal1280.i(), decimal1280.h());
    }

    @Override  // io.realm.internal.u
    public void T() {
        if(!this.s()) {
            throw new IllegalStateException("Object is no longer managed by Realm. Has it been deleted?");
        }
    }

    @Override  // io.realm.internal.u
    public String U(long v) {
        return this.nativeGetString(this.c, v);
    }

    @Override  // io.realm.internal.u
    public OsMap V(long v, RealmFieldType realmFieldType0) {
        return new OsMap(this, v);
    }

    @Override  // io.realm.internal.u
    public void W(long v, double f) {
        this.b.g();
        this.nativeSetDouble(this.c, v, f);
    }

    @Override  // io.realm.internal.u
    public u X(OsSharedRealm osSharedRealm0) {
        if(!this.s()) {
            return i.a;
        }
        Table table0 = this.b.y(osSharedRealm0);
        long v = this.nativeFreeze(this.c, osSharedRealm0.getNativePtr());
        return new UncheckedRow(this.a, table0, v);
    }

    @Override  // io.realm.internal.u
    public void a(long v, @h String s) {
        this.b.g();
        if(s == null) {
            this.nativeSetNull(this.c, v);
            return;
        }
        this.nativeSetString(this.c, v, s);
    }

    @Override  // io.realm.internal.u
    public Table b() {
        return this.b;
    }

    @Override  // io.realm.internal.u
    public UUID c(long v) {
        return UUID.fromString(this.nativeGetUUID(this.c, v));
    }

    @Override  // io.realm.internal.u
    public void d(long v, long v1) {
        this.b.g();
        this.nativeSetLink(this.c, v, v1);
    }

    @Override  // io.realm.internal.u
    public void e(long v, long v1) {
        this.b.g();
        this.nativeSetLong(this.c, v, v1);
    }

    @Override  // io.realm.internal.u
    public boolean e0() {
        return true;
    }

    @Override  // io.realm.internal.u
    public boolean f(long v) {
        return this.nativeIsNull(this.c, v);
    }

    @Override  // io.realm.internal.u
    public OsSet g(long v, RealmFieldType realmFieldType0) {
        return new OsSet(this, v);
    }

    @Override  // io.realm.internal.u
    public long getColumnCount() {
        return this.nativeGetColumnCount(this.c);
    }

    @Override  // io.realm.internal.u
    public String[] getColumnNames() {
        return this.nativeGetColumnNames(this.c);
    }

    @Override  // io.realm.internal.l
    public long getNativeFinalizerPtr() {
        return UncheckedRow.d;
    }

    @Override  // io.realm.internal.l
    public long getNativePtr() {
        return this.c;
    }

    @Override  // io.realm.internal.u
    public NativeRealmAny h(long v) {
        return new NativeRealmAny(this.nativeGetRealmAny(this.c, v));
    }

    @Override  // io.realm.internal.u
    public byte[] i(long v) {
        return this.nativeGetByteArray(this.c, v);
    }

    @Override  // io.realm.internal.u
    public double j(long v) {
        return this.nativeGetDouble(this.c, v);
    }

    @Override  // io.realm.internal.u
    public void k(long v, @h UUID uUID0) {
        this.b.g();
        if(uUID0 == null) {
            this.nativeSetNull(this.c, v);
            return;
        }
        this.nativeSetUUID(this.c, v, uUID0.toString());
    }

    @Override  // io.realm.internal.u
    public OsList l(long v, RealmFieldType realmFieldType0) {
        return new OsList(this, v);
    }

    @Override  // io.realm.internal.u
    public void m(long v, @h byte[] arr_b) {
        this.b.g();
        this.nativeSetByteArray(this.c, v, arr_b);
    }

    @Override  // io.realm.internal.u
    public Decimal128 n(long v) {
        long[] arr_v = this.nativeGetDecimal128(this.c, v);
        return arr_v == null ? null : Decimal128.fromIEEE754BIDEncoding(arr_v[1], arr_v[0]);
    }

    protected native long nativeCreateEmbeddedObject(long arg1, long arg2) {
    }

    protected native long nativeFreeze(long arg1, long arg2) {
    }

    protected native boolean nativeGetBoolean(long arg1, long arg2) {
    }

    protected native byte[] nativeGetByteArray(long arg1, long arg2) {
    }

    protected native long nativeGetColumnCount(long arg1) {
    }

    protected native long nativeGetColumnKey(long arg1, String arg2) {
    }

    protected native String[] nativeGetColumnNames(long arg1) {
    }

    protected native int nativeGetColumnType(long arg1, long arg2) {
    }

    protected native long[] nativeGetDecimal128(long arg1, long arg2) {
    }

    protected native double nativeGetDouble(long arg1, long arg2) {
    }

    private static native long nativeGetFinalizerPtr() {
    }

    protected native float nativeGetFloat(long arg1, long arg2) {
    }

    protected native long nativeGetLink(long arg1, long arg2) {
    }

    protected native long nativeGetLong(long arg1, long arg2) {
    }

    protected native String nativeGetObjectId(long arg1, long arg2) {
    }

    protected native long nativeGetObjectKey(long arg1) {
    }

    protected native long nativeGetRealmAny(long arg1, long arg2) {
    }

    protected native String nativeGetString(long arg1, long arg2) {
    }

    protected native long nativeGetTimestamp(long arg1, long arg2) {
    }

    protected native String nativeGetUUID(long arg1, long arg2) {
    }

    protected native boolean nativeHasColumn(long arg1, String arg2) {
    }

    protected native boolean nativeIsNull(long arg1, long arg2) {
    }

    protected native boolean nativeIsNullLink(long arg1, long arg2) {
    }

    protected native boolean nativeIsValid(long arg1) {
    }

    protected native void nativeNullifyLink(long arg1, long arg2) {
    }

    protected native void nativeSetBoolean(long arg1, long arg2, boolean arg3) {
    }

    protected native void nativeSetByteArray(long arg1, long arg2, @h byte[] arg3) {
    }

    protected native void nativeSetDecimal128(long arg1, long arg2, long arg3, long arg4) {
    }

    protected native void nativeSetDouble(long arg1, long arg2, double arg3) {
    }

    protected native void nativeSetFloat(long arg1, long arg2, float arg3) {
    }

    protected native void nativeSetLink(long arg1, long arg2, long arg3) {
    }

    protected native void nativeSetLong(long arg1, long arg2, long arg3) {
    }

    protected native void nativeSetNull(long arg1, long arg2) {
    }

    protected native void nativeSetObjectId(long arg1, long arg2, String arg3) {
    }

    protected native void nativeSetRealmAny(long arg1, long arg2, long arg3) {
    }

    protected native void nativeSetString(long arg1, long arg2, String arg3) {
    }

    protected native void nativeSetTimestamp(long arg1, long arg2, long arg3) {
    }

    protected native void nativeSetUUID(long arg1, long arg2, String arg3) {
    }

    public CheckedRow o() {
        return CheckedRow.x(this);
    }

    @Override  // io.realm.internal.u
    public void p(long v, boolean z) {
        this.b.g();
        this.nativeSetBoolean(this.c, v, z);
    }

    static UncheckedRow q(k k0, Table table0, long v) {
        return new UncheckedRow(k0, table0, table0.nativeGetRowPtr(table0.getNativePtr(), v));
    }

    @Override  // io.realm.internal.u
    public OsSet r(long v) {
        return new OsSet(this, v);
    }

    @Override  // io.realm.internal.u
    public boolean s() {
        return this.c != 0L && this.nativeIsValid(this.c);
    }

    static UncheckedRow t(k k0, Table table0, long v) {
        return new UncheckedRow(k0, table0, v);
    }

    @Override  // io.realm.internal.u
    public ObjectId u(long v) {
        return new ObjectId(this.nativeGetObjectId(this.c, v));
    }

    @Override  // io.realm.internal.u
    public long w(long v) {
        return this.nativeGetLong(this.c, v);
    }

    @Override  // io.realm.internal.u
    public OsList y(long v) {
        return new OsList(this, v);
    }

    @Override  // io.realm.internal.u
    public void z(long v, long v1) {
        this.b.g();
        this.nativeSetRealmAny(this.c, v, v1);
    }
}

