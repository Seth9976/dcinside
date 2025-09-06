package com.google.gson;

import com.google.gson.internal.m;

public interface v {
    class a implements v {
        a() {
            super();
        }

        // 去混淆评级： 低(20)
        @Override  // com.google.gson.v
        public e a(Class class0) {
            return m.f(class0) ? e.c : e.b;
        }
    }

    class b implements v {
        b() {
            super();
        }

        // 去混淆评级： 低(20)
        @Override  // com.google.gson.v
        public e a(Class class0) {
            return m.f(class0) ? e.d : e.b;
        }
    }

    class c implements v {
        c() {
            super();
        }

        // 去混淆评级： 低(20)
        @Override  // com.google.gson.v
        public e a(Class class0) {
            return m.c(class0) ? e.d : e.b;
        }
    }

    class d implements v {
        d() {
            super();
        }

        // 去混淆评级： 低(20)
        @Override  // com.google.gson.v
        public e a(Class class0) {
            return m.e(class0) ? e.d : e.b;
        }
    }

    public static enum e {
        ALLOW,
        INDECISIVE,
        BLOCK_INACCESSIBLE,
        BLOCK_ALL;

    }

    public static final v a;
    public static final v b;
    public static final v c;
    public static final v d;

    static {
        v.a = new a();
        v.b = new b();
        v.c = new c();
        v.d = new d();
    }

    e a(Class arg1);
}

