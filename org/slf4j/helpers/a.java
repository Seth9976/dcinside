package org.slf4j.helpers;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import org.slf4j.spi.MDCAdapter;

public class a implements MDCAdapter {
    class org.slf4j.helpers.a.a extends InheritableThreadLocal {
        final a a;

        protected Map a(Map map0) {
            return map0 == null ? null : new HashMap(map0);
        }

        @Override
        protected Object childValue(Object object0) {
            return this.a(((Map)object0));
        }
    }

    private InheritableThreadLocal a;

    public a() {
        this.a = new org.slf4j.helpers.a.a(this);
    }

    @Override  // org.slf4j.spi.MDCAdapter
    public void a(String s, String s1) {
        if(s == null) {
            throw new IllegalArgumentException("key cannot be null");
        }
        Map map0 = (Map)this.a.get();
        if(map0 == null) {
            map0 = new HashMap();
            this.a.set(map0);
        }
        map0.put(s, s1);
    }

    @Override  // org.slf4j.spi.MDCAdapter
    public Map b() {
        Map map0 = (Map)this.a.get();
        return map0 != null ? new HashMap(map0) : null;
    }

    @Override  // org.slf4j.spi.MDCAdapter
    public void c(Map map0) {
        this.a.set(new HashMap(map0));
    }

    @Override  // org.slf4j.spi.MDCAdapter
    public void clear() {
        Map map0 = (Map)this.a.get();
        if(map0 != null) {
            map0.clear();
            this.a.remove();
        }
    }

    public Set d() {
        Map map0 = (Map)this.a.get();
        return map0 == null ? null : map0.keySet();
    }

    @Override  // org.slf4j.spi.MDCAdapter
    public String get(String s) {
        Map map0 = (Map)this.a.get();
        return map0 == null || s == null ? null : ((String)map0.get(s));
    }

    @Override  // org.slf4j.spi.MDCAdapter
    public void remove(String s) {
        Map map0 = (Map)this.a.get();
        if(map0 != null) {
            map0.remove(s);
        }
    }
}

