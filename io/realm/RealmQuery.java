package io.realm;

import io.realm.internal.OsList;
import io.realm.internal.OsResults;
import io.realm.internal.OsSet;
import io.realm.internal.OsSharedRealm;
import io.realm.internal.Table;
import io.realm.internal.TableQuery;
import io.realm.internal.UncheckedRow;
import io.realm.internal.Util;
import io.realm.internal.c;
import io.realm.internal.core.NativeRealmAny;
import io.realm.internal.o;
import io.realm.internal.objectstore.OsKeyPathMapping;
import io.realm.internal.p;
import io.realm.internal.s;
import io.realm.internal.t;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Map.Entry;
import java.util.UUID;
import o3.h;
import org.bson.types.Decimal128;
import org.bson.types.ObjectId;

public class RealmQuery {
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
                a.a[RealmFieldType.FLOAT.ordinal()] = 2;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                a.a[RealmFieldType.DOUBLE.ordinal()] = 3;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                a.a[RealmFieldType.DECIMAL128.ordinal()] = 4;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                a.a[RealmFieldType.MIXED.ordinal()] = 5;
            }
            catch(NoSuchFieldError unused_ex) {
            }
        }
    }

    private final Table a;
    private final io.realm.a b;
    private final TableQuery c;
    private final f1 d;
    private Class e;
    private String f;
    private final boolean g;
    private final o h;
    private static final String i = "Queries on primitive lists are not yet supported";
    private static final String j = "Field \'%s\': type mismatch - %s expected.";
    private static final String k = "Non-empty \'values\' must be provided.";
    private static final String l = "Async query cannot be created on current thread.";

    private RealmQuery(F0 f00, Class class0) {
        this.b = f00;
        this.e = class0;
        boolean z = RealmQuery.b1(class0);
        this.g = !z;
        if(!z) {
            throw new UnsupportedOperationException("Queries on primitive lists are not yet supported");
        }
        f1 f10 = f00.e0().m(class0);
        this.d = f10;
        Table table0 = f10.w();
        this.a = table0;
        this.h = null;
        this.c = table0.E0();
    }

    private RealmQuery(io.realm.a a0, OsList osList0, Class class0) {
        this.b = a0;
        this.e = class0;
        boolean z = RealmQuery.b1(class0);
        this.g = !z;
        if(!z) {
            throw new UnsupportedOperationException("Queries on primitive lists are not yet supported");
        }
        f1 f10 = a0.e0().m(class0);
        this.d = f10;
        this.a = f10.w();
        this.h = osList0;
        this.c = osList0.w();
    }

    private RealmQuery(io.realm.a a0, OsList osList0, String s) {
        this.b = a0;
        this.f = s;
        this.g = false;
        f1 f10 = a0.e0().n(s);
        this.d = f10;
        this.a = f10.w();
        this.c = osList0.w();
        this.h = osList0;
    }

    RealmQuery(io.realm.a a0, OsSet osSet0, Class class0) {
        this.b = a0;
        this.e = class0;
        boolean z = RealmQuery.b1(class0);
        this.g = !z;
        if(!z) {
            throw new UnsupportedOperationException("Queries on primitive lists are not yet supported");
        }
        f1 f10 = a0.e0().m(class0);
        this.d = f10;
        this.a = f10.w();
        this.h = osSet0;
        this.c = osSet0.I();
    }

    private RealmQuery(io.realm.a a0, String s) {
        this.b = a0;
        this.f = s;
        this.g = false;
        f1 f10 = a0.e0().n(s);
        this.d = f10;
        Table table0 = f10.w();
        this.a = table0;
        this.c = table0.E0();
        this.h = null;
    }

    private RealmQuery(g1 g10, Class class0) {
        io.realm.a a0 = g10.a;
        this.b = a0;
        this.e = class0;
        boolean z = RealmQuery.b1(class0);
        this.g = !z;
        if(!z) {
            throw new UnsupportedOperationException("Queries on primitive lists are not yet supported");
        }
        this.d = a0.e0().m(class0);
        this.a = g10.i();
        this.h = null;
        this.c = g10.g().k0();
    }

    private RealmQuery(g1 g10, String s) {
        this.b = g10.a;
        this.f = s;
        this.g = false;
        f1 f10 = g10.a.e0().n(s);
        this.d = f10;
        this.a = f10.w();
        this.c = g10.g().k0();
        this.h = null;
    }

    public RealmQuery A(String s, @h Boolean boolean0) {
        this.b.k();
        OsKeyPathMapping osKeyPathMapping0 = this.b.e0().l();
        G0 g00 = G0.w(boolean0);
        this.c.r(osKeyPathMapping0, s, g00);
        return this;
    }

    public RealmQuery A0(String s, int v) {
        this.b.k();
        OsKeyPathMapping osKeyPathMapping0 = this.b.e0().l();
        G0 g00 = G0.A(v);
        this.c.C(osKeyPathMapping0, s, g00);
        return this;
    }

    public RealmQuery A1(String s, ObjectId objectId0) {
        this.b.k();
        OsKeyPathMapping osKeyPathMapping0 = this.b.e0().l();
        G0 g00 = G0.I(objectId0);
        this.c.L(osKeyPathMapping0, s, g00);
        return this;
    }

    public RealmQuery B(String s, @h Byte byte0) {
        this.b.k();
        OsKeyPathMapping osKeyPathMapping0 = this.b.e0().l();
        G0 g00 = G0.x(byte0);
        this.c.r(osKeyPathMapping0, s, g00);
        return this;
    }

    public RealmQuery B0(String s, long v) {
        this.b.k();
        OsKeyPathMapping osKeyPathMapping0 = this.b.e0().l();
        G0 g00 = G0.B(v);
        this.c.C(osKeyPathMapping0, s, g00);
        return this;
    }

    public RealmQuery B1(String s, G0 g00) {
        return this.C1(s, g00, io.realm.o.b);
    }

    public RealmQuery C(String s, @h Double double0) {
        this.b.k();
        OsKeyPathMapping osKeyPathMapping0 = this.b.e0().l();
        G0 g00 = G0.y(double0);
        this.c.r(osKeyPathMapping0, s, g00);
        return this;
    }

    public RealmQuery C0(String s, G0 g00) {
        this.b.k();
        OsKeyPathMapping osKeyPathMapping0 = this.b.e0().l();
        this.c.C(osKeyPathMapping0, s, g00);
        return this;
    }

    public RealmQuery C1(String s, G0 g00, io.realm.o o0) {
        this.b.k();
        if(o0 == io.realm.o.b) {
            OsKeyPathMapping osKeyPathMapping0 = this.b.e0().l();
            this.c.M(osKeyPathMapping0, s, g00);
            return this;
        }
        OsKeyPathMapping osKeyPathMapping1 = this.b.e0().l();
        this.c.N(osKeyPathMapping1, s, g00);
        return this;
    }

    public RealmQuery D(String s, @h Float float0) {
        this.b.k();
        OsKeyPathMapping osKeyPathMapping0 = this.b.e0().l();
        G0 g00 = G0.z(float0);
        this.c.r(osKeyPathMapping0, s, g00);
        return this;
    }

    public RealmQuery D0(String s, Date date0) {
        this.b.k();
        OsKeyPathMapping osKeyPathMapping0 = this.b.e0().l();
        G0 g00 = G0.F(date0);
        this.c.C(osKeyPathMapping0, s, g00);
        return this;
    }

    public RealmQuery D1(String s, String s1) {
        return this.E1(s, s1, io.realm.o.b);
    }

    public RealmQuery E(String s, @h Integer integer0) {
        this.b.k();
        OsKeyPathMapping osKeyPathMapping0 = this.b.e0().l();
        G0 g00 = G0.A(integer0);
        this.c.r(osKeyPathMapping0, s, g00);
        return this;
    }

    public RealmQuery E0(String s, UUID uUID0) {
        this.b.k();
        OsKeyPathMapping osKeyPathMapping0 = this.b.e0().l();
        G0 g00 = G0.G(uUID0);
        this.c.C(osKeyPathMapping0, s, g00);
        return this;
    }

    public RealmQuery E1(String s, String s1, io.realm.o o0) {
        Util.e(s1, "value");
        this.b.k();
        this.C1(s, G0.E(s1), o0);
        return this;
    }

    public RealmQuery F(String s, @h Long long0) {
        this.b.k();
        OsKeyPathMapping osKeyPathMapping0 = this.b.e0().l();
        G0 g00 = G0.B(long0);
        this.c.r(osKeyPathMapping0, s, g00);
        return this;
    }

    public RealmQuery F0(String s, Decimal128 decimal1280) {
        this.b.k();
        OsKeyPathMapping osKeyPathMapping0 = this.b.e0().l();
        G0 g00 = G0.H(decimal1280);
        this.c.C(osKeyPathMapping0, s, g00);
        return this;
    }

    public RealmQuery F1(long v) {
        this.b.k();
        this.c.O(v);
        return this;
    }

    public RealmQuery G(String s, @h Short short0) {
        this.b.k();
        OsKeyPathMapping osKeyPathMapping0 = this.b.e0().l();
        G0 g00 = G0.D(short0);
        this.c.r(osKeyPathMapping0, s, g00);
        return this;
    }

    public RealmQuery G0(String s, ObjectId objectId0) {
        this.b.k();
        OsKeyPathMapping osKeyPathMapping0 = this.b.e0().l();
        G0 g00 = G0.I(objectId0);
        this.c.C(osKeyPathMapping0, s, g00);
        return this;
    }

    @h
    public Number G1(String s) {
        this.b.k();
        this.b.f();
        long v = this.d.o(s);
        switch(this.a.I(v)) {
            case 1: {
                return this.c.T(v);
            }
            case 2: {
                return this.c.S(v);
            }
            case 3: {
                return this.c.R(v);
            }
            case 4: {
                return this.c.Q(v);
            }
            default: {
                throw new IllegalArgumentException(String.format(Locale.US, "Field \'%s\': type mismatch - %s expected.", s, "int, float or double"));
            }
        }
    }

    public RealmQuery H(String s, @h String s1) {
        this.b.k();
        OsKeyPathMapping osKeyPathMapping0 = this.b.e0().l();
        G0 g00 = G0.E(s1);
        this.c.r(osKeyPathMapping0, s, g00);
        return this;
    }

    public RealmQuery H0(String s, double f) {
        this.b.k();
        OsKeyPathMapping osKeyPathMapping0 = this.b.e0().l();
        G0 g00 = G0.y(f);
        this.c.D(osKeyPathMapping0, s, g00);
        return this;
    }

    public G0 H1(String s) {
        this.b.k();
        this.b.f();
        long v = this.d.o(s);
        NativeRealmAny nativeRealmAny0 = this.c.U(v);
        return new G0(J0.d(this.b, nativeRealmAny0));
    }

    public RealmQuery I(String s, @h Date date0) {
        this.b.k();
        OsKeyPathMapping osKeyPathMapping0 = this.b.e0().l();
        G0 g00 = G0.F(date0);
        this.c.r(osKeyPathMapping0, s, g00);
        return this;
    }

    public RealmQuery I0(String s, float f) {
        this.b.k();
        OsKeyPathMapping osKeyPathMapping0 = this.b.e0().l();
        G0 g00 = G0.z(f);
        this.c.D(osKeyPathMapping0, s, g00);
        return this;
    }

    @h
    public Date I1(String s) {
        this.b.k();
        this.b.f();
        long v = this.d.o(s);
        return this.c.P(v);
    }

    public RealmQuery J(String s, @h UUID uUID0) {
        this.b.k();
        OsKeyPathMapping osKeyPathMapping0 = this.b.e0().l();
        G0 g00 = G0.G(uUID0);
        this.c.r(osKeyPathMapping0, s, g00);
        return this;
    }

    public RealmQuery J0(String s, int v) {
        this.b.k();
        OsKeyPathMapping osKeyPathMapping0 = this.b.e0().l();
        G0 g00 = G0.A(v);
        this.c.D(osKeyPathMapping0, s, g00);
        return this;
    }

    @h
    public Number J1(String s) {
        this.b.k();
        this.b.f();
        long v = this.d.o(s);
        switch(this.a.I(v)) {
            case 1: {
                return this.c.Z(v);
            }
            case 2: {
                return this.c.Y(v);
            }
            case 3: {
                return this.c.X(v);
            }
            case 4: {
                return this.c.W(v);
            }
            default: {
                throw new IllegalArgumentException(String.format(Locale.US, "Field \'%s\': type mismatch - %s expected.", s, "int, float or double"));
            }
        }
    }

    public RealmQuery K(String s, @h Decimal128 decimal1280) {
        this.b.k();
        OsKeyPathMapping osKeyPathMapping0 = this.b.e0().l();
        G0 g00 = G0.H(decimal1280);
        this.c.r(osKeyPathMapping0, s, g00);
        return this;
    }

    public RealmQuery K0(String s, long v) {
        this.b.k();
        OsKeyPathMapping osKeyPathMapping0 = this.b.e0().l();
        G0 g00 = G0.B(v);
        this.c.D(osKeyPathMapping0, s, g00);
        return this;
    }

    public G0 K1(String s) {
        this.b.k();
        this.b.f();
        long v = this.d.o(s);
        NativeRealmAny nativeRealmAny0 = this.c.a0(v);
        return new G0(J0.d(this.b, nativeRealmAny0));
    }

    public RealmQuery L(String s, @h ObjectId objectId0) {
        this.b.k();
        OsKeyPathMapping osKeyPathMapping0 = this.b.e0().l();
        G0 g00 = G0.I(objectId0);
        this.c.r(osKeyPathMapping0, s, g00);
        return this;
    }

    public RealmQuery L0(String s, G0 g00) {
        this.b.k();
        OsKeyPathMapping osKeyPathMapping0 = this.b.e0().l();
        this.c.D(osKeyPathMapping0, s, g00);
        return this;
    }

    @h
    public Date L1(String s) {
        this.b.k();
        this.b.f();
        long v = this.d.o(s);
        return this.c.V(v);
    }

    public RealmQuery M(String s, @h byte[] arr_b) {
        this.b.k();
        OsKeyPathMapping osKeyPathMapping0 = this.b.e0().l();
        G0 g00 = G0.J(arr_b);
        this.c.r(osKeyPathMapping0, s, g00);
        return this;
    }

    public RealmQuery M0(String s, Date date0) {
        this.b.k();
        OsKeyPathMapping osKeyPathMapping0 = this.b.e0().l();
        G0 g00 = G0.F(date0);
        this.c.D(osKeyPathMapping0, s, g00);
        return this;
    }

    public RealmQuery M1() {
        this.b.k();
        this.c.b0();
        return this;
    }

    public long N() {
        this.b.k();
        this.b.f();
        return this.i1().f0();
    }

    public RealmQuery N0(String s, UUID uUID0) {
        this.b.k();
        OsKeyPathMapping osKeyPathMapping0 = this.b.e0().l();
        G0 g00 = G0.G(uUID0);
        this.c.D(osKeyPathMapping0, s, g00);
        return this;
    }

    public RealmQuery N1(String s, G0 g00) {
        this.b.k();
        this.O1(s, g00, io.realm.o.b);
        return this;
    }

    static RealmQuery O(E e0, String s) {
        return new RealmQuery(e0, s);
    }

    public RealmQuery O0(String s, Decimal128 decimal1280) {
        this.b.k();
        OsKeyPathMapping osKeyPathMapping0 = this.b.e0().l();
        G0 g00 = G0.H(decimal1280);
        this.c.D(osKeyPathMapping0, s, g00);
        return this;
    }

    public RealmQuery O1(String s, G0 g00, io.realm.o o0) {
        this.b.k();
        if(o0 == io.realm.o.b) {
            OsKeyPathMapping osKeyPathMapping0 = this.b.e0().l();
            this.c.c0(osKeyPathMapping0, s, g00);
            return this;
        }
        OsKeyPathMapping osKeyPathMapping1 = this.b.e0().l();
        this.c.d0(osKeyPathMapping1, s, g00);
        return this;
    }

    static RealmQuery P(F0 f00, Class class0) {
        return new RealmQuery(f00, class0);
    }

    public RealmQuery P0(String s, ObjectId objectId0) {
        this.b.k();
        OsKeyPathMapping osKeyPathMapping0 = this.b.e0().l();
        G0 g00 = G0.I(objectId0);
        this.c.D(osKeyPathMapping0, s, g00);
        return this;
    }

    public RealmQuery P1(String s, @h Boolean boolean0) {
        this.b.k();
        OsKeyPathMapping osKeyPathMapping0 = this.b.e0().l();
        G0 g00 = G0.w(boolean0);
        this.c.c0(osKeyPathMapping0, s, g00);
        return this;
    }

    static RealmQuery Q(T0 t00) {
        if(t00.a == null) {
            OsList osList0 = t00.r();
            return new RealmQuery(t00.d, osList0, t00.b);
        }
        OsList osList1 = t00.r();
        return new RealmQuery(t00.d, osList1, t00.a);
    }

    public RealmQuery Q0(String s, G0[] arr_g0) {
        this.b.k();
        if(arr_g0 != null && arr_g0.length != 0) {
            G0[] arr_g01 = new G0[arr_g0.length];
            for(int v = 0; v < arr_g0.length; ++v) {
                G0 g00 = arr_g0[v];
                if(g00 == null) {
                    g00 = G0.u();
                }
                arr_g01[v] = g00;
            }
            OsKeyPathMapping osKeyPathMapping0 = this.b.e0().l();
            this.c.E(osKeyPathMapping0, s, arr_g01);
            return this;
        }
        this.a();
        return this;
    }

    public RealmQuery Q1(String s, @h Byte byte0) {
        this.b.k();
        OsKeyPathMapping osKeyPathMapping0 = this.b.e0().l();
        G0 g00 = G0.x(byte0);
        this.c.c0(osKeyPathMapping0, s, g00);
        return this;
    }

    static RealmQuery R(g1 g10) {
        return g10.b == null ? new RealmQuery(g10, g10.c) : new RealmQuery(g10, g10.b);
    }

    public RealmQuery R0(String s, @h Boolean[] arr_boolean) {
        this.b.k();
        if(arr_boolean != null && arr_boolean.length != 0) {
            G0[] arr_g0 = new G0[arr_boolean.length];
            for(int v = 0; v < arr_boolean.length; ++v) {
                arr_g0[v] = G0.w(arr_boolean[v]);
            }
            OsKeyPathMapping osKeyPathMapping0 = this.b.e0().l();
            this.c.E(osKeyPathMapping0, s, arr_g0);
            return this;
        }
        this.a();
        return this;
    }

    public RealmQuery R1(String s, @h Double double0) {
        this.b.k();
        OsKeyPathMapping osKeyPathMapping0 = this.b.e0().l();
        G0 g00 = G0.y(double0);
        this.c.c0(osKeyPathMapping0, s, g00);
        return this;
    }

    private g1 S(TableQuery tableQuery0, boolean z) {
        OsResults osResults0 = OsResults.l(this.b.e, tableQuery0);
        g1 g10 = this.c1() ? new g1(this.b, osResults0, this.f) : new g1(this.b, osResults0, this.e);
        if(z) {
            g10.w();
        }
        return g10;
    }

    public RealmQuery S0(String s, @h Byte[] arr_byte) {
        this.b.k();
        if(arr_byte != null && arr_byte.length != 0) {
            G0[] arr_g0 = new G0[arr_byte.length];
            for(int v = 0; v < arr_byte.length; ++v) {
                arr_g0[v] = G0.x(arr_byte[v]);
            }
            OsKeyPathMapping osKeyPathMapping0 = this.b.e0().l();
            this.c.E(osKeyPathMapping0, s, arr_g0);
            return this;
        }
        this.a();
        return this;
    }

    public RealmQuery S1(String s, @h Float float0) {
        this.b.k();
        OsKeyPathMapping osKeyPathMapping0 = this.b.e0().l();
        G0 g00 = G0.z(float0);
        this.c.c0(osKeyPathMapping0, s, g00);
        return this;
    }

    public RealmQuery T(String s, String[] arr_s) {
        this.b.k();
        String[] arr_s1 = new String[arr_s.length + 1];
        arr_s1[0] = s;
        for(int v = 0; v < arr_s.length; ++v) {
            arr_s1[v + 1] = arr_s[v];
        }
        OsKeyPathMapping osKeyPathMapping0 = this.b.e0().l();
        this.c.t(osKeyPathMapping0, arr_s1);
        return this;
    }

    public RealmQuery T0(String s, @h Double[] arr_double) {
        this.b.k();
        if(arr_double != null && arr_double.length != 0) {
            G0[] arr_g0 = new G0[arr_double.length];
            for(int v = 0; v < arr_double.length; ++v) {
                arr_g0[v] = G0.y(arr_double[v]);
            }
            OsKeyPathMapping osKeyPathMapping0 = this.b.e0().l();
            this.c.E(osKeyPathMapping0, s, arr_g0);
            return this;
        }
        this.a();
        return this;
    }

    public RealmQuery T1(String s, @h Integer integer0) {
        this.b.k();
        OsKeyPathMapping osKeyPathMapping0 = this.b.e0().l();
        G0 g00 = G0.A(integer0);
        this.c.c0(osKeyPathMapping0, s, g00);
        return this;
    }

    public RealmQuery U() {
        this.b.k();
        this.c.u();
        return this;
    }

    public RealmQuery U0(String s, @h Float[] arr_float) {
        this.b.k();
        if(arr_float != null && arr_float.length != 0) {
            G0[] arr_g0 = new G0[arr_float.length];
            for(int v = 0; v < arr_float.length; ++v) {
                arr_g0[v] = G0.z(arr_float[v]);
            }
            OsKeyPathMapping osKeyPathMapping0 = this.b.e0().l();
            this.c.E(osKeyPathMapping0, s, arr_g0);
            return this;
        }
        this.a();
        return this;
    }

    public RealmQuery U1(String s, @h Long long0) {
        this.b.k();
        OsKeyPathMapping osKeyPathMapping0 = this.b.e0().l();
        G0 g00 = G0.B(long0);
        this.c.c0(osKeyPathMapping0, s, g00);
        return this;
    }

    public RealmQuery V(String s, G0 g00) {
        return this.W(s, g00, io.realm.o.b);
    }

    public RealmQuery V0(String s, @h Integer[] arr_integer) {
        this.b.k();
        if(arr_integer != null && arr_integer.length != 0) {
            G0[] arr_g0 = new G0[arr_integer.length];
            for(int v = 0; v < arr_integer.length; ++v) {
                arr_g0[v] = G0.A(arr_integer[v]);
            }
            OsKeyPathMapping osKeyPathMapping0 = this.b.e0().l();
            this.c.E(osKeyPathMapping0, s, arr_g0);
            return this;
        }
        this.a();
        return this;
    }

    public RealmQuery V1(String s, @h Short short0) {
        this.b.k();
        OsKeyPathMapping osKeyPathMapping0 = this.b.e0().l();
        G0 g00 = G0.D(short0);
        this.c.c0(osKeyPathMapping0, s, g00);
        return this;
    }

    public RealmQuery W(String s, G0 g00, io.realm.o o0) {
        this.b.k();
        if(o0 == io.realm.o.b) {
            OsKeyPathMapping osKeyPathMapping0 = this.b.e0().l();
            this.c.v(osKeyPathMapping0, s, g00);
            return this;
        }
        OsKeyPathMapping osKeyPathMapping1 = this.b.e0().l();
        this.c.w(osKeyPathMapping1, s, g00);
        return this;
    }

    public RealmQuery W0(String s, @h Long[] arr_long) {
        this.b.k();
        if(arr_long != null && arr_long.length != 0) {
            G0[] arr_g0 = new G0[arr_long.length];
            for(int v = 0; v < arr_long.length; ++v) {
                arr_g0[v] = G0.B(arr_long[v]);
            }
            OsKeyPathMapping osKeyPathMapping0 = this.b.e0().l();
            this.c.E(osKeyPathMapping0, s, arr_g0);
            return this;
        }
        this.a();
        return this;
    }

    public RealmQuery W1(String s, @h String s1) {
        return this.X1(s, s1, io.realm.o.b);
    }

    public RealmQuery X(String s, String s1) {
        return this.Y(s, s1, io.realm.o.b);
    }

    public RealmQuery X0(String s, @h Short[] arr_short) {
        this.b.k();
        if(arr_short != null && arr_short.length != 0) {
            G0[] arr_g0 = new G0[arr_short.length];
            for(int v = 0; v < arr_short.length; ++v) {
                arr_g0[v] = G0.D(arr_short[v]);
            }
            OsKeyPathMapping osKeyPathMapping0 = this.b.e0().l();
            this.c.E(osKeyPathMapping0, s, arr_g0);
            return this;
        }
        this.a();
        return this;
    }

    public RealmQuery X1(String s, @h String s1, io.realm.o o0) {
        this.b.k();
        this.O1(s, G0.E(s1), o0);
        return this;
    }

    public RealmQuery Y(String s, String s1, io.realm.o o0) {
        Util.e(s1, "value");
        this.b.k();
        this.W(s, G0.E(s1), o0);
        return this;
    }

    public RealmQuery Y0(String s, @h String[] arr_s) {
        return this.Z0(s, arr_s, io.realm.o.b);
    }

    public RealmQuery Y1(String s, @h Date date0) {
        this.b.k();
        OsKeyPathMapping osKeyPathMapping0 = this.b.e0().l();
        G0 g00 = G0.F(date0);
        this.c.c0(osKeyPathMapping0, s, g00);
        return this;
    }

    public RealmQuery Z(String s, G0 g00) {
        this.b.k();
        OsKeyPathMapping osKeyPathMapping0 = this.b.e0().l();
        this.c.x(osKeyPathMapping0, s, g00);
        return this;
    }

    public RealmQuery Z0(String s, @h String[] arr_s, io.realm.o o0) {
        this.b.k();
        if(arr_s != null && arr_s.length != 0) {
            G0[] arr_g0 = new G0[arr_s.length];
            for(int v = 0; v < arr_s.length; ++v) {
                String s1 = arr_s[v];
                arr_g0[v] = s1 == null ? null : G0.E(s1);
            }
            if(o0 == io.realm.o.b) {
                OsKeyPathMapping osKeyPathMapping0 = this.b.e0().l();
                this.c.E(osKeyPathMapping0, s, arr_g0);
                return this;
            }
            OsKeyPathMapping osKeyPathMapping1 = this.b.e0().l();
            this.c.F(osKeyPathMapping1, s, arr_g0);
            return this;
        }
        this.a();
        return this;
    }

    public RealmQuery Z1(String s, UUID uUID0) {
        this.b.k();
        OsKeyPathMapping osKeyPathMapping0 = this.b.e0().l();
        G0 g00 = G0.G(uUID0);
        this.c.c0(osKeyPathMapping0, s, g00);
        return this;
    }

    public RealmQuery a() {
        this.b.k();
        this.c.a();
        return this;
    }

    public RealmQuery a0(String s, G0 g00, io.realm.o o0) {
        this.b.k();
        if(o0 == io.realm.o.b) {
            OsKeyPathMapping osKeyPathMapping0 = this.b.e0().l();
            this.c.x(osKeyPathMapping0, s, g00);
            return this;
        }
        OsKeyPathMapping osKeyPathMapping1 = this.b.e0().l();
        this.c.y(osKeyPathMapping1, s, g00);
        return this;
    }

    public RealmQuery a1(String s, @h Date[] arr_date) {
        this.b.k();
        if(arr_date != null && arr_date.length != 0) {
            G0[] arr_g0 = new G0[arr_date.length];
            for(int v = 0; v < arr_date.length; ++v) {
                arr_g0[v] = G0.F(arr_date[v]);
            }
            OsKeyPathMapping osKeyPathMapping0 = this.b.e0().l();
            this.c.E(osKeyPathMapping0, s, arr_g0);
            return this;
        }
        this.a();
        return this;
    }

    public RealmQuery a2(String s, Decimal128 decimal1280) {
        this.b.k();
        OsKeyPathMapping osKeyPathMapping0 = this.b.e0().l();
        G0 g00 = G0.H(decimal1280);
        this.c.c0(osKeyPathMapping0, s, g00);
        return this;
    }

    public RealmQuery b() {
        this.b.k();
        this.c.b();
        return this;
    }

    public RealmQuery b0(String s, @h Boolean boolean0) {
        this.b.k();
        OsKeyPathMapping osKeyPathMapping0 = this.b.e0().l();
        G0 g00 = G0.w(boolean0);
        this.c.x(osKeyPathMapping0, s, g00);
        return this;
    }

    private static boolean b1(Class class0) {
        return X0.class.isAssignableFrom(class0);
    }

    public RealmQuery b2(String s, ObjectId objectId0) {
        this.b.k();
        OsKeyPathMapping osKeyPathMapping0 = this.b.e0().l();
        G0 g00 = G0.I(objectId0);
        this.c.c0(osKeyPathMapping0, s, g00);
        return this;
    }

    public RealmQuery c() {
        this.b.k();
        return this;
    }

    public RealmQuery c0(String s, @h Byte byte0) {
        this.b.k();
        OsKeyPathMapping osKeyPathMapping0 = this.b.e0().l();
        G0 g00 = G0.x(byte0);
        this.c.x(osKeyPathMapping0, s, g00);
        return this;
    }

    private boolean c1() {
        return this.f != null;
    }

    public RealmQuery c2(String s, @h byte[] arr_b) {
        this.b.k();
        OsKeyPathMapping osKeyPathMapping0 = this.b.e0().l();
        G0 g00 = G0.J(arr_b);
        this.c.c0(osKeyPathMapping0, s, g00);
        return this;
    }

    public double d(String s) {
        this.b.k();
        this.b.f();
        long v = this.d.o(s);
        int v1 = a.a[this.a.I(v).ordinal()];
        switch(v1) {
            case 1: {
                return this.c.f(v);
            }
            case 2: {
                return this.c.e(v);
            }
            default: {
                if(v1 != 3) {
                    throw new IllegalArgumentException(String.format(Locale.US, "Field \'%s\': type mismatch - %s expected.", s, "int, float or double. For Decimal128 use `averageDecimal128` method."));
                }
                return this.c.d(v);
            }
        }
    }

    public RealmQuery d0(String s, @h Double double0) {
        this.b.k();
        OsKeyPathMapping osKeyPathMapping0 = this.b.e0().l();
        G0 g00 = G0.y(double0);
        this.c.x(osKeyPathMapping0, s, g00);
        return this;
    }

    public RealmQuery d1(String s) {
        this.b.k();
        OsKeyPathMapping osKeyPathMapping0 = this.b.e0().l();
        this.c.G(osKeyPathMapping0, s);
        return this;
    }

    public RealmQuery d2() {
        this.b.k();
        this.c.e0();
        return this;
    }

    @h
    public Decimal128 e(String s) {
        this.b.k();
        this.b.f();
        long v = this.d.o(s);
        return this.c.c(v);
    }

    public RealmQuery e0(String s, @h Float float0) {
        this.b.k();
        OsKeyPathMapping osKeyPathMapping0 = this.b.e0().l();
        G0 g00 = G0.z(float0);
        this.c.x(osKeyPathMapping0, s, g00);
        return this;
    }

    public RealmQuery e1(String s) {
        this.b.k();
        OsKeyPathMapping osKeyPathMapping0 = this.b.e0().l();
        this.c.H(osKeyPathMapping0, s);
        return this;
    }

    public RealmQuery e2(String s, Object[] arr_object) {
        this.b.k();
        if(!Util.l(s)) {
            G0[] arr_g0 = new G0[arr_object.length];
            for(int v = 0; v < arr_object.length; ++v) {
                arr_g0[v] = G0.C(arr_object[v]);
            }
            try {
                OsKeyPathMapping osKeyPathMapping0 = this.b.e0().l();
                this.c.g0(osKeyPathMapping0, s, arr_g0);
                return this;
            }
            catch(IllegalArgumentException illegalArgumentException0) {
                if(!illegalArgumentException0.getMessage().startsWith("Illegal Argument: Request for argument at index")) {
                    throw illegalArgumentException0;
                }
                throw new IllegalStateException(illegalArgumentException0.getMessage());
            }
        }
        throw new IllegalArgumentException("Non-null \'predicate\' required.");
    }

    @h
    public Decimal128 f(String s) {
        this.b.k();
        this.b.f();
        long v = this.d.o(s);
        return this.c.g(v);
    }

    public RealmQuery f0(String s, @h Integer integer0) {
        this.b.k();
        OsKeyPathMapping osKeyPathMapping0 = this.b.e0().l();
        G0 g00 = G0.A(integer0);
        this.c.x(osKeyPathMapping0, s, g00);
        return this;
    }

    public RealmQuery f1(String s) {
        this.b.k();
        OsKeyPathMapping osKeyPathMapping0 = this.b.e0().l();
        this.c.I(osKeyPathMapping0, s);
        return this;
    }

    public RealmQuery f2(String s) {
        this.b.k();
        return this.g2(s, r1.b);
    }

    public RealmQuery g() {
        this.b.k();
        this.c.h();
        return this;
    }

    public RealmQuery g0(String s, @h Long long0) {
        this.b.k();
        OsKeyPathMapping osKeyPathMapping0 = this.b.e0().l();
        G0 g00 = G0.B(long0);
        this.c.x(osKeyPathMapping0, s, g00);
        return this;
    }

    public RealmQuery g1(String s) {
        this.b.k();
        OsKeyPathMapping osKeyPathMapping0 = this.b.e0().l();
        this.c.J(osKeyPathMapping0, s);
        return this;
    }

    public RealmQuery g2(String s, r1 r10) {
        this.b.k();
        return this.i2(new String[]{s}, new r1[]{r10});
    }

    public RealmQuery h(String s, G0 g00) {
        return this.i(s, g00, io.realm.o.b);
    }

    public RealmQuery h0(String s, @h Short short0) {
        this.b.k();
        OsKeyPathMapping osKeyPathMapping0 = this.b.e0().l();
        G0 g00 = G0.D(short0);
        this.c.x(osKeyPathMapping0, s, g00);
        return this;
    }

    public boolean h1() {
        if(this.b != null && !this.b.isClosed()) {
            return this.h == null ? this.a != null && this.a.f0() : this.h.s();
        }
        return false;
    }

    public RealmQuery h2(String s, r1 r10, String s1, r1 r11) {
        this.b.k();
        return this.i2(new String[]{s, s1}, new r1[]{r10, r11});
    }

    public RealmQuery i(String s, G0 g00, io.realm.o o0) {
        this.b.k();
        if(o0 == io.realm.o.b) {
            OsKeyPathMapping osKeyPathMapping0 = this.b.e0().l();
            this.c.i(osKeyPathMapping0, s, g00);
            return this;
        }
        OsKeyPathMapping osKeyPathMapping1 = this.b.e0().l();
        this.c.j(osKeyPathMapping1, s, g00);
        return this;
    }

    public RealmQuery i0(String s, @h String s1) {
        return this.j0(s, s1, io.realm.o.b);
    }

    private OsResults i1() {
        this.b.k();
        return this.S(this.c, false).d;
    }

    public RealmQuery i2(String[] arr_s, r1[] arr_r1) {
        if(arr_r1 == null || arr_r1.length == 0) {
            throw new IllegalArgumentException("You must provide at least one sort order.");
        }
        if(arr_s.length != arr_r1.length) {
            throw new IllegalArgumentException("Number of fields and sort orders do not match.");
        }
        this.b.k();
        OsKeyPathMapping osKeyPathMapping0 = this.b.e0().l();
        this.c.j0(osKeyPathMapping0, arr_s, arr_r1);
        return this;
    }

    public RealmQuery j(String s, String s1) {
        return this.k(s, s1, io.realm.o.b);
    }

    public RealmQuery j0(String s, @h String s1, io.realm.o o0) {
        this.b.k();
        this.a0(s, G0.E(s1), o0);
        return this;
    }

    public RealmQuery j1(String s, double f) {
        this.b.k();
        OsKeyPathMapping osKeyPathMapping0 = this.b.e0().l();
        G0 g00 = G0.y(f);
        this.c.K(osKeyPathMapping0, s, g00);
        return this;
    }

    public Number j2(String s) {
        this.b.k();
        this.b.f();
        long v = this.d.o(s);
        switch(this.a.I(v)) {
            case 1: {
                return this.c.n0(v);
            }
            case 2: {
                return this.c.m0(v);
            }
            case 3: {
                return this.c.l0(v);
            }
            case 4: {
                return this.c.k0(v);
            }
            case 5: {
                return this.c.o0(v);
            }
            default: {
                throw new IllegalArgumentException(String.format(Locale.US, "Field \'%s\': type mismatch - %s expected.", s, "int, float or double"));
            }
        }
    }

    public RealmQuery k(String s, String s1, io.realm.o o0) {
        Util.e(s1, "value");
        this.b.k();
        this.i(s, G0.E(s1), o0);
        return this;
    }

    public RealmQuery k0(String s, @h Date date0) {
        this.b.k();
        OsKeyPathMapping osKeyPathMapping0 = this.b.e0().l();
        G0 g00 = G0.F(date0);
        this.c.x(osKeyPathMapping0, s, g00);
        return this;
    }

    public RealmQuery k1(String s, float f) {
        this.b.k();
        OsKeyPathMapping osKeyPathMapping0 = this.b.e0().l();
        G0 g00 = G0.z(f);
        this.c.K(osKeyPathMapping0, s, g00);
        return this;
    }

    public RealmQuery l(String s, double f, double f1) {
        this.b.k();
        OsKeyPathMapping osKeyPathMapping0 = this.b.e0().l();
        G0 g00 = G0.y(f);
        G0 g01 = G0.y(f1);
        this.c.k(osKeyPathMapping0, s, g00, g01);
        return this;
    }

    public RealmQuery l0(String s, @h UUID uUID0) {
        this.b.k();
        OsKeyPathMapping osKeyPathMapping0 = this.b.e0().l();
        G0 g00 = G0.G(uUID0);
        this.c.x(osKeyPathMapping0, s, g00);
        return this;
    }

    public RealmQuery l1(String s, int v) {
        this.b.k();
        OsKeyPathMapping osKeyPathMapping0 = this.b.e0().l();
        G0 g00 = G0.A(v);
        this.c.K(osKeyPathMapping0, s, g00);
        return this;
    }

    public RealmQuery m(String s, float f, float f1) {
        this.b.k();
        OsKeyPathMapping osKeyPathMapping0 = this.b.e0().l();
        G0 g00 = G0.z(f);
        G0 g01 = G0.z(f1);
        this.c.k(osKeyPathMapping0, s, g00, g01);
        return this;
    }

    public RealmQuery m0(String s, @h Decimal128 decimal1280) {
        this.b.k();
        OsKeyPathMapping osKeyPathMapping0 = this.b.e0().l();
        G0 g00 = G0.H(decimal1280);
        this.c.x(osKeyPathMapping0, s, g00);
        return this;
    }

    public RealmQuery m1(String s, long v) {
        this.b.k();
        OsKeyPathMapping osKeyPathMapping0 = this.b.e0().l();
        G0 g00 = G0.B(v);
        this.c.K(osKeyPathMapping0, s, g00);
        return this;
    }

    public RealmQuery n(String s, int v, int v1) {
        this.b.k();
        OsKeyPathMapping osKeyPathMapping0 = this.b.e0().l();
        G0 g00 = G0.A(v);
        G0 g01 = G0.A(v1);
        this.c.k(osKeyPathMapping0, s, g00, g01);
        return this;
    }

    public RealmQuery n0(String s, @h ObjectId objectId0) {
        this.b.k();
        OsKeyPathMapping osKeyPathMapping0 = this.b.e0().l();
        G0 g00 = G0.I(objectId0);
        this.c.x(osKeyPathMapping0, s, g00);
        return this;
    }

    public RealmQuery n1(String s, G0 g00) {
        this.b.k();
        OsKeyPathMapping osKeyPathMapping0 = this.b.e0().l();
        this.c.K(osKeyPathMapping0, s, g00);
        return this;
    }

    private static native String nativeSerializeQuery(long arg0) {
    }

    public RealmQuery o(String s, long v, long v1) {
        this.b.k();
        OsKeyPathMapping osKeyPathMapping0 = this.b.e0().l();
        G0 g00 = G0.B(v);
        G0 g01 = G0.B(v1);
        this.c.k(osKeyPathMapping0, s, g00, g01);
        return this;
    }

    public RealmQuery o0(String s, @h byte[] arr_b) {
        this.b.k();
        OsKeyPathMapping osKeyPathMapping0 = this.b.e0().l();
        G0 g00 = G0.J(arr_b);
        this.c.x(osKeyPathMapping0, s, g00);
        return this;
    }

    public RealmQuery o1(String s, Date date0) {
        this.b.k();
        OsKeyPathMapping osKeyPathMapping0 = this.b.e0().l();
        G0 g00 = G0.F(date0);
        this.c.K(osKeyPathMapping0, s, g00);
        return this;
    }

    public RealmQuery p(String s, G0 g00, G0 g01) {
        this.b.k();
        OsKeyPathMapping osKeyPathMapping0 = this.b.e0().l();
        this.c.k(osKeyPathMapping0, s, g00, g01);
        return this;
    }

    public g1 p0() {
        this.b.k();
        this.b.f();
        return this.S(this.c, true);
    }

    public RealmQuery p1(String s, UUID uUID0) {
        this.b.k();
        OsKeyPathMapping osKeyPathMapping0 = this.b.e0().l();
        G0 g00 = G0.G(uUID0);
        this.c.K(osKeyPathMapping0, s, g00);
        return this;
    }

    public RealmQuery q(String s, Date date0, Date date1) {
        this.b.k();
        OsKeyPathMapping osKeyPathMapping0 = this.b.e0().l();
        G0 g00 = G0.F(date0);
        G0 g01 = G0.F(date1);
        this.c.k(osKeyPathMapping0, s, g00, g01);
        return this;
    }

    public g1 q0() {
        this.b.k();
        this.b.e.capabilities.c("Async query cannot be created on current thread.");
        return this.S(this.c, false);
    }

    public RealmQuery q1(String s, Decimal128 decimal1280) {
        this.b.k();
        OsKeyPathMapping osKeyPathMapping0 = this.b.e0().l();
        G0 g00 = G0.H(decimal1280);
        this.c.K(osKeyPathMapping0, s, g00);
        return this;
    }

    public RealmQuery r(String s, Decimal128 decimal1280, Decimal128 decimal1281) {
        this.b.k();
        OsKeyPathMapping osKeyPathMapping0 = this.b.e0().l();
        G0 g00 = G0.H(decimal1280);
        G0 g01 = G0.H(decimal1281);
        this.c.k(osKeyPathMapping0, s, g00, g01);
        return this;
    }

    @h
    public Object r0() {
        this.b.k();
        this.b.f();
        if(this.g) {
            return null;
        }
        long v = this.w0();
        return v < 0L ? null : this.b.Q(this.e, this.f, v);
    }

    public RealmQuery r1(String s, ObjectId objectId0) {
        this.b.k();
        OsKeyPathMapping osKeyPathMapping0 = this.b.e0().l();
        G0 g00 = G0.I(objectId0);
        this.c.K(osKeyPathMapping0, s, g00);
        return this;
    }

    public RealmQuery s(String s, G0 g00) {
        return this.t(s, g00, io.realm.o.b);
    }

    public Object s0() {
        X0 x00;
        UncheckedRow uncheckedRow0;
        this.b.k();
        if(this.g) {
            throw new UnsupportedOperationException("findFirstAsync() available only when type parameter \'E\' is implementing RealmModel.");
        }
        this.b.e.capabilities.c("Async query cannot be created on current thread.");
        if(this.b.E0()) {
            uncheckedRow0 = OsResults.l(this.b.e, this.c).r();
        }
        else {
            OsSharedRealm osSharedRealm0 = this.b.e;
            boolean z = this.c1();
            uncheckedRow0 = new p(osSharedRealm0, this.c, z);
        }
        if(this.c1()) {
            x00 = new G(this.b, uncheckedRow0);
        }
        else {
            Class class0 = this.e;
            t t0 = this.b.T().s();
            c c0 = this.b.e0().j(class0);
            List list0 = Collections.emptyList();
            x00 = t0.x(class0, this.b, uncheckedRow0, c0, false, list0);
        }
        if(uncheckedRow0 instanceof p) {
            ((p)uncheckedRow0).x(((s)x00).R3());
        }
        return x00;
    }

    public RealmQuery s1(String s, double f) {
        this.b.k();
        OsKeyPathMapping osKeyPathMapping0 = this.b.e0().l();
        G0 g00 = G0.y(f);
        this.c.L(osKeyPathMapping0, s, g00);
        return this;
    }

    public RealmQuery t(String s, G0 g00, io.realm.o o0) {
        this.b.k();
        if(o0 == io.realm.o.b) {
            OsKeyPathMapping osKeyPathMapping0 = this.b.e0().l();
            this.c.n(osKeyPathMapping0, s, g00);
            return this;
        }
        OsKeyPathMapping osKeyPathMapping1 = this.b.e0().l();
        this.c.p(osKeyPathMapping1, s, g00);
        return this;
    }

    public String t0() {
        this.c.q0();
        return RealmQuery.nativeSerializeQuery(this.c.getNativePtr());
    }

    public RealmQuery t1(String s, float f) {
        this.b.k();
        OsKeyPathMapping osKeyPathMapping0 = this.b.e0().l();
        G0 g00 = G0.z(f);
        this.c.L(osKeyPathMapping0, s, g00);
        return this;
    }

    public RealmQuery u(String s, String s1) {
        return this.v(s, s1, io.realm.o.b);
    }

    public long u0() {
        return this.c.getNativePtr();
    }

    public RealmQuery u1(String s, int v) {
        this.b.k();
        OsKeyPathMapping osKeyPathMapping0 = this.b.e0().l();
        G0 g00 = G0.A(v);
        this.c.L(osKeyPathMapping0, s, g00);
        return this;
    }

    public RealmQuery v(String s, String s1, io.realm.o o0) {
        Util.e(s1, "value");
        this.b.k();
        this.t(s, G0.E(s1), o0);
        return this;
    }

    public F0 v0() {
        io.realm.a a0 = this.b;
        if(a0 == null) {
            return null;
        }
        a0.k();
        io.realm.a a1 = this.b;
        if(!(a1 instanceof F0)) {
            throw new IllegalStateException("This method is only available for typed Realms");
        }
        return (F0)a1;
    }

    public RealmQuery v1(String s, long v) {
        this.b.k();
        OsKeyPathMapping osKeyPathMapping0 = this.b.e0().l();
        G0 g00 = G0.B(v);
        this.c.L(osKeyPathMapping0, s, g00);
        return this;
    }

    public RealmQuery w(String s, Map.Entry map$Entry0) {
        Util.e(map$Entry0, "entry");
        this.b.k();
        OsKeyPathMapping osKeyPathMapping0 = this.b.e0().l();
        G0 g00 = G0.E(((String)map$Entry0.getKey()));
        G0 g01 = G0.C(map$Entry0.getValue());
        this.c.o(osKeyPathMapping0, s, g00, g01);
        return this;
    }

    private long w0() {
        return this.c.A();
    }

    public RealmQuery w1(String s, G0 g00) {
        this.b.k();
        OsKeyPathMapping osKeyPathMapping0 = this.b.e0().l();
        this.c.L(osKeyPathMapping0, s, g00);
        return this;
    }

    public RealmQuery x(String s, @h String s1) {
        this.b.k();
        OsKeyPathMapping osKeyPathMapping0 = this.b.e0().l();
        G0 g00 = G0.E(s1);
        this.c.q(osKeyPathMapping0, s, g00);
        return this;
    }

    public String x0() {
        return this.a.C();
    }

    public RealmQuery x1(String s, Date date0) {
        this.b.k();
        OsKeyPathMapping osKeyPathMapping0 = this.b.e0().l();
        G0 g00 = G0.F(date0);
        this.c.L(osKeyPathMapping0, s, g00);
        return this;
    }

    public RealmQuery y(String s, G0 g00) {
        this.b.k();
        OsKeyPathMapping osKeyPathMapping0 = this.b.e0().l();
        this.c.r(osKeyPathMapping0, s, g00);
        return this;
    }

    public RealmQuery y0(String s, double f) {
        this.b.k();
        OsKeyPathMapping osKeyPathMapping0 = this.b.e0().l();
        G0 g00 = G0.y(f);
        this.c.C(osKeyPathMapping0, s, g00);
        return this;
    }

    public RealmQuery y1(String s, UUID uUID0) {
        this.b.k();
        OsKeyPathMapping osKeyPathMapping0 = this.b.e0().l();
        G0 g00 = G0.G(uUID0);
        this.c.L(osKeyPathMapping0, s, g00);
        return this;
    }

    public RealmQuery z(String s, X0 x00) {
        this.b.k();
        OsKeyPathMapping osKeyPathMapping0 = this.b.e0().l();
        G0 g00 = G0.v(x00);
        this.c.r(osKeyPathMapping0, s, g00);
        return this;
    }

    public RealmQuery z0(String s, float f) {
        this.b.k();
        OsKeyPathMapping osKeyPathMapping0 = this.b.e0().l();
        G0 g00 = G0.z(f);
        this.c.C(osKeyPathMapping0, s, g00);
        return this;
    }

    public RealmQuery z1(String s, Decimal128 decimal1280) {
        this.b.k();
        OsKeyPathMapping osKeyPathMapping0 = this.b.e0().l();
        G0 g00 = G0.H(decimal1280);
        this.c.L(osKeyPathMapping0, s, g00);
        return this;
    }
}

