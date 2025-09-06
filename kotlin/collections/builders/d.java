package kotlin.collections.builders;

import B3.g;
import java.io.NotSerializableException;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlin.jvm.internal.w;
import kotlin.ranges.s;
import y4.l;
import y4.m;

@s0({"SMAP\nMapBuilder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MapBuilder.kt\nkotlin/collections/builders/MapBuilder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,728:1\n1#2:729\n*E\n"})
public final class d implements g, Serializable, Map {
    public static final class a {
        private a() {
        }

        public a(w w0) {
        }

        private final int c(int v) {
            return Integer.highestOneBit(s.u(v, 1) * 3);
        }

        private final int d(int v) {
            return Integer.numberOfLeadingZeros(v) + 1;
        }

        @l
        public final d e() {
            return d.s;
        }
    }

    public static final class b extends kotlin.collections.builders.d.d implements B3.d, Iterator {
        public b(@l d d0) {
            L.p(d0, "map");
            super(d0);
        }

        @l
        public c i() {
            this.a();
            if(this.b() >= this.d().f) {
                throw new NoSuchElementException();
            }
            int v = this.b();
            this.g(v + 1);
            this.h(v);
            c d$c0 = new c(this.d(), this.c());
            this.f();
            return d$c0;
        }

        public final void j(@l StringBuilder stringBuilder0) {
            L.p(stringBuilder0, "sb");
            if(this.b() >= this.d().f) {
                throw new NoSuchElementException();
            }
            int v = this.b();
            this.g(v + 1);
            this.h(v);
            Object object0 = this.d().a[this.c()];
            if(object0 == this.d()) {
                stringBuilder0.append("(this Map)");
            }
            else {
                stringBuilder0.append(object0);
            }
            stringBuilder0.append('=');
            Object[] arr_object = this.d().b;
            L.m(arr_object);
            Object object1 = arr_object[this.c()];
            if(object1 == this.d()) {
                stringBuilder0.append("(this Map)");
            }
            else {
                stringBuilder0.append(object1);
            }
            this.f();
        }

        public final int k() {
            if(this.b() >= this.d().f) {
                throw new NoSuchElementException();
            }
            int v = this.b();
            this.g(v + 1);
            this.h(v);
            Object object0 = this.d().a[this.c()];
            int v1 = 0;
            int v2 = object0 == null ? 0 : object0.hashCode();
            Object[] arr_object = this.d().b;
            L.m(arr_object);
            Object object1 = arr_object[this.c()];
            if(object1 != null) {
                v1 = object1.hashCode();
            }
            this.f();
            return v2 ^ v1;
        }

        @Override
        public Object next() {
            return this.i();
        }
    }

    public static final class c implements B3.g.a, Map.Entry {
        @l
        private final d a;
        private final int b;

        public c(@l d d0, int v) {
            L.p(d0, "map");
            super();
            this.a = d0;
            this.b = v;
        }

        // 去混淆评级： 低(30)
        @Override
        public boolean equals(@m Object object0) {
            return object0 instanceof Map.Entry && L.g(((Map.Entry)object0).getKey(), this.getKey()) && L.g(((Map.Entry)object0).getValue(), this.getValue());
        }

        @Override
        public Object getKey() {
            return this.a.a[this.b];
        }

        @Override
        public Object getValue() {
            Object[] arr_object = this.a.b;
            L.m(arr_object);
            return arr_object[this.b];
        }

        @Override
        public int hashCode() {
            Object object0 = this.getKey();
            int v = 0;
            int v1 = object0 == null ? 0 : object0.hashCode();
            Object object1 = this.getValue();
            if(object1 != null) {
                v = object1.hashCode();
            }
            return v1 ^ v;
        }

        @Override
        public Object setValue(Object object0) {
            this.a.o();
            Object[] arr_object = this.a.l();
            Object object1 = arr_object[this.b];
            arr_object[this.b] = object0;
            return object1;
        }

        @Override
        @l
        public String toString() {
            return this.getKey() + '=' + this.getValue();
        }
    }

    @s0({"SMAP\nMapBuilder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MapBuilder.kt\nkotlin/collections/builders/MapBuilder$Itr\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,728:1\n1#2:729\n*E\n"})
    public static class kotlin.collections.builders.d.d {
        @l
        private final d a;
        private int b;
        private int c;
        private int d;

        public kotlin.collections.builders.d.d(@l d d0) {
            L.p(d0, "map");
            super();
            this.a = d0;
            this.c = -1;
            this.d = d0.h;
            this.f();
        }

        public final void a() {
            if(this.a.h != this.d) {
                throw new ConcurrentModificationException();
            }
        }

        public final int b() {
            return this.b;
        }

        public final int c() {
            return this.c;
        }

        @l
        public final d d() {
            return this.a;
        }

        public final void f() {
            while(this.b < this.a.f) {
                int v = this.b;
                if(this.a.c[v] >= 0) {
                    break;
                }
                this.b = v + 1;
            }
        }

        public final void g(int v) {
            this.b = v;
        }

        public final void h(int v) {
            this.c = v;
        }

        public final boolean hasNext() {
            return this.b < this.a.f;
        }

        public final void remove() {
            this.a();
            if(this.c == -1) {
                throw new IllegalStateException("Call next() before removing element from the iterator.");
            }
            this.a.o();
            this.a.S(this.c);
            this.c = -1;
            this.d = this.a.h;
        }
    }

    public static final class e extends kotlin.collections.builders.d.d implements B3.d, Iterator {
        public e(@l d d0) {
            L.p(d0, "map");
            super(d0);
        }

        @Override
        public Object next() {
            this.a();
            if(this.b() >= this.d().f) {
                throw new NoSuchElementException();
            }
            int v = this.b();
            this.g(v + 1);
            this.h(v);
            Object object0 = this.d().a[this.c()];
            this.f();
            return object0;
        }
    }

    public static final class f extends kotlin.collections.builders.d.d implements B3.d, Iterator {
        public f(@l d d0) {
            L.p(d0, "map");
            super(d0);
        }

        @Override
        public Object next() {
            this.a();
            if(this.b() >= this.d().f) {
                throw new NoSuchElementException();
            }
            int v = this.b();
            this.g(v + 1);
            this.h(v);
            Object[] arr_object = this.d().b;
            L.m(arr_object);
            Object object0 = arr_object[this.c()];
            this.f();
            return object0;
        }
    }

    @l
    private Object[] a;
    @m
    private Object[] b;
    @l
    private int[] c;
    @l
    private int[] d;
    private int e;
    private int f;
    private int g;
    private int h;
    private int i;
    @m
    private kotlin.collections.builders.f j;
    @m
    private kotlin.collections.builders.g k;
    @m
    private kotlin.collections.builders.e l;
    private boolean m;
    @l
    public static final a n = null;
    private static final int o = -1640531527;
    private static final int p = 8;
    private static final int q = 2;
    private static final int r = -1;
    @l
    private static final d s;

    static {
        d.n = new a(null);
        d d0 = new d(0);
        d0.m = true;
        d.s = d0;
    }

    public d() {
        this(8);
    }

    public d(int v) {
        this(kotlin.collections.builders.c.d(v), null, new int[v], new int[d.n.c(v)], 2, 0);
    }

    private d(Object[] arr_object, Object[] arr_object1, int[] arr_v, int[] arr_v1, int v, int v1) {
        this.a = arr_object;
        this.b = arr_object1;
        this.c = arr_v;
        this.d = arr_v1;
        this.e = v;
        this.f = v1;
        this.g = d.n.d(this.D());
    }

    private final int A(Object object0) {
        int v = this.f;
    alab1:
        while(true) {
            do {
                --v;
                if(v < 0) {
                    break alab1;
                }
                if(this.c[v] < 0) {
                    continue alab1;
                }
                Object[] arr_object = this.b;
                L.m(arr_object);
            }
            while(!L.g(arr_object[v], object0));
            return v;
        }
        return -1;
    }

    public final int B() {
        return this.a.length;
    }

    @l
    public Set C() {
        kotlin.collections.builders.e e0 = this.l;
        if(e0 == null) {
            e0 = new kotlin.collections.builders.e(this);
            this.l = e0;
        }
        return e0;
    }

    private final int D() {
        return this.d.length;
    }

    @l
    public Set E() {
        kotlin.collections.builders.f f0 = this.j;
        if(f0 == null) {
            f0 = new kotlin.collections.builders.f(this);
            this.j = f0;
        }
        return f0;
    }

    public int F() {
        return this.i;
    }

    @l
    public Collection G() {
        kotlin.collections.builders.g g0 = this.k;
        if(g0 == null) {
            g0 = new kotlin.collections.builders.g(this);
            this.k = g0;
        }
        return g0;
    }

    private final int H(Object object0) {
        return object0 == null ? 0 : object0.hashCode() * -1640531527 >>> this.g;
    }

    public final boolean I() {
        return this.m;
    }

    @l
    public final e J() {
        return new e(this);
    }

    private final boolean K(Collection collection0) {
        boolean z = false;
        if(collection0.isEmpty()) {
            return false;
        }
        this.x(collection0.size());
        for(Object object0: collection0) {
            if(this.L(((Map.Entry)object0))) {
                z = true;
            }
        }
        return z;
    }

    private final boolean L(Map.Entry map$Entry0) {
        int v = this.j(map$Entry0.getKey());
        Object[] arr_object = this.l();
        if(v >= 0) {
            arr_object[v] = map$Entry0.getValue();
            return true;
        }
        Object object0 = arr_object[-v - 1];
        if(!L.g(map$Entry0.getValue(), object0)) {
            arr_object[-v - 1] = map$Entry0.getValue();
            return true;
        }
        return false;
    }

    private final boolean M(int v) {
        int v1 = this.H(this.a[v]);
        int v2 = this.e;
        while(true) {
            int[] arr_v = this.d;
            if(arr_v[v1] == 0) {
                arr_v[v1] = v + 1;
                this.c[v] = v1;
                return true;
            }
            --v2;
            if(v2 < 0) {
                return false;
            }
            if(v1 == 0) {
                v1 = this.D() - 1;
            }
            else {
                --v1;
            }
        }
    }

    private final void N() {
        ++this.h;
    }

    private final void O(int v) {
        this.N();
        if(this.f > this.size()) {
            this.q();
        }
        if(v == this.D()) {
            kotlin.collections.l.K1(this.d, 0, 0, this.D());
        }
        else {
            this.d = new int[v];
            this.g = d.n.d(v);
        }
        for(int v1 = 0; v1 < this.f; ++v1) {
            if(!this.M(v1)) {
                throw new IllegalStateException("This cannot happen with fixed magic multiplier and grow-only hash array. Have object hashCodes changed?");
            }
        }
    }

    public final boolean P(@l Map.Entry map$Entry0) {
        L.p(map$Entry0, "entry");
        this.o();
        int v = this.z(map$Entry0.getKey());
        if(v < 0) {
            return false;
        }
        Object[] arr_object = this.b;
        L.m(arr_object);
        if(!L.g(arr_object[v], map$Entry0.getValue())) {
            return false;
        }
        this.S(v);
        return true;
    }

    private final void S(int v) {
        kotlin.collections.builders.c.f(this.a, v);
        Object[] arr_object = this.b;
        if(arr_object != null) {
            kotlin.collections.builders.c.f(arr_object, v);
        }
        this.U(this.c[v]);
        this.c[v] = -1;
        this.i = this.size() - 1;
        this.N();
    }

    private final void U(int v) {
        int v1 = s.B(this.e * 2, this.D() / 2);
        int v2 = 0;
        int v3 = v;
        do {
            v = v == 0 ? this.D() - 1 : v - 1;
            ++v2;
            if(v2 > this.e) {
                this.d[v3] = 0;
                return;
            }
            int[] arr_v = this.d;
            int v4 = arr_v[v];
            if(v4 == 0) {
                arr_v[v3] = 0;
                return;
            }
            if(v4 < 0) {
                arr_v[v3] = -1;
                v3 = v;
                v2 = 0;
            }
            else if((this.H(this.a[v4 - 1]) - v & this.D() - 1) >= v2) {
                this.d[v3] = v4;
                this.c[v4 - 1] = v3;
                v3 = v;
                v2 = 0;
            }
            --v1;
        }
        while(v1 >= 0);
        this.d[v3] = -1;
    }

    public final boolean V(Object object0) {
        this.o();
        int v = this.z(object0);
        if(v < 0) {
            return false;
        }
        this.S(v);
        return true;
    }

    public final boolean W(Object object0) {
        this.o();
        int v = this.A(object0);
        if(v < 0) {
            return false;
        }
        this.S(v);
        return true;
    }

    private final boolean X(int v) {
        int v1 = this.B() - this.f;
        int v2 = this.f - this.size();
        return v1 < v && v1 + v2 >= v && v2 >= this.B() / 4;
    }

    @l
    public final f Y() {
        return new f(this);
    }

    private final Object Z() {
        if(!this.m) {
            throw new NotSerializableException("The map cannot be serialized while it is being built.");
        }
        return new i(this);
    }

    @Override
    public void clear() {
        this.o();
        int v = this.f - 1;
        if(v >= 0) {
            for(int v1 = 0; true; ++v1) {
                int[] arr_v = this.c;
                int v2 = arr_v[v1];
                if(v2 >= 0) {
                    this.d[v2] = 0;
                    arr_v[v1] = -1;
                }
                if(v1 == v) {
                    break;
                }
            }
        }
        kotlin.collections.builders.c.g(this.a, 0, this.f);
        Object[] arr_object = this.b;
        if(arr_object != null) {
            kotlin.collections.builders.c.g(arr_object, 0, this.f);
        }
        this.i = 0;
        this.f = 0;
        this.N();
    }

    @Override
    public boolean containsKey(Object object0) {
        return this.z(object0) >= 0;
    }

    @Override
    public boolean containsValue(Object object0) {
        return this.A(object0) >= 0;
    }

    @Override
    public final Set entrySet() {
        return this.C();
    }

    // 去混淆评级： 低(20)
    @Override
    public boolean equals(@m Object object0) {
        return object0 == this || object0 instanceof Map && this.u(((Map)object0));
    }

    @Override
    @m
    public Object get(Object object0) {
        int v = this.z(object0);
        if(v < 0) {
            return null;
        }
        Object[] arr_object = this.b;
        L.m(arr_object);
        return arr_object[v];
    }

    @Override
    public int hashCode() {
        int v = 0;
        b d$b0 = this.y();
        while(d$b0.hasNext()) {
            v += d$b0.k();
        }
        return v;
    }

    @Override
    public boolean isEmpty() {
        return this.size() == 0;
    }

    public final int j(Object object0) {
        int v;
        this.o();
        while(true) {
            v = this.H(object0);
            int v1 = s.B(this.e * 2, this.D() / 2);
            int v2 = 0;
        label_4:
            int v3 = this.d[v];
            if(v3 <= 0) {
                if(this.f >= this.B()) {
                    this.x(1);
                    continue;
                }
                int v4 = this.f;
                this.f = v4 + 1;
                this.a[v4] = object0;
                this.c[v4] = v;
                this.d[v] = v4 + 1;
                this.i = this.size() + 1;
                this.N();
                if(v2 > this.e) {
                    this.e = v2;
                }
                return v4;
            }
            if(L.g(this.a[v3 - 1], object0)) {
                return -v3;
            }
            ++v2;
            if(v2 <= v1) {
                break;
            }
            this.O(this.D() * 2);
        }
        if(v != 0) {
            --v;
            goto label_4;
        }
        v = this.D() - 1;
        goto label_4;
    }

    @Override
    public final Set keySet() {
        return this.E();
    }

    private final Object[] l() {
        Object[] arr_object = this.b;
        if(arr_object != null) {
            return arr_object;
        }
        Object[] arr_object1 = kotlin.collections.builders.c.d(this.B());
        this.b = arr_object1;
        return arr_object1;
    }

    @l
    public final Map m() {
        this.o();
        this.m = true;
        if(this.size() > 0) {
            return this;
        }
        L.n(d.s, "null cannot be cast to non-null type kotlin.collections.Map<K of kotlin.collections.builders.MapBuilder, V of kotlin.collections.builders.MapBuilder>");
        return d.s;
    }

    public final void o() {
        if(this.m) {
            throw new UnsupportedOperationException();
        }
    }

    @Override
    @m
    public Object put(Object object0, Object object1) {
        this.o();
        int v = this.j(object0);
        Object[] arr_object = this.l();
        if(v < 0) {
            Object object2 = arr_object[-v - 1];
            arr_object[-v - 1] = object1;
            return object2;
        }
        arr_object[v] = object1;
        return null;
    }

    @Override
    public void putAll(@l Map map0) {
        L.p(map0, "from");
        this.o();
        this.K(map0.entrySet());
    }

    private final void q() {
        int v2;
        Object[] arr_object = this.b;
        int v1 = 0;
        for(int v = 0; true; ++v) {
            v2 = this.f;
            if(v >= v2) {
                break;
            }
            if(this.c[v] >= 0) {
                this.a[v1] = this.a[v];
                if(arr_object != null) {
                    arr_object[v1] = arr_object[v];
                }
                ++v1;
            }
        }
        kotlin.collections.builders.c.g(this.a, v1, v2);
        if(arr_object != null) {
            kotlin.collections.builders.c.g(arr_object, v1, this.f);
        }
        this.f = v1;
    }

    public final boolean r(@l Collection collection0) {
        L.p(collection0, "m");
        for(Object object0: collection0) {
            if(object0 != null) {
                try {
                    if(!this.s(((Map.Entry)object0))) {
                        return false;
                    }
                    continue;
                }
                catch(ClassCastException unused_ex) {
                }
            }
            return false;
        }
        return true;
    }

    @Override
    @m
    public Object remove(Object object0) {
        this.o();
        int v = this.z(object0);
        if(v < 0) {
            return null;
        }
        Object[] arr_object = this.b;
        L.m(arr_object);
        Object object1 = arr_object[v];
        this.S(v);
        return object1;
    }

    public final boolean s(@l Map.Entry map$Entry0) {
        L.p(map$Entry0, "entry");
        int v = this.z(map$Entry0.getKey());
        if(v < 0) {
            return false;
        }
        Object[] arr_object = this.b;
        L.m(arr_object);
        return L.g(arr_object[v], map$Entry0.getValue());
    }

    @Override
    public final int size() {
        return this.F();
    }

    @Override
    @l
    public String toString() {
        StringBuilder stringBuilder0 = new StringBuilder(this.size() * 3 + 2);
        stringBuilder0.append("{");
        b d$b0 = this.y();
        for(int v = 0; d$b0.hasNext(); ++v) {
            if(v > 0) {
                stringBuilder0.append(", ");
            }
            d$b0.j(stringBuilder0);
        }
        stringBuilder0.append("}");
        String s = stringBuilder0.toString();
        L.o(s, "toString(...)");
        return s;
    }

    private final boolean u(Map map0) {
        return this.size() == map0.size() && this.r(map0.entrySet());
    }

    @Override
    public final Collection values() {
        return this.G();
    }

    private final void w(int v) {
        if(v < 0) {
            throw new OutOfMemoryError();
        }
        if(v > this.B()) {
            int v1 = kotlin.collections.c.a.e(this.B(), v);
            this.a = kotlin.collections.builders.c.e(this.a, v1);
            this.b = this.b == null ? null : kotlin.collections.builders.c.e(this.b, v1);
            int[] arr_v = Arrays.copyOf(this.c, v1);
            L.o(arr_v, "copyOf(...)");
            this.c = arr_v;
            int v2 = d.n.c(v1);
            if(v2 > this.D()) {
                this.O(v2);
            }
        }
    }

    private final void x(int v) {
        if(this.X(v)) {
            this.O(this.D());
            return;
        }
        this.w(this.f + v);
    }

    @l
    public final b y() {
        return new b(this);
    }

    private final int z(Object object0) {
        int v = this.H(object0);
        int v1 = this.e;
        while(true) {
            int v2 = this.d[v];
            if(v2 == 0) {
                return -1;
            }
            if(v2 > 0 && L.g(this.a[v2 - 1], object0)) {
                return v2 - 1;
            }
            --v1;
            if(v1 < 0) {
                return -1;
            }
            if(v == 0) {
                v = this.D() - 1;
            }
            else {
                --v;
            }
        }
    }
}

