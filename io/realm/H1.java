package io.realm;

import io.realm.internal.Table;
import io.realm.internal.Util;
import io.realm.internal.b;
import io.realm.internal.c;
import io.realm.internal.objectstore.OsKeyPathMapping;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import o3.h;

public abstract class h1 {
    private final Map a;
    private final Map b;
    private final Map c;
    private final Map d;
    private OsKeyPathMapping e;
    final a f;
    private final b g;
    static final String h = "Null or empty class names are not allowed";

    h1(a a0, @h b b0) {
        this.a = new HashMap();
        this.b = new HashMap();
        this.c = new HashMap();
        this.d = new HashMap();
        this.e = null;
        this.f = a0;
        this.g = b0;
    }

    private void a() {
        if(!this.q()) {
            throw new IllegalStateException("Attempt to use column key before set.");
        }
    }

    void b(String s, String s1) {
        String s2 = Table.T(s);
        if(!this.f.f0().hasTable(s2)) {
            throw new IllegalArgumentException(s1);
        }
    }

    void c(String s, String s1) {
        if(s == null || s.isEmpty()) {
            throw new IllegalArgumentException(s1);
        }
    }

    public boolean d(String s) {
        String s1 = Table.T(s);
        return this.f.f0().hasTable(s1);
    }

    public abstract f1 e(String arg1);

    public void f() {
        this.e = new OsKeyPathMapping(this.f.e.getNativePtr());
    }

    public abstract f1 g(String arg1, String arg2, Class arg3, L[] arg4);

    @h
    public abstract f1 h(String arg1);

    public abstract Set i();

    final c j(Class class0) {
        this.a();
        return this.g.a(class0);
    }

    protected final c k(String s) {
        this.a();
        return this.g.b(s);
    }

    final OsKeyPathMapping l() {
        return this.e;
    }

    f1 m(Class class0) {
        f1 f10 = (f1)this.c.get(class0);
        if(f10 != null) {
            return f10;
        }
        Class class1 = Util.h(class0);
        if(this.r(class1, class0)) {
            f10 = (f1)this.c.get(class1);
        }
        if(f10 == null) {
            Table table0 = this.o(class0);
            c c0 = this.j(class1);
            U u0 = new U(this.f, this, table0, c0);
            this.c.put(class1, u0);
            f10 = u0;
        }
        if(this.r(class1, class0)) {
            this.c.put(class0, f10);
        }
        return f10;
    }

    f1 n(String s) {
        String s1 = Table.T(s);
        f1 f10 = (f1)this.d.get(s1);
        if(f10 == null || !f10.w().f0() || !f10.p().equals(s)) {
            if(!this.f.f0().hasTable(s1)) {
                throw new IllegalArgumentException("The class " + s + " doesn\'t exist in this Realm.");
            }
            Table table0 = this.f.f0().getTable(s1);
            f10 = new U(this.f, this, table0);
            this.d.put(s1, f10);
            return f10;
        }
        return f10;
    }

    Table o(Class class0) {
        Table table0 = (Table)this.b.get(class0);
        if(table0 != null) {
            return table0;
        }
        Class class1 = Util.h(class0);
        if(this.r(class1, class0)) {
            table0 = (Table)this.b.get(class1);
        }
        if(table0 == null) {
            String s = Table.T(this.f.T().s().o(class1));
            table0 = this.f.f0().getTable(s);
            this.b.put(class1, table0);
        }
        if(this.r(class1, class0)) {
            this.b.put(class0, table0);
        }
        return table0;
    }

    Table p(String s) {
        String s1 = Table.T(s);
        Table table0 = (Table)this.a.get(s1);
        if(table0 != null) {
            return table0;
        }
        Table table1 = this.f.f0().getTable(s1);
        this.a.put(s1, table1);
        return table1;
    }

    final boolean q() {
        return this.g != null;
    }

    private boolean r(Class class0, Class class1) {
        return class0.equals(class1);
    }

    final void s(String s, f1 f10) {
        this.d.put(s, f10);
    }

    void t() {
        b b0 = this.g;
        if(b0 != null) {
            b0.c();
        }
        this.a.clear();
        this.b.clear();
        this.c.clear();
        this.d.clear();
    }

    public abstract void u(String arg1);

    final f1 v(String s) {
        return (f1)this.d.remove(s);
    }

    public abstract f1 w(String arg1, String arg2);
}

