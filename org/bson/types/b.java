package org.bson.types;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Map;
import java.util.Set;
import org.bson.i;

public class b extends ArrayList implements i {
    private static final long a = 0xC2B9C6B723AEE202L;

    @Override  // org.bson.i
    public boolean a(String s) {
        int v = this.k(s, false);
        return v >= 0 ? v >= 0 && v < this.size() : false;
    }

    @Override  // org.bson.i
    public void b(i i0) {
        for(Object object0: i0.keySet()) {
            this.c(((String)object0), i0.get(((String)object0)));
        }
    }

    @Override  // org.bson.i
    public Object c(String s, Object object0) {
        return this.l(this.j(s), object0);
    }

    @Override  // org.bson.i
    public Map d() {
        Map map0 = new HashMap();
        for(Object object0: this.keySet()) {
            map0.put(object0, this.get(String.valueOf(object0)));
        }
        return map0;
    }

    @Override  // org.bson.i
    @Deprecated
    public boolean g(String s) {
        return this.a(s);
    }

    @Override  // org.bson.i
    public Object get(String s) {
        int v = this.j(s);
        if(v < 0) {
            return null;
        }
        return v < this.size() ? this.get(v) : null;
    }

    @Override  // org.bson.i
    public Object h(String s) {
        int v = this.j(s);
        if(v < 0) {
            return null;
        }
        return v < this.size() ? this.remove(v) : null;
    }

    int j(String s) {
        return this.k(s, true);
    }

    int k(String s, boolean z) {
        try {
            return Integer.parseInt(s);
        }
        catch(Exception unused_ex) {
            if(z) {
                throw new IllegalArgumentException("BasicBSONList can only work with numeric keys, not: [" + s + "]");
            }
            return -1;
        }
    }

    @Override  // org.bson.i
    public Set keySet() {
        return new org.bson.types.i(this.size());
    }

    public Object l(int v, Object object0) {
        while(v >= this.size()) {
            this.add(null);
        }
        this.set(v, object0);
        return object0;
    }

    @Override  // org.bson.i
    public void putAll(Map map0) {
        for(Object object0: map0.entrySet()) {
            this.c(((Map.Entry)object0).getKey().toString(), ((Map.Entry)object0).getValue());
        }
    }
}

