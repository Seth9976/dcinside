package com.fasterxml.jackson.databind;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

public abstract class l {
    public static class a extends l implements Serializable {
        protected final Map a;
        private static final long b = 1L;

        public a() {
            this(new HashMap());
        }

        public a(Map map0) {
            this.a = map0;
        }

        @Override  // com.fasterxml.jackson.databind.l
        public Object a(Object object0, h h0, d d0, Object object1) throws o {
            if(!(object0 instanceof String)) {
                h0.E(com.fasterxml.jackson.databind.util.h.k(object0), String.format("Unrecognized inject value id type (%s), expecting String", com.fasterxml.jackson.databind.util.h.j(object0)));
            }
            Object object2 = this.a.get(((String)object0));
            if(object2 == null && !this.a.containsKey(((String)object0))) {
                throw new IllegalArgumentException("No injectable id with value \'" + ((String)object0) + "\' found (for property \'" + d0.getName() + "\')");
            }
            return object2;
        }

        public a b(Class class0, Object object0) {
            this.a.put(class0.getName(), object0);
            return this;
        }

        public a c(String s, Object object0) {
            this.a.put(s, object0);
            return this;
        }
    }

    public abstract Object a(Object arg1, h arg2, d arg3, Object arg4) throws o;
}

