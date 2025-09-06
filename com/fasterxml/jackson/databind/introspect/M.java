package com.fasterxml.jackson.databind.introspect;

import com.fasterxml.jackson.databind.b;
import com.fasterxml.jackson.databind.util.h;
import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map.Entry;
import java.util.Map;

public class m extends x {
    static final class a {
        public K a;
        public Method b;
        public q c;

        public a(K k0, Method method0, q q0) {
            this.a = k0;
            this.b = method0;
            this.c = q0;
        }

        public l a() {
            return this.b == null ? null : new l(this.a, this.b, this.c.b(), null);
        }
    }

    private final com.fasterxml.jackson.databind.introspect.w.a d;
    private final boolean e;

    m(b b0, com.fasterxml.jackson.databind.introspect.w.a w$a0, boolean z) {
        super(b0);
        if(b0 == null) {
            w$a0 = null;
        }
        this.d = w$a0;
        this.e = z;
    }

    private void i(K k0, Class class0, Map map0, Class class1) {
        if(class1 != null) {
            this.j(k0, class0, map0, class1);
        }
        if(class0 == null) {
            return;
        }
        Method[] arr_method = h.E(class0);
        for(int v = 0; v < arr_method.length; ++v) {
            Method method0 = arr_method[v];
            if(m.k(method0)) {
                C c0 = new C(method0);
                a m$a0 = (a)map0.get(c0);
                if(m$a0 == null) {
                    map0.put(c0, new a(k0, method0, (this.a == null ? q.e() : this.e(method0.getDeclaredAnnotations()))));
                }
                else {
                    if(this.e) {
                        m$a0.c = this.f(m$a0.c, method0.getDeclaredAnnotations());
                    }
                    Method method1 = m$a0.b;
                    if(method1 == null) {
                        m$a0.b = method0;
                    }
                    else if(Modifier.isAbstract(method1.getModifiers()) && !Modifier.isAbstract(method0.getModifiers())) {
                        m$a0.b = method0;
                        m$a0.a = k0;
                    }
                }
            }
        }
    }

    protected void j(K k0, Class class0, Map map0, Class class1) {
        if(this.a == null) {
            return;
        }
        for(Object object0: h.y(class1, class0, true)) {
            Method[] arr_method = ((Class)object0).getDeclaredMethods();
            for(int v = 0; v < arr_method.length; ++v) {
                Method method0 = arr_method[v];
                if(m.k(method0)) {
                    C c0 = new C(method0);
                    a m$a0 = (a)map0.get(c0);
                    Annotation[] arr_annotation = method0.getDeclaredAnnotations();
                    if(m$a0 == null) {
                        map0.put(c0, new a(k0, null, this.e(arr_annotation)));
                    }
                    else {
                        m$a0.c = this.f(m$a0.c, arr_annotation);
                    }
                }
            }
        }
    }

    // 去混淆评级： 低(30)
    private static boolean k(Method method0) {
        return !Modifier.isStatic(method0.getModifiers()) && !method0.isSynthetic() && !method0.isBridge() && g.a(method0) <= 2;
    }

    n l(com.fasterxml.jackson.databind.type.q q0, K k0, com.fasterxml.jackson.databind.m m0, List list0, Class class0) {
        LinkedHashMap linkedHashMap0 = new LinkedHashMap();
        this.i(k0, m0.g(), linkedHashMap0, class0);
        Iterator iterator0 = list0.iterator();
        while(true) {
            Class class1 = null;
            if(!iterator0.hasNext()) {
                break;
            }
            Object object0 = iterator0.next();
            com.fasterxml.jackson.databind.m m1 = (com.fasterxml.jackson.databind.m)object0;
            com.fasterxml.jackson.databind.introspect.w.a w$a0 = this.d;
            if(w$a0 != null) {
                class1 = w$a0.b(m1.g());
            }
            this.i(new com.fasterxml.jackson.databind.introspect.K.a(q0, m1.D()), m1.g(), linkedHashMap0, class1);
        }
        com.fasterxml.jackson.databind.introspect.w.a w$a1 = this.d;
        if(w$a1 != null) {
            Class class2 = Object.class;
            Class class3 = w$a1.b(class2);
            if(class3 != null) {
                this.j(k0, m0.g(), linkedHashMap0, class3);
                if(this.a != null && !linkedHashMap0.isEmpty()) {
                    for(Object object1: linkedHashMap0.entrySet()) {
                        Map.Entry map$Entry0 = (Map.Entry)object1;
                        C c0 = (C)map$Entry0.getKey();
                        if("hashCode".equals(c0.b()) && c0.a() == 0) {
                            try {
                                Method method0 = class2.getDeclaredMethod(c0.b(), null);
                                a m$a0 = (a)map$Entry0.getValue();
                                m$a0.c = this.f(m$a0.c, method0.getDeclaredAnnotations());
                                m$a0.b = method0;
                            }
                            catch(Exception unused_ex) {
                            }
                        }
                    }
                }
            }
        }
        if(linkedHashMap0.isEmpty()) {
            return new n();
        }
        LinkedHashMap linkedHashMap1 = new LinkedHashMap(linkedHashMap0.size());
        for(Object object2: linkedHashMap0.entrySet()) {
            Map.Entry map$Entry1 = (Map.Entry)object2;
            l l0 = ((a)map$Entry1.getValue()).a();
            if(l0 != null) {
                linkedHashMap1.put(map$Entry1.getKey(), l0);
            }
        }
        return new n(linkedHashMap1);
    }

    public static n m(b b0, K k0, com.fasterxml.jackson.databind.introspect.w.a w$a0, com.fasterxml.jackson.databind.type.q q0, com.fasterxml.jackson.databind.m m0, List list0, Class class0, boolean z) {
        return new m(b0, w$a0, z).l(q0, k0, m0, list0, class0);
    }
}

