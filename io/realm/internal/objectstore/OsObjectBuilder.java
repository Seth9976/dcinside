package io.realm.internal.objectstore;

import io.realm.G0;
import io.realm.I0;
import io.realm.R0;
import io.realm.T0;
import io.realm.W;
import io.realm.X0;
import io.realm.i1;
import io.realm.internal.OsSharedRealm;
import io.realm.internal.Table;
import io.realm.internal.UncheckedRow;
import io.realm.internal.s;
import io.realm.l0;
import java.io.Closeable;
import java.util.Date;
import java.util.List;
import java.util.Map.Entry;
import java.util.Set;
import java.util.UUID;
import org.bson.types.Decimal128;
import org.bson.types.ObjectId;

public class OsObjectBuilder implements Closeable {
    class A implements S {
        A() {
            super();
        }

        @Override  // io.realm.internal.objectstore.OsObjectBuilder$S
        public void a(long v, Object object0) {
            this.b(v, ((Long)object0));
        }

        public void b(long v, Long long0) {
            OsObjectBuilder.nativeAddIntegerSetItem(v, ((long)long0));
        }
    }

    class B implements S {
        B() {
            super();
        }

        @Override  // io.realm.internal.objectstore.OsObjectBuilder$S
        public void a(long v, Object object0) {
            this.b(v, ((Short)object0));
        }

        public void b(long v, Short short0) {
            OsObjectBuilder.nativeAddIntegerSetItem(v, ((short)short0));
        }
    }

    class C implements S {
        C() {
            super();
        }

        @Override  // io.realm.internal.objectstore.OsObjectBuilder$S
        public void a(long v, Object object0) {
            this.b(v, ((Byte)object0));
        }

        public void b(long v, Byte byte0) {
            OsObjectBuilder.nativeAddIntegerSetItem(v, ((byte)byte0));
        }
    }

    class D implements S {
        D() {
            super();
        }

        @Override  // io.realm.internal.objectstore.OsObjectBuilder$S
        public void a(long v, Object object0) {
            this.b(v, ((Float)object0));
        }

        public void b(long v, Float float0) {
            OsObjectBuilder.nativeAddFloatSetItem(v, ((float)float0));
        }
    }

    class E implements S {
        E() {
            super();
        }

        @Override  // io.realm.internal.objectstore.OsObjectBuilder$S
        public void a(long v, Object object0) {
            this.b(v, ((Double)object0));
        }

        public void b(long v, Double double0) {
            OsObjectBuilder.nativeAddDoubleSetItem(v, ((double)double0));
        }
    }

    class F implements S {
        F() {
            super();
        }

        @Override  // io.realm.internal.objectstore.OsObjectBuilder$S
        public void a(long v, Object object0) {
            this.b(v, ((byte[])object0));
        }

        public void b(long v, byte[] arr_b) {
            OsObjectBuilder.nativeAddByteArraySetItem(v, arr_b);
        }
    }

    class G implements S {
        G() {
            super();
        }

        @Override  // io.realm.internal.objectstore.OsObjectBuilder$S
        public void a(long v, Object object0) {
            this.b(v, ((Byte)object0));
        }

        public void b(long v, Byte byte0) {
            OsObjectBuilder.nativeAddIntegerListItem(v, byte0.longValue());
        }
    }

    class H implements S {
        H() {
            super();
        }

        @Override  // io.realm.internal.objectstore.OsObjectBuilder$S
        public void a(long v, Object object0) {
            this.b(v, ((Date)object0));
        }

        public void b(long v, Date date0) {
            OsObjectBuilder.nativeAddDateSetItem(v, date0.getTime());
        }
    }

    class I implements S {
        I() {
            super();
        }

        @Override  // io.realm.internal.objectstore.OsObjectBuilder$S
        public void a(long v, Object object0) {
            this.b(v, ((Decimal128)object0));
        }

        public void b(long v, Decimal128 decimal1280) {
            OsObjectBuilder.nativeAddDecimal128SetItem(v, decimal1280.i(), decimal1280.h());
        }
    }

    class J implements S {
        J() {
            super();
        }

        @Override  // io.realm.internal.objectstore.OsObjectBuilder$S
        public void a(long v, Object object0) {
            this.b(v, ((ObjectId)object0));
        }

        public void b(long v, ObjectId objectId0) {
            OsObjectBuilder.nativeAddObjectIdSetItem(v, "68bb2a024ddf73643ff6fa13");
        }
    }

    class K implements S {
        K() {
            super();
        }

        @Override  // io.realm.internal.objectstore.OsObjectBuilder$S
        public void a(long v, Object object0) {
            this.b(v, ((UUID)object0));
        }

        public void b(long v, UUID uUID0) {
            OsObjectBuilder.nativeAddUUIDSetItem(v, uUID0.toString());
        }
    }

    class M implements S {
        M() {
            super();
        }

        @Override  // io.realm.internal.objectstore.OsObjectBuilder$S
        public void a(long v, Object object0) {
            this.b(v, ((Short)object0));
        }

        public void b(long v, Short short0) {
            OsObjectBuilder.nativeAddIntegerListItem(v, ((short)short0));
        }
    }

    class N implements S {
        N() {
            super();
        }

        @Override  // io.realm.internal.objectstore.OsObjectBuilder$S
        public void a(long v, Object object0) {
            this.b(v, ((Integer)object0));
        }

        public void b(long v, Integer integer0) {
            OsObjectBuilder.nativeAddIntegerListItem(v, ((int)integer0));
        }
    }

    class O implements S {
        O() {
            super();
        }

        @Override  // io.realm.internal.objectstore.OsObjectBuilder$S
        public void a(long v, Object object0) {
            this.b(v, ((Long)object0));
        }

        public void b(long v, Long long0) {
            OsObjectBuilder.nativeAddIntegerListItem(v, ((long)long0));
        }
    }

    class P implements S {
        P() {
            super();
        }

        @Override  // io.realm.internal.objectstore.OsObjectBuilder$S
        public void a(long v, Object object0) {
            this.b(v, ((Boolean)object0));
        }

        public void b(long v, Boolean boolean0) {
            OsObjectBuilder.nativeAddBooleanListItem(v, boolean0.booleanValue());
        }
    }

    class Q implements S {
        Q() {
            super();
        }

        @Override  // io.realm.internal.objectstore.OsObjectBuilder$S
        public void a(long v, Object object0) {
            this.b(v, ((Float)object0));
        }

        public void b(long v, Float float0) {
            OsObjectBuilder.nativeAddFloatListItem(v, ((float)float0));
        }
    }

    class R implements S {
        R() {
            super();
        }

        @Override  // io.realm.internal.objectstore.OsObjectBuilder$S
        public void a(long v, Object object0) {
            this.b(v, ((Double)object0));
        }

        public void b(long v, Double double0) {
            OsObjectBuilder.nativeAddDoubleListItem(v, ((double)double0));
        }
    }

    interface S {
        void a(long arg1, Object arg2);
    }

    class a implements S {
        a() {
            super();
        }

        @Override  // io.realm.internal.objectstore.OsObjectBuilder$S
        public void a(long v, Object object0) {
            this.b(v, ((Date)object0));
        }

        public void b(long v, Date date0) {
            OsObjectBuilder.nativeAddDateListItem(v, date0.getTime());
        }
    }

    class b implements S {
        b() {
            super();
        }

        @Override  // io.realm.internal.objectstore.OsObjectBuilder$S
        public void a(long v, Object object0) {
            this.b(v, ((byte[])object0));
        }

        public void b(long v, byte[] arr_b) {
            OsObjectBuilder.nativeAddByteArrayListItem(v, arr_b);
        }
    }

    class c implements S {
        c() {
            super();
        }

        @Override  // io.realm.internal.objectstore.OsObjectBuilder$S
        public void a(long v, Object object0) {
            this.b(v, ((l0)object0));
        }

        public void b(long v, l0 l00) {
            Long long0 = l00.c();
            if(long0 == null) {
                OsObjectBuilder.nativeAddNullListItem(v);
                return;
            }
            OsObjectBuilder.nativeAddIntegerListItem(v, ((long)long0));
        }
    }

    class d implements S {
        d() {
            super();
        }

        @Override  // io.realm.internal.objectstore.OsObjectBuilder$S
        public void a(long v, Object object0) {
            this.b(v, ((Decimal128)object0));
        }

        public void b(long v, Decimal128 decimal1280) {
            OsObjectBuilder.nativeAddDecimal128ListItem(v, decimal1280.i(), decimal1280.h());
        }
    }

    class e implements S {
        e() {
            super();
        }

        @Override  // io.realm.internal.objectstore.OsObjectBuilder$S
        public void a(long v, Object object0) {
            this.b(v, ((ObjectId)object0));
        }

        public void b(long v, ObjectId objectId0) {
            OsObjectBuilder.nativeAddObjectIdListItem(v, "68bb2a03ba165927b40a1ae3");
        }
    }

    class f implements S {
        f() {
            super();
        }

        @Override  // io.realm.internal.objectstore.OsObjectBuilder$S
        public void a(long v, Object object0) {
            this.b(v, ((UUID)object0));
        }

        public void b(long v, UUID uUID0) {
            OsObjectBuilder.nativeAddUUIDListItem(v, uUID0.toString());
        }
    }

    class g implements S {
        g() {
            super();
        }

        @Override  // io.realm.internal.objectstore.OsObjectBuilder$S
        public void a(long v, Object object0) {
            this.b(v, ((Map.Entry)object0));
        }

        public void b(long v, Map.Entry map$Entry0) {
            OsObjectBuilder.nativeAddBooleanDictionaryEntry(v, ((String)map$Entry0.getKey()), ((Boolean)map$Entry0.getValue()).booleanValue());
        }
    }

    class h implements S {
        h() {
            super();
        }

        @Override  // io.realm.internal.objectstore.OsObjectBuilder$S
        public void a(long v, Object object0) {
            this.b(v, ((Map.Entry)object0));
        }

        public void b(long v, Map.Entry map$Entry0) {
            OsObjectBuilder.nativeAddStringDictionaryEntry(v, ((String)map$Entry0.getKey()), ((String)map$Entry0.getValue()));
        }
    }

    class i implements S {
        i() {
            super();
        }

        @Override  // io.realm.internal.objectstore.OsObjectBuilder$S
        public void a(long v, Object object0) {
            this.b(v, ((Map.Entry)object0));
        }

        public void b(long v, Map.Entry map$Entry0) {
            OsObjectBuilder.nativeAddIntegerDictionaryEntry(v, ((String)map$Entry0.getKey()), ((int)(((Integer)map$Entry0.getValue()))));
        }
    }

    class j implements S {
        j() {
            super();
        }

        @Override  // io.realm.internal.objectstore.OsObjectBuilder$S
        public void a(long v, Object object0) {
            this.b(v, ((Map.Entry)object0));
        }

        public void b(long v, Map.Entry map$Entry0) {
            OsObjectBuilder.nativeAddFloatDictionaryEntry(v, ((String)map$Entry0.getKey()), ((float)(((Float)map$Entry0.getValue()))));
        }
    }

    class k implements S {
        k() {
            super();
        }

        @Override  // io.realm.internal.objectstore.OsObjectBuilder$S
        public void a(long v, Object object0) {
            this.b(v, ((X0)object0));
        }

        public void b(long v, X0 x00) {
            OsObjectBuilder.nativeAddIntegerListItem(v, ((UncheckedRow)((s)x00).R3().g()).getNativePtr());
        }
    }

    class l implements S {
        l() {
            super();
        }

        @Override  // io.realm.internal.objectstore.OsObjectBuilder$S
        public void a(long v, Object object0) {
            this.b(v, ((Map.Entry)object0));
        }

        public void b(long v, Map.Entry map$Entry0) {
            OsObjectBuilder.nativeAddIntegerDictionaryEntry(v, ((String)map$Entry0.getKey()), ((long)(((Long)map$Entry0.getValue()))));
        }
    }

    class m implements S {
        m() {
            super();
        }

        @Override  // io.realm.internal.objectstore.OsObjectBuilder$S
        public void a(long v, Object object0) {
            this.b(v, ((Map.Entry)object0));
        }

        public void b(long v, Map.Entry map$Entry0) {
            OsObjectBuilder.nativeAddIntegerDictionaryEntry(v, ((String)map$Entry0.getKey()), ((short)(((Short)map$Entry0.getValue()))));
        }
    }

    class n implements S {
        n() {
            super();
        }

        @Override  // io.realm.internal.objectstore.OsObjectBuilder$S
        public void a(long v, Object object0) {
            this.b(v, ((Map.Entry)object0));
        }

        public void b(long v, Map.Entry map$Entry0) {
            OsObjectBuilder.nativeAddIntegerDictionaryEntry(v, ((String)map$Entry0.getKey()), ((byte)(((Byte)map$Entry0.getValue()))));
        }
    }

    class o implements S {
        o() {
            super();
        }

        @Override  // io.realm.internal.objectstore.OsObjectBuilder$S
        public void a(long v, Object object0) {
            this.b(v, ((Map.Entry)object0));
        }

        public void b(long v, Map.Entry map$Entry0) {
            OsObjectBuilder.nativeAddDoubleDictionaryEntry(v, ((String)map$Entry0.getKey()), ((double)(((Double)map$Entry0.getValue()))));
        }
    }

    class p implements S {
        p() {
            super();
        }

        @Override  // io.realm.internal.objectstore.OsObjectBuilder$S
        public void a(long v, Object object0) {
            this.b(v, ((Map.Entry)object0));
        }

        public void b(long v, Map.Entry map$Entry0) {
            OsObjectBuilder.nativeAddBinaryDictionaryEntry(v, ((String)map$Entry0.getKey()), ((byte[])map$Entry0.getValue()));
        }
    }

    class q implements S {
        q() {
            super();
        }

        @Override  // io.realm.internal.objectstore.OsObjectBuilder$S
        public void a(long v, Object object0) {
            this.b(v, ((Map.Entry)object0));
        }

        public void b(long v, Map.Entry map$Entry0) {
            OsObjectBuilder.nativeAddDateDictionaryEntry(v, ((String)map$Entry0.getKey()), ((Date)map$Entry0.getValue()).getTime());
        }
    }

    class r implements S {
        r() {
            super();
        }

        @Override  // io.realm.internal.objectstore.OsObjectBuilder$S
        public void a(long v, Object object0) {
            this.b(v, ((Map.Entry)object0));
        }

        public void b(long v, Map.Entry map$Entry0) {
            OsObjectBuilder.nativeAddDecimal128DictionaryEntry(v, ((String)map$Entry0.getKey()), ((Decimal128)map$Entry0.getValue()).h(), ((Decimal128)map$Entry0.getValue()).i());
        }
    }

    class io.realm.internal.objectstore.OsObjectBuilder.s implements S {
        io.realm.internal.objectstore.OsObjectBuilder.s() {
            super();
        }

        @Override  // io.realm.internal.objectstore.OsObjectBuilder$S
        public void a(long v, Object object0) {
            this.b(v, ((Map.Entry)object0));
        }

        public void b(long v, Map.Entry map$Entry0) {
            OsObjectBuilder.nativeAddObjectIdDictionaryEntry(v, ((String)map$Entry0.getKey()), "68bb2a06f6749522a62e219b");
        }
    }

    class t implements S {
        t() {
            super();
        }

        @Override  // io.realm.internal.objectstore.OsObjectBuilder$S
        public void a(long v, Object object0) {
            this.b(v, ((Map.Entry)object0));
        }

        public void b(long v, Map.Entry map$Entry0) {
            OsObjectBuilder.nativeAddUUIDDictionaryEntry(v, ((String)map$Entry0.getKey()), ((UUID)map$Entry0.getValue()).toString());
        }
    }

    class u implements S {
        private final io.realm.internal.q a;

        u() {
            super();
            this.a = new I0();
        }

        @Override  // io.realm.internal.objectstore.OsObjectBuilder$S
        public void a(long v, Object object0) {
            this.b(v, ((Map.Entry)object0));
        }

        public void b(long v, Map.Entry map$Entry0) {
            this.a.a(v, map$Entry0);
        }
    }

    class v implements S {
        v() {
            super();
        }

        @Override  // io.realm.internal.objectstore.OsObjectBuilder$S
        public void a(long v, Object object0) {
            this.b(v, ((String)object0));
        }

        public void b(long v, String s) {
            OsObjectBuilder.nativeAddStringListItem(v, s);
        }
    }

    class w implements S {
        private final io.realm.internal.q a;

        w() {
            super();
            this.a = new I0();
        }

        @Override  // io.realm.internal.objectstore.OsObjectBuilder$S
        public void a(long v, Object object0) {
            this.b(v, ((G0)object0));
        }

        public void b(long v, G0 g00) {
            this.a.c(v, g00);
        }
    }

    class x implements S {
        x() {
            super();
        }

        @Override  // io.realm.internal.objectstore.OsObjectBuilder$S
        public void a(long v, Object object0) {
            this.b(v, ((String)object0));
        }

        public void b(long v, String s) {
            OsObjectBuilder.nativeAddStringSetItem(v, s);
        }
    }

    class y implements S {
        y() {
            super();
        }

        @Override  // io.realm.internal.objectstore.OsObjectBuilder$S
        public void a(long v, Object object0) {
            this.b(v, ((Boolean)object0));
        }

        public void b(long v, Boolean boolean0) {
            OsObjectBuilder.nativeAddBooleanSetItem(v, boolean0.booleanValue());
        }
    }

    class z implements S {
        z() {
            super();
        }

        @Override  // io.realm.internal.objectstore.OsObjectBuilder$S
        public void a(long v, Object object0) {
            this.b(v, ((Integer)object0));
        }

        public void b(long v, Integer integer0) {
            OsObjectBuilder.nativeAddIntegerSetItem(v, ((int)integer0));
        }
    }

    private static S A;
    private static S B;
    private static S C;
    private static S D;
    private static S E;
    private static S F;
    private static S G;
    private static S H;
    private static S I;
    private static S J;
    private static S K;
    private static S L;
    private static S M;
    private static S M8;
    private static S N;
    private static S N8;
    private static S O;
    private static S O8;
    private static S P;
    private static S P8;
    private static S Q;
    private static S X;
    private static S Y;
    private static S Z;
    private final Table a;
    private final long b;
    private final long c;
    private final long d;
    private final io.realm.internal.k e;
    private final boolean f;
    private static S g;
    private static S h;
    private static S i;
    private static S j;
    private static S k;
    private static S l;
    private static S m;
    private static S n;
    private static S o;
    private static S p;
    private static S q;
    private static S r;
    private static S s;
    private static S t;
    private static S u;
    private static S v;
    private static S w;
    private static S x;
    private static S y;
    private static S z;

    static {
        OsObjectBuilder.g = new k();
        OsObjectBuilder.h = new v();
        OsObjectBuilder.i = new G();
        OsObjectBuilder.j = new M();
        OsObjectBuilder.k = new N();
        OsObjectBuilder.l = new O();
        OsObjectBuilder.m = new P();
        OsObjectBuilder.n = new Q();
        OsObjectBuilder.o = new R();
        OsObjectBuilder.p = new a();
        OsObjectBuilder.q = new b();
        OsObjectBuilder.r = new c();
        OsObjectBuilder.s = new d();
        OsObjectBuilder.t = new e();
        OsObjectBuilder.u = new f();
        OsObjectBuilder.v = new g();
        OsObjectBuilder.w = new h();
        OsObjectBuilder.x = new i();
        OsObjectBuilder.y = new j();
        OsObjectBuilder.z = new l();
        OsObjectBuilder.A = new m();
        OsObjectBuilder.B = new n();
        OsObjectBuilder.C = new o();
        OsObjectBuilder.D = new p();
        OsObjectBuilder.E = new q();
        OsObjectBuilder.F = new r();
        OsObjectBuilder.G = new io.realm.internal.objectstore.OsObjectBuilder.s();
        OsObjectBuilder.H = new t();
        OsObjectBuilder.I = new u();
        OsObjectBuilder.J = new w();
        OsObjectBuilder.K = new x();
        OsObjectBuilder.L = new y();
        OsObjectBuilder.M = new z();
        OsObjectBuilder.N = new A();
        OsObjectBuilder.O = new B();
        OsObjectBuilder.P = new C();
        OsObjectBuilder.Q = new D();
        OsObjectBuilder.X = new E();
        OsObjectBuilder.Y = new F();
        OsObjectBuilder.Z = new H();
        OsObjectBuilder.M8 = new I();
        OsObjectBuilder.N8 = new J();
        OsObjectBuilder.O8 = new K();
        OsObjectBuilder.P8 = new OsObjectBuilder.L();
    }

    public OsObjectBuilder(Table table0, Set set0) {
        OsSharedRealm osSharedRealm0 = table0.Q();
        this.b = osSharedRealm0.getNativePtr();
        this.a = table0;
        table0.H();
        this.d = table0.getNativePtr();
        this.c = OsObjectBuilder.nativeCreateBuilder();
        this.e = osSharedRealm0.context;
        this.f = set0.contains(W.a);
    }

    public void A2(long v, R0 r00) {
        this.j2(this.c, v, r00, OsObjectBuilder.C);
    }

    public void B3(long v, T0 t00) {
        this.y3(this.c, v, t00, OsObjectBuilder.l);
    }

    private void C2(long v) {
        long v1 = OsObjectBuilder.nativeStartDictionary();
        OsObjectBuilder.nativeStopDictionary(this.c, v, v1);
    }

    public void C3(long v, i1 i10) {
        this.j4(this.c, v, i10, OsObjectBuilder.N);
    }

    public void E3(long v, R0 r00) {
        this.j2(this.c, v, r00, OsObjectBuilder.z);
    }

    public void F3(long v, @o3.h l0 l00) {
        if(l00 != null && l00.c() != null) {
            long v1 = (long)l00.c();
            OsObjectBuilder.nativeAddInteger(this.c, v, v1);
            return;
        }
        OsObjectBuilder.nativeAddNull(this.c, v);
    }

    private void I2(long v) {
        long v1 = OsObjectBuilder.nativeStartList(0L);
        OsObjectBuilder.nativeStopList(this.c, v, v1);
    }

    public void J1(long v, T0 t00) {
        this.y3(this.c, v, t00, OsObjectBuilder.p);
    }

    private void L2(long v) {
        long v1 = OsObjectBuilder.nativeStartSet(0L);
        OsObjectBuilder.nativeStopSet(this.c, v, v1);
    }

    public void N1(long v, i1 i10) {
        this.j4(this.c, v, i10, OsObjectBuilder.Z);
    }

    public void N3(long v, T0 t00) {
        this.y3(this.c, v, t00, OsObjectBuilder.r);
    }

    public void P2(long v, @o3.h Float float0) {
        if(float0 == null) {
            OsObjectBuilder.nativeAddNull(this.c, v);
            return;
        }
        OsObjectBuilder.nativeAddFloat(this.c, v, ((float)float0));
    }

    public void Q1(long v, R0 r00) {
        this.j2(this.c, v, r00, OsObjectBuilder.E);
    }

    public void R2(long v, T0 t00) {
        this.y3(this.c, v, t00, OsObjectBuilder.n);
    }

    public void S3(long v) {
        OsObjectBuilder.nativeAddNull(this.c, v);
    }

    public void T0(long v, i1 i10) {
        this.j4(this.c, v, i10, OsObjectBuilder.Y);
    }

    public void T3(long v, @o3.h X0 x00) {
        if(x00 == null) {
            OsObjectBuilder.nativeAddNull(this.c, v);
            return;
        }
        long v1 = ((UncheckedRow)((s)x00).R3().g()).getNativePtr();
        OsObjectBuilder.nativeAddObject(this.c, v, v1);
    }

    public void Y0(long v, R0 r00) {
        this.j2(this.c, v, r00, OsObjectBuilder.D);
    }

    public void Y2(long v, i1 i10) {
        this.j4(this.c, v, i10, OsObjectBuilder.Q);
    }

    public void Y3(long v, @o3.h R0 r00) {
        if(r00 != null) {
            long v1 = OsObjectBuilder.nativeStartDictionary();
            for(Object object0: r00.entrySet()) {
                Map.Entry map$Entry0 = (Map.Entry)object0;
                if(map$Entry0.getValue() == null) {
                    OsObjectBuilder.nativeAddNullDictionaryEntry(v1, ((String)map$Entry0.getKey()));
                }
                else {
                    long v2 = ((UncheckedRow)((s)map$Entry0.getValue()).R3().g()).getNativePtr();
                    OsObjectBuilder.nativeAddObjectDictionaryEntry(v1, ((String)map$Entry0.getKey()), v2);
                }
            }
            OsObjectBuilder.nativeStopDictionary(this.c, v, v1);
            return;
        }
        this.C2(v);
    }

    public void Z3(long v, @o3.h ObjectId objectId0) {
        if(objectId0 == null) {
            OsObjectBuilder.nativeAddNull(this.c, v);
            return;
        }
        OsObjectBuilder.nativeAddObjectId(this.c, v, "68bb2a014ddf73643ff6fa12");
    }

    public void a1(long v, @o3.h Boolean boolean0) {
        if(boolean0 == null) {
            OsObjectBuilder.nativeAddNull(this.c, v);
            return;
        }
        OsObjectBuilder.nativeAddBoolean(this.c, v, boolean0.booleanValue());
    }

    public void a4(long v, T0 t00) {
        this.y3(this.c, v, t00, OsObjectBuilder.t);
    }

    public void b1(long v, T0 t00) {
        this.y3(this.c, v, t00, OsObjectBuilder.m);
    }

    public void b3(long v, R0 r00) {
        this.j2(this.c, v, r00, OsObjectBuilder.y);
    }

    public void b4(long v, i1 i10) {
        this.j4(this.c, v, i10, OsObjectBuilder.N8);
    }

    public void c1(long v, i1 i10) {
        this.j4(this.c, v, i10, OsObjectBuilder.L);
    }

    public void c4(long v, R0 r00) {
        this.j2(this.c, v, r00, OsObjectBuilder.G);
    }

    @Override
    public void close() {
        OsObjectBuilder.nativeDestroyBuilder(this.c);
    }

    public void d1(long v, R0 r00) {
        this.j2(this.c, v, r00, OsObjectBuilder.v);
    }

    public void d2(long v, @o3.h Decimal128 decimal1280) {
        if(decimal1280 == null) {
            OsObjectBuilder.nativeAddNull(this.c, v);
            return;
        }
        OsObjectBuilder.nativeAddDecimal128(this.c, v, decimal1280.i(), decimal1280.h());
    }

    public void d4(long v, @o3.h T0 t00) {
        if(t00 != null) {
            long[] arr_v = new long[t00.size()];
            for(int v1 = 0; v1 < t00.size(); ++v1) {
                s s0 = (s)t00.get(v1);
                if(s0 == null) {
                    throw new IllegalArgumentException("Null values are not allowed in RealmLists containing Realm models");
                }
                arr_v[v1] = ((UncheckedRow)s0.R3().g()).getNativePtr();
            }
            OsObjectBuilder.nativeAddObjectList(this.c, v, arr_v);
            return;
        }
        OsObjectBuilder.nativeAddObjectList(this.c, v, new long[0]);
    }

    public void e2(long v, T0 t00) {
        this.y3(this.c, v, t00, OsObjectBuilder.s);
    }

    public void e3(long v, @o3.h Byte byte0) {
        if(byte0 == null) {
            OsObjectBuilder.nativeAddNull(this.c, v);
            return;
        }
        OsObjectBuilder.nativeAddInteger(this.c, v, ((byte)byte0));
    }

    public void e4(long v, @o3.h i1 i10) {
        if(i10 != null) {
            long v1 = OsObjectBuilder.nativeStartSet(i10.size());
            for(Object object0: i10) {
                if(((X0)object0) == null) {
                    throw new IllegalArgumentException("This \'RealmSet\' is not nullable. A non-null value is expected.");
                }
                OsObjectBuilder.nativeAddObjectListItem(v1, ((UncheckedRow)((s)(((X0)object0))).R3().g()).getNativePtr());
            }
            OsObjectBuilder.nativeStopSet(this.c, v, v1);
            return;
        }
        this.L2(v);
    }

    public void f4(long v, long v1) {
        OsObjectBuilder.nativeAddRealmAny(this.c, v, v1);
    }

    public void g2(long v, i1 i10) {
        this.j4(this.c, v, i10, OsObjectBuilder.M8);
    }

    public void g4(long v, T0 t00) {
        this.y3(this.c, v, t00, OsObjectBuilder.J);
    }

    public long getNativePtr() {
        return this.c;
    }

    public void h1(long v, @o3.h byte[] arr_b) {
        if(arr_b == null) {
            OsObjectBuilder.nativeAddNull(this.c, v);
            return;
        }
        OsObjectBuilder.nativeAddByteArray(this.c, v, arr_b);
    }

    public void h4(long v, i1 i10) {
        this.j4(this.c, v, i10, OsObjectBuilder.P8);
    }

    public void i1(long v, T0 t00) {
        this.y3(this.c, v, t00, OsObjectBuilder.q);
    }

    public void i2(long v, R0 r00) {
        this.j2(this.c, v, r00, OsObjectBuilder.F);
    }

    public void i3(long v, @o3.h Integer integer0) {
        if(integer0 == null) {
            OsObjectBuilder.nativeAddNull(this.c, v);
            return;
        }
        OsObjectBuilder.nativeAddInteger(this.c, v, ((int)integer0));
    }

    public void i4(long v, R0 r00) {
        this.j2(this.c, v, r00, OsObjectBuilder.I);
    }

    public void j1(long v, T0 t00) {
        this.y3(this.c, v, t00, OsObjectBuilder.i);
    }

    private void j2(long v, long v1, @o3.h R0 r00, S osObjectBuilder$S0) {
        if(r00 != null) {
            long v2 = OsObjectBuilder.nativeStartDictionary();
            for(Object object0: r00.entrySet()) {
                Map.Entry map$Entry0 = (Map.Entry)object0;
                if(map$Entry0.getValue() == null) {
                    OsObjectBuilder.nativeAddNullDictionaryEntry(v2, ((String)map$Entry0.getKey()));
                }
                else {
                    osObjectBuilder$S0.a(v2, map$Entry0);
                }
            }
            OsObjectBuilder.nativeStopDictionary(v, v1, v2);
            return;
        }
        this.C2(v1);
    }

    private void j4(long v, long v1, @o3.h Set set0, S osObjectBuilder$S0) {
        if(set0 != null) {
            long v2 = OsObjectBuilder.nativeStartSet(set0.size());
            boolean z = v1 == 0L || this.a.Z(v1);
            for(Object object0: set0) {
                if(object0 == null) {
                    if(!z) {
                        throw new IllegalArgumentException("This \'RealmSet\' is not nullable. A non-null value is expected.");
                    }
                    OsObjectBuilder.nativeAddNullSetItem(v2);
                }
                else {
                    osObjectBuilder$S0.a(v2, object0);
                }
            }
            OsObjectBuilder.nativeStopSet(v, v1, v2);
            return;
        }
        this.L2(v1);
    }

    public void k4(long v, T0 t00) {
        this.y3(this.c, v, t00, OsObjectBuilder.j);
    }

    public void l1(long v, i1 i10) {
        this.j4(this.c, v, i10, OsObjectBuilder.P);
    }

    public void l4(long v, i1 i10) {
        this.j4(this.c, v, i10, OsObjectBuilder.O);
    }

    public void m4(long v, R0 r00) {
        this.j2(this.c, v, r00, OsObjectBuilder.A);
    }

    public void n3(long v, @o3.h Long long0) {
        if(long0 == null) {
            OsObjectBuilder.nativeAddNull(this.c, v);
            return;
        }
        OsObjectBuilder.nativeAddInteger(this.c, v, ((long)long0));
    }

    public void n4(long v, @o3.h String s) {
        if(s == null) {
            OsObjectBuilder.nativeAddNull(this.c, v);
            return;
        }
        OsObjectBuilder.nativeAddString(this.c, v, s);
    }

    private static native void nativeAddBinaryDictionaryEntry(long arg0, String arg1, byte[] arg2) {
    }

    private static native void nativeAddBoolean(long arg0, long arg1, boolean arg2) {
    }

    private static native void nativeAddBooleanDictionaryEntry(long arg0, String arg1, boolean arg2) {
    }

    private static native void nativeAddBooleanListItem(long arg0, boolean arg1) {
    }

    private static native void nativeAddBooleanSetItem(long arg0, boolean arg1) {
    }

    private static native void nativeAddByteArray(long arg0, long arg1, byte[] arg2) {
    }

    private static native void nativeAddByteArrayListItem(long arg0, byte[] arg1) {
    }

    private static native void nativeAddByteArraySetItem(long arg0, byte[] arg1) {
    }

    private static native void nativeAddDate(long arg0, long arg1, long arg2) {
    }

    private static native void nativeAddDateDictionaryEntry(long arg0, String arg1, long arg2) {
    }

    private static native void nativeAddDateListItem(long arg0, long arg1) {
    }

    private static native void nativeAddDateSetItem(long arg0, long arg1) {
    }

    private static native void nativeAddDecimal128(long arg0, long arg1, long arg2, long arg3) {
    }

    private static native void nativeAddDecimal128DictionaryEntry(long arg0, String arg1, long arg2, long arg3) {
    }

    private static native void nativeAddDecimal128ListItem(long arg0, long arg1, long arg2) {
    }

    private static native void nativeAddDecimal128SetItem(long arg0, long arg1, long arg2) {
    }

    private static native void nativeAddDouble(long arg0, long arg1, double arg2) {
    }

    private static native void nativeAddDoubleDictionaryEntry(long arg0, String arg1, double arg2) {
    }

    private static native void nativeAddDoubleListItem(long arg0, double arg1) {
    }

    private static native void nativeAddDoubleSetItem(long arg0, double arg1) {
    }

    private static native void nativeAddFloat(long arg0, long arg1, float arg2) {
    }

    private static native void nativeAddFloatDictionaryEntry(long arg0, String arg1, float arg2) {
    }

    private static native void nativeAddFloatListItem(long arg0, float arg1) {
    }

    private static native void nativeAddFloatSetItem(long arg0, float arg1) {
    }

    private static native void nativeAddInteger(long arg0, long arg1, long arg2) {
    }

    private static native void nativeAddIntegerDictionaryEntry(long arg0, String arg1, long arg2) {
    }

    private static native void nativeAddIntegerListItem(long arg0, long arg1) {
    }

    private static native void nativeAddIntegerSetItem(long arg0, long arg1) {
    }

    private static native void nativeAddNull(long arg0, long arg1) {
    }

    private static native void nativeAddNullDictionaryEntry(long arg0, String arg1) {
    }

    private static native void nativeAddNullListItem(long arg0) {
    }

    private static native void nativeAddNullSetItem(long arg0) {
    }

    private static native void nativeAddObject(long arg0, long arg1, long arg2) {
    }

    private static native void nativeAddObjectDictionaryEntry(long arg0, String arg1, long arg2) {
    }

    private static native void nativeAddObjectId(long arg0, long arg1, String arg2) {
    }

    private static native void nativeAddObjectIdDictionaryEntry(long arg0, String arg1, String arg2) {
    }

    private static native void nativeAddObjectIdListItem(long arg0, String arg1) {
    }

    private static native void nativeAddObjectIdSetItem(long arg0, String arg1) {
    }

    private static native void nativeAddObjectList(long arg0, long arg1, long[] arg2) {
    }

    private static native void nativeAddObjectListItem(long arg0, long arg1) {
    }

    private static native void nativeAddRealmAny(long arg0, long arg1, long arg2) {
    }

    public static native void nativeAddRealmAnyDictionaryEntry(long arg0, String arg1, long arg2) {
    }

    public static native void nativeAddRealmAnyListItem(long arg0, long arg1) {
    }

    private static native void nativeAddString(long arg0, long arg1, String arg2) {
    }

    private static native void nativeAddStringDictionaryEntry(long arg0, String arg1, String arg2) {
    }

    private static native void nativeAddStringListItem(long arg0, String arg1) {
    }

    private static native void nativeAddStringSetItem(long arg0, String arg1) {
    }

    private static native void nativeAddUUID(long arg0, long arg1, String arg2) {
    }

    private static native void nativeAddUUIDDictionaryEntry(long arg0, String arg1, String arg2) {
    }

    private static native void nativeAddUUIDListItem(long arg0, String arg1) {
    }

    private static native void nativeAddUUIDSetItem(long arg0, String arg1) {
    }

    private static native long nativeCreateBuilder() {
    }

    private static native long nativeCreateOrUpdateTopLevelObject(long arg0, long arg1, long arg2, boolean arg3, boolean arg4) {
    }

    private static native void nativeDestroyBuilder(long arg0) {
    }

    private static native long nativeStartDictionary() {
    }

    private static native long nativeStartList(long arg0) {
    }

    private static native long nativeStartSet(long arg0) {
    }

    private static native void nativeStopDictionary(long arg0, long arg1, long arg2) {
    }

    private static native void nativeStopList(long arg0, long arg1, long arg2) {
    }

    private static native void nativeStopSet(long arg0, long arg1, long arg2) {
    }

    private static native long nativeUpdateEmbeddedObject(long arg0, long arg1, long arg2, long arg3, boolean arg4) {
    }

    public void o2(long v, @o3.h Double double0) {
        if(double0 == null) {
            OsObjectBuilder.nativeAddNull(this.c, v);
            return;
        }
        OsObjectBuilder.nativeAddDouble(this.c, v, ((double)double0));
    }

    public void o4(long v, T0 t00) {
        this.y3(this.c, v, t00, OsObjectBuilder.h);
    }

    public void p2(long v, T0 t00) {
        this.y3(this.c, v, t00, OsObjectBuilder.o);
    }

    public void p3(long v, @o3.h Short short0) {
        if(short0 == null) {
            OsObjectBuilder.nativeAddNull(this.c, v);
            return;
        }
        OsObjectBuilder.nativeAddInteger(this.c, v, ((short)short0));
    }

    public void p4(long v, i1 i10) {
        this.j4(this.c, v, i10, OsObjectBuilder.K);
    }

    public void q4(long v, R0 r00) {
        this.j2(this.c, v, r00, OsObjectBuilder.w);
    }

    public void r3(long v, T0 t00) {
        this.y3(this.c, v, t00, OsObjectBuilder.k);
    }

    public void r4(long v, @o3.h UUID uUID0) {
        if(uUID0 == null) {
            OsObjectBuilder.nativeAddNull(this.c, v);
            return;
        }
        OsObjectBuilder.nativeAddUUID(this.c, v, uUID0.toString());
    }

    public void s3(long v, i1 i10) {
        this.j4(this.c, v, i10, OsObjectBuilder.M);
    }

    public void s4(long v, T0 t00) {
        this.y3(this.c, v, t00, OsObjectBuilder.u);
    }

    public void t1(long v, R0 r00) {
        this.j2(this.c, v, r00, OsObjectBuilder.B);
    }

    public void t2(long v, i1 i10) {
        this.j4(this.c, v, i10, OsObjectBuilder.X);
    }

    public void t4(long v, i1 i10) {
        this.j4(this.c, v, i10, OsObjectBuilder.O8);
    }

    public void u1(long v, @o3.h Date date0) {
        if(date0 == null) {
            OsObjectBuilder.nativeAddNull(this.c, v);
            return;
        }
        long v1 = date0.getTime();
        OsObjectBuilder.nativeAddDate(this.c, v, v1);
    }

    public void u4(long v, R0 r00) {
        this.j2(this.c, v, r00, OsObjectBuilder.H);
    }

    public void v3(long v, R0 r00) {
        this.j2(this.c, v, r00, OsObjectBuilder.x);
    }

    public UncheckedRow v4() {
        try(this) {
            long v = OsObjectBuilder.nativeCreateOrUpdateTopLevelObject(this.b, this.d, this.c, false, false);
            return new UncheckedRow(this.e, this.a, v);
        }
    }

    public void w4(s s0) {
        try(this) {
            long v = s0.R3().g().F();
            OsObjectBuilder.nativeUpdateEmbeddedObject(this.b, this.d, this.c, v, this.f);
        }
    }

    public void x4() {
        try(this) {
            OsObjectBuilder.nativeCreateOrUpdateTopLevelObject(this.b, this.d, this.c, true, this.f);
        }
    }

    private void y3(long v, long v1, @o3.h List list0, S osObjectBuilder$S0) {
        if(list0 != null) {
            long v2 = OsObjectBuilder.nativeStartList(list0.size());
            boolean z = v1 == 0L || this.a.Z(v1);
            for(int v3 = 0; v3 < list0.size(); ++v3) {
                Object object0 = list0.get(v3);
                if(object0 == null) {
                    if(!z) {
                        throw new IllegalArgumentException("This \'RealmList\' is not nullable. A non-null value is expected.");
                    }
                    OsObjectBuilder.nativeAddNullListItem(v2);
                    continue;
                }
                else {
                    osObjectBuilder$S0.a(v2, object0);
                }
            }
            OsObjectBuilder.nativeStopList(v, v1, v2);
            return;
        }
        this.I2(v1);
    }
}

