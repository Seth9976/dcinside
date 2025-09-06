package io.realm.internal;

import io.realm.internal.android.d;
import io.realm.internal.core.NativeRealmAny;
import java.util.Date;
import java.util.UUID;
import k3.a;
import o3.h;
import org.bson.types.Decimal128;
import org.bson.types.ObjectId;

public class OsMap implements l {
    private final long a;
    private final k b;
    private final Table c;
    public static final int d = -1;
    private static final long e;

    static {
        OsMap.e = OsMap.nativeGetFinalizerPtr();
    }

    private OsMap(OsSharedRealm osSharedRealm0, long v, Table table0) {
        this.a = v;
        this.c = table0;
        this.b = osSharedRealm0.context;
        osSharedRealm0.context.a(this);
    }

    public OsMap(UncheckedRow uncheckedRow0, long v) {
        OsSharedRealm osSharedRealm0 = uncheckedRow0.b().Q();
        long[] arr_v = OsMap.nativeCreate(osSharedRealm0.getNativePtr(), uncheckedRow0.getNativePtr(), v);
        this.a = arr_v[0];
        this.c = arr_v[1] == -1L ? null : new Table(osSharedRealm0, arr_v[1]);
        this.b = osSharedRealm0.context;
        osSharedRealm0.context.a(this);
    }

    public void a() {
        OsMap.nativeClear(this.a);
    }

    public boolean b(Object object0) {
        return OsMap.nativeContainsKey(this.a, ((String)object0));
    }

    public boolean c(@h Object object0) {
        if(object0 == null) {
            return OsMap.nativeContainsNull(this.a);
        }
        if(object0 instanceof Integer) {
            return OsMap.nativeContainsLong(this.a, ((Integer)object0).longValue());
        }
        if(object0 instanceof Long) {
            return OsMap.nativeContainsLong(this.a, ((long)(((Long)object0))));
        }
        if(object0 instanceof Double) {
            return OsMap.nativeContainsDouble(this.a, ((double)(((Double)object0))));
        }
        if(object0 instanceof Short) {
            return OsMap.nativeContainsLong(this.a, ((Short)object0).longValue());
        }
        if(object0 instanceof Byte) {
            return OsMap.nativeContainsLong(this.a, ((Byte)object0).longValue());
        }
        if(object0 instanceof Boolean) {
            return OsMap.nativeContainsBoolean(this.a, ((Boolean)object0).booleanValue());
        }
        if(object0 instanceof String) {
            return OsMap.nativeContainsString(this.a, ((String)object0));
        }
        if(object0 instanceof Byte[]) {
            byte[] arr_b = d.a(((Byte[])object0));
            return OsMap.nativeContainsBinary(this.a, arr_b);
        }
        if(object0 instanceof byte[]) {
            return OsMap.nativeContainsBinary(this.a, ((byte[])object0));
        }
        if(object0 instanceof Float) {
            return OsMap.nativeContainsFloat(this.a, ((float)(((Float)object0))));
        }
        if(object0 instanceof UUID) {
            return OsMap.nativeContainsUUID(this.a, object0.toString());
        }
        if(object0 instanceof ObjectId) {
            return OsMap.nativeContainsObjectId(this.a, ((ObjectId)object0).toString());
        }
        if(object0 instanceof Date) {
            long v = ((Date)object0).getTime();
            return OsMap.nativeContainsDate(this.a, v);
        }
        if(!(object0 instanceof Decimal128)) {
            throw new IllegalArgumentException("Invalid object type: " + object0.getClass().getCanonicalName());
        }
        return OsMap.nativeContainsDecimal128(this.a, ((Decimal128)object0).h(), ((Decimal128)object0).i());
    }

    public boolean d(long v) {
        return OsMap.nativeContainsRealmAny(this.a, v);
    }

    public boolean e(long v, long v1) {
        return OsMap.nativeContainsRealmModel(this.a, v, v1);
    }

    public long f(Object object0) {
        return OsMap.nativeCreateAndPutEmbeddedObject(this.a, ((String)object0));
    }

    public OsMap g(OsSharedRealm osSharedRealm0) {
        return new OsMap(osSharedRealm0, OsMap.nativeFreeze(this.a, osSharedRealm0.getNativePtr()), this.c);
    }

    @Override  // io.realm.internal.l
    public long getNativeFinalizerPtr() {
        return OsMap.e;
    }

    @Override  // io.realm.internal.l
    public long getNativePtr() {
        return this.a;
    }

    @h
    public Object h(Object object0) {
        return OsMap.nativeGetValue(this.a, ((String)object0));
    }

    public a i(int v) {
        Object[] arr_object = OsMap.nativeGetEntryForPrimitive(this.a, v);
        return new a(((String)arr_object[0]), arr_object[1]);
    }

    public a j(int v) {
        Object[] arr_object = OsMap.nativeGetEntryForModel(this.a, v);
        String s = (String)arr_object[0];
        Long long0 = (Long)arr_object[1];
        return ((long)long0) == -1L ? new a(s, -1L) : new a(s, long0);
    }

    public a k(int v) {
        Object[] arr_object = OsMap.nativeGetEntryForRealmAny(this.a, v);
        return new a(((String)arr_object[0]), new NativeRealmAny(((long)(((Long)arr_object[1])))));
    }

    public long l(Object object0) {
        return OsMap.nativeGetRow(this.a, ((String)object0));
    }

    public long m(Object object0) {
        return OsMap.nativeGetRealmAnyPtr(this.a, ((String)object0));
    }

    public Table n() {
        return this.c;
    }

    private static native void nativeClear(long arg0) {
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

    private static native boolean nativeContainsKey(long arg0, String arg1) {
    }

    private static native boolean nativeContainsLong(long arg0, long arg1) {
    }

    private static native boolean nativeContainsNull(long arg0) {
    }

    private static native boolean nativeContainsObjectId(long arg0, String arg1) {
    }

    private static native boolean nativeContainsRealmAny(long arg0, long arg1) {
    }

    private static native boolean nativeContainsRealmModel(long arg0, long arg1, long arg2) {
    }

    private static native boolean nativeContainsString(long arg0, String arg1) {
    }

    private static native boolean nativeContainsUUID(long arg0, String arg1) {
    }

    private static native long[] nativeCreate(long arg0, long arg1, long arg2) {
    }

    private static native long nativeCreateAndPutEmbeddedObject(long arg0, String arg1) {
    }

    private static native long nativeFreeze(long arg0, long arg1) {
    }

    private static native Object[] nativeGetEntryForModel(long arg0, int arg1) {
    }

    private static native Object[] nativeGetEntryForPrimitive(long arg0, int arg1) {
    }

    private static native Object[] nativeGetEntryForRealmAny(long arg0, int arg1) {
    }

    private static native long nativeGetFinalizerPtr() {
    }

    private static native long nativeGetRealmAnyPtr(long arg0, String arg1) {
    }

    private static native long nativeGetRow(long arg0, String arg1) {
    }

    private static native Object nativeGetValue(long arg0, String arg1) {
    }

    private static native boolean nativeIsValid(long arg0) {
    }

    private static native long nativeKeys(long arg0) {
    }

    private static native void nativePutBinary(long arg0, String arg1, byte[] arg2) {
    }

    private static native void nativePutBoolean(long arg0, String arg1, boolean arg2) {
    }

    private static native void nativePutDate(long arg0, String arg1, long arg2) {
    }

    private static native void nativePutDecimal128(long arg0, String arg1, long arg2, long arg3) {
    }

    private static native void nativePutDouble(long arg0, String arg1, double arg2) {
    }

    private static native void nativePutFloat(long arg0, String arg1, float arg2) {
    }

    private static native void nativePutLong(long arg0, String arg1, long arg2) {
    }

    private static native void nativePutNull(long arg0, String arg1) {
    }

    private static native void nativePutObjectId(long arg0, String arg1, String arg2) {
    }

    private static native void nativePutRealmAny(long arg0, String arg1, long arg2) {
    }

    private static native void nativePutRow(long arg0, String arg1, long arg2) {
    }

    private static native void nativePutString(long arg0, String arg1, String arg2) {
    }

    private static native void nativePutUUID(long arg0, String arg1, String arg2) {
    }

    private static native void nativeRemove(long arg0, String arg1) {
    }

    private static native long nativeSize(long arg0) {
    }

    private static native void nativeStartListening(long arg0, ObservableMap arg1) {
    }

    private static native void nativeStopListening(long arg0) {
    }

    private static native long nativeValues(long arg0) {
    }

    public boolean o() {
        return OsMap.nativeIsValid(this.a);
    }

    public void p(Object object0, @h Object object1) {
        if(object1 == null) {
            try {
                OsMap.nativePutNull(this.a, ((String)object0));
                return;
            }
            catch(IllegalArgumentException illegalArgumentException0) {
                if(!illegalArgumentException0.getMessage().contains("Value cannot be null")) {
                    throw illegalArgumentException0;
                }
                throw new NullPointerException(illegalArgumentException0.getMessage());
            }
        }
        String s = object1.getClass().getCanonicalName();
        if("java.lang.Long".equals(s)) {
            OsMap.nativePutLong(this.a, ((String)object0), ((long)(((Long)object1))));
            return;
        }
        if("java.lang.Integer".equals(s)) {
            OsMap.nativePutLong(this.a, ((String)object0), ((int)(((Integer)object1))));
            return;
        }
        if("java.lang.Short".equals(s)) {
            OsMap.nativePutLong(this.a, ((String)object0), ((short)(((Short)object1))));
            return;
        }
        if("java.lang.Byte".equals(s)) {
            OsMap.nativePutLong(this.a, ((String)object0), ((byte)(((Byte)object1))));
            return;
        }
        if("java.lang.Float".equals(s)) {
            OsMap.nativePutFloat(this.a, ((String)object0), ((float)(((Float)object1))));
            return;
        }
        if("java.lang.Double".equals(s)) {
            OsMap.nativePutDouble(this.a, ((String)object0), ((double)(((Double)object1))));
            return;
        }
        if("java.lang.String".equals(s)) {
            OsMap.nativePutString(this.a, ((String)object0), ((String)object1));
            return;
        }
        if("java.lang.Boolean".equals(s)) {
            OsMap.nativePutBoolean(this.a, ((String)object0), ((Boolean)object1).booleanValue());
            return;
        }
        if("java.util.Date".equals(s)) {
            long v = ((Date)object1).getTime();
            OsMap.nativePutDate(this.a, ((String)object0), v);
            return;
        }
        if(Decimal128.class.getCanonicalName().equals(s)) {
            OsMap.nativePutDecimal128(this.a, ((String)object0), ((Decimal128)object1).h(), ((Decimal128)object1).i());
            return;
        }
        if("java.lang.Byte[]".equals(s)) {
            byte[] arr_b = d.a(((Byte[])object1));
            OsMap.nativePutBinary(this.a, ((String)object0), arr_b);
            return;
        }
        if("byte[]".equals(s)) {
            OsMap.nativePutBinary(this.a, ((String)object0), ((byte[])object1));
            return;
        }
        if(ObjectId.class.getCanonicalName().equals(s)) {
            OsMap.nativePutObjectId(this.a, ((String)object0), "68bb29dd5b6ba007ed65ab27");
            return;
        }
        if(!"java.util.UUID".equals(s)) {
            throw new UnsupportedOperationException("Class \'" + s + "\' not supported.");
        }
        OsMap.nativePutUUID(this.a, ((String)object0), object1.toString());
        return;
    }

    public void q(Object object0, long v) {
        OsMap.nativePutRealmAny(this.a, ((String)object0), v);
    }

    public void r(Object object0, long v) {
        OsMap.nativePutRow(this.a, ((String)object0), v);
    }

    public void s(Object object0) {
        OsMap.nativeRemove(this.a, ((String)object0));
    }

    public long t() {
        return OsMap.nativeSize(this.a);
    }

    public void u(ObservableMap observableMap0) {
        OsMap.nativeStartListening(this.a, observableMap0);
    }

    public void v() {
        OsMap.nativeStopListening(this.a);
    }

    public a w() {
        Long long0 = OsMap.nativeKeys(this.a);
        return new a(this.c, long0);
    }

    public a x() {
        Long long0 = OsMap.nativeValues(this.a);
        return new a(this.c, long0);
    }
}

