package io.realm.internal;

import io.realm.G0;
import io.realm.I0;
import io.realm.internal.core.NativeRealmAny;
import io.realm.internal.objectstore.OsKeyPathMapping;
import io.realm.r1;
import java.util.Date;
import o3.h;
import org.bson.types.Decimal128;

public class TableQuery implements l {
    private final Table a;
    private final long b;
    private final I0 c;
    private boolean d;
    private static final boolean e = false;
    private static final long f;

    static {
        TableQuery.f = TableQuery.nativeGetFinalizerPtr();
    }

    public TableQuery(k k0, Table table0, long v) {
        this.c = new I0();
        this.d = true;
        this.a = table0;
        this.b = v;
        k0.a(this);
    }

    public long A() {
        this.q0();
        return this.nativeFind(this.b);
    }

    public Table B() {
        return this.a;
    }

    public TableQuery C(@h OsKeyPathMapping osKeyPathMapping0, String s, G0 g00) {
        this.c.b(this, osKeyPathMapping0, TableQuery.z(s) + " > $0", new G0[]{g00});
        this.d = false;
        return this;
    }

    public TableQuery D(@h OsKeyPathMapping osKeyPathMapping0, String s, G0 g00) {
        this.c.b(this, osKeyPathMapping0, TableQuery.z(s) + " >= $0", new G0[]{g00});
        this.d = false;
        return this;
    }

    public TableQuery E(@h OsKeyPathMapping osKeyPathMapping0, String s, G0[] arr_g0) {
        String s1 = TableQuery.z(s);
        this.h();
        int v = 0;
        for(boolean z = true; v < arr_g0.length; z = false) {
            G0 g00 = arr_g0[v];
            if(!z) {
                this.e0();
            }
            if(g00 == null) {
                this.J(osKeyPathMapping0, s1);
            }
            else {
                this.x(osKeyPathMapping0, s1, g00);
            }
            ++v;
        }
        this.u();
        this.d = false;
        return this;
    }

    public TableQuery F(@h OsKeyPathMapping osKeyPathMapping0, String s, G0[] arr_g0) {
        String s1 = TableQuery.z(s);
        this.h();
        int v = 0;
        for(boolean z = true; v < arr_g0.length; z = false) {
            G0 g00 = arr_g0[v];
            if(!z) {
                this.e0();
            }
            if(g00 == null) {
                this.J(osKeyPathMapping0, s1);
            }
            else {
                this.y(osKeyPathMapping0, s1, g00);
            }
            ++v;
        }
        this.u();
        this.d = false;
        return this;
    }

    public TableQuery G(@h OsKeyPathMapping osKeyPathMapping0, String s) {
        this.h0(osKeyPathMapping0, TableQuery.z(s) + ".@count = 0", new long[0]);
        this.d = false;
        return this;
    }

    public TableQuery H(@h OsKeyPathMapping osKeyPathMapping0, String s) {
        this.h0(osKeyPathMapping0, TableQuery.z(s) + ".@count != 0", new long[0]);
        this.d = false;
        return this;
    }

    public TableQuery I(@h OsKeyPathMapping osKeyPathMapping0, String s) {
        this.h0(osKeyPathMapping0, TableQuery.z(s) + " != NULL", new long[0]);
        this.d = false;
        return this;
    }

    public TableQuery J(@h OsKeyPathMapping osKeyPathMapping0, String s) {
        this.h0(osKeyPathMapping0, TableQuery.z(s) + " = NULL", new long[0]);
        this.d = false;
        return this;
    }

    public TableQuery K(@h OsKeyPathMapping osKeyPathMapping0, String s, G0 g00) {
        this.c.b(this, osKeyPathMapping0, TableQuery.z(s) + " < $0", new G0[]{g00});
        this.d = false;
        return this;
    }

    public TableQuery L(@h OsKeyPathMapping osKeyPathMapping0, String s, G0 g00) {
        this.c.b(this, osKeyPathMapping0, TableQuery.z(s) + " <= $0", new G0[]{g00});
        this.d = false;
        return this;
    }

    public TableQuery M(@h OsKeyPathMapping osKeyPathMapping0, String s, G0 g00) {
        this.c.b(this, osKeyPathMapping0, TableQuery.z(s) + " LIKE $0", new G0[]{g00});
        this.d = false;
        return this;
    }

    public TableQuery N(@h OsKeyPathMapping osKeyPathMapping0, String s, G0 g00) {
        this.c.b(this, osKeyPathMapping0, TableQuery.z(s) + " LIKE[c] $0", new G0[]{g00});
        this.d = false;
        return this;
    }

    public TableQuery O(long v) {
        this.f0(null, "LIMIT(" + v + ")");
        return this;
    }

    public Date P(long v) {
        this.q0();
        Long long0 = this.nativeMaximumTimestamp(this.b, v);
        return long0 == null ? null : new Date(((long)long0));
    }

    public Decimal128 Q(long v) {
        this.q0();
        long[] arr_v = this.nativeMaximumDecimal128(this.b, v);
        return arr_v == null ? null : Decimal128.fromIEEE754BIDEncoding(arr_v[1], arr_v[0]);
    }

    public Double R(long v) {
        this.q0();
        return this.nativeMaximumDouble(this.b, v);
    }

    public Float S(long v) {
        this.q0();
        return this.nativeMaximumFloat(this.b, v);
    }

    public Long T(long v) {
        this.q0();
        return this.nativeMaximumInt(this.b, v);
    }

    public NativeRealmAny U(long v) {
        this.q0();
        return this.nativeMaximumRealmAny(this.b, v);
    }

    public Date V(long v) {
        this.q0();
        Long long0 = this.nativeMinimumTimestamp(this.b, v);
        return long0 == null ? null : new Date(((long)long0));
    }

    public Decimal128 W(long v) {
        this.q0();
        long[] arr_v = this.nativeMinimumDecimal128(this.b, v);
        return arr_v == null ? null : Decimal128.fromIEEE754BIDEncoding(arr_v[1], arr_v[0]);
    }

    public Double X(long v) {
        this.q0();
        return this.nativeMinimumDouble(this.b, v);
    }

    public Float Y(long v) {
        this.q0();
        return this.nativeMinimumFloat(this.b, v);
    }

    public Long Z(long v) {
        this.q0();
        return this.nativeMinimumInt(this.b, v);
    }

    public TableQuery a() {
        this.h0(null, "FALSEPREDICATE", new long[0]);
        this.d = false;
        return this;
    }

    public NativeRealmAny a0(long v) {
        this.q0();
        return this.nativeMinimumRealmAny(this.b, v);
    }

    public TableQuery b() {
        this.h0(null, "TRUEPREDICATE", new long[0]);
        this.d = false;
        return this;
    }

    public TableQuery b0() {
        this.nativeNot(this.b);
        this.d = false;
        return this;
    }

    public Decimal128 c(long v) {
        this.q0();
        long[] arr_v = this.nativeAverageDecimal128(this.b, v);
        return arr_v == null ? new Decimal128(0L) : Decimal128.fromIEEE754BIDEncoding(arr_v[1], arr_v[0]);
    }

    public TableQuery c0(@h OsKeyPathMapping osKeyPathMapping0, String s, G0 g00) {
        this.c.b(this, osKeyPathMapping0, TableQuery.z(s) + " != $0", new G0[]{g00});
        this.d = false;
        return this;
    }

    public double d(long v) {
        this.q0();
        return this.nativeAverageDouble(this.b, v);
    }

    public TableQuery d0(@h OsKeyPathMapping osKeyPathMapping0, String s, G0 g00) {
        this.c.b(this, osKeyPathMapping0, TableQuery.z(s) + " !=[c] $0", new G0[]{g00});
        this.d = false;
        return this;
    }

    public double e(long v) {
        this.q0();
        return this.nativeAverageFloat(this.b, v);
    }

    public TableQuery e0() {
        this.nativeOr(this.b);
        this.d = false;
        return this;
    }

    public double f(long v) {
        this.q0();
        return this.nativeAverageInt(this.b, v);
    }

    private void f0(@h OsKeyPathMapping osKeyPathMapping0, String s) {
        this.nativeRawDescriptor(this.b, s, (osKeyPathMapping0 == null ? 0L : osKeyPathMapping0.getNativePtr()));
    }

    public Decimal128 g(long v) {
        this.q0();
        long[] arr_v = this.nativeAverageRealmAny(this.b, v);
        return Decimal128.fromIEEE754BIDEncoding(arr_v[1], arr_v[0]);
    }

    public TableQuery g0(@h OsKeyPathMapping osKeyPathMapping0, String s, G0[] arr_g0) {
        this.c.b(this, osKeyPathMapping0, s, arr_g0);
        return this;
    }

    @Override  // io.realm.internal.l
    public long getNativeFinalizerPtr() {
        return TableQuery.f;
    }

    @Override  // io.realm.internal.l
    public long getNativePtr() {
        return this.b;
    }

    public TableQuery h() {
        this.nativeBeginGroup(this.b);
        this.d = false;
        return this;
    }

    public void h0(@h OsKeyPathMapping osKeyPathMapping0, String s, long[] arr_v) {
        this.nativeRawPredicate(this.b, s, arr_v, (osKeyPathMapping0 == null ? 0L : osKeyPathMapping0.getNativePtr()));
    }

    public TableQuery i(@h OsKeyPathMapping osKeyPathMapping0, String s, G0 g00) {
        this.c.b(this, osKeyPathMapping0, TableQuery.z(s) + " BEGINSWITH $0", new G0[]{g00});
        this.d = false;
        return this;
    }

    public long i0() {
        this.q0();
        if(this.a.c0()) {
            this.p0();
        }
        return this.nativeRemove(this.b);
    }

    public TableQuery j(@h OsKeyPathMapping osKeyPathMapping0, String s, G0 g00) {
        this.c.b(this, osKeyPathMapping0, TableQuery.z(s) + " BEGINSWITH[c] $0", new G0[]{g00});
        this.d = false;
        return this;
    }

    public TableQuery j0(@h OsKeyPathMapping osKeyPathMapping0, String[] arr_s, r1[] arr_r1) {
        this.f0(osKeyPathMapping0, TableQuery.m(arr_s, arr_r1));
        return this;
    }

    public TableQuery k(@h OsKeyPathMapping osKeyPathMapping0, String s, G0 g00, G0 g01) {
        this.c.b(this, osKeyPathMapping0, "(" + TableQuery.z(s) + " >= $0 AND " + TableQuery.z(s) + " <= $1)", new G0[]{g00, g01});
        this.d = false;
        return this;
    }

    public Decimal128 k0(long v) {
        this.q0();
        long[] arr_v = this.nativeSumDecimal128(this.b, v);
        return arr_v == null ? null : Decimal128.fromIEEE754BIDEncoding(arr_v[1], arr_v[0]);
    }

    public static String l(String[] arr_s) {
        StringBuilder stringBuilder0 = new StringBuilder("DISTINCT(");
        int v = 0;
        for(String s = ""; v < arr_s.length; s = ", ") {
            String s1 = arr_s[v];
            stringBuilder0.append(s);
            stringBuilder0.append(TableQuery.z(s1));
            ++v;
        }
        stringBuilder0.append(")");
        return stringBuilder0.toString();
    }

    public double l0(long v) {
        this.q0();
        return this.nativeSumDouble(this.b, v);
    }

    public static String m(String[] arr_s, r1[] arr_r1) {
        StringBuilder stringBuilder0 = new StringBuilder("SORT(");
        int v = 0;
        for(String s = ""; v < arr_s.length; s = ", ") {
            String s1 = arr_s[v];
            stringBuilder0.append(s);
            stringBuilder0.append(TableQuery.z(s1));
            stringBuilder0.append(" ");
            stringBuilder0.append((arr_r1[v] == r1.b ? "ASC" : "DESC"));
            ++v;
        }
        stringBuilder0.append(")");
        return stringBuilder0.toString();
    }

    public double m0(long v) {
        this.q0();
        return this.nativeSumFloat(this.b, v);
    }

    public TableQuery n(@h OsKeyPathMapping osKeyPathMapping0, String s, G0 g00) {
        this.c.b(this, osKeyPathMapping0, TableQuery.z(s) + " CONTAINS $0", new G0[]{g00});
        this.d = false;
        return this;
    }

    public long n0(long v) {
        this.q0();
        return this.nativeSumInt(this.b, v);
    }

    private native long[] nativeAverageDecimal128(long arg1, long arg2) {
    }

    private native double nativeAverageDouble(long arg1, long arg2) {
    }

    private native double nativeAverageFloat(long arg1, long arg2) {
    }

    private native double nativeAverageInt(long arg1, long arg2) {
    }

    private native long[] nativeAverageRealmAny(long arg1, long arg2) {
    }

    private native void nativeBeginGroup(long arg1) {
    }

    private native long nativeCount(long arg1) {
    }

    private native void nativeEndGroup(long arg1) {
    }

    private native long nativeFind(long arg1) {
    }

    private static native long nativeGetFinalizerPtr() {
    }

    private native long[] nativeMaximumDecimal128(long arg1, long arg2) {
    }

    private native Double nativeMaximumDouble(long arg1, long arg2) {
    }

    private native Float nativeMaximumFloat(long arg1, long arg2) {
    }

    private native Long nativeMaximumInt(long arg1, long arg2) {
    }

    private native NativeRealmAny nativeMaximumRealmAny(long arg1, long arg2) {
    }

    private native Long nativeMaximumTimestamp(long arg1, long arg2) {
    }

    private native long[] nativeMinimumDecimal128(long arg1, long arg2) {
    }

    private native Double nativeMinimumDouble(long arg1, long arg2) {
    }

    private native Float nativeMinimumFloat(long arg1, long arg2) {
    }

    private native Long nativeMinimumInt(long arg1, long arg2) {
    }

    private native NativeRealmAny nativeMinimumRealmAny(long arg1, long arg2) {
    }

    private native Long nativeMinimumTimestamp(long arg1, long arg2) {
    }

    private native void nativeNot(long arg1) {
    }

    private native void nativeOr(long arg1) {
    }

    private native void nativeRawDescriptor(long arg1, String arg2, long arg3) {
    }

    private native void nativeRawPredicate(long arg1, String arg2, long[] arg3, long arg4) {
    }

    private native long nativeRemove(long arg1) {
    }

    private native long[] nativeSumDecimal128(long arg1, long arg2) {
    }

    private native double nativeSumDouble(long arg1, long arg2) {
    }

    private native double nativeSumFloat(long arg1, long arg2) {
    }

    private native long nativeSumInt(long arg1, long arg2) {
    }

    private native long[] nativeSumRealmAny(long arg1, long arg2) {
    }

    private native String nativeValidateQuery(long arg1) {
    }

    public TableQuery o(@h OsKeyPathMapping osKeyPathMapping0, String s, G0 g00, G0 g01) {
        this.c.b(this, osKeyPathMapping0, TableQuery.z(s) + "[$0] == $1", new G0[]{g00, g01});
        this.d = false;
        return this;
    }

    public Decimal128 o0(long v) {
        this.q0();
        long[] arr_v = this.nativeSumRealmAny(this.b, v);
        return Decimal128.fromIEEE754BIDEncoding(arr_v[1], arr_v[0]);
    }

    public TableQuery p(@h OsKeyPathMapping osKeyPathMapping0, String s, G0 g00) {
        this.c.b(this, osKeyPathMapping0, TableQuery.z(s) + " CONTAINS[c] $0", new G0[]{g00});
        this.d = false;
        return this;
    }

    private void p0() {
        throw new IllegalStateException("Mutable method call during read transaction.");
    }

    public TableQuery q(@h OsKeyPathMapping osKeyPathMapping0, String s, G0 g00) {
        this.c.b(this, osKeyPathMapping0, "ANY " + TableQuery.z(s) + ".@keys == $0", new G0[]{g00});
        this.d = false;
        return this;
    }

    public void q0() {
        if(!this.d) {
            String s = this.nativeValidateQuery(this.b);
            if(!"".equals(s)) {
                throw new UnsupportedOperationException(s);
            }
            this.d = true;
        }
    }

    public TableQuery r(@h OsKeyPathMapping osKeyPathMapping0, String s, G0 g00) {
        this.c.b(this, osKeyPathMapping0, "ANY " + TableQuery.z(s) + ".@values == $0", new G0[]{g00});
        this.d = false;
        return this;
    }

    @Deprecated
    public long s() {
        this.q0();
        return this.nativeCount(this.b);
    }

    public TableQuery t(@h OsKeyPathMapping osKeyPathMapping0, String[] arr_s) {
        this.f0(osKeyPathMapping0, TableQuery.l(arr_s));
        return this;
    }

    public TableQuery u() {
        this.nativeEndGroup(this.b);
        this.d = false;
        return this;
    }

    public TableQuery v(@h OsKeyPathMapping osKeyPathMapping0, String s, G0 g00) {
        this.c.b(this, osKeyPathMapping0, TableQuery.z(s) + " ENDSWITH $0", new G0[]{g00});
        this.d = false;
        return this;
    }

    public TableQuery w(@h OsKeyPathMapping osKeyPathMapping0, String s, G0 g00) {
        this.c.b(this, osKeyPathMapping0, TableQuery.z(s) + " ENDSWITH[c] $0", new G0[]{g00});
        this.d = false;
        return this;
    }

    public TableQuery x(@h OsKeyPathMapping osKeyPathMapping0, String s, G0 g00) {
        this.c.b(this, osKeyPathMapping0, TableQuery.z(s) + " = $0", new G0[]{g00});
        this.d = false;
        return this;
    }

    public TableQuery y(@h OsKeyPathMapping osKeyPathMapping0, String s, G0 g00) {
        this.c.b(this, osKeyPathMapping0, TableQuery.z(s) + " =[c] $0", new G0[]{g00});
        this.d = false;
        return this;
    }

    private static String z(@h String s) {
        return s == null ? null : s.replace(" ", "\\ ");
    }
}

