package io.realm.internal;

import io.realm.RealmFieldType;
import io.realm.exceptions.RealmPrimaryKeyConstraintException;
import java.util.Date;
import java.util.UUID;
import o3.h;
import org.bson.types.Decimal128;
import org.bson.types.ObjectId;

public class Table implements l {
    static class a {
        static final int[] a;

        static {
            int[] arr_v = new int[RealmFieldType.values().length];
            a.a = arr_v;
            try {
                arr_v[RealmFieldType.INTEGER.ordinal()] = 1;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                a.a[RealmFieldType.BOOLEAN.ordinal()] = 2;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                a.a[RealmFieldType.STRING.ordinal()] = 3;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                a.a[RealmFieldType.BINARY.ordinal()] = 4;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                a.a[RealmFieldType.DATE.ordinal()] = 5;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                a.a[RealmFieldType.FLOAT.ordinal()] = 6;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                a.a[RealmFieldType.DOUBLE.ordinal()] = 7;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                a.a[RealmFieldType.DECIMAL128.ordinal()] = 8;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                a.a[RealmFieldType.OBJECT_ID.ordinal()] = 9;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                a.a[RealmFieldType.MIXED.ordinal()] = 10;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                a.a[RealmFieldType.UUID.ordinal()] = 11;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                a.a[RealmFieldType.INTEGER_LIST.ordinal()] = 12;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                a.a[RealmFieldType.BOOLEAN_LIST.ordinal()] = 13;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                a.a[RealmFieldType.STRING_LIST.ordinal()] = 14;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                a.a[RealmFieldType.BINARY_LIST.ordinal()] = 15;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                a.a[RealmFieldType.DATE_LIST.ordinal()] = 16;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                a.a[RealmFieldType.FLOAT_LIST.ordinal()] = 17;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                a.a[RealmFieldType.DOUBLE_LIST.ordinal()] = 18;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                a.a[RealmFieldType.DECIMAL128_LIST.ordinal()] = 19;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                a.a[RealmFieldType.OBJECT_ID_LIST.ordinal()] = 20;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                a.a[RealmFieldType.UUID_LIST.ordinal()] = 21;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                a.a[RealmFieldType.MIXED_LIST.ordinal()] = 22;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                a.a[RealmFieldType.STRING_TO_INTEGER_MAP.ordinal()] = 23;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                a.a[RealmFieldType.STRING_TO_BOOLEAN_MAP.ordinal()] = 24;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                a.a[RealmFieldType.STRING_TO_STRING_MAP.ordinal()] = 25;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                a.a[RealmFieldType.STRING_TO_BINARY_MAP.ordinal()] = 26;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                a.a[RealmFieldType.STRING_TO_DATE_MAP.ordinal()] = 27;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                a.a[RealmFieldType.STRING_TO_FLOAT_MAP.ordinal()] = 28;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                a.a[RealmFieldType.STRING_TO_DOUBLE_MAP.ordinal()] = 29;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                a.a[RealmFieldType.STRING_TO_DECIMAL128_MAP.ordinal()] = 30;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                a.a[RealmFieldType.STRING_TO_OBJECT_ID_MAP.ordinal()] = 0x1F;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                a.a[RealmFieldType.STRING_TO_UUID_MAP.ordinal()] = 0x20;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                a.a[RealmFieldType.STRING_TO_MIXED_MAP.ordinal()] = 33;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                a.a[RealmFieldType.INTEGER_SET.ordinal()] = 34;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                a.a[RealmFieldType.BOOLEAN_SET.ordinal()] = 35;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                a.a[RealmFieldType.STRING_SET.ordinal()] = 36;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                a.a[RealmFieldType.BINARY_SET.ordinal()] = 37;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                a.a[RealmFieldType.DATE_SET.ordinal()] = 38;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                a.a[RealmFieldType.FLOAT_SET.ordinal()] = 39;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                a.a[RealmFieldType.DOUBLE_SET.ordinal()] = 40;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                a.a[RealmFieldType.DECIMAL128_SET.ordinal()] = 41;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                a.a[RealmFieldType.OBJECT_ID_SET.ordinal()] = 42;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                a.a[RealmFieldType.UUID_SET.ordinal()] = 43;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                a.a[RealmFieldType.MIXED_SET.ordinal()] = 44;
            }
            catch(NoSuchFieldError unused_ex) {
            }
        }
    }

    private final long a;
    private final k b;
    private final OsSharedRealm c;
    private static final String d = null;
    private static final int e = 0x3F;
    public static final int f = 0;
    public static final long g = -1L;
    public static final boolean h = true;
    public static final boolean i = false;
    public static final int j = -1;
    public static final int k = 0xFFFFF0;
    public static final int l = 0xFFFFEF;
    private static final long m;

    static {
        String s = Util.j();
        Table.d = s;
        Table.f = 0x3F - s.length();
        Table.m = Table.nativeGetFinalizerPtr();
    }

    Table(OsSharedRealm osSharedRealm0, long v) {
        this.b = osSharedRealm0.context;
        this.c = osSharedRealm0;
        this.a = v;
        osSharedRealm0.context.a(this);
    }

    public boolean A(long v, long v1) {
        return this.nativeGetBoolean(this.a, v, v1);
    }

    public long A0() {
        return this.nativeSize(this.a);
    }

    public CheckedRow B(long v) {
        return CheckedRow.v(this.b, this, v);
    }

    public static void B0(Object object0) {
        throw new RealmPrimaryKeyConstraintException("Value already exists: " + object0);
    }

    public String C() {
        String s = Table.D(this.P());
        if(Util.l(s)) {
            throw new IllegalStateException("This object class is no longer part of the schema for the Realm file. It is therefor not possible to access the schema name.");
        }
        return s;
    }

    private static void C0() {
        throw new IllegalStateException("Cannot modify managed objects outside of a write transaction.");
    }

    @h
    public static String D(@h String s) {
        if(s == null) {
            return null;
        }
        return s.startsWith(Table.d) ? s.substring(Table.d.length()) : s;
    }

    private void D0(String s) {
        if(s.length() > 0x3F) {
            throw new IllegalArgumentException("Column names are currently limited to max 63 characters.");
        }
    }

    public long E() {
        return this.nativeGetColumnCount(this.a);
    }

    public TableQuery E0() {
        long v = this.nativeWhere(this.a);
        return new TableQuery(this.b, this, v);
    }

    public long F(String s) {
        if(s == null) {
            throw new IllegalArgumentException("Column name can not be null.");
        }
        return this.nativeGetColumnKey(this.a, s);
    }

    public String G(long v) {
        return this.nativeGetColumnName(this.a, v);
    }

    public String[] H() {
        return this.nativeGetColumnNames(this.a);
    }

    public RealmFieldType I(long v) {
        return RealmFieldType.fromNativeValue(this.nativeGetColumnType(this.a, v));
    }

    public Date J(long v, long v1) {
        return new Date(this.nativeGetTimestamp(this.a, v, v1));
    }

    public double K(long v, long v1) {
        return this.nativeGetDouble(this.a, v, v1);
    }

    public float L(long v, long v1) {
        return this.nativeGetFloat(this.a, v, v1);
    }

    public long M(long v, long v1) {
        return this.nativeGetLink(this.a, v, v1);
    }

    public Table N(long v) {
        long v1 = this.nativeGetLinkTarget(this.a, v);
        return new Table(this.c, v1);
    }

    public long O(long v, long v1) {
        return this.nativeGetLong(this.a, v, v1);
    }

    @h
    public String P() {
        return this.nativeGetName(this.a);
    }

    public OsSharedRealm Q() {
        return this.c;
    }

    public String R(long v, long v1) {
        return this.nativeGetString(this.a, v, v1);
    }

    public Table S() {
        return this;
    }

    public static String T(String s) {
        return s == null ? null : Table.d + s;
    }

    public UncheckedRow U(long v) {
        return UncheckedRow.q(this.b, this, v);
    }

    public UncheckedRow V(long v) {
        return UncheckedRow.t(this.b, this, v);
    }

    public boolean W(Table table0) {
        if(table0 == null) {
            throw new IllegalArgumentException("The argument cannot be null");
        }
        return this.nativeHasSameSchema(this.a, table0.a);
    }

    public boolean X(long v) {
        return this.nativeHasSearchIndex(this.a, v);
    }

    public void Y(long v, long v1, long v2) {
        this.g();
        Table.nativeIncrementLong(this.a, v, v1, v2);
    }

    public boolean Z(long v) {
        return this.nativeIsColumnNullable(this.a, v);
    }

    public long a(RealmFieldType realmFieldType0, String s) {
        return this.b(realmFieldType0, s, false);
    }

    public boolean a0() {
        return Table.nativeIsEmbedded(this.a);
    }

    public long b(RealmFieldType realmFieldType0, String s, boolean z) {
        this.D0(s);
        switch(realmFieldType0) {
            case 1: 
            case 2: 
            case 3: 
            case 4: 
            case 5: 
            case 6: 
            case 7: 
            case 8: 
            case 9: 
            case 10: 
            case 11: {
                return this.nativeAddColumn(this.a, realmFieldType0.getNativeValue(), s, z);
            }
            case 12: 
            case 13: 
            case 14: 
            case 15: 
            case 16: 
            case 17: 
            case 18: 
            case 19: 
            case 20: 
            case 21: 
            case 22: {
                return this.nativeAddPrimitiveListColumn(this.a, realmFieldType0.getNativeValue() - 0x80, s, z);
            }
            case 23: 
            case 24: 
            case 25: 
            case 26: 
            case 27: 
            case 28: 
            case 29: 
            case 30: 
            case 0x1F: 
            case 0x20: 
            case 33: {
                return this.nativeAddPrimitiveDictionaryColumn(this.a, realmFieldType0.getNativeValue() - 0x200, s, z);
            }
            case 34: 
            case 35: 
            case 36: 
            case 37: 
            case 38: 
            case 39: 
            case 40: 
            case 41: 
            case 42: 
            case 43: 
            case 44: {
                return this.nativeAddPrimitiveSetColumn(this.a, realmFieldType0.getNativeValue() - 0x100, s, z);
            }
            default: {
                throw new IllegalArgumentException("Unsupported type: " + realmFieldType0);
            }
        }
    }

    public boolean b0() {
        return this.A0() == 0L;
    }

    public long c(RealmFieldType realmFieldType0, String s, Table table0) {
        this.D0(s);
        return this.nativeAddColumnDictionaryLink(this.a, realmFieldType0.getNativeValue(), s, table0.a);
    }

    boolean c0() {
        return this.c != null && !this.c.isInTransaction();
    }

    public long d(RealmFieldType realmFieldType0, String s, Table table0) {
        this.D0(s);
        return this.nativeAddColumnLink(this.a, realmFieldType0.getNativeValue(), s, table0.a);
    }

    public boolean d0(long v, long v1) {
        return this.nativeIsNullLink(this.a, v, v1);
    }

    public long e(RealmFieldType realmFieldType0, String s, Table table0) {
        this.D0(s);
        return this.nativeAddColumnSetLink(this.a, realmFieldType0.getNativeValue(), s, table0.a);
    }

    private boolean e0(long v) {
        String s = this.G(v);
        String s1 = this.C();
        return s.equals(OsObjectStore.c(this.c, s1));
    }

    public void f(long v) {
        this.g();
        this.nativeAddSearchIndex(this.a, v);
    }

    public boolean f0() {
        return this.a != 0L && this.nativeIsValid(this.a);
    }

    void g() {
        if(this.c0()) {
            Table.C0();
        }
    }

    public void g0(long v) {
        this.g();
        this.nativeMoveLastOver(this.a, v);
    }

    @Override  // io.realm.internal.l
    public long getNativeFinalizerPtr() {
        return Table.m;
    }

    @Override  // io.realm.internal.l
    public long getNativePtr() {
        return this.a;
    }

    public void h() {
        this.g();
        this.nativeClear(this.a);
    }

    public void h0(long v, long v1) {
        Table.nativeNullifyLink(this.a, v, v1);
    }

    public void i(long v) {
        if(this.c.isSyncRealm()) {
            throw new IllegalStateException("This method is only available for non-synchronized Realms");
        }
        boolean z = this.e0(v);
        this.nativeConvertColumnToNotNullable(this.a, v, z);
    }

    public void i0(long v) {
        String s = this.C();
        String s1 = this.G(v);
        String s2 = this.C();
        String s3 = OsObjectStore.c(this.c, s2);
        this.nativeRemoveColumn(this.a, v);
        if(s1.equals(s3)) {
            OsObjectStore.e(this.c, s, null);
        }
    }

    public void j(long v) {
        if(this.c.isSyncRealm()) {
            throw new IllegalStateException("This method is only available for non-synchronized Realms");
        }
        boolean z = this.e0(v);
        this.nativeConvertColumnToNullable(this.a, v, z);
    }

    public void j0(long v) {
        this.g();
        this.nativeRemoveSearchIndex(this.a, v);
    }

    public long k(long v, double f) {
        return this.nativeCountDouble(this.a, v, f);
    }

    public void k0(long v, String s) {
        this.D0(s);
        String s1 = this.nativeGetColumnName(this.a, v);
        String s2 = this.C();
        String s3 = OsObjectStore.c(this.c, s2);
        this.nativeRenameColumn(this.a, v, s);
        if(s1.equals(s3)) {
            try {
                String s4 = this.C();
                OsObjectStore.e(this.c, s4, s);
            }
            catch(Exception exception0) {
                this.nativeRenameColumn(this.a, v, s1);
                throw new RuntimeException(exception0);
            }
        }
    }

    public long l(long v, float f) {
        return this.nativeCountFloat(this.a, v, f);
    }

    public void l0(long v, long v1, byte[] arr_b, boolean z) {
        this.g();
        Table.nativeSetByteArray(this.a, v, v1, arr_b, z);
    }

    public long m(long v, long v1) {
        return this.nativeCountLong(this.a, v, v1);
    }

    public void m0(long v, long v1, boolean z, boolean z1) {
        this.g();
        Table.nativeSetBoolean(this.a, v, v1, z, z1);
    }

    public long n(long v, String s) {
        return this.nativeCountString(this.a, v, s);
    }

    public void n0(long v, long v1, Date date0, boolean z) {
        if(date0 == null) {
            throw new IllegalArgumentException("Null Date is not allowed.");
        }
        this.g();
        long v2 = date0.getTime();
        Table.nativeSetTimestamp(this.a, v, v1, v2, z);
    }

    private native long nativeAddColumn(long arg1, int arg2, String arg3, boolean arg4) {
    }

    private native long nativeAddColumnDictionaryLink(long arg1, int arg2, String arg3, long arg4) {
    }

    private native long nativeAddColumnLink(long arg1, int arg2, String arg3, long arg4) {
    }

    private native long nativeAddColumnSetLink(long arg1, int arg2, String arg3, long arg4) {
    }

    private native long nativeAddPrimitiveDictionaryColumn(long arg1, int arg2, String arg3, boolean arg4) {
    }

    private native long nativeAddPrimitiveListColumn(long arg1, int arg2, String arg3, boolean arg4) {
    }

    private native long nativeAddPrimitiveSetColumn(long arg1, int arg2, String arg3, boolean arg4) {
    }

    private native void nativeAddSearchIndex(long arg1, long arg2) {
    }

    private native void nativeClear(long arg1) {
    }

    private native void nativeConvertColumnToNotNullable(long arg1, long arg2, boolean arg3) {
    }

    private native void nativeConvertColumnToNullable(long arg1, long arg2, boolean arg3) {
    }

    private native long nativeCountDouble(long arg1, long arg2, double arg3) {
    }

    private native long nativeCountFloat(long arg1, long arg2, float arg3) {
    }

    private native long nativeCountLong(long arg1, long arg2, long arg3) {
    }

    private native long nativeCountString(long arg1, long arg2, String arg3) {
    }

    private native long nativeFindFirstBool(long arg1, long arg2, boolean arg3) {
    }

    public static native long nativeFindFirstDecimal128(long arg0, long arg1, long arg2, long arg3) {
    }

    private native long nativeFindFirstDouble(long arg1, long arg2, double arg3) {
    }

    private native long nativeFindFirstFloat(long arg1, long arg2, float arg3) {
    }

    public static native long nativeFindFirstInt(long arg0, long arg1, long arg2) {
    }

    public static native long nativeFindFirstNull(long arg0, long arg1) {
    }

    public static native long nativeFindFirstObjectId(long arg0, long arg1, String arg2) {
    }

    public static native long nativeFindFirstString(long arg0, long arg1, String arg2) {
    }

    private native long nativeFindFirstTimestamp(long arg1, long arg2, long arg3) {
    }

    public static native long nativeFindFirstUUID(long arg0, long arg1, String arg2) {
    }

    private static native long nativeFreeze(long arg0, long arg1) {
    }

    private native boolean nativeGetBoolean(long arg1, long arg2, long arg3) {
    }

    private native byte[] nativeGetByteArray(long arg1, long arg2, long arg3) {
    }

    private native long nativeGetColumnCount(long arg1) {
    }

    private native long nativeGetColumnKey(long arg1, String arg2) {
    }

    private native String nativeGetColumnName(long arg1, long arg2) {
    }

    private native String[] nativeGetColumnNames(long arg1) {
    }

    private native int nativeGetColumnType(long arg1, long arg2) {
    }

    private native long[] nativeGetDecimal128(long arg1, long arg2, long arg3) {
    }

    private native double nativeGetDouble(long arg1, long arg2, long arg3) {
    }

    private static native long nativeGetFinalizerPtr() {
    }

    private native float nativeGetFloat(long arg1, long arg2, long arg3) {
    }

    private native long nativeGetLink(long arg1, long arg2, long arg3) {
    }

    private native long nativeGetLinkTarget(long arg1, long arg2) {
    }

    private native long nativeGetLong(long arg1, long arg2, long arg3) {
    }

    private native String nativeGetName(long arg1) {
    }

    private native String nativeGetObjectId(long arg1, long arg2, long arg3) {
    }

    native long nativeGetRowPtr(long arg1, long arg2) {
    }

    private native String nativeGetString(long arg1, long arg2, long arg3) {
    }

    private native long nativeGetTimestamp(long arg1, long arg2, long arg3) {
    }

    private native boolean nativeHasSameSchema(long arg1, long arg2) {
    }

    private native boolean nativeHasSearchIndex(long arg1, long arg2) {
    }

    public static native void nativeIncrementLong(long arg0, long arg1, long arg2, long arg3) {
    }

    private native boolean nativeIsColumnNullable(long arg1, long arg2) {
    }

    private static native boolean nativeIsEmbedded(long arg0) {
    }

    private native boolean nativeIsNull(long arg1, long arg2, long arg3) {
    }

    private native boolean nativeIsNullLink(long arg1, long arg2, long arg3) {
    }

    private native boolean nativeIsValid(long arg1) {
    }

    private native void nativeMoveLastOver(long arg1, long arg2) {
    }

    public static native void nativeNullifyLink(long arg0, long arg1, long arg2) {
    }

    private native void nativeRemoveColumn(long arg1, long arg2) {
    }

    private native void nativeRemoveSearchIndex(long arg1, long arg2) {
    }

    private native void nativeRenameColumn(long arg1, long arg2, String arg3) {
    }

    public static native void nativeSetBoolean(long arg0, long arg1, long arg2, boolean arg3, boolean arg4) {
    }

    public static native void nativeSetByteArray(long arg0, long arg1, long arg2, byte[] arg3, boolean arg4) {
    }

    public static native void nativeSetDecimal128(long arg0, long arg1, long arg2, long arg3, long arg4, boolean arg5) {
    }

    public static native void nativeSetDouble(long arg0, long arg1, long arg2, double arg3, boolean arg4) {
    }

    private static native boolean nativeSetEmbedded(long arg0, boolean arg1, boolean arg2) {
    }

    public static native void nativeSetFloat(long arg0, long arg1, long arg2, float arg3, boolean arg4) {
    }

    public static native void nativeSetLink(long arg0, long arg1, long arg2, long arg3, boolean arg4) {
    }

    public static native void nativeSetLong(long arg0, long arg1, long arg2, long arg3, boolean arg4) {
    }

    public static native void nativeSetNull(long arg0, long arg1, long arg2, boolean arg3) {
    }

    public static native void nativeSetObjectId(long arg0, long arg1, long arg2, String arg3, boolean arg4) {
    }

    public static native void nativeSetRealmAny(long arg0, long arg1, long arg2, long arg3, boolean arg4) {
    }

    public static native void nativeSetString(long arg0, long arg1, long arg2, String arg3, boolean arg4) {
    }

    public static native void nativeSetTimestamp(long arg0, long arg1, long arg2, long arg3, boolean arg4) {
    }

    public static native void nativeSetUUID(long arg0, long arg1, long arg2, String arg3, boolean arg4) {
    }

    private native long nativeSize(long arg1) {
    }

    private native long nativeWhere(long arg1) {
    }

    public long o(long v, boolean z) {
        return this.nativeFindFirstBool(this.a, v, z);
    }

    public void o0(long v, long v1, @h Decimal128 decimal1280, boolean z) {
        this.g();
        if(decimal1280 == null) {
            Table.nativeSetNull(this.a, v, v1, z);
            return;
        }
        Table.nativeSetDecimal128(this.a, v, v1, decimal1280.i(), decimal1280.h(), z);
    }

    public long p(long v, Date date0) {
        if(date0 == null) {
            throw new IllegalArgumentException("null is not supported");
        }
        long v1 = date0.getTime();
        return this.nativeFindFirstTimestamp(this.a, v, v1);
    }

    public void p0(long v, long v1, double f, boolean z) {
        this.g();
        Table.nativeSetDouble(this.a, v, v1, f, z);
    }

    public long q(long v, Decimal128 decimal1280) {
        if(decimal1280 == null) {
            throw new IllegalArgumentException("null is not supported");
        }
        return Table.nativeFindFirstDecimal128(this.a, v, decimal1280.i(), decimal1280.h());
    }

    public boolean q0(boolean z) {
        return this.r0(z, false);
    }

    public long r(long v, double f) {
        return this.nativeFindFirstDouble(this.a, v, f);
    }

    public boolean r0(boolean z, boolean z1) {
        return Table.nativeSetEmbedded(this.a, z, z1);
    }

    public long s(long v, float f) {
        return this.nativeFindFirstFloat(this.a, v, f);
    }

    public void s0(long v, long v1, float f, boolean z) {
        this.g();
        Table.nativeSetFloat(this.a, v, v1, f, z);
    }

    public long t(long v, long v1) {
        return Table.nativeFindFirstInt(this.a, v, v1);
    }

    public void t0(long v, long v1, long v2, boolean z) {
        this.g();
        Table.nativeSetLink(this.a, v, v1, v2, z);
    }

    @Override
    public String toString() {
        long v = this.E();
        String s = this.P();
        StringBuilder stringBuilder0 = new StringBuilder("The Table ");
        if(s != null && !s.isEmpty()) {
            stringBuilder0.append(this.P());
            stringBuilder0.append(" ");
        }
        stringBuilder0.append("contains ");
        stringBuilder0.append(v);
        stringBuilder0.append(" columns: ");
        String[] arr_s = this.H();
        int v1 = 0;
        for(boolean z = true; v1 < arr_s.length; z = false) {
            String s1 = arr_s[v1];
            if(!z) {
                stringBuilder0.append(", ");
            }
            stringBuilder0.append(s1);
            ++v1;
        }
        stringBuilder0.append(".");
        stringBuilder0.append(" And ");
        stringBuilder0.append(this.A0());
        stringBuilder0.append(" rows.");
        return stringBuilder0.toString();
    }

    public long u(long v) {
        return Table.nativeFindFirstNull(this.a, v);
    }

    public void u0(long v, long v1, long v2, boolean z) {
        this.g();
        Table.nativeSetLong(this.a, v, v1, v2, z);
    }

    public long v(long v, ObjectId objectId0) {
        if(objectId0 == null) {
            throw new IllegalArgumentException("null is not supported");
        }
        return Table.nativeFindFirstObjectId(this.a, v, "68bb29f46b265c0056f84c66");
    }

    public void v0(long v, long v1, boolean z) {
        this.g();
        Table.nativeSetNull(this.a, v, v1, z);
    }

    public long w(long v, String s) {
        if(s == null) {
            throw new IllegalArgumentException("null is not supported");
        }
        return Table.nativeFindFirstString(this.a, v, s);
    }

    public void w0(long v, long v1, @h ObjectId objectId0, boolean z) {
        this.g();
        if(objectId0 == null) {
            Table.nativeSetNull(this.a, v, v1, z);
            return;
        }
        Table.nativeSetObjectId(this.a, v, v1, "68bb2a0052830e23ef18961a", z);
    }

    public long x(long v, UUID uUID0) {
        if(uUID0 == null) {
            throw new IllegalArgumentException("null is not supported");
        }
        return Table.nativeFindFirstUUID(this.a, v, uUID0.toString());
    }

    public void x0(long v, long v1, long v2, boolean z) {
        this.g();
        Table.nativeSetRealmAny(this.a, v, v1, v2, z);
    }

    public Table y(OsSharedRealm osSharedRealm0) {
        if(!osSharedRealm0.isFrozen()) {
            throw new IllegalArgumentException("Frozen Realm required");
        }
        return new Table(osSharedRealm0, Table.nativeFreeze(osSharedRealm0.getNativePtr(), this.a));
    }

    public void y0(long v, long v1, @h String s, boolean z) {
        this.g();
        if(s == null) {
            Table.nativeSetNull(this.a, v, v1, z);
            return;
        }
        Table.nativeSetString(this.a, v, v1, s, z);
    }

    public byte[] z(long v, long v1) {
        return this.nativeGetByteArray(this.a, v, v1);
    }

    public void z0(long v, long v1, @h UUID uUID0, boolean z) {
        this.g();
        if(uUID0 == null) {
            Table.nativeSetNull(this.a, v, v1, z);
            return;
        }
        Table.nativeSetUUID(this.a, v, v1, uUID0.toString(), z);
    }
}

