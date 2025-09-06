package org.bson.util;

import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

abstract class e extends a {
    public static class org.bson.util.e.a {
        private org.bson.util.a.i.a a;
        private final Map b;

        org.bson.util.e.a() {
            this.a = org.bson.util.a.i.a.a;
            this.b = new HashMap();
        }

        public org.bson.util.e.a a(Map map0) {
            this.b.putAll(map0);
            return this;
        }

        public org.bson.util.e.a b() {
            this.a = org.bson.util.a.i.a.b;
            return this;
        }

        public e c() {
            return new b(this.b, this.a);
        }

        public e d() {
            return new c(this.b, this.a);
        }

        public org.bson.util.e.a e() {
            this.a = org.bson.util.a.i.a.a;
            return this;
        }
    }

    static class b extends e {
        private static final long e = 0x4877A61EB28C8C11L;

        b(Map map0, org.bson.util.a.i.a a$i$a0) {
            super(map0, a$i$a0);
        }

        @Override  // org.bson.util.e
        public Map d(Map map0) {
            return new HashMap(map0);
        }
    }

    static class c extends e {
        private static final long e = 0x87D1805E850FB804L;

        c(Map map0, org.bson.util.a.i.a a$i$a0) {
            super(map0, a$i$a0);
        }

        @Override  // org.bson.util.e
        public Map d(Map map0) {
            return new LinkedHashMap(map0);
        }
    }

    private static final long d = 0x6E209C6CD39D23FDL;

    protected e() {
        this(Collections.emptyMap(), org.bson.util.a.i.a.b);
    }

    protected e(Map map0) {
        this(map0, org.bson.util.a.i.a.b);
    }

    protected e(Map map0, org.bson.util.a.i.a a$i$a0) {
        super(map0, a$i$a0);
    }

    protected e(org.bson.util.a.i.a a$i$a0) {
        super(Collections.emptyMap(), a$i$a0);
    }

    @Override  // org.bson.util.a
    protected abstract Map d(Map arg1);

    public static org.bson.util.e.a h() {
        return new org.bson.util.e.a();
    }

    public static e i() {
        return e.h().c();
    }

    public static e j(Map map0) {
        return e.h().a(map0).c();
    }

    public static e l() {
        return e.h().d();
    }

    public static e m(Map map0) {
        return e.h().a(map0).d();
    }
}

