package com.google.crypto.tink.shaded.protobuf;

import j..util.DesugarCollections;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map.Entry;
import java.util.Map;

final class f0 {
    static class a {
        static final int[] a;
        static final int[] b;

        static {
            int[] arr_v = new int[b.values().length];
            a.b = arr_v;
            try {
                arr_v[b.c.ordinal()] = 1;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                a.b[b.d.ordinal()] = 2;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                a.b[b.e.ordinal()] = 3;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                a.b[b.f.ordinal()] = 4;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                a.b[b.g.ordinal()] = 5;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                a.b[b.h.ordinal()] = 6;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                a.b[b.i.ordinal()] = 7;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                a.b[b.j.ordinal()] = 8;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                a.b[b.l.ordinal()] = 9;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                a.b[b.m.ordinal()] = 10;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                a.b[b.k.ordinal()] = 11;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                a.b[b.n.ordinal()] = 12;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                a.b[b.o.ordinal()] = 13;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                a.b[b.q.ordinal()] = 14;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                a.b[b.r.ordinal()] = 15;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                a.b[b.s.ordinal()] = 16;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                a.b[b.t.ordinal()] = 17;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                a.b[b.p.ordinal()] = 18;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            int[] arr_v1 = new int[c.values().length];
            a.a = arr_v1;
            try {
                arr_v1[c.b.ordinal()] = 1;
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
            try {
                a.a[c.e.ordinal()] = 4;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                a.a[c.f.ordinal()] = 5;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                a.a[c.g.ordinal()] = 6;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                a.a[c.h.ordinal()] = 7;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                a.a[c.i.ordinal()] = 8;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                a.a[c.j.ordinal()] = 9;
            }
            catch(NoSuchFieldError unused_ex) {
            }
        }
    }

    static final class com.google.crypto.tink.shaded.protobuf.f0.b {
        private w1 a;
        private boolean b;
        private boolean c;
        private boolean d;

        private com.google.crypto.tink.shaded.protobuf.f0.b() {
            this(w1.u(16));
        }

        com.google.crypto.tink.shaded.protobuf.f0.b(a f0$a0) {
        }

        private com.google.crypto.tink.shaded.protobuf.f0.b(w1 w10) {
            this.a = w10;
            this.c = true;
        }

        public void a(com.google.crypto.tink.shaded.protobuf.f0.c f0$c0, Object object0) {
            List list0;
            this.f();
            if(!f0$c0.isRepeated()) {
                throw new IllegalArgumentException("addRepeatedField() can only be called on repeated fields.");
            }
            this.d = this.d || object0 instanceof com.google.crypto.tink.shaded.protobuf.R0.a;
            this.x(f0$c0, object0);
            Object object1 = this.j(f0$c0);
            if(object1 == null) {
                list0 = new ArrayList();
                this.a.w(f0$c0, list0);
            }
            else {
                list0 = (List)object1;
            }
            list0.add(object0);
        }

        public f0 b() {
            return this.c(false);
        }

        private f0 c(boolean z) {
            if(this.a.isEmpty()) {
                return f0.s();
            }
            this.c = false;
            w1 w10 = this.a;
            if(this.d) {
                w10 = f0.l(w10, false);
                com.google.crypto.tink.shaded.protobuf.f0.b.t(w10, z);
            }
            f0 f00 = new f0(w10, null);
            f00.c = this.b;
            return f00;
        }

        public f0 d() {
            return this.c(true);
        }

        public void e(com.google.crypto.tink.shaded.protobuf.f0.c f0$c0) {
            this.f();
            this.a.remove(f0$c0);
            if(this.a.isEmpty()) {
                this.b = false;
            }
        }

        private void f() {
            if(!this.c) {
                this.a = f0.l(this.a, true);
                this.c = true;
            }
        }

        public static com.google.crypto.tink.shaded.protobuf.f0.b g(f0 f00) {
            com.google.crypto.tink.shaded.protobuf.f0.b f0$b0 = new com.google.crypto.tink.shaded.protobuf.f0.b(f0.l(f00.a, true));
            f0$b0.b = f00.c;
            return f0$b0;
        }

        public Map h() {
            if(this.b) {
                Map map0 = f0.l(this.a, false);
                if(this.a.s()) {
                    ((w1)map0).t();
                    return map0;
                }
                com.google.crypto.tink.shaded.protobuf.f0.b.t(((w1)map0), true);
                return map0;
            }
            return this.a.s() ? this.a : DesugarCollections.unmodifiableMap(this.a);
        }

        public Object i(com.google.crypto.tink.shaded.protobuf.f0.c f0$c0) {
            return com.google.crypto.tink.shaded.protobuf.f0.b.s(f0$c0, this.j(f0$c0), true);
        }

        Object j(com.google.crypto.tink.shaded.protobuf.f0.c f0$c0) {
            R0 r00 = this.a.get(f0$c0);
            return r00 instanceof B0 ? ((B0)r00).p() : r00;
        }

        public Object k(com.google.crypto.tink.shaded.protobuf.f0.c f0$c0, int v) {
            if(this.d) {
                this.f();
            }
            return com.google.crypto.tink.shaded.protobuf.f0.b.r(this.l(f0$c0, v), true);
        }

        Object l(com.google.crypto.tink.shaded.protobuf.f0.c f0$c0, int v) {
            if(!f0$c0.isRepeated()) {
                throw new IllegalArgumentException("getRepeatedField() can only be called on repeated fields.");
            }
            Object object0 = this.j(f0$c0);
            if(object0 == null) {
                throw new IndexOutOfBoundsException();
            }
            return ((List)object0).get(v);
        }

        public int m(com.google.crypto.tink.shaded.protobuf.f0.c f0$c0) {
            if(!f0$c0.isRepeated()) {
                throw new IllegalArgumentException("getRepeatedFieldCount() can only be called on repeated fields.");
            }
            Object object0 = this.j(f0$c0);
            return object0 == null ? 0 : ((List)object0).size();
        }

        public boolean n(com.google.crypto.tink.shaded.protobuf.f0.c f0$c0) {
            if(f0$c0.isRepeated()) {
                throw new IllegalArgumentException("hasField() can only be called on non-repeated fields.");
            }
            return this.a.get(f0$c0) != null;
        }

        public boolean o() {
            for(int v = 0; v < this.a.l(); ++v) {
                if(!f0.F(this.a.j(v))) {
                    return false;
                }
            }
            for(Object object0: this.a.o()) {
                if(!f0.F(((Map.Entry)object0))) {
                    return false;
                }
                if(false) {
                    break;
                }
            }
            return true;
        }

        public void p(f0 f00) {
            this.f();
            for(int v = 0; v < f00.a.l(); ++v) {
                this.q(f00.a.j(v));
            }
            for(Object object0: f00.a.o()) {
                this.q(((Map.Entry)object0));
            }
        }

        private void q(Map.Entry map$Entry0) {
            com.google.crypto.tink.shaded.protobuf.f0.c f0$c0 = (com.google.crypto.tink.shaded.protobuf.f0.c)map$Entry0.getKey();
            R0 r00 = map$Entry0.getValue();
            if(r00 instanceof B0) {
                r00 = ((B0)r00).p();
            }
            if(f0$c0.isRepeated()) {
                List list0 = (List)this.j(f0$c0);
                if(list0 == null) {
                    list0 = new ArrayList();
                    this.a.w(f0$c0, list0);
                }
                for(Object object0: ((List)r00)) {
                    list0.add(f0.n(object0));
                }
                return;
            }
            if(f0$c0.getLiteJavaType() == c.j) {
                Object object1 = this.j(f0$c0);
                if(object1 == null) {
                    this.a.w(f0$c0, f0.n(r00));
                    return;
                }
                if(object1 instanceof com.google.crypto.tink.shaded.protobuf.R0.a) {
                    f0$c0.Y(((com.google.crypto.tink.shaded.protobuf.R0.a)object1), r00);
                    return;
                }
                R0 r01 = f0$c0.Y(((R0)object1).toBuilder(), r00).build();
                this.a.w(f0$c0, r01);
                return;
            }
            this.a.w(f0$c0, f0.n(r00));
        }

        private static Object r(Object object0, boolean z) {
            if(!(object0 instanceof com.google.crypto.tink.shaded.protobuf.R0.a)) {
                return object0;
            }
            return z ? ((com.google.crypto.tink.shaded.protobuf.R0.a)object0).buildPartial() : ((com.google.crypto.tink.shaded.protobuf.R0.a)object0).build();
        }

        private static Object s(com.google.crypto.tink.shaded.protobuf.f0.c f0$c0, Object object0, boolean z) {
            if(object0 == null) {
                return null;
            }
            if(f0$c0.getLiteJavaType() == c.j) {
                if(f0$c0.isRepeated()) {
                    if(!(object0 instanceof List)) {
                        throw new IllegalStateException("Repeated field should contains a List but actually contains type: " + object0.getClass());
                    }
                    List list0 = (List)object0;
                    for(int v = 0; v < list0.size(); ++v) {
                        Object object1 = list0.get(v);
                        Object object2 = com.google.crypto.tink.shaded.protobuf.f0.b.r(object1, z);
                        if(object2 != object1) {
                            if(list0 == object0) {
                                list0 = new ArrayList(list0);
                            }
                            list0.set(v, object2);
                        }
                    }
                    return list0;
                }
                return com.google.crypto.tink.shaded.protobuf.f0.b.r(object0, z);
            }
            return object0;
        }

        private static void t(w1 w10, boolean z) {
            for(int v = 0; v < w10.l(); ++v) {
                com.google.crypto.tink.shaded.protobuf.f0.b.u(w10.j(v), z);
            }
            for(Object object0: w10.o()) {
                com.google.crypto.tink.shaded.protobuf.f0.b.u(((Map.Entry)object0), z);
            }
        }

        private static void u(Map.Entry map$Entry0, boolean z) {
            map$Entry0.setValue(com.google.crypto.tink.shaded.protobuf.f0.b.s(((com.google.crypto.tink.shaded.protobuf.f0.c)map$Entry0.getKey()), map$Entry0.getValue(), z));
        }

        public void v(com.google.crypto.tink.shaded.protobuf.f0.c f0$c0, Object object0) {
            this.f();
            boolean z = false;
            if(f0$c0.isRepeated()) {
                if(!(object0 instanceof List)) {
                    throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
                }
                ArrayList arrayList0 = new ArrayList(((List)object0));
                for(Object object1: arrayList0) {
                    this.x(f0$c0, object1);
                    this.d = this.d || object1 instanceof com.google.crypto.tink.shaded.protobuf.R0.a;
                }
                object0 = arrayList0;
            }
            else {
                this.x(f0$c0, object0);
            }
            if(object0 instanceof B0) {
                this.b = true;
            }
            if(this.d || object0 instanceof com.google.crypto.tink.shaded.protobuf.R0.a) {
                z = true;
            }
            this.d = z;
            this.a.w(f0$c0, object0);
        }

        public void w(com.google.crypto.tink.shaded.protobuf.f0.c f0$c0, int v, Object object0) {
            this.f();
            if(!f0$c0.isRepeated()) {
                throw new IllegalArgumentException("getRepeatedField() can only be called on repeated fields.");
            }
            this.d = this.d || object0 instanceof com.google.crypto.tink.shaded.protobuf.R0.a;
            Object object1 = this.j(f0$c0);
            if(object1 == null) {
                throw new IndexOutOfBoundsException();
            }
            this.x(f0$c0, object0);
            ((List)object1).set(v, object0);
        }

        private void x(com.google.crypto.tink.shaded.protobuf.f0.c f0$c0, Object object0) {
            if(!f0.H(f0$c0.getLiteType(), object0) && (f0$c0.getLiteType().a() != c.j || !(object0 instanceof com.google.crypto.tink.shaded.protobuf.R0.a))) {
                throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", f0$c0.getNumber(), f0$c0.getLiteType().a(), object0.getClass().getName()));
            }
        }
    }

    public interface com.google.crypto.tink.shaded.protobuf.f0.c extends Comparable {
        com.google.crypto.tink.shaded.protobuf.R0.a Y(com.google.crypto.tink.shaded.protobuf.R0.a arg1, R0 arg2);

        d getEnumType();

        c getLiteJavaType();

        b getLiteType();

        int getNumber();

        boolean isPacked();

        boolean isRepeated();
    }

    private final w1 a;
    private boolean b;
    private boolean c;
    private static final int d = 16;
    private static final f0 e;

    static {
        f0.e = new f0(true);
    }

    private f0() {
        this.a = w1.u(16);
    }

    private f0(w1 w10) {
        this.a = w10;
        this.J();
    }

    f0(w1 w10, a f0$a0) {
        this(w10);
    }

    private f0(boolean z) {
        this(w1.u(0));
        this.J();
    }

    // 去混淆评级： 低(20)
    static int A(b c2$b0, boolean z) {
        return z ? 2 : c2$b0.b();
    }

    public boolean B(com.google.crypto.tink.shaded.protobuf.f0.c f0$c0) {
        if(f0$c0.isRepeated()) {
            throw new IllegalArgumentException("hasField() can only be called on non-repeated fields.");
        }
        return this.a.get(f0$c0) != null;
    }

    boolean C() {
        return this.a.isEmpty();
    }

    public boolean D() {
        return this.b;
    }

    public boolean E() {
        for(int v = 0; v < this.a.l(); ++v) {
            if(!f0.F(this.a.j(v))) {
                return false;
            }
        }
        for(Object object0: this.a.o()) {
            if(!f0.F(((Map.Entry)object0))) {
                return false;
            }
            if(false) {
                break;
            }
        }
        return true;
    }

    private static boolean F(Map.Entry map$Entry0) {
        com.google.crypto.tink.shaded.protobuf.f0.c f0$c0 = (com.google.crypto.tink.shaded.protobuf.f0.c)map$Entry0.getKey();
        if(f0$c0.getLiteJavaType() == c.j) {
            if(f0$c0.isRepeated()) {
                Iterator iterator0 = ((List)map$Entry0.getValue()).iterator();
                while(true) {
                    if(!iterator0.hasNext()) {
                        return true;
                    }
                    Object object0 = iterator0.next();
                    if(f0.G(object0)) {
                        continue;
                    }
                    return false;
                }
            }
            return f0.G(map$Entry0.getValue());
        }
        return true;
    }

    private static boolean G(Object object0) {
        if(object0 instanceof S0) {
            return ((S0)object0).isInitialized();
        }
        if(!(object0 instanceof B0)) {
            throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
        }
        return true;
    }

    private static boolean H(b c2$b0, Object object0) {
        t0.d(object0);
        switch(c2$b0.a()) {
            case 1: {
                return object0 instanceof Integer;
            }
            case 2: {
                return object0 instanceof Long;
            }
            case 3: {
                return object0 instanceof Float;
            }
            case 4: {
                return object0 instanceof Double;
            }
            case 5: {
                return object0 instanceof Boolean;
            }
            case 6: {
                return object0 instanceof String;
            }
            case 7: {
                return object0 instanceof u || object0 instanceof byte[];
            }
            case 8: {
                return object0 instanceof Integer || object0 instanceof com.google.crypto.tink.shaded.protobuf.t0.c;
            }
            case 9: {
                return object0 instanceof R0 || object0 instanceof B0;
            }
            default: {
                return false;
            }
        }
    }

    public Iterator I() {
        return this.c ? new com.google.crypto.tink.shaded.protobuf.B0.c(this.a.entrySet().iterator()) : this.a.entrySet().iterator();
    }

    public void J() {
        if(this.b) {
            return;
        }
        for(int v = 0; v < this.a.l(); ++v) {
            Map.Entry map$Entry0 = this.a.j(v);
            if(map$Entry0.getValue() instanceof l0) {
                ((l0)map$Entry0.getValue()).S1();
            }
        }
        this.a.t();
        this.b = true;
    }

    public void K(f0 f00) {
        for(int v = 0; v < f00.a.l(); ++v) {
            this.L(f00.a.j(v));
        }
        for(Object object0: f00.a.o()) {
            this.L(((Map.Entry)object0));
        }
    }

    private void L(Map.Entry map$Entry0) {
        com.google.crypto.tink.shaded.protobuf.f0.c f0$c0 = (com.google.crypto.tink.shaded.protobuf.f0.c)map$Entry0.getKey();
        R0 r00 = map$Entry0.getValue();
        if(r00 instanceof B0) {
            r00 = ((B0)r00).p();
        }
        if(f0$c0.isRepeated()) {
            ArrayList arrayList0 = this.u(f0$c0);
            if(arrayList0 == null) {
                arrayList0 = new ArrayList();
            }
            for(Object object0: ((List)r00)) {
                arrayList0.add(f0.n(object0));
            }
            this.a.w(f0$c0, arrayList0);
            return;
        }
        if(f0$c0.getLiteJavaType() == c.j) {
            Object object1 = this.u(f0$c0);
            if(object1 == null) {
                Object object2 = f0.n(r00);
                this.a.w(f0$c0, object2);
                return;
            }
            R0 r01 = f0$c0.Y(((R0)object1).toBuilder(), r00).build();
            this.a.w(f0$c0, r01);
            return;
        }
        Object object3 = f0.n(r00);
        this.a.w(f0$c0, object3);
    }

    public static com.google.crypto.tink.shaded.protobuf.f0.b M() {
        return new com.google.crypto.tink.shaded.protobuf.f0.b(null);
    }

    public static f0 N() {
        return new f0();
    }

    // 去混淆评级： 低(20)
    public static Object O(z z0, b c2$b0, boolean z1) throws IOException {
        return z1 ? c2.d(z0, c2$b0, com.google.crypto.tink.shaded.protobuf.c2.d.b) : c2.d(z0, c2$b0, com.google.crypto.tink.shaded.protobuf.c2.d.a);
    }

    public void P(com.google.crypto.tink.shaded.protobuf.f0.c f0$c0, Object object0) {
        if(f0$c0.isRepeated()) {
            if(!(object0 instanceof List)) {
                throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
            }
            ArrayList arrayList0 = new ArrayList();
            arrayList0.addAll(((List)object0));
            for(Object object1: arrayList0) {
                this.R(f0$c0, object1);
            }
            object0 = arrayList0;
        }
        else {
            this.R(f0$c0, object0);
        }
        if(object0 instanceof B0) {
            this.c = true;
        }
        this.a.w(f0$c0, object0);
    }

    public void Q(com.google.crypto.tink.shaded.protobuf.f0.c f0$c0, int v, Object object0) {
        if(!f0$c0.isRepeated()) {
            throw new IllegalArgumentException("getRepeatedField() can only be called on repeated fields.");
        }
        Object object1 = this.u(f0$c0);
        if(object1 == null) {
            throw new IndexOutOfBoundsException();
        }
        this.R(f0$c0, object0);
        ((List)object1).set(v, object0);
    }

    private void R(com.google.crypto.tink.shaded.protobuf.f0.c f0$c0, Object object0) {
        if(!f0.H(f0$c0.getLiteType(), object0)) {
            throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", f0$c0.getNumber(), f0$c0.getLiteType().a(), object0.getClass().getName()));
        }
    }

    static void S(B b0, b c2$b0, int v, Object object0) throws IOException {
        if(c2$b0 == b.l) {
            b0.S0(v, ((R0)object0));
            return;
        }
        b0.t1(v, f0.A(c2$b0, false));
        f0.T(b0, c2$b0, object0);
    }

    static void T(B b0, b c2$b0, Object object0) throws IOException {
        switch(c2$b0) {
            case 1: {
                b0.N0(((double)(((Double)object0))));
                return;
            }
            case 2: {
                b0.R0(((float)(((Float)object0))));
                return;
            }
            case 3: {
                b0.X0(((long)(((Long)object0))));
                return;
            }
            case 4: {
                b0.v1(((long)(((Long)object0))));
                return;
            }
            case 5: {
                b0.W0(((int)(((Integer)object0))));
                return;
            }
            case 6: {
                b0.Q0(((long)(((Long)object0))));
                return;
            }
            case 7: {
                b0.P0(((int)(((Integer)object0))));
                return;
            }
            case 8: {
                b0.G0(((Boolean)object0).booleanValue());
                return;
            }
            case 9: {
                b0.U0(((R0)object0));
                return;
            }
            case 10: {
                b0.a1(((R0)object0));
                return;
            }
            case 11: {
                if(object0 instanceof u) {
                    b0.M0(((u)object0));
                    return;
                }
                b0.s1(((String)object0));
                return;
            }
            case 12: {
                if(object0 instanceof u) {
                    b0.M0(((u)object0));
                    return;
                }
                b0.J0(((byte[])object0));
                return;
            }
            case 13: {
                b0.u1(((int)(((Integer)object0))));
                return;
            }
            case 14: {
                b0.o1(((int)(((Integer)object0))));
                return;
            }
            case 15: {
                b0.p1(((long)(((Long)object0))));
                return;
            }
            case 16: {
                b0.q1(((int)(((Integer)object0))));
                return;
            }
            case 17: {
                b0.r1(((long)(((Long)object0))));
                return;
            }
            case 18: {
                if(object0 instanceof com.google.crypto.tink.shaded.protobuf.t0.c) {
                    b0.O0(((com.google.crypto.tink.shaded.protobuf.t0.c)object0).getNumber());
                    return;
                }
                b0.O0(((int)(((Integer)object0))));
            }
        }
    }

    public static void U(com.google.crypto.tink.shaded.protobuf.f0.c f0$c0, Object object0, B b0) throws IOException {
        b c2$b0 = f0$c0.getLiteType();
        int v = f0$c0.getNumber();
        if(f0$c0.isRepeated()) {
            if(f0$c0.isPacked()) {
                b0.t1(v, 2);
                int v1 = 0;
                for(Object object1: ((List)object0)) {
                    v1 += f0.p(c2$b0, object1);
                }
                b0.u1(v1);
                for(Object object2: ((List)object0)) {
                    f0.T(b0, c2$b0, object2);
                }
                return;
            }
            for(Object object3: ((List)object0)) {
                f0.S(b0, c2$b0, v, object3);
            }
            return;
        }
        if(object0 instanceof B0) {
            f0.S(b0, c2$b0, v, ((B0)object0).p());
            return;
        }
        f0.S(b0, c2$b0, v, object0);
    }

    public void V(B b0) throws IOException {
        for(int v = 0; v < this.a.l(); ++v) {
            this.W(this.a.j(v), b0);
        }
        for(Object object0: this.a.o()) {
            this.W(((Map.Entry)object0), b0);
        }
    }

    private void W(Map.Entry map$Entry0, B b0) throws IOException {
        com.google.crypto.tink.shaded.protobuf.f0.c f0$c0 = (com.google.crypto.tink.shaded.protobuf.f0.c)map$Entry0.getKey();
        if(f0$c0.getLiteJavaType() == c.j && !f0$c0.isRepeated() && !f0$c0.isPacked()) {
            R0 r00 = map$Entry0.getValue();
            if(r00 instanceof B0) {
                r00 = ((B0)r00).p();
            }
            b0.c1(((com.google.crypto.tink.shaded.protobuf.f0.c)map$Entry0.getKey()).getNumber(), r00);
            return;
        }
        f0.U(f0$c0, map$Entry0.getValue(), b0);
    }

    public void X(B b0) throws IOException {
        for(int v = 0; v < this.a.l(); ++v) {
            Map.Entry map$Entry0 = this.a.j(v);
            f0.U(((com.google.crypto.tink.shaded.protobuf.f0.c)map$Entry0.getKey()), map$Entry0.getValue(), b0);
        }
        for(Object object0: this.a.o()) {
            f0.U(((com.google.crypto.tink.shaded.protobuf.f0.c)((Map.Entry)object0).getKey()), ((Map.Entry)object0).getValue(), b0);
        }
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return this.k();
    }

    @Override
    public boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        return object0 instanceof f0 ? this.a.equals(((f0)object0).a) : false;
    }

    public void h(com.google.crypto.tink.shaded.protobuf.f0.c f0$c0, Object object0) {
        List list0;
        if(!f0$c0.isRepeated()) {
            throw new IllegalArgumentException("addRepeatedField() can only be called on repeated fields.");
        }
        this.R(f0$c0, object0);
        Object object1 = this.u(f0$c0);
        if(object1 == null) {
            list0 = new ArrayList();
            this.a.w(f0$c0, list0);
        }
        else {
            list0 = (List)object1;
        }
        list0.add(object0);
    }

    @Override
    public int hashCode() {
        return this.a.hashCode();
    }

    public void i() {
        this.a.clear();
        this.c = false;
    }

    public void j(com.google.crypto.tink.shaded.protobuf.f0.c f0$c0) {
        this.a.remove(f0$c0);
        if(this.a.isEmpty()) {
            this.c = false;
        }
    }

    public f0 k() {
        f0 f00 = f0.N();
        for(int v = 0; v < this.a.l(); ++v) {
            Map.Entry map$Entry0 = this.a.j(v);
            f00.P(((com.google.crypto.tink.shaded.protobuf.f0.c)map$Entry0.getKey()), map$Entry0.getValue());
        }
        for(Object object0: this.a.o()) {
            f00.P(((com.google.crypto.tink.shaded.protobuf.f0.c)((Map.Entry)object0).getKey()), ((Map.Entry)object0).getValue());
        }
        f00.c = this.c;
        return f00;
    }

    private static w1 l(w1 w10, boolean z) {
        w1 w11 = w1.u(16);
        for(int v = 0; v < w10.l(); ++v) {
            f0.m(w11, w10.j(v), z);
        }
        for(Object object0: w10.o()) {
            f0.m(w11, ((Map.Entry)object0), z);
        }
        return w11;
    }

    private static void m(Map map0, Map.Entry map$Entry0, boolean z) {
        com.google.crypto.tink.shaded.protobuf.f0.c f0$c0 = (com.google.crypto.tink.shaded.protobuf.f0.c)map$Entry0.getKey();
        Object object0 = map$Entry0.getValue();
        if(object0 instanceof B0) {
            map0.put(f0$c0, ((B0)object0).p());
            return;
        }
        if(z && object0 instanceof List) {
            map0.put(f0$c0, new ArrayList(((List)object0)));
            return;
        }
        map0.put(f0$c0, object0);
    }

    private static Object n(Object object0) {
        if(object0 instanceof byte[]) {
            byte[] arr_b = new byte[((byte[])object0).length];
            System.arraycopy(((byte[])object0), 0, arr_b, 0, ((byte[])object0).length);
            return arr_b;
        }
        return object0;
    }

    static int o(b c2$b0, int v, Object object0) {
        return (c2$b0 == b.l ? B.k0(v) * 2 : B.k0(v)) + f0.p(c2$b0, object0);
    }

    static int p(b c2$b0, Object object0) {
        switch(c2$b0) {
            case 1: {
                return B.w(((double)(((Double)object0))));
            }
            case 2: {
                return B.E(((float)(((Float)object0))));
            }
            case 3: {
                return B.M(((long)(((Long)object0))));
            }
            case 4: {
                return B.o0(((long)(((Long)object0))));
            }
            case 5: {
                return B.K(((int)(((Integer)object0))));
            }
            case 6: {
                return B.C(((long)(((Long)object0))));
            }
            case 7: {
                return B.A(((int)(((Integer)object0))));
            }
            case 8: {
                return B.o(((Boolean)object0).booleanValue());
            }
            case 9: {
                return B.H(((R0)object0));
            }
            case 10: {
                return object0 instanceof B0 ? B.P(((B0)object0)) : B.U(((R0)object0));
            }
            case 11: {
                return object0 instanceof u ? B.u(((u)object0)) : B.j0(((String)object0));
            }
            case 12: {
                return object0 instanceof u ? B.u(((u)object0)) : B.q(((byte[])object0));
            }
            case 13: {
                return B.m0(((int)(((Integer)object0))));
            }
            case 14: {
                return B.b0(((int)(((Integer)object0))));
            }
            case 15: {
                return B.d0(((long)(((Long)object0))));
            }
            case 16: {
                return B.f0(((int)(((Integer)object0))));
            }
            case 17: {
                return B.h0(((long)(((Long)object0))));
            }
            case 18: {
                return object0 instanceof com.google.crypto.tink.shaded.protobuf.t0.c ? B.y(((com.google.crypto.tink.shaded.protobuf.t0.c)object0).getNumber()) : B.y(((int)(((Integer)object0))));
            }
            default: {
                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
            }
        }
    }

    public static int q(com.google.crypto.tink.shaded.protobuf.f0.c f0$c0, Object object0) {
        int v = 0;
        b c2$b0 = f0$c0.getLiteType();
        int v1 = f0$c0.getNumber();
        if(f0$c0.isRepeated()) {
            if(f0$c0.isPacked()) {
                for(Object object1: ((List)object0)) {
                    v += f0.p(c2$b0, object1);
                }
                return B.k0(v1) + v + B.m0(v);
            }
            for(Object object2: ((List)object0)) {
                v += f0.o(c2$b0, v1, object2);
            }
            return v;
        }
        return f0.o(c2$b0, v1, object0);
    }

    Iterator r() {
        return this.c ? new com.google.crypto.tink.shaded.protobuf.B0.c(this.a.h().iterator()) : this.a.h().iterator();
    }

    public static f0 s() {
        return f0.e;
    }

    public Map t() {
        if(this.c) {
            Map map0 = f0.l(this.a, false);
            if(this.a.s()) {
                ((w1)map0).t();
            }
            return map0;
        }
        return this.a.s() ? this.a : DesugarCollections.unmodifiableMap(this.a);
    }

    public Object u(com.google.crypto.tink.shaded.protobuf.f0.c f0$c0) {
        R0 r00 = this.a.get(f0$c0);
        return r00 instanceof B0 ? ((B0)r00).p() : r00;
    }

    public int v() {
        int v1 = 0;
        for(int v = 0; v < this.a.l(); ++v) {
            v1 += this.w(this.a.j(v));
        }
        for(Object object0: this.a.o()) {
            v1 += this.w(((Map.Entry)object0));
        }
        return v1;
    }

    private int w(Map.Entry map$Entry0) {
        com.google.crypto.tink.shaded.protobuf.f0.c f0$c0 = (com.google.crypto.tink.shaded.protobuf.f0.c)map$Entry0.getKey();
        Object object0 = map$Entry0.getValue();
        if(f0$c0.getLiteJavaType() == c.j && !f0$c0.isRepeated() && !f0$c0.isPacked()) {
            return object0 instanceof B0 ? B.N(((com.google.crypto.tink.shaded.protobuf.f0.c)map$Entry0.getKey()).getNumber(), ((B0)object0)) : B.R(((com.google.crypto.tink.shaded.protobuf.f0.c)map$Entry0.getKey()).getNumber(), ((R0)object0));
        }
        return f0.q(f0$c0, object0);
    }

    public Object x(com.google.crypto.tink.shaded.protobuf.f0.c f0$c0, int v) {
        if(!f0$c0.isRepeated()) {
            throw new IllegalArgumentException("getRepeatedField() can only be called on repeated fields.");
        }
        Object object0 = this.u(f0$c0);
        if(object0 == null) {
            throw new IndexOutOfBoundsException();
        }
        return ((List)object0).get(v);
    }

    public int y(com.google.crypto.tink.shaded.protobuf.f0.c f0$c0) {
        if(!f0$c0.isRepeated()) {
            throw new IllegalArgumentException("getRepeatedField() can only be called on repeated fields.");
        }
        Object object0 = this.u(f0$c0);
        return object0 == null ? 0 : ((List)object0).size();
    }

    public int z() {
        int v1 = 0;
        for(int v = 0; v < this.a.l(); ++v) {
            Map.Entry map$Entry0 = this.a.j(v);
            v1 += f0.q(((com.google.crypto.tink.shaded.protobuf.f0.c)map$Entry0.getKey()), map$Entry0.getValue());
        }
        for(Object object0: this.a.o()) {
            v1 += f0.q(((com.google.crypto.tink.shaded.protobuf.f0.c)((Map.Entry)object0).getKey()), ((Map.Entry)object0).getValue());
        }
        return v1;
    }
}

