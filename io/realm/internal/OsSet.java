package io.realm.internal;

import io.realm.internal.core.NativeRealmAnyCollection;
import io.realm.l1;
import java.util.Date;
import java.util.UUID;
import o3.h;
import org.bson.types.Decimal128;
import org.bson.types.ObjectId;

public class OsSet implements l, o {
    static class a {
        static final int[] a;

        static {
            int[] arr_v = new int[b.values().length];
            a.a = arr_v;
            try {
                arr_v[b.a.ordinal()] = 1;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                a.a[b.b.ordinal()] = 2;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                a.a[b.c.ordinal()] = 3;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                a.a[b.d.ordinal()] = 4;
            }
            catch(NoSuchFieldError unused_ex) {
            }
        }
    }

    public static enum b {
        CONTAINS_ALL,
        ADD_ALL,
        REMOVE_ALL,
        RETAIN_ALL;

    }

    private final long a;
    private final k b;
    private final OsSharedRealm c;
    private final Table d;
    public static final int e = -1;
    private static final int f = 0;
    private static final int g = 1;
    private static final long h;

    static {
        OsSet.h = OsSet.nativeGetFinalizerPtr();
    }

    private OsSet(OsSharedRealm osSharedRealm0, long v, @h Table table0) {
        this.c = osSharedRealm0;
        this.a = v;
        this.b = osSharedRealm0.context;
        this.d = table0;
        osSharedRealm0.context.a(this);
    }

    public OsSet(UncheckedRow uncheckedRow0, long v) {
        OsSharedRealm osSharedRealm0 = uncheckedRow0.b().Q();
        this.c = osSharedRealm0;
        long[] arr_v = OsSet.nativeCreate(osSharedRealm0.getNativePtr(), uncheckedRow0.getNativePtr(), v);
        this.a = arr_v[0];
        this.b = osSharedRealm0.context;
        osSharedRealm0.context.a(this);
        if(arr_v[1] != 0L) {
            this.d = new Table(osSharedRealm0, arr_v[1]);
            return;
        }
        this.d = null;
    }

    public boolean A(@h Decimal128 decimal1280) {
        return decimal1280 == null ? OsSet.nativeContainsNull(this.a) : OsSet.nativeContainsDecimal128(this.a, decimal1280.i(), decimal1280.h());
    }

    // 去混淆评级： 低(30)
    public boolean B(@h ObjectId objectId0) {
        return objectId0 == null ? OsSet.nativeContainsNull(this.a) : OsSet.nativeContainsObjectId(this.a, "68bb29e603ff1b266997b3c4");
    }

    public boolean C(@h byte[] arr_b) {
        return arr_b == null ? OsSet.nativeContainsNull(this.a) : OsSet.nativeContainsBinary(this.a, arr_b);
    }

    public boolean D(OsSet osSet0) {
        return OsSet.nativeContainsAll(this.a, osSet0.getNativePtr());
    }

    public boolean E(long v) {
        return OsSet.nativeContainsRealmAny(this.a, v);
    }

    public boolean F(long v) {
        return OsSet.nativeContainsRow(this.a, v);
    }

    public void G() {
        OsSet.nativeDeleteAll(this.a);
    }

    public OsSet H(OsSharedRealm osSharedRealm0) {
        return new OsSet(osSharedRealm0, OsSet.nativeFreeze(this.a, osSharedRealm0.getNativePtr()), this.d);
    }

    public TableQuery I() {
        long v = OsSet.nativeGetQuery(this.a);
        return new TableQuery(this.b, this.d, v);
    }

    public long J(int v) {
        return OsSet.nativeGetRealmAny(this.a, v);
    }

    public long K(int v) {
        return OsSet.nativeGetRow(this.a, v);
    }

    public Table L() {
        return this.d;
    }

    public Object M(int v) {
        return OsSet.nativeGetValueAtIndex(this.a, v);
    }

    public boolean N(OsSet osSet0) {
        return OsSet.nativeIntersect(this.a, osSet0.getNativePtr());
    }

    public void O(long v, n n0) {
        l1 l10 = new l1(new OsCollectionChangeSet(v, false));
        if(l10.c()) {
            return;
        }
        n0.c(new io.realm.internal.ObservableSet.a(l10));
    }

    public boolean P(@h Boolean boolean0) {
        return (boolean0 == null ? OsSet.nativeRemoveNull(this.a) : OsSet.nativeRemoveBoolean(this.a, boolean0.booleanValue()))[1] == 1L;
    }

    public boolean Q(@h Byte byte0) {
        return (byte0 == null ? OsSet.nativeRemoveNull(this.a) : OsSet.nativeRemoveLong(this.a, byte0.longValue()))[1] == 1L;
    }

    public boolean R(@h Double double0) {
        return (double0 == null ? OsSet.nativeRemoveNull(this.a) : OsSet.nativeRemoveDouble(this.a, ((double)double0)))[1] == 1L;
    }

    public boolean S(@h Float float0) {
        return (float0 == null ? OsSet.nativeRemoveNull(this.a) : OsSet.nativeRemoveFloat(this.a, ((float)float0)))[1] == 1L;
    }

    public boolean T(@h Integer integer0) {
        return (integer0 == null ? OsSet.nativeRemoveNull(this.a) : OsSet.nativeRemoveLong(this.a, integer0.longValue()))[1] == 1L;
    }

    public boolean U(@h Long long0) {
        return (long0 == null ? OsSet.nativeRemoveNull(this.a) : OsSet.nativeRemoveLong(this.a, ((long)long0)))[1] == 1L;
    }

    public boolean V(@h Short short0) {
        return (short0 == null ? OsSet.nativeRemoveNull(this.a) : OsSet.nativeRemoveLong(this.a, short0.longValue()))[1] == 1L;
    }

    public boolean W(@h String s) {
        return (s == null ? OsSet.nativeRemoveNull(this.a) : OsSet.nativeRemoveString(this.a, s))[1] == 1L;
    }

    public boolean X(@h Date date0) {
        if(date0 == null) {
            return OsSet.nativeRemoveNull(this.a)[1] == 1L;
        }
        long v = date0.getTime();
        return OsSet.nativeRemoveDate(this.a, v)[1] == 1L;
    }

    public boolean Y(@h UUID uUID0) {
        return (uUID0 == null ? OsSet.nativeRemoveNull(this.a) : OsSet.nativeRemoveUUID(this.a, uUID0.toString()))[1] == 1L;
    }

    public boolean Z(@h Decimal128 decimal1280) {
        return (decimal1280 == null ? OsSet.nativeRemoveNull(this.a) : OsSet.nativeRemoveDecimal128(this.a, decimal1280.i(), decimal1280.h()))[1] == 1L;
    }

    public boolean a(@h Boolean boolean0) {
        return (boolean0 == null ? OsSet.nativeAddNull(this.a) : OsSet.nativeAddBoolean(this.a, boolean0.booleanValue()))[1] != 0L;
    }

    // 去混淆评级： 低(30)
    public boolean a0(@h ObjectId objectId0) {
        return (objectId0 == null ? OsSet.nativeRemoveNull(this.a) : OsSet.nativeRemoveObjectId(this.a, "68bb29e7e4ecee668c71b425"))[1] == 1L;
    }

    public boolean b(@h Byte byte0) {
        return (byte0 == null ? OsSet.nativeAddNull(this.a) : OsSet.nativeAddLong(this.a, byte0.longValue()))[1] != 0L;
    }

    public boolean b0(@h byte[] arr_b) {
        return (arr_b == null ? OsSet.nativeRemoveNull(this.a) : OsSet.nativeRemoveBinary(this.a, arr_b))[1] == 1L;
    }

    public boolean c(@h Double double0) {
        return (double0 == null ? OsSet.nativeAddNull(this.a) : OsSet.nativeAddDouble(this.a, ((double)double0)))[1] != 0L;
    }

    public boolean c0(long v) {
        return OsSet.nativeRemoveRealmAny(this.a, v)[1] != 0L;
    }

    public boolean d(@h Float float0) {
        return (float0 == null ? OsSet.nativeAddNull(this.a) : OsSet.nativeAddFloat(this.a, ((float)float0)))[1] != 0L;
    }

    public boolean d0(long v) {
        return OsSet.nativeRemoveRow(this.a, v)[1] != 0L;
    }

    public boolean e(@h Integer integer0) {
        return (integer0 == null ? OsSet.nativeAddNull(this.a) : OsSet.nativeAddLong(this.a, integer0.longValue()))[1] != 0L;
    }

    private boolean e0(NativeRealmAnyCollection nativeRealmAnyCollection0) {
        if(this.f0() == 0L) {
            return false;
        }
        if(nativeRealmAnyCollection0.b() == 0) {
            this.q();
            return true;
        }
        return OsSet.nativeRetainAllRealmAnyCollection(this.a, nativeRealmAnyCollection0.getNativePtr());
    }

    public boolean f(@h Long long0) {
        return (long0 == null ? OsSet.nativeAddNull(this.a) : OsSet.nativeAddLong(this.a, ((long)long0)))[1] != 0L;
    }

    public long f0() {
        return OsSet.nativeSize(this.a);
    }

    public boolean g(@h Short short0) {
        return (short0 == null ? OsSet.nativeAddNull(this.a) : OsSet.nativeAddLong(this.a, short0.longValue()))[1] != 0L;
    }

    public void g0(ObservableSet observableSet0) {
        OsSet.nativeStartListening(this.a, observableSet0);
    }

    @Override  // io.realm.internal.l
    public long getNativeFinalizerPtr() {
        return OsSet.h;
    }

    @Override  // io.realm.internal.l
    public long getNativePtr() {
        return this.a;
    }

    public boolean h(@h String s) {
        return (s == null ? OsSet.nativeAddNull(this.a) : OsSet.nativeAddString(this.a, s))[1] != 0L;
    }

    public void h0() {
        OsSet.nativeStopListening(this.a);
    }

    public boolean i(@h Date date0) {
        if(date0 == null) {
            return OsSet.nativeAddNull(this.a)[1] != 0L;
        }
        long v = date0.getTime();
        return OsSet.nativeAddDate(this.a, v)[1] != 0L;
    }

    public boolean i0(OsSet osSet0) {
        return OsSet.nativeUnion(this.a, osSet0.getNativePtr());
    }

    public boolean j(@h UUID uUID0) {
        return (uUID0 == null ? OsSet.nativeAddNull(this.a) : OsSet.nativeAddUUID(this.a, uUID0.toString()))[1] != 0L;
    }

    public boolean k(@h Decimal128 decimal1280) {
        return (decimal1280 == null ? OsSet.nativeAddNull(this.a) : OsSet.nativeAddDecimal128(this.a, decimal1280.i(), decimal1280.h()))[1] != 0L;
    }

    // 去混淆评级： 低(30)
    public boolean l(@h ObjectId objectId0) {
        return (objectId0 == null ? OsSet.nativeAddNull(this.a) : OsSet.nativeAddObjectId(this.a, "68bb29e703f3c47f0800bcae"))[1] != 0L;
    }

    public boolean m(@h byte[] arr_b) {
        return (arr_b == null ? OsSet.nativeAddNull(this.a) : OsSet.nativeAddBinary(this.a, arr_b))[1] != 0L;
    }

    public boolean n(long v) {
        return OsSet.nativeAddRealmAny(this.a, v)[1] != 0L;
    }

    private static native boolean nativeAddAllRealmAnyCollection(long arg0, long arg1) {
    }

    private static native long[] nativeAddBinary(long arg0, byte[] arg1) {
    }

    private static native long[] nativeAddBoolean(long arg0, boolean arg1) {
    }

    private static native long[] nativeAddDate(long arg0, long arg1) {
    }

    private static native long[] nativeAddDecimal128(long arg0, long arg1, long arg2) {
    }

    private static native long[] nativeAddDouble(long arg0, double arg1) {
    }

    private static native long[] nativeAddFloat(long arg0, float arg1) {
    }

    private static native long[] nativeAddLong(long arg0, long arg1) {
    }

    private static native long[] nativeAddNull(long arg0) {
    }

    private static native long[] nativeAddObjectId(long arg0, String arg1) {
    }

    private static native long[] nativeAddRealmAny(long arg0, long arg1) {
    }

    private static native long[] nativeAddRow(long arg0, long arg1) {
    }

    private static native long[] nativeAddString(long arg0, String arg1) {
    }

    private static native long[] nativeAddUUID(long arg0, String arg1) {
    }

    private static native boolean nativeAsymmetricDifference(long arg0, long arg1) {
    }

    private static native void nativeClear(long arg0) {
    }

    private static native boolean nativeContainsAll(long arg0, long arg1) {
    }

    private static native boolean nativeContainsAllRealmAnyCollection(long arg0, long arg1) {
    }

    private static native boolean nativeContainsBinary(long arg0, byte[] arg1) {
    }

    private static native boolean nativeContainsBoolean(long arg0, boolean arg1) {
    }

    private static native boolean nativeContainsDate(long arg0, long arg1) {
    }

    private static native boolean nativeContainsDecimal128(long arg0, long arg1, long arg2) {
    }

    private static native boolean nativeContainsDouble(long arg0, double arg1) {
    }

    private static native boolean nativeContainsFloat(long arg0, float arg1) {
    }

    private static native boolean nativeContainsLong(long arg0, long arg1) {
    }

    private static native boolean nativeContainsNull(long arg0) {
    }

    private static native boolean nativeContainsObjectId(long arg0, String arg1) {
    }

    private static native boolean nativeContainsRealmAny(long arg0, long arg1) {
    }

    private static native boolean nativeContainsRow(long arg0, long arg1) {
    }

    private static native boolean nativeContainsString(long arg0, String arg1) {
    }

    private static native boolean nativeContainsUUID(long arg0, String arg1) {
    }

    private static native long[] nativeCreate(long arg0, long arg1, long arg2) {
    }

    private static native void nativeDeleteAll(long arg0) {
    }

    private static native long nativeFreeze(long arg0, long arg1) {
    }

    private static native long nativeGetFinalizerPtr() {
    }

    private static native long nativeGetQuery(long arg0) {
    }

    private static native long nativeGetRealmAny(long arg0, int arg1) {
    }

    private static native long nativeGetRow(long arg0, int arg1) {
    }

    private static native Object nativeGetValueAtIndex(long arg0, int arg1) {
    }

    private static native boolean nativeIntersect(long arg0, long arg1) {
    }

    private static native boolean nativeIsValid(long arg0) {
    }

    private static native boolean nativeRemoveAllRealmAnyCollection(long arg0, long arg1) {
    }

    private static native long[] nativeRemoveBinary(long arg0, byte[] arg1) {
    }

    private static native long[] nativeRemoveBoolean(long arg0, boolean arg1) {
    }

    private static native long[] nativeRemoveDate(long arg0, long arg1) {
    }

    private static native long[] nativeRemoveDecimal128(long arg0, long arg1, long arg2) {
    }

    private static native long[] nativeRemoveDouble(long arg0, double arg1) {
    }

    private static native long[] nativeRemoveFloat(long arg0, float arg1) {
    }

    private static native long[] nativeRemoveLong(long arg0, long arg1) {
    }

    private static native long[] nativeRemoveNull(long arg0) {
    }

    private static native long[] nativeRemoveObjectId(long arg0, String arg1) {
    }

    private static native long[] nativeRemoveRealmAny(long arg0, long arg1) {
    }

    private static native long[] nativeRemoveRow(long arg0, long arg1) {
    }

    private static native long[] nativeRemoveString(long arg0, String arg1) {
    }

    private static native long[] nativeRemoveUUID(long arg0, String arg1) {
    }

    private static native boolean nativeRetainAllRealmAnyCollection(long arg0, long arg1) {
    }

    private static native long nativeSize(long arg0) {
    }

    private static native void nativeStartListening(long arg0, ObservableSet arg1) {
    }

    private static native void nativeStopListening(long arg0) {
    }

    private static native boolean nativeUnion(long arg0, long arg1) {
    }

    public boolean o(long v) {
        return OsSet.nativeAddRow(this.a, v)[1] != 0L;
    }

    public boolean p(OsSet osSet0) {
        return OsSet.nativeAsymmetricDifference(this.a, osSet0.getNativePtr());
    }

    public void q() {
        OsSet.nativeClear(this.a);
    }

    public boolean r(NativeRealmAnyCollection nativeRealmAnyCollection0, b osSet$b0) {
        switch(osSet$b0) {
            case 1: {
                return OsSet.nativeContainsAllRealmAnyCollection(this.a, nativeRealmAnyCollection0.getNativePtr());
            }
            case 2: {
                return OsSet.nativeAddAllRealmAnyCollection(this.a, nativeRealmAnyCollection0.getNativePtr());
            }
            case 3: {
                return OsSet.nativeRemoveAllRealmAnyCollection(this.a, nativeRealmAnyCollection0.getNativePtr());
            }
            case 4: {
                return this.e0(nativeRealmAnyCollection0);
            }
            default: {
                throw new IllegalStateException("Unexpected value: " + osSet$b0);
            }
        }
    }

    @Override  // io.realm.internal.o
    public boolean s() {
        return OsSet.nativeIsValid(this.a);
    }

    public boolean t(@h Boolean boolean0) {
        return boolean0 == null ? OsSet.nativeContainsNull(this.a) : OsSet.nativeContainsBoolean(this.a, boolean0.booleanValue());
    }

    public boolean u(@h Double double0) {
        return double0 == null ? OsSet.nativeContainsNull(this.a) : OsSet.nativeContainsDouble(this.a, ((double)double0));
    }

    public boolean v(@h Float float0) {
        return float0 == null ? OsSet.nativeContainsNull(this.a) : OsSet.nativeContainsFloat(this.a, ((float)float0));
    }

    public boolean w(@h Long long0) {
        return long0 == null ? OsSet.nativeContainsNull(this.a) : OsSet.nativeContainsLong(this.a, ((long)long0));
    }

    public boolean x(@h String s) {
        return s == null ? OsSet.nativeContainsNull(this.a) : OsSet.nativeContainsString(this.a, s);
    }

    public boolean y(@h Date date0) {
        if(date0 == null) {
            return OsSet.nativeContainsNull(this.a);
        }
        long v = date0.getTime();
        return OsSet.nativeContainsDate(this.a, v);
    }

    public boolean z(@h UUID uUID0) {
        return uUID0 == null ? OsSet.nativeContainsNull(this.a) : OsSet.nativeContainsUUID(this.a, uUID0.toString());
    }
}

