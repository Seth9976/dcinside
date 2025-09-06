package io.realm.internal;

import io.realm.P0;
import io.realm.w0;
import java.util.Date;
import java.util.UUID;
import o3.h;
import org.bson.types.Decimal128;
import org.bson.types.ObjectId;

public class OsList implements ObservableCollection, l, o {
    private final long a;
    private final k b;
    private final Table c;
    private final n d;
    private static final long e;

    static {
        OsList.e = OsList.nativeGetFinalizerPtr();
    }

    private OsList(OsSharedRealm osSharedRealm0, long v, @h Table table0) {
        this.d = new n();
        this.a = v;
        this.c = table0;
        this.b = osSharedRealm0.context;
        osSharedRealm0.context.a(this);
    }

    public OsList(UncheckedRow uncheckedRow0, long v) {
        this.d = new n();
        OsSharedRealm osSharedRealm0 = uncheckedRow0.b().Q();
        long[] arr_v = OsList.nativeCreate(osSharedRealm0.getNativePtr(), uncheckedRow0.getNativePtr(), v);
        this.a = arr_v[0];
        this.b = osSharedRealm0.context;
        osSharedRealm0.context.a(this);
        if(arr_v[1] != 0L) {
            this.c = new Table(osSharedRealm0, arr_v[1]);
            return;
        }
        this.c = null;
    }

    public void A(long v, @h byte[] arr_b) {
        OsList.nativeInsertBinary(this.a, v, arr_b);
    }

    public void B(long v, boolean z) {
        OsList.nativeInsertBoolean(this.a, v, z);
    }

    public void C(long v, @h Date date0) {
        if(date0 == null) {
            OsList.nativeInsertNull(this.a, v);
            return;
        }
        long v1 = date0.getTime();
        OsList.nativeInsertDate(this.a, v, v1);
    }

    public void D(long v, @h Decimal128 decimal1280) {
        if(decimal1280 == null) {
            OsList.nativeInsertNull(this.a, v);
            return;
        }
        OsList.nativeInsertDecimal128(this.a, v, decimal1280.i(), decimal1280.h());
    }

    public void E(long v, double f) {
        OsList.nativeInsertDouble(this.a, v, f);
    }

    public void F(long v, float f) {
        OsList.nativeInsertFloat(this.a, v, f);
    }

    public void G(long v, long v1) {
        OsList.nativeInsertLong(this.a, v, v1);
    }

    public void H(long v) {
        OsList.nativeInsertNull(this.a, v);
    }

    public void I(long v, @h ObjectId objectId0) {
        if(objectId0 == null) {
            OsList.nativeInsertNull(this.a, v);
            return;
        }
        OsList.nativeInsertObjectId(this.a, v, "68bb29ddc9d287672bbcf1c5");
    }

    public void J(long v, long v1) {
        OsList.nativeInsertRealmAny(this.a, v, v1);
    }

    public void K(long v, long v1) {
        OsList.nativeInsertRow(this.a, v, v1);
    }

    public void L(long v, @h String s) {
        OsList.nativeInsertString(this.a, v, s);
    }

    public void M(long v, @h UUID uUID0) {
        if(uUID0 == null) {
            OsList.nativeInsertNull(this.a, v);
            return;
        }
        OsList.nativeInsertUUID(this.a, v, uUID0.toString());
    }

    public boolean N() {
        return OsList.nativeSize(this.a) <= 0L;
    }

    public void O(long v, long v1) {
        OsList.nativeMove(this.a, v, v1);
    }

    public void P(long v) {
        OsList.nativeRemove(this.a, v);
    }

    public void Q() {
        OsList.nativeRemoveAll(this.a);
    }

    public void R() {
        this.d.b();
        this.nativeStopListening(this.a);
    }

    public void S(Object object0, w0 w00) {
        this.d.e(object0, w00);
        if(this.d.d()) {
            this.nativeStopListening(this.a);
        }
    }

    public void T(Object object0, P0 p00) {
        this.S(object0, new c(p00));
    }

    public void U(long v, @h byte[] arr_b) {
        OsList.nativeSetBinary(this.a, v, arr_b);
    }

    public void V(long v, boolean z) {
        OsList.nativeSetBoolean(this.a, v, z);
    }

    public void W(long v, @h Date date0) {
        if(date0 == null) {
            OsList.nativeSetNull(this.a, v);
            return;
        }
        long v1 = date0.getTime();
        OsList.nativeSetDate(this.a, v, v1);
    }

    public void X(long v, @h Decimal128 decimal1280) {
        if(decimal1280 == null) {
            OsList.nativeSetNull(this.a, v);
            return;
        }
        OsList.nativeSetDecimal128(this.a, v, decimal1280.i(), decimal1280.h());
    }

    public void Y(long v, double f) {
        OsList.nativeSetDouble(this.a, v, f);
    }

    public void Z(long v, float f) {
        OsList.nativeSetFloat(this.a, v, f);
    }

    public void a(@h byte[] arr_b) {
        OsList.nativeAddBinary(this.a, arr_b);
    }

    public void a0(long v, long v1) {
        OsList.nativeSetLong(this.a, v, v1);
    }

    public void b(boolean z) {
        OsList.nativeAddBoolean(this.a, z);
    }

    public void b0(long v) {
        OsList.nativeSetNull(this.a, v);
    }

    public void c(@h Date date0) {
        if(date0 == null) {
            OsList.nativeAddNull(this.a);
            return;
        }
        long v = date0.getTime();
        OsList.nativeAddDate(this.a, v);
    }

    public void c0(long v, @h ObjectId objectId0) {
        if(objectId0 == null) {
            OsList.nativeSetNull(this.a, v);
            return;
        }
        OsList.nativeSetObjectId(this.a, v, "68bb29deaae1c14e87fe1448");
    }

    public void d(@h Decimal128 decimal1280) {
        if(decimal1280 == null) {
            OsList.nativeAddNull(this.a);
            return;
        }
        OsList.nativeAddDecimal128(this.a, decimal1280.i(), decimal1280.h());
    }

    public void d0(long v, long v1) {
        OsList.nativeSetRealmAny(this.a, v, v1);
    }

    public void e(double f) {
        OsList.nativeAddDouble(this.a, f);
    }

    public void e0(long v, long v1) {
        OsList.nativeSetRow(this.a, v, v1);
    }

    public void f(float f) {
        OsList.nativeAddFloat(this.a, f);
    }

    public void f0(long v, @h String s) {
        OsList.nativeSetString(this.a, v, s);
    }

    public void g(Object object0, w0 w00) {
        if(this.d.d()) {
            this.nativeStartListening(this.a);
        }
        b observableCollection$b0 = new b(object0, w00);
        this.d.a(observableCollection$b0);
    }

    public void g0(long v, @h UUID uUID0) {
        if(uUID0 == null) {
            OsList.nativeSetNull(this.a, v);
            return;
        }
        OsList.nativeSetUUID(this.a, v, uUID0.toString());
    }

    @Override  // io.realm.internal.l
    public long getNativeFinalizerPtr() {
        return OsList.e;
    }

    @Override  // io.realm.internal.l
    public long getNativePtr() {
        return this.a;
    }

    public void h(Object object0, P0 p00) {
        this.g(object0, new c(p00));
    }

    public long h0() {
        return OsList.nativeSize(this.a);
    }

    public void i(long v) {
        OsList.nativeAddLong(this.a, v);
    }

    public void j() {
        OsList.nativeAddNull(this.a);
    }

    public void k(@h ObjectId objectId0) {
        if(objectId0 == null) {
            OsList.nativeAddNull(this.a);
            return;
        }
        OsList.nativeAddObjectId(this.a, "68bb29df9c8e8645bbf07945");
    }

    public void l(long v) {
        OsList.nativeAddRealmAny(this.a, v);
    }

    public void m(long v) {
        OsList.nativeAddRow(this.a, v);
    }

    public void n(@h String s) {
        OsList.nativeAddString(this.a, s);
    }

    private static native void nativeAddBinary(long arg0, @h byte[] arg1) {
    }

    private static native void nativeAddBoolean(long arg0, boolean arg1) {
    }

    private static native void nativeAddDate(long arg0, long arg1) {
    }

    private static native void nativeAddDecimal128(long arg0, long arg1, long arg2) {
    }

    private static native void nativeAddDouble(long arg0, double arg1) {
    }

    private static native void nativeAddFloat(long arg0, float arg1) {
    }

    private static native void nativeAddLong(long arg0, long arg1) {
    }

    private static native void nativeAddNull(long arg0) {
    }

    private static native void nativeAddObjectId(long arg0, String arg1) {
    }

    private static native void nativeAddRealmAny(long arg0, long arg1) {
    }

    private static native void nativeAddRow(long arg0, long arg1) {
    }

    private static native void nativeAddString(long arg0, @h String arg1) {
    }

    private static native void nativeAddUUID(long arg0, String arg1) {
    }

    private static native long[] nativeCreate(long arg0, long arg1, long arg2) {
    }

    private static native long nativeCreateAndAddEmbeddedObject(long arg0, long arg1) {
    }

    private static native long nativeCreateAndSetEmbeddedObject(long arg0, long arg1) {
    }

    private static native void nativeDelete(long arg0, long arg1) {
    }

    private static native void nativeDeleteAll(long arg0) {
    }

    private static native long nativeFreeze(long arg0, long arg1) {
    }

    private static native long nativeGetFinalizerPtr() {
    }

    private static native long nativeGetQuery(long arg0) {
    }

    private static native long nativeGetRow(long arg0, long arg1) {
    }

    private static native Object nativeGetValue(long arg0, long arg1) {
    }

    private static native void nativeInsertBinary(long arg0, long arg1, @h byte[] arg2) {
    }

    private static native void nativeInsertBoolean(long arg0, long arg1, boolean arg2) {
    }

    private static native void nativeInsertDate(long arg0, long arg1, long arg2) {
    }

    private static native void nativeInsertDecimal128(long arg0, long arg1, long arg2, long arg3) {
    }

    private static native void nativeInsertDouble(long arg0, long arg1, double arg2) {
    }

    private static native void nativeInsertFloat(long arg0, long arg1, float arg2) {
    }

    private static native void nativeInsertLong(long arg0, long arg1, long arg2) {
    }

    private static native void nativeInsertNull(long arg0, long arg1) {
    }

    private static native void nativeInsertObjectId(long arg0, long arg1, String arg2) {
    }

    private static native void nativeInsertRealmAny(long arg0, long arg1, long arg2) {
    }

    private static native void nativeInsertRow(long arg0, long arg1, long arg2) {
    }

    private static native void nativeInsertString(long arg0, long arg1, @h String arg2) {
    }

    private static native void nativeInsertUUID(long arg0, long arg1, String arg2) {
    }

    private static native boolean nativeIsValid(long arg0) {
    }

    private static native void nativeMove(long arg0, long arg1, long arg2) {
    }

    private static native void nativeRemove(long arg0, long arg1) {
    }

    private static native void nativeRemoveAll(long arg0) {
    }

    private static native void nativeSetBinary(long arg0, long arg1, @h byte[] arg2) {
    }

    private static native void nativeSetBoolean(long arg0, long arg1, boolean arg2) {
    }

    private static native void nativeSetDate(long arg0, long arg1, long arg2) {
    }

    private static native void nativeSetDecimal128(long arg0, long arg1, long arg2, long arg3) {
    }

    private static native void nativeSetDouble(long arg0, long arg1, double arg2) {
    }

    private static native void nativeSetFloat(long arg0, long arg1, float arg2) {
    }

    private static native void nativeSetLong(long arg0, long arg1, long arg2) {
    }

    private static native void nativeSetNull(long arg0, long arg1) {
    }

    private static native void nativeSetObjectId(long arg0, long arg1, String arg2) {
    }

    private static native void nativeSetRealmAny(long arg0, long arg1, long arg2) {
    }

    private static native void nativeSetRow(long arg0, long arg1, long arg2) {
    }

    private static native void nativeSetString(long arg0, long arg1, @h String arg2) {
    }

    private static native void nativeSetUUID(long arg0, long arg1, String arg2) {
    }

    private static native long nativeSize(long arg0) {
    }

    private native void nativeStartListening(long arg1) {
    }

    private native void nativeStopListening(long arg1) {
    }

    @Override  // io.realm.internal.ObservableCollection
    public void notifyChangeListeners(long v) {
        OsCollectionChangeSet osCollectionChangeSet0 = new OsCollectionChangeSet(v, false);
        if(osCollectionChangeSet0.g()) {
            return;
        }
        a observableCollection$a0 = new a(osCollectionChangeSet0);
        this.d.c(observableCollection$a0);
    }

    public void o(@h UUID uUID0) {
        if(uUID0 == null) {
            OsList.nativeAddNull(this.a);
            return;
        }
        OsList.nativeAddUUID(this.a, uUID0.toString());
    }

    public long p() {
        long v = this.h0();
        return OsList.nativeCreateAndAddEmbeddedObject(this.a, v);
    }

    public long q(long v) {
        return OsList.nativeCreateAndAddEmbeddedObject(this.a, v);
    }

    public long r(long v) {
        return OsList.nativeCreateAndSetEmbeddedObject(this.a, v);
    }

    @Override  // io.realm.internal.o
    public boolean s() {
        return OsList.nativeIsValid(this.a);
    }

    public void t(long v) {
        OsList.nativeDelete(this.a, v);
    }

    public void u() {
        OsList.nativeDeleteAll(this.a);
    }

    public OsList v(OsSharedRealm osSharedRealm0) {
        long v = OsList.nativeFreeze(this.a, osSharedRealm0.getNativePtr());
        return this.c == null ? new OsList(osSharedRealm0, v, null) : new OsList(osSharedRealm0, v, this.c.y(osSharedRealm0));
    }

    public TableQuery w() {
        long v = OsList.nativeGetQuery(this.a);
        return new TableQuery(this.b, this.c, v);
    }

    public Table x() {
        return this.c;
    }

    public UncheckedRow y(long v) {
        long v1 = OsList.nativeGetRow(this.a, v);
        return this.c.V(v1);
    }

    @h
    public Object z(long v) {
        return OsList.nativeGetValue(this.a, v);
    }
}

