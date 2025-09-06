package io.realm;

import io.realm.internal.OsResults.p;
import io.realm.internal.OsResults.q;
import io.realm.internal.OsResults.r;
import io.realm.internal.OsResults;
import io.realm.internal.Table;
import io.realm.internal.UncheckedRow;
import io.realm.internal.core.NativeRealmAny;
import io.realm.internal.objectstore.OsKeyPathMapping;
import io.realm.internal.s;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Date;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Locale;
import o3.h;

abstract class x0 extends AbstractList implements OrderedRealmCollection {
    static class a extends e {
        a(io.realm.a a0, OsResults osResults0, @h Class class0, @h String s) {
            super(a0, osResults0, class0, s);
        }

        @Override  // io.realm.x0$e
        public Object d(int v) {
            return this.g(v);
        }

        @Override  // io.realm.x0$e
        public Object e(int v, OsResults osResults0) {
            return this.h(v, osResults0);
        }

        public Byte g(int v) {
            return ((Long)this.b.w(v)).byteValue();
        }

        public Byte h(int v, OsResults osResults0) {
            Long long0 = (Long)osResults0.w(v);
            return long0 == null ? null : long0.byteValue();
        }
    }

    static abstract class b {
        protected final io.realm.a a;
        protected final OsResults b;
        @h
        protected final Class c;
        @h
        protected final String d;

        b(io.realm.a a0, OsResults osResults0, @h Class class0, @h String s) {
            this.a = a0;
            this.b = osResults0;
            this.c = class0;
            this.d = s;
        }

        public abstract Object a(UncheckedRow arg1);

        protected Object b(@h UncheckedRow uncheckedRow0, boolean z, @h Object object0) {
            if(uncheckedRow0 != null) {
                return this.a.R(this.c, this.d, uncheckedRow0);
            }
            if(z) {
                throw new IndexOutOfBoundsException("No results were found.");
            }
            return object0;
        }

        @h
        public abstract Object c(boolean arg1, @h Object arg2);

        public abstract Object d(int arg1);

        public abstract Object e(int arg1, OsResults arg2);

        @h
        public abstract Object f(boolean arg1, @h Object arg2);
    }

    static class c extends e {
        c(io.realm.a a0, OsResults osResults0, @h Class class0, @h String s) {
            super(a0, osResults0, class0, s);
        }

        @Override  // io.realm.x0$e
        public Object d(int v) {
            return this.g(v);
        }

        @Override  // io.realm.x0$e
        public Object e(int v, OsResults osResults0) {
            return this.h(v, osResults0);
        }

        public Integer g(int v) {
            return ((Long)this.b.w(v)).intValue();
        }

        public Integer h(int v, OsResults osResults0) {
            Long long0 = (Long)osResults0.w(v);
            return long0 == null ? null : long0.intValue();
        }
    }

    static class d extends b {
        d(io.realm.a a0, OsResults osResults0, @h Class class0, @h String s) {
            super(a0, osResults0, class0, s);
        }

        @Override  // io.realm.x0$b
        public Object a(UncheckedRow uncheckedRow0) {
            return this.a.R(this.c, this.d, uncheckedRow0);
        }

        @Override  // io.realm.x0$b
        @h
        public Object c(boolean z, @h Object object0) {
            return this.b(this.b.r(), z, object0);
        }

        @Override  // io.realm.x0$b
        public Object d(int v) {
            UncheckedRow uncheckedRow0 = this.b.v(v);
            return this.a.R(this.c, this.d, uncheckedRow0);
        }

        @Override  // io.realm.x0$b
        public Object e(int v, OsResults osResults0) {
            return this.a(osResults0.v(v));
        }

        @Override  // io.realm.x0$b
        @h
        public Object f(boolean z, @h Object object0) {
            return this.b(this.b.A(), z, object0);
        }
    }

    static class e extends b {
        e(io.realm.a a0, OsResults osResults0, @h Class class0, @h String s) {
            super(a0, osResults0, class0, s);
        }

        @Override  // io.realm.x0$b
        public Object a(UncheckedRow uncheckedRow0) {
            throw new UnsupportedOperationException("Method \'convertRowToObject\' cannot be used on primitive Realm collections.");
        }

        @Override  // io.realm.x0$b
        @h
        public Object c(boolean z, @h Object object0) {
            return this.b.f0() == 0L ? object0 : this.b.w(0);
        }

        @Override  // io.realm.x0$b
        public Object d(int v) {
            return this.b.w(v);
        }

        @Override  // io.realm.x0$b
        public Object e(int v, OsResults osResults0) {
            return osResults0.w(v);
        }

        @Override  // io.realm.x0$b
        @h
        public Object f(boolean z, @h Object object0) {
            int v = (int)this.b.f0();
            return v == 0 ? object0 : this.b.w(v - 1);
        }
    }

    static class f extends e {
        f(io.realm.a a0, OsResults osResults0, @h Class class0, @h String s) {
            super(a0, osResults0, class0, s);
        }

        @Override  // io.realm.x0$e
        public Object d(int v) {
            return this.g(v);
        }

        @Override  // io.realm.x0$e
        public Object e(int v, OsResults osResults0) {
            return this.h(v, osResults0);
        }

        public G0 g(int v) {
            NativeRealmAny nativeRealmAny0 = (NativeRealmAny)this.b.w(v);
            return new G0(J0.d(this.a, nativeRealmAny0));
        }

        public G0 h(int v, OsResults osResults0) {
            NativeRealmAny nativeRealmAny0 = (NativeRealmAny)osResults0.w(v);
            return new G0(J0.d(this.a, nativeRealmAny0));
        }
    }

    class g extends q {
        final x0 c;

        g() {
            super(x00.d);
        }

        @Override  // io.realm.internal.OsResults$q
        protected Object b(UncheckedRow uncheckedRow0) {
            return x0.this.e.a(uncheckedRow0);
        }

        @Override  // io.realm.internal.OsResults$q
        protected Object e(int v, OsResults osResults0) {
            return x0.this.e.e(v, osResults0);
        }
    }

    class io.realm.x0.h extends r {
        final x0 c;

        io.realm.x0.h(int v) {
            super(x00.d, v);
        }

        @Override  // io.realm.internal.OsResults$q
        protected Object b(UncheckedRow uncheckedRow0) {
            return x0.this.e.a(uncheckedRow0);
        }

        @Override  // io.realm.internal.OsResults$q
        protected Object e(int v, OsResults osResults0) {
            return x0.this.e.e(v, osResults0);
        }
    }

    static class i extends e {
        i(io.realm.a a0, OsResults osResults0, @h Class class0, @h String s) {
            super(a0, osResults0, class0, s);
        }

        @Override  // io.realm.x0$e
        public Object d(int v) {
            return this.g(v);
        }

        @Override  // io.realm.x0$e
        public Object e(int v, OsResults osResults0) {
            return this.h(v, osResults0);
        }

        public Short g(int v) {
            return ((Long)this.b.w(v)).shortValue();
        }

        public Short h(int v, OsResults osResults0) {
            Long long0 = (Long)osResults0.w(v);
            return long0 == null ? null : long0.shortValue();
        }
    }

    public final io.realm.a a;
    @h
    final Class b;
    @h
    final String c;
    final OsResults d;
    final b e;
    private static final String f = "This method is not supported by \'RealmResults\' or \'OrderedRealmCollectionSnapshot\'.";

    x0(io.realm.a a0, OsResults osResults0, Class class0) {
        this(a0, osResults0, class0, null, x0.c(false, a0, osResults0, class0, null));
    }

    x0(io.realm.a a0, OsResults osResults0, Class class0, b x0$b0) {
        this(a0, osResults0, class0, null, x0$b0);
    }

    private x0(io.realm.a a0, OsResults osResults0, @h Class class0, @h String s, b x0$b0) {
        this.a = a0;
        this.d = osResults0;
        this.b = class0;
        this.c = s;
        this.e = x0$b0;
    }

    x0(io.realm.a a0, OsResults osResults0, String s) {
        this(a0, osResults0, null, s, x0.c(false, a0, osResults0, null, s));
    }

    x0(io.realm.a a0, OsResults osResults0, String s, b x0$b0) {
        this(a0, osResults0, null, s, x0$b0);
    }

    @Override  // io.realm.OrderedRealmCollection
    public g1 A2(String s, r1 r10) {
        OsKeyPathMapping osKeyPathMapping0 = this.a.e0().l();
        return this.a(this.d.g0(osKeyPathMapping0, s, r10));
    }

    @Override  // io.realm.OrderedRealmCollection
    @h
    public Object C2(@h Object object0) {
        return this.b(false, object0);
    }

    @Override  // io.realm.OrderedRealmCollection
    @h
    public Object I4(@h Object object0) {
        return this.j(false, object0);
    }

    @Override  // io.realm.RealmCollection
    public boolean L() {
        return true;
    }

    @Override  // io.realm.RealmCollection
    public boolean L0() {
        this.a.k();
        if(this.size() > 0) {
            this.d.h();
            return true;
        }
        return false;
    }

    @Override  // io.realm.OrderedRealmCollection
    public g1 N4(String s, r1 r10, String s1, r1 r11) {
        return this.e2(new String[]{s, s1}, new r1[]{r10, r11});
    }

    @Override  // io.realm.OrderedRealmCollection
    public void T3(int v) {
        this.a.n();
        this.d.n(((long)v));
    }

    g1 a(OsResults osResults0) {
        g1 g10 = this.c == null ? new g1(this.a, osResults0, this.b) : new g1(this.a, osResults0, this.c);
        g10.w();
        return g10;
    }

    @Override
    @Deprecated
    public void add(int v, Object object0) {
        throw new UnsupportedOperationException("This method is not supported by \'RealmResults\' or \'OrderedRealmCollectionSnapshot\'.");
    }

    @Override
    @Deprecated
    public boolean add(Object object0) {
        throw new UnsupportedOperationException("This method is not supported by \'RealmResults\' or \'OrderedRealmCollectionSnapshot\'.");
    }

    @Override
    @Deprecated
    public boolean addAll(int v, Collection collection0) {
        throw new UnsupportedOperationException("This method is not supported by \'RealmResults\' or \'OrderedRealmCollectionSnapshot\'.");
    }

    @Override
    @Deprecated
    public boolean addAll(Collection collection0) {
        throw new UnsupportedOperationException("This method is not supported by \'RealmResults\' or \'OrderedRealmCollectionSnapshot\'.");
    }

    @h
    private Object b(boolean z, @h Object object0) {
        return this.e.c(z, object0);
    }

    protected static b c(boolean z, io.realm.a a0, OsResults osResults0, @h Class class0, @h String s) {
        if(z) {
            Class class1 = Integer.class;
            if(class0 == class1) {
                return new c(a0, osResults0, class1, s);
            }
            Class class2 = Short.class;
            if(class0 == class2) {
                return new i(a0, osResults0, class2, s);
            }
            Class class3 = Byte.class;
            if(class0 == class3) {
                return new a(a0, osResults0, class3, s);
            }
            Class class4 = G0.class;
            return class0 == class4 ? new f(a0, osResults0, class4, s) : new e(a0, osResults0, class0, s);
        }
        return new d(a0, osResults0, class0, s);
    }

    @Override  // io.realm.OrderedRealmCollection
    public boolean c1() {
        this.a.n();
        return this.d.p();
    }

    @Override
    @Deprecated
    public void clear() {
        throw new UnsupportedOperationException("This method is not supported by \'RealmResults\' or \'OrderedRealmCollectionSnapshot\'.");
    }

    @Override  // io.realm.RealmCollection
    public boolean contains(@h Object object0) {
        if(!this.e0() || object0 instanceof s && ((s)object0).R3().g() == io.realm.internal.i.a) {
            return false;
        }
        for(Object object1: this) {
            if(object1 instanceof byte[] && object0 instanceof byte[]) {
                if(!Arrays.equals(((byte[])object1), ((byte[])object0))) {
                    continue;
                }
                return true;
            }
            if(object1 != null && object1.equals(object0)) {
                return true;
            }
            if(object1 == null && object0 == null) {
                return true;
            }
            if(false) {
                break;
            }
        }
        return false;
    }

    private long d(String s) {
        if(s == null || s.isEmpty()) {
            throw new IllegalArgumentException("Non-empty field name required.");
        }
        if(s.contains(".")) {
            throw new IllegalArgumentException("Aggregates on child object fields are not supported: " + s);
        }
        long v = this.d.u().F(s);
        if(v < 0L) {
            throw new IllegalArgumentException(String.format(Locale.US, "Field \'%s\' does not exist.", s));
        }
        return v;
    }

    @Override  // io.realm.OrderedRealmCollection
    public boolean d1() {
        this.a.n();
        return this.d.o();
    }

    @Override  // io.realm.OrderedRealmCollection
    public g1 e2(String[] arr_s, r1[] arr_r1) {
        OsKeyPathMapping osKeyPathMapping0 = this.a.e0().l();
        return this.a(this.d.h0(osKeyPathMapping0, arr_s, arr_r1));
    }

    @Override  // io.realm.OrderedRealmCollection
    @h
    public Object first() {
        return this.b(true, null);
    }

    OsResults g() {
        return this.d;
    }

    @Override
    @h
    public Object get(int v) {
        this.a.k();
        return this.e.d(v);
    }

    public F0 h() {
        this.a.k();
        io.realm.a a0 = this.a;
        if(!(a0 instanceof F0)) {
            throw new IllegalStateException("This method is only available for typed Realms");
        }
        return (F0)a0;
    }

    Table i() {
        return this.d.u();
    }

    @Override  // io.realm.OrderedRealmCollection
    public y0 i2() {
        return this.c == null ? new y0(this.a, this.d, this.b) : new y0(this.a, this.d, this.c);
    }

    @Override
    public Iterator iterator() {
        return new g(this);
    }

    @h
    private Object j(boolean z, @h Object object0) {
        return this.e.f(z, object0);
    }

    @Override  // io.realm.RealmCollection
    public Number k4(String s) {
        this.a.k();
        long v = this.d(s);
        return this.d.g(p.c, v);
    }

    @Override  // io.realm.OrderedRealmCollection
    @h
    public Object last() {
        return this.j(true, null);
    }

    @Override
    public ListIterator listIterator() {
        return new io.realm.x0.h(this, 0);
    }

    @Override
    public ListIterator listIterator(int v) {
        return new io.realm.x0.h(this, v);
    }

    @Override  // io.realm.OrderedRealmCollection
    public g1 p3(String s) {
        OsKeyPathMapping osKeyPathMapping0 = this.a.e0().l();
        return this.a(this.d.g0(osKeyPathMapping0, s, r1.b));
    }

    @Override  // io.realm.RealmCollection
    @h
    public Date q4(String s) {
        this.a.k();
        long v = this.d(s);
        return this.d.f(p.c, v);
    }

    @Override
    @Deprecated
    public Object remove(int v) {
        throw new UnsupportedOperationException("This method is not supported by \'RealmResults\' or \'OrderedRealmCollectionSnapshot\'.");
    }

    @Override
    @Deprecated
    public boolean remove(Object object0) {
        throw new UnsupportedOperationException("This method is not supported by \'RealmResults\' or \'OrderedRealmCollectionSnapshot\'.");
    }

    @Override
    @Deprecated
    public boolean removeAll(Collection collection0) {
        throw new UnsupportedOperationException("This method is not supported by \'RealmResults\' or \'OrderedRealmCollectionSnapshot\'.");
    }

    @Override
    @Deprecated
    public boolean retainAll(Collection collection0) {
        throw new UnsupportedOperationException("This method is not supported by \'RealmResults\' or \'OrderedRealmCollectionSnapshot\'.");
    }

    @Override  // io.realm.RealmCollection
    public boolean s() {
        return this.d.z();
    }

    @Override
    @Deprecated
    public Object set(int v, Object object0) {
        throw new UnsupportedOperationException("This method is not supported by \'RealmResults\' or \'OrderedRealmCollectionSnapshot\'.");
    }

    @Override
    public int size() {
        if(this.e0()) {
            long v = this.d.f0();
            return v <= 0x7FFFFFFFL ? ((int)v) : 0x7FFFFFFF;
        }
        return 0;
    }

    @Override  // io.realm.RealmCollection
    public Number u1(String s) {
        this.a.k();
        long v = this.d(s);
        return this.d.g(p.e, v);
    }

    @Override  // io.realm.RealmCollection
    public Date v3(String s) {
        this.a.k();
        long v = this.d(s);
        return this.d.f(p.b, v);
    }

    @Override  // io.realm.RealmCollection
    public double x0(String s) {
        this.a.k();
        long v = this.d(s);
        return this.d.g(p.d, v).doubleValue();
    }

    @Override  // io.realm.RealmCollection
    public Number z4(String s) {
        this.a.k();
        long v = this.d(s);
        return this.d.g(p.b, v);
    }
}

