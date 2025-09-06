package io.realm.internal;

import io.realm.exceptions.RealmException;
import j..util.concurrent.ConcurrentHashMap;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map.Entry;
import java.util.Map;
import o3.g;

public final class b {
    private final Map a;
    private final Map b;
    private final t c;
    private final OsSchemaInfo d;

    public b(t t0, OsSchemaInfo osSchemaInfo0) {
        this.a = new ConcurrentHashMap();
        this.b = new HashMap();
        this.c = t0;
        this.d = osSchemaInfo0;
    }

    @g
    public c a(Class class0) {
        c c0 = (c)this.a.get(class0);
        if(c0 == null) {
            c0 = this.c.d(class0, this.d);
            this.a.put(class0, c0);
        }
        return c0;
    }

    @g
    public c b(String s) {
        c c0 = (c)this.b.get(s);
        if(c0 == null) {
            for(Object object0: this.c.m()) {
                Class class0 = (Class)object0;
                if(this.c.o(class0).equals(s)) {
                    c0 = this.a(class0);
                    this.b.put(s, c0);
                    break;
                }
                if(false) {
                    break;
                }
            }
        }
        if(c0 == null) {
            throw new RealmException(String.format(Locale.US, "\'%s\' doesn\'t exist in current schema.", s));
        }
        return c0;
    }

    public void c() {
        for(Object object0: this.a.entrySet()) {
            Class class0 = (Class)((Map.Entry)object0).getKey();
            c c0 = this.c.d(class0, this.d);
            ((c)((Map.Entry)object0).getValue()).e(c0);
        }
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder0 = new StringBuilder("ColumnIndices[");
        boolean z = false;
        for(Object object0: this.a.entrySet()) {
            if(z) {
                stringBuilder0.append(",");
            }
            stringBuilder0.append(((Class)((Map.Entry)object0).getKey()).getSimpleName());
            stringBuilder0.append("->");
            stringBuilder0.append(((Map.Entry)object0).getValue());
            z = true;
        }
        stringBuilder0.append("]");
        return stringBuilder0.toString();
    }
}

