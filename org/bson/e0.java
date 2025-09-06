package org.bson;

import T3.a;
import java.io.Serializable;
import java.io.StringWriter;
import java.util.Collection;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.bson.codecs.S;
import org.bson.codecs.T;
import org.bson.codecs.U;
import org.bson.codecs.X;
import org.bson.codecs.Y;
import org.bson.codecs.configuration.d;
import org.bson.json.E;
import org.bson.json.F;
import org.bson.json.w;
import org.bson.types.ObjectId;

public class e0 implements a, Serializable, Map {
    private final LinkedHashMap a;
    private static final long b = 0x576609E275C849C6L;

    public e0() {
        this.a = new LinkedHashMap();
    }

    public e0(String s, Object object0) {
        LinkedHashMap linkedHashMap0 = new LinkedHashMap();
        this.a = linkedHashMap0;
        linkedHashMap0.put(s, object0);
    }

    public e0(Map map0) {
        this.a = new LinkedHashMap(map0);
    }

    public Object A(String s, Object object0) {
        return this.a.put(s, object0);
    }

    public String B() {
        return this.D(new F());
    }

    public String C(X x0) {
        return this.E(new F(), x0);
    }

    public String D(F f0) {
        return this.E(f0, new U());
    }

    public String E(F f0, X x0) {
        E e0 = new E(new StringWriter(), f0);
        x0.e(e0, this, Y.a().b());
        return e0.l4().toString();
    }

    @Override  // T3.a
    public y a(Class class0, d d0) {
        return new A(this, d0.a(e0.class));
    }

    public e0 b(String s, Object object0) {
        this.a.put(s, object0);
        return this;
    }

    private List c(Object object0, Class class0, List list0) {
        List list1 = (List)this.d(object0, List.class);
        if(list1 == null) {
            return list0;
        }
        for(Object object1: list1) {
            if(!class0.isAssignableFrom(object1.getClass())) {
                throw new ClassCastException(String.format("List element cannot be cast to %s", class0.getName()));
            }
            if(false) {
                break;
            }
        }
        return list1;
    }

    @Override
    public void clear() {
        this.a.clear();
    }

    @Override
    public boolean containsKey(Object object0) {
        return this.a.containsKey(object0);
    }

    @Override
    public boolean containsValue(Object object0) {
        return this.a.containsValue(object0);
    }

    public Object d(Object object0, Class class0) {
        R3.a.e("clazz", class0);
        return class0.cast(this.a.get(object0));
    }

    public Object e(Object object0, Object object1) {
        R3.a.e("defaultValue", object1);
        Object object2 = this.a.get(object0);
        return object2 == null ? object1 : object2;
    }

    @Override
    public Set entrySet() {
        return this.a.entrySet();
    }

    // 去混淆评级： 低(30)
    @Override
    public boolean equals(Object object0) {
        return this == object0 ? true : object0 != null && this.getClass() == object0.getClass() && this.a.equals(((e0)object0).a);
    }

    public Boolean f(Object object0) {
        return (Boolean)this.get(object0);
    }

    public boolean g(Object object0, boolean z) {
        return ((Boolean)this.e(object0, Boolean.valueOf(z))).booleanValue();
    }

    @Override
    public Object get(Object object0) {
        return this.a.get(object0);
    }

    public Date h(Object object0) {
        return (Date)this.get(object0);
    }

    @Override
    public int hashCode() {
        return this.a.hashCode();
    }

    public Double i(Object object0) {
        return (Double)this.get(object0);
    }

    @Override
    public boolean isEmpty() {
        return this.a.isEmpty();
    }

    public Object j(List list0, Class class0) {
        R3.a.e("keys", list0);
        R3.a.b("keys", !list0.isEmpty());
        R3.a.e("clazz", class0);
        return this.m(list0, class0, null);
    }

    @Override
    public Set keySet() {
        return this.a.keySet();
    }

    public Object l(List list0, Object object0) {
        R3.a.e("keys", list0);
        R3.a.b("keys", !list0.isEmpty());
        R3.a.e("defaultValue", object0);
        return this.m(list0, null, object0);
    }

    private Object m(List list0, Class class0, Object object0) {
        Iterator iterator0 = list0.iterator();
        while(iterator0.hasNext()) {
            Object object1 = iterator0.next();
            this = this.get(object1);
            if(!(this instanceof e0)) {
                if(this == null) {
                    return object0;
                }
                if(iterator0.hasNext()) {
                    throw new ClassCastException(String.format("At key %s, the value is not a Document (%s)", object1, this.getClass().getName()));
                }
                if(false) {
                    break;
                }
            }
        }
        return class0 != null ? class0.cast(this) : this;
    }

    public int o(Object object0, int v) {
        return (int)(((Integer)this.e(object0, v)));
    }

    @Override
    public Object put(Object object0, Object object1) {
        return this.A(((String)object0), object1);
    }

    @Override
    public void putAll(Map map0) {
        this.a.putAll(map0);
    }

    public Integer q(Object object0) {
        return (Integer)this.get(object0);
    }

    public List r(Object object0, Class class0) {
        R3.a.e("clazz", class0);
        return this.c(object0, class0, null);
    }

    @Override
    public Object remove(Object object0) {
        return this.a.remove(object0);
    }

    public List s(Object object0, Class class0, List list0) {
        R3.a.e("defaultValue", list0);
        R3.a.e("clazz", class0);
        return this.c(object0, class0, list0);
    }

    @Override
    public int size() {
        return this.a.size();
    }

    @Override
    public String toString() {
        return "Document{" + this.a + '}';
    }

    public Long u(Object object0) {
        return (Long)this.get(object0);
    }

    @Override
    public Collection values() {
        return this.a.values();
    }

    public ObjectId w(Object object0) {
        return (ObjectId)this.get(object0);
    }

    public String x(Object object0) {
        return (String)this.get(object0);
    }

    public static e0 y(String s) {
        return e0.z(s, new U());
    }

    public static e0 z(String s, S s1) {
        R3.a.e("codec", s1);
        return (e0)s1.g(new w(s), T.a().a());
    }
}

