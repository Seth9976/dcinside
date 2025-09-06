package com.bykv.vk.openvk.preload.a.b.a;

import com.bykv.vk.openvk.preload.a.d.b;
import com.bykv.vk.openvk.preload.a.d.c;
import com.bykv.vk.openvk.preload.a.d;
import com.bykv.vk.openvk.preload.a.p;
import com.bykv.vk.openvk.preload.a.r;
import com.bykv.vk.openvk.preload.a.s;
import java.io.IOException;
import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public final class h implements s {
    public static final class a extends r {
        private final com.bykv.vk.openvk.preload.a.b.h a;
        private final Map b;

        a(com.bykv.vk.openvk.preload.a.b.h h0, Map map0) {
            this.a = h0;
            this.b = map0;
        }

        @Override  // com.bykv.vk.openvk.preload.a.r
        public final Object a(com.bykv.vk.openvk.preload.a.d.a a0) throws IOException {
            if(a0.f() == b.i) {
                a0.j();
                return null;
            }
            Object object0 = this.a.a();
            try {
                a0.c();
                while(true) {
                    if(!a0.e()) {
                        goto label_18;
                    }
                    String s = a0.g();
                    com.bykv.vk.openvk.preload.a.b.a.h.b h$b0 = (com.bykv.vk.openvk.preload.a.b.a.h.b)this.b.get(s);
                    if(h$b0 != null && h$b0.c) {
                        h$b0.a(a0, object0);
                    }
                    else {
                        a0.n();
                    }
                }
            }
            catch(IllegalStateException illegalStateException0) {
            }
            catch(IllegalAccessException illegalAccessException0) {
                throw new AssertionError(illegalAccessException0);
            }
            throw new p(illegalStateException0);
        label_18:
            a0.d();
            return object0;
        }

        @Override  // com.bykv.vk.openvk.preload.a.r
        public final void a(c c0, Object object0) throws IOException {
            if(object0 == null) {
                c0.h();
                return;
            }
            c0.f();
            try {
                for(Object object1: this.b.values()) {
                    com.bykv.vk.openvk.preload.a.b.a.h.b h$b0 = (com.bykv.vk.openvk.preload.a.b.a.h.b)object1;
                    if(h$b0.a(object0)) {
                        c0.a(h$b0.a);
                        h$b0.a(c0, object0);
                    }
                }
            }
            catch(IllegalAccessException illegalAccessException0) {
                throw new AssertionError(illegalAccessException0);
            }
            c0.g();
        }
    }

    static abstract class com.bykv.vk.openvk.preload.a.b.a.h.b {
        final String a;
        final boolean b;
        final boolean c;

        protected com.bykv.vk.openvk.preload.a.b.a.h.b(String s, boolean z, boolean z1) {
            this.a = s;
            this.b = z;
            this.c = z1;
        }

        abstract void a(com.bykv.vk.openvk.preload.a.d.a arg1, Object arg2) throws IOException, IllegalAccessException;

        abstract void a(c arg1, Object arg2) throws IOException, IllegalAccessException;

        abstract boolean a(Object arg1) throws IOException, IllegalAccessException;
    }

    private final com.bykv.vk.openvk.preload.a.b.b a;
    private final com.bykv.vk.openvk.preload.a.c b;
    private final com.bykv.vk.openvk.preload.a.b.c c;
    private final com.bykv.vk.openvk.preload.a.b.b.b d;

    public h(com.bykv.vk.openvk.preload.a.b.b b0, com.bykv.vk.openvk.preload.a.c c0, com.bykv.vk.openvk.preload.a.b.c c1) {
        this.d = com.bykv.vk.openvk.preload.a.b.b.b.a();
        this.a = b0;
        this.b = c0;
        this.c = c1;
    }

    private List a(Field field0) {
        com.bykv.vk.openvk.preload.a.a.b b0 = (com.bykv.vk.openvk.preload.a.a.b)field0.getAnnotation(com.bykv.vk.openvk.preload.a.a.b.class);
        if(b0 == null) {
            return Collections.singletonList(this.b.a(field0));
        }
        String s = b0.a();
        String[] arr_s = b0.b();
        if(arr_s.length == 0) {
            return Collections.singletonList(s);
        }
        List list0 = new ArrayList(arr_s.length + 1);
        list0.add(s);
        for(int v = 0; v < arr_s.length; ++v) {
            list0.add(arr_s[v]);
        }
        return list0;
    }

    private Map a(d d0, com.bykv.vk.openvk.preload.a.c.a a0, Class class0) {
        Class class2;
        com.bykv.vk.openvk.preload.a.c.a a2;
        Field[] arr_field1;
        int v3;
        int v2;
        Map map0 = new LinkedHashMap();
        if(class0.isInterface()) {
            return map0;
        }
        Type type0 = a0.b();
        com.bykv.vk.openvk.preload.a.c.a a1 = a0;
        for(Class class1 = class0; class1 != Object.class; class1 = a1.a()) {
            Field[] arr_field = class1.getDeclaredFields();
            int v = arr_field.length;
            int v1 = 0;
            while(v1 < v) {
                Field field0 = arr_field[v1];
                boolean z = this.a(field0, true);
                boolean z1 = this.a(field0, false);
                if(z || z1) {
                    this.d.a(field0);
                    Type type1 = com.bykv.vk.openvk.preload.a.b.a.a(a1.b(), class1, field0.getGenericType());
                    List list0 = this.a(field0);
                    int v4 = list0.size();
                    class2 = class1;
                    com.bykv.vk.openvk.preload.a.b.a.h.b h$b0 = null;
                    int v5 = 0;
                    while(v5 < v4) {
                        Object object0 = list0.get(v5);
                        boolean z2 = v5 == 0 ? z : false;
                        com.bykv.vk.openvk.preload.a.c.a a3 = com.bykv.vk.openvk.preload.a.c.a.a(type1);
                        Class class3 = a3.a();
                        boolean z3 = class3 instanceof Class && class3.isPrimitive();
                        com.bykv.vk.openvk.preload.a.a.a a4 = (com.bykv.vk.openvk.preload.a.a.a)field0.getAnnotation(com.bykv.vk.openvk.preload.a.a.a.class);
                        r r0 = a4 == null ? null : com.bykv.vk.openvk.preload.a.b.a.d.a(this.a, d0, a3, a4);
                        boolean z4 = r0 != null;
                        if(r0 == null) {
                            r0 = d0.a(a3);
                        }
                        com.bykv.vk.openvk.preload.a.b.a.h.b h$b1 = (com.bykv.vk.openvk.preload.a.b.a.h.b)map0.put(((String)object0), new com.bykv.vk.openvk.preload.a.b.a.h.b(z2, z1, field0) {
                            @Override  // com.bykv.vk.openvk.preload.a.b.a.h$b
                            final void a(com.bykv.vk.openvk.preload.a.d.a a0, Object object0) throws IOException, IllegalAccessException {
                                Object object1 = d0.a(a0);
                                if(object1 != null || !this.i) {
                                    z4.set(object0, object1);
                                }
                            }

                            @Override  // com.bykv.vk.openvk.preload.a.b.a.h$b
                            final void a(c c0, Object object0) throws IOException, IllegalAccessException {
                                Object object1 = z4.get(object0);
                                r r0 = r0 ? d0 : new l(a3, d0, z3.b());
                                r0.a(c0, object1);
                            }

                            @Override  // com.bykv.vk.openvk.preload.a.b.a.h$b
                            public final boolean a(Object object0) throws IOException, IllegalAccessException {
                                return this.b ? z4.get(object0) != object0 : false;
                            }
                        });
                        if(h$b0 == null) {
                            h$b0 = h$b1;
                        }
                        ++v5;
                        z = z2;
                    }
                    v2 = v1;
                    v3 = v;
                    arr_field1 = arr_field;
                    a2 = a1;
                    if(h$b0 != null) {
                        throw new IllegalArgumentException(type0 + " declares multiple JSON fields named " + h$b0.a);
                    }
                }
                else {
                    v2 = v1;
                    v3 = v;
                    arr_field1 = arr_field;
                    a2 = a1;
                    class2 = class1;
                }
                v1 = v2 + 1;
                class1 = class2;
                a1 = a2;
                v = v3;
                arr_field = arr_field1;
            }
            a1 = com.bykv.vk.openvk.preload.a.c.a.a(com.bykv.vk.openvk.preload.a.b.a.a(a1.b(), class1, class1.getGenericSuperclass()));
        }
        return map0;
    }

    // 去混淆评级： 低(20)
    private boolean a(Field field0, boolean z) {
        return !this.c.a(field0.getType(), z) && !this.c.a(field0, z);
    }

    @Override  // com.bykv.vk.openvk.preload.a.s
    public final r a(d d0, com.bykv.vk.openvk.preload.a.c.a a0) {
        Class class0 = a0.a();
        return !Object.class.isAssignableFrom(class0) ? null : new a(this.a.a(a0), this.a(d0, a0, class0));
    }
}

