package io.realm;

import android.annotation.SuppressLint;
import io.reactivex.B;
import io.reactivex.l;
import io.realm.internal.OsResults;
import io.realm.internal.Table;
import io.realm.internal.UncheckedRow;
import io.realm.internal.Util;
import io.realm.internal.android.c;
import io.realm.internal.s;
import io.realm.internal.u;
import io.realm.log.RealmLog;
import java.util.Collection;
import java.util.Date;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Locale;
import java.util.UUID;
import o3.h;
import org.bson.types.Decimal128;
import org.bson.types.ObjectId;

public class g1 extends x0 {
    static class a {
        static final int[] a;

        static {
            int[] arr_v = new int[RealmFieldType.values().length];
            a.a = arr_v;
            try {
                arr_v[RealmFieldType.BOOLEAN.ordinal()] = 1;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                a.a[RealmFieldType.INTEGER.ordinal()] = 2;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                a.a[RealmFieldType.FLOAT.ordinal()] = 3;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                a.a[RealmFieldType.DOUBLE.ordinal()] = 4;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                a.a[RealmFieldType.DATE.ordinal()] = 5;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                a.a[RealmFieldType.DECIMAL128.ordinal()] = 6;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                a.a[RealmFieldType.OBJECT_ID.ordinal()] = 7;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                a.a[RealmFieldType.UUID.ordinal()] = 8;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                a.a[RealmFieldType.LIST.ordinal()] = 9;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                a.a[RealmFieldType.INTEGER_LIST.ordinal()] = 10;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                a.a[RealmFieldType.BOOLEAN_LIST.ordinal()] = 11;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                a.a[RealmFieldType.STRING_LIST.ordinal()] = 12;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                a.a[RealmFieldType.BINARY_LIST.ordinal()] = 13;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                a.a[RealmFieldType.DATE_LIST.ordinal()] = 14;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                a.a[RealmFieldType.DECIMAL128_LIST.ordinal()] = 15;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                a.a[RealmFieldType.OBJECT_ID_LIST.ordinal()] = 16;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                a.a[RealmFieldType.UUID_LIST.ordinal()] = 17;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                a.a[RealmFieldType.FLOAT_LIST.ordinal()] = 18;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                a.a[RealmFieldType.DOUBLE_LIST.ordinal()] = 19;
            }
            catch(NoSuchFieldError unused_ex) {
            }
        }
    }

    g1(io.realm.a a0, OsResults osResults0, Class class0) {
        this(a0, osResults0, class0, false);
    }

    g1(io.realm.a a0, OsResults osResults0, Class class0, boolean z) {
        super(a0, osResults0, class0, x0.c(z, a0, osResults0, class0, null));
    }

    g1(io.realm.a a0, OsResults osResults0, String s) {
        this(a0, osResults0, s, false);
    }

    g1(io.realm.a a0, OsResults osResults0, String s, boolean z) {
        super(a0, osResults0, s, x0.c(z, a0, osResults0, null, s));
    }

    public g1 A() {
        if(!this.s()) {
            throw new IllegalStateException("Only valid, managed RealmResults can be frozen.");
        }
        io.realm.a a0 = this.a.x();
        OsResults osResults0 = this.d.s(a0.e);
        return this.c == null ? new g1(a0, osResults0, this.b) : new g1(a0, osResults0, this.c);
    }

    @Override  // io.realm.x0
    public g1 A2(String s, r1 r10) {
        return super.A2(s, r10);
    }

    private Class B(T0 t00) {
        return t00.isEmpty() ? Long.class : t00.first().getClass();
    }

    private String C(String s) {
        if(this.a instanceof F0) {
            String s1 = this.d.u().C();
            String s2 = this.a.e0().k(s1).i(s);
            if(s2 == null) {
                throw new IllegalArgumentException(String.format("Field \'%s\' does not exists.", s));
            }
            return s2;
        }
        return s;
    }

    @Override  // io.realm.x0
    @h
    public Object C2(@h Object object0) {
        return super.C2(object0);
    }

    public void D() {
        this.q(null, false);
        this.d.C();
    }

    public void E(w0 w00) {
        this.q(w00, true);
        this.d.D(this, w00);
    }

    public void F(P0 p00) {
        this.q(p00, true);
        this.d.E(this, p00);
    }

    public void G(String s, @h byte[] arr_b) {
        this.r(s);
        this.a.n();
        String s1 = this.C(s);
        this.v(s1, RealmFieldType.BINARY);
        this.d.F(s1, arr_b);
    }

    public void H(String s, boolean z) {
        this.r(s);
        this.a.n();
        String s1 = this.C(s);
        this.v(s1, RealmFieldType.BOOLEAN);
        this.d.G(s1, z);
    }

    public void I(String s, byte b) {
        this.r(s);
        this.a.n();
        String s1 = this.C(s);
        this.v(s1, RealmFieldType.INTEGER);
        this.d.S(s1, ((long)b));
    }

    @Override  // io.realm.x0
    @h
    public Object I4(@h Object object0) {
        return super.I4(object0);
    }

    public void J(String s, @h Date date0) {
        this.r(s);
        this.a.n();
        String s1 = this.C(s);
        this.v(s1, RealmFieldType.DATE);
        this.d.K(s1, date0);
    }

    public void K(String s, @h Decimal128 decimal1280) {
        this.r(s);
        this.a.n();
        String s1 = this.C(s);
        this.v(s1, RealmFieldType.DECIMAL128);
        this.d.M(s1, decimal1280);
    }

    @Override  // io.realm.x0
    public boolean L() {
        return super.L();
    }

    @Override  // io.realm.x0
    public boolean L0() {
        return super.L0();
    }

    public void M(String s, double f) {
        this.r(s);
        this.a.n();
        String s1 = this.C(s);
        this.v(s1, RealmFieldType.DOUBLE);
        this.d.O(s1, f);
    }

    @Override  // io.realm.internal.j
    public boolean M3() {
        return this.a != null && this.a.x0();
    }

    public void N(String s, float f) {
        this.r(s);
        this.a.n();
        String s1 = this.C(s);
        this.v(s1, RealmFieldType.FLOAT);
        this.d.Q(s1, f);
    }

    @Override  // io.realm.x0
    public g1 N4(String s, r1 r10, String s1, r1 r11) {
        return this.e2(new String[]{s, s1}, new r1[]{r10, r11});
    }

    public void O(String s, int v) {
        this.r(s);
        String s1 = this.C(s);
        this.v(s1, RealmFieldType.INTEGER);
        this.a.n();
        this.d.S(s1, ((long)v));
    }

    public void P(String s, T0 t00) {
        this.r(s);
        String s1 = this.C(s);
        this.a.n();
        if(t00 != null) {
            RealmFieldType realmFieldType0 = this.a.e0().n(this.d.u().C()).t(s1);
            switch(realmFieldType0) {
                case 9: {
                    this.x(t00, X0.class);
                    this.u(s1, ((X0)t00.C2(null)));
                    this.d.V(s1, t00);
                    return;
                }
                case 10: {
                    Class class0 = this.B(t00);
                    if(class0.equals(Integer.class)) {
                        this.d.T(s1, t00);
                        return;
                    }
                    if(class0.equals(Long.class)) {
                        this.d.U(s1, t00);
                        return;
                    }
                    if(class0.equals(Short.class)) {
                        this.d.a0(s1, t00);
                        return;
                    }
                    if(!class0.equals(Byte.class)) {
                        throw new IllegalArgumentException(String.format("List contained the wrong type of elements. Elements that can be mapped to Integers was expected, but the actual type is \'%s\'", class0));
                    }
                    this.d.J(s1, t00);
                    return;
                }
                case 11: {
                    this.x(t00, Boolean.class);
                    this.d.H(s1, t00);
                    return;
                }
                case 12: {
                    this.x(t00, String.class);
                    this.d.c0(s1, t00);
                    return;
                }
                case 13: {
                    this.x(t00, byte[].class);
                    this.d.I(s1, t00);
                    return;
                }
                case 14: {
                    this.x(t00, Date.class);
                    this.d.L(s1, t00);
                    return;
                }
                case 15: {
                    this.x(t00, Decimal128.class);
                    this.d.N(s1, t00);
                    return;
                }
                case 16: {
                    this.x(t00, ObjectId.class);
                    this.d.Z(s1, t00);
                    return;
                }
                case 17: {
                    this.x(t00, UUID.class);
                    this.d.e0(s1, t00);
                    return;
                }
                case 18: {
                    this.x(t00, Float.class);
                    this.d.R(s1, t00);
                    return;
                }
                case 19: {
                    this.x(t00, Double.class);
                    this.d.P(s1, t00);
                    return;
                }
                default: {
                    throw new IllegalArgumentException(String.format("Field \'%s\' is not a list but a %s", s1, realmFieldType0));
                }
            }
        }
        throw new IllegalArgumentException("Non-null \'list\' required");
    }

    public void Q(String s, long v) {
        this.r(s);
        this.a.n();
        String s1 = this.C(s);
        this.v(s1, RealmFieldType.INTEGER);
        this.d.S(s1, v);
    }

    public void R(String s) {
        this.r(s);
        this.a.n();
        this.d.W(s);
    }

    public void S(String s, @h X0 x00) {
        this.r(s);
        this.a.n();
        String s1 = this.C(s);
        this.v(s1, RealmFieldType.OBJECT);
        u u0 = this.u(s1, x00);
        this.d.X(s1, u0);
    }

    public void T(String s, @h ObjectId objectId0) {
        this.r(s);
        this.a.n();
        String s1 = this.C(s);
        this.v(s1, RealmFieldType.OBJECT_ID);
        this.d.Y(s1, objectId0);
    }

    @Override  // io.realm.x0
    public void T3(int v) {
        super.T3(v);
    }

    public void U(String s, short v) {
        this.r(s);
        this.a.n();
        String s1 = this.C(s);
        this.v(s1, RealmFieldType.INTEGER);
        this.d.S(s1, ((long)v));
    }

    public void V(String s, @h String s1) {
        this.r(s);
        this.a.n();
        String s2 = this.C(s);
        this.v(s2, RealmFieldType.STRING);
        this.d.b0(s2, s1);
    }

    public void W(String s, @h UUID uUID0) {
        this.r(s);
        this.a.n();
        String s1 = this.C(s);
        this.v(s1, RealmFieldType.UUID);
        this.d.d0(s1, uUID0);
    }

    public void X(String s, @h Object object0) {
        this.r(s);
        this.a.n();
        String s1 = this.C(s);
        String s2 = object0 instanceof String ? ((String)object0) : null;
        String s3 = this.d.u().C();
        f1 f10 = this.h().e0().h(s3);
        if(!f10.x(s1)) {
            throw new IllegalArgumentException(String.format("Field \'%s\' could not be found in class \'%s\'", s1, s3));
        }
        if(object0 == null) {
            this.d.W(s1);
            return;
        }
        RealmFieldType realmFieldType0 = f10.t(s1);
        if(object0 instanceof String && realmFieldType0 != RealmFieldType.STRING) {
            switch(realmFieldType0) {
                case 1: {
                    object0 = Boolean.valueOf(Boolean.parseBoolean(s2));
                    break;
                }
                case 2: {
                    object0 = Long.parseLong(s2);
                    break;
                }
                case 3: {
                    object0 = Float.parseFloat(s2);
                    break;
                }
                case 4: {
                    object0 = Double.parseDouble(s2);
                    break;
                }
                case 5: {
                    object0 = c.b(s2);
                    break;
                }
                case 6: {
                    object0 = Decimal128.r(s2);
                    break;
                }
                case 7: {
                    object0 = new ObjectId(s2);
                    break;
                }
                case 8: {
                    object0 = UUID.fromString(s2);
                    break;
                }
                default: {
                    throw new IllegalArgumentException(String.format(Locale.US, "Field %s is not a String field, and the provide value could not be automatically converted: %s. Use a typedsetter instead", s1, object0));
                }
            }
        }
        Class class0 = object0.getClass();
        if(class0 == Boolean.class) {
            this.H(s1, ((Boolean)object0).booleanValue());
            return;
        }
        if(class0 == Short.class) {
            this.U(s1, ((short)(((Short)object0))));
            return;
        }
        if(class0 == Integer.class) {
            this.O(s1, ((int)(((Integer)object0))));
            return;
        }
        if(class0 == Long.class) {
            this.Q(s1, ((long)(((Long)object0))));
            return;
        }
        if(class0 == Byte.class) {
            this.I(s1, ((byte)(((Byte)object0))));
            return;
        }
        if(class0 == Float.class) {
            this.N(s1, ((float)(((Float)object0))));
            return;
        }
        if(class0 == Double.class) {
            this.M(s1, ((double)(((Double)object0))));
            return;
        }
        if(class0 == String.class) {
            this.V(s1, ((String)object0));
            return;
        }
        if(object0 instanceof Date) {
            this.J(s1, ((Date)object0));
            return;
        }
        if(object0 instanceof Decimal128) {
            this.K(s1, ((Decimal128)object0));
            return;
        }
        if(object0 instanceof ObjectId) {
            this.T(s1, ((ObjectId)object0));
            return;
        }
        if(object0 instanceof UUID) {
            this.W(s1, ((UUID)object0));
            return;
        }
        if(object0 instanceof byte[]) {
            this.G(s1, ((byte[])object0));
            return;
        }
        if(object0 instanceof X0) {
            this.S(s1, ((X0)object0));
            return;
        }
        if(class0 != T0.class) {
            throw new IllegalArgumentException("Value is of a type not supported: " + object0.getClass());
        }
        this.P(s1, ((T0)object0));
    }

    @Override  // io.realm.x0
    @Deprecated
    public void add(int v, Object object0) {
        super.add(v, object0);
    }

    @Override  // io.realm.x0
    @Deprecated
    public boolean add(Object object0) {
        return super.add(object0);
    }

    @Override  // io.realm.x0
    @Deprecated
    public boolean addAll(int v, Collection collection0) {
        return super.addAll(v, collection0);
    }

    @Override  // io.realm.x0
    @Deprecated
    public boolean addAll(Collection collection0) {
        return super.addAll(collection0);
    }

    @Override  // io.realm.x0
    public boolean c1() {
        return super.c1();
    }

    @Override  // io.realm.x0
    @Deprecated
    public void clear() {
        super.clear();
    }

    @Override  // io.realm.x0
    public boolean contains(@h Object object0) {
        return super.contains(object0);
    }

    @Override  // io.realm.x0
    public boolean d1() {
        return super.d1();
    }

    @Override  // io.realm.RealmCollection
    public boolean e0() {
        this.a.k();
        return this.d.y();
    }

    @Override  // io.realm.x0
    public g1 e2(String[] arr_s, r1[] arr_r1) {
        return super.e2(arr_s, arr_r1);
    }

    @Override  // io.realm.x0
    @h
    public Object first() {
        return super.first();
    }

    @Override  // io.realm.internal.f
    public Object freeze() {
        return this.A();
    }

    @Override  // io.realm.x0
    @h
    public Object get(int v) {
        return super.get(v);
    }

    @Override  // io.realm.x0
    public F0 h() {
        return super.h();
    }

    @Override  // io.realm.x0
    public y0 i2() {
        return super.i2();
    }

    @Override  // io.realm.x0
    public Iterator iterator() {
        return super.iterator();
    }

    public void k(w0 w00) {
        this.p(w00);
        this.d.c(this, w00);
    }

    @Override  // io.realm.x0
    public Number k4(String s) {
        return super.k4(s);
    }

    public void l(P0 p00) {
        this.p(p00);
        this.d.d(this, p00);
    }

    @Override  // io.realm.x0
    @h
    public Object last() {
        return super.last();
    }

    @Override  // io.realm.x0
    public ListIterator listIterator() {
        return super.listIterator();
    }

    @Override  // io.realm.x0
    public ListIterator listIterator(int v) {
        return super.listIterator(v);
    }

    public B m() {
        io.realm.a a0 = this.a;
        if(a0 instanceof F0) {
            return a0.c.r().o(((F0)this.a), this);
        }
        if(!(a0 instanceof E)) {
            throw new UnsupportedOperationException(this.a.getClass() + " does not support RxJava2.");
        }
        return a0.c.r().n(((E)a0), this);
    }

    public l n() {
        io.realm.a a0 = this.a;
        if(a0 instanceof F0) {
            return a0.c.r().g(((F0)this.a), this);
        }
        if(!(a0 instanceof E)) {
            throw new UnsupportedOperationException(this.a.getClass() + " does not support RxJava2.");
        }
        return a0.c.r().b(((E)a0), this);
    }

    public String o() {
        return this.d.j0(-1);
    }

    private void p(@h Object object0) {
        if(object0 == null) {
            throw new IllegalArgumentException("Listener should not be null");
        }
        this.a.k();
        this.a.e.capabilities.c("Listeners cannot be used on current thread.");
    }

    @Override  // io.realm.x0
    public g1 p3(String s) {
        return super.p3(s);
    }

    private void q(@h Object object0, boolean z) {
        if(z && object0 == null) {
            throw new IllegalArgumentException("Listener should not be null");
        }
        if(this.a.isClosed()) {
            RealmLog.w("Calling removeChangeListener on a closed Realm %s, make sure to close all listeners before closing the Realm.", new Object[]{this.a.c.n()});
        }
    }

    @Override  // io.realm.x0
    @h
    public Date q4(String s) {
        return super.q4(s);
    }

    private void r(String s) {
        if(Util.l(s)) {
            throw new IllegalArgumentException("Non-empty \'fieldname\' required.");
        }
    }

    @Override  // io.realm.x0
    @Deprecated
    public Object remove(int v) {
        return super.remove(v);
    }

    @Override  // io.realm.x0
    @Deprecated
    public boolean remove(Object object0) {
        return super.remove(object0);
    }

    @Override  // io.realm.x0
    @Deprecated
    public boolean removeAll(Collection collection0) {
        return super.removeAll(collection0);
    }

    @Override  // io.realm.x0
    @Deprecated
    public boolean retainAll(Collection collection0) {
        return super.retainAll(collection0);
    }

    @Override  // io.realm.x0
    public boolean s() {
        return super.s();
    }

    @Override  // io.realm.x0
    @Deprecated
    public Object set(int v, Object object0) {
        return super.set(v, object0);
    }

    @Override  // io.realm.x0
    public int size() {
        return super.size();
    }

    private void t(@h Object object0) {
        if(object0 == null) {
            throw new IllegalArgumentException("Non-null \'value\' required. Use \'setNull(fieldName)\' instead.");
        }
    }

    private u u(String s, @h X0 x00) {
        if(x00 != null) {
            if(!d1.H5(x00) || !d1.I5(x00)) {
                throw new IllegalArgumentException("\'value\' is not a valid, managed Realm object.");
            }
            A0 a00 = ((s)x00).R3();
            if(!a00.f().getPath().equals(this.a.getPath())) {
                throw new IllegalArgumentException("\'value\' does not belong to the same Realm as the RealmResults.");
            }
            Table table0 = this.d.u();
            Table table1 = table0.N(table0.F(s));
            Table table2 = a00.g().b();
            if(!table1.W(table2)) {
                throw new IllegalArgumentException(String.format(Locale.US, "Type of object is wrong. Was \'%s\', expected \'%s\'", table2.C(), table1.C()));
            }
            return a00.g();
        }
        return null;
    }

    @Override  // io.realm.x0
    public Number u1(String s) {
        return super.u1(s);
    }

    private void v(String s, RealmFieldType realmFieldType0) {
        String s1 = this.d.u().C();
        RealmFieldType realmFieldType1 = this.a.e0().h(s1).t(s);
        if(realmFieldType1 != realmFieldType0) {
            throw new IllegalArgumentException(String.format("The field \'%s.%s\' is not of the expected type. Actual: %s, Expected: %s", s1, s, realmFieldType1, realmFieldType0));
        }
    }

    @Override  // io.realm.x0
    public Date v3(String s) {
        return super.v3(s);
    }

    @Override  // io.realm.RealmCollection
    public boolean w() {
        this.a.k();
        this.d.B();
        return true;
    }

    private void x(T0 t00, Class class0) {
        if(!t00.isEmpty()) {
            Class class1 = t00.first().getClass();
            if(!class0.isAssignableFrom(class1)) {
                throw new IllegalArgumentException(String.format("List contained the wrong type of elements. Elements of type \'%s\' was expected, but the actual type is \'%s\'", class0, class1));
            }
        }
    }

    @Override  // io.realm.x0
    public double x0(String s) {
        return super.x0(s);
    }

    @Override  // io.realm.RealmCollection
    public RealmQuery x4() {
        this.a.k();
        return RealmQuery.R(this);
    }

    @SuppressLint({"unused"})
    static g1 y(io.realm.a a0, u u0, Class class0, String s) {
        Table table0 = a0.e0().o(class0);
        return new g1(a0, OsResults.j(a0.e, ((UncheckedRow)u0), table0, s), class0);
    }

    static g1 z(E e0, UncheckedRow uncheckedRow0, Table table0, String s) {
        String s1 = Table.D(table0.P());
        return new g1(e0, OsResults.j(e0.e, uncheckedRow0, table0, s), s1);
    }

    @Override  // io.realm.x0
    public Number z4(String s) {
        return super.z4(s);
    }
}

