package io.realm.internal;

import io.realm.P0;
import io.realm.T0;
import io.realm.internal.objectstore.OsKeyPathMapping;
import io.realm.internal.objectstore.OsObjectBuilder;
import io.realm.r1;
import io.realm.w0;
import java.util.Collections;
import java.util.ConcurrentModificationException;
import java.util.Date;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import java.util.UUID;
import jeb.synthetic.TWR;
import o3.h;
import org.bson.types.Decimal128;
import org.bson.types.ObjectId;

public class OsResults implements ObservableCollection, l {
    interface o {
        void a(OsObjectBuilder arg1, T0 arg2);
    }

    public static enum p {
        MINIMUM(1),
        MAXIMUM(2),
        AVERAGE(3),
        SUM(4);

        private final byte a;

        private p(byte b) {
            this.a = b;
        }

        public byte a() {
            return this.a;
        }
    }

    public static abstract class q implements Iterator {
        protected OsResults a;
        protected int b;

        public q(OsResults osResults0) {
            this.b = -1;
            if(osResults0.b.isClosed()) {
                throw new IllegalStateException("This Realm instance has already been closed, making it unusable.");
            }
            this.a = osResults0;
            if(osResults0.f) {
                return;
            }
            if(osResults0.b.isInTransaction()) {
                this.c();
                return;
            }
            this.a.b.addIterator(this);
        }

        void a() {
            if(this.a == null) {
                throw new ConcurrentModificationException("No outside changes to a Realm is allowed while iterating a living Realm collection.");
            }
        }

        protected abstract Object b(UncheckedRow arg1);

        void c() {
            this.a = this.a.m();
        }

        @h
        Object d(int v) {
            return this.e(v, this.a);
        }

        protected abstract Object e(int arg1, OsResults arg2);

        void f() {
            this.a = null;
        }

        @Override
        public boolean hasNext() {
            this.a();
            return ((long)(this.b + 1)) < this.a.f0();
        }

        @Override
        @h
        public Object next() {
            this.a();
            int v = this.b + 1;
            this.b = v;
            if(((long)v) >= this.a.f0()) {
                throw new NoSuchElementException("Cannot access index " + this.b + " when size is " + this.a.f0() + ". Remember to check hasNext() before using next().");
            }
            return this.d(this.b);
        }

        @Override
        @Deprecated
        public void remove() {
            throw new UnsupportedOperationException("remove() is not supported by RealmResults iterators.");
        }
    }

    public static abstract class r extends q implements ListIterator {
        public r(OsResults osResults0, int v) {
            super(osResults0);
            if(v < 0 || ((long)v) > this.a.f0()) {
                throw new IndexOutOfBoundsException("Starting location must be a valid index: [0, " + (this.a.f0() - 1L) + "]. Yours was " + v);
            }
            this.b = v - 1;
        }

        @Override
        @Deprecated
        public void add(@h Object object0) {
            throw new UnsupportedOperationException("Adding an element is not supported. Use Realm.createObject() instead.");
        }

        @Override
        public boolean hasPrevious() {
            this.a();
            return this.b >= 0;
        }

        @Override
        public int nextIndex() {
            this.a();
            return this.b + 1;
        }

        @Override
        @h
        public Object previous() {
            this.a();
            try {
                Object object0 = this.d(this.b);
                --this.b;
                return object0;
            }
            catch(IndexOutOfBoundsException unused_ex) {
                throw new NoSuchElementException("Cannot access index less than zero. This was " + this.b + ". Remember to check hasPrevious() before using previous().");
            }
        }

        @Override
        public int previousIndex() {
            this.a();
            return this.b;
        }

        @Override
        @Deprecated
        public void set(@h Object object0) {
            throw new UnsupportedOperationException("Replacing an element is not supported.");
        }
    }

    public static enum s {
        EMPTY,
        TABLE,
        PRIMITIVE_LIST,
        QUERY,
        TABLEVIEW;

        static s a(byte b) {
            switch(b) {
                case 0: {
                    return s.a;
                }
                case 1: {
                    return s.b;
                }
                case 2: {
                    return s.c;
                }
                case 3: {
                    return s.d;
                }
                case 4: {
                    return s.e;
                }
                default: {
                    throw new IllegalArgumentException("Invalid value: " + ((int)b));
                }
            }
        }
    }

    private final long a;
    private final OsSharedRealm b;
    private final k c;
    private final Table d;
    protected boolean e;
    private boolean f;
    protected final n g;
    private static final String h = "This Realm instance has already been closed, making it unusable.";
    private static final long i = 0L;
    public static final byte j = 1;
    public static final byte k = 2;
    public static final byte l = 3;
    public static final byte m = 4;
    public static final byte n = 0;
    public static final byte o = 1;
    public static final byte p = 2;
    public static final byte q = 3;
    public static final byte r = 4;

    static {
        OsResults.i = OsResults.nativeGetFinalizerPtr();
    }

    OsResults(OsSharedRealm osSharedRealm0, long v) {
        boolean z = false;
        this.f = false;
        this.g = new n();
        this.b = osSharedRealm0;
        this.c = osSharedRealm0.context;
        this.a = v;
        osSharedRealm0.context.a(this);
        if(this.t() != s.d) {
            z = true;
        }
        this.e = z;
        this.d = new Table(osSharedRealm0, OsResults.nativeGetTable(v));
    }

    OsResults(OsSharedRealm osSharedRealm0, Table table0, long v) {
        boolean z = false;
        this.f = false;
        this.g = new n();
        this.b = osSharedRealm0;
        this.c = osSharedRealm0.context;
        this.d = table0;
        this.a = v;
        osSharedRealm0.context.a(this);
        if(this.t() != s.d) {
            z = true;
        }
        this.e = z;
    }

    public UncheckedRow A() {
        long v = OsResults.nativeLastRow(this.a);
        return v == 0L ? null : this.d.V(v);
    }

    public void B() {
        if(this.e) {
            return;
        }
        try {
            OsResults.nativeEvaluateQueryIfNeeded(this.a, false);
        }
        catch(IllegalStateException illegalStateException0) {
            throw new IllegalArgumentException("Illegal Argument: " + illegalStateException0.getMessage());
        }
        catch(IllegalArgumentException illegalArgumentException0) {
            if(illegalArgumentException0.getMessage().contains("Cannot sort on a collection property")) {
                throw new IllegalStateException("Illegal Argument: " + illegalArgumentException0.getMessage());
            }
        }
        this.notifyChangeListeners(0L);
    }

    public void C() {
        this.g.b();
        this.nativeStopListening(this.a);
    }

    public void D(Object object0, w0 w00) {
        this.g.e(object0, w00);
        if(this.g.d()) {
            this.nativeStopListening(this.a);
        }
    }

    public void E(Object object0, P0 p00) {
        this.D(object0, new c(p00));
    }

    public void F(String s, @h byte[] arr_b) {
        OsResults.nativeSetBinary(this.a, s, arr_b);
    }

    public void G(String s, boolean z) {
        OsResults.nativeSetBoolean(this.a, s, z);
    }

    public void H(String s, T0 t00) {
        class io.realm.internal.OsResults.k implements o {
            final OsResults a;

            @Override  // io.realm.internal.OsResults$o
            public void a(OsObjectBuilder osObjectBuilder0, T0 t00) {
                osObjectBuilder0.b1(0L, t00);
            }
        }

        this.e(s, t00, new io.realm.internal.OsResults.k(this));
    }

    public void I(String s, T0 t00) {
        class io.realm.internal.OsResults.l implements o {
            final OsResults a;

            @Override  // io.realm.internal.OsResults$o
            public void a(OsObjectBuilder osObjectBuilder0, T0 t00) {
                osObjectBuilder0.i1(0L, t00);
            }
        }

        this.e(s, t00, new io.realm.internal.OsResults.l(this));
    }

    public void J(String s, T0 t00) {
        class g implements o {
            final OsResults a;

            @Override  // io.realm.internal.OsResults$o
            public void a(OsObjectBuilder osObjectBuilder0, T0 t00) {
                osObjectBuilder0.j1(0L, t00);
            }
        }

        this.e(s, t00, new g(this));
    }

    public void K(String s, @h Date date0) {
        if(date0 == null) {
            OsResults.nativeSetNull(this.a, s);
            return;
        }
        long v = date0.getTime();
        OsResults.nativeSetTimestamp(this.a, s, v);
    }

    public void L(String s, T0 t00) {
        class m implements o {
            final OsResults a;

            @Override  // io.realm.internal.OsResults$o
            public void a(OsObjectBuilder osObjectBuilder0, T0 t00) {
                osObjectBuilder0.J1(0L, t00);
            }
        }

        this.e(s, t00, new m(this));
    }

    public void M(String s, @h Decimal128 decimal1280) {
        if(decimal1280 == null) {
            OsResults.nativeSetNull(this.a, s);
            return;
        }
        OsResults.nativeSetDecimal128(this.a, s, decimal1280.i(), decimal1280.h());
    }

    public void N(String s, T0 t00) {
        class io.realm.internal.OsResults.c implements o {
            final OsResults a;

            @Override  // io.realm.internal.OsResults$o
            public void a(OsObjectBuilder osObjectBuilder0, T0 t00) {
                osObjectBuilder0.e2(0L, t00);
            }
        }

        this.e(s, t00, new io.realm.internal.OsResults.c(this));
    }

    public void O(String s, double f) {
        OsResults.nativeSetDouble(this.a, s, f);
    }

    public void P(String s, T0 t00) {
        class a implements o {
            final OsResults a;

            @Override  // io.realm.internal.OsResults$o
            public void a(OsObjectBuilder osObjectBuilder0, T0 t00) {
                osObjectBuilder0.p2(0L, t00);
            }
        }

        this.e(s, t00, new a(this));
    }

    public void Q(String s, float f) {
        OsResults.nativeSetFloat(this.a, s, f);
    }

    public void R(String s, T0 t00) {
        class io.realm.internal.OsResults.n implements o {
            final OsResults a;

            @Override  // io.realm.internal.OsResults$o
            public void a(OsObjectBuilder osObjectBuilder0, T0 t00) {
                osObjectBuilder0.R2(0L, t00);
            }
        }

        this.e(s, t00, new io.realm.internal.OsResults.n(this));
    }

    public void S(String s, long v) {
        OsResults.nativeSetInt(this.a, s, v);
    }

    public void T(String s, T0 t00) {
        class i implements o {
            final OsResults a;

            @Override  // io.realm.internal.OsResults$o
            public void a(OsObjectBuilder osObjectBuilder0, T0 t00) {
                osObjectBuilder0.r3(0L, t00);
            }
        }

        this.e(s, t00, new i(this));
    }

    public void U(String s, T0 t00) {
        class j implements o {
            final OsResults a;

            @Override  // io.realm.internal.OsResults$o
            public void a(OsObjectBuilder osObjectBuilder0, T0 t00) {
                osObjectBuilder0.B3(0L, t00);
            }
        }

        this.e(s, t00, new j(this));
    }

    public void V(String s, T0 t00) {
        class b implements o {
            final OsResults a;

            @Override  // io.realm.internal.OsResults$o
            public void a(OsObjectBuilder osObjectBuilder0, T0 t00) {
                osObjectBuilder0.d4(0L, t00);
            }
        }

        this.e(s, t00, new b(this));
    }

    public void W(String s) {
        OsResults.nativeSetNull(this.a, s);
    }

    public void X(String s, @h u u0) {
        long v;
        if(u0 == null) {
            this.W(s);
            return;
        }
        if(u0 instanceof UncheckedRow) {
            v = ((UncheckedRow)u0).getNativePtr();
        }
        else if(u0 instanceof CheckedRow) {
            v = ((CheckedRow)u0).getNativePtr();
        }
        else {
            throw new UnsupportedOperationException("Unsupported Row type: " + u0.getClass().getCanonicalName());
        }
        OsResults.nativeSetObject(this.a, s, v);
    }

    public void Y(String s, @h ObjectId objectId0) {
        if(objectId0 == null) {
            OsResults.nativeSetNull(this.a, s);
            return;
        }
        OsResults.nativeSetObjectId(this.a, s, "68bb29e65ce9483f5d335252");
    }

    public void Z(String s, T0 t00) {
        class d implements o {
            final OsResults a;

            @Override  // io.realm.internal.OsResults$o
            public void a(OsObjectBuilder osObjectBuilder0, T0 t00) {
                osObjectBuilder0.a4(0L, t00);
            }
        }

        this.e(s, t00, new d(this));
    }

    public void a0(String s, T0 t00) {
        class io.realm.internal.OsResults.h implements o {
            final OsResults a;

            @Override  // io.realm.internal.OsResults$o
            public void a(OsObjectBuilder osObjectBuilder0, T0 t00) {
                osObjectBuilder0.k4(0L, t00);
            }
        }

        this.e(s, t00, new io.realm.internal.OsResults.h(this));
    }

    public void b0(String s, @h String s1) {
        OsResults.nativeSetString(this.a, s, s1);
    }

    public void c(Object object0, w0 w00) {
        if(this.g.d()) {
            this.nativeStartListening(this.a);
        }
        io.realm.internal.ObservableCollection.b observableCollection$b0 = new io.realm.internal.ObservableCollection.b(object0, w00);
        this.g.a(observableCollection$b0);
    }

    public void c0(String s, T0 t00) {
        class f implements o {
            final OsResults a;

            @Override  // io.realm.internal.OsResults$o
            public void a(OsObjectBuilder osObjectBuilder0, T0 t00) {
                osObjectBuilder0.o4(0L, t00);
            }
        }

        this.e(s, t00, new f(this));
    }

    public void d(Object object0, P0 p00) {
        this.c(object0, new c(p00));
    }

    public void d0(String s, @h UUID uUID0) {
        if(uUID0 == null) {
            OsResults.nativeSetNull(this.a, s);
            return;
        }
        OsResults.nativeSetUUID(this.a, s, uUID0.toString());
    }

    private void e(String s, T0 t00, o osResults$o0) {
        OsObjectBuilder osObjectBuilder0 = new OsObjectBuilder(this.u(), Collections.EMPTY_SET);
        osResults$o0.a(osObjectBuilder0, t00);
        try {
            OsResults.nativeSetList(this.a, s, osObjectBuilder0.getNativePtr());
        }
        catch(Throwable throwable0) {
            TWR.safeClose$NT(osObjectBuilder0, throwable0);
            throw throwable0;
        }
        osObjectBuilder0.close();
    }

    public void e0(String s, T0 t00) {
        class e implements o {
            final OsResults a;

            @Override  // io.realm.internal.OsResults$o
            public void a(OsObjectBuilder osObjectBuilder0, T0 t00) {
                osObjectBuilder0.s4(0L, t00);
            }
        }

        this.e(s, t00, new e(this));
    }

    public Date f(p osResults$p0, long v) {
        try {
            return (Date)OsResults.nativeAggregate(this.a, v, osResults$p0.a());
        }
        catch(IllegalStateException illegalStateException0) {
            throw new IllegalArgumentException("Illegal Argument: " + illegalStateException0.getMessage());
        }
    }

    public long f0() {
        return OsResults.nativeSize(this.a);
    }

    public Number g(p osResults$p0, long v) {
        try {
            return (Number)OsResults.nativeAggregate(this.a, v, osResults$p0.a());
        }
        catch(IllegalStateException illegalStateException0) {
            throw new IllegalArgumentException("Illegal Argument: " + illegalStateException0.getMessage());
        }
    }

    public OsResults g0(@h OsKeyPathMapping osKeyPathMapping0, String s, r1 r10) {
        String s1 = TableQuery.m(new String[]{s}, new r1[]{r10});
        return osKeyPathMapping0 == null ? new OsResults(this.b, this.d, OsResults.i0(this.a, s1, 0L)) : new OsResults(this.b, this.d, OsResults.i0(this.a, s1, osKeyPathMapping0.getNativePtr()));
    }

    @Override  // io.realm.internal.l
    public long getNativeFinalizerPtr() {
        return OsResults.i;
    }

    @Override  // io.realm.internal.l
    public long getNativePtr() {
        return this.a;
    }

    public void h() {
        OsResults.nativeClear(this.a);
    }

    public OsResults h0(@h OsKeyPathMapping osKeyPathMapping0, String[] arr_s, r1[] arr_r1) {
        if(arr_r1 == null || arr_r1.length == 0) {
            throw new IllegalArgumentException("You must provide at least one sort order.");
        }
        if(arr_s.length != arr_r1.length) {
            throw new IllegalArgumentException("Number of fields and sort orders do not match.");
        }
        String s = TableQuery.m(arr_s, arr_r1);
        return osKeyPathMapping0 == null ? new OsResults(this.b, this.d, OsResults.i0(this.a, s, 0L)) : new OsResults(this.b, this.d, OsResults.i0(this.a, s, osKeyPathMapping0.getNativePtr()));
    }

    public boolean i(UncheckedRow uncheckedRow0) {
        return OsResults.nativeContains(this.a, uncheckedRow0.getNativePtr());
    }

    private static long i0(long v, String s, long v1) {
        try {
            return OsResults.nativeStringDescriptor(v, s, v1);
        }
        catch(IllegalStateException illegalStateException0) {
            if(illegalStateException0.getMessage().contains("Realm accessed from incorrect thread.")) {
                throw illegalStateException0;
            }
            throw new IllegalArgumentException("Illegal Argument: " + illegalStateException0.getMessage());
        }
    }

    public static OsResults j(OsSharedRealm osSharedRealm0, UncheckedRow uncheckedRow0, Table table0, String s) {
        return new OsResults(osSharedRealm0, table0, OsResults.nativeCreateResultsFromBacklinks(osSharedRealm0.getNativePtr(), uncheckedRow0.getNativePtr(), table0.getNativePtr(), table0.F(s)));
    }

    public String j0(int v) {
        return OsResults.toJSON(this.a, v);
    }

    public static OsResults k(OsSharedRealm osSharedRealm0, long v) {
        return new OsResults(osSharedRealm0, v);
    }

    public TableQuery k0() {
        long v = OsResults.nativeWhere(this.a);
        return new TableQuery(this.c, this.d, v);
    }

    public static OsResults l(OsSharedRealm osSharedRealm0, TableQuery tableQuery0) {
        tableQuery0.q0();
        return new OsResults(osSharedRealm0, tableQuery0.B(), OsResults.nativeCreateResults(osSharedRealm0.getNativePtr(), tableQuery0.getNativePtr()));
    }

    public OsResults m() {
        if(this.f) {
            return this;
        }
        long v = OsResults.nativeCreateSnapshot(this.a);
        OsResults osResults0 = new OsResults(this.b, this.d, v);
        osResults0.f = true;
        return osResults0;
    }

    public void n(long v) {
        OsResults.nativeDelete(this.a, v);
    }

    private static native Object nativeAggregate(long arg0, long arg1, byte arg2) {
    }

    private static native void nativeClear(long arg0) {
    }

    private static native boolean nativeContains(long arg0, long arg1) {
    }

    protected static native long nativeCreateResults(long arg0, long arg1) {
    }

    private static native long nativeCreateResultsFromBacklinks(long arg0, long arg1, long arg2, long arg3) {
    }

    private static native long nativeCreateSnapshot(long arg0) {
    }

    private static native void nativeDelete(long arg0, long arg1) {
    }

    private static native boolean nativeDeleteFirst(long arg0) {
    }

    private static native boolean nativeDeleteLast(long arg0) {
    }

    private static native void nativeEvaluateQueryIfNeeded(long arg0, boolean arg1) {
    }

    private static native long nativeFirstRow(long arg0) {
    }

    private static native long nativeFreeze(long arg0, long arg1) {
    }

    private static native long nativeGetFinalizerPtr() {
    }

    private static native byte nativeGetMode(long arg0) {
    }

    private static native long nativeGetRow(long arg0, int arg1) {
    }

    private static native long nativeGetTable(long arg0) {
    }

    private static native Object nativeGetValue(long arg0, int arg1) {
    }

    private static native long nativeIndexOf(long arg0, long arg1) {
    }

    private static native boolean nativeIsValid(long arg0) {
    }

    private static native long nativeLastRow(long arg0) {
    }

    private static native void nativeSetBinary(long arg0, String arg1, @h byte[] arg2) {
    }

    private static native void nativeSetBoolean(long arg0, String arg1, boolean arg2) {
    }

    private static native void nativeSetDecimal128(long arg0, String arg1, long arg2, long arg3) {
    }

    private static native void nativeSetDouble(long arg0, String arg1, double arg2) {
    }

    private static native void nativeSetFloat(long arg0, String arg1, float arg2) {
    }

    private static native void nativeSetInt(long arg0, String arg1, long arg2) {
    }

    private static native void nativeSetList(long arg0, String arg1, long arg2) {
    }

    private static native void nativeSetNull(long arg0, String arg1) {
    }

    private static native void nativeSetObject(long arg0, String arg1, long arg2) {
    }

    private static native void nativeSetObjectId(long arg0, String arg1, String arg2) {
    }

    private static native void nativeSetString(long arg0, String arg1, @h String arg2) {
    }

    private static native void nativeSetTimestamp(long arg0, String arg1, long arg2) {
    }

    private static native void nativeSetUUID(long arg0, String arg1, String arg2) {
    }

    private static native long nativeSize(long arg0) {
    }

    private native void nativeStartListening(long arg1) {
    }

    private native void nativeStopListening(long arg1) {
    }

    private static native long nativeStringDescriptor(long arg0, String arg1, long arg2) {
    }

    private static native long nativeWhere(long arg0) {
    }

    @Override  // io.realm.internal.ObservableCollection
    public void notifyChangeListeners(long v) {
        OsCollectionChangeSet osCollectionChangeSet0 = v == 0L ? new io.realm.internal.d() : new OsCollectionChangeSet(v, !this.y());
        if(osCollectionChangeSet0.g() && this.y()) {
            return;
        }
        this.e = true;
        io.realm.internal.ObservableCollection.a observableCollection$a0 = new io.realm.internal.ObservableCollection.a(osCollectionChangeSet0);
        this.g.c(observableCollection$a0);
    }

    public boolean o() {
        return OsResults.nativeDeleteFirst(this.a);
    }

    public boolean p() {
        return OsResults.nativeDeleteLast(this.a);
    }

    public OsResults q(@h OsKeyPathMapping osKeyPathMapping0, String[] arr_s) {
        String s = TableQuery.l(arr_s);
        return osKeyPathMapping0 == null ? new OsResults(this.b, this.d, OsResults.i0(this.a, s, 0L)) : new OsResults(this.b, this.d, OsResults.i0(this.a, s, osKeyPathMapping0.getNativePtr()));
    }

    public UncheckedRow r() {
        long v = OsResults.nativeFirstRow(this.a);
        return v == 0L ? null : this.d.V(v);
    }

    public OsResults s(OsSharedRealm osSharedRealm0) {
        OsResults osResults0 = new OsResults(osSharedRealm0, this.d.y(osSharedRealm0), OsResults.nativeFreeze(this.a, osSharedRealm0.getNativePtr()));
        if(this.y()) {
            osResults0.B();
        }
        return osResults0;
    }

    public s t() {
        return s.a(OsResults.nativeGetMode(this.a));
    }

    private static native String toJSON(long arg0, int arg1) {
    }

    public Table u() {
        return this.d;
    }

    public UncheckedRow v(int v) {
        long v1 = OsResults.nativeGetRow(this.a, v);
        return this.d.V(v1);
    }

    public Object w(int v) {
        return OsResults.nativeGetValue(this.a, v);
    }

    public int x(UncheckedRow uncheckedRow0) {
        long v = OsResults.nativeIndexOf(this.a, uncheckedRow0.getNativePtr());
        return v <= 0x7FFFFFFFL ? ((int)v) : 0x7FFFFFFF;
    }

    public boolean y() {
        return this.e;
    }

    public boolean z() {
        return OsResults.nativeIsValid(this.a);
    }
}

