package com.google.common.collect;

import J1.b;
import com.google.common.base.H;
import j..util.stream.Collector.-CC;
import j..util.stream.Collector.Characteristics;
import j..util.stream.Collector;
import java.util.ArrayList;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Supplier;

@b
@C1
@G2
final class i5 {
    static class a {
    }

    static final class com.google.common.collect.i5.b {
        final List a;
        final W4 b;

        private com.google.common.collect.i5.b() {
            this.a = new ArrayList();
            this.b = A2.p();
        }

        com.google.common.collect.i5.b(a i5$a0) {
        }

        com.google.common.collect.i5.b a(com.google.common.collect.i5.b i5$b0, BinaryOperator binaryOperator0) {
            for(Object object0: i5$b0.a) {
                this.b(((c)object0).b(), ((c)object0).a(), ((c)object0).getValue(), binaryOperator0);
            }
            return this;
        }

        void b(Object object0, Object object1, Object object2, BinaryOperator binaryOperator0) {
            c i5$c0 = (c)this.b.Z(object0, object1);
            if(i5$c0 == null) {
                c i5$c1 = new c(object0, object1, object2);
                this.a.add(i5$c1);
                this.b.g0(object0, object1, i5$c1);
                return;
            }
            i5$c0.c(object2, binaryOperator0);
        }

        l3 c() {
            return l3.o(this.a);
        }
    }

    @G2
    static final class c extends com.google.common.collect.j5.b {
        private final Object a;
        private final Object b;
        private Object c;

        c(Object object0, Object object1, Object object2) {
            this.a = H.F(object0, "row");
            this.b = H.F(object1, "column");
            this.c = H.F(object2, "value");
        }

        @Override  // com.google.common.collect.W4$a
        public Object a() {
            return this.b;
        }

        @Override  // com.google.common.collect.W4$a
        public Object b() {
            return this.a;
        }

        void c(Object object0, BinaryOperator binaryOperator0) {
            H.F(object0, "value");
            this.c = H.F(binaryOperator0.apply(this.c, object0), "mergeFunction.apply");
        }

        @Override  // com.google.common.collect.W4$a
        public Object getValue() {
            return this.c;
        }
    }

    // 检测为 Lambda 实现
    private static void i(Function function0, Function function1, Function function2, com.google.common.collect.l3.a l3$a0, Object object0) [...]

    // 检测为 Lambda 实现
    private static com.google.common.collect.i5.b j() [...]

    // 检测为 Lambda 实现
    private static void k(Function function0, Function function1, Function function2, BinaryOperator binaryOperator0, com.google.common.collect.i5.b i5$b0, Object object0) [...]

    // 检测为 Lambda 实现
    private static com.google.common.collect.i5.b l(BinaryOperator binaryOperator0, com.google.common.collect.i5.b i5$b0, com.google.common.collect.i5.b i5$b1) [...]

    // 检测为 Lambda 实现
    private static Object n(Object object0, Object object1) [...]

    // 检测为 Lambda 实现
    private static void o(Function function0, Function function1, Function function2, BinaryOperator binaryOperator0, W4 w40, Object object0) [...]

    // 检测为 Lambda 实现
    private static W4 p(BinaryOperator binaryOperator0, W4 w40, W4 w41) [...]

    private static void q(W4 w40, @d4 Object object0, @d4 Object object1, @d4 Object object2, BinaryOperator binaryOperator0) {
        H.E(object2);
        Object object3 = w40.Z(object0, object1);
        if(object3 == null) {
            w40.g0(object0, object1, object2);
            return;
        }
        Object object4 = binaryOperator0.apply(object3, object2);
        if(object4 == null) {
            w40.remove(object0, object1);
            return;
        }
        w40.g0(object0, object1, object4);
    }

    static Collector r(Function function0, Function function1, Function function2) {
        H.F(function0, "rowFunction");
        H.F(function1, "columnFunction");
        H.F(function2, "valueFunction");
        return Collector.-CC.of(new f5(), (com.google.common.collect.l3.a l3$a0, Object object0) -> l3$a0.g(function0.apply(object0), function1.apply(object0), function2.apply(object0)), new h5(), new Y4(), new Characteristics[0]);
    }

    static Collector s(Function function0, Function function1, Function function2, BinaryOperator binaryOperator0) {
        H.F(function0, "rowFunction");
        H.F(function1, "columnFunction");
        H.F(function2, "valueFunction");
        H.F(binaryOperator0, "mergeFunction");
        return Collector.-CC.of(() -> new com.google.common.collect.i5.b(null), (com.google.common.collect.i5.b i5$b0, Object object0) -> i5$b0.b(function0.apply(object0), function1.apply(object0), function2.apply(object0), binaryOperator0), (com.google.common.collect.i5.b i5$b0, com.google.common.collect.i5.b i5$b1) -> i5$b0.a(i5$b1, binaryOperator0), new e5(), new Characteristics[0]);
    }

    static Collector t(Function function0, Function function1, Function function2, BinaryOperator binaryOperator0, Supplier supplier0) {
        H.E(function0);
        H.E(function1);
        H.E(function2);
        H.E(binaryOperator0);
        H.E(supplier0);
        return Collector.-CC.of(supplier0, (W4 w40, Object object0) -> i5.q(w40, function0.apply(object0), function1.apply(object0), function2.apply(object0), binaryOperator0), (W4 w40, W4 w41) -> {
            for(Object object0: w41.k0()) {
                i5.q(w40, ((com.google.common.collect.W4.a)object0).b(), ((com.google.common.collect.W4.a)object0).a(), ((com.google.common.collect.W4.a)object0).getValue(), binaryOperator0);
            }
            return w40;
        }, new Characteristics[0]);
    }

    static Collector u(Function function0, Function function1, Function function2, Supplier supplier0) {
        return i5.t(function0, function1, function2, (Object object0, Object object1) -> throw new IllegalStateException("Conflicting values " + object0 + " and " + object1), supplier0);
    }
}

