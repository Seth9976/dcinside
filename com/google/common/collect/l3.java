package com.google.common.collect;

import J1.b;
import com.google.common.base.H;
import j..util.Optional;
import j..util.stream.Collector.-CC;
import j..util.stream.Collector.Characteristics;
import j..util.stream.Collector;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.NoSuchElementException;

@b
@C1
@G2
final class L3 {
    static final class a {
        @o3.a
        Object a;
        List b;
        static final int c = 4;

        a() {
            this.a = null;
            this.b = Collections.emptyList();
        }

        void a(Object object0) {
            H.E(object0);
            if(this.a == null) {
                this.a = object0;
                return;
            }
            if(this.b.isEmpty()) {
                ArrayList arrayList0 = new ArrayList(4);
                this.b = arrayList0;
                arrayList0.add(object0);
                return;
            }
            if(this.b.size() >= 4) {
                throw this.e(true);
            }
            this.b.add(object0);
        }

        a b(a l3$a0) {
            if(this.a == null) {
                return l3$a0;
            }
            if(l3$a0.a == null) {
                return this;
            }
            if(this.b.isEmpty()) {
                this.b = new ArrayList();
            }
            this.b.add(l3$a0.a);
            this.b.addAll(l3$a0.b);
            if(this.b.size() <= 4) {
                return this;
            }
            this.b.subList(4, this.b.size()).clear();
            throw this.e(true);
        }

        Object c() {
            if(this.a == null) {
                throw new NoSuchElementException();
            }
            if(!this.b.isEmpty()) {
                throw this.e(false);
            }
            return this.a;
        }

        @G2
        Optional d() {
            if(!this.b.isEmpty()) {
                throw this.e(false);
            }
            return Optional.ofNullable(this.a);
        }

        IllegalArgumentException e(boolean z) {
            StringBuilder stringBuilder0 = new StringBuilder();
            stringBuilder0.append("expected one element but was: <");
            stringBuilder0.append(this.a);
            for(Object object0: this.b) {
                stringBuilder0.append(", ");
                stringBuilder0.append(object0);
            }
            if(z) {
                stringBuilder0.append(", ...");
            }
            stringBuilder0.append('>');
            throw new IllegalArgumentException(stringBuilder0.toString());
        }
    }

    private static final Collector a;
    private static final Object b;
    private static final Collector c;

    static {
        L3.a = Collector.-CC.of(new F3(), new G3(), new H3(), new I3(), new Characteristics[]{Characteristics.UNORDERED});
        L3.b = new Object();
        L3.c = Collector.-CC.of(new F3(), (a l3$a0, Object object0) -> {
            if(object0 == null) {
                object0 = L3.b;
            }
            l3$a0.a(object0);
        }, new H3(), new K3(), new Characteristics[]{Characteristics.UNORDERED});
    }

    // 检测为 Lambda 实现
    private static void c(a l3$a0, Object object0) [...]

    private static Object d(a l3$a0) {
        Object object0 = l3$a0.c();
        return object0 == L3.b ? null : object0;
    }

    public static Collector e() {
        return L3.c;
    }

    public static Collector f() {
        return L3.a;
    }
}

