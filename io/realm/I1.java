package io.realm;

import io.realm.internal.OsSet;
import io.realm.internal.j;
import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.UUID;
import o3.h;
import org.bson.types.Decimal128;
import org.bson.types.ObjectId;

public class i1 implements RealmCollection, j, Set {
    static class a {
    }

    static class b extends c {
        private final n1 a;
        private Class b;

        b(n1 n10, Class class0) {
            super(null);
            this.a = n10;
            this.b = class0;
        }

        @Override  // io.realm.internal.j, io.realm.RealmCollection
        public boolean L() {
            return true;
        }

        @Override  // io.realm.RealmCollection
        public boolean L0() {
            this.a.a.k();
            if(!this.a.s()) {
                this.a.k();
                return true;
            }
            return false;
        }

        @Override  // io.realm.internal.j
        public boolean M3() {
            return this.a.t();
        }

        @Override  // io.realm.i1$c
        void a(i1 i10, P0 p00) {
            this.a.d(i10, p00);
        }

        @Override
        public boolean add(@h Object object0) {
            return this.a.a(object0);
        }

        @Override
        public boolean addAll(Collection collection0) {
            this.n(collection0);
            return this.a.b(collection0);
        }

        @Override  // io.realm.i1$c
        void b(i1 i10, k1 k10) {
            this.a.e(i10, k10);
        }

        @Override  // io.realm.i1$c
        public i1 c() {
            return this.a.l();
        }

        @Override
        public void clear() {
            this.a.f();
        }

        @Override  // io.realm.RealmCollection
        public boolean contains(@h Object object0) {
            return this.a.g(object0);
        }

        @Override
        public boolean containsAll(Collection collection0) {
            this.n(collection0);
            return this.a.h(collection0);
        }

        @Override  // io.realm.i1$c
        OsSet d() {
            return this.a.n();
        }

        @Override  // io.realm.RealmCollection
        public boolean e0() {
            return true;
        }

        @Override  // io.realm.i1$c
        public Object freeze() {
            return this.c();
        }

        @Override  // io.realm.i1$c
        public Class g() {
            return this.a.o();
        }

        @Override  // io.realm.i1$c
        public String h() {
            return this.a.p();
        }

        @Override  // io.realm.i1$c
        boolean i() {
            return this.a.q();
        }

        @Override
        public boolean isEmpty() {
            return this.a.s();
        }

        @Override
        public Iterator iterator() {
            return this.a.y();
        }

        @Override  // io.realm.i1$c
        void j() {
            this.a.C();
        }

        @Override  // io.realm.i1$c
        void k(i1 i10, P0 p00) {
            this.a.E(i10, p00);
        }

        @Override  // io.realm.RealmCollection
        @h
        public Number k4(String s) {
            return this.x4().G1(s);
        }

        @Override  // io.realm.i1$c
        void l(i1 i10, k1 k10) {
            this.a.F(i10, k10);
        }

        private void m(Object[] arr_object) {
            if(arr_object == null) {
                throw new NullPointerException("Cannot pass a null array when calling \'toArray\'.");
            }
            String s = this.b.getSimpleName();
            String s1 = arr_object.getClass().getComponentType().getSimpleName();
            if(!s.equals(s1)) {
                throw new ArrayStoreException("Array type must be of type \'" + s + "\' but it was of type \'" + s1 + "\'.");
            }
        }

        private void n(Collection collection0) {
            if(collection0 == null) {
                throw new NullPointerException("Collection must not be null.");
            }
        }

        @Override  // io.realm.RealmCollection
        @h
        public Date q4(String s) {
            return this.x4().I1(s);
        }

        @Override
        public boolean remove(@h Object object0) {
            return this.a.A(object0);
        }

        @Override
        public boolean removeAll(Collection collection0) {
            this.n(collection0);
            return this.a.B(collection0);
        }

        @Override
        public boolean retainAll(Collection collection0) {
            this.n(collection0);
            return this.a.H(collection0);
        }

        @Override  // io.realm.internal.j, io.realm.RealmCollection
        public boolean s() {
            return this.a.x();
        }

        @Override
        public int size() {
            return this.a.J();
        }

        @Override
        public Object[] toArray() {
            Object[] arr_object = new Object[this.size()];
            int v = 0;
            for(Object object0: this) {
                arr_object[v] = object0;
                ++v;
            }
            return arr_object;
        }

        @Override
        public Object[] toArray(Object[] arr_object) {
            this.m(arr_object);
            long v = (long)this.size();
            Object[] arr_object1 = ((long)arr_object.length) == v || ((long)arr_object.length) > v ? arr_object : ((Object[])Array.newInstance(this.b, ((int)v)));
            int v1 = 0;
            for(Object object0: this) {
                arr_object1[v1] = object0 == null ? null : object0;
                ++v1;
            }
            if(((long)arr_object.length) > v) {
                arr_object1[v1] = null;
            }
            return arr_object1;
        }

        @Override  // io.realm.RealmCollection
        public Number u1(String s) {
            return this.x4().j2(s);
        }

        @Override  // io.realm.RealmCollection
        @h
        public Date v3(String s) {
            return this.x4().L1(s);
        }

        @Override  // io.realm.RealmCollection
        public boolean w() {
            return true;
        }

        @Override  // io.realm.RealmCollection
        public double x0(String s) {
            return this.x4().d(s);
        }

        @Override  // io.realm.RealmCollection
        public RealmQuery x4() {
            return this.a.K();
        }

        @Override  // io.realm.RealmCollection
        @h
        public Number z4(String s) {
            return this.x4().J1(s);
        }
    }

    static abstract class c implements RealmCollection, j, Set {
        private c() {
        }

        c(a i1$a0) {
        }

        abstract void a(i1 arg1, P0 arg2);

        abstract void b(i1 arg1, k1 arg2);

        public abstract i1 c();

        abstract OsSet d();

        @Override  // io.realm.internal.f
        public Object freeze() {
            return this.c();
        }

        abstract Class g();

        abstract String h();

        abstract boolean i();

        abstract void j();

        abstract void k(i1 arg1, P0 arg2);

        abstract void l(i1 arg1, k1 arg2);
    }

    static class d extends c {
        private final Set a;
        private static final String b = "This method is only available in managed mode.";

        d() {
            super(null);
            this.a = new HashSet();
        }

        d(Collection collection0) {
            this.a.addAll(collection0);
        }

        @Override  // io.realm.internal.j, io.realm.RealmCollection
        public boolean L() {
            return false;
        }

        @Override  // io.realm.RealmCollection
        public boolean L0() {
            throw new UnsupportedOperationException("This method is only available in managed mode.");
        }

        @Override  // io.realm.internal.j
        public boolean M3() {
            return false;
        }

        @Override  // io.realm.i1$c
        void a(i1 i10, P0 p00) {
            throw new UnsupportedOperationException("Unmanaged RealmSets do not support change listeners.");
        }

        @Override
        public boolean add(@h Object object0) {
            return this.a.add(object0);
        }

        @Override
        public boolean addAll(Collection collection0) {
            return this.a.addAll(collection0);
        }

        @Override  // io.realm.i1$c
        void b(i1 i10, k1 k10) {
            throw new UnsupportedOperationException("Unmanaged RealmSets do not support change listeners.");
        }

        @Override  // io.realm.i1$c
        public i1 c() {
            throw new UnsupportedOperationException("Unmanaged RealmSets cannot be frozen.");
        }

        @Override
        public void clear() {
            this.a.clear();
        }

        @Override  // io.realm.RealmCollection
        public boolean contains(@h Object object0) {
            return this.a.contains(object0);
        }

        @Override
        public boolean containsAll(Collection collection0) {
            return this.a.containsAll(collection0);
        }

        @Override  // io.realm.i1$c
        OsSet d() {
            throw new UnsupportedOperationException("Unmanaged RealmSets do not have a representation in native code.");
        }

        @Override  // io.realm.RealmCollection
        public boolean e0() {
            return true;
        }

        @Override  // io.realm.i1$c
        public Object freeze() {
            return this.c();
        }

        @Override  // io.realm.i1$c
        public Class g() {
            throw new UnsupportedOperationException("Unmanaged sets do not support retrieving the value class.");
        }

        @Override  // io.realm.i1$c
        public String h() {
            throw new UnsupportedOperationException("Unmanaged sets do not support retrieving the value class name.");
        }

        @Override  // io.realm.i1$c
        boolean i() {
            return false;
        }

        @Override
        public boolean isEmpty() {
            return this.a.isEmpty();
        }

        @Override
        public Iterator iterator() {
            return this.a.iterator();
        }

        @Override  // io.realm.i1$c
        void j() {
            throw new UnsupportedOperationException("Cannot remove change listeners because unmanaged RealmSets do not support change listeners.");
        }

        @Override  // io.realm.i1$c
        void k(i1 i10, P0 p00) {
            throw new UnsupportedOperationException("Cannot remove change listener because unmanaged RealmSets do not support change listeners.");
        }

        @Override  // io.realm.RealmCollection
        @h
        public Number k4(String s) {
            throw new UnsupportedOperationException("This method is only available in managed mode.");
        }

        @Override  // io.realm.i1$c
        void l(i1 i10, k1 k10) {
            throw new UnsupportedOperationException("Cannot remove change listener because unmanaged RealmSets do not support change listeners.");
        }

        @Override  // io.realm.RealmCollection
        @h
        public Date q4(String s) {
            throw new UnsupportedOperationException("This method is only available in managed mode.");
        }

        @Override
        public boolean remove(@h Object object0) {
            return this.a.remove(object0);
        }

        @Override
        public boolean removeAll(Collection collection0) {
            return this.a.removeAll(collection0);
        }

        @Override
        public boolean retainAll(Collection collection0) {
            return this.a.retainAll(collection0);
        }

        @Override  // io.realm.internal.j, io.realm.RealmCollection
        public boolean s() {
            return true;
        }

        @Override
        public int size() {
            return this.a.size();
        }

        @Override
        public Object[] toArray() {
            return this.a.toArray();
        }

        @Override
        public Object[] toArray(Object[] arr_object) {
            return this.a.toArray(arr_object);
        }

        @Override  // io.realm.RealmCollection
        public Number u1(String s) {
            throw new UnsupportedOperationException("This method is only available in managed mode.");
        }

        @Override  // io.realm.RealmCollection
        @h
        public Date v3(String s) {
            throw new UnsupportedOperationException("This method is only available in managed mode.");
        }

        @Override  // io.realm.RealmCollection
        public boolean w() {
            return true;
        }

        @Override  // io.realm.RealmCollection
        public double x0(String s) {
            throw new UnsupportedOperationException("This method is only available in managed mode.");
        }

        @Override  // io.realm.RealmCollection
        public RealmQuery x4() {
            throw new UnsupportedOperationException("This method is only available in managed mode.");
        }

        @Override  // io.realm.RealmCollection
        @h
        public Number z4(String s) {
            throw new UnsupportedOperationException("This method is only available in managed mode.");
        }
    }

    protected final c a;

    public i1() {
        this.a = new d();
    }

    public i1(io.realm.a a0, OsSet osSet0, Class class0) {
        this.a = i1.g(a0, osSet0, class0);
    }

    public i1(io.realm.a a0, OsSet osSet0, String s) {
        this.a = i1.h(a0, osSet0, s);
    }

    public i1(Collection collection0) {
        this.a = new d(collection0);
    }

    @Override  // io.realm.internal.j, io.realm.RealmCollection
    public boolean L() {
        return this.a.L();
    }

    @Override  // io.realm.RealmCollection
    public boolean L0() {
        return this.a.L0();
    }

    @Override  // io.realm.internal.j
    public boolean M3() {
        return this.a.M3();
    }

    public void a(P0 p00) {
        this.a.a(this, p00);
    }

    @Override
    public boolean add(@h Object object0) {
        return this.a.add(object0);
    }

    @Override
    public boolean addAll(Collection collection0) {
        return this.a.addAll(collection0);
    }

    public void b(k1 k10) {
        this.a.b(this, k10);
    }

    public i1 c() {
        return this.a.c();
    }

    @Override
    public void clear() {
        this.a.clear();
    }

    @Override  // io.realm.RealmCollection
    public boolean contains(@h Object object0) {
        return this.a.contains(object0);
    }

    @Override
    public boolean containsAll(Collection collection0) {
        return this.a.containsAll(collection0);
    }

    OsSet d() {
        return this.a.d();
    }

    @Override  // io.realm.RealmCollection
    public boolean e0() {
        return true;
    }

    @Override  // io.realm.internal.f
    public Object freeze() {
        return this.c();
    }

    private static b g(io.realm.a a0, OsSet osSet0, Class class0) {
        if(p.e(class0)) {
            return new b(new b1(a0, osSet0, class0), class0);
        }
        Class class1 = Boolean.class;
        if(class0 == class1) {
            return new b(new io.realm.h(a0, osSet0, class1), class0);
        }
        Class class2 = String.class;
        if(class0 == class2) {
            return new b(new u1(a0, osSet0, class2), class0);
        }
        Class class3 = Integer.class;
        if(class0 == class3) {
            return new b(new X(a0, osSet0, class3), class0);
        }
        Class class4 = Long.class;
        if(class0 == class4) {
            return new b(new d0(a0, osSet0, class4), class0);
        }
        Class class5 = Short.class;
        if(class0 == class5) {
            return new b(new o1(a0, osSet0, class5), class0);
        }
        Class class6 = Byte.class;
        if(class0 == class6) {
            return new b(new l(a0, osSet0, class6), class0);
        }
        Class class7 = Float.class;
        if(class0 == class7) {
            return new b(new N(a0, osSet0, class7), class0);
        }
        Class class8 = Double.class;
        if(class0 == class8) {
            return new b(new B(a0, osSet0, class8), class0);
        }
        Class class9 = byte[].class;
        if(class0 == class9) {
            return new b(new io.realm.d(a0, osSet0, class9), class0);
        }
        Class class10 = Date.class;
        if(class0 == class10) {
            return new b(new r(a0, osSet0, class10), class0);
        }
        Class class11 = Decimal128.class;
        if(class0 == class11) {
            return new b(new v(a0, osSet0, class11), class0);
        }
        Class class12 = ObjectId.class;
        if(class0 == class12) {
            return new b(new s0(a0, osSet0, class12), class0);
        }
        Class class13 = UUID.class;
        if(class0 == class13) {
            return new b(new z1(a0, osSet0, class13), class0);
        }
        Class class14 = G0.class;
        if(class0 == class14) {
            return new b(new L0(a0, osSet0, class14), class0);
        }
        Class class15 = Number.class;
        if(class0 != class15) {
            throw new UnsupportedOperationException("getStrategy: missing class \'" + class0.getSimpleName() + "\'");
        }
        return new b(new p0(a0, osSet0, class15), class0);
    }

    private static b h(io.realm.a a0, OsSet osSet0, String s) {
        io.realm.h h0;
        Class class0 = Boolean.class;
        if(s.equals("java.lang.Boolean")) {
            h0 = new io.realm.h(a0, osSet0, class0);
            return new b(h0, h0.o());
        }
        Class class1 = String.class;
        if(s.equals("java.lang.String")) {
            h0 = new u1(a0, osSet0, class1);
            return new b(h0, h0.o());
        }
        Class class2 = Integer.class;
        if(s.equals("java.lang.Integer")) {
            h0 = new X(a0, osSet0, class2);
            return new b(h0, h0.o());
        }
        Class class3 = Long.class;
        if(s.equals("java.lang.Long")) {
            h0 = new d0(a0, osSet0, class3);
            return new b(h0, h0.o());
        }
        Class class4 = Short.class;
        if(s.equals("java.lang.Short")) {
            h0 = new o1(a0, osSet0, class4);
            return new b(h0, h0.o());
        }
        Class class5 = Byte.class;
        if(s.equals("java.lang.Byte")) {
            h0 = new l(a0, osSet0, class5);
            return new b(h0, h0.o());
        }
        Class class6 = Float.class;
        if(s.equals("java.lang.Float")) {
            h0 = new N(a0, osSet0, class6);
            return new b(h0, h0.o());
        }
        Class class7 = Double.class;
        if(s.equals("java.lang.Double")) {
            h0 = new B(a0, osSet0, class7);
            return new b(h0, h0.o());
        }
        Class class8 = byte[].class;
        if(s.equals("byte[]")) {
            h0 = new io.realm.d(a0, osSet0, class8);
            return new b(h0, h0.o());
        }
        Class class9 = Date.class;
        if(s.equals("java.util.Date")) {
            h0 = new r(a0, osSet0, class9);
            return new b(h0, h0.o());
        }
        Class class10 = Decimal128.class;
        if(s.equals(class10.getCanonicalName())) {
            h0 = new v(a0, osSet0, class10);
            return new b(h0, h0.o());
        }
        Class class11 = ObjectId.class;
        if(s.equals(class11.getCanonicalName())) {
            h0 = new s0(a0, osSet0, class11);
            return new b(h0, h0.o());
        }
        Class class12 = UUID.class;
        if(s.equals("java.util.UUID")) {
            h0 = new z1(a0, osSet0, class12);
            return new b(h0, h0.o());
        }
        Class class13 = G0.class;
        if(s.equals(class13.getCanonicalName())) {
            h0 = new L0(a0, osSet0, class13);
            return new b(h0, h0.o());
        }
        h0 = new J(a0, osSet0, s);
        return new b(h0, h0.o());
    }

    public Class i() {
        return this.a.g();
    }

    @Override
    public boolean isEmpty() {
        return this.a.isEmpty();
    }

    @Override
    public Iterator iterator() {
        return this.a.iterator();
    }

    public String j() {
        return this.a.h();
    }

    boolean k() {
        return this.a.i();
    }

    @Override  // io.realm.RealmCollection
    @h
    public Number k4(String s) {
        return this.a.k4(s);
    }

    public void l() {
        this.a.j();
    }

    public void m(P0 p00) {
        this.a.k(this, p00);
    }

    public void n(k1 k10) {
        this.a.l(this, k10);
    }

    @Override  // io.realm.RealmCollection
    @h
    public Date q4(String s) {
        return this.a.q4(s);
    }

    @Override
    public boolean remove(@h Object object0) {
        return this.a.remove(object0);
    }

    @Override
    public boolean removeAll(Collection collection0) {
        return this.a.removeAll(collection0);
    }

    @Override
    public boolean retainAll(Collection collection0) {
        return this.a.retainAll(collection0);
    }

    @Override  // io.realm.internal.j, io.realm.RealmCollection
    public boolean s() {
        return this.a.s();
    }

    @Override
    public int size() {
        return this.a.size();
    }

    @Override
    public Object[] toArray() {
        return this.a.toArray();
    }

    @Override
    public Object[] toArray(Object[] arr_object) {
        return this.a.toArray(arr_object);
    }

    @Override  // io.realm.RealmCollection
    public Number u1(String s) {
        return this.a.u1(s);
    }

    @Override  // io.realm.RealmCollection
    @h
    public Date v3(String s) {
        return this.a.v3(s);
    }

    @Override  // io.realm.RealmCollection
    public boolean w() {
        return true;
    }

    @Override  // io.realm.RealmCollection
    public double x0(String s) {
        return this.a.x0(s);
    }

    @Override  // io.realm.RealmCollection
    public RealmQuery x4() {
        return this.a.x4();
    }

    @Override  // io.realm.RealmCollection
    @h
    public Number z4(String s) {
        return this.a.z4(s);
    }
}

