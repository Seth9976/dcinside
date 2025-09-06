package com.google.common.collect;

import J1.b;
import J1.d;
import com.google.common.base.H;
import j..util.Map.-EL;
import j..util.Objects;
import j..util.stream.Collector.-CC;
import j..util.stream.Collector.Characteristics;
import j..util.stream.Collector;
import j..util.stream.Collectors;
import j..util.stream.Stream;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.EnumMap;
import java.util.EnumSet;
import java.util.TreeMap;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.function.ToIntFunction;

@b
@C1
@G2
final class a1 {
    static class a {
    }

    @d
    @G2
    static class com.google.common.collect.a1.b {
        private final BinaryOperator a;
        @o3.a
        private EnumMap b;

        com.google.common.collect.a1.b(BinaryOperator binaryOperator0) {
            this.b = null;
            this.a = binaryOperator0;
        }

        com.google.common.collect.a1.b a(com.google.common.collect.a1.b a1$b0) {
            if(this.b == null) {
                return a1$b0;
            }
            EnumMap enumMap0 = a1$b0.b;
            if(enumMap0 == null) {
                return this;
            }
            Map.-EL.forEach(enumMap0, (Enum enum0, Object object0) -> {
                EnumMap enumMap0 = this.b;
                if(enumMap0 == null) {
                    this.b = new EnumMap(Collections.singletonMap(enum0, object0));
                    return;
                }
                Map.-EL.merge(enumMap0, enum0, object0, this.a);
            });
            return this;
        }

        // 检测为 Lambda 实现
        void b(Enum enum0, Object object0) [...]

        Q2 c() {
            return this.b == null ? Q2.u() : M2.N(this.b);
        }
    }

    @G2
    static final class c {
        @o3.a
        private EnumSet a;
        static final Collector b;

        static {
            c.b = a1.m0();
        }

        private c() {
        }

        c(a a1$a0) {
        }

        void a(Enum enum0) {
            EnumSet enumSet0 = this.a;
            if(enumSet0 == null) {
                this.a = EnumSet.of(enum0);
                return;
            }
            enumSet0.add(enum0);
        }

        c b(c a1$c0) {
            EnumSet enumSet0 = this.a;
            if(enumSet0 == null) {
                return a1$c0;
            }
            EnumSet enumSet1 = a1$c0.a;
            if(enumSet1 == null) {
                return this;
            }
            enumSet0.addAll(enumSet1);
            return this;
        }

        a3 c() {
            EnumSet enumSet0 = this.a;
            if(enumSet0 == null) {
                return a3.B();
            }
            a3 a30 = N2.K(enumSet0);
            this.a = null;
            return a30;
        }
    }

    private static final Collector a;
    private static final Collector b;
    @J1.c
    private static final Collector c;

    static {
        a1.a = Collector.-CC.of(new K(), new O(), new P(), new Q(), new Characteristics[0]);
        a1.b = Collector.-CC.of(new S(), new T(), new U(), new V(), new Characteristics[0]);
        a1.c = Collector.-CC.of(new W(), new X(), new L(), new M(), new Characteristics[0]);
    }

    static Collector A0(Function function0, ToIntFunction toIntFunction0, Supplier supplier0) {
        H.E(function0);
        H.E(toIntFunction0);
        H.E(supplier0);
        return Collector.-CC.of(supplier0, (S3 s30, Object object0) -> s30.T0(function0.apply(object0), toIntFunction0.applyAsInt(object0)), (S3 s30, S3 s31) -> {
            s30.addAll(s31);
            return s30;
        }, new Characteristics[0]);
    }

    static Collector D(Function function0, Function function1) {
        H.E(function0);
        H.E(function1);
        b0 b00 = new b0(function0);
        c0 c00 = new c0(function1);
        j n3$j0 = N3.f().a();
        Objects.requireNonNull(n3$j0);
        return Collectors.collectingAndThen(a1.F(b00, c00, new d0(n3$j0)), new e0());
    }

    static Collector E(Function function0, Function function1) {
        H.E(function0);
        H.E(function1);
        j0 j00 = new j0(function0);
        l0 l00 = new l0(function1);
        l n3$l0 = N3.f().g();
        Objects.requireNonNull(n3$l0);
        return Collectors.collectingAndThen(a1.F(j00, l00, new m0(n3$l0)), new n0());
    }

    static Collector F(Function function0, Function function1, Supplier supplier0) {
        H.E(function0);
        H.E(function1);
        H.E(supplier0);
        return Collector.-CC.of(supplier0, (M3 m30, Object object0) -> {
            Collection collection0 = m30.get(function0.apply(object0));
            Stream stream0 = (Stream)function1.apply(object0);
            Objects.requireNonNull(collection0);
            stream0.forEachOrdered(new P0(collection0));
        }, (M3 m30, M3 m31) -> {
            m30.m(m31);
            return m30;
        }, new Characteristics[0]);
    }

    private static Object G(Function function0, Object object0) {
        return H.E(function0.apply(object0));
    }

    private static Stream H(Function function0, Object object0) {
        return ((Stream)function0.apply(object0)).peek(new q0());
    }

    private static Object I(Function function0, Object object0) {
        return H.E(function0.apply(object0));
    }

    private static Stream J(Function function0, Object object0) {
        return ((Stream)function0.apply(object0)).peek(new q0());
    }

    // 检测为 Lambda 实现
    private static void K(Function function0, Function function1, M3 m30, Object object0) [...]

    // 检测为 Lambda 实现
    private static M3 L(M3 m30, M3 m31) [...]

    // 检测为 Lambda 实现
    private static void M(Function function0, Function function1, com.google.common.collect.I2.a i2$a0, Object object0) [...]

    // 检测为 Lambda 实现
    private static Object N(Object object0, Object object1) [...]

    // 检测为 Lambda 实现
    private static com.google.common.collect.a1.b O() [...]

    // 检测为 Lambda 实现
    private static void P(Function function0, Function function1, com.google.common.collect.a1.b a1$b0, Object object0) [...]

    // 检测为 Lambda 实现
    private static com.google.common.collect.a1.b Q(BinaryOperator binaryOperator0) [...]

    // 检测为 Lambda 实现
    private static void R(Function function0, Function function1, com.google.common.collect.a1.b a1$b0, Object object0) [...]

    // 检测为 Lambda 实现
    private static c S() [...]

    // 检测为 Lambda 实现
    private static void T(Function function0, Function function1, com.google.common.collect.P2.a p2$a0, Object object0) [...]

    // 检测为 Lambda 实现
    private static void U(Function function0, Function function1, com.google.common.collect.Q2.b q2$b0, Object object0) [...]

    // 检测为 Lambda 实现
    private static void V(Function function0, ToIntFunction toIntFunction0, S3 s30, Object object0) [...]

    // 检测为 Lambda 实现
    private static S3 W(S3 s30, S3 s31) [...]

    private static W2 X(S3 s30) {
        return W2.o(s30.entrySet());
    }

    // 检测为 Lambda 实现
    private static void Y(Function function0, Function function1, com.google.common.collect.Y2.c y2$c0, Object object0) [...]

    // 检测为 Lambda 实现
    private static void Z(Function function0, Function function1, com.google.common.collect.b3.a b3$a0, Object object0) [...]

    // 检测为 Lambda 实现
    private static TreeMap a0(Comparator comparator0) [...]

    // 检测为 Lambda 实现
    private static com.google.common.collect.d3.b b0(Comparator comparator0) [...]

    // 检测为 Lambda 实现
    private static void c0(Function function0, Function function1, com.google.common.collect.d3.b d3$b0, Object object0) [...]

    // 检测为 Lambda 实现
    private static com.google.common.collect.k3.a d0(Comparator comparator0) [...]

    // 检测为 Lambda 实现
    private static void e0(Function function0, Function function1, M3 m30, Object object0) [...]

    // 检测为 Lambda 实现
    private static M3 f0(M3 m30, M3 m31) [...]

    // 检测为 Lambda 实现
    private static void g0(Function function0, ToIntFunction toIntFunction0, S3 s30, Object object0) [...]

    // 检测为 Lambda 实现
    private static S3 h0(S3 s30, S3 s31) [...]

    static Collector i0(Function function0, Function function1) {
        H.E(function0);
        H.E(function1);
        return Collector.-CC.of(new Z0(), (com.google.common.collect.I2.a i2$a0, Object object0) -> i2$a0.s(function0.apply(object0), function1.apply(object0)), new E(), new F(), new Characteristics[0]);
    }

    @d
    static Collector j0(Function function0, Function function1) {
        H.E(function0);
        H.E(function1);
        return Collector.-CC.of(() -> new com.google.common.collect.a1.b((Object object0, Object object1) -> throw new IllegalArgumentException("Multiple values for key: " + object0 + ", " + object1)), (com.google.common.collect.a1.b a1$b0, Object object0) -> {
            Enum enum0 = (Enum)function0.apply(object0);
            Object object1 = function1.apply(object0);
            a1$b0.b(((Enum)H.V(enum0, "Null key for input %s", object0)), H.V(object1, "Null value for input %s", object0));
        }, new t0(), new u0(), new Characteristics[]{Characteristics.UNORDERED});
    }

    @d
    static Collector k0(Function function0, Function function1, BinaryOperator binaryOperator0) {
        H.E(function0);
        H.E(function1);
        H.E(binaryOperator0);
        return Collector.-CC.of(() -> new com.google.common.collect.a1.b(binaryOperator0), (com.google.common.collect.a1.b a1$b0, Object object0) -> {
            Enum enum0 = (Enum)function0.apply(object0);
            Object object1 = function1.apply(object0);
            a1$b0.b(((Enum)H.V(enum0, "Null key for input %s", object0)), H.V(object1, "Null value for input %s", object0));
        }, new t0(), new u0(), new Characteristics[0]);
    }

    static Collector l0() {
        return c.b;
    }

    private static Collector m0() {
        return Collector.-CC.of(() -> new c(null), new com.google.common.collect.H(), new I(), new J(), new Characteristics[]{Characteristics.UNORDERED});
    }

    static Collector n0() {
        return a1.a;
    }

    static Collector o0(Function function0, Function function1) {
        H.F(function0, "keyFunction");
        H.F(function1, "valueFunction");
        return Collector.-CC.of(new E0(), (com.google.common.collect.P2.a p2$a0, Object object0) -> p2$a0.p(function0.apply(object0), function1.apply(object0)), new H0(), new I0(), new Characteristics[0]);
    }

    static Collector p0(Function function0, Function function1) {
        H.E(function0);
        H.E(function1);
        return Collector.-CC.of(new w0(), (com.google.common.collect.Q2.b q2$b0, Object object0) -> q2$b0.i(function0.apply(object0), function1.apply(object0)), new y0(), new z0(), new Characteristics[0]);
    }

    static Collector q0(Function function0, Function function1, BinaryOperator binaryOperator0) {
        H.E(function0);
        H.E(function1);
        H.E(binaryOperator0);
        return Collectors.collectingAndThen(Collectors.toMap(function0, function1, binaryOperator0, new N0()), new O0());
    }

    static Collector r0(Function function0, ToIntFunction toIntFunction0) {
        H.E(function0);
        H.E(toIntFunction0);
        return Collector.-CC.of(new f0(), (S3 s30, Object object0) -> s30.T0(H.E(function0.apply(object0)), toIntFunction0.applyAsInt(object0)), (S3 s30, S3 s31) -> {
            s30.addAll(s31);
            return s30;
        }, new i0(), new Characteristics[0]);
    }

    @J1.c
    static Collector s0(Function function0, Function function1) {
        H.E(function0);
        H.E(function1);
        return Collector.-CC.of(new N(), (com.google.common.collect.Y2.c y2$c0, Object object0) -> y2$c0.c(((h4)function0.apply(object0)), function1.apply(object0)), new k0(), new v0(), new Characteristics[0]);
    }

    @J1.c
    static Collector t0() {
        return a1.c;
    }

    static Collector u0() {
        return a1.b;
    }

    static Collector v0(Function function0, Function function1) {
        H.F(function0, "keyFunction");
        H.F(function1, "valueFunction");
        return Collector.-CC.of(new J0(), (com.google.common.collect.b3.a b3$a0, Object object0) -> b3$a0.p(function0.apply(object0), function1.apply(object0)), new L0(), new M0(), new Characteristics[0]);
    }

    static Collector w0(Comparator comparator0, Function function0, Function function1) {
        H.E(comparator0);
        H.E(function0);
        H.E(function1);
        return Collector.-CC.of(() -> new com.google.common.collect.d3.b(comparator0), (com.google.common.collect.d3.b d3$b0, Object object0) -> d3$b0.s(function0.apply(object0), function1.apply(object0)), new X0(), new Y0(), new Characteristics[]{Characteristics.UNORDERED});
    }

    static Collector x0(Comparator comparator0, Function function0, Function function1, BinaryOperator binaryOperator0) {
        H.E(comparator0);
        H.E(function0);
        H.E(function1);
        H.E(binaryOperator0);
        return Collectors.collectingAndThen(Collectors.toMap(function0, function1, binaryOperator0, () -> new TreeMap(comparator0)), new p0());
    }

    static Collector y0(Comparator comparator0) {
        H.E(comparator0);
        return Collector.-CC.of(() -> new com.google.common.collect.k3.a(comparator0), new B0(), new C0(), new D0(), new Characteristics[0]);
    }

    static Collector z0(Function function0, Function function1, Supplier supplier0) {
        H.E(function0);
        H.E(function1);
        H.E(supplier0);
        return Collector.-CC.of(supplier0, (M3 m30, Object object0) -> m30.put(function0.apply(object0), function1.apply(object0)), (M3 m30, M3 m31) -> {
            m30.m(m31);
            return m30;
        }, new Characteristics[0]);
    }
}

