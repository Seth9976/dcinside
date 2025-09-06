package org.bson;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map.Entry;
import java.util.Map;
import java.util.TreeSet;
import org.bson.types.ObjectId;
import org.bson.types.b;

public class m extends LinkedHashMap implements i {
    private static final long a = 0xC2B9C6B723AEE202L;

    public m() {
    }

    public m(int v) {
        super(v);
    }

    public m(String s, Object object0) {
        this.put(s, object0);
    }

    public m(Map map0) {
        super(map0);
    }

    public int A(String s, int v) {
        Object object0 = this.get(s);
        return object0 == null ? v : this.H(object0);
    }

    public long B(String s) {
        return ((Number)this.get(s)).longValue();
    }

    public long C(String s, long v) {
        Object object0 = this.get(s);
        return object0 == null ? v : ((Number)object0).longValue();
    }

    public ObjectId D(String s) {
        return (ObjectId)this.get(s);
    }

    public ObjectId E(String s, ObjectId objectId0) {
        Object object0 = this.get(s);
        return object0 == null ? objectId0 : ((ObjectId)object0);
    }

    public String F(String s) {
        Object object0 = this.get(s);
        return object0 == null ? null : object0.toString();
    }

    public String G(String s, String s1) {
        Object object0 = this.get(s);
        return object0 == null ? s1 : object0.toString();
    }

    private int H(Object object0) {
        if(object0 instanceof Number) {
            return ((Number)object0).intValue();
        }
        if(!(object0 instanceof Boolean)) {
            throw new IllegalArgumentException("can\'t convert: " + object0.getClass().getName() + " to int");
        }
        return ((Boolean)object0).booleanValue();
    }

    @Override  // org.bson.i
    public boolean a(String s) {
        return super.containsKey(s);
    }

    @Override  // org.bson.i
    public void b(i i0) {
        for(Object object0: i0.keySet()) {
            this.put(((String)object0), i0.get(((String)object0)));
        }
    }

    @Override  // org.bson.i
    public Object c(String s, Object object0) {
        return super.put(s, object0);
    }

    @Override  // org.bson.i
    public Map d() {
        return new LinkedHashMap(this);
    }

    public m e(String s, Object object0) {
        this.put(s, object0);
        return this;
    }

    @Override
    public boolean equals(Object object0) {
        if(object0 == this) {
            return true;
        }
        if(!(object0 instanceof i)) {
            return false;
        }
        return this.keySet().equals(((i)object0).keySet()) ? Arrays.equals(this.y().d(m.j(this)), this.y().d(m.j(((i)object0)))) : false;
    }

    private static Object f(Object object0) {
        if(object0 instanceof i && !(object0 instanceof b)) {
            return m.j(((i)object0));
        }
        if(object0 instanceof List) {
            return m.l(((List)object0));
        }
        return object0 instanceof Map ? m.m(((Map)object0)) : object0;
    }

    @Override  // org.bson.i
    @Deprecated
    public boolean g(String s) {
        return this.a(s);
    }

    @Override  // org.bson.i
    public Object get(String s) {
        return super.get(s);
    }

    @Override  // org.bson.i
    public Object h(String s) {
        return this.remove(s);
    }

    // 去混淆评级： 低(20)
    @Override
    public int hashCode() {
        return Arrays.hashCode(new byte[]{5, 0, 0, 0, 0});
    }

    private static m j(i i0) {
        m m0 = new m();
        for(Object object0: new TreeSet(i0.keySet())) {
            m0.put(((String)object0), m.f(i0.get(((String)object0))));
        }
        return m0;
    }

    private static List l(List list0) {
        List list1 = new ArrayList(list0.size());
        for(Object object0: list0) {
            list1.add(m.f(object0));
        }
        return list1;
    }

    private static Map m(Map map0) {
        Map map1 = new LinkedHashMap(map0.size());
        for(Object object0: new TreeSet(map0.keySet())) {
            map1.put(((String)object0), m.f(map0.get(((String)object0))));
        }
        return map1;
    }

    private byte[] o() [...] // 潜在的解密器

    @Override  // org.bson.i
    public void putAll(Map map0) {
        for(Object object0: map0.entrySet()) {
            this.put(((Map.Entry)object0).getKey().toString(), ((Map.Entry)object0).getValue());
        }
    }

    public boolean q(String s) {
        return this.r(s, false);
    }

    public boolean r(String s, boolean z) {
        Object object0 = this.get(s);
        if(object0 == null) {
            return z;
        }
        if(object0 instanceof Number) {
            return ((Number)object0).intValue() > 0;
        }
        if(!(object0 instanceof Boolean)) {
            throw new IllegalArgumentException("can\'t coerce to bool:" + object0.getClass());
        }
        return ((Boolean)object0).booleanValue();
    }

    public Date s(String s) {
        return (Date)this.get(s);
    }

    public Date u(String s, Date date0) {
        Object object0 = this.get(s);
        return object0 == null ? date0 : ((Date)object0);
    }

    public double w(String s) {
        return ((Number)this.get(s)).doubleValue();
    }

    public double x(String s, double f) {
        Object object0 = this.get(s);
        return object0 == null ? f : ((Number)object0).doubleValue();
    }

    private g y() {
        return new l();
    }

    public int z(String s) {
        Object object0 = this.get(s);
        if(object0 == null) {
            throw new NullPointerException("no value for: " + s);
        }
        return this.H(object0);
    }
}

