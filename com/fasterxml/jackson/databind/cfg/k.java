package com.fasterxml.jackson.databind.cfg;

import java.io.Serializable;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public abstract class k {
    public static class a extends k implements Serializable {
        protected final Map a;
        protected transient Map b;
        private static final long c = 1L;
        protected static final a d;
        protected static final Object e;

        static {
            a.d = new a(Collections.emptyMap());
            a.e = new Object();
        }

        protected a(Map map0) {
            this.a = map0;
            this.b = null;
        }

        protected a(Map map0, Map map1) {
            this.a = map0;
            this.b = map1;
        }

        @Override  // com.fasterxml.jackson.databind.cfg.k
        public Object a(Object object0) {
            Map map0 = this.b;
            if(map0 != null) {
                Object object1 = map0.get(object0);
                if(object1 != null) {
                    return object1 == a.e ? null : object1;
                }
            }
            return this.a.get(object0);
        }

        @Override  // com.fasterxml.jackson.databind.cfg.k
        public static k b() {
            return a.d;
        }

        @Override  // com.fasterxml.jackson.databind.cfg.k
        public k c(Object object0, Object object1) {
            if(object1 == null) {
                if(this.a.containsKey(object0)) {
                    object1 = a.e;
                    goto label_7;
                }
                if(this.b != null && this.b.containsKey(object0)) {
                    this.b.remove(object0);
                }
                return this;
            }
        label_7:
            Map map0 = this.b;
            if(map0 == null) {
                return this.h(object0, object1);
            }
            map0.put(object0, object1);
            return this;
        }

        @Override  // com.fasterxml.jackson.databind.cfg.k
        public k d(Object object0, Object object1) {
            Map map0 = this == a.d ? new HashMap(8) : this.g(this.a);
            map0.put(object0, object1);
            return new a(map0);
        }

        @Override  // com.fasterxml.jackson.databind.cfg.k
        public k e(Map map0) {
            return new a(map0);
        }

        @Override  // com.fasterxml.jackson.databind.cfg.k
        public k f(Object object0) {
            if(this.a.isEmpty()) {
                return this;
            }
            if(this.a.containsKey(object0)) {
                if(this.a.size() == 1) {
                    return a.d;
                }
                Map map0 = this.g(this.a);
                map0.remove(object0);
                return new a(map0);
            }
            return this;
        }

        private Map g(Map map0) {
            return new HashMap(map0);
        }

        protected k h(Object object0, Object object1) {
            HashMap hashMap0 = new HashMap();
            if(object1 == null) {
                object1 = a.e;
            }
            hashMap0.put(object0, object1);
            return new a(this.a, hashMap0);
        }
    }

    public abstract Object a(Object arg1);

    public static k b() {
        return a.b();
    }

    public abstract k c(Object arg1, Object arg2);

    public abstract k d(Object arg1, Object arg2);

    public abstract k e(Map arg1);

    public abstract k f(Object arg1);
}

