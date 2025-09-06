package com.facebook.common.internal;

import k1.n.a;
import k1.n;

@n(a.a)
public class r {
    class b implements q {
        b() {
            super();
        }

        public Boolean a() {
            return true;
        }

        @Override  // com.facebook.common.internal.q
        public Object get() {
            return this.a();
        }
    }

    class c implements q {
        c() {
            super();
        }

        public Boolean a() {
            return false;
        }

        @Override  // com.facebook.common.internal.q
        public Object get() {
            return this.a();
        }
    }

    class d implements q {
        d() {
            super();
        }

        public String a() [...] // Inlined contents

        @Override  // com.facebook.common.internal.q
        public Object get() {
            return "";
        }
    }

    public static final q a;
    public static final q b;
    public static final q c;

    static {
        r.a = new b();
        r.b = new c();
        r.c = new d();
    }

    public static q a(Object object0) {
        class com.facebook.common.internal.r.a implements q {
            final Object a;

            com.facebook.common.internal.r.a(Object object0) {
            }

            @Override  // com.facebook.common.internal.q
            public Object get() {
                return this.a;
            }
        }

        return new com.facebook.common.internal.r.a(object0);
    }
}

