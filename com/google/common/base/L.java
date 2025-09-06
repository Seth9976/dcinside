package com.google.common.base;

import J1.c;
import J1.d;
import java.io.Serializable;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.Map;
import java.util.WeakHashMap;

@c
@d
@k
public final class l {
    @c
    static final class a extends i implements Serializable {
        private final Class c;
        private static final long d;

        a(Class class0) {
            this.c = (Class)H.E(class0);
        }

        // 去混淆评级： 低(20)
        @Override  // com.google.common.base.i
        public boolean equals(@o3.a Object object0) {
            return object0 instanceof a ? this.c.equals(((a)object0).c) : false;
        }

        @Override  // com.google.common.base.i
        protected Object h(Object object0) {
            return this.o(((Enum)object0));
        }

        @Override
        public int hashCode() {
            return this.c.hashCode();
        }

        @Override  // com.google.common.base.i
        protected Object i(Object object0) {
            return this.p(((String)object0));
        }

        protected String o(Enum enum0) {
            return enum0.name();
        }

        protected Enum p(String s) {
            return Enum.valueOf(this.c, s);
        }

        @Override
        public String toString() {
            return "Enums.stringConverter(" + this.c.getName() + ".class)";
        }
    }

    @c
    private static final Map a;

    static {
        l.a = new WeakHashMap();
    }

    @c
    static Map a(Class class0) {
        Map map0 = l.a;
        synchronized(map0) {
            Map map1 = (Map)map0.get(class0);
            if(map1 == null) {
                map1 = l.d(class0);
            }
            return map1;
        }
    }

    @c
    public static Field b(Enum enum0) {
        Class class0 = enum0.getDeclaringClass();
        try {
            return class0.getDeclaredField(enum0.name());
        }
        catch(NoSuchFieldException noSuchFieldException0) {
            throw new AssertionError(noSuchFieldException0);
        }
    }

    public static C c(Class class0, String s) {
        H.E(class0);
        H.E(s);
        return G.d(class0, s);
    }

    @c
    private static Map d(Class class0) {
        Map map0 = new HashMap();
        for(Object object0: EnumSet.allOf(class0)) {
            map0.put(((Enum)object0).name(), new WeakReference(((Enum)object0)));
        }
        l.a.put(class0, map0);
        return map0;
    }

    @c
    public static i e(Class class0) {
        return new a(class0);
    }
}

