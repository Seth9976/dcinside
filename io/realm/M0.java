package io.realm;

import io.realm.internal.CheckedRow;
import io.realm.internal.OsObjectStore;
import io.realm.internal.OsResults;
import io.realm.internal.Table;
import io.realm.internal.Util;
import java.util.Date;
import java.util.Locale;

class m0 extends f1 {
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
                a.a[RealmFieldType.DATE.ordinal()] = 2;
            }
            catch(NoSuchFieldError unused_ex) {
            }
        }
    }

    m0(io.realm.a a0, h1 h10, Table table0) {
        super(a0, h10, table0, new io.realm.f1.a(table0));
    }

    @Override  // io.realm.f1
    public f1 F(String s) {
        this.b.o();
        f1.n(s);
        if(!this.x(s)) {
            throw new IllegalStateException(s + " does not exist.");
        }
        long v = this.q(s);
        String s1 = this.p();
        if(s.equals(OsObjectStore.c(this.b.e, s1))) {
            OsObjectStore.e(this.b.e, s1, s);
        }
        this.c.i0(v);
        return this;
    }

    @Override  // io.realm.f1
    public f1 G(String s) {
        this.b.o();
        f1.n(s);
        this.m(s);
        long v = this.q(s);
        if(!this.c.X(v)) {
            throw new IllegalStateException("Field is not indexed: " + s);
        }
        this.c.j0(v);
        return this;
    }

    @Override  // io.realm.f1
    public f1 H() {
        this.b.o();
        String s = OsObjectStore.c(this.b.e, this.p());
        if(s == null) {
            throw new IllegalStateException(this.p() + " doesn\'t have a primary key.");
        }
        long v = this.c.F(s);
        if(this.c.X(v)) {
            this.c.j0(v);
        }
        OsObjectStore.e(this.b.e, this.p(), null);
        return this;
    }

    @Override  // io.realm.f1
    public f1 I(String s, String s1) {
        this.b.o();
        f1.n(s);
        this.m(s);
        f1.n(s1);
        this.S(s1);
        long v = this.q(s);
        this.c.k0(v, s1);
        return this;
    }

    @Override  // io.realm.f1
    public f1 J(String s) {
        this.b.o();
        this.R(s);
        String s1 = Table.T(s);
        int v = Table.f;
        if(s.length() > v) {
            throw new IllegalArgumentException(String.format(Locale.US, "Class name is too long. Limit is %1$d characters: \'%2$s\' (%3$d)", v, s, s.length()));
        }
        if(this.b.e.hasTable(s1)) {
            throw new IllegalArgumentException("Class already exists: " + s);
        }
        String s2 = this.c.P();
        String s3 = this.c.C();
        String s4 = OsObjectStore.c(this.b.e, s3);
        if(s4 != null) {
            OsObjectStore.e(this.b.e, s3, null);
        }
        this.b.e.renameTable(s2, s1);
        if(s4 != null) {
            try {
                OsObjectStore.e(this.b.e, s, s4);
                return this;
            }
            catch(Exception exception0) {
                this.b.e.renameTable(this.c.P(), s2);
                throw exception0;
            }
        }
        return this;
    }

    @Override  // io.realm.f1
    public f1 M(String s, boolean z) {
        this.N(s, !z);
        return this;
    }

    @Override  // io.realm.f1
    public f1 N(String s, boolean z) {
        long v = this.c.F(s);
        boolean z1 = this.E(s);
        RealmFieldType realmFieldType0 = this.c.I(v);
        if(realmFieldType0 == RealmFieldType.OBJECT) {
            throw new IllegalArgumentException("Cannot modify the required state for RealmObject references: " + s);
        }
        if(realmFieldType0 == RealmFieldType.LIST) {
            throw new IllegalArgumentException("Cannot modify the required state for RealmList references: " + s);
        }
        if(z && z1) {
            throw new IllegalStateException("Field is already required: " + s);
        }
        if(!z && !z1) {
            throw new IllegalStateException("Field is already nullable: " + s);
        }
        if(z) {
            try {
                this.c.i(v);
                return this;
            }
            catch(RuntimeException runtimeException0) {
                if(!runtimeException0.getMessage().contains("has null value(s) in property")) {
                    throw runtimeException0;
                }
                throw new IllegalStateException(runtimeException0.getMessage());
            }
        }
        this.c.j(v);
        return this;
    }

    @Override  // io.realm.f1
    public f1 O(c f1$c0) {
        if(f1$c0 != null) {
            OsResults osResults0 = OsResults.l(this.b.e, this.c.E0()).m();
            long v = osResults0.f0();
            if(v > 0x7FFFFFFFL) {
                throw new UnsupportedOperationException("Too many results to iterate: " + v);
            }
            int v1 = (int)osResults0.f0();
            for(int v2 = 0; v2 < v1; ++v2) {
                CheckedRow checkedRow0 = new CheckedRow(osResults0.v(v2));
                G g0 = new G(this.b, checkedRow0);
                if(g0.s()) {
                    f1$c0.a(g0);
                }
            }
            return this;
        }
        return this;
    }

    private void P(String s, L[] arr_l) {
        boolean z = false;
        if(arr_l == null) {
            return;
        }
        else {
            try {
                if(arr_l.length > 0) {
                    if(m0.W(arr_l, L.a)) {
                        this.d(s);
                        z = true;
                    }
                    if(m0.W(arr_l, L.b)) {
                        this.e(s);
                        return;
                    }
                }
                return;
            }
            catch(Exception exception0) {
            }
        }
        long v = this.q(s);
        if(z) {
            this.c.j0(v);
        }
        throw (RuntimeException)exception0;
    }

    private void Q() {
    }

    private void R(String s) {
        if(s == null || s.isEmpty()) {
            throw new IllegalArgumentException("Null or empty class names are not allowed");
        }
    }

    private void S(String s) {
        if(this.c.F(s) != -1L) {
            throw new IllegalArgumentException("Field already exists in \'" + this.p() + "\': " + s);
        }
    }

    private void T(String s, RealmFieldType realmFieldType0) {
        switch(realmFieldType0) {
            case 1: {
                throw new IllegalArgumentException("Boolean fields cannot be marked as primary keys: " + s);
            }
            case 2: {
                throw new IllegalArgumentException("Date fields cannot be marked as primary keys: " + s);
            }
        }
    }

    private void U(String s, Class class0) {
        if(class0 == Boolean.TYPE || class0 == Boolean.class) {
            this.T(s, RealmFieldType.BOOLEAN);
        }
        if(class0 == Date.class) {
            this.T(s, RealmFieldType.DATE);
        }
    }

    private void V(String s) {
        f1.n(s);
        this.S(s);
    }

    static boolean W(L[] arr_l, L l0) {
        if(arr_l != null && arr_l.length != 0) {
            for(int v = 0; v < arr_l.length; ++v) {
                if(arr_l[v] == l0) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override  // io.realm.f1
    public f1 c(String s, Class class0, L[] arr_l) {
        boolean z = false;
        b f1$b0 = (b)f1.e.get(class0);
        if(f1$b0 == null) {
            if(f1.h.containsKey(class0)) {
                throw new IllegalArgumentException("Use addRealmObjectField() instead to add fields that link to other RealmObjects: " + s);
            }
            throw X0.class.isAssignableFrom(class0) ? new IllegalArgumentException(String.format(Locale.US, "Use \'addRealmObjectField()\' instead to add fields that link to other RealmObjects: %s(%s)", s, class0)) : new IllegalArgumentException(String.format(Locale.US, "Realm doesn\'t support this field type: %s(%s)", s, class0));
        }
        if(m0.W(arr_l, L.b)) {
            this.Q();
            this.U(s, class0);
        }
        this.V(s);
        boolean z1 = f1$b0.c;
        if(!m0.W(arr_l, L.c)) {
            z = z1;
        }
        long v = this.c.b(f1$b0.a, s, z);
        try {
            this.P(s, arr_l);
            return this;
        }
        catch(Exception exception0) {
            this.c.i0(v);
            throw exception0;
        }
    }

    @Override  // io.realm.f1
    public f1 d(String s) {
        f1.n(s);
        this.m(s);
        long v = this.q(s);
        if(this.c.X(v)) {
            throw new IllegalStateException(s + " already has an index.");
        }
        this.c.f(v);
        return this;
    }

    @Override  // io.realm.f1
    public f1 e(String s) {
        this.Q();
        f1.n(s);
        this.m(s);
        String s1 = OsObjectStore.c(this.b.e, this.p());
        if(s1 != null) {
            throw new IllegalStateException(String.format(Locale.ENGLISH, "Field \'%s\' has been already defined as primary key.", s1));
        }
        long v = this.q(s);
        RealmFieldType realmFieldType0 = this.t(s);
        this.T(s, realmFieldType0);
        if(realmFieldType0 != RealmFieldType.STRING && !this.c.X(v)) {
            this.c.f(v);
        }
        OsObjectStore.e(this.b.e, this.p(), s);
        return this;
    }

    @Override  // io.realm.f1
    public f1 f(String s, f1 f10) {
        f1.n(s);
        this.S(s);
        Table table0 = this.b.e.getTable(Table.T(f10.p()));
        this.c.c(RealmFieldType.STRING_TO_LINK_MAP, s, table0);
        return this;
    }

    @Override  // io.realm.f1
    public f1 g(String s, Class class0) {
        f1.n(s);
        this.S(s);
        b f1$b0 = (b)f1.f.get(class0);
        if(f1$b0 == null) {
            throw class0.equals(f1.class) || X0.class.isAssignableFrom(class0) ? new IllegalArgumentException("Use \'addRealmDictionaryField(String name, RealmObjectSchema schema)\' instead to add dictionaries that link to other RealmObjects: " + s) : new IllegalArgumentException(String.format(Locale.US, "RealmDictionary does not support dictionaries with this type: %s(%s)", s, class0));
        }
        this.c.b(f1$b0.b, s, f1$b0.c);
        return this;
    }

    @Override  // io.realm.f1
    public f1 h(String s, f1 f10) {
        f1.n(s);
        this.S(s);
        Table table0 = this.b.e.getTable(Table.T(f10.p()));
        this.c.d(RealmFieldType.LIST, s, table0);
        return this;
    }

    @Override  // io.realm.f1
    public f1 i(String s, Class class0) {
        f1.n(s);
        this.S(s);
        b f1$b0 = (b)f1.e.get(class0);
        if(f1$b0 == null) {
            throw class0.equals(f1.class) || X0.class.isAssignableFrom(class0) ? new IllegalArgumentException("Use \'addRealmListField(String name, RealmObjectSchema schema)\' instead to add lists that link to other RealmObjects: " + s) : new IllegalArgumentException(String.format(Locale.US, "RealmList does not support lists with this type: %s(%s)", s, class0));
        }
        this.c.b(f1$b0.b, s, f1$b0.c);
        return this;
    }

    @Override  // io.realm.f1
    public f1 j(String s, f1 f10) {
        f1.n(s);
        this.S(s);
        Table table0 = this.b.e.getTable(Table.T(f10.p()));
        this.c.d(RealmFieldType.OBJECT, s, table0);
        return this;
    }

    @Override  // io.realm.f1
    public f1 k(String s, f1 f10) {
        f1.n(s);
        this.S(s);
        Table table0 = this.b.e.getTable(Table.T(f10.p()));
        this.c.e(RealmFieldType.LINK_SET, s, table0);
        return this;
    }

    @Override  // io.realm.f1
    public f1 l(String s, Class class0) {
        f1.n(s);
        this.S(s);
        b f1$b0 = (b)f1.g.get(class0);
        if(f1$b0 == null) {
            throw class0.equals(f1.class) || X0.class.isAssignableFrom(class0) ? new IllegalArgumentException("Use \'addRealmSetField(String name, RealmObjectSchema schema)\' instead to add sets that link to other RealmObjects: " + s) : new IllegalArgumentException(String.format(Locale.US, "RealmSet does not support sets with this type: %s(%s)", s, class0));
        }
        this.c.b(f1$b0.b, s, f1$b0.c);
        return this;
    }

    @Override  // io.realm.f1
    String v(String s) {
        long v = this.q(s);
        String s1 = this.c.N(v).C();
        if(Util.l(s1)) {
            throw new IllegalArgumentException(String.format("Property \'%s\' not found.", s));
        }
        return s1;
    }
}

