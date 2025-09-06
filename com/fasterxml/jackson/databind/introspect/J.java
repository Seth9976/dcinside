package com.fasterxml.jackson.databind.introspect;

import com.fasterxml.jackson.databind.b;
import com.fasterxml.jackson.databind.m;
import com.fasterxml.jackson.databind.type.p;
import com.fasterxml.jackson.databind.util.h;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class j extends x {
    static final class a {
        public final K a;
        public final Field b;
        public q c;

        public a(K k0, Field field0) {
            this.a = k0;
            this.b = field0;
            this.c = q.e();
        }

        public i a() {
            s s0 = this.c.b();
            return new i(this.a, this.b, s0);
        }
    }

    private final com.fasterxml.jackson.databind.type.q d;
    private final com.fasterxml.jackson.databind.introspect.w.a e;
    private final boolean f;

    j(b b0, com.fasterxml.jackson.databind.type.q q0, com.fasterxml.jackson.databind.introspect.w.a w$a0, boolean z) {
        super(b0);
        this.d = q0;
        if(b0 == null) {
            w$a0 = null;
        }
        this.e = w$a0;
        this.f = z;
    }

    private void i(Class class0, Class class1, Map map0) {
        for(Object object0: h.z(class0, class1, true)) {
            Field[] arr_field = ((Class)object0).getDeclaredFields();
            for(int v = 0; v < arr_field.length; ++v) {
                Field field0 = arr_field[v];
                if(this.k(field0)) {
                    a j$a0 = (a)map0.get(field0.getName());
                    if(j$a0 != null) {
                        j$a0.c = this.d(j$a0.c, field0.getDeclaredAnnotations());
                    }
                }
            }
        }
    }

    private Map j(K k0, m m0, Map map0) {
        m m1 = m0.Q();
        if(m1 == null) {
            return map0;
        }
        Class class0 = m0.g();
        p p0 = m1.D();
        Map map1 = this.j(new com.fasterxml.jackson.databind.introspect.K.a(this.d, p0), m1, map0);
        Field[] arr_field = class0.getDeclaredFields();
        for(int v = 0; v < arr_field.length; ++v) {
            Field field0 = arr_field[v];
            if(this.k(field0)) {
                if(map1 == null) {
                    map1 = new LinkedHashMap();
                }
                a j$a0 = new a(k0, field0);
                if(this.f) {
                    j$a0.c = this.d(j$a0.c, field0.getDeclaredAnnotations());
                }
                map1.put(field0.getName(), j$a0);
            }
        }
        if(map1 != null) {
            com.fasterxml.jackson.databind.introspect.w.a w$a0 = this.e;
            if(w$a0 != null) {
                Class class1 = w$a0.b(class0);
                if(class1 != null) {
                    this.i(class1, class0, map1);
                }
            }
        }
        return map1;
    }

    private boolean k(Field field0) {
        if(field0.isEnumConstant()) {
            return true;
        }
        return field0.isSynthetic() ? false : !Modifier.isStatic(field0.getModifiers());
    }

    List l(K k0, m m0) {
        Map map0 = this.j(k0, m0, null);
        if(map0 == null) {
            return Collections.emptyList();
        }
        List list0 = new ArrayList(map0.size());
        for(Object object0: map0.values()) {
            list0.add(((a)object0).a());
        }
        return list0;
    }

    public static List m(b b0, K k0, com.fasterxml.jackson.databind.introspect.w.a w$a0, com.fasterxml.jackson.databind.type.q q0, m m0, boolean z) {
        return new j(b0, q0, w$a0, z).l(k0, m0);
    }
}

