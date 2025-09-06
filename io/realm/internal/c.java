package io.realm.internal;

import io.realm.RealmFieldType;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Map;
import o3.h;

public abstract class c {
    static class a {
    }

    public static final class b {
        public final long a;
        public final RealmFieldType b;
        public final String c;

        private b(long v, RealmFieldType realmFieldType0, @h String s) {
            this.a = v;
            this.b = realmFieldType0;
            this.c = s;
        }

        b(long v, RealmFieldType realmFieldType0, String s, a c$a0) {
            this(v, realmFieldType0, s);
        }

        b(Property property0) {
            this(property0.c(), property0.e(), property0.d());
        }

        @Override
        public String toString() {
            return "ColumnDetails[" + this.a + ", " + this.b + ", " + this.c + "]";
        }
    }

    private final Map a;
    private final Map b;
    private final Map c;
    private final boolean d;

    protected c(int v) {
        this(v, true);
    }

    private c(int v, boolean z) {
        this.a = new HashMap(v);
        this.b = new HashMap(v);
        this.c = new HashMap(v);
        this.d = z;
    }

    protected c(@h c c0, boolean z) {
        this((c0 == null ? 0 : c0.a.size()), z);
        if(c0 != null) {
            this.a.putAll(c0.a);
        }
    }

    protected final void a(OsSchemaInfo osSchemaInfo0, String s, String s1, String s2) {
        b c$b0 = new b(osSchemaInfo0.b(s1).e(s2).c(), RealmFieldType.LINKING_OBJECTS, s1, null);
        this.a.put(s, c$b0);
    }

    protected final long b(String s, String s1, OsObjectSchemaInfo osObjectSchemaInfo0) {
        Property property0 = osObjectSchemaInfo0.e(s1);
        b c$b0 = new b(property0);
        this.a.put(s, c$b0);
        this.b.put(s1, c$b0);
        this.c.put(s, s1);
        return property0.c();
    }

    protected abstract c c(boolean arg1);

    protected abstract void d(c arg1, c arg2);

    public void e(c c0) {
        if(!this.d) {
            throw new UnsupportedOperationException("Attempt to modify an immutable ColumnInfo");
        }
        if(c0 == null) {
            throw new NullPointerException("Attempt to copy null ColumnInfo");
        }
        this.a.clear();
        this.a.putAll(c0.a);
        this.b.clear();
        this.b.putAll(c0.b);
        this.c.clear();
        this.c.putAll(c0.c);
        this.d(c0, this);
    }

    @h
    public b f(String s) {
        return (b)this.a.get(s);
    }

    public long g(String s) {
        b c$b0 = (b)this.a.get(s);
        return c$b0 == null ? -1L : c$b0.a;
    }

    public Map h() {
        return this.a;
    }

    @h
    public String i(String s) {
        return (String)this.c.get(s);
    }

    public final boolean j() {
        return this.d;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder0 = new StringBuilder("ColumnInfo[");
        stringBuilder0.append("mutable=" + this.d);
        stringBuilder0.append(",");
        boolean z = false;
        if(this.a != null) {
            stringBuilder0.append("JavaFieldNames=[");
            boolean z1 = false;
            for(Object object0: this.a.entrySet()) {
                if(z1) {
                    stringBuilder0.append(",");
                }
                stringBuilder0.append(((String)((Map.Entry)object0).getKey()));
                stringBuilder0.append("->");
                stringBuilder0.append(((Map.Entry)object0).getValue());
                z1 = true;
            }
            stringBuilder0.append("]");
        }
        if(this.b != null) {
            stringBuilder0.append(", InternalFieldNames=[");
            for(Object object1: this.b.entrySet()) {
                if(z) {
                    stringBuilder0.append(",");
                }
                stringBuilder0.append(((String)((Map.Entry)object1).getKey()));
                stringBuilder0.append("->");
                stringBuilder0.append(((Map.Entry)object1).getValue());
                z = true;
            }
            stringBuilder0.append("]");
        }
        stringBuilder0.append("]");
        return stringBuilder0.toString();
    }
}

