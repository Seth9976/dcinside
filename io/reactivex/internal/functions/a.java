package io.reactivex.internal.functions;

import e3.b;
import e3.c;
import e3.g;
import e3.h;
import e3.i;
import e3.j;
import e3.k;
import e3.l;
import e3.m;
import e3.n;
import e3.o;
import e3.r;
import io.reactivex.J;
import io.reactivex.exceptions.d;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import org.reactivestreams.e;

public final class a {
    static final class A implements g {
        public void a(e e0) throws Exception {
            e0.request(0x7FFFFFFFFFFFFFFFL);
        }

        @Override  // e3.g
        public void accept(Object object0) throws Exception {
            this.a(((e)object0));
        }
    }

    static enum B implements Comparator {
        INSTANCE;

        @Override
        public int compare(Object object0, Object object1) {
            return ((Comparable)object0).compareTo(object1);
        }
    }

    static final class C implements Comparator {
        @Override
        public int compare(Object object0, Object object1) {
            return ((Comparable)object0).compareTo(object1);
        }
    }

    static final class D implements e3.a {
        final g a;

        D(g g0) {
            this.a = g0;
        }

        @Override  // e3.a
        public void run() throws Exception {
            io.reactivex.A a0 = io.reactivex.A.a();
            this.a.accept(a0);
        }
    }

    static final class E implements g {
        final g a;

        E(g g0) {
            this.a = g0;
        }

        public void a(Throwable throwable0) throws Exception {
            io.reactivex.A a0 = io.reactivex.A.b(throwable0);
            this.a.accept(a0);
        }

        @Override  // e3.g
        public void accept(Object object0) throws Exception {
            this.a(((Throwable)object0));
        }
    }

    static final class F implements g {
        final g a;

        F(g g0) {
            this.a = g0;
        }

        @Override  // e3.g
        public void accept(Object object0) throws Exception {
            io.reactivex.A a0 = io.reactivex.A.c(object0);
            this.a.accept(a0);
        }
    }

    static final class G implements Callable {
        @Override
        public Object call() {
            return null;
        }
    }

    static final class H implements g {
        public void a(Throwable throwable0) {
            io.reactivex.plugins.a.Y(new d(throwable0));
        }

        @Override  // e3.g
        public void accept(Object object0) throws Exception {
            this.a(((Throwable)object0));
        }
    }

    static final class I implements o {
        final TimeUnit a;
        final J b;

        I(TimeUnit timeUnit0, J j0) {
            this.a = timeUnit0;
            this.b = j0;
        }

        public io.reactivex.schedulers.d a(Object object0) throws Exception {
            return new io.reactivex.schedulers.d(object0, this.b.e(this.a), this.a);
        }

        @Override  // e3.o
        public Object apply(Object object0) throws Exception {
            return this.a(object0);
        }
    }

    static final class io.reactivex.internal.functions.a.J implements b {
        private final o a;

        io.reactivex.internal.functions.a.J(o o0) {
            this.a = o0;
        }

        public void a(Map map0, Object object0) throws Exception {
            map0.put(this.a.apply(object0), object0);
        }

        @Override  // e3.b
        public void accept(Object object0, Object object1) throws Exception {
            this.a(((Map)object0), object1);
        }
    }

    static final class K implements b {
        private final o a;
        private final o b;

        K(o o0, o o1) {
            this.a = o0;
            this.b = o1;
        }

        public void a(Map map0, Object object0) throws Exception {
            map0.put(this.b.apply(object0), this.a.apply(object0));
        }

        @Override  // e3.b
        public void accept(Object object0, Object object1) throws Exception {
            this.a(((Map)object0), object1);
        }
    }

    static final class L implements b {
        private final o a;
        private final o b;
        private final o c;

        L(o o0, o o1, o o2) {
            this.a = o0;
            this.b = o1;
            this.c = o2;
        }

        public void a(Map map0, Object object0) throws Exception {
            Object object1 = this.c.apply(object0);
            Collection collection0 = (Collection)map0.get(object1);
            if(collection0 == null) {
                collection0 = (Collection)this.a.apply(object1);
                map0.put(object1, collection0);
            }
            collection0.add(this.b.apply(object0));
        }

        @Override  // e3.b
        public void accept(Object object0, Object object1) throws Exception {
            this.a(((Map)object0), object1);
        }
    }

    static final class M implements r {
        @Override  // e3.r
        public boolean test(Object object0) {
            return true;
        }
    }

    static final class io.reactivex.internal.functions.a.a implements g {
        final e3.a a;

        io.reactivex.internal.functions.a.a(e3.a a0) {
            this.a = a0;
        }

        @Override  // e3.g
        public void accept(Object object0) throws Exception {
            this.a.run();
        }
    }

    static final class io.reactivex.internal.functions.a.b implements o {
        final c a;

        io.reactivex.internal.functions.a.b(c c0) {
            this.a = c0;
        }

        public Object a(Object[] arr_object) throws Exception {
            if(arr_object.length != 2) {
                throw new IllegalArgumentException("Array of size 2 expected but got " + arr_object.length);
            }
            return this.a.apply(arr_object[0], arr_object[1]);
        }

        @Override  // e3.o
        public Object apply(Object object0) throws Exception {
            return this.a(((Object[])object0));
        }
    }

    static final class io.reactivex.internal.functions.a.c implements o {
        final h a;

        io.reactivex.internal.functions.a.c(h h0) {
            this.a = h0;
        }

        public Object a(Object[] arr_object) throws Exception {
            if(arr_object.length != 3) {
                throw new IllegalArgumentException("Array of size 3 expected but got " + arr_object.length);
            }
            return this.a.a(arr_object[0], arr_object[1], arr_object[2]);
        }

        @Override  // e3.o
        public Object apply(Object object0) throws Exception {
            return this.a(((Object[])object0));
        }
    }

    static final class io.reactivex.internal.functions.a.d implements o {
        final i a;

        io.reactivex.internal.functions.a.d(i i0) {
            this.a = i0;
        }

        public Object a(Object[] arr_object) throws Exception {
            if(arr_object.length != 4) {
                throw new IllegalArgumentException("Array of size 4 expected but got " + arr_object.length);
            }
            return this.a.a(arr_object[0], arr_object[1], arr_object[2], arr_object[3]);
        }

        @Override  // e3.o
        public Object apply(Object object0) throws Exception {
            return this.a(((Object[])object0));
        }
    }

    static final class io.reactivex.internal.functions.a.e implements o {
        private final j a;

        io.reactivex.internal.functions.a.e(j j0) {
            this.a = j0;
        }

        public Object a(Object[] arr_object) throws Exception {
            if(arr_object.length != 5) {
                throw new IllegalArgumentException("Array of size 5 expected but got " + arr_object.length);
            }
            return this.a.a(arr_object[0], arr_object[1], arr_object[2], arr_object[3], arr_object[4]);
        }

        @Override  // e3.o
        public Object apply(Object object0) throws Exception {
            return this.a(((Object[])object0));
        }
    }

    static final class f implements o {
        final k a;

        f(k k0) {
            this.a = k0;
        }

        public Object a(Object[] arr_object) throws Exception {
            if(arr_object.length != 6) {
                throw new IllegalArgumentException("Array of size 6 expected but got " + arr_object.length);
            }
            return this.a.a(arr_object[0], arr_object[1], arr_object[2], arr_object[3], arr_object[4], arr_object[5]);
        }

        @Override  // e3.o
        public Object apply(Object object0) throws Exception {
            return this.a(((Object[])object0));
        }
    }

    static final class io.reactivex.internal.functions.a.g implements o {
        final l a;

        io.reactivex.internal.functions.a.g(l l0) {
            this.a = l0;
        }

        public Object a(Object[] arr_object) throws Exception {
            if(arr_object.length != 7) {
                throw new IllegalArgumentException("Array of size 7 expected but got " + arr_object.length);
            }
            return this.a.a(arr_object[0], arr_object[1], arr_object[2], arr_object[3], arr_object[4], arr_object[5], arr_object[6]);
        }

        @Override  // e3.o
        public Object apply(Object object0) throws Exception {
            return this.a(((Object[])object0));
        }
    }

    static final class io.reactivex.internal.functions.a.h implements o {
        final m a;

        io.reactivex.internal.functions.a.h(m m0) {
            this.a = m0;
        }

        public Object a(Object[] arr_object) throws Exception {
            if(arr_object.length != 8) {
                throw new IllegalArgumentException("Array of size 8 expected but got " + arr_object.length);
            }
            return this.a.a(arr_object[0], arr_object[1], arr_object[2], arr_object[3], arr_object[4], arr_object[5], arr_object[6], arr_object[7]);
        }

        @Override  // e3.o
        public Object apply(Object object0) throws Exception {
            return this.a(((Object[])object0));
        }
    }

    static final class io.reactivex.internal.functions.a.i implements o {
        final n a;

        io.reactivex.internal.functions.a.i(n n0) {
            this.a = n0;
        }

        public Object a(Object[] arr_object) throws Exception {
            if(arr_object.length != 9) {
                throw new IllegalArgumentException("Array of size 9 expected but got " + arr_object.length);
            }
            return this.a.a(arr_object[0], arr_object[1], arr_object[2], arr_object[3], arr_object[4], arr_object[5], arr_object[6], arr_object[7], arr_object[8]);
        }

        @Override  // e3.o
        public Object apply(Object object0) throws Exception {
            return this.a(((Object[])object0));
        }
    }

    static final class io.reactivex.internal.functions.a.j implements Callable {
        final int a;

        io.reactivex.internal.functions.a.j(int v) {
            this.a = v;
        }

        public List a() throws Exception {
            return new ArrayList(this.a);
        }

        @Override
        public Object call() throws Exception {
            return this.a();
        }
    }

    static final class io.reactivex.internal.functions.a.k implements r {
        final e3.e a;

        io.reactivex.internal.functions.a.k(e3.e e0) {
            this.a = e0;
        }

        @Override  // e3.r
        public boolean test(Object object0) throws Exception {
            return !this.a.a();
        }
    }

    public static class io.reactivex.internal.functions.a.l implements g {
        final int a;

        io.reactivex.internal.functions.a.l(int v) {
            this.a = v;
        }

        public void a(e e0) throws Exception {
            e0.request(((long)this.a));
        }

        @Override  // e3.g
        public void accept(Object object0) throws Exception {
            this.a(((e)object0));
        }
    }

    static final class io.reactivex.internal.functions.a.m implements o {
        final Class a;

        io.reactivex.internal.functions.a.m(Class class0) {
            this.a = class0;
        }

        @Override  // e3.o
        public Object apply(Object object0) throws Exception {
            return this.a.cast(object0);
        }
    }

    static final class io.reactivex.internal.functions.a.n implements r {
        final Class a;

        io.reactivex.internal.functions.a.n(Class class0) {
            this.a = class0;
        }

        @Override  // e3.r
        public boolean test(Object object0) throws Exception {
            return this.a.isInstance(object0);
        }
    }

    static final class io.reactivex.internal.functions.a.o implements e3.a {
        @Override  // e3.a
        public void run() {
        }

        @Override
        public String toString() {
            return "EmptyAction";
        }
    }

    static final class p implements g {
        @Override  // e3.g
        public void accept(Object object0) {
        }

        @Override
        public String toString() {
            return "EmptyConsumer";
        }
    }

    static final class q implements e3.q {
        @Override  // e3.q
        public void a(long v) {
        }
    }

    static final class io.reactivex.internal.functions.a.r implements Runnable {
        @Override
        public void run() {
        }

        @Override
        public String toString() {
            return "EmptyRunnable";
        }
    }

    static final class s implements r {
        final Object a;

        s(Object object0) {
            this.a = object0;
        }

        @Override  // e3.r
        public boolean test(Object object0) throws Exception {
            return io.reactivex.internal.functions.b.c(object0, this.a);
        }
    }

    static final class t implements g {
        public void a(Throwable throwable0) {
            io.reactivex.plugins.a.Y(throwable0);
        }

        @Override  // e3.g
        public void accept(Object object0) throws Exception {
            this.a(((Throwable)object0));
        }
    }

    static final class u implements r {
        @Override  // e3.r
        public boolean test(Object object0) {
            return false;
        }
    }

    static final class v implements e3.a {
        final Future a;

        v(Future future0) {
            this.a = future0;
        }

        @Override  // e3.a
        public void run() throws Exception {
            this.a.get();
        }
    }

    static enum w implements Callable {
        INSTANCE;

        public Set a() throws Exception {
            return new HashSet();
        }

        @Override
        public Object call() throws Exception {
            return this.a();
        }
    }

    static final class x implements o {
        @Override  // e3.o
        public Object apply(Object object0) {
            return object0;
        }

        @Override
        public String toString() {
            return "IdentityFunction";
        }
    }

    static final class y implements o, Callable {
        final Object a;

        y(Object object0) {
            this.a = object0;
        }

        @Override  // e3.o
        public Object apply(Object object0) throws Exception {
            return this.a;
        }

        @Override
        public Object call() throws Exception {
            return this.a;
        }
    }

    static final class z implements o {
        final Comparator a;

        z(Comparator comparator0) {
            this.a = comparator0;
        }

        public List a(List list0) {
            Collections.sort(list0, this.a);
            return list0;
        }

        @Override  // e3.o
        public Object apply(Object object0) throws Exception {
            return this.a(((List)object0));
        }
    }

    static final o a;
    public static final Runnable b;
    public static final e3.a c;
    static final g d;
    public static final g e;
    public static final g f;
    public static final e3.q g;
    static final r h;
    static final r i;
    static final Callable j;
    static final Comparator k;
    public static final g l;

    static {
        a.a = new x();
        a.b = new io.reactivex.internal.functions.a.r();
        a.c = new io.reactivex.internal.functions.a.o();
        a.d = new p();
        a.e = new t();
        a.f = new H();
        a.g = new q();
        a.h = new M();
        a.i = new u();
        a.j = new G();
        a.k = new C();
        a.l = new A();
    }

    private a() {
        throw new IllegalStateException("No instances!");
    }

    public static o A(j j0) {
        io.reactivex.internal.functions.b.g(j0, "f is null");
        return new io.reactivex.internal.functions.a.e(j0);
    }

    public static o B(k k0) {
        io.reactivex.internal.functions.b.g(k0, "f is null");
        return new f(k0);
    }

    public static o C(l l0) {
        io.reactivex.internal.functions.b.g(l0, "f is null");
        return new io.reactivex.internal.functions.a.g(l0);
    }

    public static o D(m m0) {
        io.reactivex.internal.functions.b.g(m0, "f is null");
        return new io.reactivex.internal.functions.a.h(m0);
    }

    public static o E(n n0) {
        io.reactivex.internal.functions.b.g(n0, "f is null");
        return new io.reactivex.internal.functions.a.i(n0);
    }

    public static b F(o o0) {
        return new io.reactivex.internal.functions.a.J(o0);
    }

    public static b G(o o0, o o1) {
        return new K(o1, o0);
    }

    public static b H(o o0, o o1, o o2) {
        return new L(o2, o1, o0);
    }

    public static g a(e3.a a0) {
        return new io.reactivex.internal.functions.a.a(a0);
    }

    public static r b() {
        return a.i;
    }

    public static r c() {
        return a.h;
    }

    public static g d(int v) {
        return new io.reactivex.internal.functions.a.l(v);
    }

    public static o e(Class class0) {
        return new io.reactivex.internal.functions.a.m(class0);
    }

    public static Callable f(int v) {
        return new io.reactivex.internal.functions.a.j(v);
    }

    public static Callable g() {
        return w.a;
    }

    public static g h() {
        return a.d;
    }

    public static r i(Object object0) {
        return new s(object0);
    }

    public static e3.a j(Future future0) {
        return new v(future0);
    }

    public static o k() {
        return a.a;
    }

    public static r l(Class class0) {
        return new io.reactivex.internal.functions.a.n(class0);
    }

    public static Callable m(Object object0) {
        return new y(object0);
    }

    public static o n(Object object0) {
        return new y(object0);
    }

    public static o o(Comparator comparator0) {
        return new z(comparator0);
    }

    public static Comparator p() {
        return B.a;
    }

    public static Comparator q() {
        return a.k;
    }

    public static e3.a r(g g0) {
        return new D(g0);
    }

    public static g s(g g0) {
        return new E(g0);
    }

    public static g t(g g0) {
        return new F(g0);
    }

    public static Callable u() {
        return a.j;
    }

    public static r v(e3.e e0) {
        return new io.reactivex.internal.functions.a.k(e0);
    }

    public static o w(TimeUnit timeUnit0, J j0) {
        return new I(timeUnit0, j0);
    }

    public static o x(c c0) {
        io.reactivex.internal.functions.b.g(c0, "f is null");
        return new io.reactivex.internal.functions.a.b(c0);
    }

    public static o y(h h0) {
        io.reactivex.internal.functions.b.g(h0, "f is null");
        return new io.reactivex.internal.functions.a.c(h0);
    }

    public static o z(i i0) {
        io.reactivex.internal.functions.b.g(i0, "f is null");
        return new io.reactivex.internal.functions.a.d(i0);
    }
}

