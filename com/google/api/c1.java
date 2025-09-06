package com.google.api;

import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.Api;
import com.google.protobuf.ApiOrBuilder;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.Enum;
import com.google.protobuf.EnumOrBuilder;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite.Builder;
import com.google.protobuf.GeneratedMessageLite.DefaultInstanceBasedParser;
import com.google.protobuf.GeneratedMessageLite.MethodToInvoke;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Internal.ProtobufList;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Parser;
import com.google.protobuf.Type;
import com.google.protobuf.TypeOrBuilder;
import com.google.protobuf.UInt32Value;
import j..util.DesugarCollections;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

public final class c1 extends GeneratedMessageLite implements d1 {
    static class a {
        static final int[] a;

        static {
            int[] arr_v = new int[MethodToInvoke.values().length];
            a.a = arr_v;
            try {
                arr_v[MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                a.a[MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                a.a[MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                a.a[MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                a.a[MethodToInvoke.GET_PARSER.ordinal()] = 5;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                a.a[MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                a.a[MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            }
            catch(NoSuchFieldError unused_ex) {
            }
        }
    }

    public static final class b extends Builder implements d1 {
        private b() {
            super(c1.DEFAULT_INSTANCE);
        }

        b(a c1$a0) {
        }

        @Override  // com.google.api.d1
        public List A0() {
            return DesugarCollections.unmodifiableList(((c1)this.instance).A0());
        }

        public b Ab(Iterable iterable0) {
            this.copyOnWrite();
            ((c1)this.instance).Zc(iterable0);
            return this;
        }

        public b Ac() {
            this.copyOnWrite();
            ((c1)this.instance).Jd();
            return this;
        }

        public b Ad(int v, u0 u00) {
            this.copyOnWrite();
            ((c1)this.instance).cf(v, u00);
            return this;
        }

        @Override  // com.google.api.d1
        public i B4() {
            return ((c1)this.instance).B4();
        }

        public b Bb(int v, com.google.protobuf.Api.Builder api$Builder0) {
            this.copyOnWrite();
            ((c1)this.instance).ad(v, ((Api)api$Builder0.build()));
            return this;
        }

        public b Bc() {
            this.copyOnWrite();
            ((c1)this.instance).Kd();
            return this;
        }

        public b Bd(int v, com.google.api.B0.b b0$b0) {
            this.copyOnWrite();
            ((c1)this.instance).df(v, ((B0)b0$b0.build()));
            return this;
        }

        @Override  // com.google.api.d1
        public p1 C0() {
            return ((c1)this.instance).C0();
        }

        @Override  // com.google.api.d1
        public S0 C2() {
            return ((c1)this.instance).C2();
        }

        @Override  // com.google.api.d1
        public List C6() {
            return DesugarCollections.unmodifiableList(((c1)this.instance).C6());
        }

        @Override  // com.google.api.d1
        public List C7() {
            return DesugarCollections.unmodifiableList(((c1)this.instance).C7());
        }

        public b Cb(int v, Api api0) {
            this.copyOnWrite();
            ((c1)this.instance).ad(v, api0);
            return this;
        }

        public b Cc(i i0) {
            this.copyOnWrite();
            ((c1)this.instance).fe(i0);
            return this;
        }

        public b Cd(int v, B0 b00) {
            this.copyOnWrite();
            ((c1)this.instance).df(v, b00);
            return this;
        }

        public b Db(com.google.protobuf.Api.Builder api$Builder0) {
            this.copyOnWrite();
            ((c1)this.instance).bd(((Api)api$Builder0.build()));
            return this;
        }

        public b Dc(m m0) {
            this.copyOnWrite();
            ((c1)this.instance).ge(m0);
            return this;
        }

        public b Dd(com.google.api.H0.b h0$b0) {
            this.copyOnWrite();
            ((c1)this.instance).ef(((H0)h0$b0.build()));
            return this;
        }

        @Override  // com.google.api.d1
        public Api E9(int v) {
            return ((c1)this.instance).E9(v);
        }

        public b Eb(Api api0) {
            this.copyOnWrite();
            ((c1)this.instance).bd(api0);
            return this;
        }

        public b Ec(r r0) {
            this.copyOnWrite();
            ((c1)this.instance).he(r0);
            return this;
        }

        public b Ed(H0 h00) {
            this.copyOnWrite();
            ((c1)this.instance).ef(h00);
            return this;
        }

        public b Fb(int v, com.google.api.T.b t$b0) {
            this.copyOnWrite();
            ((c1)this.instance).cd(v, ((T)t$b0.build()));
            return this;
        }

        public b Fc(UInt32Value uInt32Value0) {
            this.copyOnWrite();
            ((c1)this.instance).ie(uInt32Value0);
            return this;
        }

        public b Fd(String s) {
            this.copyOnWrite();
            ((c1)this.instance).setName(s);
            return this;
        }

        @Override  // com.google.api.d1
        public int G3() {
            return ((c1)this.instance).G3();
        }

        public b Gb(int v, T t0) {
            this.copyOnWrite();
            ((c1)this.instance).cd(v, t0);
            return this;
        }

        public b Gc(A a0) {
            this.copyOnWrite();
            ((c1)this.instance).je(a0);
            return this;
        }

        public b Gd(ByteString byteString0) {
            this.copyOnWrite();
            ((c1)this.instance).setNameBytes(byteString0);
            return this;
        }

        @Override  // com.google.api.d1
        public B0 H6(int v) {
            return ((c1)this.instance).H6(v);
        }

        public b Hb(com.google.api.T.b t$b0) {
            this.copyOnWrite();
            ((c1)this.instance).dd(((T)t$b0.build()));
            return this;
        }

        public b Hc(F f0) {
            this.copyOnWrite();
            ((c1)this.instance).ke(f0);
            return this;
        }

        public b Hd(String s) {
            this.copyOnWrite();
            ((c1)this.instance).ff(s);
            return this;
        }

        public b Ib(T t0) {
            this.copyOnWrite();
            ((c1)this.instance).dd(t0);
            return this;
        }

        public b Ic(N n0) {
            this.copyOnWrite();
            ((c1)this.instance).le(n0);
            return this;
        }

        public b Id(ByteString byteString0) {
            this.copyOnWrite();
            ((c1)this.instance).gf(byteString0);
            return this;
        }

        @Override  // com.google.api.d1
        public q0 J9() {
            return ((c1)this.instance).J9();
        }

        public b Jb(int v, com.google.protobuf.Enum.Builder enum$Builder0) {
            this.copyOnWrite();
            ((c1)this.instance).ed(v, ((Enum)enum$Builder0.build()));
            return this;
        }

        public b Jc(Y y0) {
            this.copyOnWrite();
            ((c1)this.instance).me(y0);
            return this;
        }

        public b Jd(com.google.api.S0.b s0$b0) {
            this.copyOnWrite();
            ((c1)this.instance).hf(((S0)s0$b0.build()));
            return this;
        }

        @Override  // com.google.api.d1
        public H0 K1() {
            return ((c1)this.instance).K1();
        }

        @Override  // com.google.api.d1
        public int K2() {
            return ((c1)this.instance).K2();
        }

        public b Kb(int v, Enum enum0) {
            this.copyOnWrite();
            ((c1)this.instance).ed(v, enum0);
            return this;
        }

        public b Kc(q0 q00) {
            this.copyOnWrite();
            ((c1)this.instance).ne(q00);
            return this;
        }

        public b Kd(S0 s00) {
            this.copyOnWrite();
            ((c1)this.instance).hf(s00);
            return this;
        }

        public b Lb(com.google.protobuf.Enum.Builder enum$Builder0) {
            this.copyOnWrite();
            ((c1)this.instance).fd(((Enum)enum$Builder0.build()));
            return this;
        }

        public b Lc(H0 h00) {
            this.copyOnWrite();
            ((c1)this.instance).oe(h00);
            return this;
        }

        public b Ld(com.google.api.f1.b f1$b0) {
            this.copyOnWrite();
            ((c1)this.instance).if(((f1)f1$b0.build()));
            return this;
        }

        public b Mb(Enum enum0) {
            this.copyOnWrite();
            ((c1)this.instance).fd(enum0);
            return this;
        }

        public b Mc(S0 s00) {
            this.copyOnWrite();
            ((c1)this.instance).pe(s00);
            return this;
        }

        public b Md(f1 f10) {
            this.copyOnWrite();
            ((c1)this.instance).if(f10);
            return this;
        }

        public b Nb(int v, com.google.api.n0.b n0$b0) {
            this.copyOnWrite();
            ((c1)this.instance).gd(v, ((n0)n0$b0.build()));
            return this;
        }

        public b Nc(f1 f10) {
            this.copyOnWrite();
            ((c1)this.instance).qe(f10);
            return this;
        }

        public b Nd(com.google.api.n1.b n1$b0) {
            this.copyOnWrite();
            ((c1)this.instance).jf(((n1)n1$b0.build()));
            return this;
        }

        @Override  // com.google.api.d1
        public N O5() {
            return ((c1)this.instance).O5();
        }

        public b Ob(int v, n0 n00) {
            this.copyOnWrite();
            ((c1)this.instance).gd(v, n00);
            return this;
        }

        public b Oc(n1 n10) {
            this.copyOnWrite();
            ((c1)this.instance).re(n10);
            return this;
        }

        public b Od(n1 n10) {
            this.copyOnWrite();
            ((c1)this.instance).jf(n10);
            return this;
        }

        public b Pb(com.google.api.n0.b n0$b0) {
            this.copyOnWrite();
            ((c1)this.instance).hd(((n0)n0$b0.build()));
            return this;
        }

        public b Pc(p1 p10) {
            this.copyOnWrite();
            ((c1)this.instance).se(p10);
            return this;
        }

        public b Pd(String s) {
            this.copyOnWrite();
            ((c1)this.instance).kf(s);
            return this;
        }

        @Override  // com.google.api.d1
        public ByteString Q0() {
            return ((c1)this.instance).Q0();
        }

        @Override  // com.google.api.d1
        public F Q7() {
            return ((c1)this.instance).Q7();
        }

        public b Qb(n0 n00) {
            this.copyOnWrite();
            ((c1)this.instance).hd(n00);
            return this;
        }

        public b Qc(int v) {
            this.copyOnWrite();
            ((c1)this.instance).He(v);
            return this;
        }

        public b Qd(ByteString byteString0) {
            this.copyOnWrite();
            ((c1)this.instance).lf(byteString0);
            return this;
        }

        @Override  // com.google.api.d1
        public Y R4() {
            return ((c1)this.instance).R4();
        }

        public b Rb(int v, com.google.api.u0.b u0$b0) {
            this.copyOnWrite();
            ((c1)this.instance).id(v, ((u0)u0$b0.build()));
            return this;
        }

        public b Rc(int v) {
            this.copyOnWrite();
            ((c1)this.instance).Ie(v);
            return this;
        }

        public b Rd(int v, com.google.protobuf.Type.Builder type$Builder0) {
            this.copyOnWrite();
            ((c1)this.instance).mf(v, ((Type)type$Builder0.build()));
            return this;
        }

        @Override  // com.google.api.d1
        public f1 S() {
            return ((c1)this.instance).S();
        }

        @Override  // com.google.api.d1
        public boolean S3() {
            return ((c1)this.instance).S3();
        }

        @Override  // com.google.api.d1
        public boolean Sa() {
            return ((c1)this.instance).Sa();
        }

        public b Sb(int v, u0 u00) {
            this.copyOnWrite();
            ((c1)this.instance).id(v, u00);
            return this;
        }

        public b Sc(int v) {
            this.copyOnWrite();
            ((c1)this.instance).Je(v);
            return this;
        }

        public b Sd(int v, Type type0) {
            this.copyOnWrite();
            ((c1)this.instance).mf(v, type0);
            return this;
        }

        @Override  // com.google.api.d1
        public List T3() {
            return DesugarCollections.unmodifiableList(((c1)this.instance).T3());
        }

        @Override  // com.google.api.d1
        public Type T5(int v) {
            return ((c1)this.instance).T5(v);
        }

        public b Tb(com.google.api.u0.b u0$b0) {
            this.copyOnWrite();
            ((c1)this.instance).jd(((u0)u0$b0.build()));
            return this;
        }

        public b Tc(int v) {
            this.copyOnWrite();
            ((c1)this.instance).Ke(v);
            return this;
        }

        public b Td(com.google.api.p1.b p1$b0) {
            this.copyOnWrite();
            ((c1)this.instance).nf(((p1)p1$b0.build()));
            return this;
        }

        public b Ub(u0 u00) {
            this.copyOnWrite();
            ((c1)this.instance).jd(u00);
            return this;
        }

        public b Uc(int v) {
            this.copyOnWrite();
            ((c1)this.instance).removeMetrics(v);
            return this;
        }

        public b Ud(p1 p10) {
            this.copyOnWrite();
            ((c1)this.instance).nf(p10);
            return this;
        }

        public b Vb(int v, com.google.api.B0.b b0$b0) {
            this.copyOnWrite();
            ((c1)this.instance).kd(v, ((B0)b0$b0.build()));
            return this;
        }

        public b Vc(int v) {
            this.copyOnWrite();
            ((c1)this.instance).Le(v);
            return this;
        }

        public b Wb(int v, B0 b00) {
            this.copyOnWrite();
            ((c1)this.instance).kd(v, b00);
            return this;
        }

        public b Wc(int v) {
            this.copyOnWrite();
            ((c1)this.instance).Me(v);
            return this;
        }

        public b Xb(com.google.api.B0.b b0$b0) {
            this.copyOnWrite();
            ((c1)this.instance).ld(((B0)b0$b0.build()));
            return this;
        }

        public b Xc(int v, com.google.protobuf.Api.Builder api$Builder0) {
            this.copyOnWrite();
            ((c1)this.instance).Ne(v, ((Api)api$Builder0.build()));
            return this;
        }

        @Override  // com.google.api.d1
        public ByteString Y6() {
            return ((c1)this.instance).Y6();
        }

        // 去混淆评级： 低(20)
        @Override  // com.google.api.d1
        public String Y7() {
            return "";
        }

        public b Yb(B0 b00) {
            this.copyOnWrite();
            ((c1)this.instance).ld(b00);
            return this;
        }

        public b Yc(int v, Api api0) {
            this.copyOnWrite();
            ((c1)this.instance).Ne(v, api0);
            return this;
        }

        @Override  // com.google.api.d1
        public boolean Z2() {
            return ((c1)this.instance).Z2();
        }

        public b Zb(int v, com.google.protobuf.Type.Builder type$Builder0) {
            this.copyOnWrite();
            ((c1)this.instance).md(v, ((Type)type$Builder0.build()));
            return this;
        }

        public b Zc(com.google.api.i.b i$b0) {
            this.copyOnWrite();
            ((c1)this.instance).Oe(((i)i$b0.build()));
            return this;
        }

        public b ac(int v, Type type0) {
            this.copyOnWrite();
            ((c1)this.instance).md(v, type0);
            return this;
        }

        public b ad(i i0) {
            this.copyOnWrite();
            ((c1)this.instance).Oe(i0);
            return this;
        }

        @Override  // com.google.api.d1
        public boolean b9() {
            return ((c1)this.instance).b9();
        }

        public b bc(com.google.protobuf.Type.Builder type$Builder0) {
            this.copyOnWrite();
            ((c1)this.instance).nd(((Type)type$Builder0.build()));
            return this;
        }

        public b bd(com.google.api.m.b m$b0) {
            this.copyOnWrite();
            ((c1)this.instance).Pe(((m)m$b0.build()));
            return this;
        }

        public b cc(Type type0) {
            this.copyOnWrite();
            ((c1)this.instance).nd(type0);
            return this;
        }

        public b cd(m m0) {
            this.copyOnWrite();
            ((c1)this.instance).Pe(m0);
            return this;
        }

        public b dc() {
            this.copyOnWrite();
            ((c1)this.instance).od();
            return this;
        }

        public b dd(d r$d0) {
            this.copyOnWrite();
            ((c1)this.instance).Qe(((r)r$d0.build()));
            return this;
        }

        public b ec() {
            this.copyOnWrite();
            ((c1)this.instance).pd();
            return this;
        }

        public b ed(r r0) {
            this.copyOnWrite();
            ((c1)this.instance).Qe(r0);
            return this;
        }

        @Override  // com.google.api.d1
        public boolean f5() {
            return ((c1)this.instance).f5();
        }

        @Override  // com.google.api.d1
        public boolean fa() {
            return ((c1)this.instance).fa();
        }

        public b fc() {
            this.copyOnWrite();
            ((c1)this.instance).qd();
            return this;
        }

        public b fd(com.google.protobuf.UInt32Value.Builder uInt32Value$Builder0) {
            this.copyOnWrite();
            ((c1)this.instance).Re(((UInt32Value)uInt32Value$Builder0.build()));
            return this;
        }

        @Override  // com.google.api.d1
        public m g2() {
            return ((c1)this.instance).g2();
        }

        public b gc() {
            this.copyOnWrite();
            ((c1)this.instance).rd();
            return this;
        }

        public b gd(UInt32Value uInt32Value0) {
            this.copyOnWrite();
            ((c1)this.instance).Re(uInt32Value0);
            return this;
        }

        @Override  // com.google.api.d1
        public A getContext() {
            return ((c1)this.instance).getContext();
        }

        @Override  // com.google.api.d1
        public String getId() {
            return ((c1)this.instance).getId();
        }

        @Override  // com.google.api.d1
        public u0 getMetrics(int v) {
            return ((c1)this.instance).getMetrics(v);
        }

        @Override  // com.google.api.d1
        public int getMetricsCount() {
            return ((c1)this.instance).getMetricsCount();
        }

        @Override  // com.google.api.d1
        public List getMetricsList() {
            return DesugarCollections.unmodifiableList(((c1)this.instance).getMetricsList());
        }

        @Override  // com.google.api.d1
        public String getName() {
            return ((c1)this.instance).getName();
        }

        @Override  // com.google.api.d1
        public ByteString getNameBytes() {
            return ((c1)this.instance).getNameBytes();
        }

        @Override  // com.google.api.d1
        public String getTitle() {
            return ((c1)this.instance).getTitle();
        }

        @Override  // com.google.api.d1
        public List h2() {
            return DesugarCollections.unmodifiableList(((c1)this.instance).h2());
        }

        @Override  // com.google.api.d1
        public boolean h9() {
            return ((c1)this.instance).h9();
        }

        public b hc() {
            this.copyOnWrite();
            ((c1)this.instance).sd();
            return this;
        }

        public b hd(com.google.api.A.b a$b0) {
            this.copyOnWrite();
            ((c1)this.instance).Se(((A)a$b0.build()));
            return this;
        }

        @Override  // com.google.api.d1
        public int ib() {
            return ((c1)this.instance).ib();
        }

        public b ic() {
            this.copyOnWrite();
            ((c1)this.instance).td();
            return this;
        }

        public b id(A a0) {
            this.copyOnWrite();
            ((c1)this.instance).Se(a0);
            return this;
        }

        public b jc() {
            this.copyOnWrite();
            ((c1)this.instance).ud();
            return this;
        }

        public b jd(com.google.api.F.b f$b0) {
            this.copyOnWrite();
            ((c1)this.instance).Te(((F)f$b0.build()));
            return this;
        }

        @Override  // com.google.api.d1
        public boolean k7() {
            return ((c1)this.instance).k7();
        }

        @Override  // com.google.api.d1
        public boolean k8() {
            return ((c1)this.instance).k8();
        }

        public b kc() {
            this.copyOnWrite();
            ((c1)this.instance).vd();
            return this;
        }

        public b kd(F f0) {
            this.copyOnWrite();
            ((c1)this.instance).Te(f0);
            return this;
        }

        @Override  // com.google.api.d1
        public boolean lb() {
            return ((c1)this.instance).lb();
        }

        public b lc() {
            this.copyOnWrite();
            ((c1)this.instance).wd();
            return this;
        }

        public b ld(com.google.api.N.b n$b0) {
            this.copyOnWrite();
            ((c1)this.instance).Ue(((N)n$b0.build()));
            return this;
        }

        @Override  // com.google.api.d1
        public ByteString m() {
            return ((c1)this.instance).m();
        }

        public b mc() {
            this.copyOnWrite();
            ((c1)this.instance).xd();
            return this;
        }

        public b md(N n0) {
            this.copyOnWrite();
            ((c1)this.instance).Ue(n0);
            return this;
        }

        @Override  // com.google.api.d1
        public Enum n1(int v) {
            return ((c1)this.instance).n1(v);
        }

        @Override  // com.google.api.d1
        public boolean n9() {
            return ((c1)this.instance).n9();
        }

        public b nc() {
            this.copyOnWrite();
            ((c1)this.instance).yd();
            return this;
        }

        public b nd(int v, com.google.api.T.b t$b0) {
            this.copyOnWrite();
            ((c1)this.instance).Ve(v, ((T)t$b0.build()));
            return this;
        }

        @Override  // com.google.api.d1
        public int o1() {
            return ((c1)this.instance).o1();
        }

        @Override  // com.google.api.d1
        public boolean o6() {
            return ((c1)this.instance).o6();
        }

        public b oc() {
            this.copyOnWrite();
            ((c1)this.instance).zd();
            return this;
        }

        public b od(int v, T t0) {
            this.copyOnWrite();
            ((c1)this.instance).Ve(v, t0);
            return this;
        }

        public b pc() {
            this.copyOnWrite();
            ((c1)this.instance).Ad();
            return this;
        }

        public b pd(int v, com.google.protobuf.Enum.Builder enum$Builder0) {
            this.copyOnWrite();
            ((c1)this.instance).We(v, ((Enum)enum$Builder0.build()));
            return this;
        }

        public b qc() {
            this.copyOnWrite();
            ((c1)this.instance).Bd();
            return this;
        }

        public b qd(int v, Enum enum0) {
            this.copyOnWrite();
            ((c1)this.instance).We(v, enum0);
            return this;
        }

        @Override  // com.google.api.d1
        public n0 r0(int v) {
            return ((c1)this.instance).r0(v);
        }

        public b rc() {
            this.copyOnWrite();
            ((c1)this.instance).clearMetrics();
            return this;
        }

        public b rd(com.google.api.Y.b y$b0) {
            this.copyOnWrite();
            ((c1)this.instance).Xe(((Y)y$b0.build()));
            return this;
        }

        @Override  // com.google.api.d1
        public boolean s6() {
            return ((c1)this.instance).s6();
        }

        @Override  // com.google.api.d1
        public int s8() {
            return ((c1)this.instance).s8();
        }

        public b sc() {
            this.copyOnWrite();
            ((c1)this.instance).Cd();
            return this;
        }

        public b sd(Y y0) {
            this.copyOnWrite();
            ((c1)this.instance).Xe(y0);
            return this;
        }

        @Override  // com.google.api.d1
        public n1 tb() {
            return ((c1)this.instance).tb();
        }

        public b tc() {
            this.copyOnWrite();
            ((c1)this.instance).Dd();
            return this;
        }

        public b td(String s) {
            this.copyOnWrite();
            ((c1)this.instance).Ye(s);
            return this;
        }

        @Override  // com.google.api.d1
        public T u3(int v) {
            return ((c1)this.instance).u3(v);
        }

        @Override  // com.google.api.d1
        public r u4() {
            return ((c1)this.instance).u4();
        }

        public b ub(Iterable iterable0) {
            this.copyOnWrite();
            ((c1)this.instance).Uc(iterable0);
            return this;
        }

        public b uc() {
            this.copyOnWrite();
            ((c1)this.instance).clearName();
            return this;
        }

        public b ud(ByteString byteString0) {
            this.copyOnWrite();
            ((c1)this.instance).Ze(byteString0);
            return this;
        }

        @Override  // com.google.api.d1
        public boolean v3() {
            return ((c1)this.instance).v3();
        }

        public b vb(Iterable iterable0) {
            this.copyOnWrite();
            ((c1)this.instance).Vc(iterable0);
            return this;
        }

        public b vc() {
            this.copyOnWrite();
            ((c1)this.instance).Ed();
            return this;
        }

        public b vd(com.google.api.q0.b q0$b0) {
            this.copyOnWrite();
            ((c1)this.instance).af(((q0)q0$b0.build()));
            return this;
        }

        @Override  // com.google.api.d1
        public UInt32Value w6() {
            return ((c1)this.instance).w6();
        }

        public b wb(Iterable iterable0) {
            this.copyOnWrite();
            ((c1)this.instance).Wc(iterable0);
            return this;
        }

        public b wc() {
            this.copyOnWrite();
            ((c1)this.instance).Fd();
            return this;
        }

        public b wd(q0 q00) {
            this.copyOnWrite();
            ((c1)this.instance).af(q00);
            return this;
        }

        public b xb(Iterable iterable0) {
            this.copyOnWrite();
            ((c1)this.instance).Xc(iterable0);
            return this;
        }

        public b xc() {
            this.copyOnWrite();
            ((c1)this.instance).Gd();
            return this;
        }

        public b xd(int v, com.google.api.n0.b n0$b0) {
            this.copyOnWrite();
            ((c1)this.instance).bf(v, ((n0)n0$b0.build()));
            return this;
        }

        @Override  // com.google.api.d1
        public int y0() {
            return ((c1)this.instance).y0();
        }

        @Override  // com.google.api.d1
        public List y5() {
            return DesugarCollections.unmodifiableList(((c1)this.instance).y5());
        }

        public b yb(Iterable iterable0) {
            this.copyOnWrite();
            ((c1)this.instance).addAllMetrics(iterable0);
            return this;
        }

        public b yc() {
            this.copyOnWrite();
            ((c1)this.instance).Hd();
            return this;
        }

        public b yd(int v, n0 n00) {
            this.copyOnWrite();
            ((c1)this.instance).bf(v, n00);
            return this;
        }

        public b zb(Iterable iterable0) {
            this.copyOnWrite();
            ((c1)this.instance).Yc(iterable0);
            return this;
        }

        public b zc() {
            this.copyOnWrite();
            ((c1)this.instance).Id();
            return this;
        }

        public b zd(int v, com.google.api.u0.b u0$b0) {
            this.copyOnWrite();
            ((c1)this.instance).cf(v, ((u0)u0$b0.build()));
            return this;
        }
    }

    public static final int APIS_FIELD_NUMBER = 3;
    public static final int AUTHENTICATION_FIELD_NUMBER = 11;
    public static final int BACKEND_FIELD_NUMBER = 8;
    public static final int BILLING_FIELD_NUMBER = 26;
    public static final int CONFIG_VERSION_FIELD_NUMBER = 20;
    public static final int CONTEXT_FIELD_NUMBER = 12;
    public static final int CONTROL_FIELD_NUMBER = 21;
    private static final c1 DEFAULT_INSTANCE = null;
    public static final int DOCUMENTATION_FIELD_NUMBER = 6;
    public static final int ENDPOINTS_FIELD_NUMBER = 18;
    public static final int ENUMS_FIELD_NUMBER = 5;
    public static final int HTTP_FIELD_NUMBER = 9;
    public static final int ID_FIELD_NUMBER = 33;
    public static final int LOGGING_FIELD_NUMBER = 27;
    public static final int LOGS_FIELD_NUMBER = 23;
    public static final int METRICS_FIELD_NUMBER = 24;
    public static final int MONITORED_RESOURCES_FIELD_NUMBER = 25;
    public static final int MONITORING_FIELD_NUMBER = 28;
    public static final int NAME_FIELD_NUMBER = 1;
    private static volatile Parser PARSER = null;
    public static final int PRODUCER_PROJECT_ID_FIELD_NUMBER = 22;
    public static final int QUOTA_FIELD_NUMBER = 10;
    public static final int SOURCE_INFO_FIELD_NUMBER = 37;
    public static final int SYSTEM_PARAMETERS_FIELD_NUMBER = 29;
    public static final int TITLE_FIELD_NUMBER = 2;
    public static final int TYPES_FIELD_NUMBER = 4;
    public static final int USAGE_FIELD_NUMBER = 15;
    private ProtobufList apis_;
    private i authentication_;
    private m backend_;
    private r billing_;
    private UInt32Value configVersion_;
    private A context_;
    private F control_;
    private N documentation_;
    private ProtobufList endpoints_;
    private ProtobufList enums_;
    private Y http_;
    private String id_;
    private q0 logging_;
    private ProtobufList logs_;
    private ProtobufList metrics_;
    private ProtobufList monitoredResources_;
    private H0 monitoring_;
    private String name_;
    private String producerProjectId_;
    private S0 quota_;
    private f1 sourceInfo_;
    private n1 systemParameters_;
    private String title_;
    private ProtobufList types_;
    private p1 usage_;

    static {
        c1 c10 = new c1();
        c1.DEFAULT_INSTANCE = c10;
        GeneratedMessageLite.registerDefaultInstance(c1.class, c10);
    }

    private c1() {
        this.name_ = "";
        this.id_ = "";
        this.title_ = "";
        this.producerProjectId_ = "";
        this.apis_ = GeneratedMessageLite.emptyProtobufList();
        this.types_ = GeneratedMessageLite.emptyProtobufList();
        this.enums_ = GeneratedMessageLite.emptyProtobufList();
        this.endpoints_ = GeneratedMessageLite.emptyProtobufList();
        this.logs_ = GeneratedMessageLite.emptyProtobufList();
        this.metrics_ = GeneratedMessageLite.emptyProtobufList();
        this.monitoredResources_ = GeneratedMessageLite.emptyProtobufList();
    }

    @Override  // com.google.api.d1
    public List A0() {
        return this.logs_;
    }

    private void Ad() {
        this.logging_ = null;
    }

    public static c1 Ae(CodedInputStream codedInputStream0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
        return (c1)GeneratedMessageLite.parseFrom(c1.DEFAULT_INSTANCE, codedInputStream0, extensionRegistryLite0);
    }

    @Override  // com.google.api.d1
    public i B4() {
        return this.authentication_ == null ? i.yb() : this.authentication_;
    }

    private void Bd() {
        this.logs_ = GeneratedMessageLite.emptyProtobufList();
    }

    public static c1 Be(InputStream inputStream0) throws IOException {
        return (c1)GeneratedMessageLite.parseFrom(c1.DEFAULT_INSTANCE, inputStream0);
    }

    @Override  // com.google.api.d1
    public p1 C0() {
        return this.usage_ == null ? p1.Bb() : this.usage_;
    }

    @Override  // com.google.api.d1
    public S0 C2() {
        return this.quota_ == null ? S0.yb() : this.quota_;
    }

    @Override  // com.google.api.d1
    public List C6() {
        return this.types_;
    }

    @Override  // com.google.api.d1
    public List C7() {
        return this.apis_;
    }

    private void Cd() {
        this.monitoredResources_ = GeneratedMessageLite.emptyProtobufList();
    }

    public static c1 Ce(InputStream inputStream0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
        return (c1)GeneratedMessageLite.parseFrom(c1.DEFAULT_INSTANCE, inputStream0, extensionRegistryLite0);
    }

    private void Dd() {
        this.monitoring_ = null;
    }

    public static c1 De(ByteBuffer byteBuffer0) throws InvalidProtocolBufferException {
        return (c1)GeneratedMessageLite.parseFrom(c1.DEFAULT_INSTANCE, byteBuffer0);
    }

    @Override  // com.google.api.d1
    public Api E9(int v) {
        return (Api)this.apis_.get(v);
    }

    private void Ed() {
        this.producerProjectId_ = c1.Td().Y7();
    }

    public static c1 Ee(ByteBuffer byteBuffer0, ExtensionRegistryLite extensionRegistryLite0) throws InvalidProtocolBufferException {
        return (c1)GeneratedMessageLite.parseFrom(c1.DEFAULT_INSTANCE, byteBuffer0, extensionRegistryLite0);
    }

    private void Fd() {
        this.quota_ = null;
    }

    public static c1 Fe(byte[] arr_b) throws InvalidProtocolBufferException {
        return (c1)GeneratedMessageLite.parseFrom(c1.DEFAULT_INSTANCE, arr_b);
    }

    @Override  // com.google.api.d1
    public int G3() {
        return this.endpoints_.size();
    }

    private void Gd() {
        this.sourceInfo_ = null;
    }

    public static c1 Ge(byte[] arr_b, ExtensionRegistryLite extensionRegistryLite0) throws InvalidProtocolBufferException {
        return (c1)GeneratedMessageLite.parseFrom(c1.DEFAULT_INSTANCE, arr_b, extensionRegistryLite0);
    }

    @Override  // com.google.api.d1
    public B0 H6(int v) {
        return (B0)this.monitoredResources_.get(v);
    }

    private void Hd() {
        this.systemParameters_ = null;
    }

    private void He(int v) {
        this.Ld();
        this.apis_.remove(v);
    }

    private void Id() {
        this.title_ = c1.Td().getTitle();
    }

    private void Ie(int v) {
        this.Md();
        this.endpoints_.remove(v);
    }

    @Override  // com.google.api.d1
    public q0 J9() {
        return this.logging_ == null ? q0.Ab() : this.logging_;
    }

    private void Jd() {
        this.types_ = GeneratedMessageLite.emptyProtobufList();
    }

    private void Je(int v) {
        this.Nd();
        this.enums_.remove(v);
    }

    @Override  // com.google.api.d1
    public H0 K1() {
        return this.monitoring_ == null ? H0.Ab() : this.monitoring_;
    }

    @Override  // com.google.api.d1
    public int K2() {
        return this.apis_.size();
    }

    private void Kd() {
        this.usage_ = null;
    }

    private void Ke(int v) {
        this.Od();
        this.logs_.remove(v);
    }

    private void Ld() {
        ProtobufList internal$ProtobufList0 = this.apis_;
        if(!internal$ProtobufList0.isModifiable()) {
            this.apis_ = GeneratedMessageLite.mutableCopy(internal$ProtobufList0);
        }
    }

    private void Le(int v) {
        this.Pd();
        this.monitoredResources_.remove(v);
    }

    private void Md() {
        ProtobufList internal$ProtobufList0 = this.endpoints_;
        if(!internal$ProtobufList0.isModifiable()) {
            this.endpoints_ = GeneratedMessageLite.mutableCopy(internal$ProtobufList0);
        }
    }

    private void Me(int v) {
        this.Qd();
        this.types_.remove(v);
    }

    private void Nd() {
        ProtobufList internal$ProtobufList0 = this.enums_;
        if(!internal$ProtobufList0.isModifiable()) {
            this.enums_ = GeneratedMessageLite.mutableCopy(internal$ProtobufList0);
        }
    }

    private void Ne(int v, Api api0) {
        api0.getClass();
        this.Ld();
        this.apis_.set(v, api0);
    }

    @Override  // com.google.api.d1
    public N O5() {
        return this.documentation_ == null ? N.Kb() : this.documentation_;
    }

    private void Od() {
        ProtobufList internal$ProtobufList0 = this.logs_;
        if(!internal$ProtobufList0.isModifiable()) {
            this.logs_ = GeneratedMessageLite.mutableCopy(internal$ProtobufList0);
        }
    }

    private void Oe(i i0) {
        i0.getClass();
        this.authentication_ = i0;
    }

    private void Pd() {
        ProtobufList internal$ProtobufList0 = this.monitoredResources_;
        if(!internal$ProtobufList0.isModifiable()) {
            this.monitoredResources_ = GeneratedMessageLite.mutableCopy(internal$ProtobufList0);
        }
    }

    private void Pe(m m0) {
        m0.getClass();
        this.backend_ = m0;
    }

    @Override  // com.google.api.d1
    public ByteString Q0() {
        return ByteString.copyFromUtf8(this.title_);
    }

    @Override  // com.google.api.d1
    public F Q7() {
        return this.control_ == null ? F.M4() : this.control_;
    }

    private void Qd() {
        ProtobufList internal$ProtobufList0 = this.types_;
        if(!internal$ProtobufList0.isModifiable()) {
            this.types_ = GeneratedMessageLite.mutableCopy(internal$ProtobufList0);
        }
    }

    private void Qe(r r0) {
        r0.getClass();
        this.billing_ = r0;
    }

    @Override  // com.google.api.d1
    public Y R4() {
        return this.http_ == null ? Y.j9() : this.http_;
    }

    public ApiOrBuilder Rd(int v) {
        return (ApiOrBuilder)this.apis_.get(v);
    }

    private void Re(UInt32Value uInt32Value0) {
        uInt32Value0.getClass();
        this.configVersion_ = uInt32Value0;
    }

    @Override  // com.google.api.d1
    public f1 S() {
        return this.sourceInfo_ == null ? f1.Z7() : this.sourceInfo_;
    }

    @Override  // com.google.api.d1
    public boolean S3() {
        return this.authentication_ != null;
    }

    @Override  // com.google.api.d1
    public boolean Sa() {
        return this.context_ != null;
    }

    public List Sd() {
        return this.apis_;
    }

    private void Se(A a0) {
        a0.getClass();
        this.context_ = a0;
    }

    @Override  // com.google.api.d1
    public List T3() {
        return this.endpoints_;
    }

    @Override  // com.google.api.d1
    public Type T5(int v) {
        return (Type)this.types_.get(v);
    }

    public static c1 Td() {
        return c1.DEFAULT_INSTANCE;
    }

    private void Te(F f0) {
        f0.getClass();
        this.control_ = f0;
    }

    private void Uc(Iterable iterable0) {
        this.Ld();
        AbstractMessageLite.addAll(iterable0, this.apis_);
    }

    public U Ud(int v) {
        return (U)this.endpoints_.get(v);
    }

    private void Ue(N n0) {
        n0.getClass();
        this.documentation_ = n0;
    }

    private void Vc(Iterable iterable0) {
        this.Md();
        AbstractMessageLite.addAll(iterable0, this.endpoints_);
    }

    public List Vd() {
        return this.endpoints_;
    }

    private void Ve(int v, T t0) {
        t0.getClass();
        this.Md();
        this.endpoints_.set(v, t0);
    }

    private void Wc(Iterable iterable0) {
        this.Nd();
        AbstractMessageLite.addAll(iterable0, this.enums_);
    }

    public EnumOrBuilder Wd(int v) {
        return (EnumOrBuilder)this.enums_.get(v);
    }

    private void We(int v, Enum enum0) {
        enum0.getClass();
        this.Nd();
        this.enums_.set(v, enum0);
    }

    private void Xc(Iterable iterable0) {
        this.Od();
        AbstractMessageLite.addAll(iterable0, this.logs_);
    }

    public List Xd() {
        return this.enums_;
    }

    private void Xe(Y y0) {
        y0.getClass();
        this.http_ = y0;
    }

    @Override  // com.google.api.d1
    public ByteString Y6() {
        return ByteString.copyFromUtf8(this.producerProjectId_);
    }

    @Override  // com.google.api.d1
    public String Y7() [...] // 潜在的解密器

    private void Yc(Iterable iterable0) {
        this.Pd();
        AbstractMessageLite.addAll(iterable0, this.monitoredResources_);
    }

    public o0 Yd(int v) {
        return (o0)this.logs_.get(v);
    }

    private void Ye(String s) {
        s.getClass();
        this.id_ = s;
    }

    @Override  // com.google.api.d1
    public boolean Z2() {
        return this.usage_ != null;
    }

    private void Zc(Iterable iterable0) {
        this.Qd();
        AbstractMessageLite.addAll(iterable0, this.types_);
    }

    public List Zd() {
        return this.logs_;
    }

    private void Ze(ByteString byteString0) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString0);
        this.id_ = byteString0.toStringUtf8();
    }

    private void ad(int v, Api api0) {
        api0.getClass();
        this.Ld();
        this.apis_.add(v, api0);
    }

    private void addAllMetrics(Iterable iterable0) {
        this.ensureMetricsIsMutable();
        AbstractMessageLite.addAll(iterable0, this.metrics_);
    }

    public v0 ae(int v) {
        return (v0)this.metrics_.get(v);
    }

    private void af(q0 q00) {
        q00.getClass();
        this.logging_ = q00;
    }

    @Override  // com.google.api.d1
    public boolean b9() {
        return this.monitoring_ != null;
    }

    private void bd(Api api0) {
        api0.getClass();
        this.Ld();
        this.apis_.add(api0);
    }

    public C0 be(int v) {
        return (C0)this.monitoredResources_.get(v);
    }

    private void bf(int v, n0 n00) {
        n00.getClass();
        this.Od();
        this.logs_.set(v, n00);
    }

    private void cd(int v, T t0) {
        t0.getClass();
        this.Md();
        this.endpoints_.add(v, t0);
    }

    public List ce() {
        return this.monitoredResources_;
    }

    private void cf(int v, u0 u00) {
        u00.getClass();
        this.ensureMetricsIsMutable();
        this.metrics_.set(v, u00);
    }

    private void clearMetrics() {
        this.metrics_ = GeneratedMessageLite.emptyProtobufList();
    }

    private void clearName() {
        this.name_ = c1.Td().getName();
    }

    private void dd(T t0) {
        t0.getClass();
        this.Md();
        this.endpoints_.add(t0);
    }

    public TypeOrBuilder de(int v) {
        return (TypeOrBuilder)this.types_.get(v);
    }

    private void df(int v, B0 b00) {
        b00.getClass();
        this.Pd();
        this.monitoredResources_.set(v, b00);
    }

    @Override  // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(MethodToInvoke generatedMessageLite$MethodToInvoke0, Object object0, Object object1) {
        switch(generatedMessageLite$MethodToInvoke0) {
            case 1: {
                return new c1();
            }
            case 2: {
                return new b(null);
            }
            case 3: {
                return GeneratedMessageLite.newMessageInfo(c1.DEFAULT_INSTANCE, "\u0000\u0019\u0000\u0000\u0001%\u0019\u0000\u0007\u0000\u0001Ȉ\u0002Ȉ\u0003\u001B\u0004\u001B\u0005\u001B\u0006\t\b\t\t\t\n\t\u000B\t\f\t\u000F\t\u0012\u001B\u0014\t\u0015\t\u0016Ȉ\u0017\u001B\u0018\u001B\u0019\u001B\u001A\t\u001B\t\u001C\t\u001D\t!Ȉ%\t", new Object[]{"name_", "title_", "apis_", Api.class, "types_", Type.class, "enums_", Enum.class, "documentation_", "backend_", "http_", "quota_", "authentication_", "context_", "usage_", "endpoints_", T.class, "configVersion_", "control_", "producerProjectId_", "logs_", n0.class, "metrics_", u0.class, "monitoredResources_", B0.class, "billing_", "logging_", "monitoring_", "systemParameters_", "id_", "sourceInfo_"});
            }
            case 4: {
                return c1.DEFAULT_INSTANCE;
            }
            case 5: {
                Parser parser0 = c1.PARSER;
                if(parser0 == null) {
                    Class class0 = c1.class;
                    synchronized(class0) {
                        parser0 = c1.PARSER;
                        if(parser0 == null) {
                            parser0 = new DefaultInstanceBasedParser(c1.DEFAULT_INSTANCE);
                            c1.PARSER = parser0;
                        }
                    }
                }
                return parser0;
            }
            case 6: {
                return (byte)1;
            }
            case 7: {
                return null;
            }
            default: {
                throw new UnsupportedOperationException();
            }
        }
    }

    private void ed(int v, Enum enum0) {
        enum0.getClass();
        this.Nd();
        this.enums_.add(v, enum0);
    }

    public List ee() {
        return this.types_;
    }

    private void ef(H0 h00) {
        h00.getClass();
        this.monitoring_ = h00;
    }

    private void ensureMetricsIsMutable() {
        ProtobufList internal$ProtobufList0 = this.metrics_;
        if(!internal$ProtobufList0.isModifiable()) {
            this.metrics_ = GeneratedMessageLite.mutableCopy(internal$ProtobufList0);
        }
    }

    @Override  // com.google.api.d1
    public boolean f5() {
        return this.configVersion_ != null;
    }

    @Override  // com.google.api.d1
    public boolean fa() {
        return this.http_ != null;
    }

    private void fd(Enum enum0) {
        enum0.getClass();
        this.Nd();
        this.enums_.add(enum0);
    }

    private void fe(i i0) {
        i0.getClass();
        if(this.authentication_ != null && this.authentication_ != i.yb()) {
            this.authentication_ = (i)((com.google.api.i.b)i.Eb(this.authentication_).mergeFrom(i0)).buildPartial();
            return;
        }
        this.authentication_ = i0;
    }

    private void ff(String s) {
        s.getClass();
        this.producerProjectId_ = s;
    }

    @Override  // com.google.api.d1
    public m g2() {
        return this.backend_ == null ? m.Z7() : this.backend_;
    }

    private void gd(int v, n0 n00) {
        n00.getClass();
        this.Od();
        this.logs_.add(v, n00);
    }

    private void ge(m m0) {
        m0.getClass();
        if(this.backend_ != null && this.backend_ != m.Z7()) {
            this.backend_ = (m)((com.google.api.m.b)m.ca(this.backend_).mergeFrom(m0)).buildPartial();
            return;
        }
        this.backend_ = m0;
    }

    @Override  // com.google.api.d1
    public A getContext() {
        return this.context_ == null ? A.Z7() : this.context_;
    }

    @Override  // com.google.api.d1
    public String getId() [...] // 潜在的解密器

    @Override  // com.google.api.d1
    public u0 getMetrics(int v) {
        return (u0)this.metrics_.get(v);
    }

    @Override  // com.google.api.d1
    public int getMetricsCount() {
        return this.metrics_.size();
    }

    @Override  // com.google.api.d1
    public List getMetricsList() {
        return this.metrics_;
    }

    public List getMetricsOrBuilderList() {
        return this.metrics_;
    }

    @Override  // com.google.api.d1
    public String getName() {
        return this.name_;
    }

    @Override  // com.google.api.d1
    public ByteString getNameBytes() {
        return ByteString.copyFromUtf8(this.name_);
    }

    @Override  // com.google.api.d1
    public String getTitle() {
        return this.title_;
    }

    private void gf(ByteString byteString0) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString0);
        this.producerProjectId_ = byteString0.toStringUtf8();
    }

    @Override  // com.google.api.d1
    public List h2() {
        return this.enums_;
    }

    @Override  // com.google.api.d1
    public boolean h9() {
        return this.backend_ != null;
    }

    private void hd(n0 n00) {
        n00.getClass();
        this.Od();
        this.logs_.add(n00);
    }

    private void he(r r0) {
        r0.getClass();
        if(this.billing_ != null && this.billing_ != r.A8()) {
            this.billing_ = (r)((d)r.ca(this.billing_).mergeFrom(r0)).buildPartial();
            return;
        }
        this.billing_ = r0;
    }

    private void hf(S0 s00) {
        s00.getClass();
        this.quota_ = s00;
    }

    @Override  // com.google.api.d1
    public int ib() {
        return this.types_.size();
    }

    private void id(int v, u0 u00) {
        u00.getClass();
        this.ensureMetricsIsMutable();
        this.metrics_.add(v, u00);
    }

    private void ie(UInt32Value uInt32Value0) {
        uInt32Value0.getClass();
        if(this.configVersion_ != null && this.configVersion_ != UInt32Value.getDefaultInstance()) {
            this.configVersion_ = (UInt32Value)((com.google.protobuf.UInt32Value.Builder)UInt32Value.newBuilder(this.configVersion_).mergeFrom(uInt32Value0)).buildPartial();
            return;
        }
        this.configVersion_ = uInt32Value0;
    }

    private void if(f1 f10) {
        f10.getClass();
        this.sourceInfo_ = f10;
    }

    private void jd(u0 u00) {
        u00.getClass();
        this.ensureMetricsIsMutable();
        this.metrics_.add(u00);
    }

    private void je(A a0) {
        a0.getClass();
        if(this.context_ != null && this.context_ != A.Z7()) {
            this.context_ = (A)((com.google.api.A.b)A.ca(this.context_).mergeFrom(a0)).buildPartial();
            return;
        }
        this.context_ = a0;
    }

    private void jf(n1 n10) {
        n10.getClass();
        this.systemParameters_ = n10;
    }

    @Override  // com.google.api.d1
    public boolean k7() {
        return this.quota_ != null;
    }

    @Override  // com.google.api.d1
    public boolean k8() {
        return this.sourceInfo_ != null;
    }

    private void kd(int v, B0 b00) {
        b00.getClass();
        this.Pd();
        this.monitoredResources_.add(v, b00);
    }

    private void ke(F f0) {
        f0.getClass();
        if(this.control_ != null && this.control_ != F.M4()) {
            this.control_ = (F)((com.google.api.F.b)F.d6(this.control_).mergeFrom(f0)).buildPartial();
            return;
        }
        this.control_ = f0;
    }

    private void kf(String s) {
        s.getClass();
        this.title_ = s;
    }

    @Override  // com.google.api.d1
    public boolean lb() {
        return this.control_ != null;
    }

    private void ld(B0 b00) {
        b00.getClass();
        this.Pd();
        this.monitoredResources_.add(b00);
    }

    private void le(N n0) {
        n0.getClass();
        if(this.documentation_ != null && this.documentation_ != N.Kb()) {
            this.documentation_ = (N)((com.google.api.N.b)N.Qb(this.documentation_).mergeFrom(n0)).buildPartial();
            return;
        }
        this.documentation_ = n0;
    }

    private void lf(ByteString byteString0) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString0);
        this.title_ = byteString0.toStringUtf8();
    }

    @Override  // com.google.api.d1
    public ByteString m() {
        return ByteString.copyFromUtf8(this.id_);
    }

    private void md(int v, Type type0) {
        type0.getClass();
        this.Qd();
        this.types_.add(v, type0);
    }

    private void me(Y y0) {
        y0.getClass();
        if(this.http_ != null && this.http_ != Y.j9()) {
            this.http_ = (Y)((com.google.api.Y.b)Y.ub(this.http_).mergeFrom(y0)).buildPartial();
            return;
        }
        this.http_ = y0;
    }

    private void mf(int v, Type type0) {
        type0.getClass();
        this.Qd();
        this.types_.set(v, type0);
    }

    @Override  // com.google.api.d1
    public Enum n1(int v) {
        return (Enum)this.enums_.get(v);
    }

    @Override  // com.google.api.d1
    public boolean n9() {
        return this.documentation_ != null;
    }

    private void nd(Type type0) {
        type0.getClass();
        this.Qd();
        this.types_.add(type0);
    }

    private void ne(q0 q00) {
        q00.getClass();
        if(this.logging_ != null && this.logging_ != q0.Ab()) {
            this.logging_ = (q0)((com.google.api.q0.b)q0.Eb(this.logging_).mergeFrom(q00)).buildPartial();
            return;
        }
        this.logging_ = q00;
    }

    private void nf(p1 p10) {
        p10.getClass();
        this.usage_ = p10;
    }

    @Override  // com.google.api.d1
    public int o1() {
        return this.monitoredResources_.size();
    }

    @Override  // com.google.api.d1
    public boolean o6() {
        return this.systemParameters_ != null;
    }

    private void od() {
        this.apis_ = GeneratedMessageLite.emptyProtobufList();
    }

    private void oe(H0 h00) {
        h00.getClass();
        if(this.monitoring_ != null && this.monitoring_ != H0.Ab()) {
            this.monitoring_ = (H0)((com.google.api.H0.b)H0.Eb(this.monitoring_).mergeFrom(h00)).buildPartial();
            return;
        }
        this.monitoring_ = h00;
    }

    public static Parser parser() {
        return c1.DEFAULT_INSTANCE.getParserForType();
    }

    private void pd() {
        this.authentication_ = null;
    }

    private void pe(S0 s00) {
        s00.getClass();
        if(this.quota_ != null && this.quota_ != S0.yb()) {
            this.quota_ = (S0)((com.google.api.S0.b)S0.Eb(this.quota_).mergeFrom(s00)).buildPartial();
            return;
        }
        this.quota_ = s00;
    }

    private void qd() {
        this.backend_ = null;
    }

    private void qe(f1 f10) {
        f10.getClass();
        if(this.sourceInfo_ != null && this.sourceInfo_ != f1.Z7()) {
            this.sourceInfo_ = (f1)((com.google.api.f1.b)f1.ca(this.sourceInfo_).mergeFrom(f10)).buildPartial();
            return;
        }
        this.sourceInfo_ = f10;
    }

    @Override  // com.google.api.d1
    public n0 r0(int v) {
        return (n0)this.logs_.get(v);
    }

    private void rd() {
        this.billing_ = null;
    }

    private void re(n1 n10) {
        n10.getClass();
        if(this.systemParameters_ != null && this.systemParameters_ != n1.Z7()) {
            this.systemParameters_ = (n1)((com.google.api.n1.b)n1.ca(this.systemParameters_).mergeFrom(n10)).buildPartial();
            return;
        }
        this.systemParameters_ = n10;
    }

    private void removeMetrics(int v) {
        this.ensureMetricsIsMutable();
        this.metrics_.remove(v);
    }

    @Override  // com.google.api.d1
    public boolean s6() {
        return this.billing_ != null;
    }

    @Override  // com.google.api.d1
    public int s8() {
        return this.enums_.size();
    }

    private void sd() {
        this.configVersion_ = null;
    }

    private void se(p1 p10) {
        p10.getClass();
        if(this.usage_ != null && this.usage_ != p1.Bb()) {
            this.usage_ = (p1)((com.google.api.p1.b)p1.Fb(this.usage_).mergeFrom(p10)).buildPartial();
            return;
        }
        this.usage_ = p10;
    }

    private void setName(String s) {
        s.getClass();
        this.name_ = s;
    }

    private void setNameBytes(ByteString byteString0) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString0);
        this.name_ = byteString0.toStringUtf8();
    }

    @Override  // com.google.api.d1
    public n1 tb() {
        return this.systemParameters_ == null ? n1.Z7() : this.systemParameters_;
    }

    private void td() {
        this.context_ = null;
    }

    public static b te() {
        return (b)c1.DEFAULT_INSTANCE.createBuilder();
    }

    @Override  // com.google.api.d1
    public T u3(int v) {
        return (T)this.endpoints_.get(v);
    }

    @Override  // com.google.api.d1
    public r u4() {
        return this.billing_ == null ? r.A8() : this.billing_;
    }

    private void ud() {
        this.control_ = null;
    }

    public static b ue(c1 c10) {
        return (b)c1.DEFAULT_INSTANCE.createBuilder(c10);
    }

    @Override  // com.google.api.d1
    public boolean v3() {
        return this.logging_ != null;
    }

    private void vd() {
        this.documentation_ = null;
    }

    public static c1 ve(InputStream inputStream0) throws IOException {
        return (c1)GeneratedMessageLite.parseDelimitedFrom(c1.DEFAULT_INSTANCE, inputStream0);
    }

    @Override  // com.google.api.d1
    public UInt32Value w6() {
        return this.configVersion_ == null ? UInt32Value.getDefaultInstance() : this.configVersion_;
    }

    private void wd() {
        this.endpoints_ = GeneratedMessageLite.emptyProtobufList();
    }

    public static c1 we(InputStream inputStream0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
        return (c1)GeneratedMessageLite.parseDelimitedFrom(c1.DEFAULT_INSTANCE, inputStream0, extensionRegistryLite0);
    }

    private void xd() {
        this.enums_ = GeneratedMessageLite.emptyProtobufList();
    }

    public static c1 xe(ByteString byteString0) throws InvalidProtocolBufferException {
        return (c1)GeneratedMessageLite.parseFrom(c1.DEFAULT_INSTANCE, byteString0);
    }

    @Override  // com.google.api.d1
    public int y0() {
        return this.logs_.size();
    }

    @Override  // com.google.api.d1
    public List y5() {
        return this.monitoredResources_;
    }

    private void yd() {
        this.http_ = null;
    }

    public static c1 ye(ByteString byteString0, ExtensionRegistryLite extensionRegistryLite0) throws InvalidProtocolBufferException {
        return (c1)GeneratedMessageLite.parseFrom(c1.DEFAULT_INSTANCE, byteString0, extensionRegistryLite0);
    }

    private void zd() {
        this.id_ = "";
    }

    public static c1 ze(CodedInputStream codedInputStream0) throws IOException {
        return (c1)GeneratedMessageLite.parseFrom(c1.DEFAULT_INSTANCE, codedInputStream0);
    }
}

