package com.fasterxml.jackson.databind.deser.impl;

import com.fasterxml.jackson.core.l;
import com.fasterxml.jackson.databind.deser.B;
import com.fasterxml.jackson.databind.deser.std.s;
import com.fasterxml.jackson.databind.g;
import com.fasterxml.jackson.databind.h;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public abstract class k {
    static class a extends com.fasterxml.jackson.databind.deser.B.a implements Serializable {
        private static final long c = 2L;
        public static final a d;

        static {
            a.d = new a();
        }

        public a() {
            super(ArrayList.class);
        }

        @Override  // com.fasterxml.jackson.databind.deser.B
        public Object A(h h0) throws IOException {
            return new ArrayList();
        }

        @Override  // com.fasterxml.jackson.databind.deser.B
        public boolean k() {
            return true;
        }

        @Override  // com.fasterxml.jackson.databind.deser.B
        public boolean m() {
            return true;
        }
    }

    static class b extends com.fasterxml.jackson.databind.deser.B.a implements Serializable {
        protected final Object c;
        private static final long d = 2L;

        public b(Object object0) {
            super(object0.getClass());
            this.c = object0;
        }

        @Override  // com.fasterxml.jackson.databind.deser.B
        public Object A(h h0) throws IOException {
            return this.c;
        }

        @Override  // com.fasterxml.jackson.databind.deser.B
        public boolean k() {
            return true;
        }

        @Override  // com.fasterxml.jackson.databind.deser.B
        public boolean m() {
            return true;
        }
    }

    static class c extends com.fasterxml.jackson.databind.deser.B.a implements Serializable {
        private static final long c = 2L;
        public static final c d;

        static {
            c.d = new c();
        }

        public c() {
            super(HashMap.class);
        }

        @Override  // com.fasterxml.jackson.databind.deser.B
        public Object A(h h0) throws IOException {
            return new HashMap();
        }

        @Override  // com.fasterxml.jackson.databind.deser.B
        public boolean k() {
            return true;
        }

        @Override  // com.fasterxml.jackson.databind.deser.B
        public boolean m() {
            return true;
        }
    }

    static class d extends com.fasterxml.jackson.databind.deser.B.a implements Serializable {
        private static final long c = 2L;
        public static final d d;

        static {
            d.d = new d();
        }

        public d() {
            super(LinkedHashMap.class);
        }

        @Override  // com.fasterxml.jackson.databind.deser.B
        public Object A(h h0) throws IOException {
            return new LinkedHashMap();
        }

        @Override  // com.fasterxml.jackson.databind.deser.B
        public boolean k() {
            return true;
        }

        @Override  // com.fasterxml.jackson.databind.deser.B
        public boolean m() {
            return true;
        }
    }

    public static B a(g g0, Class class0) {
        if(class0 == l.class) {
            return new s();
        }
        if(Collection.class.isAssignableFrom(class0)) {
            if(class0 == ArrayList.class) {
                return a.d;
            }
            Set set0 = Collections.EMPTY_SET;
            if(set0.getClass() == class0) {
                return new b(set0);
            }
            List list0 = Collections.EMPTY_LIST;
            if(list0.getClass() == class0) {
                return new b(list0);
            }
        }
        else if(Map.class.isAssignableFrom(class0)) {
            if(class0 == LinkedHashMap.class) {
                return d.d;
            }
            if(class0 == HashMap.class) {
                return c.d;
            }
            Map map0 = Collections.EMPTY_MAP;
            if(map0.getClass() == class0) {
                return new b(map0);
            }
        }
        return null;
    }
}

