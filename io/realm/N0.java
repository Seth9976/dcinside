package io.realm;

import io.realm.internal.OsObjectStore;
import io.realm.internal.Table;
import java.util.LinkedHashSet;
import java.util.Locale;
import java.util.Set;

class n0 extends h1 {
    n0(a a0) {
        super(a0, null);
    }

    @Override  // io.realm.h1
    public f1 e(String s) {
        this.c(s, "Null or empty class names are not allowed");
        String s1 = Table.T(s);
        int v = Table.f;
        if(s.length() > v) {
            throw new IllegalArgumentException(String.format(Locale.US, "Class name is too long. Limit is %1$d characters: %2$s", v, s.length()));
        }
        Table table0 = this.f.f0().createTable(s1);
        return new m0(this.f, this, table0);
    }

    @Override  // io.realm.h1
    public f1 g(String s, String s1, Class class0, L[] arr_l) {
        boolean z = false;
        this.c(s, "Null or empty class names are not allowed");
        f1.n(s1);
        String s2 = this.x(s);
        b f1$b0 = (b)f1.e.get(class0);
        if(f1$b0 == null || f1$b0.a != RealmFieldType.STRING && f1$b0.a != RealmFieldType.INTEGER && f1$b0.a != RealmFieldType.OBJECT_ID) {
            throw new IllegalArgumentException(String.format("Realm doesn\'t support primary key field type \'%s\'.", class0));
        }
        boolean z1 = f1$b0.c;
        if(!m0.W(arr_l, L.c)) {
            z = z1;
        }
        Table table0 = this.f.f0().createTableWithPrimaryKey(s2, s1, f1$b0.a, z);
        return new m0(this.f, this, table0);
    }

    @Override  // io.realm.h1
    public f1 h(String s) {
        this.c(s, "Null or empty class names are not allowed");
        String s1 = Table.T(s);
        if(!this.f.f0().hasTable(s1)) {
            return null;
        }
        Table table0 = this.f.f0().getTable(s1);
        return new m0(this.f, this, table0);
    }

    @Override  // io.realm.h1
    public Set i() {
        String[] arr_s = this.f.f0().getTablesNames();
        Set set0 = new LinkedHashSet(arr_s.length);
        for(int v = 0; v < arr_s.length; ++v) {
            f1 f10 = this.h(Table.D(arr_s[v]));
            if(f10 != null) {
                set0.add(f10);
            }
        }
        return set0;
    }

    @Override  // io.realm.h1
    public void u(String s) {
        this.f.o();
        this.c(s, "Null or empty class names are not allowed");
        String s1 = Table.T(s);
        if(!OsObjectStore.b(this.f.f0(), s)) {
            throw new IllegalArgumentException("Cannot remove class because it is not in this Realm: " + s);
        }
        this.v(s1);
    }

    @Override  // io.realm.h1
    public f1 w(String s, String s1) {
        this.f.o();
        this.c(s, "Class names cannot be empty or null");
        this.c(s1, "Class names cannot be empty or null");
        String s2 = Table.T(s);
        String s3 = Table.T(s1);
        this.b(s, "Cannot rename class because it doesn\'t exist in this Realm: " + s);
        if(this.f.f0().hasTable(s3)) {
            throw new IllegalArgumentException(s + " cannot be renamed because the new class already exists: " + s1);
        }
        this.f.f0().renameTable(s2, s3);
        Table table0 = this.f.f0().getTable(s3);
        f1 f10 = this.v(s2);
        if(f10 == null || !f10.w().f0() || !f10.p().equals(s1)) {
            f10 = new m0(this.f, this, table0);
        }
        this.s(s3, f10);
        return f10;
    }

    private String x(String s) {
        int v = Table.f;
        if(s.length() > v) {
            throw new IllegalArgumentException(String.format(Locale.US, "Class name is too long. Limit is %1$d characters: %2$s", v, s.length()));
        }
        return Table.T(s);
    }
}

