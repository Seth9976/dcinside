package io.realm.internal.core;

import io.realm.G0.a;
import io.realm.internal.Keep;
import io.realm.internal.OsSharedRealm;
import io.realm.internal.Table;
import io.realm.internal.k;
import io.realm.internal.l;
import io.realm.internal.s;
import io.realm.internal.t;
import io.realm.internal.u;
import java.util.Date;
import java.util.UUID;
import org.bson.types.Decimal128;
import org.bson.types.ObjectId;

@Keep
public class NativeRealmAny implements l {
    private static final long nativeFinalizerPtr;
    private final long nativePtr;

    static {
        NativeRealmAny.nativeFinalizerPtr = NativeRealmAny.nativeGetFinalizerPtr();
    }

    public NativeRealmAny() {
        this(NativeRealmAny.nativeCreateNull());
    }

    public NativeRealmAny(long v) {
        this.nativePtr = v;
        k.c.a(this);
    }

    public NativeRealmAny(s s0) {
        this(NativeRealmAny.createRealmAnyLink(s0));
    }

    public NativeRealmAny(Boolean boolean0) {
        this(NativeRealmAny.nativeCreateBoolean(boolean0.booleanValue()));
    }

    public NativeRealmAny(Double double0) {
        this(NativeRealmAny.nativeCreateDouble(((double)double0)));
    }

    public NativeRealmAny(Float float0) {
        this(NativeRealmAny.nativeCreateFloat(((float)float0)));
    }

    public NativeRealmAny(Number number0) {
        this(NativeRealmAny.nativeCreateLong(number0.longValue()));
    }

    public NativeRealmAny(String s) {
        this(NativeRealmAny.nativeCreateString(s));
    }

    public NativeRealmAny(Date date0) {
        this(NativeRealmAny.nativeCreateDate(date0.getTime()));
    }

    public NativeRealmAny(UUID uUID0) {
        this(NativeRealmAny.nativeCreateUUID(uUID0.toString()));
    }

    public NativeRealmAny(Decimal128 decimal1280) {
        this(NativeRealmAny.nativeCreateDecimal128(decimal1280.i(), decimal1280.h()));
    }

    public NativeRealmAny(ObjectId objectId0) {
        this(NativeRealmAny.nativeCreateObjectId("68bb29e9b445a678cef7e20d"));
    }

    public NativeRealmAny(byte[] arr_b) {
        this(NativeRealmAny.nativeCreateBinary(arr_b));
    }

    public byte[] asBinary() {
        return NativeRealmAny.nativeAsBinary(this.nativePtr);
    }

    public boolean asBoolean() {
        return NativeRealmAny.nativeAsBoolean(this.nativePtr);
    }

    public Date asDate() {
        return new Date(NativeRealmAny.nativeAsDate(this.nativePtr));
    }

    public Decimal128 asDecimal128() {
        long[] arr_v = NativeRealmAny.nativeAsDecimal128(this.nativePtr);
        return Decimal128.fromIEEE754BIDEncoding(arr_v[1], arr_v[0]);
    }

    public double asDouble() {
        return NativeRealmAny.nativeAsDouble(this.nativePtr);
    }

    public float asFloat() {
        return NativeRealmAny.nativeAsFloat(this.nativePtr);
    }

    public long asLong() {
        return NativeRealmAny.nativeAsLong(this.nativePtr);
    }

    public ObjectId asObjectId() {
        return new ObjectId(NativeRealmAny.nativeAsObjectId(this.nativePtr));
    }

    public String asString() {
        return NativeRealmAny.nativeAsString(this.nativePtr);
    }

    public UUID asUUID() {
        return UUID.fromString(NativeRealmAny.nativeAsUUID(this.nativePtr));
    }

    public boolean coercedEquals(NativeRealmAny nativeRealmAny0) {
        return NativeRealmAny.nativeEquals(this.nativePtr, nativeRealmAny0.nativePtr);
    }

    private static long createRealmAnyLink(s s0) {
        u u0 = s0.R3().g();
        return NativeRealmAny.nativeCreateLink(u0.b().getNativePtr(), u0.F());
    }

    public Class getModelClass(OsSharedRealm osSharedRealm0, t t0) {
        return t0.h(Table.D(NativeRealmAny.nativeGetRealmModelTableName(this.nativePtr, osSharedRealm0.getNativePtr())));
    }

    @Override  // io.realm.internal.l
    public long getNativeFinalizerPtr() {
        return NativeRealmAny.nativeFinalizerPtr;
    }

    @Override  // io.realm.internal.l
    public long getNativePtr() {
        return this.nativePtr;
    }

    public long getRealmModelRowKey() {
        return NativeRealmAny.nativeGetRealmModelRowKey(this.nativePtr);
    }

    public String getRealmModelTableName(OsSharedRealm osSharedRealm0) {
        return NativeRealmAny.nativeGetRealmModelTableName(this.nativePtr, osSharedRealm0.getNativePtr());
    }

    public a getType() {
        return a.a(NativeRealmAny.nativeGetType(this.nativePtr));
    }

    private static native byte[] nativeAsBinary(long arg0) {
    }

    private static native boolean nativeAsBoolean(long arg0) {
    }

    private static native long nativeAsDate(long arg0) {
    }

    private static native long[] nativeAsDecimal128(long arg0) {
    }

    private static native double nativeAsDouble(long arg0) {
    }

    private static native float nativeAsFloat(long arg0) {
    }

    private static native long nativeAsLong(long arg0) {
    }

    private static native String nativeAsObjectId(long arg0) {
    }

    private static native String nativeAsString(long arg0) {
    }

    private static native String nativeAsUUID(long arg0) {
    }

    private static native long nativeCreateBinary(byte[] arg0) {
    }

    private static native long nativeCreateBoolean(boolean arg0) {
    }

    private static native long nativeCreateDate(long arg0) {
    }

    private static native long nativeCreateDecimal128(long arg0, long arg1) {
    }

    private static native long nativeCreateDouble(double arg0) {
    }

    private static native long nativeCreateFloat(float arg0) {
    }

    private static native long nativeCreateLink(long arg0, long arg1) {
    }

    private static native long nativeCreateLong(long arg0) {
    }

    private static native long nativeCreateNull() {
    }

    private static native long nativeCreateObjectId(String arg0) {
    }

    private static native long nativeCreateString(String arg0) {
    }

    private static native long nativeCreateUUID(String arg0) {
    }

    private static native boolean nativeEquals(long arg0, long arg1) {
    }

    private static native long nativeGetFinalizerPtr() {
    }

    private static native long nativeGetRealmModelRowKey(long arg0) {
    }

    private static native String nativeGetRealmModelTableName(long arg0, long arg1) {
    }

    private static native int nativeGetType(long arg0) {
    }
}

