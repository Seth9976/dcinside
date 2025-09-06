package io.realm.internal;

import io.realm.RealmFieldType;
import java.util.Locale;

public class CheckedRow extends UncheckedRow {
    private UncheckedRow e;

    public CheckedRow(UncheckedRow uncheckedRow0) {
        super(uncheckedRow0);
        this.e = uncheckedRow0;
    }

    private CheckedRow(k k0, Table table0, long v) {
        super(k0, table0, v);
    }

    @Override  // io.realm.internal.UncheckedRow
    public OsMap C(long v) {
        if(this.b().I(v) != RealmFieldType.STRING_TO_LINK_MAP) {
            throw new IllegalArgumentException(String.format(Locale.US, "Field \'%s\' is not a \'RealmDictionary\'.", this.b().G(v)));
        }
        return super.I(v);
    }

    @Override  // io.realm.internal.UncheckedRow
    public boolean D(long v) {
        RealmFieldType realmFieldType0 = this.E(v);
        return realmFieldType0 == RealmFieldType.OBJECT || realmFieldType0 == RealmFieldType.LIST ? super.D(v) : false;
    }

    @Override  // io.realm.internal.UncheckedRow
    public OsMap I(long v) {
        if(this.b().I(v) != RealmFieldType.STRING_TO_MIXED_MAP) {
            throw new IllegalArgumentException(String.format(Locale.US, "Field \'%s\' is not a \'RealmDictionary\'.", this.b().G(v)));
        }
        return super.I(v);
    }

    @Override  // io.realm.internal.UncheckedRow
    public void K(long v) {
        if(this.E(v) == RealmFieldType.BINARY) {
            super.m(v, null);
            return;
        }
        super.K(v);
    }

    @Override  // io.realm.internal.UncheckedRow
    public OsSet O(long v) {
        return super.r(v);
    }

    @Override  // io.realm.internal.UncheckedRow
    public OsMap V(long v, RealmFieldType realmFieldType0) {
        if(realmFieldType0 != this.b().I(v)) {
            throw new IllegalArgumentException(String.format(Locale.US, "The type of field \'%1$s\' is not \'RealmFieldType.%2$s\'.", this.b().G(v), realmFieldType0.name()));
        }
        return super.V(v, realmFieldType0);
    }

    @Override  // io.realm.internal.UncheckedRow
    public u X(OsSharedRealm osSharedRealm0) {
        if(!this.s()) {
            return i.a;
        }
        Table table0 = this.b.y(osSharedRealm0);
        long v = this.nativeFreeze(this.getNativePtr(), osSharedRealm0.getNativePtr());
        return new CheckedRow(this.a, table0, v);
    }

    @Override  // io.realm.internal.UncheckedRow
    public boolean f(long v) {
        return super.f(v);
    }

    @Override  // io.realm.internal.UncheckedRow
    public OsSet g(long v, RealmFieldType realmFieldType0) {
        if(realmFieldType0 != this.b().I(v)) {
            throw new IllegalArgumentException(String.format(Locale.US, "The type of field \'%1$s\' is not \'RealmFieldType.%2$s\'.", this.b().G(v), realmFieldType0.name()));
        }
        return super.g(v, realmFieldType0);
    }

    @Override  // io.realm.internal.UncheckedRow
    public OsList l(long v, RealmFieldType realmFieldType0) {
        if(realmFieldType0 != this.b().I(v)) {
            throw new IllegalArgumentException(String.format(Locale.US, "The type of field \'%1$s\' is not \'RealmFieldType.%2$s\'.", this.b().G(v), realmFieldType0.name()));
        }
        return super.l(v, realmFieldType0);
    }

    @Override  // io.realm.internal.UncheckedRow
    protected native boolean nativeGetBoolean(long arg1, long arg2) {
    }

    @Override  // io.realm.internal.UncheckedRow
    protected native byte[] nativeGetByteArray(long arg1, long arg2) {
    }

    @Override  // io.realm.internal.UncheckedRow
    protected native long nativeGetColumnCount(long arg1) {
    }

    @Override  // io.realm.internal.UncheckedRow
    protected native long nativeGetColumnKey(long arg1, String arg2) {
    }

    @Override  // io.realm.internal.UncheckedRow
    protected native int nativeGetColumnType(long arg1, long arg2) {
    }

    @Override  // io.realm.internal.UncheckedRow
    protected native long[] nativeGetDecimal128(long arg1, long arg2) {
    }

    @Override  // io.realm.internal.UncheckedRow
    protected native double nativeGetDouble(long arg1, long arg2) {
    }

    @Override  // io.realm.internal.UncheckedRow
    protected native float nativeGetFloat(long arg1, long arg2) {
    }

    @Override  // io.realm.internal.UncheckedRow
    protected native long nativeGetLink(long arg1, long arg2) {
    }

    @Override  // io.realm.internal.UncheckedRow
    protected native long nativeGetLong(long arg1, long arg2) {
    }

    @Override  // io.realm.internal.UncheckedRow
    protected native String nativeGetObjectId(long arg1, long arg2) {
    }

    @Override  // io.realm.internal.UncheckedRow
    protected native String nativeGetString(long arg1, long arg2) {
    }

    @Override  // io.realm.internal.UncheckedRow
    protected native long nativeGetTimestamp(long arg1, long arg2) {
    }

    @Override  // io.realm.internal.UncheckedRow
    protected native boolean nativeIsNullLink(long arg1, long arg2) {
    }

    @Override  // io.realm.internal.UncheckedRow
    protected native void nativeNullifyLink(long arg1, long arg2) {
    }

    @Override  // io.realm.internal.UncheckedRow
    protected native void nativeSetBoolean(long arg1, long arg2, boolean arg3) {
    }

    @Override  // io.realm.internal.UncheckedRow
    protected native void nativeSetByteArray(long arg1, long arg2, byte[] arg3) {
    }

    @Override  // io.realm.internal.UncheckedRow
    protected native void nativeSetDecimal128(long arg1, long arg2, long arg3, long arg4) {
    }

    @Override  // io.realm.internal.UncheckedRow
    protected native void nativeSetDouble(long arg1, long arg2, double arg3) {
    }

    @Override  // io.realm.internal.UncheckedRow
    protected native void nativeSetFloat(long arg1, long arg2, float arg3) {
    }

    @Override  // io.realm.internal.UncheckedRow
    protected native void nativeSetLink(long arg1, long arg2, long arg3) {
    }

    @Override  // io.realm.internal.UncheckedRow
    protected native void nativeSetLong(long arg1, long arg2, long arg3) {
    }

    @Override  // io.realm.internal.UncheckedRow
    protected native void nativeSetObjectId(long arg1, long arg2, String arg3) {
    }

    @Override  // io.realm.internal.UncheckedRow
    protected native void nativeSetString(long arg1, long arg2, String arg3) {
    }

    @Override  // io.realm.internal.UncheckedRow
    protected native void nativeSetTimestamp(long arg1, long arg2, long arg3) {
    }

    @Override  // io.realm.internal.UncheckedRow
    public OsSet r(long v) {
        return super.r(v);
    }

    public static CheckedRow v(k k0, Table table0, long v) {
        return new CheckedRow(k0, table0, table0.nativeGetRowPtr(table0.getNativePtr(), v));
    }

    public static CheckedRow x(UncheckedRow uncheckedRow0) {
        return new CheckedRow(uncheckedRow0);
    }

    @Override  // io.realm.internal.UncheckedRow
    public OsList y(long v) {
        if(this.b().I(v) != RealmFieldType.LIST) {
            throw new IllegalArgumentException(String.format(Locale.US, "Field \'%s\' is not a \'RealmList\'.", this.b().G(v)));
        }
        return super.y(v);
    }
}

