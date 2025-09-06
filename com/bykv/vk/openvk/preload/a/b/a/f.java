package com.bykv.vk.openvk.preload.a.b.a;

import com.bykv.vk.openvk.preload.a.b.e;
import com.bykv.vk.openvk.preload.a.b.h;
import com.bykv.vk.openvk.preload.a.d.b;
import com.bykv.vk.openvk.preload.a.d.c;
import com.bykv.vk.openvk.preload.a.d;
import com.bykv.vk.openvk.preload.a.p;
import com.bykv.vk.openvk.preload.a.r;
import com.bykv.vk.openvk.preload.a.s;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.Map.Entry;
import java.util.Map;

public final class f implements s {
    final class a extends r {
        private final r a;
        private final r b;
        private final h c;

        public a(d d0, Type type0, r r0, Type type1, r r1, h h0) {
            this.a = new l(d0, r0, type0);
            this.b = new l(d0, r1, type1);
            this.c = h0;
        }

        @Override  // com.bykv.vk.openvk.preload.a.r
        public final Object a(com.bykv.vk.openvk.preload.a.d.a a0) throws IOException {
            b b0 = a0.f();
            if(b0 == b.i) {
                a0.j();
                return null;
            }
            Map map0 = (Map)this.c.a();
            if(b0 == b.a) {
                a0.a();
                while(a0.e()) {
                    a0.a();
                    Object object0 = this.a.a(a0);
                    if(map0.put(object0, this.b.a(a0)) != null) {
                        throw new p("duplicate key: " + object0);
                    }
                    a0.b();
                }
                a0.b();
                return map0;
            }
            a0.c();
            while(a0.e()) {
                e.a.a(a0);
                Object object1 = this.a.a(a0);
                if(map0.put(object1, this.b.a(a0)) != null) {
                    throw new p("duplicate key: " + object1);
                }
                if(false) {
                    break;
                }
            }
            a0.d();
            return map0;
        }

        @Override  // com.bykv.vk.openvk.preload.a.r
        public final void a(c c0, Object object0) throws IOException {
            if(((Map)object0) == null) {
                c0.h();
                return;
            }
            c0.f();
            for(Object object1: ((Map)object0).entrySet()) {
                c0.a(String.valueOf(((Map.Entry)object1).getKey()));
                Object object2 = ((Map.Entry)object1).getValue();
                this.b.a(c0, object2);
            }
            c0.g();
        }
    }

    private final com.bykv.vk.openvk.preload.a.b.b a;

    public f(com.bykv.vk.openvk.preload.a.b.b b0) {
        this.a = b0;
    }

    @Override  // com.bykv.vk.openvk.preload.a.s
    public final r a(d d0, com.bykv.vk.openvk.preload.a.c.a a0) {
        Type type0 = a0.b();
        if(!Map.class.isAssignableFrom(a0.a())) {
            return null;
        }
        Type[] arr_type = com.bykv.vk.openvk.preload.a.b.a.b(type0, com.bykv.vk.openvk.preload.a.b.a.b(type0));
        Type type1 = arr_type[0];
        r r0 = type1 == Boolean.TYPE || type1 == Boolean.class ? m.c : d0.a(com.bykv.vk.openvk.preload.a.c.a.a(type1));
        r r1 = d0.a(com.bykv.vk.openvk.preload.a.c.a.a(arr_type[1]));
        h h0 = this.a.a(a0);
        return new a(this, d0, arr_type[0], r0, arr_type[1], r1, h0);
    }
}

