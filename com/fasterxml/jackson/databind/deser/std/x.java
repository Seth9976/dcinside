package com.fasterxml.jackson.databind.deser.std;

import com.fasterxml.jackson.core.f;
import com.fasterxml.jackson.core.io.l;
import com.fasterxml.jackson.core.n;
import com.fasterxml.jackson.core.r;
import com.fasterxml.jackson.core.z;
import com.fasterxml.jackson.databind.annotation.b;
import com.fasterxml.jackson.databind.cfg.c;
import com.fasterxml.jackson.databind.h;
import com.fasterxml.jackson.databind.o;
import java.io.IOException;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.HashSet;

public class x {
    static class a {
        static final int[] a;

        static {
            int[] arr_v = new int[c.values().length];
            a.a = arr_v;
            try {
                arr_v[c.a.ordinal()] = 1;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                a.a[c.c.ordinal()] = 2;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                a.a[c.d.ordinal()] = 3;
            }
            catch(NoSuchFieldError unused_ex) {
            }
        }
    }

    @b
    public static class com.fasterxml.jackson.databind.deser.std.x.b extends I {
        public static final com.fasterxml.jackson.databind.deser.std.x.b g;

        static {
            com.fasterxml.jackson.databind.deser.std.x.b.g = new com.fasterxml.jackson.databind.deser.std.x.b();
        }

        public com.fasterxml.jackson.databind.deser.std.x.b() {
            super(BigDecimal.class);
        }

        @Override  // com.fasterxml.jackson.databind.n
        public Object g(n n0, h h0) throws IOException, f {
            return this.r1(n0, h0);
        }

        @Override  // com.fasterxml.jackson.databind.n
        public Object o(h h0) {
            return BigDecimal.ZERO;
        }

        public BigDecimal r1(n n0, h h0) throws IOException {
            String s;
            switch(n0.d0()) {
                case 1: {
                    s = h0.T(n0, this, this.a);
                    break;
                }
                case 3: {
                    return (BigDecimal)this.U(n0, h0);
                }
                case 6: {
                    s = n0.R2();
                    break;
                }
                case 7: {
                    c c0 = this.J(n0, h0, this.a);
                    if(c0 == c.c) {
                        return (BigDecimal)this.c(h0);
                    }
                    return c0 == c.d ? ((BigDecimal)this.o(h0)) : n0.i1();
                }
                case 8: {
                    return n0.i1();
                }
                default: {
                    return (BigDecimal)h0.t0(this.l1(h0), n0);
                }
            }
            c c1 = this.H(h0, s);
            if(c1 == c.c) {
                return (BigDecimal)this.c(h0);
            }
            if(c1 == c.d) {
                return (BigDecimal)this.o(h0);
            }
            String s1 = s.trim();
            if(this.f0(s1)) {
                return (BigDecimal)this.c(h0);
            }
            n0.J4().o(s1.length());
            try {
                return l.h(s1, n0.b4(z.i));
            }
            catch(IllegalArgumentException unused_ex) {
                return (BigDecimal)h0.C0(this.a, s1, "not a valid representation", new Object[0]);
            }
        }

        @Override  // com.fasterxml.jackson.databind.deser.std.I
        public final com.fasterxml.jackson.databind.type.h w() {
            return com.fasterxml.jackson.databind.type.h.g;
        }
    }

    @b
    public static class com.fasterxml.jackson.databind.deser.std.x.c extends I {
        public static final com.fasterxml.jackson.databind.deser.std.x.c g;

        static {
            com.fasterxml.jackson.databind.deser.std.x.c.g = new com.fasterxml.jackson.databind.deser.std.x.c();
        }

        public com.fasterxml.jackson.databind.deser.std.x.c() {
            super(BigInteger.class);
        }

        @Override  // com.fasterxml.jackson.databind.n
        public Object g(n n0, h h0) throws IOException, f {
            return this.r1(n0, h0);
        }

        @Override  // com.fasterxml.jackson.databind.n
        public Object o(h h0) {
            return BigInteger.ZERO;
        }

        public BigInteger r1(n n0, h h0) throws IOException {
            String s;
            if(n0.c4()) {
                return n0.x0();
            }
            switch(n0.d0()) {
                case 1: {
                    s = h0.T(n0, this, this.a);
                    break;
                }
                case 3: {
                    return (BigInteger)this.U(n0, h0);
                }
                case 6: {
                    s = n0.R2();
                    break;
                }
                case 8: {
                    c c0 = this.F(n0, h0, this.a);
                    if(c0 == c.c) {
                        return (BigInteger)this.c(h0);
                    }
                    if(c0 == c.d) {
                        return (BigInteger)this.o(h0);
                    }
                    BigDecimal bigDecimal0 = n0.i1();
                    n0.J4().m(bigDecimal0.scale());
                    return bigDecimal0.toBigInteger();
                }
                default: {
                    return (BigInteger)h0.t0(this.l1(h0), n0);
                }
            }
            c c1 = this.H(h0, s);
            if(c1 == c.c) {
                return (BigInteger)this.c(h0);
            }
            if(c1 == c.d) {
                return (BigInteger)this.o(h0);
            }
            String s1 = s.trim();
            if(this.f0(s1)) {
                return (BigInteger)this.c(h0);
            }
            n0.J4().p(s1.length());
            try {
                return l.n(s1, n0.b4(z.i));
            }
            catch(IllegalArgumentException unused_ex) {
                return (BigInteger)h0.C0(this.a, s1, "not a valid representation", new Object[0]);
            }
        }

        @Override  // com.fasterxml.jackson.databind.deser.std.I
        public final com.fasterxml.jackson.databind.type.h w() {
            return com.fasterxml.jackson.databind.type.h.f;
        }
    }

    @b
    public static final class d extends com.fasterxml.jackson.databind.deser.std.x.l {
        private static final long l = 1L;
        static final d m;
        static final d n;

        static {
            d.m = new d(Boolean.TYPE, Boolean.FALSE);
            d.n = new d(Boolean.class, null);
        }

        public d(Class class0, Boolean boolean0) {
            super(class0, com.fasterxml.jackson.databind.type.h.h, boolean0, Boolean.FALSE);
        }

        @Override  // com.fasterxml.jackson.databind.deser.std.x$l
        public com.fasterxml.jackson.databind.util.a d() {
            return super.d();
        }

        @Override  // com.fasterxml.jackson.databind.n
        public Object g(n n0, h h0) throws IOException, f {
            return this.r1(n0, h0);
        }

        @Override  // com.fasterxml.jackson.databind.deser.std.I
        public Object i(n n0, h h0, com.fasterxml.jackson.databind.jsontype.f f0) throws IOException {
            return this.s1(n0, h0, f0);
        }

        @Override  // com.fasterxml.jackson.databind.deser.std.x$l
        public Object o(h h0) throws o {
            return super.o(h0);
        }

        public Boolean r1(n n0, h h0) throws IOException {
            r r0 = n0.Y();
            if(r0 == r.t) {
                return true;
            }
            if(r0 == r.u) {
                return false;
            }
            return this.j ? Boolean.valueOf(this.u0(n0, h0)) : this.s0(n0, h0, this.a);
        }

        public Boolean s1(n n0, h h0, com.fasterxml.jackson.databind.jsontype.f f0) throws IOException {
            r r0 = n0.Y();
            if(r0 == r.t) {
                return true;
            }
            if(r0 == r.u) {
                return false;
            }
            return this.j ? Boolean.valueOf(this.u0(n0, h0)) : this.s0(n0, h0, this.a);
        }
    }

    @b
    public static class e extends com.fasterxml.jackson.databind.deser.std.x.l {
        private static final long l = 1L;
        static final e m;
        static final e n;

        static {
            e.m = new e(Byte.TYPE, ((byte)0));
            e.n = new e(Byte.class, null);
        }

        public e(Class class0, Byte byte0) {
            super(class0, com.fasterxml.jackson.databind.type.h.f, byte0, ((byte)0));
        }

        @Override  // com.fasterxml.jackson.databind.deser.std.x$l
        public com.fasterxml.jackson.databind.util.a d() {
            return super.d();
        }

        @Override  // com.fasterxml.jackson.databind.n
        public Object g(n n0, h h0) throws IOException, f {
            return this.s1(n0, h0);
        }

        @Override  // com.fasterxml.jackson.databind.deser.std.x$l
        public Object o(h h0) throws o {
            return super.o(h0);
        }

        protected Byte r1(n n0, h h0) throws IOException {
            String s;
            switch(n0.d0()) {
                case 1: {
                    s = h0.T(n0, this, this.a);
                    break;
                }
                case 3: {
                    return (Byte)this.U(n0, h0);
                }
                case 6: {
                    s = n0.R2();
                    break;
                }
                case 7: {
                    return n0.Y0();
                }
                case 8: {
                    c c0 = this.F(n0, h0, this.a);
                    if(c0 == c.c) {
                        return (Byte)this.c(h0);
                    }
                    return c0 == c.d ? ((Byte)this.o(h0)) : n0.Y0();
                }
                case 11: {
                    return (Byte)this.c(h0);
                }
                default: {
                    return (Byte)h0.t0(this.l1(h0), n0);
                }
            }
            c c1 = this.H(h0, s);
            if(c1 == c.c) {
                return (Byte)this.c(h0);
            }
            if(c1 == c.d) {
                return (Byte)this.o(h0);
            }
            String s1 = s.trim();
            if(this.L(h0, s1)) {
                return (Byte)this.c(h0);
            }
            try {
                int v = l.t(s1);
                return this.A(v) ? ((Byte)h0.C0(this.a, s1, "overflow, value cannot be represented as 8-bit value", new Object[0])) : ((byte)v);
            }
            catch(IllegalArgumentException unused_ex) {
                return (Byte)h0.C0(this.a, s1, "not a valid Byte value", new Object[0]);
            }
        }

        public Byte s1(n n0, h h0) throws IOException {
            if(n0.c4()) {
                return n0.Y0();
            }
            return this.j ? this.w0(n0, h0) : this.r1(n0, h0);
        }
    }

    @b
    public static class com.fasterxml.jackson.databind.deser.std.x.f extends com.fasterxml.jackson.databind.deser.std.x.l {
        private static final long l = 1L;
        static final com.fasterxml.jackson.databind.deser.std.x.f m;
        static final com.fasterxml.jackson.databind.deser.std.x.f n;

        static {
            com.fasterxml.jackson.databind.deser.std.x.f.m = new com.fasterxml.jackson.databind.deser.std.x.f(Character.TYPE, Character.valueOf('\u0000'));
            com.fasterxml.jackson.databind.deser.std.x.f.n = new com.fasterxml.jackson.databind.deser.std.x.f(Character.class, null);
        }

        public com.fasterxml.jackson.databind.deser.std.x.f(Class class0, Character character0) {
            super(class0, com.fasterxml.jackson.databind.type.h.f, character0, Character.valueOf('\u0000'));
        }

        @Override  // com.fasterxml.jackson.databind.deser.std.x$l
        public com.fasterxml.jackson.databind.util.a d() {
            return super.d();
        }

        @Override  // com.fasterxml.jackson.databind.n
        public Object g(n n0, h h0) throws IOException, f {
            return this.r1(n0, h0);
        }

        @Override  // com.fasterxml.jackson.databind.deser.std.x$l
        public Object o(h h0) throws o {
            return super.o(h0);
        }

        public Character r1(n n0, h h0) throws IOException {
            String s;
            switch(n0.d0()) {
                case 1: {
                    s = h0.T(n0, this, this.a);
                    break;
                }
                case 3: {
                    return (Character)this.U(n0, h0);
                }
                case 6: {
                    s = n0.R2();
                    break;
                }
                case 7: {
                    c c0 = h0.V(this.w(), this.a, com.fasterxml.jackson.databind.cfg.f.c);
                    int v = a.a[c0.ordinal()];
                    if(v == 1) {
                        Number number0 = n0.j2();
                        this.C(h0, c0, this.a, number0, "Integer value (" + n0.R2() + ")");
                    }
                    else {
                        switch(v) {
                            case 2: {
                                break;
                            }
                            case 3: {
                                return (Character)this.o(h0);
                            }
                            default: {
                                int v1 = n0.Q1();
                                return v1 < 0 || v1 > 0xFFFF ? ((Character)h0.B0(this.s(), v1, "value outside valid Character range (0x0000 - 0xFFFF)", new Object[0])) : Character.valueOf(((char)v1));
                            }
                        }
                    }
                    return (Character)this.c(h0);
                }
                case 11: {
                    if(this.j) {
                        this.W0(h0);
                    }
                    return (Character)this.c(h0);
                }
                default: {
                    return (Character)h0.t0(this.l1(h0), n0);
                }
            }
            if(s.length() == 1) {
                return Character.valueOf(s.charAt(0));
            }
            c c1 = this.H(h0, s);
            if(c1 == c.c) {
                return (Character)this.c(h0);
            }
            if(c1 == c.d) {
                return (Character)this.o(h0);
            }
            String s1 = s.trim();
            return this.L(h0, s1) ? ((Character)this.c(h0)) : ((Character)h0.C0(this.s(), s1, "Expected either Integer value code or 1-character String", new Object[0]));
        }
    }

    @b
    public static class g extends com.fasterxml.jackson.databind.deser.std.x.l {
        private static final long l = 1L;
        static final g m;
        static final g n;

        static {
            g.m = new g(Double.TYPE, 0.0);
            g.n = new g(Double.class, null);
        }

        public g(Class class0, Double double0) {
            super(class0, com.fasterxml.jackson.databind.type.h.g, double0, 0.0);
        }

        @Override  // com.fasterxml.jackson.databind.deser.std.x$l
        public com.fasterxml.jackson.databind.util.a d() {
            return super.d();
        }

        @Override  // com.fasterxml.jackson.databind.n
        public Object g(n n0, h h0) throws IOException, f {
            return this.s1(n0, h0);
        }

        @Override  // com.fasterxml.jackson.databind.deser.std.I
        public Object i(n n0, h h0, com.fasterxml.jackson.databind.jsontype.f f0) throws IOException {
            return this.t1(n0, h0, f0);
        }

        @Override  // com.fasterxml.jackson.databind.deser.std.x$l
        public Object o(h h0) throws o {
            return super.o(h0);
        }

        protected final Double r1(n n0, h h0) throws IOException {
            String s;
            switch(n0.d0()) {
                case 1: {
                    s = h0.T(n0, this, this.a);
                    break;
                }
                case 3: {
                    return (Double)this.U(n0, h0);
                }
                case 6: {
                    s = n0.R2();
                    break;
                }
                case 7: {
                    c c0 = this.J(n0, h0, this.a);
                    if(c0 == c.c) {
                        return (Double)this.c(h0);
                    }
                    return c0 == c.d ? ((Double)this.o(h0)) : n0.j1();
                }
                case 8: {
                    return n0.j1();
                }
                case 11: {
                    return (Double)this.c(h0);
                }
                default: {
                    return (Double)h0.t0(this.l1(h0), n0);
                }
            }
            Double double0 = this.D(s);
            if(double0 != null) {
                return double0;
            }
            c c1 = this.H(h0, s);
            if(c1 == c.c) {
                return (Double)this.c(h0);
            }
            if(c1 == c.d) {
                return (Double)this.o(h0);
            }
            String s1 = s.trim();
            if(this.L(h0, s1)) {
                return (Double)this.c(h0);
            }
            n0.J4().o(s1.length());
            try {
                return D.B0(s1, n0.b4(z.h));
            }
            catch(IllegalArgumentException unused_ex) {
                return (Double)h0.C0(this.a, s1, "not a valid `Double` value", new Object[0]);
            }
        }

        public Double s1(n n0, h h0) throws IOException {
            if(n0.Y3(r.s)) {
                return n0.j1();
            }
            return this.j ? this.C0(n0, h0) : this.r1(n0, h0);
        }

        public Double t1(n n0, h h0, com.fasterxml.jackson.databind.jsontype.f f0) throws IOException {
            if(n0.Y3(r.s)) {
                return n0.j1();
            }
            return this.j ? this.C0(n0, h0) : this.r1(n0, h0);
        }
    }

    @b
    public static class com.fasterxml.jackson.databind.deser.std.x.h extends com.fasterxml.jackson.databind.deser.std.x.l {
        private static final long l = 1L;
        static final com.fasterxml.jackson.databind.deser.std.x.h m;
        static final com.fasterxml.jackson.databind.deser.std.x.h n;

        static {
            com.fasterxml.jackson.databind.deser.std.x.h.m = new com.fasterxml.jackson.databind.deser.std.x.h(Float.TYPE, 0.0f);
            com.fasterxml.jackson.databind.deser.std.x.h.n = new com.fasterxml.jackson.databind.deser.std.x.h(Float.class, null);
        }

        public com.fasterxml.jackson.databind.deser.std.x.h(Class class0, Float float0) {
            super(class0, com.fasterxml.jackson.databind.type.h.g, float0, 0.0f);
        }

        @Override  // com.fasterxml.jackson.databind.deser.std.x$l
        public com.fasterxml.jackson.databind.util.a d() {
            return super.d();
        }

        @Override  // com.fasterxml.jackson.databind.n
        public Object g(n n0, h h0) throws IOException, f {
            return this.s1(n0, h0);
        }

        @Override  // com.fasterxml.jackson.databind.deser.std.x$l
        public Object o(h h0) throws o {
            return super.o(h0);
        }

        protected final Float r1(n n0, h h0) throws IOException {
            String s;
            switch(n0.d0()) {
                case 1: {
                    s = h0.T(n0, this, this.a);
                    break;
                }
                case 3: {
                    return (Float)this.U(n0, h0);
                }
                case 6: {
                    s = n0.R2();
                    break;
                }
                case 7: {
                    c c0 = this.J(n0, h0, this.a);
                    if(c0 == c.c) {
                        return (Float)this.c(h0);
                    }
                    return c0 == c.d ? ((Float)this.o(h0)) : n0.u1();
                }
                case 8: {
                    return n0.u1();
                }
                case 11: {
                    return (Float)this.c(h0);
                }
                default: {
                    return (Float)h0.t0(this.l1(h0), n0);
                }
            }
            Float float0 = this.E(s);
            if(float0 != null) {
                return float0;
            }
            c c1 = this.H(h0, s);
            if(c1 == c.c) {
                return (Float)this.c(h0);
            }
            if(c1 == c.d) {
                return (Float)this.o(h0);
            }
            String s1 = s.trim();
            if(this.L(h0, s1)) {
                return (Float)this.c(h0);
            }
            try {
                return l.s(s1, n0.b4(z.h));
            }
            catch(IllegalArgumentException unused_ex) {
                return (Float)h0.C0(this.a, s1, "not a valid `Float` value", new Object[0]);
            }
        }

        public Float s1(n n0, h h0) throws IOException {
            if(n0.Y3(r.s)) {
                return n0.u1();
            }
            return this.j ? this.F0(n0, h0) : this.r1(n0, h0);
        }
    }

    @b
    public static final class i extends com.fasterxml.jackson.databind.deser.std.x.l {
        private static final long l = 1L;
        static final i m;
        static final i n;

        static {
            i.m = new i(Integer.TYPE, 0);
            i.n = new i(Integer.class, null);
        }

        public i(Class class0, Integer integer0) {
            super(class0, com.fasterxml.jackson.databind.type.h.f, integer0, 0);
        }

        @Override  // com.fasterxml.jackson.databind.deser.std.x$l
        public com.fasterxml.jackson.databind.util.a d() {
            return super.d();
        }

        @Override  // com.fasterxml.jackson.databind.n
        public Object g(n n0, h h0) throws IOException, f {
            return this.r1(n0, h0);
        }

        @Override  // com.fasterxml.jackson.databind.deser.std.I
        public Object i(n n0, h h0, com.fasterxml.jackson.databind.jsontype.f f0) throws IOException {
            return this.s1(n0, h0, f0);
        }

        @Override  // com.fasterxml.jackson.databind.deser.std.x$l
        public Object o(h h0) throws o {
            return super.o(h0);
        }

        public Integer r1(n n0, h h0) throws IOException {
            if(n0.c4()) {
                return n0.Q1();
            }
            return this.j ? this.I0(n0, h0) : this.K0(n0, h0, Integer.class);
        }

        public Integer s1(n n0, h h0, com.fasterxml.jackson.databind.jsontype.f f0) throws IOException {
            if(n0.c4()) {
                return n0.Q1();
            }
            return this.j ? this.I0(n0, h0) : this.K0(n0, h0, Integer.class);
        }

        @Override  // com.fasterxml.jackson.databind.n
        public boolean u() {
            return true;
        }
    }

    @b
    public static final class j extends com.fasterxml.jackson.databind.deser.std.x.l {
        private static final long l = 1L;
        static final j m;
        static final j n;

        static {
            j.m = new j(Long.TYPE, 0L);
            j.n = new j(Long.class, null);
        }

        public j(Class class0, Long long0) {
            super(class0, com.fasterxml.jackson.databind.type.h.f, long0, 0L);
        }

        @Override  // com.fasterxml.jackson.databind.deser.std.x$l
        public com.fasterxml.jackson.databind.util.a d() {
            return super.d();
        }

        @Override  // com.fasterxml.jackson.databind.n
        public Object g(n n0, h h0) throws IOException, f {
            return this.r1(n0, h0);
        }

        @Override  // com.fasterxml.jackson.databind.deser.std.x$l
        public Object o(h h0) throws o {
            return super.o(h0);
        }

        public Long r1(n n0, h h0) throws IOException {
            if(n0.c4()) {
                return n0.e2();
            }
            return this.j ? this.O0(n0, h0) : this.M0(n0, h0, Long.class);
        }

        @Override  // com.fasterxml.jackson.databind.n
        public boolean u() {
            return true;
        }
    }

    @b
    public static class k extends I {
        public static final k g;

        static {
            k.g = new k();
        }

        public k() {
            super(Number.class);
        }

        @Override  // com.fasterxml.jackson.databind.n
        public Object g(n n0, h h0) throws IOException {
            String s;
            switch(n0.d0()) {
                case 1: {
                    s = h0.T(n0, this, this.a);
                    break;
                }
                case 3: {
                    return this.U(n0, h0);
                }
                case 6: {
                    s = n0.R2();
                    break;
                }
                case 7: {
                    return h0.E0(D.d) ? this.P(n0, h0) : n0.j2();
                }
                case 8: {
                    return h0.J0(com.fasterxml.jackson.databind.i.c) && !n0.f4() ? n0.i1() : n0.j2();
                }
                default: {
                    return h0.t0(this.l1(h0), n0);
                }
            }
            c c0 = this.H(h0, s);
            if(c0 == c.c) {
                return this.c(h0);
            }
            if(c0 == c.d) {
                return this.o(h0);
            }
            String s1 = s.trim();
            if(this.f0(s1)) {
                return this.c(h0);
            }
            if(this.o0(s1)) {
                return Infinity;
            }
            if(this.n0(s1)) {
                return -Infinity;
            }
            if(this.m0(s1)) {
                return NaN;
            }
            try {
                if(!this.k0(s1)) {
                    n0.J4().o(s1.length());
                    return h0.J0(com.fasterxml.jackson.databind.i.c) ? l.h(s1, n0.b4(z.i)) : l.q(s1, n0.b4(z.h));
                }
                n0.J4().p(s1.length());
                if(h0.J0(com.fasterxml.jackson.databind.i.d)) {
                    return l.n(s1, n0.b4(z.i));
                }
                long v = l.v(s1);
                return !h0.J0(com.fasterxml.jackson.databind.i.e) && v <= 0x7FFFFFFFL && v >= 0xFFFFFFFF80000000L ? ((int)v) : v;
            }
            catch(IllegalArgumentException unused_ex) {
                return h0.C0(this.a, s1, "not a valid number", new Object[0]);
            }
        }

        @Override  // com.fasterxml.jackson.databind.deser.std.I
        public Object i(n n0, h h0, com.fasterxml.jackson.databind.jsontype.f f0) throws IOException {
            switch(n0.d0()) {
                case 6: 
                case 7: 
                case 8: {
                    return this.g(n0, h0);
                }
                default: {
                    return f0.f(n0, h0);
                }
            }
        }

        @Override  // com.fasterxml.jackson.databind.deser.std.I
        public final com.fasterxml.jackson.databind.type.h w() {
            return com.fasterxml.jackson.databind.type.h.f;
        }
    }

    public static abstract class com.fasterxml.jackson.databind.deser.std.x.l extends I {
        protected final com.fasterxml.jackson.databind.type.h g;
        protected final Object h;
        protected final Object i;
        protected final boolean j;
        private static final long k = 1L;

        protected com.fasterxml.jackson.databind.deser.std.x.l(Class class0, com.fasterxml.jackson.databind.type.h h0, Object object0, Object object1) {
            super(class0);
            this.g = h0;
            this.h = object0;
            this.i = object1;
            this.j = class0.isPrimitive();
        }

        @Deprecated
        protected com.fasterxml.jackson.databind.deser.std.x.l(Class class0, Object object0, Object object1) {
            this(class0, com.fasterxml.jackson.databind.type.h.m, object0, object1);
        }

        @Override  // com.fasterxml.jackson.databind.n
        public final Object c(h h0) throws o {
            if(this.j && h0.J0(com.fasterxml.jackson.databind.i.h)) {
                h0.a1(this, "Cannot map `null` into type %s (set DeserializationConfig.DeserializationFeature.FAIL_ON_NULL_FOR_PRIMITIVES to \'false\' to allow)", new Object[]{com.fasterxml.jackson.databind.util.h.j(this.s())});
            }
            return this.h;
        }

        @Override  // com.fasterxml.jackson.databind.deser.std.I
        public com.fasterxml.jackson.databind.util.a d() {
            if(this.j) {
                return com.fasterxml.jackson.databind.util.a.c;
            }
            return this.h == null ? com.fasterxml.jackson.databind.util.a.a : com.fasterxml.jackson.databind.util.a.b;
        }

        @Override  // com.fasterxml.jackson.databind.n
        public Object o(h h0) throws o {
            return this.i;
        }

        @Override  // com.fasterxml.jackson.databind.deser.std.I
        public final com.fasterxml.jackson.databind.type.h w() {
            return this.g;
        }
    }

    @b
    public static class m extends com.fasterxml.jackson.databind.deser.std.x.l {
        private static final long l = 1L;
        static final m m;
        static final m n;

        static {
            m.m = new m(Short.TYPE, ((short)0));
            m.n = new m(Short.class, null);
        }

        public m(Class class0, Short short0) {
            super(class0, com.fasterxml.jackson.databind.type.h.f, short0, ((short)0));
        }

        @Override  // com.fasterxml.jackson.databind.deser.std.x$l
        public com.fasterxml.jackson.databind.util.a d() {
            return super.d();
        }

        @Override  // com.fasterxml.jackson.databind.n
        public Object g(n n0, h h0) throws IOException, f {
            return this.s1(n0, h0);
        }

        @Override  // com.fasterxml.jackson.databind.deser.std.x$l
        public Object o(h h0) throws o {
            return super.o(h0);
        }

        protected Short r1(n n0, h h0) throws IOException {
            String s;
            switch(n0.d0()) {
                case 1: {
                    s = h0.T(n0, this, this.a);
                    break;
                }
                case 3: {
                    return (Short)this.U(n0, h0);
                }
                case 6: {
                    s = n0.R2();
                    break;
                }
                case 7: {
                    return n0.L2();
                }
                case 8: {
                    c c0 = this.F(n0, h0, this.a);
                    if(c0 == c.c) {
                        return (Short)this.c(h0);
                    }
                    return c0 == c.d ? ((Short)this.o(h0)) : n0.L2();
                }
                case 11: {
                    return (Short)this.c(h0);
                }
                default: {
                    return (Short)h0.t0(this.l1(h0), n0);
                }
            }
            c c1 = this.H(h0, s);
            if(c1 == c.c) {
                return (Short)this.c(h0);
            }
            if(c1 == c.d) {
                return (Short)this.o(h0);
            }
            String s1 = s.trim();
            if(this.L(h0, s1)) {
                return (Short)this.c(h0);
            }
            try {
                int v = l.t(s1);
                return this.U0(v) ? ((Short)h0.C0(this.a, s1, "overflow, value cannot be represented as 16-bit value", new Object[0])) : ((short)v);
            }
            catch(IllegalArgumentException unused_ex) {
                return (Short)h0.C0(this.a, s1, "not a valid Short value", new Object[0]);
            }
        }

        public Short s1(n n0, h h0) throws IOException {
            if(n0.c4()) {
                return n0.L2();
            }
            return this.j ? this.Q0(n0, h0) : this.r1(n0, h0);
        }
    }

    private static final HashSet a;

    static {
        x.a = new HashSet();
        Class[] arr_class = {Boolean.class, Byte.class, Short.class, Character.class, Integer.class, Long.class, Float.class, Double.class, Number.class, BigDecimal.class, BigInteger.class};
        for(int v = 0; v < 11; ++v) {
            x.a.add(arr_class[v].getName());
        }
    }

    public static com.fasterxml.jackson.databind.n a(Class class0, String s) {
        if(class0.isPrimitive()) {
            if(class0 == Integer.TYPE) {
                return i.m;
            }
            if(class0 == Boolean.TYPE) {
                return d.m;
            }
            if(class0 == Long.TYPE) {
                return j.m;
            }
            if(class0 == Double.TYPE) {
                return g.m;
            }
            if(class0 == Character.TYPE) {
                return com.fasterxml.jackson.databind.deser.std.x.f.m;
            }
            if(class0 == Byte.TYPE) {
                return e.m;
            }
            if(class0 == Short.TYPE) {
                return m.m;
            }
            if(class0 == Float.TYPE) {
                return com.fasterxml.jackson.databind.deser.std.x.h.m;
            }
            if(class0 != Void.TYPE) {
                throw new IllegalArgumentException("Internal error: can\'t find deserializer for " + class0.getName());
            }
            return w.g;
        }
        if(x.a.contains(s)) {
            if(class0 == Integer.class) {
                return i.n;
            }
            if(class0 == Boolean.class) {
                return d.n;
            }
            if(class0 == Long.class) {
                return j.n;
            }
            if(class0 == Double.class) {
                return g.n;
            }
            if(class0 == Character.class) {
                return com.fasterxml.jackson.databind.deser.std.x.f.n;
            }
            if(class0 == Byte.class) {
                return e.n;
            }
            if(class0 == Short.class) {
                return m.n;
            }
            if(class0 == Float.class) {
                return com.fasterxml.jackson.databind.deser.std.x.h.n;
            }
            if(class0 == Number.class) {
                return k.g;
            }
            if(class0 == BigDecimal.class) {
                return com.fasterxml.jackson.databind.deser.std.x.b.g;
            }
            if(class0 != BigInteger.class) {
                throw new IllegalArgumentException("Internal error: can\'t find deserializer for " + class0.getName());
            }
            return com.fasterxml.jackson.databind.deser.std.x.c.g;
        }
        return null;
    }
}

